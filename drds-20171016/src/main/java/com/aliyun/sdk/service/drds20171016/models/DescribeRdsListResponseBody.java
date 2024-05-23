// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20171016.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRdsListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRdsListResponseBody</p>
 */
public class DescribeRdsListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeRdsListResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRdsListResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 
        private Boolean success; 

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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeRdsListResponseBody build() {
            return new DescribeRdsListResponseBody(this);
        } 

    } 

    public static class Child extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectUrl")
        private String connectUrl;

        @com.aliyun.core.annotation.NameInMap("DbType")
        private String dbType;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InstanceStatus")
        private String instanceStatus;

        @com.aliyun.core.annotation.NameInMap("ReadWeight")
        private Integer readWeight;

        @com.aliyun.core.annotation.NameInMap("port")
        private Integer port;

        private Child(Builder builder) {
            this.connectUrl = builder.connectUrl;
            this.dbType = builder.dbType;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.instanceStatus = builder.instanceStatus;
            this.readWeight = builder.readWeight;
            this.port = builder.port;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Child create() {
            return builder().build();
        }

        /**
         * @return connectUrl
         */
        public String getConnectUrl() {
            return this.connectUrl;
        }

        /**
         * @return dbType
         */
        public String getDbType() {
            return this.dbType;
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
         * @return instanceStatus
         */
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        /**
         * @return readWeight
         */
        public Integer getReadWeight() {
            return this.readWeight;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        public static final class Builder {
            private String connectUrl; 
            private String dbType; 
            private String instanceId; 
            private String instanceName; 
            private String instanceStatus; 
            private Integer readWeight; 
            private Integer port; 

            /**
             * ConnectUrl.
             */
            public Builder connectUrl(String connectUrl) {
                this.connectUrl = connectUrl;
                return this;
            }

            /**
             * DbType.
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
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
             * InstanceStatus.
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * ReadWeight.
             */
            public Builder readWeight(Integer readWeight) {
                this.readWeight = readWeight;
                return this;
            }

            /**
             * port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            public Child build() {
                return new Child(this);
            } 

        } 

    }
    public static class ReadOnlyChildren extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Child")
        private java.util.List < Child> child;

        private ReadOnlyChildren(Builder builder) {
            this.child = builder.child;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReadOnlyChildren create() {
            return builder().build();
        }

        /**
         * @return child
         */
        public java.util.List < Child> getChild() {
            return this.child;
        }

        public static final class Builder {
            private java.util.List < Child> child; 

            /**
             * Child.
             */
            public Builder child(java.util.List < Child> child) {
                this.child = child;
                return this;
            }

            public ReadOnlyChildren build() {
                return new ReadOnlyChildren(this);
            } 

        } 

    }
    public static class RdsInstance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectUrl")
        private String connectUrl;

        @com.aliyun.core.annotation.NameInMap("DbType")
        private String dbType;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private Integer instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InstanceStatus")
        private String instanceStatus;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("ReadOnlyChildren")
        private ReadOnlyChildren readOnlyChildren;

        @com.aliyun.core.annotation.NameInMap("ReadWeight")
        private Integer readWeight;

        private RdsInstance(Builder builder) {
            this.connectUrl = builder.connectUrl;
            this.dbType = builder.dbType;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.instanceStatus = builder.instanceStatus;
            this.port = builder.port;
            this.readOnlyChildren = builder.readOnlyChildren;
            this.readWeight = builder.readWeight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RdsInstance create() {
            return builder().build();
        }

        /**
         * @return connectUrl
         */
        public String getConnectUrl() {
            return this.connectUrl;
        }

        /**
         * @return dbType
         */
        public String getDbType() {
            return this.dbType;
        }

        /**
         * @return instanceId
         */
        public Integer getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return instanceStatus
         */
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return readOnlyChildren
         */
        public ReadOnlyChildren getReadOnlyChildren() {
            return this.readOnlyChildren;
        }

        /**
         * @return readWeight
         */
        public Integer getReadWeight() {
            return this.readWeight;
        }

        public static final class Builder {
            private String connectUrl; 
            private String dbType; 
            private Integer instanceId; 
            private String instanceName; 
            private String instanceStatus; 
            private Integer port; 
            private ReadOnlyChildren readOnlyChildren; 
            private Integer readWeight; 

            /**
             * ConnectUrl.
             */
            public Builder connectUrl(String connectUrl) {
                this.connectUrl = connectUrl;
                return this;
            }

            /**
             * DbType.
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(Integer instanceId) {
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
             * InstanceStatus.
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * ReadOnlyChildren.
             */
            public Builder readOnlyChildren(ReadOnlyChildren readOnlyChildren) {
                this.readOnlyChildren = readOnlyChildren;
                return this;
            }

            /**
             * ReadWeight.
             */
            public Builder readWeight(Integer readWeight) {
                this.readWeight = readWeight;
                return this;
            }

            public RdsInstance build() {
                return new RdsInstance(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RdsInstance")
        private java.util.List < RdsInstance> rdsInstance;

        private Data(Builder builder) {
            this.rdsInstance = builder.rdsInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return rdsInstance
         */
        public java.util.List < RdsInstance> getRdsInstance() {
            return this.rdsInstance;
        }

        public static final class Builder {
            private java.util.List < RdsInstance> rdsInstance; 

            /**
             * RdsInstance.
             */
            public Builder rdsInstance(java.util.List < RdsInstance> rdsInstance) {
                this.rdsInstance = rdsInstance;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
