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
 * {@link DescribeWarmPoolInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWarmPoolInstancesResponseBody</p>
 */
public class DescribeWarmPoolInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
    private String scalingGroupId;

    @com.aliyun.core.annotation.NameInMap("WarmPoolInstances")
    private java.util.List<WarmPoolInstances> warmPoolInstances;

    private DescribeWarmPoolInstancesResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.scalingGroupId = builder.scalingGroupId;
        this.warmPoolInstances = builder.warmPoolInstances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWarmPoolInstancesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scalingGroupId
     */
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    /**
     * @return warmPoolInstances
     */
    public java.util.List<WarmPoolInstances> getWarmPoolInstances() {
        return this.warmPoolInstances;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private String scalingGroupId; 
        private java.util.List<WarmPoolInstances> warmPoolInstances; 

        private Builder() {
        } 

        private Builder(DescribeWarmPoolInstancesResponseBody model) {
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.scalingGroupId = model.scalingGroupId;
            this.warmPoolInstances = model.warmPoolInstances;
        } 

        /**
         * <p>The token for the next query. An empty NextToken value indicates that no more results are available.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAcSz4VTb1Nq****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E38EB733-D714-4658-8A5F-0688AB68****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-bp18p2yfxow2dloq****</p>
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        /**
         * <p>The list of ECS instances in the warm pool.</p>
         */
        public Builder warmPoolInstances(java.util.List<WarmPoolInstances> warmPoolInstances) {
            this.warmPoolInstances = warmPoolInstances;
            return this;
        }

        public DescribeWarmPoolInstancesResponseBody build() {
            return new DescribeWarmPoolInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeWarmPoolInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWarmPoolInstancesResponseBody</p>
     */
    public static class WarmPoolInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("LaunchTemplateId")
        private String launchTemplateId;

        @com.aliyun.core.annotation.NameInMap("LaunchTemplateVersion")
        private String launchTemplateVersion;

        @com.aliyun.core.annotation.NameInMap("LifecycleState")
        private String lifecycleState;

        @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
        private String privateIpAddress;

        @com.aliyun.core.annotation.NameInMap("ScalingActivityId")
        private String scalingActivityId;

        @com.aliyun.core.annotation.NameInMap("ScalingConfigurationId")
        private String scalingConfigurationId;

        @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
        private String scalingGroupId;

        @com.aliyun.core.annotation.NameInMap("ScalingInstanceId")
        private String scalingInstanceId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private WarmPoolInstances(Builder builder) {
            this.createdTime = builder.createdTime;
            this.instanceId = builder.instanceId;
            this.launchTemplateId = builder.launchTemplateId;
            this.launchTemplateVersion = builder.launchTemplateVersion;
            this.lifecycleState = builder.lifecycleState;
            this.privateIpAddress = builder.privateIpAddress;
            this.scalingActivityId = builder.scalingActivityId;
            this.scalingConfigurationId = builder.scalingConfigurationId;
            this.scalingGroupId = builder.scalingGroupId;
            this.scalingInstanceId = builder.scalingInstanceId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WarmPoolInstances create() {
            return builder().build();
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return launchTemplateId
         */
        public String getLaunchTemplateId() {
            return this.launchTemplateId;
        }

        /**
         * @return launchTemplateVersion
         */
        public String getLaunchTemplateVersion() {
            return this.launchTemplateVersion;
        }

        /**
         * @return lifecycleState
         */
        public String getLifecycleState() {
            return this.lifecycleState;
        }

        /**
         * @return privateIpAddress
         */
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        /**
         * @return scalingActivityId
         */
        public String getScalingActivityId() {
            return this.scalingActivityId;
        }

        /**
         * @return scalingConfigurationId
         */
        public String getScalingConfigurationId() {
            return this.scalingConfigurationId;
        }

        /**
         * @return scalingGroupId
         */
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        /**
         * @return scalingInstanceId
         */
        public String getScalingInstanceId() {
            return this.scalingInstanceId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String createdTime; 
            private String instanceId; 
            private String launchTemplateId; 
            private String launchTemplateVersion; 
            private String lifecycleState; 
            private String privateIpAddress; 
            private String scalingActivityId; 
            private String scalingConfigurationId; 
            private String scalingGroupId; 
            private String scalingInstanceId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(WarmPoolInstances model) {
                this.createdTime = model.createdTime;
                this.instanceId = model.instanceId;
                this.launchTemplateId = model.launchTemplateId;
                this.launchTemplateVersion = model.launchTemplateVersion;
                this.lifecycleState = model.lifecycleState;
                this.privateIpAddress = model.privateIpAddress;
                this.scalingActivityId = model.scalingActivityId;
                this.scalingConfigurationId = model.scalingConfigurationId;
                this.scalingGroupId = model.scalingGroupId;
                this.scalingInstanceId = model.scalingInstanceId;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The time when the ECS instance was added to the warm pool, accurate to the second. The time is in UTC and follows the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ssZ format.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-05-18T03:11:39Z</p>
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The ID of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp1c2hf**********</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The ID of the instance launch template.</p>
             * 
             * <strong>example:</strong>
             * <p>lt-uf64k10pok76*****</p>
             */
            public Builder launchTemplateId(String launchTemplateId) {
                this.launchTemplateId = launchTemplateId;
                return this;
            }

            /**
             * <p>The version of the instance launch template.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder launchTemplateVersion(String launchTemplateVersion) {
                this.launchTemplateVersion = launchTemplateVersion;
                return this;
            }

            /**
             * <p>The lifecycle state of the ECS instance in the warm pool. Valid values:</p>
             * <ul>
             * <li><p>Pending: The ECS instance is being added to the warm pool.</p>
             * </li>
             * <li><p>Pending:Wait: The addition of the ECS instance is suspended. If a lifecycle hook that applies to scale-out activities for the warm pool is created in the scaling group, the ECS instance is suspended when it is added to the warm pool and waits for the lifecycle hook to time out.</p>
             * </li>
             * <li><p>Removing: The ECS instance is being removed from the warm pool.</p>
             * </li>
             * <li><p>Removing:Wait: The removal of the ECS instance is suspended. If a lifecycle hook that applies to scale-in activities for the warm pool is created in the scaling group, the ECS instance is suspended when it is removed from the warm pool and waits for the lifecycle hook to time out.</p>
             * </li>
             * <li><p>Running: The ECS instance is successfully added to the warm pool and is in the running state.</p>
             * </li>
             * <li><p>Stopped: The ECS instance is successfully added to the warm pool and is in the economical mode.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder lifecycleState(String lifecycleState) {
                this.lifecycleState = lifecycleState;
                return this;
            }

            /**
             * <p>The private IP address of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1*.1*.1*.2*</p>
             */
            public Builder privateIpAddress(String privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
                return this;
            }

            /**
             * <p>The ID of the scaling activity when the ECS instance was added to the warm pool.</p>
             * 
             * <strong>example:</strong>
             * <p>asa-2ze87i********</p>
             */
            public Builder scalingActivityId(String scalingActivityId) {
                this.scalingActivityId = scalingActivityId;
                return this;
            }

            /**
             * <p>The ID of the associated scaling configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>asc-2ze3j8*********</p>
             */
            public Builder scalingConfigurationId(String scalingConfigurationId) {
                this.scalingConfigurationId = scalingConfigurationId;
                return this;
            }

            /**
             * <p>The ID of the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>asg-bp18p2yfxow2dloq****</p>
             */
            public Builder scalingGroupId(String scalingGroupId) {
                this.scalingGroupId = scalingGroupId;
                return this;
            }

            /**
             * <p>The instance identity in the scaling group, which corresponds one-to-one with the ID of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>asi-j6cj1gcte640ekhb****</p>
             */
            public Builder scalingInstanceId(String scalingInstanceId) {
                this.scalingInstanceId = scalingInstanceId;
                return this;
            }

            /**
             * <p>The zone ID of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-g</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public WarmPoolInstances build() {
                return new WarmPoolInstances(this);
            } 

        } 

    }
}
