/*******************************************************************************
 * Copyright (c) 2017 Yash Khatri.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v. 1.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *
 *     Yash Khatri      - Initial implementation of loading imported models.
 *
 *******************************************************************************/
package org.eclipse.lyo.tools.toolchain.design;

import java.util.Collection;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;

import adaptorinterface.AdaptorinterfacePackage;
import adaptorinterface.DomainSpecification;
import adaptorinterface.Specification;
import toolchain.Toolchain;
import toolchain.ToolchainPackage;
import vocabulary.Vocabularies;
import vocabulary.Vocabulary;
import vocabulary.VocabularyPackage;

public class EmfResourcesLoaderService {
    /**
     * <p>
     * This method is used for getting the list of all the
     * <{@link DomainSpecification} that exits in all the xmi files with in the
     * project (session). This include the imported xmi files as well.
     * </p>
     * 
     * @param self
     *            The EObject on which the session has to be extracted.
     * @return The collection of <{@link DomainSpecification} from all xmi files
     *         in the project (session).
     */
    public Collection<DomainSpecification> getLoadedDomainSpecifications(EObject self) {
        Collection<DomainSpecification> eList = new BasicEList<DomainSpecification>();

        Session session = SessionManager.INSTANCE.getSession(self);
        return getSessionDomainSpecifications(eList, session);
    }

    /**
     * <p>
     * This method is used for getting the list of all the <{@link Vocabulary}
     * that exits in all the xmi files with in the project (session). This
     * include the imported xmi files as well.
     * </p>
     * 
     * @param self
     *            The EObject on which the session has to be extracted.
     * @return The collection of <{@link DomainSpecification} from all xmi files
     *         in the project (session).
     */
    public Collection<Vocabulary> getLoadedVocabularies(EObject self) {
        Collection<Vocabulary> eList = new BasicEList<Vocabulary>();

        Session session = SessionManager.INSTANCE.getSession(self);
        return getSessionVocabularies(eList, session);
    }

    private Collection<DomainSpecification> getSessionDomainSpecifications(Collection<DomainSpecification> eList,
            Session session) {
        Collection<Resource> semanticResources = session.getSemanticResources();

        for (Resource semanticResource : semanticResources) {
            for (EObject topEObject : semanticResource.getContents()) {
                Specification specification = getSpecification(topEObject);
                if (specification != null) {
                    eList.addAll(specification.getDomainSpecifications());
                }
            }
        }
        return eList;
    }

    private Specification getSpecification(EObject topEObject) {
        // According to the EMF Metamodel, the top EObject of Domain
        // Specification can be Toolchain EClass or Specification EClass.
        Specification specification = null;
        if (topEObject.eClass().equals(ToolchainPackage.eINSTANCE.getToolchain())) {
            Toolchain toolchain = (Toolchain) topEObject;
            specification = toolchain.getSpecification();
        }
        if (topEObject.eClass().equals(AdaptorinterfacePackage.eINSTANCE.getSpecification())) {
            specification = (Specification) topEObject;
        }
        return specification;
    }

    private Collection<Vocabulary> getSessionVocabularies(Collection<Vocabulary> eList, Session session) {
        Collection<Resource> semanticResources = session.getSemanticResources();

        for (Resource semanticResource : semanticResources) {
            for (EObject topEObject : semanticResource.getContents()) {
                Vocabularies vocabularies = getVocabularies(topEObject);
                if (vocabularies != null) {
                    eList.addAll(vocabularies.getVocabularies());
                }
            }
        }
        return eList;
    }

    private Vocabularies getVocabularies(EObject topEObject) {
        // According to the EMF Metamodel, the top EObject of Vocabulary can be
        // Toolchain EClass or Vocabularies EClass.
        Vocabularies vocabularies = null;
        if (topEObject.eClass().equals(ToolchainPackage.eINSTANCE.getToolchain())) {
            Toolchain toolchain = (Toolchain) topEObject;
            vocabularies = toolchain.getVocabularies();
        } else if (topEObject.eClass().equals(VocabularyPackage.eINSTANCE.getVocabularies())) {
            vocabularies = (Vocabularies) topEObject;
        }
        return vocabularies;
    }
}
