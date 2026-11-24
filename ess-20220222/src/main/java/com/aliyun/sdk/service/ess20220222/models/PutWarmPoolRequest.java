// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

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
 * {@link PutWarmPoolRequest} extends {@link RequestModel}
 *
 * <p>PutWarmPoolRequest</p>
 */
public class PutWarmPoolRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CapacityOptions")
    private CapacityOptions capacityOptions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceReusePolicy")
    private InstanceReusePolicy instanceReusePolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PoolState")
    private String poolState;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scalingGroupId;

    private PutWarmPoolRequest(Builder builder) {
        super(builder);
        this.capacityOptions = builder.capacityOptions;
        this.clientToken = builder.clientToken;
        this.instanceReusePolicy = builder.instanceReusePolicy;
        this.poolState = builder.poolState;
        this.regionId = builder.regionId;
        this.scalingGroupId = builder.scalingGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutWarmPoolRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return capacityOptions
     */
    public CapacityOptions getCapacityOptions() {
        return this.capacityOptions;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return instanceReusePolicy
     */
    public InstanceReusePolicy getInstanceReusePolicy() {
        return this.instanceReusePolicy;
    }

    /**
     * @return poolState
     */
    public String getPoolState() {
        return this.poolState;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return scalingGroupId
     */
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public static final class Builder extends Request.Builder<PutWarmPoolRequest, Builder> {
        private CapacityOptions capacityOptions; 
        private String clientToken; 
        private InstanceReusePolicy instanceReusePolicy; 
        private String poolState; 
        private String regionId; 
        private String scalingGroupId; 

        private Builder() {
            super();
        } 

        private Builder(PutWarmPoolRequest request) {
            super(request);
            this.capacityOptions = request.capacityOptions;
            this.clientToken = request.clientToken;
            this.instanceReusePolicy = request.instanceReusePolicy;
            this.poolState = request.poolState;
            this.regionId = request.regionId;
            this.scalingGroupId = request.scalingGroupId;
        } 

        /**
         * <p>The capacity options for the warm pool.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder capacityOptions(CapacityOptions capacityOptions) {
            this.putQueryParameter("CapacityOptions", capacityOptions);
            this.capacityOptions = capacityOptions;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must ensure that it is unique among different requests.</p>
         * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25965.html">How to ensure idempotence</a>.</p>
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
         * <p>The instance reclaim policy.</p>
         */
        public Builder instanceReusePolicy(InstanceReusePolicy instanceReusePolicy) {
            this.putQueryParameter("InstanceReusePolicy", instanceReusePolicy);
            this.instanceReusePolicy = instanceReusePolicy;
            return this;
        }

        /**
         * <p>The state of instances in the warm pool. Valid values:</p>
         * <ul>
         * <li>Running: The instances are in the running state. This state allows faster scale-out, but you are charged for the full cost of the instances.</li>
         * <li>Stopped: The instances are in the economical mode. You are charged only for resources such as cloud disks, elastic IP addresses (EIPs), and snapshots of the instances. However, instance startup may fail during scale-out due to insufficient inventory.</li>
         * </ul>
         * <p>Default value: Stopped.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder poolState(String poolState) {
            this.putQueryParameter("PoolState", poolState);
            this.poolState = poolState;
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
         * <p>The ID of the scaling group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-bp1fo0dbtsbmqa9h****</p>
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        @Override
        public PutWarmPoolRequest build() {
            return new PutWarmPoolRequest(this);
        } 

    } 

    /**
     * 
     * {@link PutWarmPoolRequest} extends {@link TeaModel}
     *
     * <p>PutWarmPoolRequest</p>
     */
    public static class CapacityOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DesiredGroupPreparedCapacity")
        private Integer desiredGroupPreparedCapacity;

        @com.aliyun.core.annotation.NameInMap("MinCapacity")
        private Integer minCapacity;

        private CapacityOptions(Builder builder) {
            this.desiredGroupPreparedCapacity = builder.desiredGroupPreparedCapacity;
            this.minCapacity = builder.minCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CapacityOptions create() {
            return builder().build();
        }

        /**
         * @return desiredGroupPreparedCapacity
         */
        public Integer getDesiredGroupPreparedCapacity() {
            return this.desiredGroupPreparedCapacity;
        }

        /**
         * @return minCapacity
         */
        public Integer getMinCapacity() {
            return this.minCapacity;
        }

        public static final class Builder {
            private Integer desiredGroupPreparedCapacity; 
            private Integer minCapacity; 

            private Builder() {
            } 

            private Builder(CapacityOptions model) {
                this.desiredGroupPreparedCapacity = model.desiredGroupPreparedCapacity;
                this.minCapacity = model.minCapacity;
            } 

            /**
             * <p>The expected number of instances to be warmed. The system maintains the sum of the current number of instances in the scaling group and the number of instances in the warm pool at this value. Instances that exceed the current number of instances in the scaling group are scaled out into the warm pool in advance. When traffic peaks occur, instances can be quickly added from the warm pool, avoiding the wait time caused by creating instances on demand.</p>
             * <p>Default value: the maximum number of instances in the scaling group, which is specified by <code>MaxSize</code>.</p>
             * <blockquote>
             * <p>The value of <code>DesiredGroupPreparedCapacity</code> must be less than or equal to the maximum number of instances in the scaling group, which is specified by <code>MaxSize</code>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder desiredGroupPreparedCapacity(Integer desiredGroupPreparedCapacity) {
                this.desiredGroupPreparedCapacity = desiredGroupPreparedCapacity;
                return this;
            }

            /**
             * <p>The minimum number of instances in the warm pool. The system always keeps at least this number of warmed instances in the warm pool to ensure that instances can be quickly added from the warm pool during scale-out.</p>
             * <p>Default value: 0.</p>
             * <blockquote>
             * <p>The value of <code>MinCapacity</code> must be less than or equal to the value of <code>DesiredGroupPreparedCapacity</code>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder minCapacity(Integer minCapacity) {
                this.minCapacity = minCapacity;
                return this;
            }

            public CapacityOptions build() {
                return new CapacityOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link PutWarmPoolRequest} extends {@link TeaModel}
     *
     * <p>PutWarmPoolRequest</p>
     */
    public static class InstanceReusePolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReuseOnScaleIn")
        private Boolean reuseOnScaleIn;

        private InstanceReusePolicy(Builder builder) {
            this.reuseOnScaleIn = builder.reuseOnScaleIn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceReusePolicy create() {
            return builder().build();
        }

        /**
         * @return reuseOnScaleIn
         */
        public Boolean getReuseOnScaleIn() {
            return this.reuseOnScaleIn;
        }

        public static final class Builder {
            private Boolean reuseOnScaleIn; 

            private Builder() {
            } 

            private Builder(InstanceReusePolicy model) {
                this.reuseOnScaleIn = model.reuseOnScaleIn;
            } 

            /**
             * <p>Specifies whether instances are reclaimed to the warm pool when the scaling group scales in. Valid values:</p>
             * <ul>
             * <li>true: Instances are reclaimed to the warm pool.</li>
             * <li>false: Instances are not reclaimed to the warm pool.</li>
             * </ul>
             * <p>Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder reuseOnScaleIn(Boolean reuseOnScaleIn) {
                this.reuseOnScaleIn = reuseOnScaleIn;
                return this;
            }

            public InstanceReusePolicy build() {
                return new InstanceReusePolicy(this);
            } 

        } 

    }
}
