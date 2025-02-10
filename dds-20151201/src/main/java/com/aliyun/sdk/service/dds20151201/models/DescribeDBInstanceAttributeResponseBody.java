// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
 * {@link DescribeDBInstanceAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceAttributeResponseBody</p>
 */
public class DescribeDBInstanceAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstances")
    private DBInstances DBInstances;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBInstanceAttributeResponseBody(Builder builder) {
        this.DBInstances = builder.DBInstances;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstances
     */
    public DBInstances getDBInstances() {
        return this.DBInstances;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DBInstances DBInstances; 
        private String requestId; 

        /**
         * <p>The instance details.</p>
         */
        public Builder DBInstances(DBInstances DBInstances) {
            this.DBInstances = DBInstances;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A935A8EE-A6CC-53DE-98BA-20ABAA7E632B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBInstanceAttributeResponseBody build() {
            return new DescribeDBInstanceAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceAttributeResponseBody</p>
     */
    public static class ConfigserverAttribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectString")
        private String connectString;

        @com.aliyun.core.annotation.NameInMap("CurrentKernelVersion")
        private String currentKernelVersion;

        @com.aliyun.core.annotation.NameInMap("LockMode")
        private String lockMode;

        @com.aliyun.core.annotation.NameInMap("MaxConnections")
        private Integer maxConnections;

        @com.aliyun.core.annotation.NameInMap("MaxIOPS")
        private Integer maxIOPS;

        @com.aliyun.core.annotation.NameInMap("NodeClass")
        private String nodeClass;

        @com.aliyun.core.annotation.NameInMap("NodeDescription")
        private String nodeDescription;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeStorage")
        private Integer nodeStorage;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ConfigserverAttribute(Builder builder) {
            this.connectString = builder.connectString;
            this.currentKernelVersion = builder.currentKernelVersion;
            this.lockMode = builder.lockMode;
            this.maxConnections = builder.maxConnections;
            this.maxIOPS = builder.maxIOPS;
            this.nodeClass = builder.nodeClass;
            this.nodeDescription = builder.nodeDescription;
            this.nodeId = builder.nodeId;
            this.nodeStorage = builder.nodeStorage;
            this.port = builder.port;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigserverAttribute create() {
            return builder().build();
        }

        /**
         * @return connectString
         */
        public String getConnectString() {
            return this.connectString;
        }

        /**
         * @return currentKernelVersion
         */
        public String getCurrentKernelVersion() {
            return this.currentKernelVersion;
        }

        /**
         * @return lockMode
         */
        public String getLockMode() {
            return this.lockMode;
        }

        /**
         * @return maxConnections
         */
        public Integer getMaxConnections() {
            return this.maxConnections;
        }

        /**
         * @return maxIOPS
         */
        public Integer getMaxIOPS() {
            return this.maxIOPS;
        }

        /**
         * @return nodeClass
         */
        public String getNodeClass() {
            return this.nodeClass;
        }

        /**
         * @return nodeDescription
         */
        public String getNodeDescription() {
            return this.nodeDescription;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeStorage
         */
        public Integer getNodeStorage() {
            return this.nodeStorage;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String connectString; 
            private String currentKernelVersion; 
            private String lockMode; 
            private Integer maxConnections; 
            private Integer maxIOPS; 
            private String nodeClass; 
            private String nodeDescription; 
            private String nodeId; 
            private Integer nodeStorage; 
            private Integer port; 
            private String status; 

            /**
             * <p>The endpoint of the Configserver node.</p>
             * 
             * <strong>example:</strong>
             * <p>dds-bp18b0934e7053e4-cs****.mongodb.rds.aliyuncs.com</p>
             */
            public Builder connectString(String connectString) {
                this.connectString = connectString;
                return this;
            }

            /**
             * <p>The minor version of the current MongoDB kernel.</p>
             * 
             * <strong>example:</strong>
             * <p>mongodb_20230613_4.0.25</p>
             */
            public Builder currentKernelVersion(String currentKernelVersion) {
                this.currentKernelVersion = currentKernelVersion;
                return this;
            }

            /**
             * <p>The lock status of the Configserver node. Valid values:</p>
             * <ul>
             * <li><strong>Unlock</strong>: The instance is not locked.</li>
             * <li><strong>ManualLock</strong>: The instance is manually locked.</li>
             * <li><strong>LockByExpiration</strong>: The instance is automatically locked due to instance expiration.</li>
             * <li><strong>LockByRestoration</strong>: The instance is automatically locked before a rollback.</li>
             * <li><strong>LockByDiskQuota</strong>: The instance is automatically locked because its storage capacity is exhausted and the instance is inaccessible.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Unlock</p>
             */
            public Builder lockMode(String lockMode) {
                this.lockMode = lockMode;
                return this;
            }

            /**
             * <p>The maximum number of connections to the Configserver node.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder maxConnections(Integer maxConnections) {
                this.maxConnections = maxConnections;
                return this;
            }

            /**
             * <p>The maximum IOPS of the Configserver node.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder maxIOPS(Integer maxIOPS) {
                this.maxIOPS = maxIOPS;
                return this;
            }

            /**
             * <p>The instance type of the Configserver node.</p>
             * 
             * <strong>example:</strong>
             * <p>dds.cs.mid</p>
             */
            public Builder nodeClass(String nodeClass) {
                this.nodeClass = nodeClass;
                return this;
            }

            /**
             * <p>The name of the Configserver node.</p>
             * 
             * <strong>example:</strong>
             * <p>testConfigserver</p>
             */
            public Builder nodeDescription(String nodeDescription) {
                this.nodeDescription = nodeDescription;
                return this;
            }

            /**
             * <p>The ID of the Configserver node.</p>
             * 
             * <strong>example:</strong>
             * <p>dds-bp11483712c1****-cs</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The storage capacity of the Configserver node. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder nodeStorage(Integer nodeStorage) {
                this.nodeStorage = nodeStorage;
                return this;
            }

            /**
             * <p>The port number that is used to connect to the Configserver node.</p>
             * 
             * <strong>example:</strong>
             * <p>3717</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The status of the Configserver node. For more information, see <a href="https://help.aliyun.com/document_detail/63870.html">Instance states</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ConfigserverAttribute build() {
                return new ConfigserverAttribute(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceAttributeResponseBody</p>
     */
    public static class ConfigserverList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigserverAttribute")
        private java.util.List<ConfigserverAttribute> configserverAttribute;

        private ConfigserverList(Builder builder) {
            this.configserverAttribute = builder.configserverAttribute;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigserverList create() {
            return builder().build();
        }

        /**
         * @return configserverAttribute
         */
        public java.util.List<ConfigserverAttribute> getConfigserverAttribute() {
            return this.configserverAttribute;
        }

        public static final class Builder {
            private java.util.List<ConfigserverAttribute> configserverAttribute; 

            /**
             * ConfigserverAttribute.
             */
            public Builder configserverAttribute(java.util.List<ConfigserverAttribute> configserverAttribute) {
                this.configserverAttribute = configserverAttribute;
                return this;
            }

            public ConfigserverList build() {
                return new ConfigserverList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceAttributeResponseBody</p>
     */
    public static class MongosAttribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectSting")
        private String connectSting;

        @com.aliyun.core.annotation.NameInMap("ConnectString")
        private String connectString;

        @com.aliyun.core.annotation.NameInMap("CurrentKernelVersion")
        private String currentKernelVersion;

        @com.aliyun.core.annotation.NameInMap("LockMode")
        private String lockMode;

        @com.aliyun.core.annotation.NameInMap("MaxConnections")
        private Integer maxConnections;

        @com.aliyun.core.annotation.NameInMap("MaxIOPS")
        private Integer maxIOPS;

        @com.aliyun.core.annotation.NameInMap("NodeClass")
        private String nodeClass;

        @com.aliyun.core.annotation.NameInMap("NodeDescription")
        private String nodeDescription;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VPCId")
        private String VPCId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcCloudInstanceId")
        private String vpcCloudInstanceId;

        private MongosAttribute(Builder builder) {
            this.connectSting = builder.connectSting;
            this.connectString = builder.connectString;
            this.currentKernelVersion = builder.currentKernelVersion;
            this.lockMode = builder.lockMode;
            this.maxConnections = builder.maxConnections;
            this.maxIOPS = builder.maxIOPS;
            this.nodeClass = builder.nodeClass;
            this.nodeDescription = builder.nodeDescription;
            this.nodeId = builder.nodeId;
            this.port = builder.port;
            this.status = builder.status;
            this.VPCId = builder.VPCId;
            this.vSwitchId = builder.vSwitchId;
            this.vpcCloudInstanceId = builder.vpcCloudInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MongosAttribute create() {
            return builder().build();
        }

        /**
         * @return connectSting
         */
        public String getConnectSting() {
            return this.connectSting;
        }

        /**
         * @return connectString
         */
        public String getConnectString() {
            return this.connectString;
        }

        /**
         * @return currentKernelVersion
         */
        public String getCurrentKernelVersion() {
            return this.currentKernelVersion;
        }

        /**
         * @return lockMode
         */
        public String getLockMode() {
            return this.lockMode;
        }

        /**
         * @return maxConnections
         */
        public Integer getMaxConnections() {
            return this.maxConnections;
        }

        /**
         * @return maxIOPS
         */
        public Integer getMaxIOPS() {
            return this.maxIOPS;
        }

        /**
         * @return nodeClass
         */
        public String getNodeClass() {
            return this.nodeClass;
        }

        /**
         * @return nodeDescription
         */
        public String getNodeDescription() {
            return this.nodeDescription;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return VPCId
         */
        public String getVPCId() {
            return this.VPCId;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcCloudInstanceId
         */
        public String getVpcCloudInstanceId() {
            return this.vpcCloudInstanceId;
        }

        public static final class Builder {
            private String connectSting; 
            private String connectString; 
            private String currentKernelVersion; 
            private String lockMode; 
            private Integer maxConnections; 
            private Integer maxIOPS; 
            private String nodeClass; 
            private String nodeDescription; 
            private String nodeId; 
            private Integer port; 
            private String status; 
            private String VPCId; 
            private String vSwitchId; 
            private String vpcCloudInstanceId; 

            /**
             * <p>The endpoint of the mongos node.</p>
             * 
             * <strong>example:</strong>
             * <p>s-bp1d8c262a15****.mongodb.rds.aliyuncs.com</p>
             */
            public Builder connectSting(String connectSting) {
                this.connectSting = connectSting;
                return this;
            }

            /**
             * <p>The endpoint of the Configserver node.</p>
             * 
             * <strong>example:</strong>
             * <p>dds-bp18b0934e7053e4-cs****.mongodb.rds.aliyuncs.com</p>
             */
            public Builder connectString(String connectString) {
                this.connectString = connectString;
                return this;
            }

            /**
             * <p>The minor version of the current MongoDB kernel.</p>
             * 
             * <strong>example:</strong>
             * <p>mongodb_20220518_4.0.21</p>
             */
            public Builder currentKernelVersion(String currentKernelVersion) {
                this.currentKernelVersion = currentKernelVersion;
                return this;
            }

            /**
             * <p>The lock status of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Unlock</strong>: The instance is not locked.</li>
             * <li><strong>ManualLock</strong>: The instance is manually locked.</li>
             * <li><strong>LockByExpiration</strong>: The instance is automatically locked due to instance expiration.</li>
             * <li><strong>LockByRestoration</strong>: The instance is automatically locked before a rollback.</li>
             * <li><strong>LockByDiskQuota</strong>: The instance is automatically locked because its storage capacity is exhausted and the instance is inaccessible.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Unlock</p>
             */
            public Builder lockMode(String lockMode) {
                this.lockMode = lockMode;
                return this;
            }

            /**
             * <p>The maximum number of connections to the mongos node.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder maxConnections(Integer maxConnections) {
                this.maxConnections = maxConnections;
                return this;
            }

            /**
             * <p>The maximum IOPS of the mongos node.</p>
             * 
             * <strong>example:</strong>
             * <p>800</p>
             */
            public Builder maxIOPS(Integer maxIOPS) {
                this.maxIOPS = maxIOPS;
                return this;
            }

            /**
             * <p>The instance type of the mongos node.</p>
             * 
             * <strong>example:</strong>
             * <p>dds.mongos.mid</p>
             */
            public Builder nodeClass(String nodeClass) {
                this.nodeClass = nodeClass;
                return this;
            }

            /**
             * <p>The name of the mongos node.</p>
             * 
             * <strong>example:</strong>
             * <p>mongos1</p>
             */
            public Builder nodeDescription(String nodeDescription) {
                this.nodeDescription = nodeDescription;
                return this;
            }

            /**
             * <p>The ID of the mongos node.</p>
             * 
             * <strong>example:</strong>
             * <p>s-bp1d8c262a15****</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The port number that is used to connect to the mongos node.</p>
             * 
             * <strong>example:</strong>
             * <p>3717</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The status of the mongos node. For more information, see <a href="https://help.aliyun.com/document_detail/63870.html">Instance states</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The VPC ID of the instance.</p>
             * <blockquote>
             * <p> This parameter is returned if the network type of the instance is VPC.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1n3i15v90el48nx****</p>
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * <p>The vSwitch ID of the instance.</p>
             * <blockquote>
             * <p> This parameter is returned if the network type of the instance is VPC.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1vj604nj5a9zz74****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The ID of the mongos node.</p>
             * 
             * <strong>example:</strong>
             * <p>s-bp1d8c262a158****</p>
             */
            public Builder vpcCloudInstanceId(String vpcCloudInstanceId) {
                this.vpcCloudInstanceId = vpcCloudInstanceId;
                return this;
            }

            public MongosAttribute build() {
                return new MongosAttribute(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceAttributeResponseBody</p>
     */
    public static class MongosList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MongosAttribute")
        private java.util.List<MongosAttribute> mongosAttribute;

        private MongosList(Builder builder) {
            this.mongosAttribute = builder.mongosAttribute;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MongosList create() {
            return builder().build();
        }

        /**
         * @return mongosAttribute
         */
        public java.util.List<MongosAttribute> getMongosAttribute() {
            return this.mongosAttribute;
        }

        public static final class Builder {
            private java.util.List<MongosAttribute> mongosAttribute; 

            /**
             * MongosAttribute.
             */
            public Builder mongosAttribute(java.util.List<MongosAttribute> mongosAttribute) {
                this.mongosAttribute = mongosAttribute;
                return this;
            }

            public MongosList build() {
                return new MongosList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceAttributeResponseBody</p>
     */
    public static class ReplicaSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionDomain")
        private String connectionDomain;

        @com.aliyun.core.annotation.NameInMap("ConnectionPort")
        private String connectionPort;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("ReplicaSetRole")
        private String replicaSetRole;

        @com.aliyun.core.annotation.NameInMap("VPCCloudInstanceId")
        private String VPCCloudInstanceId;

        @com.aliyun.core.annotation.NameInMap("VPCId")
        private String VPCId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        private ReplicaSet(Builder builder) {
            this.connectionDomain = builder.connectionDomain;
            this.connectionPort = builder.connectionPort;
            this.networkType = builder.networkType;
            this.replicaSetRole = builder.replicaSetRole;
            this.VPCCloudInstanceId = builder.VPCCloudInstanceId;
            this.VPCId = builder.VPCId;
            this.vSwitchId = builder.vSwitchId;
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
         * @return VPCCloudInstanceId
         */
        public String getVPCCloudInstanceId() {
            return this.VPCCloudInstanceId;
        }

        /**
         * @return VPCId
         */
        public String getVPCId() {
            return this.VPCId;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public static final class Builder {
            private String connectionDomain; 
            private String connectionPort; 
            private String networkType; 
            private String replicaSetRole; 
            private String VPCCloudInstanceId; 
            private String VPCId; 
            private String vSwitchId; 

            /**
             * <p>The endpoint of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>dds-bp11483712c1****.mongodb.rds.aliyuncs.com</p>
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
             * <p>The network type of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Classic</strong>: classic network</li>
             * <li><strong>VPC</strong>: VPC</li>
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
             * <p>The role of the node. Valid values:</p>
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
             * <p>The instance ID.</p>
             * <blockquote>
             * <p> This parameter is returned if the network type of the instance is VPC.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>dds-bp11483712c1****</p>
             */
            public Builder VPCCloudInstanceId(String VPCCloudInstanceId) {
                this.VPCCloudInstanceId = VPCCloudInstanceId;
                return this;
            }

            /**
             * <p>The VPC ID of the instance.</p>
             * <blockquote>
             * <p> This parameter is returned if the network type of the instance is VPC.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1jk5vwkcri27qme****</p>
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * <p>The vSwitch ID of the instance.</p>
             * <blockquote>
             * <p> This parameter is returned if the network type of the instance is virtual private cloud (VPC).</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1jk5vwkcri27qme****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public ReplicaSet build() {
                return new ReplicaSet(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceAttributeResponseBody</p>
     */
    public static class ReplicaSets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReplicaSet")
        private java.util.List<ReplicaSet> replicaSet;

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
        public java.util.List<ReplicaSet> getReplicaSet() {
            return this.replicaSet;
        }

        public static final class Builder {
            private java.util.List<ReplicaSet> replicaSet; 

            /**
             * ReplicaSet.
             */
            public Builder replicaSet(java.util.List<ReplicaSet> replicaSet) {
                this.replicaSet = replicaSet;
                return this;
            }

            public ReplicaSets build() {
                return new ReplicaSets(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceAttributeResponseBody</p>
     */
    public static class ShardAttribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectString")
        private String connectString;

        @com.aliyun.core.annotation.NameInMap("CurrentKernelVersion")
        private String currentKernelVersion;

        @com.aliyun.core.annotation.NameInMap("LockMode")
        private String lockMode;

        @com.aliyun.core.annotation.NameInMap("MaxConnections")
        private Integer maxConnections;

        @com.aliyun.core.annotation.NameInMap("MaxDiskMbps")
        private String maxDiskMbps;

        @com.aliyun.core.annotation.NameInMap("MaxIOPS")
        private Integer maxIOPS;

        @com.aliyun.core.annotation.NameInMap("NodeClass")
        private String nodeClass;

        @com.aliyun.core.annotation.NameInMap("NodeDescription")
        private String nodeDescription;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeStorage")
        private Integer nodeStorage;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("ReadonlyReplicas")
        private Integer readonlyReplicas;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ShardAttribute(Builder builder) {
            this.connectString = builder.connectString;
            this.currentKernelVersion = builder.currentKernelVersion;
            this.lockMode = builder.lockMode;
            this.maxConnections = builder.maxConnections;
            this.maxDiskMbps = builder.maxDiskMbps;
            this.maxIOPS = builder.maxIOPS;
            this.nodeClass = builder.nodeClass;
            this.nodeDescription = builder.nodeDescription;
            this.nodeId = builder.nodeId;
            this.nodeStorage = builder.nodeStorage;
            this.port = builder.port;
            this.readonlyReplicas = builder.readonlyReplicas;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ShardAttribute create() {
            return builder().build();
        }

        /**
         * @return connectString
         */
        public String getConnectString() {
            return this.connectString;
        }

        /**
         * @return currentKernelVersion
         */
        public String getCurrentKernelVersion() {
            return this.currentKernelVersion;
        }

        /**
         * @return lockMode
         */
        public String getLockMode() {
            return this.lockMode;
        }

        /**
         * @return maxConnections
         */
        public Integer getMaxConnections() {
            return this.maxConnections;
        }

        /**
         * @return maxDiskMbps
         */
        public String getMaxDiskMbps() {
            return this.maxDiskMbps;
        }

        /**
         * @return maxIOPS
         */
        public Integer getMaxIOPS() {
            return this.maxIOPS;
        }

        /**
         * @return nodeClass
         */
        public String getNodeClass() {
            return this.nodeClass;
        }

        /**
         * @return nodeDescription
         */
        public String getNodeDescription() {
            return this.nodeDescription;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeStorage
         */
        public Integer getNodeStorage() {
            return this.nodeStorage;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return readonlyReplicas
         */
        public Integer getReadonlyReplicas() {
            return this.readonlyReplicas;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String connectString; 
            private String currentKernelVersion; 
            private String lockMode; 
            private Integer maxConnections; 
            private String maxDiskMbps; 
            private Integer maxIOPS; 
            private String nodeClass; 
            private String nodeDescription; 
            private String nodeId; 
            private Integer nodeStorage; 
            private Integer port; 
            private Integer readonlyReplicas; 
            private String status; 

            /**
             * <p>The endpoint of the shard node.</p>
             * 
             * <strong>example:</strong>
             * <p>d-bp1af0680a9c6d3****.mongodb.rds.aliyuncs.com:****</p>
             */
            public Builder connectString(String connectString) {
                this.connectString = connectString;
                return this;
            }

            /**
             * <p>The minor version of the current MongoDB kernel.</p>
             * 
             * <strong>example:</strong>
             * <p>mongodb_20230613_4.0.25</p>
             */
            public Builder currentKernelVersion(String currentKernelVersion) {
                this.currentKernelVersion = currentKernelVersion;
                return this;
            }

            /**
             * <p>The lock status of the shard node. Valid values:</p>
             * <ul>
             * <li><strong>Unlock</strong>: The instance is not locked.</li>
             * <li><strong>ManualLock</strong>: The instance is manually locked.</li>
             * <li><strong>LockByExpiration</strong>: The instance is automatically locked due to instance expiration.</li>
             * <li><strong>LockByRestoration</strong>: The instance is automatically locked before a rollback.</li>
             * <li><strong>LockByDiskQuota</strong>: The instance is automatically locked because its storage capacity is exhausted and the instance is inaccessible.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Unlock</p>
             */
            public Builder lockMode(String lockMode) {
                this.lockMode = lockMode;
                return this;
            }

            /**
             * <p>The maximum number of connections to the shard node.</p>
             * 
             * <strong>example:</strong>
             * <p>8000</p>
             */
            public Builder maxConnections(Integer maxConnections) {
                this.maxConnections = maxConnections;
                return this;
            }

            /**
             * <p>The maximum MBPS of the shard node.</p>
             * 
             * <strong>example:</strong>
             * <p>350</p>
             */
            public Builder maxDiskMbps(String maxDiskMbps) {
                this.maxDiskMbps = maxDiskMbps;
                return this;
            }

            /**
             * <p>The maximum IOPS of the shard node.</p>
             * 
             * <strong>example:</strong>
             * <p>8000</p>
             */
            public Builder maxIOPS(Integer maxIOPS) {
                this.maxIOPS = maxIOPS;
                return this;
            }

            /**
             * <p>The instance type of the shard node.</p>
             * 
             * <strong>example:</strong>
             * <p>dds.shard.mid</p>
             */
            public Builder nodeClass(String nodeClass) {
                this.nodeClass = nodeClass;
                return this;
            }

            /**
             * <p>The name of the shard node.</p>
             * 
             * <strong>example:</strong>
             * <p>testshard</p>
             */
            public Builder nodeDescription(String nodeDescription) {
                this.nodeDescription = nodeDescription;
                return this;
            }

            /**
             * <p>The ID of the shard node.</p>
             * 
             * <strong>example:</strong>
             * <p>d-bp16e09d9c5d****</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The storage capacity of the shard node. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder nodeStorage(Integer nodeStorage) {
                this.nodeStorage = nodeStorage;
                return this;
            }

            /**
             * <p>The port number that is used to connect to the shard node.</p>
             * 
             * <strong>example:</strong>
             * <p>3717</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The number of read-only nodes in the shard node. Valid values: <strong>0</strong> to <strong>5</strong>. The value must be an integer.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder readonlyReplicas(Integer readonlyReplicas) {
                this.readonlyReplicas = readonlyReplicas;
                return this;
            }

            /**
             * <p>The status of the shard node. For more information, see <a href="https://help.aliyun.com/document_detail/63870.html">Instance states</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ShardAttribute build() {
                return new ShardAttribute(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceAttributeResponseBody</p>
     */
    public static class ShardList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ShardAttribute")
        private java.util.List<ShardAttribute> shardAttribute;

        private ShardList(Builder builder) {
            this.shardAttribute = builder.shardAttribute;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ShardList create() {
            return builder().build();
        }

        /**
         * @return shardAttribute
         */
        public java.util.List<ShardAttribute> getShardAttribute() {
            return this.shardAttribute;
        }

        public static final class Builder {
            private java.util.List<ShardAttribute> shardAttribute; 

            /**
             * ShardAttribute.
             */
            public Builder shardAttribute(java.util.List<ShardAttribute> shardAttribute) {
                this.shardAttribute = shardAttribute;
                return this;
            }

            public ShardList build() {
                return new ShardList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceAttributeResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>api</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceAttributeResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceAttributeResponseBody</p>
     */
    public static class DBInstance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BurstingEnabled")
        private Boolean burstingEnabled;

        @com.aliyun.core.annotation.NameInMap("CapacityUnit")
        private String capacityUnit;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("ConfigserverList")
        private ConfigserverList configserverList;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("CurrentKernelVersion")
        private String currentKernelVersion;

        @com.aliyun.core.annotation.NameInMap("DBInstanceClass")
        private String DBInstanceClass;

        @com.aliyun.core.annotation.NameInMap("DBInstanceDescription")
        private String DBInstanceDescription;

        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("DBInstanceOrderStatus")
        private String DBInstanceOrderStatus;

        @com.aliyun.core.annotation.NameInMap("DBInstanceReleaseProtection")
        private Boolean DBInstanceReleaseProtection;

        @com.aliyun.core.annotation.NameInMap("DBInstanceStatus")
        private String DBInstanceStatus;

        @com.aliyun.core.annotation.NameInMap("DBInstanceStorage")
        private Integer DBInstanceStorage;

        @com.aliyun.core.annotation.NameInMap("DBInstanceType")
        private String DBInstanceType;

        @com.aliyun.core.annotation.NameInMap("DestroyTime")
        private String destroyTime;

        @com.aliyun.core.annotation.NameInMap("Encrypted")
        private Boolean encrypted;

        @com.aliyun.core.annotation.NameInMap("EncryptionKey")
        private String encryptionKey;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("EngineVersion")
        private String engineVersion;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("HiddenZoneId")
        private String hiddenZoneId;

        @com.aliyun.core.annotation.NameInMap("KindCode")
        private String kindCode;

        @com.aliyun.core.annotation.NameInMap("LastDowngradeTime")
        private String lastDowngradeTime;

        @com.aliyun.core.annotation.NameInMap("LockMode")
        private String lockMode;

        @com.aliyun.core.annotation.NameInMap("MaintainEndTime")
        private String maintainEndTime;

        @com.aliyun.core.annotation.NameInMap("MaintainStartTime")
        private String maintainStartTime;

        @com.aliyun.core.annotation.NameInMap("MaxConnections")
        private Integer maxConnections;

        @com.aliyun.core.annotation.NameInMap("MaxIOPS")
        private Integer maxIOPS;

        @com.aliyun.core.annotation.NameInMap("MaxMBPS")
        private Integer maxMBPS;

        @com.aliyun.core.annotation.NameInMap("MongosList")
        private MongosList mongosList;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("ProtocolType")
        private String protocolType;

        @com.aliyun.core.annotation.NameInMap("ProvisionedIops")
        private Long provisionedIops;

        @com.aliyun.core.annotation.NameInMap("ReadonlyReplicas")
        private String readonlyReplicas;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ReplacateId")
        private String replacateId;

        @com.aliyun.core.annotation.NameInMap("ReplicaSetName")
        private String replicaSetName;

        @com.aliyun.core.annotation.NameInMap("ReplicaSets")
        private ReplicaSets replicaSets;

        @com.aliyun.core.annotation.NameInMap("ReplicationFactor")
        private String replicationFactor;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SecondaryZoneId")
        private String secondaryZoneId;

        @com.aliyun.core.annotation.NameInMap("ShardList")
        private ShardList shardList;

        @com.aliyun.core.annotation.NameInMap("StorageEngine")
        private String storageEngine;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        @com.aliyun.core.annotation.NameInMap("SyncPercent")
        private String syncPercent;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("UseClusterBackup")
        private Boolean useClusterBackup;

        @com.aliyun.core.annotation.NameInMap("VPCCloudInstanceIds")
        private String VPCCloudInstanceIds;

        @com.aliyun.core.annotation.NameInMap("VPCId")
        private String VPCId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcAuthMode")
        private String vpcAuthMode;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private DBInstance(Builder builder) {
            this.burstingEnabled = builder.burstingEnabled;
            this.capacityUnit = builder.capacityUnit;
            this.chargeType = builder.chargeType;
            this.configserverList = builder.configserverList;
            this.creationTime = builder.creationTime;
            this.currentKernelVersion = builder.currentKernelVersion;
            this.DBInstanceClass = builder.DBInstanceClass;
            this.DBInstanceDescription = builder.DBInstanceDescription;
            this.DBInstanceId = builder.DBInstanceId;
            this.DBInstanceOrderStatus = builder.DBInstanceOrderStatus;
            this.DBInstanceReleaseProtection = builder.DBInstanceReleaseProtection;
            this.DBInstanceStatus = builder.DBInstanceStatus;
            this.DBInstanceStorage = builder.DBInstanceStorage;
            this.DBInstanceType = builder.DBInstanceType;
            this.destroyTime = builder.destroyTime;
            this.encrypted = builder.encrypted;
            this.encryptionKey = builder.encryptionKey;
            this.engine = builder.engine;
            this.engineVersion = builder.engineVersion;
            this.expireTime = builder.expireTime;
            this.hiddenZoneId = builder.hiddenZoneId;
            this.kindCode = builder.kindCode;
            this.lastDowngradeTime = builder.lastDowngradeTime;
            this.lockMode = builder.lockMode;
            this.maintainEndTime = builder.maintainEndTime;
            this.maintainStartTime = builder.maintainStartTime;
            this.maxConnections = builder.maxConnections;
            this.maxIOPS = builder.maxIOPS;
            this.maxMBPS = builder.maxMBPS;
            this.mongosList = builder.mongosList;
            this.networkType = builder.networkType;
            this.protocolType = builder.protocolType;
            this.provisionedIops = builder.provisionedIops;
            this.readonlyReplicas = builder.readonlyReplicas;
            this.regionId = builder.regionId;
            this.replacateId = builder.replacateId;
            this.replicaSetName = builder.replicaSetName;
            this.replicaSets = builder.replicaSets;
            this.replicationFactor = builder.replicationFactor;
            this.resourceGroupId = builder.resourceGroupId;
            this.secondaryZoneId = builder.secondaryZoneId;
            this.shardList = builder.shardList;
            this.storageEngine = builder.storageEngine;
            this.storageType = builder.storageType;
            this.syncPercent = builder.syncPercent;
            this.tags = builder.tags;
            this.useClusterBackup = builder.useClusterBackup;
            this.VPCCloudInstanceIds = builder.VPCCloudInstanceIds;
            this.VPCId = builder.VPCId;
            this.vSwitchId = builder.vSwitchId;
            this.vpcAuthMode = builder.vpcAuthMode;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstance create() {
            return builder().build();
        }

        /**
         * @return burstingEnabled
         */
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
        }

        /**
         * @return capacityUnit
         */
        public String getCapacityUnit() {
            return this.capacityUnit;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return configserverList
         */
        public ConfigserverList getConfigserverList() {
            return this.configserverList;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return currentKernelVersion
         */
        public String getCurrentKernelVersion() {
            return this.currentKernelVersion;
        }

        /**
         * @return DBInstanceClass
         */
        public String getDBInstanceClass() {
            return this.DBInstanceClass;
        }

        /**
         * @return DBInstanceDescription
         */
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        /**
         * @return DBInstanceOrderStatus
         */
        public String getDBInstanceOrderStatus() {
            return this.DBInstanceOrderStatus;
        }

        /**
         * @return DBInstanceReleaseProtection
         */
        public Boolean getDBInstanceReleaseProtection() {
            return this.DBInstanceReleaseProtection;
        }

        /**
         * @return DBInstanceStatus
         */
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        /**
         * @return DBInstanceStorage
         */
        public Integer getDBInstanceStorage() {
            return this.DBInstanceStorage;
        }

        /**
         * @return DBInstanceType
         */
        public String getDBInstanceType() {
            return this.DBInstanceType;
        }

        /**
         * @return destroyTime
         */
        public String getDestroyTime() {
            return this.destroyTime;
        }

        /**
         * @return encrypted
         */
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        /**
         * @return encryptionKey
         */
        public String getEncryptionKey() {
            return this.encryptionKey;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return engineVersion
         */
        public String getEngineVersion() {
            return this.engineVersion;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return hiddenZoneId
         */
        public String getHiddenZoneId() {
            return this.hiddenZoneId;
        }

        /**
         * @return kindCode
         */
        public String getKindCode() {
            return this.kindCode;
        }

        /**
         * @return lastDowngradeTime
         */
        public String getLastDowngradeTime() {
            return this.lastDowngradeTime;
        }

        /**
         * @return lockMode
         */
        public String getLockMode() {
            return this.lockMode;
        }

        /**
         * @return maintainEndTime
         */
        public String getMaintainEndTime() {
            return this.maintainEndTime;
        }

        /**
         * @return maintainStartTime
         */
        public String getMaintainStartTime() {
            return this.maintainStartTime;
        }

        /**
         * @return maxConnections
         */
        public Integer getMaxConnections() {
            return this.maxConnections;
        }

        /**
         * @return maxIOPS
         */
        public Integer getMaxIOPS() {
            return this.maxIOPS;
        }

        /**
         * @return maxMBPS
         */
        public Integer getMaxMBPS() {
            return this.maxMBPS;
        }

        /**
         * @return mongosList
         */
        public MongosList getMongosList() {
            return this.mongosList;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return protocolType
         */
        public String getProtocolType() {
            return this.protocolType;
        }

        /**
         * @return provisionedIops
         */
        public Long getProvisionedIops() {
            return this.provisionedIops;
        }

        /**
         * @return readonlyReplicas
         */
        public String getReadonlyReplicas() {
            return this.readonlyReplicas;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return replacateId
         */
        public String getReplacateId() {
            return this.replacateId;
        }

        /**
         * @return replicaSetName
         */
        public String getReplicaSetName() {
            return this.replicaSetName;
        }

        /**
         * @return replicaSets
         */
        public ReplicaSets getReplicaSets() {
            return this.replicaSets;
        }

        /**
         * @return replicationFactor
         */
        public String getReplicationFactor() {
            return this.replicationFactor;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return secondaryZoneId
         */
        public String getSecondaryZoneId() {
            return this.secondaryZoneId;
        }

        /**
         * @return shardList
         */
        public ShardList getShardList() {
            return this.shardList;
        }

        /**
         * @return storageEngine
         */
        public String getStorageEngine() {
            return this.storageEngine;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        /**
         * @return syncPercent
         */
        public String getSyncPercent() {
            return this.syncPercent;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return useClusterBackup
         */
        public Boolean getUseClusterBackup() {
            return this.useClusterBackup;
        }

        /**
         * @return VPCCloudInstanceIds
         */
        public String getVPCCloudInstanceIds() {
            return this.VPCCloudInstanceIds;
        }

        /**
         * @return VPCId
         */
        public String getVPCId() {
            return this.VPCId;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcAuthMode
         */
        public String getVpcAuthMode() {
            return this.vpcAuthMode;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Boolean burstingEnabled; 
            private String capacityUnit; 
            private String chargeType; 
            private ConfigserverList configserverList; 
            private String creationTime; 
            private String currentKernelVersion; 
            private String DBInstanceClass; 
            private String DBInstanceDescription; 
            private String DBInstanceId; 
            private String DBInstanceOrderStatus; 
            private Boolean DBInstanceReleaseProtection; 
            private String DBInstanceStatus; 
            private Integer DBInstanceStorage; 
            private String DBInstanceType; 
            private String destroyTime; 
            private Boolean encrypted; 
            private String encryptionKey; 
            private String engine; 
            private String engineVersion; 
            private String expireTime; 
            private String hiddenZoneId; 
            private String kindCode; 
            private String lastDowngradeTime; 
            private String lockMode; 
            private String maintainEndTime; 
            private String maintainStartTime; 
            private Integer maxConnections; 
            private Integer maxIOPS; 
            private Integer maxMBPS; 
            private MongosList mongosList; 
            private String networkType; 
            private String protocolType; 
            private Long provisionedIops; 
            private String readonlyReplicas; 
            private String regionId; 
            private String replacateId; 
            private String replicaSetName; 
            private ReplicaSets replicaSets; 
            private String replicationFactor; 
            private String resourceGroupId; 
            private String secondaryZoneId; 
            private ShardList shardList; 
            private String storageEngine; 
            private String storageType; 
            private String syncPercent; 
            private Tags tags; 
            private Boolean useClusterBackup; 
            private String VPCCloudInstanceIds; 
            private String VPCId; 
            private String vSwitchId; 
            private String vpcAuthMode; 
            private String zoneId; 

            /**
             * <p>Indicates whether performance burst is enabled for the ESSD AutoPL disk.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder burstingEnabled(Boolean burstingEnabled) {
                this.burstingEnabled = burstingEnabled;
                return this;
            }

            /**
             * <p>The read and write throughput consumed by the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder capacityUnit(String capacityUnit) {
                this.capacityUnit = capacityUnit;
                return this;
            }

            /**
             * <p>The billing method of the instance. Valid values:</p>
             * <ul>
             * <li><strong>PrePaid</strong>: subscription</li>
             * <li><strong>PostPaid</strong>: pay-as-you-go</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PostPaid</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The details of the ConfigServer node.</p>
             * <blockquote>
             * <p> This parameter is returned if the instance is a sharded cluster instance.</p>
             * </blockquote>
             */
            public Builder configserverList(ConfigserverList configserverList) {
                this.configserverList = configserverList;
                return this;
            }

            /**
             * <p>The time when the instance was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-02T07:43:59Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The minor version of the current database in the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>5.0.5-20220721143518_0</p>
             */
            public Builder currentKernelVersion(String currentKernelVersion) {
                this.currentKernelVersion = currentKernelVersion;
                return this;
            }

            /**
             * <p>The instance type of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dds.mongo.mid</p>
             */
            public Builder DBInstanceClass(String DBInstanceClass) {
                this.DBInstanceClass = DBInstanceClass;
                return this;
            }

            /**
             * <p>The name of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Test database</p>
             */
            public Builder DBInstanceDescription(String DBInstanceDescription) {
                this.DBInstanceDescription = DBInstanceDescription;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>dds-bp11483712c1****</p>
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * <p>The status of the orders generated for the instance. Valid values:</p>
             * <ul>
             * <li><strong>all_completed</strong>: All orders are being produced or complete.</li>
             * <li><strong>order_unpaid</strong>: The instance has unpaid orders.</li>
             * <li><strong>order_wait_for_produce</strong>: Orders are being delivered for production.</li>
             * </ul>
             * <blockquote>
             * <p> The order production process includes the following steps: place an order, pay for an order, deliver an order for production, produce an order, and complete the production.</p>
             * </blockquote>
             * <ul>
             * <li>If an order is in the <strong>order_wait_for_produce</strong> state for a long time, an error occurs when the order is being delivered for production. The system will automatically retry.</li>
             * <li>The instance status changes only when the order is in the producing and complete state, such as changing configurations and running.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>all_completed</p>
             */
            public Builder DBInstanceOrderStatus(String DBInstanceOrderStatus) {
                this.DBInstanceOrderStatus = DBInstanceOrderStatus;
                return this;
            }

            /**
             * <p>Indicates whether release protection is enabled for the instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder DBInstanceReleaseProtection(Boolean DBInstanceReleaseProtection) {
                this.DBInstanceReleaseProtection = DBInstanceReleaseProtection;
                return this;
            }

            /**
             * <p>The status of the instance. For more information, see <a href="https://help.aliyun.com/document_detail/63870.html">Instance states</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder DBInstanceStatus(String DBInstanceStatus) {
                this.DBInstanceStatus = DBInstanceStatus;
                return this;
            }

            /**
             * <p>The storage capacity of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder DBInstanceStorage(Integer DBInstanceStorage) {
                this.DBInstanceStorage = DBInstanceStorage;
                return this;
            }

            /**
             * <p>The architecture of the instance. Valid values:</p>
             * <ul>
             * <li><strong>replicate</strong>: replica set instance</li>
             * <li><strong>sharding</strong>: sharded cluster instance</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>replicate</p>
             */
            public Builder DBInstanceType(String DBInstanceType) {
                this.DBInstanceType = DBInstanceType;
                return this;
            }

            /**
             * <p>The time when the instance data was destroyed. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-10T16:00:00Z</p>
             */
            public Builder destroyTime(String destroyTime) {
                this.destroyTime = destroyTime;
                return this;
            }

            /**
             * <p>Indicates whether disk encryption is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder encrypted(Boolean encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * <p>The Key Management Service (KMS) key used for disk encryption.</p>
             * 
             * <strong>example:</strong>
             * <p>07609cc3-3109-408f-a35e-c548e776da0b</p>
             */
            public Builder encryptionKey(String encryptionKey) {
                this.encryptionKey = encryptionKey;
                return this;
            }

            /**
             * <p>The database engine of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>MongoDB</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The database engine version of the instance.</p>
             * <ul>
             * <li><strong>6.0</strong></li>
             * <li><strong>5.0</strong></li>
             * <li><strong>4.4</strong></li>
             * <li><strong>4.2</strong></li>
             * <li><strong>4.0</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>4.4</p>
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * <p>The time when the subscription instance expires. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z format. The time is displayed in UTC.</p>
             * <blockquote>
             * <p> This parameter is returned if the instance is a subscription instance.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2022-02-05T16:00Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The ID of the secondary zone 2 of the instance. Valid values:</p>
             * <ul>
             * <li><strong>cn-hangzhou-g</strong>: Hangzhou Zone G</li>
             * <li><strong>cn-hangzhou-h</strong>: Hangzhou Zone H</li>
             * <li><strong>cn-hangzhou-i</strong>: Hangzhou Zone I</li>
             * <li><strong>cn-hongkong-b</strong>: Hongkong Zone B</li>
             * <li><strong>cn-hongkong-c</strong>: Hongkong Zone C</li>
             * <li><strong>cn-hongkong-d</strong>: Hongkong Zone D</li>
             * <li><strong>cn-wulanchabu-a</strong>: Ulanqab Zone A</li>
             * <li><strong>cn-wulanchabu-b</strong>: Ulanqab Zone B</li>
             * <li><strong>cn-wulanchabu-c</strong>: Ulanqab Zone C</li>
             * <li><strong>ap-southeast-1a</strong>: Singapore Zone A</li>
             * <li><strong>ap-southeast-1b</strong>: Singapore Zone B</li>
             * <li><strong>ap-southeast-1c</strong>: Singapore Zone C</li>
             * <li><strong>ap-southeast-5a</strong>: Jakarta Zone A</li>
             * <li><strong>ap-southeast-5b</strong>: Jakarta Zone B</li>
             * <li><strong>ap-southeast-5c</strong>: Jakarta Zone C</li>
             * <li><strong>eu-central-1a</strong>: Frankfurt Zone A</li>
             * <li><strong>eu-central-1b</strong>: Frankfurt Zone B</li>
             * <li><strong>eu-central-1c</strong>: Frankfurt Zone C</li>
             * </ul>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><p>This parameter is returned if the instance is a replica set or sharded cluster instance that runs MongoDB 4.4 or 5.0 and uses multi-zone deployment.</p>
             * </li>
             * <li><p>This parameter is returned only if you use the China site (aliyun.com).</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-h</p>
             */
            public Builder hiddenZoneId(String hiddenZoneId) {
                this.hiddenZoneId = hiddenZoneId;
                return this;
            }

            /**
             * <p>The kind code of the instance. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: physical machine</li>
             * <li><strong>1</strong>: Elastic Compute Service (ECS) instance</li>
             * <li><strong>2</strong>: Docker cluster</li>
             * <li><strong>18</strong>: Kubernetes cluster</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder kindCode(String kindCode) {
                this.kindCode = kindCode;
                return this;
            }

            /**
             * <p>The date when the last downgrade operation was performed on the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-08</p>
             */
            public Builder lastDowngradeTime(String lastDowngradeTime) {
                this.lastDowngradeTime = lastDowngradeTime;
                return this;
            }

            /**
             * <p>The lock status of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Unlock</strong>: The instance is not locked.</li>
             * <li><strong>ManualLock</strong>: The instance is manually locked.</li>
             * <li><strong>LockByExpiration</strong>: The instance is automatically locked due to instance expiration.</li>
             * <li><strong>LockByRestoration</strong>: The instance is automatically locked before the instance is rolled back.</li>
             * <li><strong>LockByDiskQuota</strong>: The instance is automatically locked after the storage space is exhausted.</li>
             * <li><strong>Released</strong>: The instance is released.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Unlock</p>
             */
            public Builder lockMode(String lockMode) {
                this.lockMode = lockMode;
                return this;
            }

            /**
             * <p>The end time of the maintenance window. The time follows the ISO 8601 standard in the <em>HH:mm</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>03:00Z</p>
             */
            public Builder maintainEndTime(String maintainEndTime) {
                this.maintainEndTime = maintainEndTime;
                return this;
            }

            /**
             * <p>The start time of the maintenance window. The time follows the ISO 8601 standard in the <em>HH:mm</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>18:00Z</p>
             */
            public Builder maintainStartTime(String maintainStartTime) {
                this.maintainStartTime = maintainStartTime;
                return this;
            }

            /**
             * <p>The maximum number of connections to the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder maxConnections(Integer maxConnections) {
                this.maxConnections = maxConnections;
                return this;
            }

            /**
             * <p>The maximum IOPS of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder maxIOPS(Integer maxIOPS) {
                this.maxIOPS = maxIOPS;
                return this;
            }

            /**
             * <p>The maximum MBPS of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>350</p>
             */
            public Builder maxMBPS(Integer maxMBPS) {
                this.maxMBPS = maxMBPS;
                return this;
            }

            /**
             * <p>The details of the mongos node.</p>
             * <blockquote>
             * <p> This parameter is returned if the instance is a sharded cluster instance.</p>
             * </blockquote>
             */
            public Builder mongosList(MongosList mongosList) {
                this.mongosList = mongosList;
                return this;
            }

            /**
             * <p>The network type of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Classic</strong>: classic network</li>
             * <li><strong>VPC</strong>: VPC</li>
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
             * <p>The access protocol type of the instance. Valid values:</p>
             * <ul>
             * <li><strong>mongodb</strong></li>
             * <li><strong>dynamodb</strong></li>
             * </ul>
             * <blockquote>
             * <p> This parameter is returned if the instance is a sharded cluster instance.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>mongodb</p>
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * <p>The provisioned performance of the ESSD AutoPL disk.</p>
             * 
             * <strong>example:</strong>
             * <p>1960</p>
             */
            public Builder provisionedIops(Long provisionedIops) {
                this.provisionedIops = provisionedIops;
                return this;
            }

            /**
             * <p>The number of read-only nodes in the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder readonlyReplicas(String readonlyReplicas) {
                this.readonlyReplicas = readonlyReplicas;
                return this;
            }

            /**
             * <p>The region ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The logical ID of the replica set instance.</p>
             * <blockquote>
             * <p> ApsaraDB for MongoDB does not support new instances of this type. This parameter applies only to previous-version replica set instances.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>bls-m****</p>
             */
            public Builder replacateId(String replacateId) {
                this.replacateId = replacateId;
                return this;
            }

            /**
             * <p>The name of the replica set instance.</p>
             * <blockquote>
             * <p> This parameter is returned if the instance is a replica set instance.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>mgset-10ace****</p>
             */
            public Builder replicaSetName(String replicaSetName) {
                this.replicaSetName = replicaSetName;
                return this;
            }

            /**
             * <p>The information of the replica set instance.</p>
             * <blockquote>
             * <p> This parameter is returned if the instance is a replica set instance.</p>
             * </blockquote>
             */
            public Builder replicaSets(ReplicaSets replicaSets) {
                this.replicaSets = replicaSets;
                return this;
            }

            /**
             * <p>The number of nodes in the instance.</p>
             * <blockquote>
             * <p> This parameter is returned if the instance is a replica set instance.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder replicationFactor(String replicationFactor) {
                this.replicationFactor = replicationFactor;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the instance belongs.</p>
             * <blockquote>
             * <p> This parameter is returned only if you use the China site (aliyun.com).</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmyiu4ekp****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The ID of the secondary zone 1 of the instance. Valid values:</p>
             * <ul>
             * <li><strong>cn-hangzhou-g</strong>: Hangzhou Zone G</li>
             * <li><strong>cn-hangzhou-h</strong>: Hangzhou Zone H</li>
             * <li><strong>cn-hangzhou-i</strong>: Hangzhou Zone I</li>
             * <li><strong>cn-hongkong-b</strong>: Hongkong Zone B</li>
             * <li><strong>cn-hongkong-c</strong>: Hongkong Zone C</li>
             * <li><strong>cn-hongkong-d</strong>: Hongkong Zone D</li>
             * <li><strong>cn-wulanchabu-a</strong>: Ulanqab Zone A</li>
             * <li><strong>cn-wulanchabu-b</strong>: Ulanqab Zone B</li>
             * <li><strong>cn-wulanchabu-c</strong>: Ulanqab Zone C</li>
             * <li><strong>ap-southeast-1a</strong>: Singapore Zone A</li>
             * <li><strong>ap-southeast-1b</strong>: Singapore Zone B</li>
             * <li><strong>ap-southeast-1c</strong>: Singapore Zone C</li>
             * <li><strong>ap-southeast-5a</strong>: Jakarta Zone A</li>
             * <li><strong>ap-southeast-5b</strong>: Jakarta Zone B</li>
             * <li><strong>ap-southeast-5c</strong>: Jakarta Zone C</li>
             * <li><strong>eu-central-1a</strong>: Frankfurt Zone A</li>
             * <li><strong>eu-central-1b</strong>: Frankfurt Zone B</li>
             * <li><strong>eu-central-1c</strong>: Frankfurt Zone C</li>
             * </ul>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><p>This parameter is returned if the instance is a replica set or sharded cluster instance that runs MongoDB 4.4 or 5.0 and uses multi-zone deployment.</p>
             * </li>
             * <li><p>This parameter is returned only if you use the China site (aliyun.com).</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-i</p>
             */
            public Builder secondaryZoneId(String secondaryZoneId) {
                this.secondaryZoneId = secondaryZoneId;
                return this;
            }

            /**
             * <p>The details of the shard node.</p>
             * <blockquote>
             * <p> This parameter is returned if the instance is a sharded cluster instance.</p>
             * </blockquote>
             */
            public Builder shardList(ShardList shardList) {
                this.shardList = shardList;
                return this;
            }

            /**
             * <p>The storage engine of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>WiredTiger</p>
             */
            public Builder storageEngine(String storageEngine) {
                this.storageEngine = storageEngine;
                return this;
            }

            /**
             * <p>The storage type of the instance. Valid values:</p>
             * <p><strong>cloud_essd1</strong>: ESSD PL1 <strong>cloud_essd2</strong>: ESSD PL2 <strong>cloud_essd3</strong>: ESSD PL3 <strong>local_ssd</strong>: local SSD <strong>cloud_essd_dbfs_s</strong>: DBFS disk</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_essd1</p>
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * <p>The progress of data synchronization in percentage. When you are changing the configurations of the instance, you must synchronize the data of the instance. You can obtain the data synchronization progress based on the value returned for this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>0.8</p>
             */
            public Builder syncPercent(String syncPercent) {
                this.syncPercent = syncPercent;
                return this;
            }

            /**
             * <p>The details of the instance tags.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>Indicates whether the cluster backup mode is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The cluster backup mode is enabled.</li>
             * <li><strong>false</strong>: The cluster backup mode is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder useClusterBackup(Boolean useClusterBackup) {
                this.useClusterBackup = useClusterBackup;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * <blockquote>
             * <p> This parameter is returned if the network type of the instance is VPC.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>dds-bp11483712c1****</p>
             */
            public Builder VPCCloudInstanceIds(String VPCCloudInstanceIds) {
                this.VPCCloudInstanceIds = VPCCloudInstanceIds;
                return this;
            }

            /**
             * <p>The VPC ID of the instance.</p>
             * <blockquote>
             * <p> This parameter is returned if the network type of the instance is VPC.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1n3i15v90el48nx****</p>
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * <p>The vSwitch ID of the instance.</p>
             * <blockquote>
             * <p> This parameter is returned if the network type of the instance is VPC.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1oo2a7isyrb8igf****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>Indicates whether password-free access within the VPC is enabled. Valid values:</p>
             * <ul>
             * <li><strong>Open</strong>: Password-free access within the VPC is enabled.</li>
             * <li><strong>Close</strong>: Password-free access within the VPC is disabled, and you must use a password for access.</li>
             * <li><strong>NotSupport</strong>: Password-free access within the VPC is not supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Open</p>
             */
            public Builder vpcAuthMode(String vpcAuthMode) {
                this.vpcAuthMode = vpcAuthMode;
                return this;
            }

            /**
             * <p>The ID of the zone in which the instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-b</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public DBInstance build() {
                return new DBInstance(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceAttributeResponseBody</p>
     */
    public static class DBInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstance")
        private java.util.List<DBInstance> DBInstance;

        private DBInstances(Builder builder) {
            this.DBInstance = builder.DBInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstances create() {
            return builder().build();
        }

        /**
         * @return DBInstance
         */
        public java.util.List<DBInstance> getDBInstance() {
            return this.DBInstance;
        }

        public static final class Builder {
            private java.util.List<DBInstance> DBInstance; 

            /**
             * DBInstance.
             */
            public Builder DBInstance(java.util.List<DBInstance> DBInstance) {
                this.DBInstance = DBInstance;
                return this;
            }

            public DBInstances build() {
                return new DBInstances(this);
            } 

        } 

    }
}
