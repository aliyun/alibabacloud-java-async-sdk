// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The group ID.</p>
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The state information about the coordinator node.</p>
         */
        public Builder masterStatusInfo(MasterStatusInfo masterStatusInfo) {
            this.masterStatusInfo = masterStatusInfo;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>070534EC-78D5-5519-83CC-E7B1A9213483</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The state information about compute nodes.</p>
         */
        public Builder segmentStatusInfo(SegmentStatusInfo segmentStatusInfo) {
            this.segmentStatusInfo = segmentStatusInfo;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDBInstanceDiagnosisSummaryResponseBody build() {
            return new DescribeDBInstanceDiagnosisSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBInstanceDiagnosisSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceDiagnosisSummaryResponseBody</p>
     */
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
             * <p>The name of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>gp-t4np568qe9710****-master-100984919</p>
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * <p>The IP address of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder nodeAddress(String nodeAddress) {
                this.nodeAddress = nodeAddress;
                return this;
            }

            /**
             * <p>The node group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder nodeCID(String nodeCID) {
                this.nodeCID = nodeCID;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder nodeID(String nodeID) {
                this.nodeID = nodeID;
                return this;
            }

            /**
             * <p>The name of the host where the node resides.</p>
             * 
             * <strong>example:</strong>
             * <p>ap-southeast-1.i-t4n4c4ryr0yr441d****</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>The port number of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>3000</p>
             */
            public Builder nodePort(String nodePort) {
                this.nodePort = nodePort;
                return this;
            }

            /**
             * <p>The initial role of the node. Valid values:</p>
             * <ul>
             * <li><strong>primary</strong>: primary node.</li>
             * <li><strong>mirror</strong>: secondary node.</li>
             * </ul>
             * <p>If the value of this parameter is the same as that of <strong>NodeRole</strong>, no primary/secondary switchover occurs. If the value of this parameter is different from that of <strong>NodeRole</strong>, a primary/secondary switchover occurs.</p>
             * 
             * <strong>example:</strong>
             * <p>primary</p>
             */
            public Builder nodePreferredRole(String nodePreferredRole) {
                this.nodePreferredRole = nodePreferredRole;
                return this;
            }

            /**
             * <p>The data synchronization state of the node. Valid values:</p>
             * <ul>
             * <li><strong>Synced</strong>: The node data is synchronized.</li>
             * <li><strong>Not Syncing</strong>: The node data is not synchronized.</li>
             * <li><strong>No sync required</strong>: Data synchronization is not required. This value may be returned only for the coordinator node.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Synced</p>
             */
            public Builder nodeReplicationMode(String nodeReplicationMode) {
                this.nodeReplicationMode = nodeReplicationMode;
                return this;
            }

            /**
             * <p>The current role of the node. Valid values:</p>
             * <ul>
             * <li><strong>primary</strong>: primary node.</li>
             * <li><strong>mirror</strong>: secondary node.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>primary</p>
             */
            public Builder nodeRole(String nodeRole) {
                this.nodeRole = nodeRole;
                return this;
            }

            /**
             * <p>The running state of the node. Valid values:</p>
             * <ul>
             * <li><strong>UP</strong>: The node is running.</li>
             * <li><strong>DOWN</strong>: The node is faulty.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>UP</p>
             */
            public Builder nodeStatus(String nodeStatus) {
                this.nodeStatus = nodeStatus;
                return this;
            }

            /**
             * <p>The type of the node. Valid values:</p>
             * <ul>
             * <li><strong>master</strong>: primary coordinator node.</li>
             * <li><strong>slave</strong>: standby coordinator node.</li>
             * <li><strong>segment</strong>: compute node.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>master</p>
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
    /**
     * 
     * {@link DescribeDBInstanceDiagnosisSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceDiagnosisSummaryResponseBody</p>
     */
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
             * <p>The number of abnormal nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder exceptionNodeNum(Integer exceptionNodeNum) {
                this.exceptionNodeNum = exceptionNodeNum;
                return this;
            }

            /**
             * <p>The number of normal nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder normalNodeNum(Integer normalNodeNum) {
                this.normalNodeNum = normalNodeNum;
                return this;
            }

            /**
             * <p>The number of nodes whose roles are reversed.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder notPreferredNodeNum(Integer notPreferredNodeNum) {
                this.notPreferredNodeNum = notPreferredNodeNum;
                return this;
            }

            /**
             * <p>The number of unsynchronized nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder notSyncingNodeNum(Integer notSyncingNodeNum) {
                this.notSyncingNodeNum = notSyncingNodeNum;
                return this;
            }

            /**
             * <p>The number of nodes whose roles are normal.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder preferredNodeNum(Integer preferredNodeNum) {
                this.preferredNodeNum = preferredNodeNum;
                return this;
            }

            /**
             * <p>The number of synchronized nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link DescribeDBInstanceDiagnosisSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceDiagnosisSummaryResponseBody</p>
     */
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
             * <p>The number of abnormal nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder exceptionNodeNum(Integer exceptionNodeNum) {
                this.exceptionNodeNum = exceptionNodeNum;
                return this;
            }

            /**
             * <p>The number of normal nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder normalNodeNum(Integer normalNodeNum) {
                this.normalNodeNum = normalNodeNum;
                return this;
            }

            /**
             * <p>The number of nodes whose roles are reversed.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder notPreferredNodeNum(Integer notPreferredNodeNum) {
                this.notPreferredNodeNum = notPreferredNodeNum;
                return this;
            }

            /**
             * <p>The number of unsynchronized nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder notSyncingNodeNum(Integer notSyncingNodeNum) {
                this.notSyncingNodeNum = notSyncingNodeNum;
                return this;
            }

            /**
             * <p>The number of nodes whose roles are normal.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder preferredNodeNum(Integer preferredNodeNum) {
                this.preferredNodeNum = preferredNodeNum;
                return this;
            }

            /**
             * <p>The number of synchronized nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
