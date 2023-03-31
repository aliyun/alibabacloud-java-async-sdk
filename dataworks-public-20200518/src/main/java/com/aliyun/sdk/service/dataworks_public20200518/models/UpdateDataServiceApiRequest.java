// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDataServiceApiRequest} extends {@link RequestModel}
 *
 * <p>UpdateDataServiceApiRequest</p>
 */
public class UpdateDataServiceApiRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("ApiDescription")
    @Validation(required = true)
    private String apiDescription;

    @Body
    @NameInMap("ApiId")
    @Validation(required = true)
    private Long apiId;

    @Body
    @NameInMap("ApiPath")
    @Validation(required = true)
    private String apiPath;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true)
    private Long projectId;

    @Body
    @NameInMap("Protocols")
    @Validation(required = true)
    private String protocols;

    @Body
    @NameInMap("RegistrationDetails")
    private String registrationDetails;

    @Body
    @NameInMap("RequestMethod")
    @Validation(required = true)
    private Integer requestMethod;

    @Body
    @NameInMap("ResourceGroupId")
    private Long resourceGroupId;

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
         * The ID of the API.
         */
        public Builder apiId(Long apiId) {
            this.putBodyParameter("ApiId", apiId);
            this.apiId = apiId;
            return this;
        }

        /**
         * The path of the API.
         */
        public Builder apiPath(String apiPath) {
            this.putBodyParameter("ApiPath", apiPath);
            this.apiPath = apiPath;
            return this;
        }

        /**
         * The ID of the workspace.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The protocol used by the API. Valid values: 0 and 1. The value 0 indicates HTTP. The value 1 indicates HTTPS. You can specify multiple protocols. Separate multiple protocols with commas (,).
         */
        public Builder protocols(String protocols) {
            this.putBodyParameter("Protocols", protocols);
            this.protocols = protocols;
            return this;
        }

        /**
         * The details of the API generated by registration. For more information, see the RegistrationDetails parameter returned by the [GetDataServiceApi](~~174013~~) operation.
         */
        public Builder registrationDetails(String registrationDetails) {
            this.putBodyParameter("RegistrationDetails", registrationDetails);
            this.registrationDetails = registrationDetails;
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
         * ResourceGroupId.
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
         * The details of the API generated in script mode. For more information, see the ScriptDetails parameter returned by the [GetDataServiceApi](~~174013~~) operation.
         */
        public Builder scriptDetails(String scriptDetails) {
            this.putBodyParameter("ScriptDetails", scriptDetails);
            this.scriptDetails = scriptDetails;
            return this;
        }

        /**
         * The ID of the tenant.
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
         * The scope in which the API is visible. Valid values: 0 and 1. The value 0 indicates that the API is visible within the workspace. The value 1 indicates that the API is visible only to its owner.
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
        public UpdateDataServiceApiRequest build() {
            return new UpdateDataServiceApiRequest(this);
        } 

    } 

}
