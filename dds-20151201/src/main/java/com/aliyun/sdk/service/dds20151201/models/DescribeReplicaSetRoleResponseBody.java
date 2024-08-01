// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeReplicaSetRoleResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeReplicaSetRoleResponseBody</p>
 */
public class DescribeReplicaSetRoleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("ReplicaSets")
    private ReplicaSets replicaSets;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeReplicaSetRoleResponseBody(Builder builder) {
        this.DBInstanceId = builder.DBInstanceId;
        this.replicaSets = builder.replicaSets;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeReplicaSetRoleResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return replicaSets
     */
    public ReplicaSets getReplicaSets() {
        return this.replicaSets;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String DBInstanceId; 
        private ReplicaSets replicaSets; 
        private String requestId; 

        /**
         * The instance ID.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The details of the roles of the replica set instance.
         */
        public Builder replicaSets(ReplicaSets replicaSets) {
            this.replicaSets = replicaSets;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeReplicaSetRoleResponseBody build() {
            return new DescribeReplicaSetRoleResponseBody(this);
        } 

    } 

    public static class ReplicaSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionDomain")
        private String connectionDomain;

        @com.aliyun.core.annotation.NameInMap("ConnectionPort")
        private String connectionPort;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("ReplicaSetRole")
        private String replicaSetRole;

        @com.aliyun.core.annotation.NameInMap("RoleId")
        private String roleId;

        private ReplicaSet(Builder builder) {
            this.connectionDomain = builder.connectionDomain;
            this.connectionPort = builder.connectionPort;
            this.expiredTime = builder.expiredTime;
            this.networkType = builder.networkType;
            this.replicaSetRole = builder.replicaSetRole;
            this.roleId = builder.roleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReplicaSet create() {
            return builder().build();
        }

        /**
         * @return connectionDomain
         */
        public String getConnectionDomain() {
            return this.connectionDomain;
        }

        /**
         * @return connectionPort
         */
        public String getConnectionPort() {
            return this.connectionPort;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return replicaSetRole
         */
        public String getReplicaSetRole() {
            return this.replicaSetRole;
        }

        /**
         * @return roleId
         */
        public String getRoleId() {
            return this.roleId;
        }

        public static final class Builder {
            private String connectionDomain; 
            private String connectionPort; 
            private String expiredTime; 
            private String networkType; 
            private String replicaSetRole; 
            private String roleId; 

            /**
             * The endpoint of the node.
             */
            public Builder connectionDomain(String connectionDomain) {
                this.connectionDomain = connectionDomain;
                return this;
            }

            /**
             * The port number that is used to connect to the node.
             */
            public Builder connectionPort(String connectionPort) {
                this.connectionPort = connectionPort;
                return this;
            }

            /**
             * The remaining duration of the classic network endpoint. Unit: seconds.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * The network type of the instance. Valid values:
             * <p>
             * 
             * *   **VPC**: the virtual private cloud (VPC)
             * *   **Classic**: the classic network
             * *   **Public**: the Internet
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * The role of the node in the replica set instance. Valid values:
             * <p>
             * 
             * *   **Primary**
             * *   **Secondary**
             */
            public Builder replicaSetRole(String replicaSetRole) {
                this.replicaSetRole = replicaSetRole;
                return this;
            }

            /**
             * The role ID of the node.
             */
            public Builder roleId(String roleId) {
                this.roleId = roleId;
                return this;
            }

            public ReplicaSet build() {
                return new ReplicaSet(this);
            } 

        } 

    }
    public static class ReplicaSets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReplicaSet")
        private java.util.List < ReplicaSet> replicaSet;

        private ReplicaSets(Builder builder) {
            this.replicaSet = builder.replicaSet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReplicaSets create() {
            return builder().build();
        }

        /**
         * @return replicaSet
         */
        public java.util.List < ReplicaSet> getReplicaSet() {
            return this.replicaSet;
        }

        public static final class Builder {
            private java.util.List < ReplicaSet> replicaSet; 

            /**
             * ReplicaSet.
             */
            public Builder replicaSet(java.util.List < ReplicaSet> replicaSet) {
                this.replicaSet = replicaSet;
                return this;
            }

            public ReplicaSets build() {
                return new ReplicaSets(this);
            } 

        } 

    }
}
