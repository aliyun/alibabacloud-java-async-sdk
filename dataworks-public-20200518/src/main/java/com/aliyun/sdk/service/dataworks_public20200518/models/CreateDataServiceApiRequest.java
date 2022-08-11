// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDataServiceApiRequest} extends {@link RequestModel}
 *
 * <p>CreateDataServiceApiRequest</p>
 */
public class CreateDataServiceApiRequest extends Request {
    @Body
    @NameInMap("ApiDescription")
    @Validation(required = true)
    private String apiDescription;

    @Body
    @NameInMap("ApiMode")
    @Validation(required = true)
    private Integer apiMode;

    @Body
    @NameInMap("ApiName")
    @Validation(required = true)
    private String apiName;

    @Body
    @NameInMap("ApiPath")
    @Validation(required = true)
    private String apiPath;

    @Body
    @NameInMap("FolderId")
    @Validation()
    private Long folderId;

    @Body
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true)
    private Long projectId;

    @Body
    @NameInMap("Protocols")
    @Validation(required = true)
    private String protocols;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("RegistrationDetails")
    private String registrationDetails;

    @Body
    @NameInMap("RequestMethod")
    @Validation(required = true)
    private Integer requestMethod;

    @Body
    @NameInMap("ResponseContentType")
    @Validation(required = true)
    private Integer responseContentType;

    @Body
    @NameInMap("ScriptDetails")
    private String scriptDetails;

    @Body
    @NameInMap("TenantId")
    @Validation(required = true)
    private Long tenantId;

    @Body
    @NameInMap("Timeout")
    @Validation(required = true)
    private Integer timeout;

    @Body
    @NameInMap("VisibleRange")
    @Validation(required = true)
    private Integer visibleRange;

    @Body
    @NameInMap("WizardDetails")
    private String wizardDetails;

    private CreateDataServiceApiRequest(Builder builder) {
        super(builder);
        this.apiDescription = builder.apiDescription;
        this.apiMode = builder.apiMode;
        this.apiName = builder.apiName;
        this.apiPath = builder.apiPath;
        this.folderId = builder.folderId;
        this.groupId = builder.groupId;
        this.projectId = builder.projectId;
        this.protocols = builder.protocols;
        this.regionId = builder.regionId;
        this.registrationDetails = builder.registrationDetails;
        this.requestMethod = builder.requestMethod;
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

    public static CreateDataServiceApiRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<CreateDataServiceApiRequest, Builder> {
        private String apiDescription; 
        private Integer apiMode; 
        private String apiName; 
        private String apiPath; 
        private Long folderId; 
        private String groupId; 
        private Long projectId; 
        private String protocols; 
        private String regionId; 
        private String registrationDetails; 
        private Integer requestMethod; 
        private Integer responseContentType; 
        private String scriptDetails; 
        private Long tenantId; 
        private Integer timeout; 
        private Integer visibleRange; 
        private String wizardDetails; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataServiceApiRequest request) {
            super(request);
            this.apiDescription = request.apiDescription;
            this.apiMode = request.apiMode;
            this.apiName = request.apiName;
            this.apiPath = request.apiPath;
            this.folderId = request.folderId;
            this.groupId = request.groupId;
            this.projectId = request.projectId;
            this.protocols = request.protocols;
            this.regionId = request.regionId;
            this.registrationDetails = request.registrationDetails;
            this.requestMethod = request.requestMethod;
            this.responseContentType = request.responseContentType;
            this.scriptDetails = request.scriptDetails;
            this.tenantId = request.tenantId;
            this.timeout = request.timeout;
            this.visibleRange = request.visibleRange;
            this.wizardDetails = request.wizardDetails;
        } 

        /**
         * ApiDescription.
         */
        public Builder apiDescription(String apiDescription) {
            this.putBodyParameter("ApiDescription", apiDescription);
            this.apiDescription = apiDescription;
            return this;
        }

        /**
         * ApiMode.
         */
        public Builder apiMode(Integer apiMode) {
            this.putBodyParameter("ApiMode", apiMode);
            this.apiMode = apiMode;
            return this;
        }

        /**
         * ApiName.
         */
        public Builder apiName(String apiName) {
            this.putBodyParameter("ApiName", apiName);
            this.apiName = apiName;
            return this;
        }

        /**
         * ApiPath.
         */
        public Builder apiPath(String apiPath) {
            this.putBodyParameter("ApiPath", apiPath);
            this.apiPath = apiPath;
            return this;
        }

        /**
         * FolderId.
         */
        public Builder folderId(Long folderId) {
            this.putBodyParameter("FolderId", folderId);
            this.folderId = folderId;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putBodyParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * Protocols.
         */
        public Builder protocols(String protocols) {
            this.putBodyParameter("Protocols", protocols);
            this.protocols = protocols;
            return this;
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
         * RegistrationDetails.
         */
        public Builder registrationDetails(String registrationDetails) {
            this.putBodyParameter("RegistrationDetails", registrationDetails);
            this.registrationDetails = registrationDetails;
            return this;
        }

        /**
         * RequestMethod.
         */
        public Builder requestMethod(Integer requestMethod) {
            this.putBodyParameter("RequestMethod", requestMethod);
            this.requestMethod = requestMethod;
            return this;
        }

        /**
         * ResponseContentType.
         */
        public Builder responseContentType(Integer responseContentType) {
            this.putBodyParameter("ResponseContentType", responseContentType);
            this.responseContentType = responseContentType;
            return this;
        }

        /**
         * ScriptDetails.
         */
        public Builder scriptDetails(String scriptDetails) {
            this.putBodyParameter("ScriptDetails", scriptDetails);
            this.scriptDetails = scriptDetails;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(Long tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * Timeout.
         */
        public Builder timeout(Integer timeout) {
            this.putBodyParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        /**
         * VisibleRange.
         */
        public Builder visibleRange(Integer visibleRange) {
            this.putBodyParameter("VisibleRange", visibleRange);
            this.visibleRange = visibleRange;
            return this;
        }

        /**
         * WizardDetails.
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
