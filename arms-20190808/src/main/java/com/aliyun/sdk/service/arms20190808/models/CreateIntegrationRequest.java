// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIntegrationRequest} extends {@link RequestModel}
 *
 * <p>CreateIntegrationRequest</p>
 */
public class CreateIntegrationRequest extends Request {
    @Body
    @NameInMap("AutoRecover")
    private Boolean autoRecover;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("IntegrationName")
    @Validation(required = true)
    private String integrationName;

    @Body
    @NameInMap("IntegrationProductType")
    @Validation(required = true)
    private String integrationProductType;

    @Body
    @NameInMap("RecoverTime")
    private Long recoverTime;

    @Query
    @NameInMap("RegionId")
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
         * AutoRecover.
         */
        public Builder autoRecover(Boolean autoRecover) {
            this.putBodyParameter("AutoRecover", autoRecover);
            this.autoRecover = autoRecover;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * IntegrationName.
         */
        public Builder integrationName(String integrationName) {
            this.putBodyParameter("IntegrationName", integrationName);
            this.integrationName = integrationName;
            return this;
        }

        /**
         * IntegrationProductType.
         */
        public Builder integrationProductType(String integrationProductType) {
            this.putBodyParameter("IntegrationProductType", integrationProductType);
            this.integrationProductType = integrationProductType;
            return this;
        }

        /**
         * RecoverTime.
         */
        public Builder recoverTime(Long recoverTime) {
            this.putBodyParameter("RecoverTime", recoverTime);
            this.recoverTime = recoverTime;
            return this;
        }

        /**
         * RegionId.
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
