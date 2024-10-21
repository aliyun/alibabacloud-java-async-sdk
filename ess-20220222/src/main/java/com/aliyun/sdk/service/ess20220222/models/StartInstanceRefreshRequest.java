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
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see &quot;How to ensure idempotence&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-42665544****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The desired configurations of the instance refresh task.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>When you call this operation, you must specify one of the following parameters: ScalingConfigurationId and ImageId.</p>
         * </li>
         * <li><p>Instances whose configurations match the desired configurations of the task are ignored during instance refresh.</p>
         * </li>
         * </ul>
         */
        public Builder desiredConfiguration(DesiredConfiguration desiredConfiguration) {
            this.putQueryParameter("DesiredConfiguration", desiredConfiguration);
            this.desiredConfiguration = desiredConfiguration;
            return this;
        }

        /**
         * <p>The ratio of instances that can exceed the upper limit of the scaling group capacity to all instances in the scaling group during instance refresh. Valid values: 100 to 200. Default value: 120.</p>
         * <blockquote>
         * <p> If you set MinHealthyPercentage and MaxHealthyPercentage to 100, Auto Scaling refreshes the configurations of one instance each time the instance refresh task starts.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxHealthyPercentage(Integer maxHealthyPercentage) {
            this.putQueryParameter("MaxHealthyPercentage", maxHealthyPercentage);
            this.maxHealthyPercentage = maxHealthyPercentage;
            return this;
        }

        /**
         * <p>The ratio of instances that are in the In Service state to all instances in the scaling group during instance refresh. Valid values: 0 to 100. Default value: 80.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
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
         * <p>The region ID of the scaling group.</p>
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
         * <p>The ID of the scaling group.</p>
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
             * <p>The image ID.</p>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><p>After the instance refresh task is complete, the active scaling configuration uses the image specified by this parameter.</p>
             * </li>
             * <li><p>If the instance configuration source of the scaling group is a launch template, you cannot specify this parameter.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>m-2ze8cqacj7opnf***</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The ID of the scaling configuration.</p>
             * <blockquote>
             * <p> After the instance refresh task is complete, the scaling group uses the scaling configuration specified by this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>asc-2zed7lqn4ts4****</p>
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
