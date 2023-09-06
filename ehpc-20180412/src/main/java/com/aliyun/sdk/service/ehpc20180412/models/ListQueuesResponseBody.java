// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQueuesResponseBody} extends {@link TeaModel}
 *
 * <p>ListQueuesResponseBody</p>
 */
public class ListQueuesResponseBody extends TeaModel {
    @NameInMap("Queues")
    private Queues queues;

    @NameInMap("RequestId")
    private String requestId;

    private ListQueuesResponseBody(Builder builder) {
        this.queues = builder.queues;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQueuesResponseBody create() {
        return builder().build();
    }

    /**
     * @return queues
     */
    public Queues getQueues() {
        return this.queues;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Queues queues; 
        private String requestId; 

        /**
         * The details of the queue.
         */
        public Builder queues(Queues queues) {
            this.queues = queues;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListQueuesResponseBody build() {
            return new ListQueuesResponseBody(this);
        } 

    } 

    public static class ComputeInstanceType extends TeaModel {
        @NameInMap("InstanceType")
        private java.util.List < String > instanceType;

        private ComputeInstanceType(Builder builder) {
            this.instanceType = builder.instanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComputeInstanceType create() {
            return builder().build();
        }

        /**
         * @return instanceType
         */
        public java.util.List < String > getInstanceType() {
            return this.instanceType;
        }

        public static final class Builder {
            private java.util.List < String > instanceType; 

            /**
             * InstanceType.
             */
            public Builder instanceType(java.util.List < String > instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            public ComputeInstanceType build() {
                return new ComputeInstanceType(this);
            } 

        } 

    }
    public static class Instance extends TeaModel {
        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("SpotPriceLimit")
        private Float spotPriceLimit;

        private Instance(Builder builder) {
            this.instanceType = builder.instanceType;
            this.spotPriceLimit = builder.spotPriceLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instance create() {
            return builder().build();
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return spotPriceLimit
         */
        public Float getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        public static final class Builder {
            private String instanceType; 
            private Float spotPriceLimit; 

            /**
             * The instance type of the preemptible instance.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The maximum hourly price of the preemptible instance. The value can be accurate to three decimal places. The parameter only takes effect when SpotStrategy is set to SpotWithPriceLimit.
             */
            public Builder spotPriceLimit(Float spotPriceLimit) {
                this.spotPriceLimit = spotPriceLimit;
                return this;
            }

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
    public static class SpotInstanceTypes extends TeaModel {
        @NameInMap("Instance")
        private java.util.List < Instance> instance;

        private SpotInstanceTypes(Builder builder) {
            this.instance = builder.instance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpotInstanceTypes create() {
            return builder().build();
        }

        /**
         * @return instance
         */
        public java.util.List < Instance> getInstance() {
            return this.instance;
        }

        public static final class Builder {
            private java.util.List < Instance> instance; 

            /**
             * Instance.
             */
            public Builder instance(java.util.List < Instance> instance) {
                this.instance = instance;
                return this;
            }

            public SpotInstanceTypes build() {
                return new SpotInstanceTypes(this);
            } 

        } 

    }
    public static class QueueInfo extends TeaModel {
        @NameInMap("ComputeInstanceType")
        private ComputeInstanceType computeInstanceType;

        @NameInMap("DeploymentSetId")
        private String deploymentSetId;

        @NameInMap("EnableAutoGrow")
        private Boolean enableAutoGrow;

        @NameInMap("HostNamePrefix")
        private String hostNamePrefix;

        @NameInMap("HostNameSuffix")
        private String hostNameSuffix;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("NetworkInterfaceTrafficMode")
        private String networkInterfaceTrafficMode;

        @NameInMap("QueueName")
        private String queueName;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("SpotInstanceTypes")
        private SpotInstanceTypes spotInstanceTypes;

        @NameInMap("SpotStrategy")
        private String spotStrategy;

        @NameInMap("Type")
        private String type;

        @NameInMap("UseESS")
        private Boolean useESS;

        private QueueInfo(Builder builder) {
            this.computeInstanceType = builder.computeInstanceType;
            this.deploymentSetId = builder.deploymentSetId;
            this.enableAutoGrow = builder.enableAutoGrow;
            this.hostNamePrefix = builder.hostNamePrefix;
            this.hostNameSuffix = builder.hostNameSuffix;
            this.imageId = builder.imageId;
            this.networkInterfaceTrafficMode = builder.networkInterfaceTrafficMode;
            this.queueName = builder.queueName;
            this.resourceGroupId = builder.resourceGroupId;
            this.spotInstanceTypes = builder.spotInstanceTypes;
            this.spotStrategy = builder.spotStrategy;
            this.type = builder.type;
            this.useESS = builder.useESS;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueueInfo create() {
            return builder().build();
        }

        /**
         * @return computeInstanceType
         */
        public ComputeInstanceType getComputeInstanceType() {
            return this.computeInstanceType;
        }

        /**
         * @return deploymentSetId
         */
        public String getDeploymentSetId() {
            return this.deploymentSetId;
        }

        /**
         * @return enableAutoGrow
         */
        public Boolean getEnableAutoGrow() {
            return this.enableAutoGrow;
        }

        /**
         * @return hostNamePrefix
         */
        public String getHostNamePrefix() {
            return this.hostNamePrefix;
        }

        /**
         * @return hostNameSuffix
         */
        public String getHostNameSuffix() {
            return this.hostNameSuffix;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return networkInterfaceTrafficMode
         */
        public String getNetworkInterfaceTrafficMode() {
            return this.networkInterfaceTrafficMode;
        }

        /**
         * @return queueName
         */
        public String getQueueName() {
            return this.queueName;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return spotInstanceTypes
         */
        public SpotInstanceTypes getSpotInstanceTypes() {
            return this.spotInstanceTypes;
        }

        /**
         * @return spotStrategy
         */
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return useESS
         */
        public Boolean getUseESS() {
            return this.useESS;
        }

        public static final class Builder {
            private ComputeInstanceType computeInstanceType; 
            private String deploymentSetId; 
            private Boolean enableAutoGrow; 
            private String hostNamePrefix; 
            private String hostNameSuffix; 
            private String imageId; 
            private String networkInterfaceTrafficMode; 
            private String queueName; 
            private String resourceGroupId; 
            private SpotInstanceTypes spotInstanceTypes; 
            private String spotStrategy; 
            private String type; 
            private Boolean useESS; 

            /**
             * The instance type of compute node.
             */
            public Builder computeInstanceType(ComputeInstanceType computeInstanceType) {
                this.computeInstanceType = computeInstanceType;
                return this;
            }

            /**
             * DeploymentSetId.
             */
            public Builder deploymentSetId(String deploymentSetId) {
                this.deploymentSetId = deploymentSetId;
                return this;
            }

            /**
             * Indicates whether the queue enabled the auto scale-out. Valid values:
             * <p>
             * 
             * *   true: The queue enabled auto scale-out.
             * *   false: The queue disabled auto scale-out.
             */
            public Builder enableAutoGrow(Boolean enableAutoGrow) {
                this.enableAutoGrow = enableAutoGrow;
                return this;
            }

            /**
             * The prefix of the hostname.
             */
            public Builder hostNamePrefix(String hostNamePrefix) {
                this.hostNamePrefix = hostNamePrefix;
                return this;
            }

            /**
             * The suffix of the host name.
             */
            public Builder hostNameSuffix(String hostNameSuffix) {
                this.hostNameSuffix = hostNameSuffix;
                return this;
            }

            /**
             * The ID of the custom image.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * NetworkInterfaceTrafficMode.
             */
            public Builder networkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
                this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
                return this;
            }

            /**
             * The name of the queue.
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * The ID of the resource group to which the queue belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The information about the preemptible instance.
             */
            public Builder spotInstanceTypes(SpotInstanceTypes spotInstanceTypes) {
                this.spotInstanceTypes = spotInstanceTypes;
                return this;
            }

            /**
             * The preemption policy of the compute nodes. Valid values:
             * <p>
             * 
             * *   NoSpot: The instances of the compute node are pay-as-you-go instances.
             * *   SpotWithPriceLimit: The instance is created as a preemptible instance with a user-defined maximum hourly price.
             * *   SpotAsPriceGo: The instance is a preemptible instance for which the market price at the time of purchase is automatically used as the bidding price.
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * The type of queue. Valid values:
             * <p>
             * 
             * *   Execution: Queues in which jobs can be executed.
             * *   Router: Queues in which jobs cannot be executed but are forwarded to the bounded Execution queue for processing.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * UseESS.
             */
            public Builder useESS(Boolean useESS) {
                this.useESS = useESS;
                return this;
            }

            public QueueInfo build() {
                return new QueueInfo(this);
            } 

        } 

    }
    public static class Queues extends TeaModel {
        @NameInMap("QueueInfo")
        private java.util.List < QueueInfo> queueInfo;

        private Queues(Builder builder) {
            this.queueInfo = builder.queueInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Queues create() {
            return builder().build();
        }

        /**
         * @return queueInfo
         */
        public java.util.List < QueueInfo> getQueueInfo() {
            return this.queueInfo;
        }

        public static final class Builder {
            private java.util.List < QueueInfo> queueInfo; 

            /**
             * QueueInfo.
             */
            public Builder queueInfo(java.util.List < QueueInfo> queueInfo) {
                this.queueInfo = queueInfo;
                return this;
            }

            public Queues build() {
                return new Queues(this);
            } 

        } 

    }
}
