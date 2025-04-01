// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link DescribeCdcInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCdcInfoResponseBody</p>
 */
public class DescribeCdcInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean success;

    private DescribeCdcInfoResponseBody(Builder builder) {
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdcInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeCdcInfoResponseBody model) {
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>9B2F3840-5C98-475C-B269-2D5C3A31797C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeCdcInfoResponseBody build() {
            return new DescribeCdcInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCdcInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdcInfoResponseBody</p>
     */
    public static class PhysicalNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AZone")
        private String aZone;

        @com.aliyun.core.annotation.NameInMap("Disk")
        private Integer disk;

        @com.aliyun.core.annotation.NameInMap("NodeClass")
        private String nodeClass;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private PhysicalNodes(Builder builder) {
            this.aZone = builder.aZone;
            this.disk = builder.disk;
            this.nodeClass = builder.nodeClass;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.status = builder.status;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PhysicalNodes create() {
            return builder().build();
        }

        /**
         * @return aZone
         */
        public String getAZone() {
            return this.aZone;
        }

        /**
         * @return disk
         */
        public Integer getDisk() {
            return this.disk;
        }

        /**
         * @return nodeClass
         */
        public String getNodeClass() {
            return this.nodeClass;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String aZone; 
            private Integer disk; 
            private String nodeClass; 
            private String nodeId; 
            private String nodeName; 
            private String status; 
            private String version; 

            private Builder() {
            } 

            private Builder(PhysicalNodes model) {
                this.aZone = model.aZone;
                this.disk = model.disk;
                this.nodeClass = model.nodeClass;
                this.nodeId = model.nodeId;
                this.nodeName = model.nodeName;
                this.status = model.status;
                this.version = model.version;
            } 

            /**
             * AZone.
             */
            public Builder aZone(String aZone) {
                this.aZone = aZone;
                return this;
            }

            /**
             * Disk.
             */
            public Builder disk(Integer disk) {
                this.disk = disk;
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
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * NodeName.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
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
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public PhysicalNodes build() {
                return new PhysicalNodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCdcInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdcInfoResponseBody</p>
     */
    public static class InstanceTopologyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterType")
        private String clusterType;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("HashLevel")
        private String hashLevel;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("PhysicalNodes")
        private java.util.List<PhysicalNodes> physicalNodes;

        @com.aliyun.core.annotation.NameInMap("StreamNum")
        private Integer streamNum;

        private InstanceTopologyList(Builder builder) {
            this.clusterType = builder.clusterType;
            this.comment = builder.comment;
            this.groupName = builder.groupName;
            this.hashLevel = builder.hashLevel;
            this.instanceName = builder.instanceName;
            this.physicalNodes = builder.physicalNodes;
            this.streamNum = builder.streamNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTopologyList create() {
            return builder().build();
        }

        /**
         * @return clusterType
         */
        public String getClusterType() {
            return this.clusterType;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return hashLevel
         */
        public String getHashLevel() {
            return this.hashLevel;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return physicalNodes
         */
        public java.util.List<PhysicalNodes> getPhysicalNodes() {
            return this.physicalNodes;
        }

        /**
         * @return streamNum
         */
        public Integer getStreamNum() {
            return this.streamNum;
        }

        public static final class Builder {
            private String clusterType; 
            private String comment; 
            private String groupName; 
            private String hashLevel; 
            private String instanceName; 
            private java.util.List<PhysicalNodes> physicalNodes; 
            private Integer streamNum; 

            private Builder() {
            } 

            private Builder(InstanceTopologyList model) {
                this.clusterType = model.clusterType;
                this.comment = model.comment;
                this.groupName = model.groupName;
                this.hashLevel = model.hashLevel;
                this.instanceName = model.instanceName;
                this.physicalNodes = model.physicalNodes;
                this.streamNum = model.streamNum;
            } 

            /**
             * ClusterType.
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * HashLevel.
             */
            public Builder hashLevel(String hashLevel) {
                this.hashLevel = hashLevel;
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
             * PhysicalNodes.
             */
            public Builder physicalNodes(java.util.List<PhysicalNodes> physicalNodes) {
                this.physicalNodes = physicalNodes;
                return this;
            }

            /**
             * StreamNum.
             */
            public Builder streamNum(Integer streamNum) {
                this.streamNum = streamNum;
                return this;
            }

            public InstanceTopologyList build() {
                return new InstanceTopologyList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCdcInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdcInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BinlogPersistTime")
        private Integer binlogPersistTime;

        @com.aliyun.core.annotation.NameInMap("BinlogSize")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer binlogSize;

        @com.aliyun.core.annotation.NameInMap("CdcNewVersion")
        @com.aliyun.core.annotation.Validation(required = true)
        private String cdcNewVersion;

        @com.aliyun.core.annotation.NameInMap("CheckSumSwitch")
        private String checkSumSwitch;

        @com.aliyun.core.annotation.NameInMap("EnableCyclicReplication")
        private Boolean enableCyclicReplication;

        @com.aliyun.core.annotation.NameInMap("InstanceTopologyList")
        private java.util.List<InstanceTopologyList> instanceTopologyList;

        @com.aliyun.core.annotation.NameInMap("ServerId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer serverId;

        @com.aliyun.core.annotation.NameInMap("VersionSupportMultiCdc")
        private Boolean versionSupportMultiCdc;

        private Data(Builder builder) {
            this.binlogPersistTime = builder.binlogPersistTime;
            this.binlogSize = builder.binlogSize;
            this.cdcNewVersion = builder.cdcNewVersion;
            this.checkSumSwitch = builder.checkSumSwitch;
            this.enableCyclicReplication = builder.enableCyclicReplication;
            this.instanceTopologyList = builder.instanceTopologyList;
            this.serverId = builder.serverId;
            this.versionSupportMultiCdc = builder.versionSupportMultiCdc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return binlogPersistTime
         */
        public Integer getBinlogPersistTime() {
            return this.binlogPersistTime;
        }

        /**
         * @return binlogSize
         */
        public Integer getBinlogSize() {
            return this.binlogSize;
        }

        /**
         * @return cdcNewVersion
         */
        public String getCdcNewVersion() {
            return this.cdcNewVersion;
        }

        /**
         * @return checkSumSwitch
         */
        public String getCheckSumSwitch() {
            return this.checkSumSwitch;
        }

        /**
         * @return enableCyclicReplication
         */
        public Boolean getEnableCyclicReplication() {
            return this.enableCyclicReplication;
        }

        /**
         * @return instanceTopologyList
         */
        public java.util.List<InstanceTopologyList> getInstanceTopologyList() {
            return this.instanceTopologyList;
        }

        /**
         * @return serverId
         */
        public Integer getServerId() {
            return this.serverId;
        }

        /**
         * @return versionSupportMultiCdc
         */
        public Boolean getVersionSupportMultiCdc() {
            return this.versionSupportMultiCdc;
        }

        public static final class Builder {
            private Integer binlogPersistTime; 
            private Integer binlogSize; 
            private String cdcNewVersion; 
            private String checkSumSwitch; 
            private Boolean enableCyclicReplication; 
            private java.util.List<InstanceTopologyList> instanceTopologyList; 
            private Integer serverId; 
            private Boolean versionSupportMultiCdc; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.binlogPersistTime = model.binlogPersistTime;
                this.binlogSize = model.binlogSize;
                this.cdcNewVersion = model.cdcNewVersion;
                this.checkSumSwitch = model.checkSumSwitch;
                this.enableCyclicReplication = model.enableCyclicReplication;
                this.instanceTopologyList = model.instanceTopologyList;
                this.serverId = model.serverId;
                this.versionSupportMultiCdc = model.versionSupportMultiCdc;
            } 

            /**
             * BinlogPersistTime.
             */
            public Builder binlogPersistTime(Integer binlogPersistTime) {
                this.binlogPersistTime = binlogPersistTime;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>524288000</p>
             */
            public Builder binlogSize(Integer binlogSize) {
                this.binlogSize = binlogSize;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>polarx-cdc-kernel-***</p>
             */
            public Builder cdcNewVersion(String cdcNewVersion) {
                this.cdcNewVersion = cdcNewVersion;
                return this;
            }

            /**
             * CheckSumSwitch.
             */
            public Builder checkSumSwitch(String checkSumSwitch) {
                this.checkSumSwitch = checkSumSwitch;
                return this;
            }

            /**
             * EnableCyclicReplication.
             */
            public Builder enableCyclicReplication(Boolean enableCyclicReplication) {
                this.enableCyclicReplication = enableCyclicReplication;
                return this;
            }

            /**
             * InstanceTopologyList.
             */
            public Builder instanceTopologyList(java.util.List<InstanceTopologyList> instanceTopologyList) {
                this.instanceTopologyList = instanceTopologyList;
                return this;
            }

            /**
             * <p>server id</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>3014767486</p>
             */
            public Builder serverId(Integer serverId) {
                this.serverId = serverId;
                return this;
            }

            /**
             * VersionSupportMultiCdc.
             */
            public Builder versionSupportMultiCdc(Boolean versionSupportMultiCdc) {
                this.versionSupportMultiCdc = versionSupportMultiCdc;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
