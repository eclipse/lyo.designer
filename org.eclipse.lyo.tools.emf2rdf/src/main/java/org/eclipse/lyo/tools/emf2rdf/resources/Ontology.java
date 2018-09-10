// Start of user code Copyright
/*******************************************************************************
 * Copyright (c) 2012 IBM Corporation and others.
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
 *     Russell Boykin       - initial API and implementation
 *     Alberto Giammaria    - initial API and implementation
 *     Chris Peters         - initial API and implementation
 *     Gianluca Bernardini  - initial API and implementation
 *       Sam Padgett          - initial API and implementation
 *     Michael Fiedler      - adapted for OSLC4J
 *     Jad El-khoury        - initial implementation of code generator (422448)
 *     Matthieu Helleboid   - Support for multiple Service Providers.
 *     Anass Radouani       - Support for multiple Service Providers.
 *
 * This file is generated by org.eclipse.lyo.oslc4j.codegenerator
 *******************************************************************************/
// End of user code

package org.eclipse.lyo.tools.emf2rdf.resources;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import javax.ws.rs.core.UriBuilder;

import org.eclipse.lyo.oslc4j.core.OSLC4JUtils;
import org.eclipse.lyo.oslc4j.core.exception.OslcCoreApplicationException;
import org.eclipse.lyo.oslc4j.core.annotation.OslcAllowedValue;
import org.eclipse.lyo.oslc4j.core.annotation.OslcDescription;
import org.eclipse.lyo.oslc4j.core.annotation.OslcMemberProperty;
import org.eclipse.lyo.oslc4j.core.annotation.OslcName;
import org.eclipse.lyo.oslc4j.core.annotation.OslcNamespace;
import org.eclipse.lyo.oslc4j.core.annotation.OslcOccurs;
import org.eclipse.lyo.oslc4j.core.annotation.OslcPropertyDefinition;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRange;
import org.eclipse.lyo.oslc4j.core.annotation.OslcReadOnly;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRepresentation;
import org.eclipse.lyo.oslc4j.core.annotation.OslcResourceShape;
import org.eclipse.lyo.oslc4j.core.annotation.OslcTitle;
import org.eclipse.lyo.oslc4j.core.annotation.OslcValueType;
import org.eclipse.lyo.oslc4j.core.model.AbstractResource;
import org.eclipse.lyo.oslc4j.core.model.Link;
import org.eclipse.lyo.oslc4j.core.model.Occurs;
import org.eclipse.lyo.oslc4j.core.model.OslcConstants;
import org.eclipse.lyo.oslc4j.core.model.Representation;
import org.eclipse.lyo.oslc4j.core.model.ValueType;
import org.eclipse.lyo.oslc4j.core.model.ResourceShape;
import org.eclipse.lyo.oslc4j.core.model.ResourceShapeFactory;

import org.eclipse.lyo.tools.emf2rdf.resources.OwlDomainConstants;


import org.eclipse.lyo.tools.emf2rdf.resources.DctermsDomainConstants;
import org.eclipse.lyo.tools.emf2rdf.resources.RdfsDomainConstants;
import org.eclipse.lyo.tools.emf2rdf.resources.VannDomainConstants;
import org.eclipse.lyo.tools.emf2rdf.resources.Term;

// Start of user code imports
// End of user code

// Start of user code preClassCode
// End of user code

// Start of user code classAnnotations
// End of user code
@OslcNamespace(OwlDomainConstants.ONTOLOGY_NAMESPACE)
@OslcName(OwlDomainConstants.ONTOLOGY_LOCALNAME)
@OslcResourceShape(title = "Ontology Resource Shape", describes = OwlDomainConstants.ONTOLOGY_TYPE)
public class Ontology
    extends AbstractResource
    implements IOntology
{
    // Start of user code attributeAnnotation:namespaceURI
    // End of user code
    private String namespaceURI;
    // Start of user code attributeAnnotation:label
    // End of user code
    private String label;
    // Start of user code attributeAnnotation:description
    // End of user code
    private String description;
    // Start of user code attributeAnnotation:source
    // End of user code
    private URI source;
    // Start of user code attributeAnnotation:title
    // End of user code
    private String title;
    // Start of user code attributeAnnotation:prefix
    // End of user code
    private String prefix;
    // Start of user code attributeAnnotation:terms
    // End of user code
    private HashSet<Link> terms = new HashSet<Link>();
    
    // Start of user code classAttributes
    // End of user code
    // Start of user code classMethods
    // End of user code
    public Ontology()
           throws URISyntaxException
    {
        super();
    
        // Start of user code constructor1
        // End of user code
    }
    
    public Ontology(final URI about)
           throws URISyntaxException
    {
        super(about);
    
        // Start of user code constructor2
        // End of user code
    }
    
    
    public static ResourceShape createResourceShape() throws OslcCoreApplicationException, URISyntaxException {
        return ResourceShapeFactory.createResourceShape(OSLC4JUtils.getServletURI(),
        OslcConstants.PATH_RESOURCE_SHAPES,
        OwlDomainConstants.ONTOLOGY_PATH,
        Ontology.class);
    }
    
    
    public String toString()
    {
        return toString(false);
    }
    
    public String toString(boolean asLocalResource)
    {
        String result = "";
        // Start of user code toString_init
        // End of user code
    
        if (asLocalResource) {
            result = result + "{a Local Ontology Resource} - update Ontology.toString() to present resource as desired.";
            // Start of user code toString_bodyForLocalResource
            // End of user code
        }
        else {
            result = getAbout().toString();
        }
    
        // Start of user code toString_finalize
        // End of user code
    
        return result;
    }
    
    public String toHtml()
    {
        return toHtml(false);
    }
    
    public String toHtml(boolean asLocalResource)
    {
        String result = "";
        // Start of user code toHtml_init
        // End of user code
    
        if (asLocalResource) {
            result = toString(true);
            // Start of user code toHtml_bodyForLocalResource
            // End of user code
        }
        else {
            result = "<a href=\"" + getAbout() + "\" class=\"oslc-resource-link\">" + toString() + "</a>";
        }
    
        // Start of user code toHtml_finalize
        // End of user code
    
        return result;
    }
    
    public void addTerms(final Link terms)
    {
        this.terms.add(terms);
    }
    
    
    // Start of user code getterAnnotation:namespaceURI
    // End of user code
    @OslcName("namespaceURI")
    @OslcPropertyDefinition(RdfsDomainConstants.RDFS_NAMSPACE + "namespaceURI")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.String)
    @OslcReadOnly(false)
    public String getNamespaceURI()
    {
        // Start of user code getterInit:namespaceURI
        // End of user code
        return namespaceURI;
    }
    
    // Start of user code getterAnnotation:label
    // End of user code
    @OslcName("label")
    @OslcPropertyDefinition(RdfsDomainConstants.RDFS_NAMSPACE + "label")
    @OslcDescription("May be used to provide a human-readable version of a resource's name.")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.XMLLiteral)
    @OslcReadOnly(false)
    public String getLabel()
    {
        // Start of user code getterInit:label
        // End of user code
        return label;
    }
    
    // Start of user code getterAnnotation:description
    // End of user code
    @OslcName("description")
    @OslcPropertyDefinition(DctermsDomainConstants.DUBLIN_CORE_NAMSPACE + "description")
    @OslcDescription("Descriptive text about resource represented as rich text in XHTML content. SHOULD include only content that is valid and suitable inside an XHTML <div> element.")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.XMLLiteral)
    @OslcReadOnly(false)
    public String getDescription()
    {
        // Start of user code getterInit:description
        // End of user code
        return description;
    }
    
    // Start of user code getterAnnotation:source
    // End of user code
    @OslcName("source")
    @OslcPropertyDefinition(DctermsDomainConstants.DUBLIN_CORE_NAMSPACE + "source")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcReadOnly(false)
    public URI getSource()
    {
        // Start of user code getterInit:source
        // End of user code
        return source;
    }
    
    // Start of user code getterAnnotation:title
    // End of user code
    @OslcName("title")
    @OslcPropertyDefinition(DctermsDomainConstants.DUBLIN_CORE_NAMSPACE + "title")
    @OslcDescription("Title of the resource represented as rich text in XHTML content. SHOULD include only content that is valid inside an XHTML <span> element.")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.XMLLiteral)
    @OslcReadOnly(false)
    public String getTitle()
    {
        // Start of user code getterInit:title
        // End of user code
        return title;
    }
    
    // Start of user code getterAnnotation:prefix
    // End of user code
    @OslcName("prefix")
    @OslcPropertyDefinition(VannDomainConstants.VANN_NAMSPACE + "prefix")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.String)
    @OslcReadOnly(false)
    public String getPrefix()
    {
        // Start of user code getterInit:prefix
        // End of user code
        return prefix;
    }
    
    // Start of user code getterAnnotation:terms
    // End of user code
    @OslcName("terms")
    @OslcPropertyDefinition(RdfsDomainConstants.RDFS_NAMSPACE + "terms")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({RdfsDomainConstants.TERM_TYPE})
    @OslcReadOnly(false)
    public HashSet<Link> getTerms()
    {
        // Start of user code getterInit:terms
        // End of user code
        return terms;
    }
    
    
    // Start of user code setterAnnotation:namespaceURI
    // End of user code
    public void setNamespaceURI(final String namespaceURI )
    {
        // Start of user code setterInit:namespaceURI
        // End of user code
        this.namespaceURI = namespaceURI;
    
        // Start of user code setterFinalize:namespaceURI
        // End of user code
    }
    
    // Start of user code setterAnnotation:label
    // End of user code
    public void setLabel(final String label )
    {
        // Start of user code setterInit:label
        // End of user code
        this.label = label;
    
        // Start of user code setterFinalize:label
        // End of user code
    }
    
    // Start of user code setterAnnotation:description
    // End of user code
    public void setDescription(final String description )
    {
        // Start of user code setterInit:description
        // End of user code
        this.description = description;
    
        // Start of user code setterFinalize:description
        // End of user code
    }
    
    // Start of user code setterAnnotation:source
    // End of user code
    public void setSource(final URI source )
    {
        // Start of user code setterInit:source
        // End of user code
        this.source = source;
    
        // Start of user code setterFinalize:source
        // End of user code
    }
    
    // Start of user code setterAnnotation:title
    // End of user code
    public void setTitle(final String title )
    {
        // Start of user code setterInit:title
        // End of user code
        this.title = title;
    
        // Start of user code setterFinalize:title
        // End of user code
    }
    
    // Start of user code setterAnnotation:prefix
    // End of user code
    public void setPrefix(final String prefix )
    {
        // Start of user code setterInit:prefix
        // End of user code
        this.prefix = prefix;
    
        // Start of user code setterFinalize:prefix
        // End of user code
    }
    
    // Start of user code setterAnnotation:terms
    // End of user code
    public void setTerms(final HashSet<Link> terms )
    {
        // Start of user code setterInit:terms
        // End of user code
        this.terms.clear();
        if (terms != null)
        {
            this.terms.addAll(terms);
        }
    
        // Start of user code setterFinalize:terms
        // End of user code
    }
    
    
    static public String namespaceURIToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:namespaceURIToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"namespaceURI\">namespaceURI: </LABEL>";
    
        // Start of user code "Mid:namespaceURIToHtmlForCreation(...)"
        // End of user code
    
        s= s + "<input name=\"namespaceURI\" type=\"text\" style=\"width: 400px\" id=\"namespaceURI\" >";
        // Start of user code "Finalize:namespaceURIToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    static public String labelToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:labelToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"label\">label: </LABEL>";
    
        // Start of user code "Mid:labelToHtmlForCreation(...)"
        // End of user code
    
        s= s + "<input name=\"label\" type=\"text\" style=\"width: 400px\" id=\"label\" >";
        // Start of user code "Finalize:labelToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    static public String descriptionToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:descriptionToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"description\">description: </LABEL>";
    
        // Start of user code "Mid:descriptionToHtmlForCreation(...)"
        // End of user code
    
        s= s + "<input name=\"description\" type=\"text\" style=\"width: 400px\" id=\"description\" >";
        // Start of user code "Finalize:descriptionToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    static public String sourceToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:sourceToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"source\">source: </LABEL>";
    
        // Start of user code "Mid:sourceToHtmlForCreation(...)"
        // End of user code
    
        s= s + "<input name=\"source\" type=\"text\" style=\"width: 400px\" id=\"source\" >";
        // Start of user code "Finalize:sourceToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    static public String titleToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:titleToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"title\">title: </LABEL>";
    
        // Start of user code "Mid:titleToHtmlForCreation(...)"
        // End of user code
    
        s= s + "<input name=\"title\" type=\"text\" style=\"width: 400px\" id=\"title\" >";
        // Start of user code "Finalize:titleToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    static public String prefixToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:prefixToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"prefix\">prefix: </LABEL>";
    
        // Start of user code "Mid:prefixToHtmlForCreation(...)"
        // End of user code
    
        s= s + "<input name=\"prefix\" type=\"text\" style=\"width: 400px\" id=\"prefix\" >";
        // Start of user code "Finalize:prefixToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    static public String termsToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:termsToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"terms\">terms: </LABEL>";
    
        // Start of user code "Mid:termsToHtmlForCreation(...)"
        // End of user code
    
        // Start of user code "Finalize:termsToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    
    public String namespaceURIToHtml()
    {
        String s = "";
    
        // Start of user code namespaceURItoHtml_mid
        // End of user code
    
        try {
            if (namespaceURI == null) {
                s = s + "<em>null</em>";
            }
            else {
                s = s + namespaceURI.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code namespaceURItoHtml_finalize
        // End of user code
    
        return s;
    }
    
    public String labelToHtml()
    {
        String s = "";
    
        // Start of user code labeltoHtml_mid
        // End of user code
    
        try {
            if (label == null) {
                s = s + "<em>null</em>";
            }
            else {
                s = s + label.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code labeltoHtml_finalize
        // End of user code
    
        return s;
    }
    
    public String descriptionToHtml()
    {
        String s = "";
    
        // Start of user code descriptiontoHtml_mid
        // End of user code
    
        try {
            if (description == null) {
                s = s + "<em>null</em>";
            }
            else {
                s = s + description.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code descriptiontoHtml_finalize
        // End of user code
    
        return s;
    }
    
    public String sourceToHtml()
    {
        String s = "";
    
        // Start of user code sourcetoHtml_mid
        // End of user code
    
        try {
            if (source == null) {
                s = s + "<em>null</em>";
            }
            else {
                s = s + source.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code sourcetoHtml_finalize
        // End of user code
    
        return s;
    }
    
    public String titleToHtml()
    {
        String s = "";
    
        // Start of user code titletoHtml_mid
        // End of user code
    
        try {
            if (title == null) {
                s = s + "<em>null</em>";
            }
            else {
                s = s + title.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code titletoHtml_finalize
        // End of user code
    
        return s;
    }
    
    public String prefixToHtml()
    {
        String s = "";
    
        // Start of user code prefixtoHtml_mid
        // End of user code
    
        try {
            if (prefix == null) {
                s = s + "<em>null</em>";
            }
            else {
                s = s + prefix.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code prefixtoHtml_finalize
        // End of user code
    
        return s;
    }
    
    public String termsToHtml()
    {
        String s = "";
    
        // Start of user code termstoHtml_mid
        // End of user code
    
        try {
            s = s + "<ul>";
            for(Link next : terms) {
                s = s + "<li>";
                s = s + (new Term (next.getValue())).toHtml(false);
                s = s + "</li>";
            }
            s = s + "</ul>";
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code termstoHtml_finalize
        // End of user code
    
        return s;
    }
    
    
}
