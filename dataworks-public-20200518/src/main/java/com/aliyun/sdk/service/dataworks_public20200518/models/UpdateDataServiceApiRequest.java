// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateDataServiceApiRequest} extends {@link RequestModel}
 *
 * <p>UpdateDataServiceApiRequest</p>
 */
public class UpdateDataServiceApiRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApiDescription")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApiId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long apiId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApiPath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiPath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Protocols")
    @com.aliyun.core.annotation.Validation(required = true)
    private String protocols;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegistrationDetails")
    private String registrationDetails;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RequestMethod")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer requestMethod;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private Long resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResponseContentType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer responseContentType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScriptDetails")
    private String scriptDetails;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    private Long tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Timeout")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer timeout;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VisibleRange")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer visibleRange;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WizardDetails")
    private String wizardDetails;

    private UpdateDataServiceApiRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.apiDescription = builder.apiDescription;
        this.apiId = builder.apiId;
        this.apiPath = builder.apiPath;
        this.projectId = builder.projectId;
        this.protocols = builder.protocols;
        this.registrationDetails = builder.registrationDetails;
        this.requestMethod = builder.requestMethod;
        this.resourceGroupId = builder.resourceGroupId;
        this.responseContentType = builder.responseContentType;
        this.scriptDetails = builder.scriptDetails;
        this.tenantId = builder.tenantId;
        this.timeout = builder.timeout;
        this.visibleRange = builder.visibleRange;
        this.wizardDetails = builder.wizardDetails;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDataServiceApiRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return apiDescription
     */
    public String getApiDescription() {
        return this.apiDescription;
    }

    /**
     * @return apiId
     */
    public Long getApiId() {
        return this.apiId;
    }

    /**
     * @return apiPath
     */
    public String getApiPath() {
        return this.apiPath;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return protocols
     */
    public String getProtocols() {
        return this.protocols;
    }

    /**
     * @return registrationDetails
     */
    public String getRegistrationDetails() {
        return this.registrationDetails;
    }

    /**
     * @return requestMethod
     */
    public Integer getRequestMethod() {
        return this.requestMethod;
    }

    /**
     * @return resourceGroupId
     */
    public Long getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return responseContentType
     */
    public Integer getResponseContentType() {
        return this.responseContentType;
    }

    /**
     * @return scriptDetails
     */
    public String getScriptDetails() {
        return this.scriptDetails;
    }

    /**
     * @return tenantId
     */
    public Long getTenantId() {
        return this.tenantId;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * @return visibleRange
     */
    public Integer getVisibleRange() {
        return this.visibleRange;
    }

    /**
     * @return wizardDetails
     */
    public String getWizardDetails() {
        return this.wizardDetails;
    }

    public static final class Builder extends Request.Builder<UpdateDataServiceApiRequest, Builder> {
        private String regionId; 
        private String apiDescription; 
        private Long apiId; 
        private String apiPath; 
        private Long projectId; 
        private String protocols; 
        private String registrationDetails; 
        private Integer requestMethod; 
        private Long resourceGroupId; 
        private Integer responseContentType; 
        private String scriptDetails; 
        private Long tenantId; 
        private Integer timeout; 
        private Integer visibleRange; 
        private String wizardDetails; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDataServiceApiRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.apiDescription = request.apiDescription;
            this.apiId = request.apiId;
            this.apiPath = request.apiPath;
            this.projectId = request.projectId;
            this.protocols = request.protocols;
            this.registrationDetails = request.registrationDetails;
            this.requestMethod = request.requestMethod;
            this.resourceGroupId = request.resourceGroupId;
            this.responseContentType = request.responseContentType;
            this.scriptDetails = request.scriptDetails;
            this.tenantId = request.tenantId;
            this.timeout = request.timeout;
            this.visibleRange = request.visibleRange;
            this.wizardDetails = request.wizardDetails;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The description of the API.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>API description</p>
         */
        public Builder apiDescription(String apiDescription) {
            this.putBodyParameter("ApiDescription", apiDescription);
            this.apiDescription = apiDescription;
            return this;
        }

        /**
         * <p>The ID of the API.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder apiId(Long apiId) {
            this.putBodyParameter("ApiId", apiId);
            this.apiId = apiId;
            return this;
        }

        /**
         * <p>The path of the API.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/test/2</p>
         */
        public Builder apiPath(String apiPath) {
            this.putBodyParameter("ApiPath", apiPath);
            this.apiPath = apiPath;
            return this;
        }

        /**
         * <p>The ID of the workspace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The protocol used by the API. Valid values: 0 and 1. The value 0 indicates HTTP. The value 1 indicates HTTPS. You can specify multiple protocols. Separate multiple protocols with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0,1</p>
         */
        public Builder protocols(String protocols) {
            this.putBodyParameter("Protocols", protocols);
            this.protocols = protocols;
            return this;
        }

        /**
         * <p>The details of the API generated by registration. For more information, see the RegistrationDetails parameter returned by the <a href="https://help.aliyun.com/document_detail/174013.html">GetDataServiceApi</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;failedResultSample&quot;:&quot;fail&quot;,&quot;registrationErrorCodes&quot;:[{&quot;errorCode&quot;:&quot;e1&quot;,&quot;errorMessage&quot;:&quot;msg1&quot;,&quot;errorSolution&quot;:&quot;sol1&quot;},{&quot;errorCode&quot;:&quot;e2&quot;,&quot;errorMessage&quot;:&quot;msg2&quot;,&quot;errorSolution&quot;:&quot;sol2&quot;}],&quot;registrationRequestParameters&quot;:[{&quot;columnName&quot;:&quot;&quot;,&quot;defaultValue&quot;:&quot;&quot;,&quot;exampleValue&quot;:&quot;&quot;,&quot;isRequiredParameter&quot;:true,&quot;parameterDataType&quot;:0,&quot;parameterDescription&quot;:&quot;&quot;,&quot;parameterName&quot;:&quot;id&quot;,&quot;parameterOperator&quot;:0,&quot;parameterPosition&quot;:1},{&quot;columnName&quot;:&quot;&quot;,&quot;defaultValue&quot;:&quot;xx&quot;,&quot;exampleValue&quot;:&quot;&quot;,&quot;isRequiredParameter&quot;:true,&quot;parameterDataType&quot;:0,&quot;parameterDescription&quot;:&quot;&quot;,&quot;parameterName&quot;:&quot;cc&quot;,&quot;parameterOperator&quot;:2,&quot;parameterPosition&quot;:2}],&quot;serviceContentType&quot;:1,&quot;serviceHost&quot;:&quot;<a href="http://www.baidu.com%22,%22servicePath%22:%22/%5Buid%5D%22,%22serviceRequestBodyDescription%22:%22body%22,%22successfulResultSample%22:%22success%22%7D">http://www.baidu.com&quot;,&quot;servicePath&quot;:&quot;/[uid]&quot;,&quot;serviceRequestBodyDescription&quot;:&quot;body&quot;,&quot;successfulResultSample&quot;:&quot;success&quot;}</a></p>
         */
        public Builder registrationDetails(String registrationDetails) {
            this.putBodyParameter("RegistrationDetails", registrationDetails);
            this.registrationDetails = registrationDetails;
            return this;
        }

        /**
         * <p>The request method of the API. Valid values: 0, 1, 2, and 3. The value 0 indicates the GET method. The value 1 indicates the POST method. The value 2 indicates the PUT method. The value 3 indicates the DELETE method. APIs generated in wizard or script mode support the GET and POST methods. APIs generated by registration support the GET, POST, PUT, and DELETE methods.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder requestMethod(Integer requestMethod) {
            this.putBodyParameter("RequestMethod", requestMethod);
            this.requestMethod = requestMethod;
            return this;
        }

        /**
         * <p>The ID of the exclusive resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>3242432423</p>
         */
        public Builder resourceGroupId(Long resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The format in which the response of the API request is returned. Valid values: 0 and 1. The value 0 indicates the JSON format. The value 1 indicates the XML format. APIs generated in wizard or script mode support the JSON format. APIs generated by registration support the JSON and XML formats.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder responseContentType(Integer responseContentType) {
            this.putBodyParameter("ResponseContentType", responseContentType);
            this.responseContentType = responseContentType;
            return this;
        }

        /**
         * <p>The details of the API generated in script mode. For more information, see the ScriptDetails parameter returned by the <a href="https://help.aliyun.com/document_detail/174013.html">GetDataServiceApi</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;isPagedResponse&quot;:false,&quot;script&quot;:&quot;select id as id1, name as name1 from person where id=${inputid}&quot;,&quot;scriptConnection&quot;:{&quot;connectionId&quot;:122786,&quot;tableName&quot;:&quot;person&quot;},&quot;scriptRequestParameters&quot;:[{&quot;defaultValue&quot;:&quot;&quot;,&quot;exampleValue&quot;:&quot;&quot;,&quot;isRequiredParameter&quot;:true,&quot;parameterDataType&quot;:0,&quot;parameterDescription&quot;:&quot;&quot;,&quot;parameterName&quot;:&quot;inputid&quot;,&quot;parameterOperator&quot;:0,&quot;parameterPosition&quot;:1}],&quot;scriptResponseParameters&quot;:[{&quot;exampleValue&quot;:&quot;&quot;,&quot;parameterDataType&quot;:0,&quot;parameterDescription&quot;:&quot;&quot;,&quot;parameterName&quot;:&quot;id1&quot;},{&quot;exampleValue&quot;:&quot;&quot;,&quot;parameterDataType&quot;:0,&quot;parameterDescription&quot;:&quot;&quot;,&quot;parameterName&quot;:&quot;name1&quot;}]}</p>
         */
        public Builder scriptDetails(String scriptDetails) {
            this.putBodyParameter("ScriptDetails", scriptDetails);
            this.scriptDetails = scriptDetails;
            return this;
        }

        /**
         * <p>The tenant ID. To obtain the tenant ID, perform the following steps: Log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>. Find your workspace and go to the DataStudio page. On the DataStudio page, click the username for the logon in the upper-right corner and click User Info in the Menu section.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder tenantId(Long tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>The timeout period of the API request. Unit: milliseconds. Valid values: (0,30000].</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder timeout(Integer timeout) {
            this.putBodyParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        /**
         * <p>The scope in which the API is visible. Valid values: 0 and 1. The value 0 indicates that the API is visible within the workspace. The value 1 indicates that the API is visible only to its owner.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder visibleRange(Integer visibleRange) {
            this.putBodyParameter("VisibleRange", visibleRange);
            this.visibleRange = visibleRange;
            return this;
        }

        /**
         * <p>The details of the API generated in wizard mode. For more information, see the WizardDetails parameter returned by the <a href="https://help.aliyun.com/document_detail/174013.html">GetDataServiceApi</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;isPagedResponse&quot;:true,&quot;wizardConnection&quot;:{&quot;connectionId&quot;:122786,&quot;tableName&quot;:&quot;person&quot;},&quot;wizardRequestParameters&quot;:[{&quot;columnName&quot;:&quot;id&quot;,&quot;defaultValue&quot;:&quot;&quot;,&quot;exampleValue&quot;:&quot;1&quot;,&quot;isRequiredParameter&quot;:true,&quot;parameterDataType&quot;:2,&quot;parameterDescription&quot;:&quot;&quot;,&quot;parameterName&quot;:&quot;id&quot;,&quot;parameterOperator&quot;:0,&quot;parameterPosition&quot;:0}],&quot;wizardResponseParameters&quot;:[{&quot;columnName&quot;:&quot;id&quot;,&quot;exampleValue&quot;:&quot;11&quot;,&quot;parameterDataType&quot;:2,&quot;parameterDescription&quot;:&quot;&quot;,&quot;parameterName&quot;:&quot;id&quot;}]}</p>
         */
        public Builder wizardDetails(String wizardDetails) {
            this.putBodyParameter("WizardDetails", wizardDetails);
            this.wizardDetails = wizardDetails;
            return this;
        }

        @Override
        public UpdateDataServiceApiRequest build() {
            return new UpdateDataServiceApiRequest(this);
        } 

    } 

}
