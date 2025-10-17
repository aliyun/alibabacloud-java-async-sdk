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
 * {@link DescribeAIDBClusterAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAIDBClusterAttributeResponseBody</p>
 */
public class DescribeAIDBClusterAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AiNodeType")
    private String aiNodeType;

    @com.aliyun.core.annotation.NameInMap("CreationTime")
    private String creationTime;

    @com.aliyun.core.annotation.NameInMap("DBClusterDescription")
    private String DBClusterDescription;

    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("DBClusterStatus")
    private String DBClusterStatus;

    @com.aliyun.core.annotation.NameInMap("DBNodes")
    private java.util.List<DBNodes> DBNodes;

    @com.aliyun.core.annotation.NameInMap("DBVersion")
    private String DBVersion;

    @com.aliyun.core.annotation.NameInMap("EndpointList")
    private java.util.List<EndpointList> endpointList;

    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private String expireTime;

    @com.aliyun.core.annotation.NameInMap("Expired")
    private Boolean expired;

    @com.aliyun.core.annotation.NameInMap("InternalIp")
    private String internalIp;

    @com.aliyun.core.annotation.NameInMap("KubeClusterId")
    private String kubeClusterId;

    @com.aliyun.core.annotation.NameInMap("LockMode")
    private String lockMode;

    @com.aliyun.core.annotation.NameInMap("MaxQPM")
    private String maxQPM;

    @com.aliyun.core.annotation.NameInMap("ModelName")
    private String modelName;

    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

    @com.aliyun.core.annotation.NameInMap("PublicIp")
    private String publicIp;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RunType")
    private String runType;

    @com.aliyun.core.annotation.NameInMap("StorageType")
    private String storageType;

    @com.aliyun.core.annotation.NameInMap("VPCId")
    private String VPCId;

    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.NameInMap("Volumes")
    private java.util.List<Volumes> volumes;

    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    @com.aliyun.core.annotation.NameInMap("ZoneIds")
    private String zoneIds;

    private DescribeAIDBClusterAttributeResponseBody(Builder builder) {
        this.aiNodeType = builder.aiNodeType;
        this.creationTime = builder.creationTime;
        this.DBClusterDescription = builder.DBClusterDescription;
        this.DBClusterId = builder.DBClusterId;
        this.DBClusterStatus = builder.DBClusterStatus;
        this.DBNodes = builder.DBNodes;
        this.DBVersion = builder.DBVersion;
        this.endpointList = builder.endpointList;
        this.expireTime = builder.expireTime;
        this.expired = builder.expired;
        this.internalIp = builder.internalIp;
        this.kubeClusterId = builder.kubeClusterId;
        this.lockMode = builder.lockMode;
        this.maxQPM = builder.maxQPM;
        this.modelName = builder.modelName;
        this.payType = builder.payType;
        this.publicIp = builder.publicIp;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.runType = builder.runType;
        this.storageType = builder.storageType;
        this.VPCId = builder.VPCId;
        this.vSwitchId = builder.vSwitchId;
        this.volumes = builder.volumes;
        this.zoneId = builder.zoneId;
        this.zoneIds = builder.zoneIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAIDBClusterAttributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aiNodeType
     */
    public String getAiNodeType() {
        return this.aiNodeType;
    }

    /**
     * @return creationTime
     */
    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * @return DBClusterDescription
     */
    public String getDBClusterDescription() {
        return this.DBClusterDescription;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return DBClusterStatus
     */
    public String getDBClusterStatus() {
        return this.DBClusterStatus;
    }

    /**
     * @return DBNodes
     */
    public java.util.List<DBNodes> getDBNodes() {
        return this.DBNodes;
    }

    /**
     * @return DBVersion
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * @return endpointList
     */
    public java.util.List<EndpointList> getEndpointList() {
        return this.endpointList;
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return expired
     */
    public Boolean getExpired() {
        return this.expired;
    }

    /**
     * @return internalIp
     */
    public String getInternalIp() {
        return this.internalIp;
    }

    /**
     * @return kubeClusterId
     */
    public String getKubeClusterId() {
        return this.kubeClusterId;
    }

    /**
     * @return lockMode
     */
    public String getLockMode() {
        return this.lockMode;
    }

    /**
     * @return maxQPM
     */
    public String getMaxQPM() {
        return this.maxQPM;
    }

    /**
     * @return modelName
     */
    public String getModelName() {
        return this.modelName;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return publicIp
     */
    public String getPublicIp() {
        return this.publicIp;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return runType
     */
    public String getRunType() {
        return this.runType;
    }

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
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
     * @return volumes
     */
    public java.util.List<Volumes> getVolumes() {
        return this.volumes;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    /**
     * @return zoneIds
     */
    public String getZoneIds() {
        return this.zoneIds;
    }

    public static final class Builder {
        private String aiNodeType; 
        private String creationTime; 
        private String DBClusterDescription; 
        private String DBClusterId; 
        private String DBClusterStatus; 
        private java.util.List<DBNodes> DBNodes; 
        private String DBVersion; 
        private java.util.List<EndpointList> endpointList; 
        private String expireTime; 
        private Boolean expired; 
        private String internalIp; 
        private String kubeClusterId; 
        private String lockMode; 
        private String maxQPM; 
        private String modelName; 
        private String payType; 
        private String publicIp; 
        private String regionId; 
        private String requestId; 
        private String runType; 
        private String storageType; 
        private String VPCId; 
        private String vSwitchId; 
        private java.util.List<Volumes> volumes; 
        private String zoneId; 
        private String zoneIds; 

        private Builder() {
        } 

        private Builder(DescribeAIDBClusterAttributeResponseBody model) {
            this.aiNodeType = model.aiNodeType;
            this.creationTime = model.creationTime;
            this.DBClusterDescription = model.DBClusterDescription;
            this.DBClusterId = model.DBClusterId;
            this.DBClusterStatus = model.DBClusterStatus;
            this.DBNodes = model.DBNodes;
            this.DBVersion = model.DBVersion;
            this.endpointList = model.endpointList;
            this.expireTime = model.expireTime;
            this.expired = model.expired;
            this.internalIp = model.internalIp;
            this.kubeClusterId = model.kubeClusterId;
            this.lockMode = model.lockMode;
            this.maxQPM = model.maxQPM;
            this.modelName = model.modelName;
            this.payType = model.payType;
            this.publicIp = model.publicIp;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.runType = model.runType;
            this.storageType = model.storageType;
            this.VPCId = model.VPCId;
            this.vSwitchId = model.vSwitchId;
            this.volumes = model.volumes;
            this.zoneId = model.zoneId;
            this.zoneIds = model.zoneIds;
        } 

        /**
         * AiNodeType.
         */
        public Builder aiNodeType(String aiNodeType) {
            this.aiNodeType = aiNodeType;
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
         * DBClusterDescription.
         */
        public Builder DBClusterDescription(String DBClusterDescription) {
            this.DBClusterDescription = DBClusterDescription;
            return this;
        }

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * DBClusterStatus.
         */
        public Builder DBClusterStatus(String DBClusterStatus) {
            this.DBClusterStatus = DBClusterStatus;
            return this;
        }

        /**
         * DBNodes.
         */
        public Builder DBNodes(java.util.List<DBNodes> DBNodes) {
            this.DBNodes = DBNodes;
            return this;
        }

        /**
         * DBVersion.
         */
        public Builder DBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }

        /**
         * EndpointList.
         */
        public Builder endpointList(java.util.List<EndpointList> endpointList) {
            this.endpointList = endpointList;
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
         * Expired.
         */
        public Builder expired(Boolean expired) {
            this.expired = expired;
            return this;
        }

        /**
         * InternalIp.
         */
        public Builder internalIp(String internalIp) {
            this.internalIp = internalIp;
            return this;
        }

        /**
         * KubeClusterId.
         */
        public Builder kubeClusterId(String kubeClusterId) {
            this.kubeClusterId = kubeClusterId;
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
         * MaxQPM.
         */
        public Builder maxQPM(String maxQPM) {
            this.maxQPM = maxQPM;
            return this;
        }

        /**
         * ModelName.
         */
        public Builder modelName(String modelName) {
            this.modelName = modelName;
            return this;
        }

        /**
         * PayType.
         */
        public Builder payType(String payType) {
            this.payType = payType;
            return this;
        }

        /**
         * PublicIp.
         */
        public Builder publicIp(String publicIp) {
            this.publicIp = publicIp;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>EBEAA83D-1734-42E3-85E3-E25F6E******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RunType.
         */
        public Builder runType(String runType) {
            this.runType = runType;
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
         * Volumes.
         */
        public Builder volumes(java.util.List<Volumes> volumes) {
            this.volumes = volumes;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        /**
         * ZoneIds.
         */
        public Builder zoneIds(String zoneIds) {
            this.zoneIds = zoneIds;
            return this;
        }

        public DescribeAIDBClusterAttributeResponseBody build() {
            return new DescribeAIDBClusterAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAIDBClusterAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAIDBClusterAttributeResponseBody</p>
     */
    public static class ChildVolumes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MountPath")
        private String mountPath;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SizeGB")
        private String sizeGB;

        @com.aliyun.core.annotation.NameInMap("StorageCategory")
        private String storageCategory;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        private ChildVolumes(Builder builder) {
            this.mountPath = builder.mountPath;
            this.name = builder.name;
            this.sizeGB = builder.sizeGB;
            this.storageCategory = builder.storageCategory;
            this.storageType = builder.storageType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChildVolumes create() {
            return builder().build();
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sizeGB
         */
        public String getSizeGB() {
            return this.sizeGB;
        }

        /**
         * @return storageCategory
         */
        public String getStorageCategory() {
            return this.storageCategory;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        public static final class Builder {
            private String mountPath; 
            private String name; 
            private String sizeGB; 
            private String storageCategory; 
            private String storageType; 

            private Builder() {
            } 

            private Builder(ChildVolumes model) {
                this.mountPath = model.mountPath;
                this.name = model.name;
                this.sizeGB = model.sizeGB;
                this.storageCategory = model.storageCategory;
                this.storageType = model.storageType;
            } 

            /**
             * MountPath.
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * SizeGB.
             */
            public Builder sizeGB(String sizeGB) {
                this.sizeGB = sizeGB;
                return this;
            }

            /**
             * StorageCategory.
             */
            public Builder storageCategory(String storageCategory) {
                this.storageCategory = storageCategory;
                return this;
            }

            /**
             * StorageType.
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            public ChildVolumes build() {
                return new ChildVolumes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAIDBClusterAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAIDBClusterAttributeResponseBody</p>
     */
    public static class DBNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChildVolumes")
        private java.util.List<ChildVolumes> childVolumes;

        @com.aliyun.core.annotation.NameInMap("CpuCores")
        private String cpuCores;

        @com.aliyun.core.annotation.NameInMap("DBNodeClass")
        private String DBNodeClass;

        @com.aliyun.core.annotation.NameInMap("DBNodeDescription")
        private String DBNodeDescription;

        @com.aliyun.core.annotation.NameInMap("DBNodeId")
        private String DBNodeId;

        @com.aliyun.core.annotation.NameInMap("DBNodeStatus")
        private String DBNodeStatus;

        @com.aliyun.core.annotation.NameInMap("GPU")
        private String GPU;

        @com.aliyun.core.annotation.NameInMap("LinkIP")
        private String linkIP;

        @com.aliyun.core.annotation.NameInMap("MemorySize")
        private String memorySize;

        @com.aliyun.core.annotation.NameInMap("VNodeId")
        private String vNodeId;

        @com.aliyun.core.annotation.NameInMap("VPCId")
        private String VPCId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private DBNodes(Builder builder) {
            this.childVolumes = builder.childVolumes;
            this.cpuCores = builder.cpuCores;
            this.DBNodeClass = builder.DBNodeClass;
            this.DBNodeDescription = builder.DBNodeDescription;
            this.DBNodeId = builder.DBNodeId;
            this.DBNodeStatus = builder.DBNodeStatus;
            this.GPU = builder.GPU;
            this.linkIP = builder.linkIP;
            this.memorySize = builder.memorySize;
            this.vNodeId = builder.vNodeId;
            this.VPCId = builder.VPCId;
            this.vSwitchId = builder.vSwitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBNodes create() {
            return builder().build();
        }

        /**
         * @return childVolumes
         */
        public java.util.List<ChildVolumes> getChildVolumes() {
            return this.childVolumes;
        }

        /**
         * @return cpuCores
         */
        public String getCpuCores() {
            return this.cpuCores;
        }

        /**
         * @return DBNodeClass
         */
        public String getDBNodeClass() {
            return this.DBNodeClass;
        }

        /**
         * @return DBNodeDescription
         */
        public String getDBNodeDescription() {
            return this.DBNodeDescription;
        }

        /**
         * @return DBNodeId
         */
        public String getDBNodeId() {
            return this.DBNodeId;
        }

        /**
         * @return DBNodeStatus
         */
        public String getDBNodeStatus() {
            return this.DBNodeStatus;
        }

        /**
         * @return GPU
         */
        public String getGPU() {
            return this.GPU;
        }

        /**
         * @return linkIP
         */
        public String getLinkIP() {
            return this.linkIP;
        }

        /**
         * @return memorySize
         */
        public String getMemorySize() {
            return this.memorySize;
        }

        /**
         * @return vNodeId
         */
        public String getVNodeId() {
            return this.vNodeId;
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
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private java.util.List<ChildVolumes> childVolumes; 
            private String cpuCores; 
            private String DBNodeClass; 
            private String DBNodeDescription; 
            private String DBNodeId; 
            private String DBNodeStatus; 
            private String GPU; 
            private String linkIP; 
            private String memorySize; 
            private String vNodeId; 
            private String VPCId; 
            private String vSwitchId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(DBNodes model) {
                this.childVolumes = model.childVolumes;
                this.cpuCores = model.cpuCores;
                this.DBNodeClass = model.DBNodeClass;
                this.DBNodeDescription = model.DBNodeDescription;
                this.DBNodeId = model.DBNodeId;
                this.DBNodeStatus = model.DBNodeStatus;
                this.GPU = model.GPU;
                this.linkIP = model.linkIP;
                this.memorySize = model.memorySize;
                this.vNodeId = model.vNodeId;
                this.VPCId = model.VPCId;
                this.vSwitchId = model.vSwitchId;
                this.zoneId = model.zoneId;
            } 

            /**
             * ChildVolumes.
             */
            public Builder childVolumes(java.util.List<ChildVolumes> childVolumes) {
                this.childVolumes = childVolumes;
                return this;
            }

            /**
             * CpuCores.
             */
            public Builder cpuCores(String cpuCores) {
                this.cpuCores = cpuCores;
                return this;
            }

            /**
             * DBNodeClass.
             */
            public Builder DBNodeClass(String DBNodeClass) {
                this.DBNodeClass = DBNodeClass;
                return this;
            }

            /**
             * DBNodeDescription.
             */
            public Builder DBNodeDescription(String DBNodeDescription) {
                this.DBNodeDescription = DBNodeDescription;
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
             * DBNodeStatus.
             */
            public Builder DBNodeStatus(String DBNodeStatus) {
                this.DBNodeStatus = DBNodeStatus;
                return this;
            }

            /**
             * GPU.
             */
            public Builder GPU(String GPU) {
                this.GPU = GPU;
                return this;
            }

            /**
             * LinkIP.
             */
            public Builder linkIP(String linkIP) {
                this.linkIP = linkIP;
                return this;
            }

            /**
             * MemorySize.
             */
            public Builder memorySize(String memorySize) {
                this.memorySize = memorySize;
                return this;
            }

            /**
             * VNodeId.
             */
            public Builder vNodeId(String vNodeId) {
                this.vNodeId = vNodeId;
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
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public DBNodes build() {
                return new DBNodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAIDBClusterAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAIDBClusterAttributeResponseBody</p>
     */
    public static class NetInfoItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionString")
        private String connectionString;

        @com.aliyun.core.annotation.NameInMap("NetType")
        private String netType;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        private NetInfoItems(Builder builder) {
            this.connectionString = builder.connectionString;
            this.netType = builder.netType;
            this.port = builder.port;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetInfoItems create() {
            return builder().build();
        }

        /**
         * @return connectionString
         */
        public String getConnectionString() {
            return this.connectionString;
        }

        /**
         * @return netType
         */
        public String getNetType() {
            return this.netType;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        public static final class Builder {
            private String connectionString; 
            private String netType; 
            private String port; 

            private Builder() {
            } 

            private Builder(NetInfoItems model) {
                this.connectionString = model.connectionString;
                this.netType = model.netType;
                this.port = model.port;
            } 

            /**
             * ConnectionString.
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * NetType.
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            public NetInfoItems build() {
                return new NetInfoItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAIDBClusterAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAIDBClusterAttributeResponseBody</p>
     */
    public static class EndpointList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NetInfoItems")
        private java.util.List<NetInfoItems> netInfoItems;

        private EndpointList(Builder builder) {
            this.netInfoItems = builder.netInfoItems;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EndpointList create() {
            return builder().build();
        }

        /**
         * @return netInfoItems
         */
        public java.util.List<NetInfoItems> getNetInfoItems() {
            return this.netInfoItems;
        }

        public static final class Builder {
            private java.util.List<NetInfoItems> netInfoItems; 

            private Builder() {
            } 

            private Builder(EndpointList model) {
                this.netInfoItems = model.netInfoItems;
            } 

            /**
             * NetInfoItems.
             */
            public Builder netInfoItems(java.util.List<NetInfoItems> netInfoItems) {
                this.netInfoItems = netInfoItems;
                return this;
            }

            public EndpointList build() {
                return new EndpointList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAIDBClusterAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAIDBClusterAttributeResponseBody</p>
     */
    public static class Volumes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MountPath")
        private String mountPath;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SizeGB")
        private String sizeGB;

        @com.aliyun.core.annotation.NameInMap("StorageCategory")
        private String storageCategory;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        private Volumes(Builder builder) {
            this.mountPath = builder.mountPath;
            this.name = builder.name;
            this.sizeGB = builder.sizeGB;
            this.storageCategory = builder.storageCategory;
            this.storageType = builder.storageType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Volumes create() {
            return builder().build();
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sizeGB
         */
        public String getSizeGB() {
            return this.sizeGB;
        }

        /**
         * @return storageCategory
         */
        public String getStorageCategory() {
            return this.storageCategory;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        public static final class Builder {
            private String mountPath; 
            private String name; 
            private String sizeGB; 
            private String storageCategory; 
            private String storageType; 

            private Builder() {
            } 

            private Builder(Volumes model) {
                this.mountPath = model.mountPath;
                this.name = model.name;
                this.sizeGB = model.sizeGB;
                this.storageCategory = model.storageCategory;
                this.storageType = model.storageType;
            } 

            /**
             * MountPath.
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * SizeGB.
             */
            public Builder sizeGB(String sizeGB) {
                this.sizeGB = sizeGB;
                return this;
            }

            /**
             * StorageCategory.
             */
            public Builder storageCategory(String storageCategory) {
                this.storageCategory = storageCategory;
                return this;
            }

            /**
             * StorageType.
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            public Volumes build() {
                return new Volumes(this);
            } 

        } 

    }
}
