// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIntegrationRequest} extends {@link RequestModel}
 *
 * <p>CreateIntegrationRequest</p>
 */
public class CreateIntegrationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoRecover")
    private Boolean autoRecover;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IntegrationName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String integrationName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IntegrationProductType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String integrationProductType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RecoverTime")
    private Long recoverTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private CreateIntegrationRequest(Builder builder) {
        super(builder);
        this.autoRecover = builder.autoRecover;
        this.description = builder.description;
        this.integrationName = builder.integrationName;
        this.integrationProductType = builder.integrationProductType;
        this.recoverTime = builder.recoverTime;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIntegrationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoRecover
     */
    public Boolean getAutoRecover() {
        return this.autoRecover;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return integrationName
     */
    public String getIntegrationName() {
        return this.integrationName;
    }

    /**
     * @return integrationProductType
     */
    public String getIntegrationProductType() {
        return this.integrationProductType;
    }

    /**
     * @return recoverTime
     */
    public Long getRecoverTime() {
        return this.recoverTime;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateIntegrationRequest, Builder> {
        private Boolean autoRecover; 
        private String description; 
        private String integrationName; 
        private String integrationProductType; 
        private Long recoverTime; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateIntegrationRequest request) {
            super(request);
            this.autoRecover = request.autoRecover;
            this.description = request.description;
            this.integrationName = request.integrationName;
            this.integrationProductType = request.integrationProductType;
            this.recoverTime = request.recoverTime;
            this.regionId = request.regionId;
        } 

        /**
         * Specifies whether to automatically clear alert events. Default value: true. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder autoRecover(Boolean autoRecover) {
            this.putBodyParameter("AutoRecover", autoRecover);
            this.autoRecover = autoRecover;
            return this;
        }

        /**
         * The description of the alert integration.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The name of the alert integration.
         */
        public Builder integrationName(String integrationName) {
            this.putBodyParameter("IntegrationName", integrationName);
            this.integrationName = integrationName;
            return this;
        }

        /**
         * The service of the alert integration. Valid values:
         * <p>
         * 
         * *   CLOUD_MONITOR: CloudMonitor
         * *   LOG_SERVICE: Log Service
         */
        public Builder integrationProductType(String integrationProductType) {
            this.putBodyParameter("IntegrationProductType", integrationProductType);
            this.integrationProductType = integrationProductType;
            return this;
        }

        /**
         * The period of time within which alert events are automatically cleared. Unit: seconds. Default value: 300.
         */
        public Builder recoverTime(Long recoverTime) {
            this.putBodyParameter("RecoverTime", recoverTime);
            this.recoverTime = recoverTime;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateIntegrationRequest build() {
            return new CreateIntegrationRequest(this);
        } 

    } 

}
