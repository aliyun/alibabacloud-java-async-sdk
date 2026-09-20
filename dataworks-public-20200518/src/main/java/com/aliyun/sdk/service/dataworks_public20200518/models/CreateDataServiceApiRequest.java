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
 * {@link CreateDataServiceApiRequest} extends {@link RequestModel}
 *
 * <p>CreateDataServiceApiRequest</p>
 */
public class CreateDataServiceApiRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApiDescription")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApiMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer apiMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApiName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApiPath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiPath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FolderId")
    @com.aliyun.core.annotation.Validation()
    private Long folderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

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
    @com.aliyun.core.annotation.NameInMap("RequestContentType")
    private Integer requestContentType;

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
    @com.aliyun.core.annotation.NameInMap("SqlMode")
    private Long sqlMode;

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

    private CreateDataServiceApiRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.apiDescription = builder.apiDescription;
        this.apiMode = builder.apiMode;
        this.apiName = builder.apiName;
        this.apiPath = builder.apiPath;
        this.folderId = builder.folderId;
        this.groupId = builder.groupId;
        this.projectId = builder.projectId;
        this.protocols = builder.protocols;
        this.registrationDetails = builder.registrationDetails;
        this.requestContentType = builder.requestContentType;
        this.requestMethod = builder.requestMethod;
        this.resourceGroupId = builder.resourceGroupId;
        this.responseContentType = builder.responseContentType;
        this.scriptDetails = builder.scriptDetails;
        this.sqlMode = builder.sqlMode;
        this.tenantId = builder.tenantId;
        this.timeout = builder.timeout;
        this.visibleRange = builder.visibleRange;
        this.wizardDetails = builder.wizardDetails;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataServiceApiRequest create() {
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
     * @return apiMode
     */
    public Integer getApiMode() {
        return this.apiMode;
    }

    /**
     * @return apiName
     */
    public String getApiName() {
        return this.apiName;
    }

    /**
     * @return apiPath
     */
    public String getApiPath() {
        return this.apiPath;
    }

    /**
     * @return folderId
     */
    public Long getFolderId() {
        return this.folderId;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
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
     * @return requestContentType
     */
    public Integer getRequestContentType() {
        return this.requestContentType;
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
     * @return sqlMode
     */
    public Long getSqlMode() {
        return this.sqlMode;
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

    public static final class Builder extends Request.Builder<CreateDataServiceApiRequest, Builder> {
        private String regionId; 
        private String apiDescription; 
        private Integer apiMode; 
        private String apiName; 
        private String apiPath; 
        private Long folderId; 
        private String groupId; 
        private Long projectId; 
        private String protocols; 
        private String registrationDetails; 
        private Integer requestContentType; 
        private Integer requestMethod; 
        private Long resourceGroupId; 
        private Integer responseContentType; 
        private String scriptDetails; 
        private Long sqlMode; 
        private Long tenantId; 
        private Integer timeout; 
        private Integer visibleRange; 
        private String wizardDetails; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataServiceApiRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.apiDescription = request.apiDescription;
            this.apiMode = request.apiMode;
            this.apiName = request.apiName;
            this.apiPath = request.apiPath;
            this.folderId = request.folderId;
            this.groupId = request.groupId;
            this.projectId = request.projectId;
            this.protocols = request.protocols;
            this.registrationDetails = request.registrationDetails;
            this.requestContentType = request.requestContentType;
            this.requestMethod = request.requestMethod;
            this.resourceGroupId = request.resourceGroupId;
            this.responseContentType = request.responseContentType;
            this.scriptDetails = request.scriptDetails;
            this.sqlMode = request.sqlMode;
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
         * <p>Test API description</p>
         */
        public Builder apiDescription(String apiDescription) {
            this.putBodyParameter("ApiDescription", apiDescription);
            this.apiDescription = apiDescription;
            return this;
        }

        /**
         * <p>The type of the API. Valid values: 0 (wizard API), 1 (script API), and 2 (registration API).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder apiMode(Integer apiMode) {
            this.putBodyParameter("ApiMode", apiMode);
            this.apiMode = apiMode;
            return this;
        }

        /**
         * <p>The name of the API. The name can contain Chinese characters, letters, digits, and underscores (_), and must start with a letter or a Chinese character. The name must be 4 to 50 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Test API name</p>
         */
        public Builder apiName(String apiName) {
            this.putBodyParameter("ApiName", apiName);
            this.apiName = apiName;
            return this;
        }

        /**
         * <p>The path of the API. The path can contain letters, digits, underscores (_), and hyphens (-), and must start with a forward slash (/). The path cannot exceed 200 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/test/1</p>
         */
        public Builder apiPath(String apiPath) {
            this.putBodyParameter("ApiPath", apiPath);
            this.apiPath = apiPath;
            return this;
        }

        /**
         * <p>The ID of the destination folder in which the API is created. The ID of the root folder under a business process is 0. The ID of a user-created folder is greater than 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder folderId(Long folderId) {
            this.putBodyParameter("FolderId", folderId);
            this.folderId = folderId;
            return this;
        }

        /**
         * <p>The ID of the business process.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Business process ID</p>
         */
        public Builder groupId(String groupId) {
            this.putBodyParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The protocol of the API. Valid values: 0 (HTTP) and 1 (HTTPS). Multiple values are supported. Separate multiple values with commas (,).</p>
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
         * <p>The details of the registration API. For more information, see the JSON string of the registrationDetails field in the <a href="https://help.aliyun.com/document_detail/174013.html">GetDataServiceApi</a> operation.</p>
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
         * <p>The request content type. Valid values:</p>
         * <ul>
         * <li><p>0: XML</p>
         * </li>
         * <li><p>1: JSON</p>
         * </li>
         * <li><p>2: form</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder requestContentType(Integer requestContentType) {
            this.putBodyParameter("RequestContentType", requestContentType);
            this.requestContentType = requestContentType;
            return this;
        }

        /**
         * <p>The request method of the API. Valid values: 0 (GET), 1 (POST), 2 (PUT), and 3 (DELETE). Wizard and script APIs support GET and POST. Registration APIs support GET, POST, PUT, and DELETE.</p>
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
         * <p>The response data type of the API. Valid values: 0 (JSON) and 1 (XML). Wizard and script APIs support JSON. Registration APIs support JSON and XML.</p>
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
         * <p>The details of the script API. For more information, see the JSON string of the scriptDetails field in the <a href="https://help.aliyun.com/document_detail/174013.html">GetDataServiceApi</a> operation.</p>
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
         * <ul>
         * <li><p>0: basic mode.</p>
         * </li>
         * <li><p>1: MyBatis mode.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder sqlMode(Long sqlMode) {
            this.putBodyParameter("SqlMode", sqlMode);
            this.sqlMode = sqlMode;
            return this;
        }

        /**
         * <p>The tenant ID.</p>
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
         * <p>The timeout period, in milliseconds (ms). Valid values: (0, 30000].</p>
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
         * <p>The visibility. Valid values: 0 (workspace) and 1 (private).</p>
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
         * <p>The details of the wizard API. For more information, see the JSON string of the wizardDetails field in the <a href="https://help.aliyun.com/document_detail/174013.html">GetDataServiceApi</a> operation.</p>
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
        public CreateDataServiceApiRequest build() {
            return new CreateDataServiceApiRequest(this);
        } 

    } 

}
