// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstanceDiagnosisSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceDiagnosisSummaryResponseBody</p>
 */
public class DescribeDBInstanceDiagnosisSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List < Items> items;

    @com.aliyun.core.annotation.NameInMap("MasterStatusInfo")
    private MasterStatusInfo masterStatusInfo;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SegmentStatusInfo")
    private SegmentStatusInfo segmentStatusInfo;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private DescribeDBInstanceDiagnosisSummaryResponseBody(Builder builder) {
        this.items = builder.items;
        this.masterStatusInfo = builder.masterStatusInfo;
        this.pageNumber = builder.pageNumber;
        this.requestId = builder.requestId;
        this.segmentStatusInfo = builder.segmentStatusInfo;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceDiagnosisSummaryResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public java.util.List < Items> getItems() {
        return this.items;
    }

    /**
     * @return masterStatusInfo
     */
    public MasterStatusInfo getMasterStatusInfo() {
        return this.masterStatusInfo;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return segmentStatusInfo
     */
    public SegmentStatusInfo getSegmentStatusInfo() {
        return this.segmentStatusInfo;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Items> items; 
        private MasterStatusInfo masterStatusInfo; 
        private String pageNumber; 
        private String requestId; 
        private SegmentStatusInfo segmentStatusInfo; 
        private String totalCount; 

        /**
         * The group ID.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * The state information about the coordinator node.
         */
        public Builder masterStatusInfo(MasterStatusInfo masterStatusInfo) {
            this.masterStatusInfo = masterStatusInfo;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The state information about compute nodes.
         */
        public Builder segmentStatusInfo(SegmentStatusInfo segmentStatusInfo) {
            this.segmentStatusInfo = segmentStatusInfo;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDBInstanceDiagnosisSummaryResponseBody build() {
            return new DescribeDBInstanceDiagnosisSummaryResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Hostname")
        private String hostname;

        @com.aliyun.core.annotation.NameInMap("NodeAddress")
        private String nodeAddress;

        @com.aliyun.core.annotation.NameInMap("NodeCID")
        private String nodeCID;

        @com.aliyun.core.annotation.NameInMap("NodeID")
        private String nodeID;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("NodePort")
        private String nodePort;

        @com.aliyun.core.annotation.NameInMap("NodePreferredRole")
        private String nodePreferredRole;

        @com.aliyun.core.annotation.NameInMap("NodeReplicationMode")
        private String nodeReplicationMode;

        @com.aliyun.core.annotation.NameInMap("NodeRole")
        private String nodeRole;

        @com.aliyun.core.annotation.NameInMap("NodeStatus")
        private String nodeStatus;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        private Items(Builder builder) {
            this.hostname = builder.hostname;
            this.nodeAddress = builder.nodeAddress;
            this.nodeCID = builder.nodeCID;
            this.nodeID = builder.nodeID;
            this.nodeName = builder.nodeName;
            this.nodePort = builder.nodePort;
            this.nodePreferredRole = builder.nodePreferredRole;
            this.nodeReplicationMode = builder.nodeReplicationMode;
            this.nodeRole = builder.nodeRole;
            this.nodeStatus = builder.nodeStatus;
            this.nodeType = builder.nodeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return hostname
         */
        public String getHostname() {
            return this.hostname;
        }

        /**
         * @return nodeAddress
         */
        public String getNodeAddress() {
            return this.nodeAddress;
        }

        /**
         * @return nodeCID
         */
        public String getNodeCID() {
            return this.nodeCID;
        }

        /**
         * @return nodeID
         */
        public String getNodeID() {
            return this.nodeID;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return nodePort
         */
        public String getNodePort() {
            return this.nodePort;
        }

        /**
         * @return nodePreferredRole
         */
        public String getNodePreferredRole() {
            return this.nodePreferredRole;
        }

        /**
         * @return nodeReplicationMode
         */
        public String getNodeReplicationMode() {
            return this.nodeReplicationMode;
        }

        /**
         * @return nodeRole
         */
        public String getNodeRole() {
            return this.nodeRole;
        }

        /**
         * @return nodeStatus
         */
        public String getNodeStatus() {
            return this.nodeStatus;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        public static final class Builder {
            private String hostname; 
            private String nodeAddress; 
            private String nodeCID; 
            private String nodeID; 
            private String nodeName; 
            private String nodePort; 
            private String nodePreferredRole; 
            private String nodeReplicationMode; 
            private String nodeRole; 
            private String nodeStatus; 
            private String nodeType; 

            /**
             * The name of the node.
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * The IP address of the node.
             */
            public Builder nodeAddress(String nodeAddress) {
                this.nodeAddress = nodeAddress;
                return this;
            }

            /**
             * The node group ID.
             */
            public Builder nodeCID(String nodeCID) {
                this.nodeCID = nodeCID;
                return this;
            }

            /**
             * The node ID.
             */
            public Builder nodeID(String nodeID) {
                this.nodeID = nodeID;
                return this;
            }

            /**
             * The name of the host where the node resides.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * The port number of the node.
             */
            public Builder nodePort(String nodePort) {
                this.nodePort = nodePort;
                return this;
            }

            /**
             * The initial role of the node. Valid values:
             * <p>
             * 
             * *   **primary**: primary node.
             * *   **mirror**: secondary node.
             * 
             * If the value of this parameter is the same as that of **NodeRole**, no primary/secondary switchover occurs. If the value of this parameter is different from that of **NodeRole**, a primary/secondary switchover occurs.
             */
            public Builder nodePreferredRole(String nodePreferredRole) {
                this.nodePreferredRole = nodePreferredRole;
                return this;
            }

            /**
             * The data synchronization state of the node. Valid values:
             * <p>
             * 
             * *   **Synced**: The node data is synchronized.
             * *   **Not Syncing**: The node data is not synchronized.
             * *   **No sync required**: Data synchronization is not required. This value may be returned only for the coordinator node.
             */
            public Builder nodeReplicationMode(String nodeReplicationMode) {
                this.nodeReplicationMode = nodeReplicationMode;
                return this;
            }

            /**
             * The current role of the node. Valid values:
             * <p>
             * 
             * *   **primary**: primary node.
             * *   **mirror**: secondary node.
             */
            public Builder nodeRole(String nodeRole) {
                this.nodeRole = nodeRole;
                return this;
            }

            /**
             * The running state of the node. Valid values:
             * <p>
             * 
             * *   **UP**: The node is running.
             * *   **DOWN**: The node is faulty.
             */
            public Builder nodeStatus(String nodeStatus) {
                this.nodeStatus = nodeStatus;
                return this;
            }

            /**
             * The type of the node. Valid values:
             * <p>
             * 
             * *   **master**: primary coordinator node.
             * *   **slave**: standby coordinator node.
             * *   **segment**: compute node.
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    public static class MasterStatusInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExceptionNodeNum")
        private Integer exceptionNodeNum;

        @com.aliyun.core.annotation.NameInMap("NormalNodeNum")
        private Integer normalNodeNum;

        @com.aliyun.core.annotation.NameInMap("NotPreferredNodeNum")
        private Integer notPreferredNodeNum;

        @com.aliyun.core.annotation.NameInMap("NotSyncingNodeNum")
        private Integer notSyncingNodeNum;

        @com.aliyun.core.annotation.NameInMap("PreferredNodeNum")
        private Integer preferredNodeNum;

        @com.aliyun.core.annotation.NameInMap("SyncedNodeNum")
        private Integer syncedNodeNum;

        private MasterStatusInfo(Builder builder) {
            this.exceptionNodeNum = builder.exceptionNodeNum;
            this.normalNodeNum = builder.normalNodeNum;
            this.notPreferredNodeNum = builder.notPreferredNodeNum;
            this.notSyncingNodeNum = builder.notSyncingNodeNum;
            this.preferredNodeNum = builder.preferredNodeNum;
            this.syncedNodeNum = builder.syncedNodeNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MasterStatusInfo create() {
            return builder().build();
        }

        /**
         * @return exceptionNodeNum
         */
        public Integer getExceptionNodeNum() {
            return this.exceptionNodeNum;
        }

        /**
         * @return normalNodeNum
         */
        public Integer getNormalNodeNum() {
            return this.normalNodeNum;
        }

        /**
         * @return notPreferredNodeNum
         */
        public Integer getNotPreferredNodeNum() {
            return this.notPreferredNodeNum;
        }

        /**
         * @return notSyncingNodeNum
         */
        public Integer getNotSyncingNodeNum() {
            return this.notSyncingNodeNum;
        }

        /**
         * @return preferredNodeNum
         */
        public Integer getPreferredNodeNum() {
            return this.preferredNodeNum;
        }

        /**
         * @return syncedNodeNum
         */
        public Integer getSyncedNodeNum() {
            return this.syncedNodeNum;
        }

        public static final class Builder {
            private Integer exceptionNodeNum; 
            private Integer normalNodeNum; 
            private Integer notPreferredNodeNum; 
            private Integer notSyncingNodeNum; 
            private Integer preferredNodeNum; 
            private Integer syncedNodeNum; 

            /**
             * The number of abnormal nodes.
             */
            public Builder exceptionNodeNum(Integer exceptionNodeNum) {
                this.exceptionNodeNum = exceptionNodeNum;
                return this;
            }

            /**
             * The number of normal nodes.
             */
            public Builder normalNodeNum(Integer normalNodeNum) {
                this.normalNodeNum = normalNodeNum;
                return this;
            }

            /**
             * The number of nodes whose roles are reversed.
             */
            public Builder notPreferredNodeNum(Integer notPreferredNodeNum) {
                this.notPreferredNodeNum = notPreferredNodeNum;
                return this;
            }

            /**
             * The number of unsynchronized nodes.
             */
            public Builder notSyncingNodeNum(Integer notSyncingNodeNum) {
                this.notSyncingNodeNum = notSyncingNodeNum;
                return this;
            }

            /**
             * The number of nodes whose roles are normal.
             */
            public Builder preferredNodeNum(Integer preferredNodeNum) {
                this.preferredNodeNum = preferredNodeNum;
                return this;
            }

            /**
             * The number of synchronized nodes.
             */
            public Builder syncedNodeNum(Integer syncedNodeNum) {
                this.syncedNodeNum = syncedNodeNum;
                return this;
            }

            public MasterStatusInfo build() {
                return new MasterStatusInfo(this);
            } 

        } 

    }
    public static class SegmentStatusInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExceptionNodeNum")
        private Integer exceptionNodeNum;

        @com.aliyun.core.annotation.NameInMap("NormalNodeNum")
        private Integer normalNodeNum;

        @com.aliyun.core.annotation.NameInMap("NotPreferredNodeNum")
        private Integer notPreferredNodeNum;

        @com.aliyun.core.annotation.NameInMap("NotSyncingNodeNum")
        private Integer notSyncingNodeNum;

        @com.aliyun.core.annotation.NameInMap("PreferredNodeNum")
        private Integer preferredNodeNum;

        @com.aliyun.core.annotation.NameInMap("SyncedNodeNum")
        private Integer syncedNodeNum;

        private SegmentStatusInfo(Builder builder) {
            this.exceptionNodeNum = builder.exceptionNodeNum;
            this.normalNodeNum = builder.normalNodeNum;
            this.notPreferredNodeNum = builder.notPreferredNodeNum;
            this.notSyncingNodeNum = builder.notSyncingNodeNum;
            this.preferredNodeNum = builder.preferredNodeNum;
            this.syncedNodeNum = builder.syncedNodeNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SegmentStatusInfo create() {
            return builder().build();
        }

        /**
         * @return exceptionNodeNum
         */
        public Integer getExceptionNodeNum() {
            return this.exceptionNodeNum;
        }

        /**
         * @return normalNodeNum
         */
        public Integer getNormalNodeNum() {
            return this.normalNodeNum;
        }

        /**
         * @return notPreferredNodeNum
         */
        public Integer getNotPreferredNodeNum() {
            return this.notPreferredNodeNum;
        }

        /**
         * @return notSyncingNodeNum
         */
        public Integer getNotSyncingNodeNum() {
            return this.notSyncingNodeNum;
        }

        /**
         * @return preferredNodeNum
         */
        public Integer getPreferredNodeNum() {
            return this.preferredNodeNum;
        }

        /**
         * @return syncedNodeNum
         */
        public Integer getSyncedNodeNum() {
            return this.syncedNodeNum;
        }

        public static final class Builder {
            private Integer exceptionNodeNum; 
            private Integer normalNodeNum; 
            private Integer notPreferredNodeNum; 
            private Integer notSyncingNodeNum; 
            private Integer preferredNodeNum; 
            private Integer syncedNodeNum; 

            /**
             * The number of abnormal nodes.
             */
            public Builder exceptionNodeNum(Integer exceptionNodeNum) {
                this.exceptionNodeNum = exceptionNodeNum;
                return this;
            }

            /**
             * The number of normal nodes.
             */
            public Builder normalNodeNum(Integer normalNodeNum) {
                this.normalNodeNum = normalNodeNum;
                return this;
            }

            /**
             * The number of nodes whose roles are reversed.
             */
            public Builder notPreferredNodeNum(Integer notPreferredNodeNum) {
                this.notPreferredNodeNum = notPreferredNodeNum;
                return this;
            }

            /**
             * The number of unsynchronized nodes.
             */
            public Builder notSyncingNodeNum(Integer notSyncingNodeNum) {
                this.notSyncingNodeNum = notSyncingNodeNum;
                return this;
            }

            /**
             * The number of nodes whose roles are normal.
             */
            public Builder preferredNodeNum(Integer preferredNodeNum) {
                this.preferredNodeNum = preferredNodeNum;
                return this;
            }

            /**
             * The number of synchronized nodes.
             */
            public Builder syncedNodeNum(Integer syncedNodeNum) {
                this.syncedNodeNum = syncedNodeNum;
                return this;
            }

            public SegmentStatusInfo build() {
                return new SegmentStatusInfo(this);
            } 

        } 

    }
}
