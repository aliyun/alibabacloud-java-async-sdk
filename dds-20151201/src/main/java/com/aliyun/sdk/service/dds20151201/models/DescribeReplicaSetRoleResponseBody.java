// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dds-bpxxxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The details of the roles of the replica set instance.</p>
         */
        public Builder replicaSets(ReplicaSets replicaSets) {
            this.replicaSets = replicaSets;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DB4A0595-FCA9-437F-B2BB-25DBFC009D3E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeReplicaSetRoleResponseBody build() {
            return new DescribeReplicaSetRoleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeReplicaSetRoleResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeReplicaSetRoleResponseBody</p>
     */
    public static class ReplicaSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionDomain")
        private String connectionDomain;

        @com.aliyun.core.annotation.NameInMap("ConnectionPort")
        private String connectionPort;

        @com.aliyun.core.annotation.NameInMap("ConnectionType")
        private String connectionType;

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
            this.connectionType = builder.connectionType;
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
         * @return connectionType
         */
        public String getConnectionType() {
            return this.connectionType;
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
            private String connectionType; 
            private String expiredTime; 
            private String networkType; 
            private String replicaSetRole; 
            private String roleId; 

            /**
             * <p>The endpoint of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>dds-bpxxxxxxxx.mongodb.rds.aliyuncs.com</p>
             */
            public Builder connectionDomain(String connectionDomain) {
                this.connectionDomain = connectionDomain;
                return this;
            }

            /**
             * <p>The port number that is used to connect to the node.</p>
             * 
             * <strong>example:</strong>
             * <p>3717</p>
             */
            public Builder connectionPort(String connectionPort) {
                this.connectionPort = connectionPort;
                return this;
            }

            /**
             * <p>The connection type of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>SRV</p>
             */
            public Builder connectionType(String connectionType) {
                this.connectionType = connectionType;
                return this;
            }

            /**
             * <p>The remaining duration of the classic network endpoint. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1209582</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The network type of the instance. Valid values:</p>
             * <ul>
             * <li><strong>VPC</strong>: the virtual private cloud (VPC)</li>
             * <li><strong>Classic</strong>: the classic network</li>
             * <li><strong>Public</strong>: the Internet</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * <p>The role of the node in the replica set instance. Valid values:</p>
             * <ul>
             * <li><strong>Primary</strong></li>
             * <li><strong>Secondary</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Primary</p>
             */
            public Builder replicaSetRole(String replicaSetRole) {
                this.replicaSetRole = replicaSetRole;
                return this;
            }

            /**
             * <p>The role ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>651xxxxx</p>
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
    /**
     * 
     * {@link DescribeReplicaSetRoleResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeReplicaSetRoleResponseBody</p>
     */
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
