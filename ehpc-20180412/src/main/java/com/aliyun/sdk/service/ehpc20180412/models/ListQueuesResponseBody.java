// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link ListQueuesResponseBody} extends {@link TeaModel}
 *
 * <p>ListQueuesResponseBody</p>
 */
public class ListQueuesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Queues")
    private Queues queues;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListQueuesResponseBody model) {
            this.queues = model.queues;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The queried cluster queues.</p>
         */
        public Builder queues(Queues queues) {
            this.queues = queues;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C6E5005C-00B0-4F27-98BB-95AB88016C22</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListQueuesResponseBody build() {
            return new ListQueuesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListQueuesResponseBody} extends {@link TeaModel}
     *
     * <p>ListQueuesResponseBody</p>
     */
    public static class ComputeInstanceType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private java.util.List<String> instanceType;

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
        public java.util.List<String> getInstanceType() {
            return this.instanceType;
        }

        public static final class Builder {
            private java.util.List<String> instanceType; 

            private Builder() {
            } 

            private Builder(ComputeInstanceType model) {
                this.instanceType = model.instanceType;
            } 

            /**
             * InstanceType.
             */
            public Builder instanceType(java.util.List<String> instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            public ComputeInstanceType build() {
                return new ComputeInstanceType(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListQueuesResponseBody} extends {@link TeaModel}
     *
     * <p>ListQueuesResponseBody</p>
     */
    public static class Instance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("SpotPriceLimit")
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

            private Builder() {
            } 

            private Builder(Instance model) {
                this.instanceType = model.instanceType;
                this.spotPriceLimit = model.spotPriceLimit;
            } 

            /**
             * <p>The instance type of the preemptible instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.n1.tiny</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The maximum hourly price of the instance. The price can be accurate to three decimal places. This parameter is valid only when the SpotStrategy parameter is set to SpotWithPriceLimit.</p>
             * 
             * <strong>example:</strong>
             * <p>0.062</p>
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
    /**
     * 
     * {@link ListQueuesResponseBody} extends {@link TeaModel}
     *
     * <p>ListQueuesResponseBody</p>
     */
    public static class SpotInstanceTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Instance")
        private java.util.List<Instance> instance;

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
        public java.util.List<Instance> getInstance() {
            return this.instance;
        }

        public static final class Builder {
            private java.util.List<Instance> instance; 

            private Builder() {
            } 

            private Builder(SpotInstanceTypes model) {
                this.instance = model.instance;
            } 

            /**
             * Instance.
             */
            public Builder instance(java.util.List<Instance> instance) {
                this.instance = instance;
                return this;
            }

            public SpotInstanceTypes build() {
                return new SpotInstanceTypes(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListQueuesResponseBody} extends {@link TeaModel}
     *
     * <p>ListQueuesResponseBody</p>
     */
    public static class QueueInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComputeInstanceType")
        private ComputeInstanceType computeInstanceType;

        @com.aliyun.core.annotation.NameInMap("DeploymentSetId")
        private String deploymentSetId;

        @com.aliyun.core.annotation.NameInMap("EnableAutoGrow")
        private Boolean enableAutoGrow;

        @com.aliyun.core.annotation.NameInMap("HostNamePrefix")
        private String hostNamePrefix;

        @com.aliyun.core.annotation.NameInMap("HostNameSuffix")
        private String hostNameSuffix;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceTrafficMode")
        private String networkInterfaceTrafficMode;

        @com.aliyun.core.annotation.NameInMap("QueueName")
        private String queueName;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SpotInstanceTypes")
        private SpotInstanceTypes spotInstanceTypes;

        @com.aliyun.core.annotation.NameInMap("SpotStrategy")
        private String spotStrategy;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UseESS")
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

            private Builder() {
            } 

            private Builder(QueueInfo model) {
                this.computeInstanceType = model.computeInstanceType;
                this.deploymentSetId = model.deploymentSetId;
                this.enableAutoGrow = model.enableAutoGrow;
                this.hostNamePrefix = model.hostNamePrefix;
                this.hostNameSuffix = model.hostNameSuffix;
                this.imageId = model.imageId;
                this.networkInterfaceTrafficMode = model.networkInterfaceTrafficMode;
                this.queueName = model.queueName;
                this.resourceGroupId = model.resourceGroupId;
                this.spotInstanceTypes = model.spotInstanceTypes;
                this.spotStrategy = model.spotStrategy;
                this.type = model.type;
                this.useESS = model.useESS;
            } 

            /**
             * <p>The instance type of the compute nodes.</p>
             */
            public Builder computeInstanceType(ComputeInstanceType computeInstanceType) {
                this.computeInstanceType = computeInstanceType;
                return this;
            }

            /**
             * <p>The ID of the deployment set to which to deploy the instance. You can call the <a href="https://help.aliyun.com/document_detail/91313.html">DescribeDeploymentSets</a> operation to query the deployment set ID. Only the deployment sets that use low latency policies are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>ds-bp1frxuzdg87zh4pzq****</p>
             */
            public Builder deploymentSetId(String deploymentSetId) {
                this.deploymentSetId = deploymentSetId;
                return this;
            }

            /**
             * <p>Indicates whether auto scale-out is enabled for the queue. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableAutoGrow(Boolean enableAutoGrow) {
                this.enableAutoGrow = enableAutoGrow;
                return this;
            }

            /**
             * <p>The prefix of the hostname.</p>
             * 
             * <strong>example:</strong>
             * <p>compute</p>
             */
            public Builder hostNamePrefix(String hostNamePrefix) {
                this.hostNamePrefix = hostNamePrefix;
                return this;
            }

            /**
             * <p>The suffix of the hostname.</p>
             * 
             * <strong>example:</strong>
             * <p>01</p>
             */
            public Builder hostNameSuffix(String hostNameSuffix) {
                this.hostNameSuffix = hostNameSuffix;
                return this;
            }

            /**
             * <p>The ID of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>centos_7_06_64_20G_alibase_20****.vhd</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The communication mode of the elastic network interface (ENI). Valid values:</p>
             * <ul>
             * <li>Standard: The TCP communication mode is used.</li>
             * <li>HighPerformance: The Elastic RDMA Interface (ERI) is enabled and the remote direct memory access (RDMA) communication mode is used.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Standard</p>
             */
            public Builder networkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
                this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
                return this;
            }

            /**
             * <p>The name of the queue.</p>
             * 
             * <strong>example:</strong>
             * <p>workq</p>
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the queue belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmxp7uc24****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The information about the preemptible instance.</p>
             */
            public Builder spotInstanceTypes(SpotInstanceTypes spotInstanceTypes) {
                this.spotInstanceTypes = spotInstanceTypes;
                return this;
            }

            /**
             * <p>The preemption policy of the compute nodes. Valid values:</p>
             * <ul>
             * <li>NoSpot: The instance is a regular pay-as-you-go instance.</li>
             * <li>SpotWithPriceLimit: The instance is a preemptible instance for which you specify the maximum hourly price.</li>
             * <li>SpotAsPriceGo: The instance is a preemptible instance for which the market price at the time of purchase is automatically used as the bid price.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NoSpot</p>
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * <p>The type of queue. Valid values:</p>
             * <ul>
             * <li>Execution: Queues in which jobs can be executed.</li>
             * <li>Router: Queues in which jobs cannot be executed. The received jobs in the queues must be forwarded to the bound Execution queues for execution.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Execution</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>Specifies whether to use scaling groups of Auto Scaling.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
    /**
     * 
     * {@link ListQueuesResponseBody} extends {@link TeaModel}
     *
     * <p>ListQueuesResponseBody</p>
     */
    public static class Queues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("QueueInfo")
        private java.util.List<QueueInfo> queueInfo;

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
        public java.util.List<QueueInfo> getQueueInfo() {
            return this.queueInfo;
        }

        public static final class Builder {
            private java.util.List<QueueInfo> queueInfo; 

            private Builder() {
            } 

            private Builder(Queues model) {
                this.queueInfo = model.queueInfo;
            } 

            /**
             * QueueInfo.
             */
            public Builder queueInfo(java.util.List<QueueInfo> queueInfo) {
                this.queueInfo = queueInfo;
                return this;
            }

            public Queues build() {
                return new Queues(this);
            } 

        } 

    }
}
