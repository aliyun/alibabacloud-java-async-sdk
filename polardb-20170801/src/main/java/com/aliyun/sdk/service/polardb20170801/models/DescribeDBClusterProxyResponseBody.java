// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeDBClusterProxyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterProxyResponseBody</p>
 */
public class DescribeDBClusterProxyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChildInstances")
    private java.util.List<ChildInstances> childInstances;

    @com.aliyun.core.annotation.NameInMap("DBProxyClusterId")
    private String DBProxyClusterId;

    @com.aliyun.core.annotation.NameInMap("DBProxyClusterNum")
    private Long DBProxyClusterNum;

    @com.aliyun.core.annotation.NameInMap("DBProxyClusterStatus")
    private String DBProxyClusterStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBClusterProxyResponseBody(Builder builder) {
        this.childInstances = builder.childInstances;
        this.DBProxyClusterId = builder.DBProxyClusterId;
        this.DBProxyClusterNum = builder.DBProxyClusterNum;
        this.DBProxyClusterStatus = builder.DBProxyClusterStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterProxyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return childInstances
     */
    public java.util.List<ChildInstances> getChildInstances() {
        return this.childInstances;
    }

    /**
     * @return DBProxyClusterId
     */
    public String getDBProxyClusterId() {
        return this.DBProxyClusterId;
    }

    /**
     * @return DBProxyClusterNum
     */
    public Long getDBProxyClusterNum() {
        return this.DBProxyClusterNum;
    }

    /**
     * @return DBProxyClusterStatus
     */
    public String getDBProxyClusterStatus() {
        return this.DBProxyClusterStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ChildInstances> childInstances; 
        private String DBProxyClusterId; 
        private Long DBProxyClusterNum; 
        private String DBProxyClusterStatus; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDBClusterProxyResponseBody model) {
            this.childInstances = model.childInstances;
            this.DBProxyClusterId = model.DBProxyClusterId;
            this.DBProxyClusterNum = model.DBProxyClusterNum;
            this.DBProxyClusterStatus = model.DBProxyClusterStatus;
            this.requestId = model.requestId;
        } 

        /**
         * ChildInstances.
         */
        public Builder childInstances(java.util.List<ChildInstances> childInstances) {
            this.childInstances = childInstances;
            return this;
        }

        /**
         * DBProxyClusterId.
         */
        public Builder DBProxyClusterId(String DBProxyClusterId) {
            this.DBProxyClusterId = DBProxyClusterId;
            return this;
        }

        /**
         * DBProxyClusterNum.
         */
        public Builder DBProxyClusterNum(Long DBProxyClusterNum) {
            this.DBProxyClusterNum = DBProxyClusterNum;
            return this;
        }

        /**
         * DBProxyClusterStatus.
         */
        public Builder DBProxyClusterStatus(String DBProxyClusterStatus) {
            this.DBProxyClusterStatus = DBProxyClusterStatus;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBClusterProxyResponseBody build() {
            return new DescribeDBClusterProxyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBClusterProxyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterProxyResponseBody</p>
     */
    public static class ChildInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBNodeClass")
        private String DBNodeClass;

        @com.aliyun.core.annotation.NameInMap("DBNodeIP")
        private String DBNodeIP;

        @com.aliyun.core.annotation.NameInMap("DBNodeId")
        private String DBNodeId;

        @com.aliyun.core.annotation.NameInMap("DBNodePort")
        private String DBNodePort;

        @com.aliyun.core.annotation.NameInMap("DBNodeStatus")
        private String DBNodeStatus;

        @com.aliyun.core.annotation.NameInMap("HostName")
        private String hostName;

        private ChildInstances(Builder builder) {
            this.DBNodeClass = builder.DBNodeClass;
            this.DBNodeIP = builder.DBNodeIP;
            this.DBNodeId = builder.DBNodeId;
            this.DBNodePort = builder.DBNodePort;
            this.DBNodeStatus = builder.DBNodeStatus;
            this.hostName = builder.hostName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChildInstances create() {
            return builder().build();
        }

        /**
         * @return DBNodeClass
         */
        public String getDBNodeClass() {
            return this.DBNodeClass;
        }

        /**
         * @return DBNodeIP
         */
        public String getDBNodeIP() {
            return this.DBNodeIP;
        }

        /**
         * @return DBNodeId
         */
        public String getDBNodeId() {
            return this.DBNodeId;
        }

        /**
         * @return DBNodePort
         */
        public String getDBNodePort() {
            return this.DBNodePort;
        }

        /**
         * @return DBNodeStatus
         */
        public String getDBNodeStatus() {
            return this.DBNodeStatus;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        public static final class Builder {
            private String DBNodeClass; 
            private String DBNodeIP; 
            private String DBNodeId; 
            private String DBNodePort; 
            private String DBNodeStatus; 
            private String hostName; 

            private Builder() {
            } 

            private Builder(ChildInstances model) {
                this.DBNodeClass = model.DBNodeClass;
                this.DBNodeIP = model.DBNodeIP;
                this.DBNodeId = model.DBNodeId;
                this.DBNodePort = model.DBNodePort;
                this.DBNodeStatus = model.DBNodeStatus;
                this.hostName = model.hostName;
            } 

            /**
             * DBNodeClass.
             */
            public Builder DBNodeClass(String DBNodeClass) {
                this.DBNodeClass = DBNodeClass;
                return this;
            }

            /**
             * DBNodeIP.
             */
            public Builder DBNodeIP(String DBNodeIP) {
                this.DBNodeIP = DBNodeIP;
                return this;
            }

            /**
             * DBNodeId.
             */
            public Builder DBNodeId(String DBNodeId) {
                this.DBNodeId = DBNodeId;
                return this;
            }

            /**
             * DBNodePort.
             */
            public Builder DBNodePort(String DBNodePort) {
                this.DBNodePort = DBNodePort;
                return this;
            }

            /**
             * DBNodeStatus.
             */
            public Builder DBNodeStatus(String DBNodeStatus) {
                this.DBNodeStatus = DBNodeStatus;
                return this;
            }

            /**
             * HostName.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            public ChildInstances build() {
                return new ChildInstances(this);
            } 

        } 

    }
}
