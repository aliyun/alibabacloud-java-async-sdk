// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetLiveStreamOptimizedFeatureConfigRequest} extends {@link RequestModel}
 *
 * <p>SetLiveStreamOptimizedFeatureConfigRequest</p>
 */
public class SetLiveStreamOptimizedFeatureConfigRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ConfigName")
    @Validation(required = true)
    private String configName;

    @Query
    @NameInMap("ConfigStatus")
    @Validation(required = true)
    private String configStatus;

    @Query
    @NameInMap("ConfigValue")
    private String configValue;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private SetLiveStreamOptimizedFeatureConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.configName = builder.configName;
        this.configStatus = builder.configStatus;
        this.configValue = builder.configValue;
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetLiveStreamOptimizedFeatureConfigRequest create() {
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
     * @return configName
     */
    public String getConfigName() {
        return this.configName;
    }

    /**
     * @return configStatus
     */
    public String getConfigStatus() {
        return this.configStatus;
    }

    /**
     * @return configValue
     */
    public String getConfigValue() {
        return this.configValue;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<SetLiveStreamOptimizedFeatureConfigRequest, Builder> {
        private String regionId; 
        private String configName; 
        private String configStatus; 
        private String configValue; 
        private String domainName; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(SetLiveStreamOptimizedFeatureConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.configName = request.configName;
            this.configStatus = request.configStatus;
            this.configValue = request.configValue;
            this.domainName = request.domainName;
            this.ownerId = request.ownerId;
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
         * ConfigName.
         */
        public Builder configName(String configName) {
            this.putQueryParameter("ConfigName", configName);
            this.configName = configName;
            return this;
        }

        /**
         * ConfigStatus.
         */
        public Builder configStatus(String configStatus) {
            this.putQueryParameter("ConfigStatus", configStatus);
            this.configStatus = configStatus;
            return this;
        }

        /**
         * ConfigValue.
         */
        public Builder configValue(String configValue) {
            this.putQueryParameter("ConfigValue", configValue);
            this.configValue = configValue;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public SetLiveStreamOptimizedFeatureConfigRequest build() {
            return new SetLiveStreamOptimizedFeatureConfigRequest(this);
        } 

    } 

}
