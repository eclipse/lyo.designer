package adaptorinterface;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see adaptorinterface.AdaptorinterfaceFactory
 * @model kind="package"
 * @generated
 */
public interface AdaptorinterfacePackage extends EPackage {
	/**
     * The package name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNAME = "adaptorinterface";

	/**
     * The package namespace URI.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_URI = "http://org.eclipse.lyo/oslc4j/adaptorInterface";

	/**
     * The package namespace name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_PREFIX = "oslc4j_ai";

	/**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	AdaptorinterfacePackage eINSTANCE = adaptorinterface.impl.AdaptorinterfacePackageImpl.init();

	/**
     * The meta object id for the '{@link adaptorinterface.impl.AdaptorInterfaceImpl <em>Adaptor Interface</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see adaptorinterface.impl.AdaptorInterfaceImpl
     * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getAdaptorInterface()
     * @generated
     */
	int ADAPTOR_INTERFACE = 0;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ADAPTOR_INTERFACE__NAME = 0;

	/**
     * The feature id for the '<em><b>Service Provider Catalog</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ADAPTOR_INTERFACE__SERVICE_PROVIDER_CATALOG = 1;

	/**
     * The feature id for the '<em><b>Web Services</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ADAPTOR_INTERFACE__WEB_SERVICES = 2;

	/**
     * The feature id for the '<em><b>Trs Service</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ADAPTOR_INTERFACE__TRS_SERVICE = 3;

	/**
     * The feature id for the '<em><b>Specification</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ADAPTOR_INTERFACE__SPECIFICATION = 4;

	/**
     * The feature id for the '<em><b>Required Adaptors</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ADAPTOR_INTERFACE__REQUIRED_ADAPTORS = 5;

	/**
     * The feature id for the '<em><b>Configuration</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ADAPTOR_INTERFACE__CONFIGURATION = 6;

	/**
     * The feature id for the '<em><b>Java Class Base Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ADAPTOR_INTERFACE__JAVA_CLASS_BASE_NAMESPACE = 7;

	/**
     * The feature id for the '<em><b>Java Files Base Path</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ADAPTOR_INTERFACE__JAVA_FILES_BASE_PATH = 8;

	/**
     * The feature id for the '<em><b>Jsp Files Base Path</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ADAPTOR_INTERFACE__JSP_FILES_BASE_PATH = 9;

	/**
     * The feature id for the '<em><b>Javascript Files Base Path</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ADAPTOR_INTERFACE__JAVASCRIPT_FILES_BASE_PATH = 10;

	/**
     * The feature id for the '<em><b>Swagger Documentation</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ADAPTOR_INTERFACE__SWAGGER_DOCUMENTATION = 11;

	/**
     * The feature id for the '<em><b>Backend Code Template class Imports</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_CLASS_IMPORTS = 12;

	/**
     * The feature id for the '<em><b>Backend Code Template class Methods</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_CLASS_METHODS = 13;

	/**
     * The feature id for the '<em><b>Backend Code Template servlet Listener Initialize</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_SERVLET_LISTENER_INITIALIZE = 14;

	/**
     * The feature id for the '<em><b>Backend Code Template servlet Listener Destroy</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_SERVLET_LISTENER_DESTROY = 15;

	/**
     * The feature id for the '<em><b>Backend Code Template get Service Providers</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_GET_SERVICE_PROVIDERS = 16;

	/**
     * The feature id for the '<em><b>Backend Code Template get Resource</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_GET_RESOURCE = 17;

	/**
     * The feature id for the '<em><b>Backend Code Template get Resources</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_GET_RESOURCES = 18;

	/**
     * The feature id for the '<em><b>Backend Code Template search Resources</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_SEARCH_RESOURCES = 19;

	/**
     * The feature id for the '<em><b>Backend Code Template create Resource</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_CREATE_RESOURCE = 20;

	/**
     * The feature id for the '<em><b>Stores</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADAPTOR_INTERFACE__STORES = 21;

    /**
     * The feature id for the '<em><b>Sources</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADAPTOR_INTERFACE__SOURCES = 22;

    /**
     * The number of structural features of the '<em>Adaptor Interface</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ADAPTOR_INTERFACE_FEATURE_COUNT = 23;

	/**
     * The number of operations of the '<em>Adaptor Interface</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ADAPTOR_INTERFACE_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link adaptorinterface.impl.SpecificationImpl <em>Specification</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see adaptorinterface.impl.SpecificationImpl
     * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getSpecification()
     * @generated
     */
	int SPECIFICATION = 1;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIFICATION__NAME = 0;

    /**
     * The feature id for the '<em><b>Domain Specifications</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPECIFICATION__DOMAIN_SPECIFICATIONS = 1;

	/**
     * The feature id for the '<em><b>Domain Prefixes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPECIFICATION__DOMAIN_PREFIXES = 2;

	/**
     * The feature id for the '<em><b>Generation Setting</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPECIFICATION__GENERATION_SETTING = 3;

	/**
     * The feature id for the '<em><b>Configuration</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPECIFICATION__CONFIGURATION = 4;

	/**
     * The number of structural features of the '<em>Specification</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPECIFICATION_FEATURE_COUNT = 5;

	/**
     * The number of operations of the '<em>Specification</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPECIFICATION_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link adaptorinterface.impl.DomainSpecificationImpl <em>Domain Specification</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see adaptorinterface.impl.DomainSpecificationImpl
     * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getDomainSpecification()
     * @generated
     */
	int DOMAIN_SPECIFICATION = 2;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOMAIN_SPECIFICATION__NAME = 0;

	/**
     * The feature id for the '<em><b>Namespace URI</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOMAIN_SPECIFICATION__NAMESPACE_URI = 1;

	/**
     * The feature id for the '<em><b>Namespace Prefix</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOMAIN_SPECIFICATION__NAMESPACE_PREFIX = 2;

	/**
     * The feature id for the '<em><b>Resources</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOMAIN_SPECIFICATION__RESOURCES = 3;

	/**
     * The feature id for the '<em><b>Resource Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOMAIN_SPECIFICATION__RESOURCE_PROPERTIES = 4;

	/**
     * The feature id for the '<em><b>Generation Setting</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOMAIN_SPECIFICATION__GENERATION_SETTING = 5;

	/**
     * The feature id for the '<em><b>Configuration</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOMAIN_SPECIFICATION__CONFIGURATION = 6;

	/**
     * The feature id for the '<em><b>Shacl Shapes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOMAIN_SPECIFICATION__SHACL_SHAPES = 7;

	/**
     * The feature id for the '<em><b>Shacl Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOMAIN_SPECIFICATION__SHACL_PROPERTIES = 8;

	/**
     * The feature id for the '<em><b>Default Vocabulary</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN_SPECIFICATION__DEFAULT_VOCABULARY = 9;

    /**
     * The number of structural features of the '<em>Domain Specification</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOMAIN_SPECIFICATION_FEATURE_COUNT = 10;

	/**
     * The number of operations of the '<em>Domain Specification</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DOMAIN_SPECIFICATION_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link adaptorinterface.impl.NamespacePrefixImpl <em>Namespace Prefix</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see adaptorinterface.impl.NamespacePrefixImpl
     * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getNamespacePrefix()
     * @generated
     */
	int NAMESPACE_PREFIX = 3;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NAMESPACE_PREFIX__NAME = 0;

	/**
     * The number of structural features of the '<em>Namespace Prefix</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NAMESPACE_PREFIX_FEATURE_COUNT = 1;

	/**
     * The number of operations of the '<em>Namespace Prefix</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NAMESPACE_PREFIX_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link adaptorinterface.impl.ServiceProviderCatalogImpl <em>Service Provider Catalog</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see adaptorinterface.impl.ServiceProviderCatalogImpl
     * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getServiceProviderCatalog()
     * @generated
     */
	int SERVICE_PROVIDER_CATALOG = 4;

	/**
     * The feature id for the '<em><b>Title</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SERVICE_PROVIDER_CATALOG__TITLE = 0;

	/**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SERVICE_PROVIDER_CATALOG__DESCRIPTION = 1;

	/**
     * The feature id for the '<em><b>Publisher</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SERVICE_PROVIDER_CATALOG__PUBLISHER = 2;

	/**
     * The feature id for the '<em><b>Service Providers</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SERVICE_PROVIDER_CATALOG__SERVICE_PROVIDERS = 3;

	/**
     * The number of structural features of the '<em>Service Provider Catalog</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SERVICE_PROVIDER_CATALOG_FEATURE_COUNT = 4;

	/**
     * The number of operations of the '<em>Service Provider Catalog</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SERVICE_PROVIDER_CATALOG_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link adaptorinterface.impl.ServiceProviderImpl <em>Service Provider</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see adaptorinterface.impl.ServiceProviderImpl
     * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getServiceProvider()
     * @generated
     */
	int SERVICE_PROVIDER = 5;

	/**
     * The feature id for the '<em><b>Title</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SERVICE_PROVIDER__TITLE = 0;

	/**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SERVICE_PROVIDER__DESCRIPTION = 1;

	/**
     * The feature id for the '<em><b>Publisher</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SERVICE_PROVIDER__PUBLISHER = 2;

	/**
     * The feature id for the '<em><b>Services</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SERVICE_PROVIDER__SERVICES = 3;

	/**
     * The feature id for the '<em><b>Service Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SERVICE_PROVIDER__SERVICE_NAMESPACE = 4;

	/**
     * The feature id for the '<em><b>Instance ID</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SERVICE_PROVIDER__INSTANCE_ID = 5;

	/**
     * The feature id for the '<em><b>Source Binding</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PROVIDER__SOURCE_BINDING = 6;

    /**
     * The number of structural features of the '<em>Service Provider</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SERVICE_PROVIDER_FEATURE_COUNT = 7;

	/**
     * The number of operations of the '<em>Service Provider</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SERVICE_PROVIDER_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link adaptorinterface.impl.ServiceImpl <em>Service</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see adaptorinterface.impl.ServiceImpl
     * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getService()
     * @generated
     */
	int SERVICE = 6;

	/**
     * The feature id for the '<em><b>Domain Specification</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SERVICE__DOMAIN_SPECIFICATION = 0;

	/**
     * The feature id for the '<em><b>Service Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SERVICE__SERVICE_NAMESPACE = 1;

	/**
     * The feature id for the '<em><b>Creation Factories</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SERVICE__CREATION_FACTORIES = 2;

	/**
     * The feature id for the '<em><b>Query Capabilities</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SERVICE__QUERY_CAPABILITIES = 3;

	/**
     * The feature id for the '<em><b>Selection Dialogs</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SERVICE__SELECTION_DIALOGS = 4;

	/**
     * The feature id for the '<em><b>Creation Dialogs</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SERVICE__CREATION_DIALOGS = 5;

	/**
     * The feature id for the '<em><b>Basic Capabilities</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SERVICE__BASIC_CAPABILITIES = 6;

	/**
     * The feature id for the '<em><b>Usages</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SERVICE__USAGES = 7;

	/**
     * The feature id for the '<em><b>Persistence</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE__PERSISTENCE = 8;

    /**
     * The feature id for the '<em><b>Source Binding</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE__SOURCE_BINDING = 9;

    /**
     * The number of structural features of the '<em>Service</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SERVICE_FEATURE_COUNT = 10;

	/**
     * The number of operations of the '<em>Service</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SERVICE_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link adaptorinterface.impl.WebServiceImpl <em>Web Service</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see adaptorinterface.impl.WebServiceImpl
     * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getWebService()
     * @generated
     */
	int WEB_SERVICE = 7;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WEB_SERVICE__NAME = 0;

	/**
     * The feature id for the '<em><b>Service Url Pattern</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WEB_SERVICE__SERVICE_URL_PATTERN = 1;

	/**
     * The feature id for the '<em><b>Resource Url Pattern</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WEB_SERVICE__RESOURCE_URL_PATTERN = 2;

	/**
     * The feature id for the '<em><b>Resource Types</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WEB_SERVICE__RESOURCE_TYPES = 3;

	/**
     * The feature id for the '<em><b>Read</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WEB_SERVICE__READ = 4;

	/**
     * The feature id for the '<em><b>Delete</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WEB_SERVICE__DELETE = 5;

	/**
     * The feature id for the '<em><b>Update</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WEB_SERVICE__UPDATE = 6;

	/**
     * The feature id for the '<em><b>Persistence</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEB_SERVICE__PERSISTENCE = 7;

    /**
     * The feature id for the '<em><b>Source Binding</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEB_SERVICE__SOURCE_BINDING = 8;

    /**
     * The number of structural features of the '<em>Web Service</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WEB_SERVICE_FEATURE_COUNT = 9;

	/**
     * The number of operations of the '<em>Web Service</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WEB_SERVICE_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link adaptorinterface.impl.TrsServiceImpl <em>Trs Service</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see adaptorinterface.impl.TrsServiceImpl
     * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getTrsService()
     * @generated
     */
	int TRS_SERVICE = 8;

	/**
     * The feature id for the '<em><b>Base Page Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRS_SERVICE__BASE_PAGE_LIMIT = 0;

	/**
     * The feature id for the '<em><b>Change Log Page Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRS_SERVICE__CHANGE_LOG_PAGE_LIMIT = 1;

	/**
     * The number of structural features of the '<em>Trs Service</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRS_SERVICE_FEATURE_COUNT = 2;

	/**
     * The number of operations of the '<em>Trs Service</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRS_SERVICE_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link adaptorinterface.impl.InmemPagedTrsServiceImpl <em>Inmem Paged Trs Service</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see adaptorinterface.impl.InmemPagedTrsServiceImpl
     * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getInmemPagedTrsService()
     * @generated
     */
	int INMEM_PAGED_TRS_SERVICE = 9;

	/**
     * The feature id for the '<em><b>Base Page Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INMEM_PAGED_TRS_SERVICE__BASE_PAGE_LIMIT = TRS_SERVICE__BASE_PAGE_LIMIT;

	/**
     * The feature id for the '<em><b>Change Log Page Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INMEM_PAGED_TRS_SERVICE__CHANGE_LOG_PAGE_LIMIT = TRS_SERVICE__CHANGE_LOG_PAGE_LIMIT;

	/**
     * The number of structural features of the '<em>Inmem Paged Trs Service</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INMEM_PAGED_TRS_SERVICE_FEATURE_COUNT = TRS_SERVICE_FEATURE_COUNT + 0;

	/**
     * The number of operations of the '<em>Inmem Paged Trs Service</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INMEM_PAGED_TRS_SERVICE_OPERATION_COUNT = TRS_SERVICE_OPERATION_COUNT + 0;

	/**
     * The meta object id for the '{@link adaptorinterface.impl.ShapeImpl <em>Shape</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see adaptorinterface.impl.ShapeImpl
     * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getShape()
     * @generated
     */
	int SHAPE = 21;

	/**
     * The number of structural features of the '<em>Shape</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHAPE_FEATURE_COUNT = 0;

	/**
     * The number of operations of the '<em>Shape</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHAPE_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link adaptorinterface.impl.ResourceImpl <em>Resource</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see adaptorinterface.impl.ResourceImpl
     * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getResource()
     * @generated
     */
	int RESOURCE = 10;

	/**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE__ID = SHAPE_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESOURCE__NAME = SHAPE_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Title</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE__TITLE = SHAPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE__DESCRIPTION = SHAPE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Describes</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESOURCE__DESCRIBES = SHAPE_FEATURE_COUNT + 4;

	/**
     * The feature id for the '<em><b>Extends</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESOURCE__EXTENDS = SHAPE_FEATURE_COUNT + 5;

	/**
     * The feature id for the '<em><b>Resource Properties</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESOURCE__RESOURCE_PROPERTIES = SHAPE_FEATURE_COUNT + 6;

	/**
     * The feature id for the '<em><b>Additional Constraints</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE__ADDITIONAL_CONSTRAINTS = SHAPE_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Vocabulary Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE__VOCABULARY_COMMENT = SHAPE_FEATURE_COUNT + 8;

    /**
     * The number of structural features of the '<em>Resource</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESOURCE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 9;

	/**
     * The number of operations of the '<em>Resource</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESOURCE_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
     * The meta object id for the '{@link adaptorinterface.impl.ShapePropertyImpl <em>Shape Property</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see adaptorinterface.impl.ShapePropertyImpl
     * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getShapeProperty()
     * @generated
     */
	int SHAPE_PROPERTY = 23;

	/**
     * The number of structural features of the '<em>Shape Property</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHAPE_PROPERTY_FEATURE_COUNT = 0;

	/**
     * The number of operations of the '<em>Shape Property</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHAPE_PROPERTY_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link adaptorinterface.impl.ResourcePropertyImpl <em>Resource Property</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see adaptorinterface.impl.ResourcePropertyImpl
     * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getResourceProperty()
     * @generated
     */
	int RESOURCE_PROPERTY = 11;

	/**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_PROPERTY__ID = SHAPE_PROPERTY_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESOURCE_PROPERTY__NAME = SHAPE_PROPERTY_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Title</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESOURCE_PROPERTY__TITLE = SHAPE_PROPERTY_FEATURE_COUNT + 2;

	/**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESOURCE_PROPERTY__DESCRIPTION = SHAPE_PROPERTY_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Property Definition</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESOURCE_PROPERTY__PROPERTY_DEFINITION = SHAPE_PROPERTY_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Occurs</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESOURCE_PROPERTY__OCCURS = SHAPE_PROPERTY_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Read Only</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESOURCE_PROPERTY__READ_ONLY = SHAPE_PROPERTY_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Value Type</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESOURCE_PROPERTY__VALUE_TYPE = SHAPE_PROPERTY_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Range</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESOURCE_PROPERTY__RANGE = SHAPE_PROPERTY_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Representation</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESOURCE_PROPERTY__REPRESENTATION = SHAPE_PROPERTY_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Multi Value Representation</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESOURCE_PROPERTY__MULTI_VALUE_REPRESENTATION = SHAPE_PROPERTY_FEATURE_COUNT + 10;

	/**
     * The feature id for the '<em><b>Allowed Value</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESOURCE_PROPERTY__ALLOWED_VALUE = SHAPE_PROPERTY_FEATURE_COUNT + 11;

	/**
     * The feature id for the '<em><b>Is Member Property</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESOURCE_PROPERTY__IS_MEMBER_PROPERTY = SHAPE_PROPERTY_FEATURE_COUNT + 12;

	/**
     * The feature id for the '<em><b>Additional Constraints</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_PROPERTY__ADDITIONAL_CONSTRAINTS = SHAPE_PROPERTY_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Vocabulary Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_PROPERTY__VOCABULARY_COMMENT = SHAPE_PROPERTY_FEATURE_COUNT + 14;

    /**
     * The number of structural features of the '<em>Resource Property</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESOURCE_PROPERTY_FEATURE_COUNT = SHAPE_PROPERTY_FEATURE_COUNT + 15;

	/**
     * The number of operations of the '<em>Resource Property</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESOURCE_PROPERTY_OPERATION_COUNT = SHAPE_PROPERTY_OPERATION_COUNT + 0;

	/**
     * The meta object id for the '{@link adaptorinterface.impl.CreationFactoryImpl <em>Creation Factory</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see adaptorinterface.impl.CreationFactoryImpl
     * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getCreationFactory()
     * @generated
     */
	int CREATION_FACTORY = 12;

	/**
     * The feature id for the '<em><b>Title</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CREATION_FACTORY__TITLE = 0;

	/**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CREATION_FACTORY__LABEL = 1;

	/**
     * The feature id for the '<em><b>Creation URI</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CREATION_FACTORY__CREATION_URI = 2;

	/**
     * The feature id for the '<em><b>Resource Types</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CREATION_FACTORY__RESOURCE_TYPES = 3;

	/**
     * The feature id for the '<em><b>Usages</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CREATION_FACTORY__USAGES = 4;

	/**
     * The number of structural features of the '<em>Creation Factory</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CREATION_FACTORY_FEATURE_COUNT = 5;

	/**
     * The number of operations of the '<em>Creation Factory</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CREATION_FACTORY_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link adaptorinterface.impl.QueryCapabilityImpl <em>Query Capability</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see adaptorinterface.impl.QueryCapabilityImpl
     * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getQueryCapability()
     * @generated
     */
	int QUERY_CAPABILITY = 13;

	/**
     * The feature id for the '<em><b>Title</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUERY_CAPABILITY__TITLE = 0;

	/**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUERY_CAPABILITY__LABEL = 1;

	/**
     * The feature id for the '<em><b>Query Base URI</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUERY_CAPABILITY__QUERY_BASE_URI = 2;

	/**
     * The feature id for the '<em><b>Resource Types</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUERY_CAPABILITY__RESOURCE_TYPES = 3;

	/**
     * The feature id for the '<em><b>Usages</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUERY_CAPABILITY__USAGES = 4;

	/**
     * The number of structural features of the '<em>Query Capability</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUERY_CAPABILITY_FEATURE_COUNT = 5;

	/**
     * The number of operations of the '<em>Query Capability</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int QUERY_CAPABILITY_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link adaptorinterface.impl.BasicCapabilityImpl <em>Basic Capability</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see adaptorinterface.impl.BasicCapabilityImpl
     * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getBasicCapability()
     * @generated
     */
	int BASIC_CAPABILITY = 14;

	/**
     * The feature id for the '<em><b>Instance ID</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BASIC_CAPABILITY__INSTANCE_ID = 0;

	/**
     * The feature id for the '<em><b>Resource Types</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BASIC_CAPABILITY__RESOURCE_TYPES = 1;

	/**
     * The feature id for the '<em><b>Read</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BASIC_CAPABILITY__READ = 2;

	/**
     * The feature id for the '<em><b>Delete</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BASIC_CAPABILITY__DELETE = 3;

	/**
     * The feature id for the '<em><b>Update</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BASIC_CAPABILITY__UPDATE = 4;

	/**
     * The number of structural features of the '<em>Basic Capability</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BASIC_CAPABILITY_FEATURE_COUNT = 5;

	/**
     * The number of operations of the '<em>Basic Capability</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int BASIC_CAPABILITY_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link adaptorinterface.impl.DialogImpl <em>Dialog</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see adaptorinterface.impl.DialogImpl
     * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getDialog()
     * @generated
     */
	int DIALOG = 15;

	/**
     * The feature id for the '<em><b>Title</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DIALOG__TITLE = 0;

	/**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DIALOG__LABEL = 1;

	/**
     * The feature id for the '<em><b>Dialog URI</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DIALOG__DIALOG_URI = 2;

	/**
     * The feature id for the '<em><b>Hint Width</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DIALOG__HINT_WIDTH = 3;

	/**
     * The feature id for the '<em><b>Hint Height</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DIALOG__HINT_HEIGHT = 4;

	/**
     * The feature id for the '<em><b>Resource Types</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DIALOG__RESOURCE_TYPES = 5;

	/**
     * The feature id for the '<em><b>Usages</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DIALOG__USAGES = 6;

	/**
     * The number of structural features of the '<em>Dialog</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DIALOG_FEATURE_COUNT = 7;

	/**
     * The number of operations of the '<em>Dialog</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DIALOG_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link adaptorinterface.impl.PublisherImpl <em>Publisher</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see adaptorinterface.impl.PublisherImpl
     * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getPublisher()
     * @generated
     */
	int PUBLISHER = 16;

	/**
     * The feature id for the '<em><b>Title</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PUBLISHER__TITLE = 0;

	/**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PUBLISHER__LABEL = 1;

	/**
     * The feature id for the '<em><b>Identifier</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PUBLISHER__IDENTIFIER = 2;

	/**
     * The feature id for the '<em><b>Icon</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PUBLISHER__ICON = 3;

	/**
     * The number of structural features of the '<em>Publisher</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PUBLISHER_FEATURE_COUNT = 4;

	/**
     * The number of operations of the '<em>Publisher</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PUBLISHER_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link adaptorinterface.impl.RequiredAdaptorImpl <em>Required Adaptor</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see adaptorinterface.impl.RequiredAdaptorImpl
     * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getRequiredAdaptor()
     * @generated
     */
	int REQUIRED_ADAPTOR = 17;

	/**
     * The feature id for the '<em><b>Service Provider Catalog URI</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int REQUIRED_ADAPTOR__SERVICE_PROVIDER_CATALOG_URI = 0;

	/**
     * The number of structural features of the '<em>Required Adaptor</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int REQUIRED_ADAPTOR_FEATURE_COUNT = 1;

	/**
     * The number of operations of the '<em>Required Adaptor</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int REQUIRED_ADAPTOR_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link adaptorinterface.impl.GenericRequiredAdaptorImpl <em>Generic Required Adaptor</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see adaptorinterface.impl.GenericRequiredAdaptorImpl
     * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getGenericRequiredAdaptor()
     * @generated
     */
	int GENERIC_REQUIRED_ADAPTOR = 18;

	/**
     * The feature id for the '<em><b>Service Provider Catalog URI</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GENERIC_REQUIRED_ADAPTOR__SERVICE_PROVIDER_CATALOG_URI = REQUIRED_ADAPTOR__SERVICE_PROVIDER_CATALOG_URI;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GENERIC_REQUIRED_ADAPTOR__NAME = REQUIRED_ADAPTOR_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Serviced Resources</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GENERIC_REQUIRED_ADAPTOR__SERVICED_RESOURCES = REQUIRED_ADAPTOR_FEATURE_COUNT + 1;

	/**
     * The number of structural features of the '<em>Generic Required Adaptor</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GENERIC_REQUIRED_ADAPTOR_FEATURE_COUNT = REQUIRED_ADAPTOR_FEATURE_COUNT + 2;

	/**
     * The number of operations of the '<em>Generic Required Adaptor</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GENERIC_REQUIRED_ADAPTOR_OPERATION_COUNT = REQUIRED_ADAPTOR_OPERATION_COUNT + 0;

	/**
     * The meta object id for the '{@link adaptorinterface.impl.ModelledRequiredAdaptorImpl <em>Modelled Required Adaptor</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see adaptorinterface.impl.ModelledRequiredAdaptorImpl
     * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getModelledRequiredAdaptor()
     * @generated
     */
	int MODELLED_REQUIRED_ADAPTOR = 19;

	/**
     * The feature id for the '<em><b>Service Provider Catalog URI</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MODELLED_REQUIRED_ADAPTOR__SERVICE_PROVIDER_CATALOG_URI = REQUIRED_ADAPTOR__SERVICE_PROVIDER_CATALOG_URI;

	/**
     * The feature id for the '<em><b>Adaptor Interface</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MODELLED_REQUIRED_ADAPTOR__ADAPTOR_INTERFACE = REQUIRED_ADAPTOR_FEATURE_COUNT + 0;

	/**
     * The number of structural features of the '<em>Modelled Required Adaptor</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MODELLED_REQUIRED_ADAPTOR_FEATURE_COUNT = REQUIRED_ADAPTOR_FEATURE_COUNT + 1;

	/**
     * The number of operations of the '<em>Modelled Required Adaptor</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MODELLED_REQUIRED_ADAPTOR_OPERATION_COUNT = REQUIRED_ADAPTOR_OPERATION_COUNT + 0;

	/**
     * The meta object id for the '{@link adaptorinterface.impl.GenerationSettingImpl <em>Generation Setting</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see adaptorinterface.impl.GenerationSettingImpl
     * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getGenerationSetting()
     * @generated
     */
	int GENERATION_SETTING = 20;

	/**
     * The feature id for the '<em><b>Java Class Package Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GENERATION_SETTING__JAVA_CLASS_PACKAGE_NAME = 0;

	/**
     * The feature id for the '<em><b>Java Files Path</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GENERATION_SETTING__JAVA_FILES_PATH = 1;

	/**
     * The feature id for the '<em><b>Do Not Generate</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GENERATION_SETTING__DO_NOT_GENERATE = 2;

	/**
     * The number of structural features of the '<em>Generation Setting</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GENERATION_SETTING_FEATURE_COUNT = 3;

	/**
     * The number of operations of the '<em>Generation Setting</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GENERATION_SETTING_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link adaptorinterface.impl.ShaclShapeImpl <em>Shacl Shape</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see adaptorinterface.impl.ShaclShapeImpl
     * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getShaclShape()
     * @generated
     */
	int SHACL_SHAPE = 22;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHACL_SHAPE__NAME = SHAPE_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Target Class</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHACL_SHAPE__TARGET_CLASS = SHAPE_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Closed</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHACL_SHAPE__CLOSED = SHAPE_FEATURE_COUNT + 2;

	/**
     * The feature id for the '<em><b>Shacl Properties</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHACL_SHAPE__SHACL_PROPERTIES = SHAPE_FEATURE_COUNT + 3;

	/**
     * The feature id for the '<em><b>Extends</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHACL_SHAPE__EXTENDS = SHAPE_FEATURE_COUNT + 4;

	/**
     * The number of structural features of the '<em>Shacl Shape</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHACL_SHAPE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 5;

	/**
     * The number of operations of the '<em>Shacl Shape</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHACL_SHAPE_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
     * The meta object id for the '{@link adaptorinterface.impl.ShaclPropertyImpl <em>Shacl Property</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see adaptorinterface.impl.ShaclPropertyImpl
     * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getShaclProperty()
     * @generated
     */
	int SHACL_PROPERTY = 24;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHACL_PROPERTY__NAME = SHAPE_PROPERTY_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Path</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHACL_PROPERTY__PATH = SHAPE_PROPERTY_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Min Count</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHACL_PROPERTY__MIN_COUNT = SHAPE_PROPERTY_FEATURE_COUNT + 2;

	/**
     * The feature id for the '<em><b>Max Count</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHACL_PROPERTY__MAX_COUNT = SHAPE_PROPERTY_FEATURE_COUNT + 3;

	/**
     * The feature id for the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHACL_PROPERTY__DATA_TYPE = SHAPE_PROPERTY_FEATURE_COUNT + 4;

	/**
     * The feature id for the '<em><b>Class</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHACL_PROPERTY__CLASS = SHAPE_PROPERTY_FEATURE_COUNT + 5;

	/**
     * The number of structural features of the '<em>Shacl Property</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHACL_PROPERTY_FEATURE_COUNT = SHAPE_PROPERTY_FEATURE_COUNT + 6;

	/**
     * The number of operations of the '<em>Shacl Property</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHACL_PROPERTY_OPERATION_COUNT = SHAPE_PROPERTY_OPERATION_COUNT + 0;

	/**
     * The meta object id for the '{@link adaptorinterface.impl.ConfigurationImpl <em>Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adaptorinterface.impl.ConfigurationImpl
     * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getConfiguration()
     * @generated
     */
    int CONFIGURATION = 25;

    /**
     * The number of structural features of the '<em>Configuration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIGURATION_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Configuration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIGURATION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link adaptorinterface.impl.AuthenticationConfigurationImpl <em>Authentication Configuration</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see adaptorinterface.impl.AuthenticationConfigurationImpl
     * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getAuthenticationConfiguration()
     * @generated
     */
	int AUTHENTICATION_CONFIGURATION = 26;

	/**
     * The feature id for the '<em><b>Application Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int AUTHENTICATION_CONFIGURATION__APPLICATION_NAME = 0;

	/**
     * The feature id for the '<em><b>Oauth Realm</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int AUTHENTICATION_CONFIGURATION__OAUTH_REALM = 1;

	/**
     * The number of structural features of the '<em>Authentication Configuration</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int AUTHENTICATION_CONFIGURATION_FEATURE_COUNT = 2;

	/**
     * The number of operations of the '<em>Authentication Configuration</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int AUTHENTICATION_CONFIGURATION_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link adaptorinterface.impl.GeneralConfigurationImpl <em>General Configuration</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see adaptorinterface.impl.GeneralConfigurationImpl
     * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getGeneralConfiguration()
     * @generated
     */
	int GENERAL_CONFIGURATION = 27;

	/**
     * The feature id for the '<em><b>Do Not Generate</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GENERAL_CONFIGURATION__DO_NOT_GENERATE = 0;

	/**
     * The feature id for the '<em><b>Do Not Generate From Imported Models</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_CONFIGURATION__DO_NOT_GENERATE_FROM_IMPORTED_MODELS = 1;

    /**
     * The feature id for the '<em><b>Files Base Path</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GENERAL_CONFIGURATION__FILES_BASE_PATH = 2;

	/**
     * The feature id for the '<em><b>Java Base Package Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GENERAL_CONFIGURATION__JAVA_BASE_PACKAGE_NAME = 3;

	/**
     * The number of structural features of the '<em>General Configuration</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GENERAL_CONFIGURATION_FEATURE_COUNT = 4;

	/**
     * The number of operations of the '<em>General Configuration</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GENERAL_CONFIGURATION_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link adaptorinterface.impl.ProjectConfigurationImpl <em>Project Configuration</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see adaptorinterface.impl.ProjectConfigurationImpl
     * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getProjectConfiguration()
     * @generated
     */
	int PROJECT_CONFIGURATION = 28;

	/**
     * The feature id for the '<em><b>Do Not Generate Project Configuration Files</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROJECT_CONFIGURATION__DO_NOT_GENERATE_PROJECT_CONFIGURATION_FILES = 0;

	/**
     * The feature id for the '<em><b>Lyo Version</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROJECT_CONFIGURATION__LYO_VERSION = 1;

	/**
     * The number of structural features of the '<em>Project Configuration</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROJECT_CONFIGURATION_FEATURE_COUNT = 2;

	/**
     * The number of operations of the '<em>Project Configuration</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROJECT_CONFIGURATION_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link adaptorinterface.impl.ServerConfigurationImpl <em>Server Configuration</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see adaptorinterface.impl.ServerConfigurationImpl
     * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getServerConfiguration()
     * @generated
     */
	int SERVER_CONFIGURATION = 29;

	/**
     * The feature id for the '<em><b>Root Server Base Url</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SERVER_CONFIGURATION__ROOT_SERVER_BASE_URL = 0;

	/**
     * The feature id for the '<em><b>Application Context Path</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SERVER_CONFIGURATION__APPLICATION_CONTEXT_PATH = 1;

	/**
     * The feature id for the '<em><b>Servlet Url Pattern</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SERVER_CONFIGURATION__SERVLET_URL_PATTERN = 2;

	/**
     * The feature id for the '<em><b>Do Not Regenerate Jsp Files</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SERVER_CONFIGURATION__DO_NOT_REGENERATE_JSP_FILES = 3;

	/**
     * The feature id for the '<em><b>Generate Jsp Files For Oslc UI</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVER_CONFIGURATION__GENERATE_JSP_FILES_FOR_OSLC_UI = 4;

    /**
     * The feature id for the '<em><b>General Configuration</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SERVER_CONFIGURATION__GENERAL_CONFIGURATION = 5;

	/**
     * The feature id for the '<em><b>Project Configuration</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SERVER_CONFIGURATION__PROJECT_CONFIGURATION = 6;

	/**
     * The feature id for the '<em><b>Authentication Configuration</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SERVER_CONFIGURATION__AUTHENTICATION_CONFIGURATION = 7;

	/**
     * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVER_CONFIGURATION__CONFIGURATIONS = 8;

    /**
     * The number of structural features of the '<em>Server Configuration</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SERVER_CONFIGURATION_FEATURE_COUNT = 9;

	/**
     * The number of operations of the '<em>Server Configuration</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SERVER_CONFIGURATION_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link adaptorinterface.impl.SpecificationConfigurationImpl <em>Specification Configuration</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see adaptorinterface.impl.SpecificationConfigurationImpl
     * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getSpecificationConfiguration()
     * @generated
     */
	int SPECIFICATION_CONFIGURATION = 30;

	/**
     * The feature id for the '<em><b>General Configuration</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPECIFICATION_CONFIGURATION__GENERAL_CONFIGURATION = 0;

	/**
     * The feature id for the '<em><b>Project Configuration</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPECIFICATION_CONFIGURATION__PROJECT_CONFIGURATION = 1;

	/**
     * The number of structural features of the '<em>Specification Configuration</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPECIFICATION_CONFIGURATION_FEATURE_COUNT = 2;

	/**
     * The number of operations of the '<em>Specification Configuration</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPECIFICATION_CONFIGURATION_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link adaptorinterface.impl.MavenProjectConfigurationImpl <em>Maven Project Configuration</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see adaptorinterface.impl.MavenProjectConfigurationImpl
     * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getMavenProjectConfiguration()
     * @generated
     */
	int MAVEN_PROJECT_CONFIGURATION = 31;

	/**
     * The feature id for the '<em><b>Do Not Generate Project Configuration Files</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAVEN_PROJECT_CONFIGURATION__DO_NOT_GENERATE_PROJECT_CONFIGURATION_FILES = PROJECT_CONFIGURATION__DO_NOT_GENERATE_PROJECT_CONFIGURATION_FILES;

	/**
     * The feature id for the '<em><b>Lyo Version</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAVEN_PROJECT_CONFIGURATION__LYO_VERSION = PROJECT_CONFIGURATION__LYO_VERSION;

	/**
     * The feature id for the '<em><b>Group Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAVEN_PROJECT_CONFIGURATION__GROUP_ID = PROJECT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAVEN_PROJECT_CONFIGURATION__ARTIFACT_ID = PROJECT_CONFIGURATION_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAVEN_PROJECT_CONFIGURATION__VERSION = PROJECT_CONFIGURATION_FEATURE_COUNT + 2;

	/**
     * The number of structural features of the '<em>Maven Project Configuration</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAVEN_PROJECT_CONFIGURATION_FEATURE_COUNT = PROJECT_CONFIGURATION_FEATURE_COUNT + 3;

	/**
     * The number of operations of the '<em>Maven Project Configuration</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAVEN_PROJECT_CONFIGURATION_OPERATION_COUNT = PROJECT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
     * The meta object id for the '{@link adaptorinterface.impl.MavenServerConfigurationImpl <em>Maven Server Configuration</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see adaptorinterface.impl.MavenServerConfigurationImpl
     * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getMavenServerConfiguration()
     * @generated
     */
	int MAVEN_SERVER_CONFIGURATION = 32;

	/**
     * The feature id for the '<em><b>Root Server Base Url</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAVEN_SERVER_CONFIGURATION__ROOT_SERVER_BASE_URL = SERVER_CONFIGURATION__ROOT_SERVER_BASE_URL;

	/**
     * The feature id for the '<em><b>Application Context Path</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAVEN_SERVER_CONFIGURATION__APPLICATION_CONTEXT_PATH = SERVER_CONFIGURATION__APPLICATION_CONTEXT_PATH;

	/**
     * The feature id for the '<em><b>Servlet Url Pattern</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAVEN_SERVER_CONFIGURATION__SERVLET_URL_PATTERN = SERVER_CONFIGURATION__SERVLET_URL_PATTERN;

	/**
     * The feature id for the '<em><b>Do Not Regenerate Jsp Files</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAVEN_SERVER_CONFIGURATION__DO_NOT_REGENERATE_JSP_FILES = SERVER_CONFIGURATION__DO_NOT_REGENERATE_JSP_FILES;

	/**
     * The feature id for the '<em><b>Generate Jsp Files For Oslc UI</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAVEN_SERVER_CONFIGURATION__GENERATE_JSP_FILES_FOR_OSLC_UI = SERVER_CONFIGURATION__GENERATE_JSP_FILES_FOR_OSLC_UI;

    /**
     * The feature id for the '<em><b>General Configuration</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAVEN_SERVER_CONFIGURATION__GENERAL_CONFIGURATION = SERVER_CONFIGURATION__GENERAL_CONFIGURATION;

	/**
     * The feature id for the '<em><b>Project Configuration</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAVEN_SERVER_CONFIGURATION__PROJECT_CONFIGURATION = SERVER_CONFIGURATION__PROJECT_CONFIGURATION;

	/**
     * The feature id for the '<em><b>Authentication Configuration</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAVEN_SERVER_CONFIGURATION__AUTHENTICATION_CONFIGURATION = SERVER_CONFIGURATION__AUTHENTICATION_CONFIGURATION;

	/**
     * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAVEN_SERVER_CONFIGURATION__CONFIGURATIONS = SERVER_CONFIGURATION__CONFIGURATIONS;

    /**
     * The feature id for the '<em><b>Jetty Port</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAVEN_SERVER_CONFIGURATION__JETTY_PORT = SERVER_CONFIGURATION_FEATURE_COUNT + 0;

	/**
     * The number of structural features of the '<em>Maven Server Configuration</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAVEN_SERVER_CONFIGURATION_FEATURE_COUNT = SERVER_CONFIGURATION_FEATURE_COUNT + 1;

	/**
     * The number of operations of the '<em>Maven Server Configuration</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAVEN_SERVER_CONFIGURATION_OPERATION_COUNT = SERVER_CONFIGURATION_OPERATION_COUNT + 0;

	/**
     * The meta object id for the '{@link adaptorinterface.impl.MavenSpecificationConfigurationImpl <em>Maven Specification Configuration</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see adaptorinterface.impl.MavenSpecificationConfigurationImpl
     * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getMavenSpecificationConfiguration()
     * @generated
     */
	int MAVEN_SPECIFICATION_CONFIGURATION = 33;

	/**
     * The feature id for the '<em><b>General Configuration</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAVEN_SPECIFICATION_CONFIGURATION__GENERAL_CONFIGURATION = SPECIFICATION_CONFIGURATION__GENERAL_CONFIGURATION;

	/**
     * The feature id for the '<em><b>Project Configuration</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAVEN_SPECIFICATION_CONFIGURATION__PROJECT_CONFIGURATION = SPECIFICATION_CONFIGURATION__PROJECT_CONFIGURATION;

	/**
     * The number of structural features of the '<em>Maven Specification Configuration</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAVEN_SPECIFICATION_CONFIGURATION_FEATURE_COUNT = SPECIFICATION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
     * The number of operations of the '<em>Maven Specification Configuration</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAVEN_SPECIFICATION_CONFIGURATION_OPERATION_COUNT = SPECIFICATION_CONFIGURATION_OPERATION_COUNT + 0;

	/**
     * The meta object id for the '{@link adaptorinterface.impl.SourceImpl <em>Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adaptorinterface.impl.SourceImpl
     * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getSource()
     * @generated
     */
    int SOURCE = 34;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE__NAME = 0;

    /**
     * The number of structural features of the '<em>Source</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Source</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link adaptorinterface.impl.StoreImpl <em>Store</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adaptorinterface.impl.StoreImpl
     * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getStore()
     * @generated
     */
    int STORE = 35;

    /**
     * The feature id for the '<em><b>Default Named Graph</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORE__DEFAULT_NAMED_GRAPH = 0;

    /**
     * The feature id for the '<em><b>Sparql Query Endpoint</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORE__SPARQL_QUERY_ENDPOINT = 1;

    /**
     * The feature id for the '<em><b>Sparql Update Endpoint</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORE__SPARQL_UPDATE_ENDPOINT = 2;

    /**
     * The feature id for the '<em><b>Initial Pool Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORE__INITIAL_POOL_SIZE = 3;

    /**
     * The number of structural features of the '<em>Store</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORE_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>Store</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link adaptorinterface.impl.StoreWithAuthenticationImpl <em>Store With Authentication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adaptorinterface.impl.StoreWithAuthenticationImpl
     * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getStoreWithAuthentication()
     * @generated
     */
    int STORE_WITH_AUTHENTICATION = 36;

    /**
     * The feature id for the '<em><b>Default Named Graph</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORE_WITH_AUTHENTICATION__DEFAULT_NAMED_GRAPH = STORE__DEFAULT_NAMED_GRAPH;

    /**
     * The feature id for the '<em><b>Sparql Query Endpoint</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORE_WITH_AUTHENTICATION__SPARQL_QUERY_ENDPOINT = STORE__SPARQL_QUERY_ENDPOINT;

    /**
     * The feature id for the '<em><b>Sparql Update Endpoint</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORE_WITH_AUTHENTICATION__SPARQL_UPDATE_ENDPOINT = STORE__SPARQL_UPDATE_ENDPOINT;

    /**
     * The feature id for the '<em><b>Initial Pool Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORE_WITH_AUTHENTICATION__INITIAL_POOL_SIZE = STORE__INITIAL_POOL_SIZE;

    /**
     * The feature id for the '<em><b>Username</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORE_WITH_AUTHENTICATION__USERNAME = STORE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORE_WITH_AUTHENTICATION__PASSWORD = STORE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Store With Authentication</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORE_WITH_AUTHENTICATION_FEATURE_COUNT = STORE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Store With Authentication</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STORE_WITH_AUTHENTICATION_OPERATION_COUNT = STORE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link adaptorinterface.impl.SourceBindingImpl <em>Source Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adaptorinterface.impl.SourceBindingImpl
     * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getSourceBinding()
     * @generated
     */
    int SOURCE_BINDING = 37;

    /**
     * The feature id for the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_BINDING__SOURCE = 0;

    /**
     * The number of structural features of the '<em>Source Binding</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_BINDING_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Source Binding</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_BINDING_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link adaptorinterface.impl.ServicePersistenceImpl <em>Service Persistence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adaptorinterface.impl.ServicePersistenceImpl
     * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getServicePersistence()
     * @generated
     */
    int SERVICE_PERSISTENCE = 38;

    /**
     * The feature id for the '<em><b>Store</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PERSISTENCE__STORE = 0;

    /**
     * The number of structural features of the '<em>Service Persistence</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PERSISTENCE_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Service Persistence</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PERSISTENCE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link adaptorinterface.impl.OSLCServicePersistenceImpl <em>OSLC Service Persistence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adaptorinterface.impl.OSLCServicePersistenceImpl
     * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getOSLCServicePersistence()
     * @generated
     */
    int OSLC_SERVICE_PERSISTENCE = 39;

    /**
     * The feature id for the '<em><b>Store</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OSLC_SERVICE_PERSISTENCE__STORE = SERVICE_PERSISTENCE__STORE;

    /**
     * The feature id for the '<em><b>Creation Factory</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OSLC_SERVICE_PERSISTENCE__CREATION_FACTORY = SERVICE_PERSISTENCE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Query Capability</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OSLC_SERVICE_PERSISTENCE__QUERY_CAPABILITY = SERVICE_PERSISTENCE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Selection Dialog</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OSLC_SERVICE_PERSISTENCE__SELECTION_DIALOG = SERVICE_PERSISTENCE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Creation Dialog</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OSLC_SERVICE_PERSISTENCE__CREATION_DIALOG = SERVICE_PERSISTENCE_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>OSLC Service Persistence</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OSLC_SERVICE_PERSISTENCE_FEATURE_COUNT = SERVICE_PERSISTENCE_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>OSLC Service Persistence</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OSLC_SERVICE_PERSISTENCE_OPERATION_COUNT = SERVICE_PERSISTENCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link adaptorinterface.impl.WebServicePersistenceImpl <em>Web Service Persistence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see adaptorinterface.impl.WebServicePersistenceImpl
     * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getWebServicePersistence()
     * @generated
     */
    int WEB_SERVICE_PERSISTENCE = 40;

    /**
     * The feature id for the '<em><b>Store</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEB_SERVICE_PERSISTENCE__STORE = SERVICE_PERSISTENCE__STORE;

    /**
     * The feature id for the '<em><b>Read</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEB_SERVICE_PERSISTENCE__READ = SERVICE_PERSISTENCE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Delete</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEB_SERVICE_PERSISTENCE__DELETE = SERVICE_PERSISTENCE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Update</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEB_SERVICE_PERSISTENCE__UPDATE = SERVICE_PERSISTENCE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Web Service Persistence</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEB_SERVICE_PERSISTENCE_FEATURE_COUNT = SERVICE_PERSISTENCE_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Web Service Persistence</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WEB_SERVICE_PERSISTENCE_OPERATION_COUNT = SERVICE_PERSISTENCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link adaptorinterface.ResourcePropertyOccurs <em>Resource Property Occurs</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see adaptorinterface.ResourcePropertyOccurs
     * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getResourcePropertyOccurs()
     * @generated
     */
	int RESOURCE_PROPERTY_OCCURS = 41;

	/**
     * The meta object id for the '{@link adaptorinterface.ResourcePropertyValueType <em>Resource Property Value Type</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see adaptorinterface.ResourcePropertyValueType
     * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getResourcePropertyValueType()
     * @generated
     */
	int RESOURCE_PROPERTY_VALUE_TYPE = 42;

	/**
     * The meta object id for the '{@link adaptorinterface.ResourcePropertyRepresentation <em>Resource Property Representation</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see adaptorinterface.ResourcePropertyRepresentation
     * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getResourcePropertyRepresentation()
     * @generated
     */
	int RESOURCE_PROPERTY_REPRESENTATION = 43;

	/**
     * The meta object id for the '{@link adaptorinterface.ResourcePropertyIsMemberProperty <em>Resource Property Is Member Property</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see adaptorinterface.ResourcePropertyIsMemberProperty
     * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getResourcePropertyIsMemberProperty()
     * @generated
     */
	int RESOURCE_PROPERTY_IS_MEMBER_PROPERTY = 44;

	/**
     * The meta object id for the '{@link adaptorinterface.ResourcePropertyMultiValueRepresentation <em>Resource Property Multi Value Representation</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see adaptorinterface.ResourcePropertyMultiValueRepresentation
     * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getResourcePropertyMultiValueRepresentation()
     * @generated
     */
	int RESOURCE_PROPERTY_MULTI_VALUE_REPRESENTATION = 45;

	/**
     * The meta object id for the '{@link adaptorinterface.ResourceServiceNamespace <em>Resource Service Namespace</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see adaptorinterface.ResourceServiceNamespace
     * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getResourceServiceNamespace()
     * @generated
     */
	int RESOURCE_SERVICE_NAMESPACE = 46;

	/**
     * The meta object id for the '{@link adaptorinterface.ShaclPropertyDataType <em>Shacl Property Data Type</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see adaptorinterface.ShaclPropertyDataType
     * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getShaclPropertyDataType()
     * @generated
     */
	int SHACL_PROPERTY_DATA_TYPE = 47;


	/**
     * Returns the meta object for class '{@link adaptorinterface.AdaptorInterface <em>Adaptor Interface</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Adaptor Interface</em>'.
     * @see adaptorinterface.AdaptorInterface
     * @generated
     */
	EClass getAdaptorInterface();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.AdaptorInterface#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see adaptorinterface.AdaptorInterface#getName()
     * @see #getAdaptorInterface()
     * @generated
     */
	EAttribute getAdaptorInterface_Name();

	/**
     * Returns the meta object for the containment reference '{@link adaptorinterface.AdaptorInterface#getServiceProviderCatalog <em>Service Provider Catalog</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Service Provider Catalog</em>'.
     * @see adaptorinterface.AdaptorInterface#getServiceProviderCatalog()
     * @see #getAdaptorInterface()
     * @generated
     */
	EReference getAdaptorInterface_ServiceProviderCatalog();

	/**
     * Returns the meta object for the containment reference list '{@link adaptorinterface.AdaptorInterface#getWebServices <em>Web Services</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Web Services</em>'.
     * @see adaptorinterface.AdaptorInterface#getWebServices()
     * @see #getAdaptorInterface()
     * @generated
     */
	EReference getAdaptorInterface_WebServices();

	/**
     * Returns the meta object for the containment reference '{@link adaptorinterface.AdaptorInterface#getTrsService <em>Trs Service</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Trs Service</em>'.
     * @see adaptorinterface.AdaptorInterface#getTrsService()
     * @see #getAdaptorInterface()
     * @generated
     */
	EReference getAdaptorInterface_TrsService();

	/**
     * Returns the meta object for the containment reference '{@link adaptorinterface.AdaptorInterface#getSpecification <em>Specification</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Specification</em>'.
     * @see adaptorinterface.AdaptorInterface#getSpecification()
     * @see #getAdaptorInterface()
     * @generated
     */
	EReference getAdaptorInterface_Specification();

	/**
     * Returns the meta object for the containment reference list '{@link adaptorinterface.AdaptorInterface#getRequiredAdaptors <em>Required Adaptors</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Required Adaptors</em>'.
     * @see adaptorinterface.AdaptorInterface#getRequiredAdaptors()
     * @see #getAdaptorInterface()
     * @generated
     */
	EReference getAdaptorInterface_RequiredAdaptors();

	/**
     * Returns the meta object for the containment reference '{@link adaptorinterface.AdaptorInterface#getConfiguration <em>Configuration</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Configuration</em>'.
     * @see adaptorinterface.AdaptorInterface#getConfiguration()
     * @see #getAdaptorInterface()
     * @generated
     */
	EReference getAdaptorInterface_Configuration();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.AdaptorInterface#getJavaClassBaseNamespace <em>Java Class Base Namespace</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Java Class Base Namespace</em>'.
     * @see adaptorinterface.AdaptorInterface#getJavaClassBaseNamespace()
     * @see #getAdaptorInterface()
     * @generated
     */
	EAttribute getAdaptorInterface_JavaClassBaseNamespace();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.AdaptorInterface#getJavaFilesBasePath <em>Java Files Base Path</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Java Files Base Path</em>'.
     * @see adaptorinterface.AdaptorInterface#getJavaFilesBasePath()
     * @see #getAdaptorInterface()
     * @generated
     */
	EAttribute getAdaptorInterface_JavaFilesBasePath();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.AdaptorInterface#getJspFilesBasePath <em>Jsp Files Base Path</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Jsp Files Base Path</em>'.
     * @see adaptorinterface.AdaptorInterface#getJspFilesBasePath()
     * @see #getAdaptorInterface()
     * @generated
     */
	EAttribute getAdaptorInterface_JspFilesBasePath();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.AdaptorInterface#getJavascriptFilesBasePath <em>Javascript Files Base Path</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Javascript Files Base Path</em>'.
     * @see adaptorinterface.AdaptorInterface#getJavascriptFilesBasePath()
     * @see #getAdaptorInterface()
     * @generated
     */
	EAttribute getAdaptorInterface_JavascriptFilesBasePath();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.AdaptorInterface#isSwaggerDocumentation <em>Swagger Documentation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Swagger Documentation</em>'.
     * @see adaptorinterface.AdaptorInterface#isSwaggerDocumentation()
     * @see #getAdaptorInterface()
     * @generated
     */
	EAttribute getAdaptorInterface_SwaggerDocumentation();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.AdaptorInterface#getBackendCodeTemplate_classImports <em>Backend Code Template class Imports</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Backend Code Template class Imports</em>'.
     * @see adaptorinterface.AdaptorInterface#getBackendCodeTemplate_classImports()
     * @see #getAdaptorInterface()
     * @generated
     */
	EAttribute getAdaptorInterface_BackendCodeTemplate_classImports();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.AdaptorInterface#getBackendCodeTemplate_classMethods <em>Backend Code Template class Methods</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Backend Code Template class Methods</em>'.
     * @see adaptorinterface.AdaptorInterface#getBackendCodeTemplate_classMethods()
     * @see #getAdaptorInterface()
     * @generated
     */
	EAttribute getAdaptorInterface_BackendCodeTemplate_classMethods();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.AdaptorInterface#getBackendCodeTemplate_servletListenerInitialize <em>Backend Code Template servlet Listener Initialize</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Backend Code Template servlet Listener Initialize</em>'.
     * @see adaptorinterface.AdaptorInterface#getBackendCodeTemplate_servletListenerInitialize()
     * @see #getAdaptorInterface()
     * @generated
     */
	EAttribute getAdaptorInterface_BackendCodeTemplate_servletListenerInitialize();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.AdaptorInterface#getBackendCodeTemplate_servletListenerDestroy <em>Backend Code Template servlet Listener Destroy</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Backend Code Template servlet Listener Destroy</em>'.
     * @see adaptorinterface.AdaptorInterface#getBackendCodeTemplate_servletListenerDestroy()
     * @see #getAdaptorInterface()
     * @generated
     */
	EAttribute getAdaptorInterface_BackendCodeTemplate_servletListenerDestroy();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.AdaptorInterface#getBackendCodeTemplate_getServiceProviders <em>Backend Code Template get Service Providers</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Backend Code Template get Service Providers</em>'.
     * @see adaptorinterface.AdaptorInterface#getBackendCodeTemplate_getServiceProviders()
     * @see #getAdaptorInterface()
     * @generated
     */
	EAttribute getAdaptorInterface_BackendCodeTemplate_getServiceProviders();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.AdaptorInterface#getBackendCodeTemplate_getResource <em>Backend Code Template get Resource</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Backend Code Template get Resource</em>'.
     * @see adaptorinterface.AdaptorInterface#getBackendCodeTemplate_getResource()
     * @see #getAdaptorInterface()
     * @generated
     */
	EAttribute getAdaptorInterface_BackendCodeTemplate_getResource();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.AdaptorInterface#getBackendCodeTemplate_getResources <em>Backend Code Template get Resources</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Backend Code Template get Resources</em>'.
     * @see adaptorinterface.AdaptorInterface#getBackendCodeTemplate_getResources()
     * @see #getAdaptorInterface()
     * @generated
     */
	EAttribute getAdaptorInterface_BackendCodeTemplate_getResources();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.AdaptorInterface#getBackendCodeTemplate_searchResources <em>Backend Code Template search Resources</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Backend Code Template search Resources</em>'.
     * @see adaptorinterface.AdaptorInterface#getBackendCodeTemplate_searchResources()
     * @see #getAdaptorInterface()
     * @generated
     */
	EAttribute getAdaptorInterface_BackendCodeTemplate_searchResources();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.AdaptorInterface#getBackendCodeTemplate_createResource <em>Backend Code Template create Resource</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Backend Code Template create Resource</em>'.
     * @see adaptorinterface.AdaptorInterface#getBackendCodeTemplate_createResource()
     * @see #getAdaptorInterface()
     * @generated
     */
	EAttribute getAdaptorInterface_BackendCodeTemplate_createResource();

	/**
     * Returns the meta object for the containment reference list '{@link adaptorinterface.AdaptorInterface#getStores <em>Stores</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Stores</em>'.
     * @see adaptorinterface.AdaptorInterface#getStores()
     * @see #getAdaptorInterface()
     * @generated
     */
    EReference getAdaptorInterface_Stores();

    /**
     * Returns the meta object for the containment reference list '{@link adaptorinterface.AdaptorInterface#getSources <em>Sources</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sources</em>'.
     * @see adaptorinterface.AdaptorInterface#getSources()
     * @see #getAdaptorInterface()
     * @generated
     */
    EReference getAdaptorInterface_Sources();

    /**
     * Returns the meta object for class '{@link adaptorinterface.Specification <em>Specification</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Specification</em>'.
     * @see adaptorinterface.Specification
     * @generated
     */
	EClass getSpecification();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.Specification#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see adaptorinterface.Specification#getName()
     * @see #getSpecification()
     * @generated
     */
    EAttribute getSpecification_Name();

    /**
     * Returns the meta object for the containment reference list '{@link adaptorinterface.Specification#getDomainSpecifications <em>Domain Specifications</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Domain Specifications</em>'.
     * @see adaptorinterface.Specification#getDomainSpecifications()
     * @see #getSpecification()
     * @generated
     */
	EReference getSpecification_DomainSpecifications();

	/**
     * Returns the meta object for the containment reference list '{@link adaptorinterface.Specification#getDomainPrefixes <em>Domain Prefixes</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Domain Prefixes</em>'.
     * @see adaptorinterface.Specification#getDomainPrefixes()
     * @see #getSpecification()
     * @generated
     */
	EReference getSpecification_DomainPrefixes();

	/**
     * Returns the meta object for the containment reference '{@link adaptorinterface.Specification#getGenerationSetting <em>Generation Setting</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Generation Setting</em>'.
     * @see adaptorinterface.Specification#getGenerationSetting()
     * @see #getSpecification()
     * @generated
     */
	EReference getSpecification_GenerationSetting();

	/**
     * Returns the meta object for the containment reference '{@link adaptorinterface.Specification#getConfiguration <em>Configuration</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Configuration</em>'.
     * @see adaptorinterface.Specification#getConfiguration()
     * @see #getSpecification()
     * @generated
     */
	EReference getSpecification_Configuration();

	/**
     * Returns the meta object for class '{@link adaptorinterface.DomainSpecification <em>Domain Specification</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Domain Specification</em>'.
     * @see adaptorinterface.DomainSpecification
     * @generated
     */
	EClass getDomainSpecification();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.DomainSpecification#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see adaptorinterface.DomainSpecification#getName()
     * @see #getDomainSpecification()
     * @generated
     */
	EAttribute getDomainSpecification_Name();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.DomainSpecification#getNamespaceURI <em>Namespace URI</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Namespace URI</em>'.
     * @see adaptorinterface.DomainSpecification#getNamespaceURI()
     * @see #getDomainSpecification()
     * @generated
     */
	EAttribute getDomainSpecification_NamespaceURI();

	/**
     * Returns the meta object for the reference '{@link adaptorinterface.DomainSpecification#getNamespacePrefix <em>Namespace Prefix</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Namespace Prefix</em>'.
     * @see adaptorinterface.DomainSpecification#getNamespacePrefix()
     * @see #getDomainSpecification()
     * @generated
     */
	EReference getDomainSpecification_NamespacePrefix();

	/**
     * Returns the meta object for the containment reference list '{@link adaptorinterface.DomainSpecification#getResources <em>Resources</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Resources</em>'.
     * @see adaptorinterface.DomainSpecification#getResources()
     * @see #getDomainSpecification()
     * @generated
     */
	EReference getDomainSpecification_Resources();

	/**
     * Returns the meta object for the containment reference list '{@link adaptorinterface.DomainSpecification#getResourceProperties <em>Resource Properties</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Resource Properties</em>'.
     * @see adaptorinterface.DomainSpecification#getResourceProperties()
     * @see #getDomainSpecification()
     * @generated
     */
	EReference getDomainSpecification_ResourceProperties();

	/**
     * Returns the meta object for the containment reference '{@link adaptorinterface.DomainSpecification#getGenerationSetting <em>Generation Setting</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Generation Setting</em>'.
     * @see adaptorinterface.DomainSpecification#getGenerationSetting()
     * @see #getDomainSpecification()
     * @generated
     */
	EReference getDomainSpecification_GenerationSetting();

	/**
     * Returns the meta object for the containment reference '{@link adaptorinterface.DomainSpecification#getConfiguration <em>Configuration</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Configuration</em>'.
     * @see adaptorinterface.DomainSpecification#getConfiguration()
     * @see #getDomainSpecification()
     * @generated
     */
	EReference getDomainSpecification_Configuration();

	/**
     * Returns the meta object for the containment reference list '{@link adaptorinterface.DomainSpecification#getShaclShapes <em>Shacl Shapes</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Shacl Shapes</em>'.
     * @see adaptorinterface.DomainSpecification#getShaclShapes()
     * @see #getDomainSpecification()
     * @generated
     */
	EReference getDomainSpecification_ShaclShapes();

	/**
     * Returns the meta object for the containment reference list '{@link adaptorinterface.DomainSpecification#getShaclProperties <em>Shacl Properties</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Shacl Properties</em>'.
     * @see adaptorinterface.DomainSpecification#getShaclProperties()
     * @see #getDomainSpecification()
     * @generated
     */
	EReference getDomainSpecification_ShaclProperties();

	/**
     * Returns the meta object for the containment reference '{@link adaptorinterface.DomainSpecification#getDefaultVocabulary <em>Default Vocabulary</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Default Vocabulary</em>'.
     * @see adaptorinterface.DomainSpecification#getDefaultVocabulary()
     * @see #getDomainSpecification()
     * @generated
     */
    EReference getDomainSpecification_DefaultVocabulary();

    /**
     * Returns the meta object for class '{@link adaptorinterface.NamespacePrefix <em>Namespace Prefix</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Namespace Prefix</em>'.
     * @see adaptorinterface.NamespacePrefix
     * @generated
     */
	EClass getNamespacePrefix();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.NamespacePrefix#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see adaptorinterface.NamespacePrefix#getName()
     * @see #getNamespacePrefix()
     * @generated
     */
	EAttribute getNamespacePrefix_Name();

	/**
     * Returns the meta object for class '{@link adaptorinterface.ServiceProviderCatalog <em>Service Provider Catalog</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service Provider Catalog</em>'.
     * @see adaptorinterface.ServiceProviderCatalog
     * @generated
     */
	EClass getServiceProviderCatalog();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.ServiceProviderCatalog#getTitle <em>Title</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Title</em>'.
     * @see adaptorinterface.ServiceProviderCatalog#getTitle()
     * @see #getServiceProviderCatalog()
     * @generated
     */
	EAttribute getServiceProviderCatalog_Title();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.ServiceProviderCatalog#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see adaptorinterface.ServiceProviderCatalog#getDescription()
     * @see #getServiceProviderCatalog()
     * @generated
     */
	EAttribute getServiceProviderCatalog_Description();

	/**
     * Returns the meta object for the containment reference '{@link adaptorinterface.ServiceProviderCatalog#getPublisher <em>Publisher</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Publisher</em>'.
     * @see adaptorinterface.ServiceProviderCatalog#getPublisher()
     * @see #getServiceProviderCatalog()
     * @generated
     */
	EReference getServiceProviderCatalog_Publisher();

	/**
     * Returns the meta object for the containment reference list '{@link adaptorinterface.ServiceProviderCatalog#getServiceProviders <em>Service Providers</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Service Providers</em>'.
     * @see adaptorinterface.ServiceProviderCatalog#getServiceProviders()
     * @see #getServiceProviderCatalog()
     * @generated
     */
	EReference getServiceProviderCatalog_ServiceProviders();

	/**
     * Returns the meta object for class '{@link adaptorinterface.ServiceProvider <em>Service Provider</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service Provider</em>'.
     * @see adaptorinterface.ServiceProvider
     * @generated
     */
	EClass getServiceProvider();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.ServiceProvider#getTitle <em>Title</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Title</em>'.
     * @see adaptorinterface.ServiceProvider#getTitle()
     * @see #getServiceProvider()
     * @generated
     */
	EAttribute getServiceProvider_Title();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.ServiceProvider#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see adaptorinterface.ServiceProvider#getDescription()
     * @see #getServiceProvider()
     * @generated
     */
	EAttribute getServiceProvider_Description();

	/**
     * Returns the meta object for the containment reference '{@link adaptorinterface.ServiceProvider#getPublisher <em>Publisher</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Publisher</em>'.
     * @see adaptorinterface.ServiceProvider#getPublisher()
     * @see #getServiceProvider()
     * @generated
     */
	EReference getServiceProvider_Publisher();

	/**
     * Returns the meta object for the containment reference list '{@link adaptorinterface.ServiceProvider#getServices <em>Services</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Services</em>'.
     * @see adaptorinterface.ServiceProvider#getServices()
     * @see #getServiceProvider()
     * @generated
     */
	EReference getServiceProvider_Services();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.ServiceProvider#getServiceNamespace <em>Service Namespace</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Service Namespace</em>'.
     * @see adaptorinterface.ServiceProvider#getServiceNamespace()
     * @see #getServiceProvider()
     * @generated
     */
	EAttribute getServiceProvider_ServiceNamespace();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.ServiceProvider#getInstanceID <em>Instance ID</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Instance ID</em>'.
     * @see adaptorinterface.ServiceProvider#getInstanceID()
     * @see #getServiceProvider()
     * @generated
     */
	EAttribute getServiceProvider_InstanceID();

	/**
     * Returns the meta object for the containment reference '{@link adaptorinterface.ServiceProvider#getSourceBinding <em>Source Binding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Source Binding</em>'.
     * @see adaptorinterface.ServiceProvider#getSourceBinding()
     * @see #getServiceProvider()
     * @generated
     */
    EReference getServiceProvider_SourceBinding();

    /**
     * Returns the meta object for class '{@link adaptorinterface.Service <em>Service</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service</em>'.
     * @see adaptorinterface.Service
     * @generated
     */
	EClass getService();

	/**
     * Returns the meta object for the reference '{@link adaptorinterface.Service#getDomainSpecification <em>Domain Specification</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Domain Specification</em>'.
     * @see adaptorinterface.Service#getDomainSpecification()
     * @see #getService()
     * @generated
     */
	EReference getService_DomainSpecification();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.Service#getServiceNamespace <em>Service Namespace</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Service Namespace</em>'.
     * @see adaptorinterface.Service#getServiceNamespace()
     * @see #getService()
     * @generated
     */
	EAttribute getService_ServiceNamespace();

	/**
     * Returns the meta object for the containment reference list '{@link adaptorinterface.Service#getCreationFactories <em>Creation Factories</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Creation Factories</em>'.
     * @see adaptorinterface.Service#getCreationFactories()
     * @see #getService()
     * @generated
     */
	EReference getService_CreationFactories();

	/**
     * Returns the meta object for the containment reference list '{@link adaptorinterface.Service#getQueryCapabilities <em>Query Capabilities</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Query Capabilities</em>'.
     * @see adaptorinterface.Service#getQueryCapabilities()
     * @see #getService()
     * @generated
     */
	EReference getService_QueryCapabilities();

	/**
     * Returns the meta object for the containment reference list '{@link adaptorinterface.Service#getSelectionDialogs <em>Selection Dialogs</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Selection Dialogs</em>'.
     * @see adaptorinterface.Service#getSelectionDialogs()
     * @see #getService()
     * @generated
     */
	EReference getService_SelectionDialogs();

	/**
     * Returns the meta object for the containment reference list '{@link adaptorinterface.Service#getCreationDialogs <em>Creation Dialogs</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Creation Dialogs</em>'.
     * @see adaptorinterface.Service#getCreationDialogs()
     * @see #getService()
     * @generated
     */
	EReference getService_CreationDialogs();

	/**
     * Returns the meta object for the containment reference list '{@link adaptorinterface.Service#getBasicCapabilities <em>Basic Capabilities</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Basic Capabilities</em>'.
     * @see adaptorinterface.Service#getBasicCapabilities()
     * @see #getService()
     * @generated
     */
	EReference getService_BasicCapabilities();

	/**
     * Returns the meta object for the attribute list '{@link adaptorinterface.Service#getUsages <em>Usages</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Usages</em>'.
     * @see adaptorinterface.Service#getUsages()
     * @see #getService()
     * @generated
     */
	EAttribute getService_Usages();

	/**
     * Returns the meta object for the containment reference '{@link adaptorinterface.Service#getPersistence <em>Persistence</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Persistence</em>'.
     * @see adaptorinterface.Service#getPersistence()
     * @see #getService()
     * @generated
     */
    EReference getService_Persistence();

    /**
     * Returns the meta object for the containment reference '{@link adaptorinterface.Service#getSourceBinding <em>Source Binding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Source Binding</em>'.
     * @see adaptorinterface.Service#getSourceBinding()
     * @see #getService()
     * @generated
     */
    EReference getService_SourceBinding();

    /**
     * Returns the meta object for class '{@link adaptorinterface.WebService <em>Web Service</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Web Service</em>'.
     * @see adaptorinterface.WebService
     * @generated
     */
	EClass getWebService();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.WebService#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see adaptorinterface.WebService#getName()
     * @see #getWebService()
     * @generated
     */
	EAttribute getWebService_Name();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.WebService#getServiceUrlPattern <em>Service Url Pattern</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Service Url Pattern</em>'.
     * @see adaptorinterface.WebService#getServiceUrlPattern()
     * @see #getWebService()
     * @generated
     */
	EAttribute getWebService_ServiceUrlPattern();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.WebService#getResourceUrlPattern <em>Resource Url Pattern</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Resource Url Pattern</em>'.
     * @see adaptorinterface.WebService#getResourceUrlPattern()
     * @see #getWebService()
     * @generated
     */
	EAttribute getWebService_ResourceUrlPattern();

	/**
     * Returns the meta object for the reference list '{@link adaptorinterface.WebService#getResourceTypes <em>Resource Types</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Resource Types</em>'.
     * @see adaptorinterface.WebService#getResourceTypes()
     * @see #getWebService()
     * @generated
     */
	EReference getWebService_ResourceTypes();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.WebService#isRead <em>Read</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Read</em>'.
     * @see adaptorinterface.WebService#isRead()
     * @see #getWebService()
     * @generated
     */
	EAttribute getWebService_Read();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.WebService#isDelete <em>Delete</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Delete</em>'.
     * @see adaptorinterface.WebService#isDelete()
     * @see #getWebService()
     * @generated
     */
	EAttribute getWebService_Delete();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.WebService#isUpdate <em>Update</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Update</em>'.
     * @see adaptorinterface.WebService#isUpdate()
     * @see #getWebService()
     * @generated
     */
	EAttribute getWebService_Update();

	/**
     * Returns the meta object for the containment reference '{@link adaptorinterface.WebService#getPersistence <em>Persistence</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Persistence</em>'.
     * @see adaptorinterface.WebService#getPersistence()
     * @see #getWebService()
     * @generated
     */
    EReference getWebService_Persistence();

    /**
     * Returns the meta object for the containment reference '{@link adaptorinterface.WebService#getSourceBinding <em>Source Binding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Source Binding</em>'.
     * @see adaptorinterface.WebService#getSourceBinding()
     * @see #getWebService()
     * @generated
     */
    EReference getWebService_SourceBinding();

    /**
     * Returns the meta object for class '{@link adaptorinterface.TrsService <em>Trs Service</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Trs Service</em>'.
     * @see adaptorinterface.TrsService
     * @generated
     */
	EClass getTrsService();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.TrsService#getBasePageLimit <em>Base Page Limit</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Base Page Limit</em>'.
     * @see adaptorinterface.TrsService#getBasePageLimit()
     * @see #getTrsService()
     * @generated
     */
	EAttribute getTrsService_BasePageLimit();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.TrsService#getChangeLogPageLimit <em>Change Log Page Limit</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Change Log Page Limit</em>'.
     * @see adaptorinterface.TrsService#getChangeLogPageLimit()
     * @see #getTrsService()
     * @generated
     */
	EAttribute getTrsService_ChangeLogPageLimit();

	/**
     * Returns the meta object for class '{@link adaptorinterface.InmemPagedTrsService <em>Inmem Paged Trs Service</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Inmem Paged Trs Service</em>'.
     * @see adaptorinterface.InmemPagedTrsService
     * @generated
     */
	EClass getInmemPagedTrsService();

	/**
     * Returns the meta object for class '{@link adaptorinterface.Resource <em>Resource</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Resource</em>'.
     * @see adaptorinterface.Resource
     * @generated
     */
	EClass getResource();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.Resource#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see adaptorinterface.Resource#getId()
     * @see #getResource()
     * @generated
     */
    EAttribute getResource_Id();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.Resource#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see adaptorinterface.Resource#getName()
     * @see #getResource()
     * @generated
     */
	EAttribute getResource_Name();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.Resource#getTitle <em>Title</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Title</em>'.
     * @see adaptorinterface.Resource#getTitle()
     * @see #getResource()
     * @generated
     */
    EAttribute getResource_Title();

    /**
     * Returns the meta object for the attribute '{@link adaptorinterface.Resource#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see adaptorinterface.Resource#getDescription()
     * @see #getResource()
     * @generated
     */
    EAttribute getResource_Description();

    /**
     * Returns the meta object for the reference '{@link adaptorinterface.Resource#getDescribes <em>Describes</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Describes</em>'.
     * @see adaptorinterface.Resource#getDescribes()
     * @see #getResource()
     * @generated
     */
	EReference getResource_Describes();

	/**
     * Returns the meta object for the reference list '{@link adaptorinterface.Resource#getExtends <em>Extends</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Extends</em>'.
     * @see adaptorinterface.Resource#getExtends()
     * @see #getResource()
     * @generated
     */
	EReference getResource_Extends();

	/**
     * Returns the meta object for the reference list '{@link adaptorinterface.Resource#getResourceProperties <em>Resource Properties</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Resource Properties</em>'.
     * @see adaptorinterface.Resource#getResourceProperties()
     * @see #getResource()
     * @generated
     */
	EReference getResource_ResourceProperties();

	/**
     * Returns the meta object for the attribute list '{@link adaptorinterface.Resource#getAdditionalConstraints <em>Additional Constraints</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Additional Constraints</em>'.
     * @see adaptorinterface.Resource#getAdditionalConstraints()
     * @see #getResource()
     * @generated
     */
    EAttribute getResource_AdditionalConstraints();

    /**
     * Returns the meta object for the attribute '{@link adaptorinterface.Resource#getVocabularyComment <em>Vocabulary Comment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Vocabulary Comment</em>'.
     * @see adaptorinterface.Resource#getVocabularyComment()
     * @see #getResource()
     * @generated
     */
    EAttribute getResource_VocabularyComment();

    /**
     * Returns the meta object for class '{@link adaptorinterface.ResourceProperty <em>Resource Property</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Resource Property</em>'.
     * @see adaptorinterface.ResourceProperty
     * @generated
     */
	EClass getResourceProperty();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.ResourceProperty#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see adaptorinterface.ResourceProperty#getId()
     * @see #getResourceProperty()
     * @generated
     */
    EAttribute getResourceProperty_Id();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.ResourceProperty#getTitle <em>Title</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Title</em>'.
     * @see adaptorinterface.ResourceProperty#getTitle()
     * @see #getResourceProperty()
     * @generated
     */
	EAttribute getResourceProperty_Title();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.ResourceProperty#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see adaptorinterface.ResourceProperty#getName()
     * @see #getResourceProperty()
     * @generated
     */
	EAttribute getResourceProperty_Name();

	/**
     * Returns the meta object for the reference '{@link adaptorinterface.ResourceProperty#getPropertyDefinition <em>Property Definition</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Property Definition</em>'.
     * @see adaptorinterface.ResourceProperty#getPropertyDefinition()
     * @see #getResourceProperty()
     * @generated
     */
	EReference getResourceProperty_PropertyDefinition();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.ResourceProperty#getOccurs <em>Occurs</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Occurs</em>'.
     * @see adaptorinterface.ResourceProperty#getOccurs()
     * @see #getResourceProperty()
     * @generated
     */
	EAttribute getResourceProperty_Occurs();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.ResourceProperty#isReadOnly <em>Read Only</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Read Only</em>'.
     * @see adaptorinterface.ResourceProperty#isReadOnly()
     * @see #getResourceProperty()
     * @generated
     */
	EAttribute getResourceProperty_ReadOnly();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.ResourceProperty#getValueType <em>Value Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value Type</em>'.
     * @see adaptorinterface.ResourceProperty#getValueType()
     * @see #getResourceProperty()
     * @generated
     */
	EAttribute getResourceProperty_ValueType();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.ResourceProperty#getRepresentation <em>Representation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Representation</em>'.
     * @see adaptorinterface.ResourceProperty#getRepresentation()
     * @see #getResourceProperty()
     * @generated
     */
	EAttribute getResourceProperty_Representation();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.ResourceProperty#getMultiValueRepresentation <em>Multi Value Representation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Multi Value Representation</em>'.
     * @see adaptorinterface.ResourceProperty#getMultiValueRepresentation()
     * @see #getResourceProperty()
     * @generated
     */
	EAttribute getResourceProperty_MultiValueRepresentation();

	/**
     * Returns the meta object for the reference list '{@link adaptorinterface.ResourceProperty#getRange <em>Range</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Range</em>'.
     * @see adaptorinterface.ResourceProperty#getRange()
     * @see #getResourceProperty()
     * @generated
     */
	EReference getResourceProperty_Range();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.ResourceProperty#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see adaptorinterface.ResourceProperty#getDescription()
     * @see #getResourceProperty()
     * @generated
     */
	EAttribute getResourceProperty_Description();

	/**
     * Returns the meta object for the attribute list '{@link adaptorinterface.ResourceProperty#getAllowedValue <em>Allowed Value</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Allowed Value</em>'.
     * @see adaptorinterface.ResourceProperty#getAllowedValue()
     * @see #getResourceProperty()
     * @generated
     */
	EAttribute getResourceProperty_AllowedValue();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.ResourceProperty#getIsMemberProperty <em>Is Member Property</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Member Property</em>'.
     * @see adaptorinterface.ResourceProperty#getIsMemberProperty()
     * @see #getResourceProperty()
     * @generated
     */
	EAttribute getResourceProperty_IsMemberProperty();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.ResourceProperty#getAdditionalConstraints <em>Additional Constraints</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Additional Constraints</em>'.
     * @see adaptorinterface.ResourceProperty#getAdditionalConstraints()
     * @see #getResourceProperty()
     * @generated
     */
    EAttribute getResourceProperty_AdditionalConstraints();

    /**
     * Returns the meta object for the attribute '{@link adaptorinterface.ResourceProperty#getVocabularyComment <em>Vocabulary Comment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Vocabulary Comment</em>'.
     * @see adaptorinterface.ResourceProperty#getVocabularyComment()
     * @see #getResourceProperty()
     * @generated
     */
    EAttribute getResourceProperty_VocabularyComment();

    /**
     * Returns the meta object for class '{@link adaptorinterface.CreationFactory <em>Creation Factory</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Creation Factory</em>'.
     * @see adaptorinterface.CreationFactory
     * @generated
     */
	EClass getCreationFactory();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.CreationFactory#getTitle <em>Title</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Title</em>'.
     * @see adaptorinterface.CreationFactory#getTitle()
     * @see #getCreationFactory()
     * @generated
     */
	EAttribute getCreationFactory_Title();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.CreationFactory#getLabel <em>Label</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Label</em>'.
     * @see adaptorinterface.CreationFactory#getLabel()
     * @see #getCreationFactory()
     * @generated
     */
	EAttribute getCreationFactory_Label();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.CreationFactory#getCreationURI <em>Creation URI</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Creation URI</em>'.
     * @see adaptorinterface.CreationFactory#getCreationURI()
     * @see #getCreationFactory()
     * @generated
     */
	EAttribute getCreationFactory_CreationURI();

	/**
     * Returns the meta object for the reference list '{@link adaptorinterface.CreationFactory#getResourceTypes <em>Resource Types</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Resource Types</em>'.
     * @see adaptorinterface.CreationFactory#getResourceTypes()
     * @see #getCreationFactory()
     * @generated
     */
	EReference getCreationFactory_ResourceTypes();

	/**
     * Returns the meta object for the attribute list '{@link adaptorinterface.CreationFactory#getUsages <em>Usages</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Usages</em>'.
     * @see adaptorinterface.CreationFactory#getUsages()
     * @see #getCreationFactory()
     * @generated
     */
	EAttribute getCreationFactory_Usages();

	/**
     * Returns the meta object for class '{@link adaptorinterface.QueryCapability <em>Query Capability</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Query Capability</em>'.
     * @see adaptorinterface.QueryCapability
     * @generated
     */
	EClass getQueryCapability();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.QueryCapability#getTitle <em>Title</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Title</em>'.
     * @see adaptorinterface.QueryCapability#getTitle()
     * @see #getQueryCapability()
     * @generated
     */
	EAttribute getQueryCapability_Title();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.QueryCapability#getLabel <em>Label</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Label</em>'.
     * @see adaptorinterface.QueryCapability#getLabel()
     * @see #getQueryCapability()
     * @generated
     */
	EAttribute getQueryCapability_Label();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.QueryCapability#getQueryBaseURI <em>Query Base URI</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Query Base URI</em>'.
     * @see adaptorinterface.QueryCapability#getQueryBaseURI()
     * @see #getQueryCapability()
     * @generated
     */
	EAttribute getQueryCapability_QueryBaseURI();

	/**
     * Returns the meta object for the reference list '{@link adaptorinterface.QueryCapability#getResourceTypes <em>Resource Types</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Resource Types</em>'.
     * @see adaptorinterface.QueryCapability#getResourceTypes()
     * @see #getQueryCapability()
     * @generated
     */
	EReference getQueryCapability_ResourceTypes();

	/**
     * Returns the meta object for the attribute list '{@link adaptorinterface.QueryCapability#getUsages <em>Usages</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Usages</em>'.
     * @see adaptorinterface.QueryCapability#getUsages()
     * @see #getQueryCapability()
     * @generated
     */
	EAttribute getQueryCapability_Usages();

	/**
     * Returns the meta object for class '{@link adaptorinterface.BasicCapability <em>Basic Capability</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Basic Capability</em>'.
     * @see adaptorinterface.BasicCapability
     * @generated
     */
	EClass getBasicCapability();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.BasicCapability#getInstanceID <em>Instance ID</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Instance ID</em>'.
     * @see adaptorinterface.BasicCapability#getInstanceID()
     * @see #getBasicCapability()
     * @generated
     */
	EAttribute getBasicCapability_InstanceID();

	/**
     * Returns the meta object for the reference list '{@link adaptorinterface.BasicCapability#getResourceTypes <em>Resource Types</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Resource Types</em>'.
     * @see adaptorinterface.BasicCapability#getResourceTypes()
     * @see #getBasicCapability()
     * @generated
     */
	EReference getBasicCapability_ResourceTypes();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.BasicCapability#isRead <em>Read</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Read</em>'.
     * @see adaptorinterface.BasicCapability#isRead()
     * @see #getBasicCapability()
     * @generated
     */
	EAttribute getBasicCapability_Read();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.BasicCapability#isDelete <em>Delete</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Delete</em>'.
     * @see adaptorinterface.BasicCapability#isDelete()
     * @see #getBasicCapability()
     * @generated
     */
	EAttribute getBasicCapability_Delete();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.BasicCapability#isUpdate <em>Update</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Update</em>'.
     * @see adaptorinterface.BasicCapability#isUpdate()
     * @see #getBasicCapability()
     * @generated
     */
	EAttribute getBasicCapability_Update();

	/**
     * Returns the meta object for class '{@link adaptorinterface.Dialog <em>Dialog</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dialog</em>'.
     * @see adaptorinterface.Dialog
     * @generated
     */
	EClass getDialog();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.Dialog#getTitle <em>Title</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Title</em>'.
     * @see adaptorinterface.Dialog#getTitle()
     * @see #getDialog()
     * @generated
     */
	EAttribute getDialog_Title();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.Dialog#getLabel <em>Label</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Label</em>'.
     * @see adaptorinterface.Dialog#getLabel()
     * @see #getDialog()
     * @generated
     */
	EAttribute getDialog_Label();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.Dialog#getDialogURI <em>Dialog URI</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Dialog URI</em>'.
     * @see adaptorinterface.Dialog#getDialogURI()
     * @see #getDialog()
     * @generated
     */
	EAttribute getDialog_DialogURI();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.Dialog#getHintWidth <em>Hint Width</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Hint Width</em>'.
     * @see adaptorinterface.Dialog#getHintWidth()
     * @see #getDialog()
     * @generated
     */
	EAttribute getDialog_HintWidth();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.Dialog#getHintHeight <em>Hint Height</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Hint Height</em>'.
     * @see adaptorinterface.Dialog#getHintHeight()
     * @see #getDialog()
     * @generated
     */
	EAttribute getDialog_HintHeight();

	/**
     * Returns the meta object for the reference list '{@link adaptorinterface.Dialog#getResourceTypes <em>Resource Types</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Resource Types</em>'.
     * @see adaptorinterface.Dialog#getResourceTypes()
     * @see #getDialog()
     * @generated
     */
	EReference getDialog_ResourceTypes();

	/**
     * Returns the meta object for the attribute list '{@link adaptorinterface.Dialog#getUsages <em>Usages</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Usages</em>'.
     * @see adaptorinterface.Dialog#getUsages()
     * @see #getDialog()
     * @generated
     */
	EAttribute getDialog_Usages();

	/**
     * Returns the meta object for class '{@link adaptorinterface.Publisher <em>Publisher</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Publisher</em>'.
     * @see adaptorinterface.Publisher
     * @generated
     */
	EClass getPublisher();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.Publisher#getTitle <em>Title</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Title</em>'.
     * @see adaptorinterface.Publisher#getTitle()
     * @see #getPublisher()
     * @generated
     */
	EAttribute getPublisher_Title();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.Publisher#getLabel <em>Label</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Label</em>'.
     * @see adaptorinterface.Publisher#getLabel()
     * @see #getPublisher()
     * @generated
     */
	EAttribute getPublisher_Label();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.Publisher#getIdentifier <em>Identifier</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Identifier</em>'.
     * @see adaptorinterface.Publisher#getIdentifier()
     * @see #getPublisher()
     * @generated
     */
	EAttribute getPublisher_Identifier();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.Publisher#getIcon <em>Icon</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Icon</em>'.
     * @see adaptorinterface.Publisher#getIcon()
     * @see #getPublisher()
     * @generated
     */
	EAttribute getPublisher_Icon();

	/**
     * Returns the meta object for class '{@link adaptorinterface.RequiredAdaptor <em>Required Adaptor</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Required Adaptor</em>'.
     * @see adaptorinterface.RequiredAdaptor
     * @generated
     */
	EClass getRequiredAdaptor();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.RequiredAdaptor#getServiceProviderCatalogURI <em>Service Provider Catalog URI</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Service Provider Catalog URI</em>'.
     * @see adaptorinterface.RequiredAdaptor#getServiceProviderCatalogURI()
     * @see #getRequiredAdaptor()
     * @generated
     */
	EAttribute getRequiredAdaptor_ServiceProviderCatalogURI();

	/**
     * Returns the meta object for class '{@link adaptorinterface.GenericRequiredAdaptor <em>Generic Required Adaptor</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Generic Required Adaptor</em>'.
     * @see adaptorinterface.GenericRequiredAdaptor
     * @generated
     */
	EClass getGenericRequiredAdaptor();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.GenericRequiredAdaptor#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see adaptorinterface.GenericRequiredAdaptor#getName()
     * @see #getGenericRequiredAdaptor()
     * @generated
     */
	EAttribute getGenericRequiredAdaptor_Name();

	/**
     * Returns the meta object for the reference list '{@link adaptorinterface.GenericRequiredAdaptor#getServicedResources <em>Serviced Resources</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Serviced Resources</em>'.
     * @see adaptorinterface.GenericRequiredAdaptor#getServicedResources()
     * @see #getGenericRequiredAdaptor()
     * @generated
     */
	EReference getGenericRequiredAdaptor_ServicedResources();

	/**
     * Returns the meta object for class '{@link adaptorinterface.ModelledRequiredAdaptor <em>Modelled Required Adaptor</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Modelled Required Adaptor</em>'.
     * @see adaptorinterface.ModelledRequiredAdaptor
     * @generated
     */
	EClass getModelledRequiredAdaptor();

	/**
     * Returns the meta object for the reference '{@link adaptorinterface.ModelledRequiredAdaptor#getAdaptorInterface <em>Adaptor Interface</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Adaptor Interface</em>'.
     * @see adaptorinterface.ModelledRequiredAdaptor#getAdaptorInterface()
     * @see #getModelledRequiredAdaptor()
     * @generated
     */
	EReference getModelledRequiredAdaptor_AdaptorInterface();

	/**
     * Returns the meta object for class '{@link adaptorinterface.GenerationSetting <em>Generation Setting</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Generation Setting</em>'.
     * @see adaptorinterface.GenerationSetting
     * @generated
     */
	EClass getGenerationSetting();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.GenerationSetting#getJavaClassPackageName <em>Java Class Package Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Java Class Package Name</em>'.
     * @see adaptorinterface.GenerationSetting#getJavaClassPackageName()
     * @see #getGenerationSetting()
     * @generated
     */
	EAttribute getGenerationSetting_JavaClassPackageName();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.GenerationSetting#getJavaFilesPath <em>Java Files Path</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Java Files Path</em>'.
     * @see adaptorinterface.GenerationSetting#getJavaFilesPath()
     * @see #getGenerationSetting()
     * @generated
     */
	EAttribute getGenerationSetting_JavaFilesPath();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.GenerationSetting#isDoNotGenerate <em>Do Not Generate</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Do Not Generate</em>'.
     * @see adaptorinterface.GenerationSetting#isDoNotGenerate()
     * @see #getGenerationSetting()
     * @generated
     */
	EAttribute getGenerationSetting_DoNotGenerate();

	/**
     * Returns the meta object for class '{@link adaptorinterface.Shape <em>Shape</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Shape</em>'.
     * @see adaptorinterface.Shape
     * @generated
     */
	EClass getShape();

	/**
     * Returns the meta object for class '{@link adaptorinterface.ShaclShape <em>Shacl Shape</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Shacl Shape</em>'.
     * @see adaptorinterface.ShaclShape
     * @generated
     */
	EClass getShaclShape();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.ShaclShape#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see adaptorinterface.ShaclShape#getName()
     * @see #getShaclShape()
     * @generated
     */
	EAttribute getShaclShape_Name();

	/**
     * Returns the meta object for the reference '{@link adaptorinterface.ShaclShape#getTargetClass <em>Target Class</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target Class</em>'.
     * @see adaptorinterface.ShaclShape#getTargetClass()
     * @see #getShaclShape()
     * @generated
     */
	EReference getShaclShape_TargetClass();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.ShaclShape#isClosed <em>Closed</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Closed</em>'.
     * @see adaptorinterface.ShaclShape#isClosed()
     * @see #getShaclShape()
     * @generated
     */
	EAttribute getShaclShape_Closed();

	/**
     * Returns the meta object for the reference list '{@link adaptorinterface.ShaclShape#getShaclProperties <em>Shacl Properties</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Shacl Properties</em>'.
     * @see adaptorinterface.ShaclShape#getShaclProperties()
     * @see #getShaclShape()
     * @generated
     */
	EReference getShaclShape_ShaclProperties();

	/**
     * Returns the meta object for the reference list '{@link adaptorinterface.ShaclShape#getExtends <em>Extends</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Extends</em>'.
     * @see adaptorinterface.ShaclShape#getExtends()
     * @see #getShaclShape()
     * @generated
     */
	EReference getShaclShape_Extends();

	/**
     * Returns the meta object for class '{@link adaptorinterface.ShapeProperty <em>Shape Property</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Shape Property</em>'.
     * @see adaptorinterface.ShapeProperty
     * @generated
     */
	EClass getShapeProperty();

	/**
     * Returns the meta object for class '{@link adaptorinterface.ShaclProperty <em>Shacl Property</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Shacl Property</em>'.
     * @see adaptorinterface.ShaclProperty
     * @generated
     */
	EClass getShaclProperty();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.ShaclProperty#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see adaptorinterface.ShaclProperty#getName()
     * @see #getShaclProperty()
     * @generated
     */
	EAttribute getShaclProperty_Name();

	/**
     * Returns the meta object for the reference '{@link adaptorinterface.ShaclProperty#getPath <em>Path</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Path</em>'.
     * @see adaptorinterface.ShaclProperty#getPath()
     * @see #getShaclProperty()
     * @generated
     */
	EReference getShaclProperty_Path();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.ShaclProperty#getMinCount <em>Min Count</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Min Count</em>'.
     * @see adaptorinterface.ShaclProperty#getMinCount()
     * @see #getShaclProperty()
     * @generated
     */
	EAttribute getShaclProperty_MinCount();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.ShaclProperty#getMaxCount <em>Max Count</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Count</em>'.
     * @see adaptorinterface.ShaclProperty#getMaxCount()
     * @see #getShaclProperty()
     * @generated
     */
	EAttribute getShaclProperty_MaxCount();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.ShaclProperty#getDataType <em>Data Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Data Type</em>'.
     * @see adaptorinterface.ShaclProperty#getDataType()
     * @see #getShaclProperty()
     * @generated
     */
	EAttribute getShaclProperty_DataType();

	/**
     * Returns the meta object for the reference list '{@link adaptorinterface.ShaclProperty#getClass_ <em>Class</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Class</em>'.
     * @see adaptorinterface.ShaclProperty#getClass_()
     * @see #getShaclProperty()
     * @generated
     */
	EReference getShaclProperty_Class();

	/**
     * Returns the meta object for class '{@link adaptorinterface.Configuration <em>Configuration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Configuration</em>'.
     * @see adaptorinterface.Configuration
     * @generated
     */
    EClass getConfiguration();

    /**
     * Returns the meta object for class '{@link adaptorinterface.AuthenticationConfiguration <em>Authentication Configuration</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Authentication Configuration</em>'.
     * @see adaptorinterface.AuthenticationConfiguration
     * @generated
     */
	EClass getAuthenticationConfiguration();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.AuthenticationConfiguration#getApplicationName <em>Application Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Application Name</em>'.
     * @see adaptorinterface.AuthenticationConfiguration#getApplicationName()
     * @see #getAuthenticationConfiguration()
     * @generated
     */
	EAttribute getAuthenticationConfiguration_ApplicationName();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.AuthenticationConfiguration#getOauthRealm <em>Oauth Realm</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Oauth Realm</em>'.
     * @see adaptorinterface.AuthenticationConfiguration#getOauthRealm()
     * @see #getAuthenticationConfiguration()
     * @generated
     */
	EAttribute getAuthenticationConfiguration_OauthRealm();

	/**
     * Returns the meta object for class '{@link adaptorinterface.GeneralConfiguration <em>General Configuration</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>General Configuration</em>'.
     * @see adaptorinterface.GeneralConfiguration
     * @generated
     */
	EClass getGeneralConfiguration();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.GeneralConfiguration#isDoNotGenerate <em>Do Not Generate</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Do Not Generate</em>'.
     * @see adaptorinterface.GeneralConfiguration#isDoNotGenerate()
     * @see #getGeneralConfiguration()
     * @generated
     */
	EAttribute getGeneralConfiguration_DoNotGenerate();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.GeneralConfiguration#isDoNotGenerateFromImportedModels <em>Do Not Generate From Imported Models</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Do Not Generate From Imported Models</em>'.
     * @see adaptorinterface.GeneralConfiguration#isDoNotGenerateFromImportedModels()
     * @see #getGeneralConfiguration()
     * @generated
     */
    EAttribute getGeneralConfiguration_DoNotGenerateFromImportedModels();

    /**
     * Returns the meta object for the attribute '{@link adaptorinterface.GeneralConfiguration#getFilesBasePath <em>Files Base Path</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Files Base Path</em>'.
     * @see adaptorinterface.GeneralConfiguration#getFilesBasePath()
     * @see #getGeneralConfiguration()
     * @generated
     */
	EAttribute getGeneralConfiguration_FilesBasePath();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.GeneralConfiguration#getJavaBasePackageName <em>Java Base Package Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Java Base Package Name</em>'.
     * @see adaptorinterface.GeneralConfiguration#getJavaBasePackageName()
     * @see #getGeneralConfiguration()
     * @generated
     */
	EAttribute getGeneralConfiguration_JavaBasePackageName();

	/**
     * Returns the meta object for class '{@link adaptorinterface.ProjectConfiguration <em>Project Configuration</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Project Configuration</em>'.
     * @see adaptorinterface.ProjectConfiguration
     * @generated
     */
	EClass getProjectConfiguration();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.ProjectConfiguration#isDoNotGenerateProjectConfigurationFiles <em>Do Not Generate Project Configuration Files</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Do Not Generate Project Configuration Files</em>'.
     * @see adaptorinterface.ProjectConfiguration#isDoNotGenerateProjectConfigurationFiles()
     * @see #getProjectConfiguration()
     * @generated
     */
	EAttribute getProjectConfiguration_DoNotGenerateProjectConfigurationFiles();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.ProjectConfiguration#getLyoVersion <em>Lyo Version</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Lyo Version</em>'.
     * @see adaptorinterface.ProjectConfiguration#getLyoVersion()
     * @see #getProjectConfiguration()
     * @generated
     */
	EAttribute getProjectConfiguration_LyoVersion();

	/**
     * Returns the meta object for class '{@link adaptorinterface.ServerConfiguration <em>Server Configuration</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Server Configuration</em>'.
     * @see adaptorinterface.ServerConfiguration
     * @generated
     */
	EClass getServerConfiguration();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.ServerConfiguration#getRootServerBaseUrl <em>Root Server Base Url</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Root Server Base Url</em>'.
     * @see adaptorinterface.ServerConfiguration#getRootServerBaseUrl()
     * @see #getServerConfiguration()
     * @generated
     */
	EAttribute getServerConfiguration_RootServerBaseUrl();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.ServerConfiguration#getApplicationContextPath <em>Application Context Path</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Application Context Path</em>'.
     * @see adaptorinterface.ServerConfiguration#getApplicationContextPath()
     * @see #getServerConfiguration()
     * @generated
     */
	EAttribute getServerConfiguration_ApplicationContextPath();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.ServerConfiguration#getServletUrlPattern <em>Servlet Url Pattern</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Servlet Url Pattern</em>'.
     * @see adaptorinterface.ServerConfiguration#getServletUrlPattern()
     * @see #getServerConfiguration()
     * @generated
     */
	EAttribute getServerConfiguration_ServletUrlPattern();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.ServerConfiguration#isDoNotRegenerateJspFiles <em>Do Not Regenerate Jsp Files</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Do Not Regenerate Jsp Files</em>'.
     * @see adaptorinterface.ServerConfiguration#isDoNotRegenerateJspFiles()
     * @see #getServerConfiguration()
     * @generated
     */
	EAttribute getServerConfiguration_DoNotRegenerateJspFiles();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.ServerConfiguration#isGenerateJspFilesForOslcUI <em>Generate Jsp Files For Oslc UI</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Generate Jsp Files For Oslc UI</em>'.
     * @see adaptorinterface.ServerConfiguration#isGenerateJspFilesForOslcUI()
     * @see #getServerConfiguration()
     * @generated
     */
    EAttribute getServerConfiguration_GenerateJspFilesForOslcUI();

    /**
     * Returns the meta object for the containment reference '{@link adaptorinterface.ServerConfiguration#getGeneralConfiguration <em>General Configuration</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>General Configuration</em>'.
     * @see adaptorinterface.ServerConfiguration#getGeneralConfiguration()
     * @see #getServerConfiguration()
     * @generated
     */
	EReference getServerConfiguration_GeneralConfiguration();

	/**
     * Returns the meta object for the containment reference '{@link adaptorinterface.ServerConfiguration#getProjectConfiguration <em>Project Configuration</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Project Configuration</em>'.
     * @see adaptorinterface.ServerConfiguration#getProjectConfiguration()
     * @see #getServerConfiguration()
     * @generated
     */
	EReference getServerConfiguration_ProjectConfiguration();

	/**
     * Returns the meta object for the containment reference '{@link adaptorinterface.ServerConfiguration#getAuthenticationConfiguration <em>Authentication Configuration</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Authentication Configuration</em>'.
     * @see adaptorinterface.ServerConfiguration#getAuthenticationConfiguration()
     * @see #getServerConfiguration()
     * @generated
     */
	EReference getServerConfiguration_AuthenticationConfiguration();

	/**
     * Returns the meta object for the containment reference list '{@link adaptorinterface.ServerConfiguration#getConfigurations <em>Configurations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Configurations</em>'.
     * @see adaptorinterface.ServerConfiguration#getConfigurations()
     * @see #getServerConfiguration()
     * @generated
     */
    EReference getServerConfiguration_Configurations();

    /**
     * Returns the meta object for class '{@link adaptorinterface.SpecificationConfiguration <em>Specification Configuration</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Specification Configuration</em>'.
     * @see adaptorinterface.SpecificationConfiguration
     * @generated
     */
	EClass getSpecificationConfiguration();

	/**
     * Returns the meta object for the containment reference '{@link adaptorinterface.SpecificationConfiguration#getGeneralConfiguration <em>General Configuration</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>General Configuration</em>'.
     * @see adaptorinterface.SpecificationConfiguration#getGeneralConfiguration()
     * @see #getSpecificationConfiguration()
     * @generated
     */
	EReference getSpecificationConfiguration_GeneralConfiguration();

	/**
     * Returns the meta object for the containment reference '{@link adaptorinterface.SpecificationConfiguration#getProjectConfiguration <em>Project Configuration</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Project Configuration</em>'.
     * @see adaptorinterface.SpecificationConfiguration#getProjectConfiguration()
     * @see #getSpecificationConfiguration()
     * @generated
     */
	EReference getSpecificationConfiguration_ProjectConfiguration();

	/**
     * Returns the meta object for class '{@link adaptorinterface.MavenProjectConfiguration <em>Maven Project Configuration</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Maven Project Configuration</em>'.
     * @see adaptorinterface.MavenProjectConfiguration
     * @generated
     */
	EClass getMavenProjectConfiguration();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.MavenProjectConfiguration#getGroupId <em>Group Id</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Group Id</em>'.
     * @see adaptorinterface.MavenProjectConfiguration#getGroupId()
     * @see #getMavenProjectConfiguration()
     * @generated
     */
	EAttribute getMavenProjectConfiguration_GroupId();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.MavenProjectConfiguration#getArtifactId <em>Artifact Id</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Artifact Id</em>'.
     * @see adaptorinterface.MavenProjectConfiguration#getArtifactId()
     * @see #getMavenProjectConfiguration()
     * @generated
     */
	EAttribute getMavenProjectConfiguration_ArtifactId();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.MavenProjectConfiguration#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see adaptorinterface.MavenProjectConfiguration#getVersion()
     * @see #getMavenProjectConfiguration()
     * @generated
     */
	EAttribute getMavenProjectConfiguration_Version();

	/**
     * Returns the meta object for class '{@link adaptorinterface.MavenServerConfiguration <em>Maven Server Configuration</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Maven Server Configuration</em>'.
     * @see adaptorinterface.MavenServerConfiguration
     * @generated
     */
	EClass getMavenServerConfiguration();

	/**
     * Returns the meta object for the attribute '{@link adaptorinterface.MavenServerConfiguration#getJettyPort <em>Jetty Port</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Jetty Port</em>'.
     * @see adaptorinterface.MavenServerConfiguration#getJettyPort()
     * @see #getMavenServerConfiguration()
     * @generated
     */
	EAttribute getMavenServerConfiguration_JettyPort();

	/**
     * Returns the meta object for class '{@link adaptorinterface.MavenSpecificationConfiguration <em>Maven Specification Configuration</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Maven Specification Configuration</em>'.
     * @see adaptorinterface.MavenSpecificationConfiguration
     * @generated
     */
	EClass getMavenSpecificationConfiguration();

	/**
     * Returns the meta object for class '{@link adaptorinterface.Source <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Source</em>'.
     * @see adaptorinterface.Source
     * @generated
     */
    EClass getSource();

    /**
     * Returns the meta object for the attribute '{@link adaptorinterface.Source#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see adaptorinterface.Source#getName()
     * @see #getSource()
     * @generated
     */
    EAttribute getSource_Name();

    /**
     * Returns the meta object for class '{@link adaptorinterface.Store <em>Store</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Store</em>'.
     * @see adaptorinterface.Store
     * @generated
     */
    EClass getStore();

    /**
     * Returns the meta object for the attribute '{@link adaptorinterface.Store#getDefaultNamedGraph <em>Default Named Graph</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Named Graph</em>'.
     * @see adaptorinterface.Store#getDefaultNamedGraph()
     * @see #getStore()
     * @generated
     */
    EAttribute getStore_DefaultNamedGraph();

    /**
     * Returns the meta object for the attribute '{@link adaptorinterface.Store#getSparqlQueryEndpoint <em>Sparql Query Endpoint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Sparql Query Endpoint</em>'.
     * @see adaptorinterface.Store#getSparqlQueryEndpoint()
     * @see #getStore()
     * @generated
     */
    EAttribute getStore_SparqlQueryEndpoint();

    /**
     * Returns the meta object for the attribute '{@link adaptorinterface.Store#getSparqlUpdateEndpoint <em>Sparql Update Endpoint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Sparql Update Endpoint</em>'.
     * @see adaptorinterface.Store#getSparqlUpdateEndpoint()
     * @see #getStore()
     * @generated
     */
    EAttribute getStore_SparqlUpdateEndpoint();

    /**
     * Returns the meta object for the attribute '{@link adaptorinterface.Store#getInitialPoolSize <em>Initial Pool Size</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Initial Pool Size</em>'.
     * @see adaptorinterface.Store#getInitialPoolSize()
     * @see #getStore()
     * @generated
     */
    EAttribute getStore_InitialPoolSize();

    /**
     * Returns the meta object for class '{@link adaptorinterface.StoreWithAuthentication <em>Store With Authentication</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Store With Authentication</em>'.
     * @see adaptorinterface.StoreWithAuthentication
     * @generated
     */
    EClass getStoreWithAuthentication();

    /**
     * Returns the meta object for the attribute '{@link adaptorinterface.StoreWithAuthentication#getUsername <em>Username</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Username</em>'.
     * @see adaptorinterface.StoreWithAuthentication#getUsername()
     * @see #getStoreWithAuthentication()
     * @generated
     */
    EAttribute getStoreWithAuthentication_Username();

    /**
     * Returns the meta object for the attribute '{@link adaptorinterface.StoreWithAuthentication#getPassword <em>Password</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Password</em>'.
     * @see adaptorinterface.StoreWithAuthentication#getPassword()
     * @see #getStoreWithAuthentication()
     * @generated
     */
    EAttribute getStoreWithAuthentication_Password();

    /**
     * Returns the meta object for class '{@link adaptorinterface.SourceBinding <em>Source Binding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Source Binding</em>'.
     * @see adaptorinterface.SourceBinding
     * @generated
     */
    EClass getSourceBinding();

    /**
     * Returns the meta object for the reference '{@link adaptorinterface.SourceBinding#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Source</em>'.
     * @see adaptorinterface.SourceBinding#getSource()
     * @see #getSourceBinding()
     * @generated
     */
    EReference getSourceBinding_Source();

    /**
     * Returns the meta object for class '{@link adaptorinterface.ServicePersistence <em>Service Persistence</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service Persistence</em>'.
     * @see adaptorinterface.ServicePersistence
     * @generated
     */
    EClass getServicePersistence();

    /**
     * Returns the meta object for the reference '{@link adaptorinterface.ServicePersistence#getStore <em>Store</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Store</em>'.
     * @see adaptorinterface.ServicePersistence#getStore()
     * @see #getServicePersistence()
     * @generated
     */
    EReference getServicePersistence_Store();

    /**
     * Returns the meta object for class '{@link adaptorinterface.OSLCServicePersistence <em>OSLC Service Persistence</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>OSLC Service Persistence</em>'.
     * @see adaptorinterface.OSLCServicePersistence
     * @generated
     */
    EClass getOSLCServicePersistence();

    /**
     * Returns the meta object for the attribute '{@link adaptorinterface.OSLCServicePersistence#isCreationFactory <em>Creation Factory</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Creation Factory</em>'.
     * @see adaptorinterface.OSLCServicePersistence#isCreationFactory()
     * @see #getOSLCServicePersistence()
     * @generated
     */
    EAttribute getOSLCServicePersistence_CreationFactory();

    /**
     * Returns the meta object for the attribute '{@link adaptorinterface.OSLCServicePersistence#isQueryCapability <em>Query Capability</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Query Capability</em>'.
     * @see adaptorinterface.OSLCServicePersistence#isQueryCapability()
     * @see #getOSLCServicePersistence()
     * @generated
     */
    EAttribute getOSLCServicePersistence_QueryCapability();

    /**
     * Returns the meta object for the attribute '{@link adaptorinterface.OSLCServicePersistence#isSelectionDialog <em>Selection Dialog</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Selection Dialog</em>'.
     * @see adaptorinterface.OSLCServicePersistence#isSelectionDialog()
     * @see #getOSLCServicePersistence()
     * @generated
     */
    EAttribute getOSLCServicePersistence_SelectionDialog();

    /**
     * Returns the meta object for the attribute '{@link adaptorinterface.OSLCServicePersistence#isCreationDialog <em>Creation Dialog</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Creation Dialog</em>'.
     * @see adaptorinterface.OSLCServicePersistence#isCreationDialog()
     * @see #getOSLCServicePersistence()
     * @generated
     */
    EAttribute getOSLCServicePersistence_CreationDialog();

    /**
     * Returns the meta object for class '{@link adaptorinterface.WebServicePersistence <em>Web Service Persistence</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Web Service Persistence</em>'.
     * @see adaptorinterface.WebServicePersistence
     * @generated
     */
    EClass getWebServicePersistence();

    /**
     * Returns the meta object for the attribute '{@link adaptorinterface.WebServicePersistence#isRead <em>Read</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Read</em>'.
     * @see adaptorinterface.WebServicePersistence#isRead()
     * @see #getWebServicePersistence()
     * @generated
     */
    EAttribute getWebServicePersistence_Read();

    /**
     * Returns the meta object for the attribute '{@link adaptorinterface.WebServicePersistence#isDelete <em>Delete</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Delete</em>'.
     * @see adaptorinterface.WebServicePersistence#isDelete()
     * @see #getWebServicePersistence()
     * @generated
     */
    EAttribute getWebServicePersistence_Delete();

    /**
     * Returns the meta object for the attribute '{@link adaptorinterface.WebServicePersistence#isUpdate <em>Update</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Update</em>'.
     * @see adaptorinterface.WebServicePersistence#isUpdate()
     * @see #getWebServicePersistence()
     * @generated
     */
    EAttribute getWebServicePersistence_Update();

    /**
     * Returns the meta object for enum '{@link adaptorinterface.ResourcePropertyOccurs <em>Resource Property Occurs</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Resource Property Occurs</em>'.
     * @see adaptorinterface.ResourcePropertyOccurs
     * @generated
     */
	EEnum getResourcePropertyOccurs();

	/**
     * Returns the meta object for enum '{@link adaptorinterface.ResourcePropertyValueType <em>Resource Property Value Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Resource Property Value Type</em>'.
     * @see adaptorinterface.ResourcePropertyValueType
     * @generated
     */
	EEnum getResourcePropertyValueType();

	/**
     * Returns the meta object for enum '{@link adaptorinterface.ResourcePropertyRepresentation <em>Resource Property Representation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Resource Property Representation</em>'.
     * @see adaptorinterface.ResourcePropertyRepresentation
     * @generated
     */
	EEnum getResourcePropertyRepresentation();

	/**
     * Returns the meta object for enum '{@link adaptorinterface.ResourcePropertyIsMemberProperty <em>Resource Property Is Member Property</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Resource Property Is Member Property</em>'.
     * @see adaptorinterface.ResourcePropertyIsMemberProperty
     * @generated
     */
	EEnum getResourcePropertyIsMemberProperty();

	/**
     * Returns the meta object for enum '{@link adaptorinterface.ResourcePropertyMultiValueRepresentation <em>Resource Property Multi Value Representation</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Resource Property Multi Value Representation</em>'.
     * @see adaptorinterface.ResourcePropertyMultiValueRepresentation
     * @generated
     */
	EEnum getResourcePropertyMultiValueRepresentation();

	/**
     * Returns the meta object for enum '{@link adaptorinterface.ResourceServiceNamespace <em>Resource Service Namespace</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Resource Service Namespace</em>'.
     * @see adaptorinterface.ResourceServiceNamespace
     * @generated
     */
	EEnum getResourceServiceNamespace();

	/**
     * Returns the meta object for enum '{@link adaptorinterface.ShaclPropertyDataType <em>Shacl Property Data Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Shacl Property Data Type</em>'.
     * @see adaptorinterface.ShaclPropertyDataType
     * @generated
     */
	EEnum getShaclPropertyDataType();

	/**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
	AdaptorinterfaceFactory getAdaptorinterfaceFactory();

	/**
     * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
     * @generated
     */
	interface Literals {
		/**
         * The meta object literal for the '{@link adaptorinterface.impl.AdaptorInterfaceImpl <em>Adaptor Interface</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see adaptorinterface.impl.AdaptorInterfaceImpl
         * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getAdaptorInterface()
         * @generated
         */
		EClass ADAPTOR_INTERFACE = eINSTANCE.getAdaptorInterface();

		/**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ADAPTOR_INTERFACE__NAME = eINSTANCE.getAdaptorInterface_Name();

		/**
         * The meta object literal for the '<em><b>Service Provider Catalog</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference ADAPTOR_INTERFACE__SERVICE_PROVIDER_CATALOG = eINSTANCE.getAdaptorInterface_ServiceProviderCatalog();

		/**
         * The meta object literal for the '<em><b>Web Services</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference ADAPTOR_INTERFACE__WEB_SERVICES = eINSTANCE.getAdaptorInterface_WebServices();

		/**
         * The meta object literal for the '<em><b>Trs Service</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference ADAPTOR_INTERFACE__TRS_SERVICE = eINSTANCE.getAdaptorInterface_TrsService();

		/**
         * The meta object literal for the '<em><b>Specification</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference ADAPTOR_INTERFACE__SPECIFICATION = eINSTANCE.getAdaptorInterface_Specification();

		/**
         * The meta object literal for the '<em><b>Required Adaptors</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference ADAPTOR_INTERFACE__REQUIRED_ADAPTORS = eINSTANCE.getAdaptorInterface_RequiredAdaptors();

		/**
         * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference ADAPTOR_INTERFACE__CONFIGURATION = eINSTANCE.getAdaptorInterface_Configuration();

		/**
         * The meta object literal for the '<em><b>Java Class Base Namespace</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ADAPTOR_INTERFACE__JAVA_CLASS_BASE_NAMESPACE = eINSTANCE.getAdaptorInterface_JavaClassBaseNamespace();

		/**
         * The meta object literal for the '<em><b>Java Files Base Path</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ADAPTOR_INTERFACE__JAVA_FILES_BASE_PATH = eINSTANCE.getAdaptorInterface_JavaFilesBasePath();

		/**
         * The meta object literal for the '<em><b>Jsp Files Base Path</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ADAPTOR_INTERFACE__JSP_FILES_BASE_PATH = eINSTANCE.getAdaptorInterface_JspFilesBasePath();

		/**
         * The meta object literal for the '<em><b>Javascript Files Base Path</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ADAPTOR_INTERFACE__JAVASCRIPT_FILES_BASE_PATH = eINSTANCE.getAdaptorInterface_JavascriptFilesBasePath();

		/**
         * The meta object literal for the '<em><b>Swagger Documentation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ADAPTOR_INTERFACE__SWAGGER_DOCUMENTATION = eINSTANCE.getAdaptorInterface_SwaggerDocumentation();

		/**
         * The meta object literal for the '<em><b>Backend Code Template class Imports</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_CLASS_IMPORTS = eINSTANCE.getAdaptorInterface_BackendCodeTemplate_classImports();

		/**
         * The meta object literal for the '<em><b>Backend Code Template class Methods</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_CLASS_METHODS = eINSTANCE.getAdaptorInterface_BackendCodeTemplate_classMethods();

		/**
         * The meta object literal for the '<em><b>Backend Code Template servlet Listener Initialize</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_SERVLET_LISTENER_INITIALIZE = eINSTANCE.getAdaptorInterface_BackendCodeTemplate_servletListenerInitialize();

		/**
         * The meta object literal for the '<em><b>Backend Code Template servlet Listener Destroy</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_SERVLET_LISTENER_DESTROY = eINSTANCE.getAdaptorInterface_BackendCodeTemplate_servletListenerDestroy();

		/**
         * The meta object literal for the '<em><b>Backend Code Template get Service Providers</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_GET_SERVICE_PROVIDERS = eINSTANCE.getAdaptorInterface_BackendCodeTemplate_getServiceProviders();

		/**
         * The meta object literal for the '<em><b>Backend Code Template get Resource</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_GET_RESOURCE = eINSTANCE.getAdaptorInterface_BackendCodeTemplate_getResource();

		/**
         * The meta object literal for the '<em><b>Backend Code Template get Resources</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_GET_RESOURCES = eINSTANCE.getAdaptorInterface_BackendCodeTemplate_getResources();

		/**
         * The meta object literal for the '<em><b>Backend Code Template search Resources</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_SEARCH_RESOURCES = eINSTANCE.getAdaptorInterface_BackendCodeTemplate_searchResources();

		/**
         * The meta object literal for the '<em><b>Backend Code Template create Resource</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ADAPTOR_INTERFACE__BACKEND_CODE_TEMPLATE_CREATE_RESOURCE = eINSTANCE.getAdaptorInterface_BackendCodeTemplate_createResource();

		/**
         * The meta object literal for the '<em><b>Stores</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ADAPTOR_INTERFACE__STORES = eINSTANCE.getAdaptorInterface_Stores();

        /**
         * The meta object literal for the '<em><b>Sources</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ADAPTOR_INTERFACE__SOURCES = eINSTANCE.getAdaptorInterface_Sources();

        /**
         * The meta object literal for the '{@link adaptorinterface.impl.SpecificationImpl <em>Specification</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see adaptorinterface.impl.SpecificationImpl
         * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getSpecification()
         * @generated
         */
		EClass SPECIFICATION = eINSTANCE.getSpecification();

		/**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SPECIFICATION__NAME = eINSTANCE.getSpecification_Name();

        /**
         * The meta object literal for the '<em><b>Domain Specifications</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SPECIFICATION__DOMAIN_SPECIFICATIONS = eINSTANCE.getSpecification_DomainSpecifications();

		/**
         * The meta object literal for the '<em><b>Domain Prefixes</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SPECIFICATION__DOMAIN_PREFIXES = eINSTANCE.getSpecification_DomainPrefixes();

		/**
         * The meta object literal for the '<em><b>Generation Setting</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SPECIFICATION__GENERATION_SETTING = eINSTANCE.getSpecification_GenerationSetting();

		/**
         * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SPECIFICATION__CONFIGURATION = eINSTANCE.getSpecification_Configuration();

		/**
         * The meta object literal for the '{@link adaptorinterface.impl.DomainSpecificationImpl <em>Domain Specification</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see adaptorinterface.impl.DomainSpecificationImpl
         * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getDomainSpecification()
         * @generated
         */
		EClass DOMAIN_SPECIFICATION = eINSTANCE.getDomainSpecification();

		/**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute DOMAIN_SPECIFICATION__NAME = eINSTANCE.getDomainSpecification_Name();

		/**
         * The meta object literal for the '<em><b>Namespace URI</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute DOMAIN_SPECIFICATION__NAMESPACE_URI = eINSTANCE.getDomainSpecification_NamespaceURI();

		/**
         * The meta object literal for the '<em><b>Namespace Prefix</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DOMAIN_SPECIFICATION__NAMESPACE_PREFIX = eINSTANCE.getDomainSpecification_NamespacePrefix();

		/**
         * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DOMAIN_SPECIFICATION__RESOURCES = eINSTANCE.getDomainSpecification_Resources();

		/**
         * The meta object literal for the '<em><b>Resource Properties</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DOMAIN_SPECIFICATION__RESOURCE_PROPERTIES = eINSTANCE.getDomainSpecification_ResourceProperties();

		/**
         * The meta object literal for the '<em><b>Generation Setting</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DOMAIN_SPECIFICATION__GENERATION_SETTING = eINSTANCE.getDomainSpecification_GenerationSetting();

		/**
         * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DOMAIN_SPECIFICATION__CONFIGURATION = eINSTANCE.getDomainSpecification_Configuration();

		/**
         * The meta object literal for the '<em><b>Shacl Shapes</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DOMAIN_SPECIFICATION__SHACL_SHAPES = eINSTANCE.getDomainSpecification_ShaclShapes();

		/**
         * The meta object literal for the '<em><b>Shacl Properties</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DOMAIN_SPECIFICATION__SHACL_PROPERTIES = eINSTANCE.getDomainSpecification_ShaclProperties();

		/**
         * The meta object literal for the '<em><b>Default Vocabulary</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOMAIN_SPECIFICATION__DEFAULT_VOCABULARY = eINSTANCE.getDomainSpecification_DefaultVocabulary();

        /**
         * The meta object literal for the '{@link adaptorinterface.impl.NamespacePrefixImpl <em>Namespace Prefix</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see adaptorinterface.impl.NamespacePrefixImpl
         * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getNamespacePrefix()
         * @generated
         */
		EClass NAMESPACE_PREFIX = eINSTANCE.getNamespacePrefix();

		/**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute NAMESPACE_PREFIX__NAME = eINSTANCE.getNamespacePrefix_Name();

		/**
         * The meta object literal for the '{@link adaptorinterface.impl.ServiceProviderCatalogImpl <em>Service Provider Catalog</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see adaptorinterface.impl.ServiceProviderCatalogImpl
         * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getServiceProviderCatalog()
         * @generated
         */
		EClass SERVICE_PROVIDER_CATALOG = eINSTANCE.getServiceProviderCatalog();

		/**
         * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SERVICE_PROVIDER_CATALOG__TITLE = eINSTANCE.getServiceProviderCatalog_Title();

		/**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SERVICE_PROVIDER_CATALOG__DESCRIPTION = eINSTANCE.getServiceProviderCatalog_Description();

		/**
         * The meta object literal for the '<em><b>Publisher</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SERVICE_PROVIDER_CATALOG__PUBLISHER = eINSTANCE.getServiceProviderCatalog_Publisher();

		/**
         * The meta object literal for the '<em><b>Service Providers</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SERVICE_PROVIDER_CATALOG__SERVICE_PROVIDERS = eINSTANCE.getServiceProviderCatalog_ServiceProviders();

		/**
         * The meta object literal for the '{@link adaptorinterface.impl.ServiceProviderImpl <em>Service Provider</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see adaptorinterface.impl.ServiceProviderImpl
         * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getServiceProvider()
         * @generated
         */
		EClass SERVICE_PROVIDER = eINSTANCE.getServiceProvider();

		/**
         * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SERVICE_PROVIDER__TITLE = eINSTANCE.getServiceProvider_Title();

		/**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SERVICE_PROVIDER__DESCRIPTION = eINSTANCE.getServiceProvider_Description();

		/**
         * The meta object literal for the '<em><b>Publisher</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SERVICE_PROVIDER__PUBLISHER = eINSTANCE.getServiceProvider_Publisher();

		/**
         * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SERVICE_PROVIDER__SERVICES = eINSTANCE.getServiceProvider_Services();

		/**
         * The meta object literal for the '<em><b>Service Namespace</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SERVICE_PROVIDER__SERVICE_NAMESPACE = eINSTANCE.getServiceProvider_ServiceNamespace();

		/**
         * The meta object literal for the '<em><b>Instance ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SERVICE_PROVIDER__INSTANCE_ID = eINSTANCE.getServiceProvider_InstanceID();

		/**
         * The meta object literal for the '<em><b>Source Binding</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SERVICE_PROVIDER__SOURCE_BINDING = eINSTANCE.getServiceProvider_SourceBinding();

        /**
         * The meta object literal for the '{@link adaptorinterface.impl.ServiceImpl <em>Service</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see adaptorinterface.impl.ServiceImpl
         * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getService()
         * @generated
         */
		EClass SERVICE = eINSTANCE.getService();

		/**
         * The meta object literal for the '<em><b>Domain Specification</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SERVICE__DOMAIN_SPECIFICATION = eINSTANCE.getService_DomainSpecification();

		/**
         * The meta object literal for the '<em><b>Service Namespace</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SERVICE__SERVICE_NAMESPACE = eINSTANCE.getService_ServiceNamespace();

		/**
         * The meta object literal for the '<em><b>Creation Factories</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SERVICE__CREATION_FACTORIES = eINSTANCE.getService_CreationFactories();

		/**
         * The meta object literal for the '<em><b>Query Capabilities</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SERVICE__QUERY_CAPABILITIES = eINSTANCE.getService_QueryCapabilities();

		/**
         * The meta object literal for the '<em><b>Selection Dialogs</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SERVICE__SELECTION_DIALOGS = eINSTANCE.getService_SelectionDialogs();

		/**
         * The meta object literal for the '<em><b>Creation Dialogs</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SERVICE__CREATION_DIALOGS = eINSTANCE.getService_CreationDialogs();

		/**
         * The meta object literal for the '<em><b>Basic Capabilities</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SERVICE__BASIC_CAPABILITIES = eINSTANCE.getService_BasicCapabilities();

		/**
         * The meta object literal for the '<em><b>Usages</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SERVICE__USAGES = eINSTANCE.getService_Usages();

		/**
         * The meta object literal for the '<em><b>Persistence</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SERVICE__PERSISTENCE = eINSTANCE.getService_Persistence();

        /**
         * The meta object literal for the '<em><b>Source Binding</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SERVICE__SOURCE_BINDING = eINSTANCE.getService_SourceBinding();

        /**
         * The meta object literal for the '{@link adaptorinterface.impl.WebServiceImpl <em>Web Service</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see adaptorinterface.impl.WebServiceImpl
         * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getWebService()
         * @generated
         */
		EClass WEB_SERVICE = eINSTANCE.getWebService();

		/**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute WEB_SERVICE__NAME = eINSTANCE.getWebService_Name();

		/**
         * The meta object literal for the '<em><b>Service Url Pattern</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute WEB_SERVICE__SERVICE_URL_PATTERN = eINSTANCE.getWebService_ServiceUrlPattern();

		/**
         * The meta object literal for the '<em><b>Resource Url Pattern</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute WEB_SERVICE__RESOURCE_URL_PATTERN = eINSTANCE.getWebService_ResourceUrlPattern();

		/**
         * The meta object literal for the '<em><b>Resource Types</b></em>' reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference WEB_SERVICE__RESOURCE_TYPES = eINSTANCE.getWebService_ResourceTypes();

		/**
         * The meta object literal for the '<em><b>Read</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute WEB_SERVICE__READ = eINSTANCE.getWebService_Read();

		/**
         * The meta object literal for the '<em><b>Delete</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute WEB_SERVICE__DELETE = eINSTANCE.getWebService_Delete();

		/**
         * The meta object literal for the '<em><b>Update</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute WEB_SERVICE__UPDATE = eINSTANCE.getWebService_Update();

		/**
         * The meta object literal for the '<em><b>Persistence</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference WEB_SERVICE__PERSISTENCE = eINSTANCE.getWebService_Persistence();

        /**
         * The meta object literal for the '<em><b>Source Binding</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference WEB_SERVICE__SOURCE_BINDING = eINSTANCE.getWebService_SourceBinding();

        /**
         * The meta object literal for the '{@link adaptorinterface.impl.TrsServiceImpl <em>Trs Service</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see adaptorinterface.impl.TrsServiceImpl
         * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getTrsService()
         * @generated
         */
		EClass TRS_SERVICE = eINSTANCE.getTrsService();

		/**
         * The meta object literal for the '<em><b>Base Page Limit</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute TRS_SERVICE__BASE_PAGE_LIMIT = eINSTANCE.getTrsService_BasePageLimit();

		/**
         * The meta object literal for the '<em><b>Change Log Page Limit</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute TRS_SERVICE__CHANGE_LOG_PAGE_LIMIT = eINSTANCE.getTrsService_ChangeLogPageLimit();

		/**
         * The meta object literal for the '{@link adaptorinterface.impl.InmemPagedTrsServiceImpl <em>Inmem Paged Trs Service</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see adaptorinterface.impl.InmemPagedTrsServiceImpl
         * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getInmemPagedTrsService()
         * @generated
         */
		EClass INMEM_PAGED_TRS_SERVICE = eINSTANCE.getInmemPagedTrsService();

		/**
         * The meta object literal for the '{@link adaptorinterface.impl.ResourceImpl <em>Resource</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see adaptorinterface.impl.ResourceImpl
         * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getResource()
         * @generated
         */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESOURCE__ID = eINSTANCE.getResource_Id();

		/**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

		/**
         * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESOURCE__TITLE = eINSTANCE.getResource_Title();

        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESOURCE__DESCRIPTION = eINSTANCE.getResource_Description();

        /**
         * The meta object literal for the '<em><b>Describes</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference RESOURCE__DESCRIBES = eINSTANCE.getResource_Describes();

		/**
         * The meta object literal for the '<em><b>Extends</b></em>' reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference RESOURCE__EXTENDS = eINSTANCE.getResource_Extends();

		/**
         * The meta object literal for the '<em><b>Resource Properties</b></em>' reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference RESOURCE__RESOURCE_PROPERTIES = eINSTANCE.getResource_ResourceProperties();

		/**
         * The meta object literal for the '<em><b>Additional Constraints</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESOURCE__ADDITIONAL_CONSTRAINTS = eINSTANCE.getResource_AdditionalConstraints();

        /**
         * The meta object literal for the '<em><b>Vocabulary Comment</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESOURCE__VOCABULARY_COMMENT = eINSTANCE.getResource_VocabularyComment();

        /**
         * The meta object literal for the '{@link adaptorinterface.impl.ResourcePropertyImpl <em>Resource Property</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see adaptorinterface.impl.ResourcePropertyImpl
         * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getResourceProperty()
         * @generated
         */
		EClass RESOURCE_PROPERTY = eINSTANCE.getResourceProperty();

		/**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESOURCE_PROPERTY__ID = eINSTANCE.getResourceProperty_Id();

		/**
         * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute RESOURCE_PROPERTY__TITLE = eINSTANCE.getResourceProperty_Title();

		/**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute RESOURCE_PROPERTY__NAME = eINSTANCE.getResourceProperty_Name();

		/**
         * The meta object literal for the '<em><b>Property Definition</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference RESOURCE_PROPERTY__PROPERTY_DEFINITION = eINSTANCE.getResourceProperty_PropertyDefinition();

		/**
         * The meta object literal for the '<em><b>Occurs</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute RESOURCE_PROPERTY__OCCURS = eINSTANCE.getResourceProperty_Occurs();

		/**
         * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute RESOURCE_PROPERTY__READ_ONLY = eINSTANCE.getResourceProperty_ReadOnly();

		/**
         * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute RESOURCE_PROPERTY__VALUE_TYPE = eINSTANCE.getResourceProperty_ValueType();

		/**
         * The meta object literal for the '<em><b>Representation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute RESOURCE_PROPERTY__REPRESENTATION = eINSTANCE.getResourceProperty_Representation();

		/**
         * The meta object literal for the '<em><b>Multi Value Representation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute RESOURCE_PROPERTY__MULTI_VALUE_REPRESENTATION = eINSTANCE.getResourceProperty_MultiValueRepresentation();

		/**
         * The meta object literal for the '<em><b>Range</b></em>' reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference RESOURCE_PROPERTY__RANGE = eINSTANCE.getResourceProperty_Range();

		/**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute RESOURCE_PROPERTY__DESCRIPTION = eINSTANCE.getResourceProperty_Description();

		/**
         * The meta object literal for the '<em><b>Allowed Value</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute RESOURCE_PROPERTY__ALLOWED_VALUE = eINSTANCE.getResourceProperty_AllowedValue();

		/**
         * The meta object literal for the '<em><b>Is Member Property</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute RESOURCE_PROPERTY__IS_MEMBER_PROPERTY = eINSTANCE.getResourceProperty_IsMemberProperty();

		/**
         * The meta object literal for the '<em><b>Additional Constraints</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESOURCE_PROPERTY__ADDITIONAL_CONSTRAINTS = eINSTANCE.getResourceProperty_AdditionalConstraints();

        /**
         * The meta object literal for the '<em><b>Vocabulary Comment</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESOURCE_PROPERTY__VOCABULARY_COMMENT = eINSTANCE.getResourceProperty_VocabularyComment();

        /**
         * The meta object literal for the '{@link adaptorinterface.impl.CreationFactoryImpl <em>Creation Factory</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see adaptorinterface.impl.CreationFactoryImpl
         * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getCreationFactory()
         * @generated
         */
		EClass CREATION_FACTORY = eINSTANCE.getCreationFactory();

		/**
         * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute CREATION_FACTORY__TITLE = eINSTANCE.getCreationFactory_Title();

		/**
         * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute CREATION_FACTORY__LABEL = eINSTANCE.getCreationFactory_Label();

		/**
         * The meta object literal for the '<em><b>Creation URI</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute CREATION_FACTORY__CREATION_URI = eINSTANCE.getCreationFactory_CreationURI();

		/**
         * The meta object literal for the '<em><b>Resource Types</b></em>' reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference CREATION_FACTORY__RESOURCE_TYPES = eINSTANCE.getCreationFactory_ResourceTypes();

		/**
         * The meta object literal for the '<em><b>Usages</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute CREATION_FACTORY__USAGES = eINSTANCE.getCreationFactory_Usages();

		/**
         * The meta object literal for the '{@link adaptorinterface.impl.QueryCapabilityImpl <em>Query Capability</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see adaptorinterface.impl.QueryCapabilityImpl
         * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getQueryCapability()
         * @generated
         */
		EClass QUERY_CAPABILITY = eINSTANCE.getQueryCapability();

		/**
         * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute QUERY_CAPABILITY__TITLE = eINSTANCE.getQueryCapability_Title();

		/**
         * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute QUERY_CAPABILITY__LABEL = eINSTANCE.getQueryCapability_Label();

		/**
         * The meta object literal for the '<em><b>Query Base URI</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute QUERY_CAPABILITY__QUERY_BASE_URI = eINSTANCE.getQueryCapability_QueryBaseURI();

		/**
         * The meta object literal for the '<em><b>Resource Types</b></em>' reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference QUERY_CAPABILITY__RESOURCE_TYPES = eINSTANCE.getQueryCapability_ResourceTypes();

		/**
         * The meta object literal for the '<em><b>Usages</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute QUERY_CAPABILITY__USAGES = eINSTANCE.getQueryCapability_Usages();

		/**
         * The meta object literal for the '{@link adaptorinterface.impl.BasicCapabilityImpl <em>Basic Capability</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see adaptorinterface.impl.BasicCapabilityImpl
         * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getBasicCapability()
         * @generated
         */
		EClass BASIC_CAPABILITY = eINSTANCE.getBasicCapability();

		/**
         * The meta object literal for the '<em><b>Instance ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute BASIC_CAPABILITY__INSTANCE_ID = eINSTANCE.getBasicCapability_InstanceID();

		/**
         * The meta object literal for the '<em><b>Resource Types</b></em>' reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference BASIC_CAPABILITY__RESOURCE_TYPES = eINSTANCE.getBasicCapability_ResourceTypes();

		/**
         * The meta object literal for the '<em><b>Read</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute BASIC_CAPABILITY__READ = eINSTANCE.getBasicCapability_Read();

		/**
         * The meta object literal for the '<em><b>Delete</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute BASIC_CAPABILITY__DELETE = eINSTANCE.getBasicCapability_Delete();

		/**
         * The meta object literal for the '<em><b>Update</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute BASIC_CAPABILITY__UPDATE = eINSTANCE.getBasicCapability_Update();

		/**
         * The meta object literal for the '{@link adaptorinterface.impl.DialogImpl <em>Dialog</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see adaptorinterface.impl.DialogImpl
         * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getDialog()
         * @generated
         */
		EClass DIALOG = eINSTANCE.getDialog();

		/**
         * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute DIALOG__TITLE = eINSTANCE.getDialog_Title();

		/**
         * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute DIALOG__LABEL = eINSTANCE.getDialog_Label();

		/**
         * The meta object literal for the '<em><b>Dialog URI</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute DIALOG__DIALOG_URI = eINSTANCE.getDialog_DialogURI();

		/**
         * The meta object literal for the '<em><b>Hint Width</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute DIALOG__HINT_WIDTH = eINSTANCE.getDialog_HintWidth();

		/**
         * The meta object literal for the '<em><b>Hint Height</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute DIALOG__HINT_HEIGHT = eINSTANCE.getDialog_HintHeight();

		/**
         * The meta object literal for the '<em><b>Resource Types</b></em>' reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DIALOG__RESOURCE_TYPES = eINSTANCE.getDialog_ResourceTypes();

		/**
         * The meta object literal for the '<em><b>Usages</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute DIALOG__USAGES = eINSTANCE.getDialog_Usages();

		/**
         * The meta object literal for the '{@link adaptorinterface.impl.PublisherImpl <em>Publisher</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see adaptorinterface.impl.PublisherImpl
         * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getPublisher()
         * @generated
         */
		EClass PUBLISHER = eINSTANCE.getPublisher();

		/**
         * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute PUBLISHER__TITLE = eINSTANCE.getPublisher_Title();

		/**
         * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute PUBLISHER__LABEL = eINSTANCE.getPublisher_Label();

		/**
         * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute PUBLISHER__IDENTIFIER = eINSTANCE.getPublisher_Identifier();

		/**
         * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute PUBLISHER__ICON = eINSTANCE.getPublisher_Icon();

		/**
         * The meta object literal for the '{@link adaptorinterface.impl.RequiredAdaptorImpl <em>Required Adaptor</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see adaptorinterface.impl.RequiredAdaptorImpl
         * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getRequiredAdaptor()
         * @generated
         */
		EClass REQUIRED_ADAPTOR = eINSTANCE.getRequiredAdaptor();

		/**
         * The meta object literal for the '<em><b>Service Provider Catalog URI</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute REQUIRED_ADAPTOR__SERVICE_PROVIDER_CATALOG_URI = eINSTANCE.getRequiredAdaptor_ServiceProviderCatalogURI();

		/**
         * The meta object literal for the '{@link adaptorinterface.impl.GenericRequiredAdaptorImpl <em>Generic Required Adaptor</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see adaptorinterface.impl.GenericRequiredAdaptorImpl
         * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getGenericRequiredAdaptor()
         * @generated
         */
		EClass GENERIC_REQUIRED_ADAPTOR = eINSTANCE.getGenericRequiredAdaptor();

		/**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute GENERIC_REQUIRED_ADAPTOR__NAME = eINSTANCE.getGenericRequiredAdaptor_Name();

		/**
         * The meta object literal for the '<em><b>Serviced Resources</b></em>' reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference GENERIC_REQUIRED_ADAPTOR__SERVICED_RESOURCES = eINSTANCE.getGenericRequiredAdaptor_ServicedResources();

		/**
         * The meta object literal for the '{@link adaptorinterface.impl.ModelledRequiredAdaptorImpl <em>Modelled Required Adaptor</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see adaptorinterface.impl.ModelledRequiredAdaptorImpl
         * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getModelledRequiredAdaptor()
         * @generated
         */
		EClass MODELLED_REQUIRED_ADAPTOR = eINSTANCE.getModelledRequiredAdaptor();

		/**
         * The meta object literal for the '<em><b>Adaptor Interface</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference MODELLED_REQUIRED_ADAPTOR__ADAPTOR_INTERFACE = eINSTANCE.getModelledRequiredAdaptor_AdaptorInterface();

		/**
         * The meta object literal for the '{@link adaptorinterface.impl.GenerationSettingImpl <em>Generation Setting</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see adaptorinterface.impl.GenerationSettingImpl
         * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getGenerationSetting()
         * @generated
         */
		EClass GENERATION_SETTING = eINSTANCE.getGenerationSetting();

		/**
         * The meta object literal for the '<em><b>Java Class Package Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute GENERATION_SETTING__JAVA_CLASS_PACKAGE_NAME = eINSTANCE.getGenerationSetting_JavaClassPackageName();

		/**
         * The meta object literal for the '<em><b>Java Files Path</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute GENERATION_SETTING__JAVA_FILES_PATH = eINSTANCE.getGenerationSetting_JavaFilesPath();

		/**
         * The meta object literal for the '<em><b>Do Not Generate</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute GENERATION_SETTING__DO_NOT_GENERATE = eINSTANCE.getGenerationSetting_DoNotGenerate();

		/**
         * The meta object literal for the '{@link adaptorinterface.impl.ShapeImpl <em>Shape</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see adaptorinterface.impl.ShapeImpl
         * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getShape()
         * @generated
         */
		EClass SHAPE = eINSTANCE.getShape();

		/**
         * The meta object literal for the '{@link adaptorinterface.impl.ShaclShapeImpl <em>Shacl Shape</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see adaptorinterface.impl.ShaclShapeImpl
         * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getShaclShape()
         * @generated
         */
		EClass SHACL_SHAPE = eINSTANCE.getShaclShape();

		/**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SHACL_SHAPE__NAME = eINSTANCE.getShaclShape_Name();

		/**
         * The meta object literal for the '<em><b>Target Class</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SHACL_SHAPE__TARGET_CLASS = eINSTANCE.getShaclShape_TargetClass();

		/**
         * The meta object literal for the '<em><b>Closed</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SHACL_SHAPE__CLOSED = eINSTANCE.getShaclShape_Closed();

		/**
         * The meta object literal for the '<em><b>Shacl Properties</b></em>' reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SHACL_SHAPE__SHACL_PROPERTIES = eINSTANCE.getShaclShape_ShaclProperties();

		/**
         * The meta object literal for the '<em><b>Extends</b></em>' reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SHACL_SHAPE__EXTENDS = eINSTANCE.getShaclShape_Extends();

		/**
         * The meta object literal for the '{@link adaptorinterface.impl.ShapePropertyImpl <em>Shape Property</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see adaptorinterface.impl.ShapePropertyImpl
         * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getShapeProperty()
         * @generated
         */
		EClass SHAPE_PROPERTY = eINSTANCE.getShapeProperty();

		/**
         * The meta object literal for the '{@link adaptorinterface.impl.ShaclPropertyImpl <em>Shacl Property</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see adaptorinterface.impl.ShaclPropertyImpl
         * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getShaclProperty()
         * @generated
         */
		EClass SHACL_PROPERTY = eINSTANCE.getShaclProperty();

		/**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SHACL_PROPERTY__NAME = eINSTANCE.getShaclProperty_Name();

		/**
         * The meta object literal for the '<em><b>Path</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SHACL_PROPERTY__PATH = eINSTANCE.getShaclProperty_Path();

		/**
         * The meta object literal for the '<em><b>Min Count</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SHACL_PROPERTY__MIN_COUNT = eINSTANCE.getShaclProperty_MinCount();

		/**
         * The meta object literal for the '<em><b>Max Count</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SHACL_PROPERTY__MAX_COUNT = eINSTANCE.getShaclProperty_MaxCount();

		/**
         * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SHACL_PROPERTY__DATA_TYPE = eINSTANCE.getShaclProperty_DataType();

		/**
         * The meta object literal for the '<em><b>Class</b></em>' reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SHACL_PROPERTY__CLASS = eINSTANCE.getShaclProperty_Class();

		/**
         * The meta object literal for the '{@link adaptorinterface.impl.ConfigurationImpl <em>Configuration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see adaptorinterface.impl.ConfigurationImpl
         * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getConfiguration()
         * @generated
         */
        EClass CONFIGURATION = eINSTANCE.getConfiguration();

        /**
         * The meta object literal for the '{@link adaptorinterface.impl.AuthenticationConfigurationImpl <em>Authentication Configuration</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see adaptorinterface.impl.AuthenticationConfigurationImpl
         * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getAuthenticationConfiguration()
         * @generated
         */
		EClass AUTHENTICATION_CONFIGURATION = eINSTANCE.getAuthenticationConfiguration();

		/**
         * The meta object literal for the '<em><b>Application Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute AUTHENTICATION_CONFIGURATION__APPLICATION_NAME = eINSTANCE.getAuthenticationConfiguration_ApplicationName();

		/**
         * The meta object literal for the '<em><b>Oauth Realm</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute AUTHENTICATION_CONFIGURATION__OAUTH_REALM = eINSTANCE.getAuthenticationConfiguration_OauthRealm();

		/**
         * The meta object literal for the '{@link adaptorinterface.impl.GeneralConfigurationImpl <em>General Configuration</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see adaptorinterface.impl.GeneralConfigurationImpl
         * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getGeneralConfiguration()
         * @generated
         */
		EClass GENERAL_CONFIGURATION = eINSTANCE.getGeneralConfiguration();

		/**
         * The meta object literal for the '<em><b>Do Not Generate</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute GENERAL_CONFIGURATION__DO_NOT_GENERATE = eINSTANCE.getGeneralConfiguration_DoNotGenerate();

		/**
         * The meta object literal for the '<em><b>Do Not Generate From Imported Models</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERAL_CONFIGURATION__DO_NOT_GENERATE_FROM_IMPORTED_MODELS = eINSTANCE.getGeneralConfiguration_DoNotGenerateFromImportedModels();

        /**
         * The meta object literal for the '<em><b>Files Base Path</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute GENERAL_CONFIGURATION__FILES_BASE_PATH = eINSTANCE.getGeneralConfiguration_FilesBasePath();

		/**
         * The meta object literal for the '<em><b>Java Base Package Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute GENERAL_CONFIGURATION__JAVA_BASE_PACKAGE_NAME = eINSTANCE.getGeneralConfiguration_JavaBasePackageName();

		/**
         * The meta object literal for the '{@link adaptorinterface.impl.ProjectConfigurationImpl <em>Project Configuration</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see adaptorinterface.impl.ProjectConfigurationImpl
         * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getProjectConfiguration()
         * @generated
         */
		EClass PROJECT_CONFIGURATION = eINSTANCE.getProjectConfiguration();

		/**
         * The meta object literal for the '<em><b>Do Not Generate Project Configuration Files</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute PROJECT_CONFIGURATION__DO_NOT_GENERATE_PROJECT_CONFIGURATION_FILES = eINSTANCE.getProjectConfiguration_DoNotGenerateProjectConfigurationFiles();

		/**
         * The meta object literal for the '<em><b>Lyo Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute PROJECT_CONFIGURATION__LYO_VERSION = eINSTANCE.getProjectConfiguration_LyoVersion();

		/**
         * The meta object literal for the '{@link adaptorinterface.impl.ServerConfigurationImpl <em>Server Configuration</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see adaptorinterface.impl.ServerConfigurationImpl
         * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getServerConfiguration()
         * @generated
         */
		EClass SERVER_CONFIGURATION = eINSTANCE.getServerConfiguration();

		/**
         * The meta object literal for the '<em><b>Root Server Base Url</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SERVER_CONFIGURATION__ROOT_SERVER_BASE_URL = eINSTANCE.getServerConfiguration_RootServerBaseUrl();

		/**
         * The meta object literal for the '<em><b>Application Context Path</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SERVER_CONFIGURATION__APPLICATION_CONTEXT_PATH = eINSTANCE.getServerConfiguration_ApplicationContextPath();

		/**
         * The meta object literal for the '<em><b>Servlet Url Pattern</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SERVER_CONFIGURATION__SERVLET_URL_PATTERN = eINSTANCE.getServerConfiguration_ServletUrlPattern();

		/**
         * The meta object literal for the '<em><b>Do Not Regenerate Jsp Files</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SERVER_CONFIGURATION__DO_NOT_REGENERATE_JSP_FILES = eINSTANCE.getServerConfiguration_DoNotRegenerateJspFiles();

		/**
         * The meta object literal for the '<em><b>Generate Jsp Files For Oslc UI</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVER_CONFIGURATION__GENERATE_JSP_FILES_FOR_OSLC_UI = eINSTANCE.getServerConfiguration_GenerateJspFilesForOslcUI();

        /**
         * The meta object literal for the '<em><b>General Configuration</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SERVER_CONFIGURATION__GENERAL_CONFIGURATION = eINSTANCE.getServerConfiguration_GeneralConfiguration();

		/**
         * The meta object literal for the '<em><b>Project Configuration</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SERVER_CONFIGURATION__PROJECT_CONFIGURATION = eINSTANCE.getServerConfiguration_ProjectConfiguration();

		/**
         * The meta object literal for the '<em><b>Authentication Configuration</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SERVER_CONFIGURATION__AUTHENTICATION_CONFIGURATION = eINSTANCE.getServerConfiguration_AuthenticationConfiguration();

		/**
         * The meta object literal for the '<em><b>Configurations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SERVER_CONFIGURATION__CONFIGURATIONS = eINSTANCE.getServerConfiguration_Configurations();

        /**
         * The meta object literal for the '{@link adaptorinterface.impl.SpecificationConfigurationImpl <em>Specification Configuration</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see adaptorinterface.impl.SpecificationConfigurationImpl
         * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getSpecificationConfiguration()
         * @generated
         */
		EClass SPECIFICATION_CONFIGURATION = eINSTANCE.getSpecificationConfiguration();

		/**
         * The meta object literal for the '<em><b>General Configuration</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SPECIFICATION_CONFIGURATION__GENERAL_CONFIGURATION = eINSTANCE.getSpecificationConfiguration_GeneralConfiguration();

		/**
         * The meta object literal for the '<em><b>Project Configuration</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SPECIFICATION_CONFIGURATION__PROJECT_CONFIGURATION = eINSTANCE.getSpecificationConfiguration_ProjectConfiguration();

		/**
         * The meta object literal for the '{@link adaptorinterface.impl.MavenProjectConfigurationImpl <em>Maven Project Configuration</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see adaptorinterface.impl.MavenProjectConfigurationImpl
         * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getMavenProjectConfiguration()
         * @generated
         */
		EClass MAVEN_PROJECT_CONFIGURATION = eINSTANCE.getMavenProjectConfiguration();

		/**
         * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute MAVEN_PROJECT_CONFIGURATION__GROUP_ID = eINSTANCE.getMavenProjectConfiguration_GroupId();

		/**
         * The meta object literal for the '<em><b>Artifact Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute MAVEN_PROJECT_CONFIGURATION__ARTIFACT_ID = eINSTANCE.getMavenProjectConfiguration_ArtifactId();

		/**
         * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute MAVEN_PROJECT_CONFIGURATION__VERSION = eINSTANCE.getMavenProjectConfiguration_Version();

		/**
         * The meta object literal for the '{@link adaptorinterface.impl.MavenServerConfigurationImpl <em>Maven Server Configuration</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see adaptorinterface.impl.MavenServerConfigurationImpl
         * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getMavenServerConfiguration()
         * @generated
         */
		EClass MAVEN_SERVER_CONFIGURATION = eINSTANCE.getMavenServerConfiguration();

		/**
         * The meta object literal for the '<em><b>Jetty Port</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute MAVEN_SERVER_CONFIGURATION__JETTY_PORT = eINSTANCE.getMavenServerConfiguration_JettyPort();

		/**
         * The meta object literal for the '{@link adaptorinterface.impl.MavenSpecificationConfigurationImpl <em>Maven Specification Configuration</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see adaptorinterface.impl.MavenSpecificationConfigurationImpl
         * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getMavenSpecificationConfiguration()
         * @generated
         */
		EClass MAVEN_SPECIFICATION_CONFIGURATION = eINSTANCE.getMavenSpecificationConfiguration();

		/**
         * The meta object literal for the '{@link adaptorinterface.impl.SourceImpl <em>Source</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see adaptorinterface.impl.SourceImpl
         * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getSource()
         * @generated
         */
        EClass SOURCE = eINSTANCE.getSource();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SOURCE__NAME = eINSTANCE.getSource_Name();

        /**
         * The meta object literal for the '{@link adaptorinterface.impl.StoreImpl <em>Store</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see adaptorinterface.impl.StoreImpl
         * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getStore()
         * @generated
         */
        EClass STORE = eINSTANCE.getStore();

        /**
         * The meta object literal for the '<em><b>Default Named Graph</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STORE__DEFAULT_NAMED_GRAPH = eINSTANCE.getStore_DefaultNamedGraph();

        /**
         * The meta object literal for the '<em><b>Sparql Query Endpoint</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STORE__SPARQL_QUERY_ENDPOINT = eINSTANCE.getStore_SparqlQueryEndpoint();

        /**
         * The meta object literal for the '<em><b>Sparql Update Endpoint</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STORE__SPARQL_UPDATE_ENDPOINT = eINSTANCE.getStore_SparqlUpdateEndpoint();

        /**
         * The meta object literal for the '<em><b>Initial Pool Size</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STORE__INITIAL_POOL_SIZE = eINSTANCE.getStore_InitialPoolSize();

        /**
         * The meta object literal for the '{@link adaptorinterface.impl.StoreWithAuthenticationImpl <em>Store With Authentication</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see adaptorinterface.impl.StoreWithAuthenticationImpl
         * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getStoreWithAuthentication()
         * @generated
         */
        EClass STORE_WITH_AUTHENTICATION = eINSTANCE.getStoreWithAuthentication();

        /**
         * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STORE_WITH_AUTHENTICATION__USERNAME = eINSTANCE.getStoreWithAuthentication_Username();

        /**
         * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STORE_WITH_AUTHENTICATION__PASSWORD = eINSTANCE.getStoreWithAuthentication_Password();

        /**
         * The meta object literal for the '{@link adaptorinterface.impl.SourceBindingImpl <em>Source Binding</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see adaptorinterface.impl.SourceBindingImpl
         * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getSourceBinding()
         * @generated
         */
        EClass SOURCE_BINDING = eINSTANCE.getSourceBinding();

        /**
         * The meta object literal for the '<em><b>Source</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SOURCE_BINDING__SOURCE = eINSTANCE.getSourceBinding_Source();

        /**
         * The meta object literal for the '{@link adaptorinterface.impl.ServicePersistenceImpl <em>Service Persistence</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see adaptorinterface.impl.ServicePersistenceImpl
         * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getServicePersistence()
         * @generated
         */
        EClass SERVICE_PERSISTENCE = eINSTANCE.getServicePersistence();

        /**
         * The meta object literal for the '<em><b>Store</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SERVICE_PERSISTENCE__STORE = eINSTANCE.getServicePersistence_Store();

        /**
         * The meta object literal for the '{@link adaptorinterface.impl.OSLCServicePersistenceImpl <em>OSLC Service Persistence</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see adaptorinterface.impl.OSLCServicePersistenceImpl
         * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getOSLCServicePersistence()
         * @generated
         */
        EClass OSLC_SERVICE_PERSISTENCE = eINSTANCE.getOSLCServicePersistence();

        /**
         * The meta object literal for the '<em><b>Creation Factory</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OSLC_SERVICE_PERSISTENCE__CREATION_FACTORY = eINSTANCE.getOSLCServicePersistence_CreationFactory();

        /**
         * The meta object literal for the '<em><b>Query Capability</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OSLC_SERVICE_PERSISTENCE__QUERY_CAPABILITY = eINSTANCE.getOSLCServicePersistence_QueryCapability();

        /**
         * The meta object literal for the '<em><b>Selection Dialog</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OSLC_SERVICE_PERSISTENCE__SELECTION_DIALOG = eINSTANCE.getOSLCServicePersistence_SelectionDialog();

        /**
         * The meta object literal for the '<em><b>Creation Dialog</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OSLC_SERVICE_PERSISTENCE__CREATION_DIALOG = eINSTANCE.getOSLCServicePersistence_CreationDialog();

        /**
         * The meta object literal for the '{@link adaptorinterface.impl.WebServicePersistenceImpl <em>Web Service Persistence</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see adaptorinterface.impl.WebServicePersistenceImpl
         * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getWebServicePersistence()
         * @generated
         */
        EClass WEB_SERVICE_PERSISTENCE = eINSTANCE.getWebServicePersistence();

        /**
         * The meta object literal for the '<em><b>Read</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WEB_SERVICE_PERSISTENCE__READ = eINSTANCE.getWebServicePersistence_Read();

        /**
         * The meta object literal for the '<em><b>Delete</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WEB_SERVICE_PERSISTENCE__DELETE = eINSTANCE.getWebServicePersistence_Delete();

        /**
         * The meta object literal for the '<em><b>Update</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WEB_SERVICE_PERSISTENCE__UPDATE = eINSTANCE.getWebServicePersistence_Update();

        /**
         * The meta object literal for the '{@link adaptorinterface.ResourcePropertyOccurs <em>Resource Property Occurs</em>}' enum.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see adaptorinterface.ResourcePropertyOccurs
         * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getResourcePropertyOccurs()
         * @generated
         */
		EEnum RESOURCE_PROPERTY_OCCURS = eINSTANCE.getResourcePropertyOccurs();

		/**
         * The meta object literal for the '{@link adaptorinterface.ResourcePropertyValueType <em>Resource Property Value Type</em>}' enum.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see adaptorinterface.ResourcePropertyValueType
         * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getResourcePropertyValueType()
         * @generated
         */
		EEnum RESOURCE_PROPERTY_VALUE_TYPE = eINSTANCE.getResourcePropertyValueType();

		/**
         * The meta object literal for the '{@link adaptorinterface.ResourcePropertyRepresentation <em>Resource Property Representation</em>}' enum.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see adaptorinterface.ResourcePropertyRepresentation
         * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getResourcePropertyRepresentation()
         * @generated
         */
		EEnum RESOURCE_PROPERTY_REPRESENTATION = eINSTANCE.getResourcePropertyRepresentation();

		/**
         * The meta object literal for the '{@link adaptorinterface.ResourcePropertyIsMemberProperty <em>Resource Property Is Member Property</em>}' enum.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see adaptorinterface.ResourcePropertyIsMemberProperty
         * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getResourcePropertyIsMemberProperty()
         * @generated
         */
		EEnum RESOURCE_PROPERTY_IS_MEMBER_PROPERTY = eINSTANCE.getResourcePropertyIsMemberProperty();

		/**
         * The meta object literal for the '{@link adaptorinterface.ResourcePropertyMultiValueRepresentation <em>Resource Property Multi Value Representation</em>}' enum.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see adaptorinterface.ResourcePropertyMultiValueRepresentation
         * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getResourcePropertyMultiValueRepresentation()
         * @generated
         */
		EEnum RESOURCE_PROPERTY_MULTI_VALUE_REPRESENTATION = eINSTANCE.getResourcePropertyMultiValueRepresentation();

		/**
         * The meta object literal for the '{@link adaptorinterface.ResourceServiceNamespace <em>Resource Service Namespace</em>}' enum.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see adaptorinterface.ResourceServiceNamespace
         * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getResourceServiceNamespace()
         * @generated
         */
		EEnum RESOURCE_SERVICE_NAMESPACE = eINSTANCE.getResourceServiceNamespace();

		/**
         * The meta object literal for the '{@link adaptorinterface.ShaclPropertyDataType <em>Shacl Property Data Type</em>}' enum.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see adaptorinterface.ShaclPropertyDataType
         * @see adaptorinterface.impl.AdaptorinterfacePackageImpl#getShaclPropertyDataType()
         * @generated
         */
		EEnum SHACL_PROPERTY_DATA_TYPE = eINSTANCE.getShaclPropertyDataType();

	}

} //AdaptorinterfacePackage