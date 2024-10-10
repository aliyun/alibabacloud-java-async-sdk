// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link StartInstanceRefreshRequest} extends {@link RequestModel}
 *
 * <p>StartInstanceRefreshRequest</p>
 */
public class StartInstanceRefreshRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesiredConfiguration")
    private DesiredConfiguration desiredConfiguration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxHealthyPercentage")
    private Integer maxHealthyPercentage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinHealthyPercentage")
    private Integer minHealthyPercentage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scalingGroupId;

    private StartInstanceRefreshRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.desiredConfiguration = builder.desiredConfiguration;
        this.maxHealthyPercentage = builder.maxHealthyPercentage;
        this.minHealthyPercentage = builder.minHealthyPercentage;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.scalingGroupId = builder.scalingGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartInstanceRefreshRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return desiredConfiguration
     */
    public DesiredConfiguration getDesiredConfiguration() {
        return this.desiredConfiguration;
    }

    /**
     * @return maxHealthyPercentage
     */
    public Integer getMaxHealthyPercentage() {
        return this.maxHealthyPercentage;
    }

    /**
     * @return minHealthyPercentage
     */
    public Integer getMinHealthyPercentage() {
        return this.minHealthyPercentage;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return scalingGroupId
     */
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public static final class Builder extends Request.Builder<StartInstanceRefreshRequest, Builder> {
        private String clientToken; 
        private DesiredConfiguration desiredConfiguration; 
        private Integer maxHealthyPercentage; 
        private Integer minHealthyPercentage; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private String scalingGroupId; 

        private Builder() {
            super();
        } 

        private Builder(StartInstanceRefreshRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.desiredConfiguration = request.desiredConfiguration;
            this.maxHealthyPercentage = request.maxHealthyPercentage;
            this.minHealthyPercentage = request.minHealthyPercentage;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.scalingGroupId = request.scalingGroupId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DesiredConfiguration.
         */
        public Builder desiredConfiguration(DesiredConfiguration desiredConfiguration) {
            this.putQueryParameter("DesiredConfiguration", desiredConfiguration);
            this.desiredConfiguration = desiredConfiguration;
            return this;
        }

        /**
         * MaxHealthyPercentage.
         */
        public Builder maxHealthyPercentage(Integer maxHealthyPercentage) {
            this.putQueryParameter("MaxHealthyPercentage", maxHealthyPercentage);
            this.maxHealthyPercentage = maxHealthyPercentage;
            return this;
        }

        /**
         * MinHealthyPercentage.
         */
        public Builder minHealthyPercentage(Integer minHealthyPercentage) {
            this.putQueryParameter("MinHealthyPercentage", minHealthyPercentage);
            this.minHealthyPercentage = minHealthyPercentage;
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

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-bp18p2yfxow2dloq****</p>
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        @Override
        public StartInstanceRefreshRequest build() {
            return new StartInstanceRefreshRequest(this);
        } 

    } 

    /**
     * 
     * {@link StartInstanceRefreshRequest} extends {@link TeaModel}
     *
     * <p>StartInstanceRefreshRequest</p>
     */
    public static class DesiredConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ScalingConfigurationId")
        private String scalingConfigurationId;

        private DesiredConfiguration(Builder builder) {
            this.imageId = builder.imageId;
            this.scalingConfigurationId = builder.scalingConfigurationId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DesiredConfiguration create() {
            return builder().build();
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return scalingConfigurationId
         */
        public String getScalingConfigurationId() {
            return this.scalingConfigurationId;
        }

        public static final class Builder {
            private String imageId; 
            private String scalingConfigurationId; 

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * ScalingConfigurationId.
             */
            public Builder scalingConfigurationId(String scalingConfigurationId) {
                this.scalingConfigurationId = scalingConfigurationId;
                return this;
            }

            public DesiredConfiguration build() {
                return new DesiredConfiguration(this);
            } 

        } 

    }
}
