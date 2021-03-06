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
         * Queues.
         */
        public Builder queues(Queues queues) {
            this.queues = queues;
            return this;
        }

        /**
         * RequestId.
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
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * SpotPriceLimit.
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

        @NameInMap("EnableAutoGrow")
        private Boolean enableAutoGrow;

        @NameInMap("HostNamePrefix")
        private String hostNamePrefix;

        @NameInMap("HostNameSuffix")
        private String hostNameSuffix;

        @NameInMap("ImageId")
        private String imageId;

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

        private QueueInfo(Builder builder) {
            this.computeInstanceType = builder.computeInstanceType;
            this.enableAutoGrow = builder.enableAutoGrow;
            this.hostNamePrefix = builder.hostNamePrefix;
            this.hostNameSuffix = builder.hostNameSuffix;
            this.imageId = builder.imageId;
            this.queueName = builder.queueName;
            this.resourceGroupId = builder.resourceGroupId;
            this.spotInstanceTypes = builder.spotInstanceTypes;
            this.spotStrategy = builder.spotStrategy;
            this.type = builder.type;
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

        public static final class Builder {
            private ComputeInstanceType computeInstanceType; 
            private Boolean enableAutoGrow; 
            private String hostNamePrefix; 
            private String hostNameSuffix; 
            private String imageId; 
            private String queueName; 
            private String resourceGroupId; 
            private SpotInstanceTypes spotInstanceTypes; 
            private String spotStrategy; 
            private String type; 

            /**
             * ComputeInstanceType.
             */
            public Builder computeInstanceType(ComputeInstanceType computeInstanceType) {
                this.computeInstanceType = computeInstanceType;
                return this;
            }

            /**
             * EnableAutoGrow.
             */
            public Builder enableAutoGrow(Boolean enableAutoGrow) {
                this.enableAutoGrow = enableAutoGrow;
                return this;
            }

            /**
             * HostNamePrefix.
             */
            public Builder hostNamePrefix(String hostNamePrefix) {
                this.hostNamePrefix = hostNamePrefix;
                return this;
            }

            /**
             * HostNameSuffix.
             */
            public Builder hostNameSuffix(String hostNameSuffix) {
                this.hostNameSuffix = hostNameSuffix;
                return this;
            }

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * QueueName.
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * SpotInstanceTypes.
             */
            public Builder spotInstanceTypes(SpotInstanceTypes spotInstanceTypes) {
                this.spotInstanceTypes = spotInstanceTypes;
                return this;
            }

            /**
             * SpotStrategy.
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
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
