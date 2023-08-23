// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachLoadBalancersRequest} extends {@link RequestModel}
 *
 * <p>AttachLoadBalancersRequest</p>
 */
public class AttachLoadBalancersRequest extends Request {
    @Query
    @NameInMap("Async")
    private Boolean async;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ForceAttach")
    private Boolean forceAttach;

    @Query
    @NameInMap("LoadBalancerConfigs")
    private java.util.List < LoadBalancerConfigs> loadBalancerConfigs;

    @Query
    @NameInMap("LoadBalancers")
    private java.util.List < String > loadBalancers;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ScalingGroupId")
    @Validation(required = true)
    private String scalingGroupId;

    private AttachLoadBalancersRequest(Builder builder) {
        super(builder);
        this.async = builder.async;
        this.clientToken = builder.clientToken;
        this.forceAttach = builder.forceAttach;
        this.loadBalancerConfigs = builder.loadBalancerConfigs;
        this.loadBalancers = builder.loadBalancers;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.scalingGroupId = builder.scalingGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachLoadBalancersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return async
     */
    public Boolean getAsync() {
        return this.async;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return forceAttach
     */
    public Boolean getForceAttach() {
        return this.forceAttach;
    }

    /**
     * @return loadBalancerConfigs
     */
    public java.util.List < LoadBalancerConfigs> getLoadBalancerConfigs() {
        return this.loadBalancerConfigs;
    }

    /**
     * @return loadBalancers
     */
    public java.util.List < String > getLoadBalancers() {
        return this.loadBalancers;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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

    public static final class Builder extends Request.Builder<AttachLoadBalancersRequest, Builder> {
        private Boolean async; 
        private String clientToken; 
        private Boolean forceAttach; 
        private java.util.List < LoadBalancerConfigs> loadBalancerConfigs; 
        private java.util.List < String > loadBalancers; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private String scalingGroupId; 

        private Builder() {
            super();
        } 

        private Builder(AttachLoadBalancersRequest request) {
            super(request);
            this.async = request.async;
            this.clientToken = request.clientToken;
            this.forceAttach = request.forceAttach;
            this.loadBalancerConfigs = request.loadBalancerConfigs;
            this.loadBalancers = request.loadBalancers;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.scalingGroupId = request.scalingGroupId;
        } 

        /**
         * Async.
         */
        public Builder async(Boolean async) {
            this.putQueryParameter("Async", async);
            this.async = async;
            return this;
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
         * ForceAttach.
         */
        public Builder forceAttach(Boolean forceAttach) {
            this.putQueryParameter("ForceAttach", forceAttach);
            this.forceAttach = forceAttach;
            return this;
        }

        /**
         * LoadBalancerConfigs.
         */
        public Builder loadBalancerConfigs(java.util.List < LoadBalancerConfigs> loadBalancerConfigs) {
            this.putQueryParameter("LoadBalancerConfigs", loadBalancerConfigs);
            this.loadBalancerConfigs = loadBalancerConfigs;
            return this;
        }

        /**
         * LoadBalancers.
         */
        public Builder loadBalancers(java.util.List < String > loadBalancers) {
            this.putQueryParameter("LoadBalancers", loadBalancers);
            this.loadBalancers = loadBalancers;
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
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ScalingGroupId.
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        @Override
        public AttachLoadBalancersRequest build() {
            return new AttachLoadBalancersRequest(this);
        } 

    } 

    public static class LoadBalancerConfigs extends TeaModel {
        @NameInMap("LoadBalancerId")
        private String loadBalancerId;

        @NameInMap("Weight")
        private Integer weight;

        private LoadBalancerConfigs(Builder builder) {
            this.loadBalancerId = builder.loadBalancerId;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoadBalancerConfigs create() {
            return builder().build();
        }

        /**
         * @return loadBalancerId
         */
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String loadBalancerId; 
            private Integer weight; 

            /**
             * LoadBalancerId.
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * Weight.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public LoadBalancerConfigs build() {
                return new LoadBalancerConfigs(this);
            } 

        } 

    }
}
