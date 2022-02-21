// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstancesResponseBody</p>
 */
public class ListInstancesResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private ListInstancesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListInstancesResponseBody build() {
            return new ListInstancesResponseBody(this);
        } 

    } 

    public static class Instances extends TeaModel {
        @NameInMap("AutoRenewInstance")
        private Boolean autoRenewInstance;

        @NameInMap("ClassicEndpoint")
        private String classicEndpoint;

        @NameInMap("ExpireTime")
        private Long expireTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("MaxEipTps")
        private Integer maxEipTps;

        @NameInMap("MaxQueue")
        private Integer maxQueue;

        @NameInMap("MaxTps")
        private Integer maxTps;

        @NameInMap("MaxVhost")
        private Integer maxVhost;

        @NameInMap("OrderCreateTime")
        private Long orderCreateTime;

        @NameInMap("OrderType")
        private String orderType;

        @NameInMap("PrivateEndpoint")
        private String privateEndpoint;

        @NameInMap("PublicEndpoint")
        private String publicEndpoint;

        @NameInMap("Status")
        private String status;

        @NameInMap("StorageSize")
        private Integer storageSize;

        @NameInMap("SupportEIP")
        private Boolean supportEIP;

        private Instances(Builder builder) {
            this.autoRenewInstance = builder.autoRenewInstance;
            this.classicEndpoint = builder.classicEndpoint;
            this.expireTime = builder.expireTime;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.instanceType = builder.instanceType;
            this.maxEipTps = builder.maxEipTps;
            this.maxQueue = builder.maxQueue;
            this.maxTps = builder.maxTps;
            this.maxVhost = builder.maxVhost;
            this.orderCreateTime = builder.orderCreateTime;
            this.orderType = builder.orderType;
            this.privateEndpoint = builder.privateEndpoint;
            this.publicEndpoint = builder.publicEndpoint;
            this.status = builder.status;
            this.storageSize = builder.storageSize;
            this.supportEIP = builder.supportEIP;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return autoRenewInstance
         */
        public Boolean getAutoRenewInstance() {
            return this.autoRenewInstance;
        }

        /**
         * @return classicEndpoint
         */
        public String getClassicEndpoint() {
            return this.classicEndpoint;
        }

        /**
         * @return expireTime
         */
        public Long getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return maxEipTps
         */
        public Integer getMaxEipTps() {
            return this.maxEipTps;
        }

        /**
         * @return maxQueue
         */
        public Integer getMaxQueue() {
            return this.maxQueue;
        }

        /**
         * @return maxTps
         */
        public Integer getMaxTps() {
            return this.maxTps;
        }

        /**
         * @return maxVhost
         */
        public Integer getMaxVhost() {
            return this.maxVhost;
        }

        /**
         * @return orderCreateTime
         */
        public Long getOrderCreateTime() {
            return this.orderCreateTime;
        }

        /**
         * @return orderType
         */
        public String getOrderType() {
            return this.orderType;
        }

        /**
         * @return privateEndpoint
         */
        public String getPrivateEndpoint() {
            return this.privateEndpoint;
        }

        /**
         * @return publicEndpoint
         */
        public String getPublicEndpoint() {
            return this.publicEndpoint;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storageSize
         */
        public Integer getStorageSize() {
            return this.storageSize;
        }

        /**
         * @return supportEIP
         */
        public Boolean getSupportEIP() {
            return this.supportEIP;
        }

        public static final class Builder {
            private Boolean autoRenewInstance; 
            private String classicEndpoint; 
            private Long expireTime; 
            private String instanceId; 
            private String instanceName; 
            private String instanceType; 
            private Integer maxEipTps; 
            private Integer maxQueue; 
            private Integer maxTps; 
            private Integer maxVhost; 
            private Long orderCreateTime; 
            private String orderType; 
            private String privateEndpoint; 
            private String publicEndpoint; 
            private String status; 
            private Integer storageSize; 
            private Boolean supportEIP; 

            /**
             * AutoRenewInstance.
             */
            public Builder autoRenewInstance(Boolean autoRenewInstance) {
                this.autoRenewInstance = autoRenewInstance;
                return this;
            }

            /**
             * ClassicEndpoint.
             */
            public Builder classicEndpoint(String classicEndpoint) {
                this.classicEndpoint = classicEndpoint;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * MaxEipTps.
             */
            public Builder maxEipTps(Integer maxEipTps) {
                this.maxEipTps = maxEipTps;
                return this;
            }

            /**
             * MaxQueue.
             */
            public Builder maxQueue(Integer maxQueue) {
                this.maxQueue = maxQueue;
                return this;
            }

            /**
             * MaxTps.
             */
            public Builder maxTps(Integer maxTps) {
                this.maxTps = maxTps;
                return this;
            }

            /**
             * MaxVhost.
             */
            public Builder maxVhost(Integer maxVhost) {
                this.maxVhost = maxVhost;
                return this;
            }

            /**
             * OrderCreateTime.
             */
            public Builder orderCreateTime(Long orderCreateTime) {
                this.orderCreateTime = orderCreateTime;
                return this;
            }

            /**
             * OrderType.
             */
            public Builder orderType(String orderType) {
                this.orderType = orderType;
                return this;
            }

            /**
             * PrivateEndpoint.
             */
            public Builder privateEndpoint(String privateEndpoint) {
                this.privateEndpoint = privateEndpoint;
                return this;
            }

            /**
             * PublicEndpoint.
             */
            public Builder publicEndpoint(String publicEndpoint) {
                this.publicEndpoint = publicEndpoint;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StorageSize.
             */
            public Builder storageSize(Integer storageSize) {
                this.storageSize = storageSize;
                return this;
            }

            /**
             * SupportEIP.
             */
            public Builder supportEIP(Boolean supportEIP) {
                this.supportEIP = supportEIP;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Instances")
        private java.util.List < Instances> instances;

        @NameInMap("MaxResults")
        private Integer maxResults;

        @NameInMap("NextToken")
        private String nextToken;

        private Data(Builder builder) {
            this.instances = builder.instances;
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return instances
         */
        public java.util.List < Instances> getInstances() {
            return this.instances;
        }

        /**
         * @return maxResults
         */
        public Integer getMaxResults() {
            return this.maxResults;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        public static final class Builder {
            private java.util.List < Instances> instances; 
            private Integer maxResults; 
            private String nextToken; 

            /**
             * Instances.
             */
            public Builder instances(java.util.List < Instances> instances) {
                this.instances = instances;
                return this;
            }

            /**
             * MaxResults.
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * NextToken.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
