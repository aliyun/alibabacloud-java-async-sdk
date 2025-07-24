// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link GetManagedScalingPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>GetManagedScalingPolicyResponseBody</p>
 */
public class GetManagedScalingPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScalingPolicy")
    private ScalingPolicy scalingPolicy;

    private GetManagedScalingPolicyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.scalingPolicy = builder.scalingPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetManagedScalingPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scalingPolicy
     */
    public ScalingPolicy getScalingPolicy() {
        return this.scalingPolicy;
    }

    public static final class Builder {
        private String requestId; 
        private ScalingPolicy scalingPolicy; 

        private Builder() {
        } 

        private Builder(GetManagedScalingPolicyResponseBody model) {
            this.requestId = model.requestId;
            this.scalingPolicy = model.scalingPolicy;
        } 

        /**
         * <p>请求ID。</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ScalingPolicy.
         */
        public Builder scalingPolicy(ScalingPolicy scalingPolicy) {
            this.scalingPolicy = scalingPolicy;
            return this;
        }

        public GetManagedScalingPolicyResponseBody build() {
            return new GetManagedScalingPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetManagedScalingPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetManagedScalingPolicyResponseBody</p>
     */
    public static class Constraints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxCapacity")
        private Integer maxCapacity;

        @com.aliyun.core.annotation.NameInMap("MaxOnDemandCapacity")
        private Integer maxOnDemandCapacity;

        @com.aliyun.core.annotation.NameInMap("MinCapacity")
        private Integer minCapacity;

        private Constraints(Builder builder) {
            this.maxCapacity = builder.maxCapacity;
            this.maxOnDemandCapacity = builder.maxOnDemandCapacity;
            this.minCapacity = builder.minCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Constraints create() {
            return builder().build();
        }

        /**
         * @return maxCapacity
         */
        public Integer getMaxCapacity() {
            return this.maxCapacity;
        }

        /**
         * @return maxOnDemandCapacity
         */
        public Integer getMaxOnDemandCapacity() {
            return this.maxOnDemandCapacity;
        }

        /**
         * @return minCapacity
         */
        public Integer getMinCapacity() {
            return this.minCapacity;
        }

        public static final class Builder {
            private Integer maxCapacity; 
            private Integer maxOnDemandCapacity; 
            private Integer minCapacity; 

            private Builder() {
            } 

            private Builder(Constraints model) {
                this.maxCapacity = model.maxCapacity;
                this.maxOnDemandCapacity = model.maxOnDemandCapacity;
                this.minCapacity = model.minCapacity;
            } 

            /**
             * <p>最大值</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder maxCapacity(Integer maxCapacity) {
                this.maxCapacity = maxCapacity;
                return this;
            }

            /**
             * <p>最大按量数量</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxOnDemandCapacity(Integer maxOnDemandCapacity) {
                this.maxOnDemandCapacity = maxOnDemandCapacity;
                return this;
            }

            /**
             * <p>最小值</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder minCapacity(Integer minCapacity) {
                this.minCapacity = minCapacity;
                return this;
            }

            public Constraints build() {
                return new Constraints(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetManagedScalingPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetManagedScalingPolicyResponseBody</p>
     */
    public static class ScalingPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("Constraints")
        private Constraints constraints;

        @com.aliyun.core.annotation.NameInMap("ScalingPolicyId")
        private String scalingPolicyId;

        private ScalingPolicy(Builder builder) {
            this.clusterId = builder.clusterId;
            this.constraints = builder.constraints;
            this.scalingPolicyId = builder.scalingPolicyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScalingPolicy create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return constraints
         */
        public Constraints getConstraints() {
            return this.constraints;
        }

        /**
         * @return scalingPolicyId
         */
        public String getScalingPolicyId() {
            return this.scalingPolicyId;
        }

        public static final class Builder {
            private String clusterId; 
            private Constraints constraints; 
            private String scalingPolicyId; 

            private Builder() {
            } 

            private Builder(ScalingPolicy model) {
                this.clusterId = model.clusterId;
                this.constraints = model.constraints;
                this.scalingPolicyId = model.scalingPolicyId;
            } 

            /**
             * <p>集群ID。</p>
             * 
             * <strong>example:</strong>
             * <p>c-b933c5aac8fe****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>最大最小值约束</p>
             */
            public Builder constraints(Constraints constraints) {
                this.constraints = constraints;
                return this;
            }

            /**
             * <p>伸缩策略ID。</p>
             * 
             * <strong>example:</strong>
             * <p>asp-asduwe23znl***</p>
             */
            public Builder scalingPolicyId(String scalingPolicyId) {
                this.scalingPolicyId = scalingPolicyId;
                return this;
            }

            public ScalingPolicy build() {
                return new ScalingPolicy(this);
            } 

        } 

    }
}
