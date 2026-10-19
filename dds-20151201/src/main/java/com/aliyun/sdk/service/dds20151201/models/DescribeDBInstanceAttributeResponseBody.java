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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDBInstanceAttributeResponseBody model) {
            this.DBInstances = model.DBInstances;
            this.requestId = model.requestId;
        } 

        /**
         * DBInstances.
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

            private Builder() {
            } 

            private Builder(ConfigserverAttribute model) {
                this.connectString = model.connectString;
                this.currentKernelVersion = model.currentKernelVersion;
                this.lockMode = model.lockMode;
                this.maxConnections = model.maxConnections;
                this.maxIOPS = model.maxIOPS;
                this.nodeClass = model.nodeClass;
                this.nodeDescription = model.nodeDescription;
                this.nodeId = model.nodeId;
                this.nodeStorage = model.nodeStorage;
                this.port = model.port;
                this.status = model.status;
            } 

            /**
             * ConnectString.
             */
            public Builder connectString(String connectString) {
                this.connectString = connectString;
                return this;
            }

            /**
             * CurrentKernelVersion.
             */
            public Builder currentKernelVersion(String currentKernelVersion) {
                this.currentKernelVersion = currentKernelVersion;
                return this;
            }

            /**
             * LockMode.
             */
            public Builder lockMode(String lockMode) {
                this.lockMode = lockMode;
                return this;
            }

            /**
             * MaxConnections.
             */
            public Builder maxConnections(Integer maxConnections) {
                this.maxConnections = maxConnections;
                return this;
            }

            /**
             * MaxIOPS.
             */
            public Builder maxIOPS(Integer maxIOPS) {
                this.maxIOPS = maxIOPS;
                return this;
            }

            /**
             * NodeClass.
             */
            public Builder nodeClass(String nodeClass) {
                this.nodeClass = nodeClass;
                return this;
            }

            /**
             * NodeDescription.
             */
            public Builder nodeDescription(String nodeDescription) {
                this.nodeDescription = nodeDescription;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * NodeStorage.
             */
            public Builder nodeStorage(Integer nodeStorage) {
                this.nodeStorage = nodeStorage;
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
             * Status.
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

            private Builder() {
            } 

            private Builder(ConfigserverList model) {
                this.configserverAttribute = model.configserverAttribute;
            } 

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

            private Builder() {
            } 

            private Builder(MongosAttribute model) {
                this.connectSting = model.connectSting;
                this.connectString = model.connectString;
                this.currentKernelVersion = model.currentKernelVersion;
                this.lockMode = model.lockMode;
                this.maxConnections = model.maxConnections;
                this.maxIOPS = model.maxIOPS;
                this.nodeClass = model.nodeClass;
                this.nodeDescription = model.nodeDescription;
                this.nodeId = model.nodeId;
                this.port = model.port;
                this.status = model.status;
                this.VPCId = model.VPCId;
                this.vSwitchId = model.vSwitchId;
                this.vpcCloudInstanceId = model.vpcCloudInstanceId;
            } 

            /**
             * ConnectSting.
             */
            public Builder connectSting(String connectSting) {
                this.connectSting = connectSting;
                return this;
            }

            /**
             * ConnectString.
             */
            public Builder connectString(String connectString) {
                this.connectString = connectString;
                return this;
            }

            /**
             * CurrentKernelVersion.
             */
            public Builder currentKernelVersion(String currentKernelVersion) {
                this.currentKernelVersion = currentKernelVersion;
                return this;
            }

            /**
             * LockMode.
             */
            public Builder lockMode(String lockMode) {
                this.lockMode = lockMode;
                return this;
            }

            /**
             * MaxConnections.
             */
            public Builder maxConnections(Integer maxConnections) {
                this.maxConnections = maxConnections;
                return this;
            }

            /**
             * MaxIOPS.
             */
            public Builder maxIOPS(Integer maxIOPS) {
                this.maxIOPS = maxIOPS;
                return this;
            }

            /**
             * NodeClass.
             */
            public Builder nodeClass(String nodeClass) {
                this.nodeClass = nodeClass;
                return this;
            }

            /**
             * NodeDescription.
             */
            public Builder nodeDescription(String nodeDescription) {
                this.nodeDescription = nodeDescription;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * VPCId.
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * VpcCloudInstanceId.
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

            private Builder() {
            } 

            private Builder(MongosList model) {
                this.mongosAttribute = model.mongosAttribute;
            } 

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

            private Builder() {
            } 

            private Builder(ReplicaSet model) {
                this.connectionDomain = model.connectionDomain;
                this.connectionPort = model.connectionPort;
                this.networkType = model.networkType;
                this.replicaSetRole = model.replicaSetRole;
                this.VPCCloudInstanceId = model.VPCCloudInstanceId;
                this.VPCId = model.VPCId;
                this.vSwitchId = model.vSwitchId;
            } 

            /**
             * ConnectionDomain.
             */
            public Builder connectionDomain(String connectionDomain) {
                this.connectionDomain = connectionDomain;
                return this;
            }

            /**
             * ConnectionPort.
             */
            public Builder connectionPort(String connectionPort) {
                this.connectionPort = connectionPort;
                return this;
            }

            /**
             * NetworkType.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * ReplicaSetRole.
             */
            public Builder replicaSetRole(String replicaSetRole) {
                this.replicaSetRole = replicaSetRole;
                return this;
            }

            /**
             * VPCCloudInstanceId.
             */
            public Builder VPCCloudInstanceId(String VPCCloudInstanceId) {
                this.VPCCloudInstanceId = VPCCloudInstanceId;
                return this;
            }

            /**
             * VPCId.
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * VSwitchId.
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

            private Builder() {
            } 

            private Builder(ReplicaSets model) {
                this.replicaSet = model.replicaSet;
            } 

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

        @com.aliyun.core.annotation.NameInMap("EbsBandwidth")
        private Integer ebsBandwidth;

        @com.aliyun.core.annotation.NameInMap("EbsIOPS")
        private Integer ebsIOPS;

        @com.aliyun.core.annotation.NameInMap("EcsBandwidth")
        private Integer ecsBandwidth;

        @com.aliyun.core.annotation.NameInMap("EcsIOPS")
        private Integer ecsIOPS;

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

        @com.aliyun.core.annotation.NameInMap("ReplicaSetName")
        private String replicaSetName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ShardAttribute(Builder builder) {
            this.connectString = builder.connectString;
            this.currentKernelVersion = builder.currentKernelVersion;
            this.ebsBandwidth = builder.ebsBandwidth;
            this.ebsIOPS = builder.ebsIOPS;
            this.ecsBandwidth = builder.ecsBandwidth;
            this.ecsIOPS = builder.ecsIOPS;
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
            this.replicaSetName = builder.replicaSetName;
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
         * @return ebsBandwidth
         */
        public Integer getEbsBandwidth() {
            return this.ebsBandwidth;
        }

        /**
         * @return ebsIOPS
         */
        public Integer getEbsIOPS() {
            return this.ebsIOPS;
        }

        /**
         * @return ecsBandwidth
         */
        public Integer getEcsBandwidth() {
            return this.ecsBandwidth;
        }

        /**
         * @return ecsIOPS
         */
        public Integer getEcsIOPS() {
            return this.ecsIOPS;
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
         * @return replicaSetName
         */
        public String getReplicaSetName() {
            return this.replicaSetName;
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
            private Integer ebsBandwidth; 
            private Integer ebsIOPS; 
            private Integer ecsBandwidth; 
            private Integer ecsIOPS; 
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
            private String replicaSetName; 
            private String status; 

            private Builder() {
            } 

            private Builder(ShardAttribute model) {
                this.connectString = model.connectString;
                this.currentKernelVersion = model.currentKernelVersion;
                this.ebsBandwidth = model.ebsBandwidth;
                this.ebsIOPS = model.ebsIOPS;
                this.ecsBandwidth = model.ecsBandwidth;
                this.ecsIOPS = model.ecsIOPS;
                this.lockMode = model.lockMode;
                this.maxConnections = model.maxConnections;
                this.maxDiskMbps = model.maxDiskMbps;
                this.maxIOPS = model.maxIOPS;
                this.nodeClass = model.nodeClass;
                this.nodeDescription = model.nodeDescription;
                this.nodeId = model.nodeId;
                this.nodeStorage = model.nodeStorage;
                this.port = model.port;
                this.readonlyReplicas = model.readonlyReplicas;
                this.replicaSetName = model.replicaSetName;
                this.status = model.status;
            } 

            /**
             * ConnectString.
             */
            public Builder connectString(String connectString) {
                this.connectString = connectString;
                return this;
            }

            /**
             * CurrentKernelVersion.
             */
            public Builder currentKernelVersion(String currentKernelVersion) {
                this.currentKernelVersion = currentKernelVersion;
                return this;
            }

            /**
             * EbsBandwidth.
             */
            public Builder ebsBandwidth(Integer ebsBandwidth) {
                this.ebsBandwidth = ebsBandwidth;
                return this;
            }

            /**
             * EbsIOPS.
             */
            public Builder ebsIOPS(Integer ebsIOPS) {
                this.ebsIOPS = ebsIOPS;
                return this;
            }

            /**
             * EcsBandwidth.
             */
            public Builder ecsBandwidth(Integer ecsBandwidth) {
                this.ecsBandwidth = ecsBandwidth;
                return this;
            }

            /**
             * EcsIOPS.
             */
            public Builder ecsIOPS(Integer ecsIOPS) {
                this.ecsIOPS = ecsIOPS;
                return this;
            }

            /**
             * LockMode.
             */
            public Builder lockMode(String lockMode) {
                this.lockMode = lockMode;
                return this;
            }

            /**
             * MaxConnections.
             */
            public Builder maxConnections(Integer maxConnections) {
                this.maxConnections = maxConnections;
                return this;
            }

            /**
             * MaxDiskMbps.
             */
            public Builder maxDiskMbps(String maxDiskMbps) {
                this.maxDiskMbps = maxDiskMbps;
                return this;
            }

            /**
             * MaxIOPS.
             */
            public Builder maxIOPS(Integer maxIOPS) {
                this.maxIOPS = maxIOPS;
                return this;
            }

            /**
             * NodeClass.
             */
            public Builder nodeClass(String nodeClass) {
                this.nodeClass = nodeClass;
                return this;
            }

            /**
             * NodeDescription.
             */
            public Builder nodeDescription(String nodeDescription) {
                this.nodeDescription = nodeDescription;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * NodeStorage.
             */
            public Builder nodeStorage(Integer nodeStorage) {
                this.nodeStorage = nodeStorage;
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
             * ReadonlyReplicas.
             */
            public Builder readonlyReplicas(Integer readonlyReplicas) {
                this.readonlyReplicas = readonlyReplicas;
                return this;
            }

            /**
             * ReplicaSetName.
             */
            public Builder replicaSetName(String replicaSetName) {
                this.replicaSetName = replicaSetName;
                return this;
            }

            /**
             * Status.
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

            private Builder() {
            } 

            private Builder(ShardList model) {
                this.shardAttribute = model.shardAttribute;
            } 

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
    public static class ShardSearchNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("SearchNodeClass")
        private String searchNodeClass;

        @com.aliyun.core.annotation.NameInMap("SearchNodeCount")
        private String searchNodeCount;

        @com.aliyun.core.annotation.NameInMap("SearchNodeId")
        private String searchNodeId;

        @com.aliyun.core.annotation.NameInMap("SearchNodeStorage")
        private String searchNodeStorage;

        private ShardSearchNodes(Builder builder) {
            this.nodeId = builder.nodeId;
            this.searchNodeClass = builder.searchNodeClass;
            this.searchNodeCount = builder.searchNodeCount;
            this.searchNodeId = builder.searchNodeId;
            this.searchNodeStorage = builder.searchNodeStorage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ShardSearchNodes create() {
            return builder().build();
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return searchNodeClass
         */
        public String getSearchNodeClass() {
            return this.searchNodeClass;
        }

        /**
         * @return searchNodeCount
         */
        public String getSearchNodeCount() {
            return this.searchNodeCount;
        }

        /**
         * @return searchNodeId
         */
        public String getSearchNodeId() {
            return this.searchNodeId;
        }

        /**
         * @return searchNodeStorage
         */
        public String getSearchNodeStorage() {
            return this.searchNodeStorage;
        }

        public static final class Builder {
            private String nodeId; 
            private String searchNodeClass; 
            private String searchNodeCount; 
            private String searchNodeId; 
            private String searchNodeStorage; 

            private Builder() {
            } 

            private Builder(ShardSearchNodes model) {
                this.nodeId = model.nodeId;
                this.searchNodeClass = model.searchNodeClass;
                this.searchNodeCount = model.searchNodeCount;
                this.searchNodeId = model.searchNodeId;
                this.searchNodeStorage = model.searchNodeStorage;
            } 

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * SearchNodeClass.
             */
            public Builder searchNodeClass(String searchNodeClass) {
                this.searchNodeClass = searchNodeClass;
                return this;
            }

            /**
             * SearchNodeCount.
             */
            public Builder searchNodeCount(String searchNodeCount) {
                this.searchNodeCount = searchNodeCount;
                return this;
            }

            /**
             * SearchNodeId.
             */
            public Builder searchNodeId(String searchNodeId) {
                this.searchNodeId = searchNodeId;
                return this;
            }

            /**
             * SearchNodeStorage.
             */
            public Builder searchNodeStorage(String searchNodeStorage) {
                this.searchNodeStorage = searchNodeStorage;
                return this;
            }

            public ShardSearchNodes build() {
                return new ShardSearchNodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceAttributeResponseBody</p>
     */
    public static class DBInstanceShardSearchNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ShardSearchNodes")
        private java.util.List<ShardSearchNodes> shardSearchNodes;

        private DBInstanceShardSearchNodes(Builder builder) {
            this.shardSearchNodes = builder.shardSearchNodes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstanceShardSearchNodes create() {
            return builder().build();
        }

        /**
         * @return shardSearchNodes
         */
        public java.util.List<ShardSearchNodes> getShardSearchNodes() {
            return this.shardSearchNodes;
        }

        public static final class Builder {
            private java.util.List<ShardSearchNodes> shardSearchNodes; 

            private Builder() {
            } 

            private Builder(DBInstanceShardSearchNodes model) {
                this.shardSearchNodes = model.shardSearchNodes;
            } 

            /**
             * ShardSearchNodes.
             */
            public Builder shardSearchNodes(java.util.List<ShardSearchNodes> shardSearchNodes) {
                this.shardSearchNodes = shardSearchNodes;
                return this;
            }

            public DBInstanceShardSearchNodes build() {
                return new DBInstanceShardSearchNodes(this);
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tag = model.tag;
            } 

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
        @com.aliyun.core.annotation.NameInMap("AIGatewayEnabled")
        private Boolean AIGatewayEnabled;

        @com.aliyun.core.annotation.NameInMap("BurstingEnabled")
        private Boolean burstingEnabled;

        @com.aliyun.core.annotation.NameInMap("CapacityUnit")
        private String capacityUnit;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("ColdDataEnabled")
        private Boolean coldDataEnabled;

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

        @com.aliyun.core.annotation.NameInMap("DisasterRecoveryInfo")
        private String disasterRecoveryInfo;

        @com.aliyun.core.annotation.NameInMap("EbsBandwidth")
        private Integer ebsBandwidth;

        @com.aliyun.core.annotation.NameInMap("EbsIOPS")
        private Integer ebsIOPS;

        @com.aliyun.core.annotation.NameInMap("EcsBandwidth")
        private Integer ecsBandwidth;

        @com.aliyun.core.annotation.NameInMap("EcsIOPS")
        private Integer ecsIOPS;

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

        @com.aliyun.core.annotation.NameInMap("SearchNodeClass")
        private String searchNodeClass;

        @com.aliyun.core.annotation.NameInMap("SearchNodeCount")
        private Integer searchNodeCount;

        @com.aliyun.core.annotation.NameInMap("SearchNodeStorage")
        private Integer searchNodeStorage;

        @com.aliyun.core.annotation.NameInMap("SecondaryZoneId")
        private String secondaryZoneId;

        @com.aliyun.core.annotation.NameInMap("ShardList")
        private ShardList shardList;

        @com.aliyun.core.annotation.NameInMap("ShardSearchNodes")
        private DBInstanceShardSearchNodes shardSearchNodes;

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
            this.AIGatewayEnabled = builder.AIGatewayEnabled;
            this.burstingEnabled = builder.burstingEnabled;
            this.capacityUnit = builder.capacityUnit;
            this.chargeType = builder.chargeType;
            this.coldDataEnabled = builder.coldDataEnabled;
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
            this.disasterRecoveryInfo = builder.disasterRecoveryInfo;
            this.ebsBandwidth = builder.ebsBandwidth;
            this.ebsIOPS = builder.ebsIOPS;
            this.ecsBandwidth = builder.ecsBandwidth;
            this.ecsIOPS = builder.ecsIOPS;
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
            this.searchNodeClass = builder.searchNodeClass;
            this.searchNodeCount = builder.searchNodeCount;
            this.searchNodeStorage = builder.searchNodeStorage;
            this.secondaryZoneId = builder.secondaryZoneId;
            this.shardList = builder.shardList;
            this.shardSearchNodes = builder.shardSearchNodes;
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
         * @return AIGatewayEnabled
         */
        public Boolean getAIGatewayEnabled() {
            return this.AIGatewayEnabled;
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
         * @return coldDataEnabled
         */
        public Boolean getColdDataEnabled() {
            return this.coldDataEnabled;
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
         * @return disasterRecoveryInfo
         */
        public String getDisasterRecoveryInfo() {
            return this.disasterRecoveryInfo;
        }

        /**
         * @return ebsBandwidth
         */
        public Integer getEbsBandwidth() {
            return this.ebsBandwidth;
        }

        /**
         * @return ebsIOPS
         */
        public Integer getEbsIOPS() {
            return this.ebsIOPS;
        }

        /**
         * @return ecsBandwidth
         */
        public Integer getEcsBandwidth() {
            return this.ecsBandwidth;
        }

        /**
         * @return ecsIOPS
         */
        public Integer getEcsIOPS() {
            return this.ecsIOPS;
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
         * @return searchNodeClass
         */
        public String getSearchNodeClass() {
            return this.searchNodeClass;
        }

        /**
         * @return searchNodeCount
         */
        public Integer getSearchNodeCount() {
            return this.searchNodeCount;
        }

        /**
         * @return searchNodeStorage
         */
        public Integer getSearchNodeStorage() {
            return this.searchNodeStorage;
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
         * @return shardSearchNodes
         */
        public DBInstanceShardSearchNodes getShardSearchNodes() {
            return this.shardSearchNodes;
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
            private Boolean AIGatewayEnabled; 
            private Boolean burstingEnabled; 
            private String capacityUnit; 
            private String chargeType; 
            private Boolean coldDataEnabled; 
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
            private String disasterRecoveryInfo; 
            private Integer ebsBandwidth; 
            private Integer ebsIOPS; 
            private Integer ecsBandwidth; 
            private Integer ecsIOPS; 
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
            private String searchNodeClass; 
            private Integer searchNodeCount; 
            private Integer searchNodeStorage; 
            private String secondaryZoneId; 
            private ShardList shardList; 
            private DBInstanceShardSearchNodes shardSearchNodes; 
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

            private Builder() {
            } 

            private Builder(DBInstance model) {
                this.AIGatewayEnabled = model.AIGatewayEnabled;
                this.burstingEnabled = model.burstingEnabled;
                this.capacityUnit = model.capacityUnit;
                this.chargeType = model.chargeType;
                this.coldDataEnabled = model.coldDataEnabled;
                this.configserverList = model.configserverList;
                this.creationTime = model.creationTime;
                this.currentKernelVersion = model.currentKernelVersion;
                this.DBInstanceClass = model.DBInstanceClass;
                this.DBInstanceDescription = model.DBInstanceDescription;
                this.DBInstanceId = model.DBInstanceId;
                this.DBInstanceOrderStatus = model.DBInstanceOrderStatus;
                this.DBInstanceReleaseProtection = model.DBInstanceReleaseProtection;
                this.DBInstanceStatus = model.DBInstanceStatus;
                this.DBInstanceStorage = model.DBInstanceStorage;
                this.DBInstanceType = model.DBInstanceType;
                this.destroyTime = model.destroyTime;
                this.disasterRecoveryInfo = model.disasterRecoveryInfo;
                this.ebsBandwidth = model.ebsBandwidth;
                this.ebsIOPS = model.ebsIOPS;
                this.ecsBandwidth = model.ecsBandwidth;
                this.ecsIOPS = model.ecsIOPS;
                this.encrypted = model.encrypted;
                this.encryptionKey = model.encryptionKey;
                this.engine = model.engine;
                this.engineVersion = model.engineVersion;
                this.expireTime = model.expireTime;
                this.hiddenZoneId = model.hiddenZoneId;
                this.kindCode = model.kindCode;
                this.lastDowngradeTime = model.lastDowngradeTime;
                this.lockMode = model.lockMode;
                this.maintainEndTime = model.maintainEndTime;
                this.maintainStartTime = model.maintainStartTime;
                this.maxConnections = model.maxConnections;
                this.maxIOPS = model.maxIOPS;
                this.maxMBPS = model.maxMBPS;
                this.mongosList = model.mongosList;
                this.networkType = model.networkType;
                this.protocolType = model.protocolType;
                this.provisionedIops = model.provisionedIops;
                this.readonlyReplicas = model.readonlyReplicas;
                this.regionId = model.regionId;
                this.replacateId = model.replacateId;
                this.replicaSetName = model.replicaSetName;
                this.replicaSets = model.replicaSets;
                this.replicationFactor = model.replicationFactor;
                this.resourceGroupId = model.resourceGroupId;
                this.searchNodeClass = model.searchNodeClass;
                this.searchNodeCount = model.searchNodeCount;
                this.searchNodeStorage = model.searchNodeStorage;
                this.secondaryZoneId = model.secondaryZoneId;
                this.shardList = model.shardList;
                this.shardSearchNodes = model.shardSearchNodes;
                this.storageEngine = model.storageEngine;
                this.storageType = model.storageType;
                this.syncPercent = model.syncPercent;
                this.tags = model.tags;
                this.useClusterBackup = model.useClusterBackup;
                this.VPCCloudInstanceIds = model.VPCCloudInstanceIds;
                this.VPCId = model.VPCId;
                this.vSwitchId = model.vSwitchId;
                this.vpcAuthMode = model.vpcAuthMode;
                this.zoneId = model.zoneId;
            } 

            /**
             * AIGatewayEnabled.
             */
            public Builder AIGatewayEnabled(Boolean AIGatewayEnabled) {
                this.AIGatewayEnabled = AIGatewayEnabled;
                return this;
            }

            /**
             * BurstingEnabled.
             */
            public Builder burstingEnabled(Boolean burstingEnabled) {
                this.burstingEnabled = burstingEnabled;
                return this;
            }

            /**
             * CapacityUnit.
             */
            public Builder capacityUnit(String capacityUnit) {
                this.capacityUnit = capacityUnit;
                return this;
            }

            /**
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * ColdDataEnabled.
             */
            public Builder coldDataEnabled(Boolean coldDataEnabled) {
                this.coldDataEnabled = coldDataEnabled;
                return this;
            }

            /**
             * ConfigserverList.
             */
            public Builder configserverList(ConfigserverList configserverList) {
                this.configserverList = configserverList;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * CurrentKernelVersion.
             */
            public Builder currentKernelVersion(String currentKernelVersion) {
                this.currentKernelVersion = currentKernelVersion;
                return this;
            }

            /**
             * DBInstanceClass.
             */
            public Builder DBInstanceClass(String DBInstanceClass) {
                this.DBInstanceClass = DBInstanceClass;
                return this;
            }

            /**
             * DBInstanceDescription.
             */
            public Builder DBInstanceDescription(String DBInstanceDescription) {
                this.DBInstanceDescription = DBInstanceDescription;
                return this;
            }

            /**
             * DBInstanceId.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * DBInstanceOrderStatus.
             */
            public Builder DBInstanceOrderStatus(String DBInstanceOrderStatus) {
                this.DBInstanceOrderStatus = DBInstanceOrderStatus;
                return this;
            }

            /**
             * DBInstanceReleaseProtection.
             */
            public Builder DBInstanceReleaseProtection(Boolean DBInstanceReleaseProtection) {
                this.DBInstanceReleaseProtection = DBInstanceReleaseProtection;
                return this;
            }

            /**
             * DBInstanceStatus.
             */
            public Builder DBInstanceStatus(String DBInstanceStatus) {
                this.DBInstanceStatus = DBInstanceStatus;
                return this;
            }

            /**
             * DBInstanceStorage.
             */
            public Builder DBInstanceStorage(Integer DBInstanceStorage) {
                this.DBInstanceStorage = DBInstanceStorage;
                return this;
            }

            /**
             * DBInstanceType.
             */
            public Builder DBInstanceType(String DBInstanceType) {
                this.DBInstanceType = DBInstanceType;
                return this;
            }

            /**
             * DestroyTime.
             */
            public Builder destroyTime(String destroyTime) {
                this.destroyTime = destroyTime;
                return this;
            }

            /**
             * DisasterRecoveryInfo.
             */
            public Builder disasterRecoveryInfo(String disasterRecoveryInfo) {
                this.disasterRecoveryInfo = disasterRecoveryInfo;
                return this;
            }

            /**
             * EbsBandwidth.
             */
            public Builder ebsBandwidth(Integer ebsBandwidth) {
                this.ebsBandwidth = ebsBandwidth;
                return this;
            }

            /**
             * EbsIOPS.
             */
            public Builder ebsIOPS(Integer ebsIOPS) {
                this.ebsIOPS = ebsIOPS;
                return this;
            }

            /**
             * EcsBandwidth.
             */
            public Builder ecsBandwidth(Integer ecsBandwidth) {
                this.ecsBandwidth = ecsBandwidth;
                return this;
            }

            /**
             * EcsIOPS.
             */
            public Builder ecsIOPS(Integer ecsIOPS) {
                this.ecsIOPS = ecsIOPS;
                return this;
            }

            /**
             * Encrypted.
             */
            public Builder encrypted(Boolean encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * EncryptionKey.
             */
            public Builder encryptionKey(String encryptionKey) {
                this.encryptionKey = encryptionKey;
                return this;
            }

            /**
             * Engine.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * EngineVersion.
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * HiddenZoneId.
             */
            public Builder hiddenZoneId(String hiddenZoneId) {
                this.hiddenZoneId = hiddenZoneId;
                return this;
            }

            /**
             * KindCode.
             */
            public Builder kindCode(String kindCode) {
                this.kindCode = kindCode;
                return this;
            }

            /**
             * LastDowngradeTime.
             */
            public Builder lastDowngradeTime(String lastDowngradeTime) {
                this.lastDowngradeTime = lastDowngradeTime;
                return this;
            }

            /**
             * LockMode.
             */
            public Builder lockMode(String lockMode) {
                this.lockMode = lockMode;
                return this;
            }

            /**
             * MaintainEndTime.
             */
            public Builder maintainEndTime(String maintainEndTime) {
                this.maintainEndTime = maintainEndTime;
                return this;
            }

            /**
             * MaintainStartTime.
             */
            public Builder maintainStartTime(String maintainStartTime) {
                this.maintainStartTime = maintainStartTime;
                return this;
            }

            /**
             * MaxConnections.
             */
            public Builder maxConnections(Integer maxConnections) {
                this.maxConnections = maxConnections;
                return this;
            }

            /**
             * MaxIOPS.
             */
            public Builder maxIOPS(Integer maxIOPS) {
                this.maxIOPS = maxIOPS;
                return this;
            }

            /**
             * MaxMBPS.
             */
            public Builder maxMBPS(Integer maxMBPS) {
                this.maxMBPS = maxMBPS;
                return this;
            }

            /**
             * MongosList.
             */
            public Builder mongosList(MongosList mongosList) {
                this.mongosList = mongosList;
                return this;
            }

            /**
             * NetworkType.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * ProtocolType.
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * ProvisionedIops.
             */
            public Builder provisionedIops(Long provisionedIops) {
                this.provisionedIops = provisionedIops;
                return this;
            }

            /**
             * ReadonlyReplicas.
             */
            public Builder readonlyReplicas(String readonlyReplicas) {
                this.readonlyReplicas = readonlyReplicas;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ReplacateId.
             */
            public Builder replacateId(String replacateId) {
                this.replacateId = replacateId;
                return this;
            }

            /**
             * ReplicaSetName.
             */
            public Builder replicaSetName(String replicaSetName) {
                this.replicaSetName = replicaSetName;
                return this;
            }

            /**
             * ReplicaSets.
             */
            public Builder replicaSets(ReplicaSets replicaSets) {
                this.replicaSets = replicaSets;
                return this;
            }

            /**
             * ReplicationFactor.
             */
            public Builder replicationFactor(String replicationFactor) {
                this.replicationFactor = replicationFactor;
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
             * SearchNodeClass.
             */
            public Builder searchNodeClass(String searchNodeClass) {
                this.searchNodeClass = searchNodeClass;
                return this;
            }

            /**
             * SearchNodeCount.
             */
            public Builder searchNodeCount(Integer searchNodeCount) {
                this.searchNodeCount = searchNodeCount;
                return this;
            }

            /**
             * SearchNodeStorage.
             */
            public Builder searchNodeStorage(Integer searchNodeStorage) {
                this.searchNodeStorage = searchNodeStorage;
                return this;
            }

            /**
             * SecondaryZoneId.
             */
            public Builder secondaryZoneId(String secondaryZoneId) {
                this.secondaryZoneId = secondaryZoneId;
                return this;
            }

            /**
             * ShardList.
             */
            public Builder shardList(ShardList shardList) {
                this.shardList = shardList;
                return this;
            }

            /**
             * ShardSearchNodes.
             */
            public Builder shardSearchNodes(DBInstanceShardSearchNodes shardSearchNodes) {
                this.shardSearchNodes = shardSearchNodes;
                return this;
            }

            /**
             * StorageEngine.
             */
            public Builder storageEngine(String storageEngine) {
                this.storageEngine = storageEngine;
                return this;
            }

            /**
             * StorageType.
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * SyncPercent.
             */
            public Builder syncPercent(String syncPercent) {
                this.syncPercent = syncPercent;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * UseClusterBackup.
             */
            public Builder useClusterBackup(Boolean useClusterBackup) {
                this.useClusterBackup = useClusterBackup;
                return this;
            }

            /**
             * VPCCloudInstanceIds.
             */
            public Builder VPCCloudInstanceIds(String VPCCloudInstanceIds) {
                this.VPCCloudInstanceIds = VPCCloudInstanceIds;
                return this;
            }

            /**
             * VPCId.
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * VpcAuthMode.
             */
            public Builder vpcAuthMode(String vpcAuthMode) {
                this.vpcAuthMode = vpcAuthMode;
                return this;
            }

            /**
             * ZoneId.
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

            private Builder() {
            } 

            private Builder(DBInstances model) {
                this.DBInstance = model.DBInstance;
            } 

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
