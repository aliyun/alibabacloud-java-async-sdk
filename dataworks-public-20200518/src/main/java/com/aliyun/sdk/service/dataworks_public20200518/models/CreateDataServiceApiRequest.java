// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The description of the API.
         */
        public Builder apiDescription(String apiDescription) {
            this.putBodyParameter("ApiDescription", apiDescription);
            this.apiDescription = apiDescription;
            return this;
        }

        /**
         * The type of the API. Valid values: 0, 1, and 2. The value 0 indicates that the API is generated in wizard mode. The value 1 indicates that the API is generated in script mode. The value 2 indicates that the API is generated by registration.
         */
        public Builder apiMode(Integer apiMode) {
            this.putBodyParameter("ApiMode", apiMode);
            this.apiMode = apiMode;
            return this;
        }

        /**
         * The name of the API. The name must be 4 to 50 characters in length. The name can contain letters, digits, and underscores (\_) and must start with a letter.
         */
        public Builder apiName(String apiName) {
            this.putBodyParameter("ApiName", apiName);
            this.apiName = apiName;
            return this;
        }

        /**
         * The path of the API. The path cannot exceed 200 characters in length. The path can contain letters, digits, underscores (\_), and hyphens (-) and must start with a forward slash (/).
         */
        public Builder apiPath(String apiPath) {
            this.putBodyParameter("ApiPath", apiPath);
            this.apiPath = apiPath;
            return this;
        }

        /**
         * The ID of the folder used to store the API. The ID of the root folder in a business process is 0. The ID of the folder created by a user must be greater than 0.
         */
        public Builder folderId(Long folderId) {
            this.putBodyParameter("FolderId", folderId);
            this.folderId = folderId;
            return this;
        }

        /**
         * The business process ID.
         */
        public Builder groupId(String groupId) {
            this.putBodyParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The workspace ID.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The protocol used by the API. Valid values: 0 and 1. The value 0 indicates HTTP. The value 1 indicates HTTPS. You can specify multiple protocols. Separate them with commas (,).
         */
        public Builder protocols(String protocols) {
            this.putBodyParameter("Protocols", protocols);
            this.protocols = protocols;
            return this;
        }

        /**
         * The details of the API generated by registration. For more information, see the registrationDetails parameter returned by the [GetDataServiceApi](~~174013~~) operation.
         */
        public Builder registrationDetails(String registrationDetails) {
            this.putBodyParameter("RegistrationDetails", registrationDetails);
            this.registrationDetails = registrationDetails;
            return this;
        }

        /**
         * The format of the data to be requested. Valid values:
         * <p>
         * 
         * *   0: XML format
         * *   1: JSON format
         * *   2: form format
         */
        public Builder requestContentType(Integer requestContentType) {
            this.putBodyParameter("RequestContentType", requestContentType);
            this.requestContentType = requestContentType;
            return this;
        }

        /**
         * The request method of the API. Valid values: 0, 1, 2, and 3. The value 0 indicates the GET method. The value 1 indicates the POST method. The value 2 indicates the PUT method. The value 3 indicates the DELETE method. APIs generated in wizard or script mode support the GET and POST methods. APIs generated by registration support the GET, POST, PUT, and DELETE methods.
         */
        public Builder requestMethod(Integer requestMethod) {
            this.putBodyParameter("RequestMethod", requestMethod);
            this.requestMethod = requestMethod;
            return this;
        }

        /**
         * The ID of the exclusive resource group.
         */
        public Builder resourceGroupId(Long resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The format in which the response of the API request is returned. Valid values: 0 and 1. The value 0 indicates the JSON format. The value 1 indicates the XML format. APIs generated in wizard or script mode support the JSON format. APIs generated by registration support the JSON and XML formats.
         */
        public Builder responseContentType(Integer responseContentType) {
            this.putBodyParameter("ResponseContentType", responseContentType);
            this.responseContentType = responseContentType;
            return this;
        }

        /**
         * The details of the API generated in script mode. For more information, see the scriptDetails parameter returned by the [GetDataServiceApi](~~174013~~) operation.
         */
        public Builder scriptDetails(String scriptDetails) {
            this.putBodyParameter("ScriptDetails", scriptDetails);
            this.scriptDetails = scriptDetails;
            return this;
        }

        /**
         * *   The SQL mode. Valid values: 0: The basic mode is used.
         * <p>
         * *   1: Mybatis is used.
         */
        public Builder sqlMode(Long sqlMode) {
            this.putBodyParameter("SqlMode", sqlMode);
            this.sqlMode = sqlMode;
            return this;
        }

        /**
         * The tenant ID.
         */
        public Builder tenantId(Long tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * The timeout period of the API request. Unit: milliseconds. Valid values: (0,30000].
         */
        public Builder timeout(Integer timeout) {
            this.putBodyParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        /**
         * The scope in which the API is visible. Valid values: 0 and 1. The value 0 indicates that the API is visible to all members in the workspace. The value 1 indicates that the API is visible only to its owner.
         */
        public Builder visibleRange(Integer visibleRange) {
            this.putBodyParameter("VisibleRange", visibleRange);
            this.visibleRange = visibleRange;
            return this;
        }

        /**
         * The details of the API generated in wizard mode. For more information, see the WizardDetails parameter returned by the [GetDataServiceApi](~~174013~~) operation.
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
