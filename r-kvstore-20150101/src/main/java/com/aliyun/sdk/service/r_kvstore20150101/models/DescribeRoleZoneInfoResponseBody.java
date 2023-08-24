// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRoleZoneInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRoleZoneInfoResponseBody</p>
 */
public class DescribeRoleZoneInfoResponseBody extends TeaModel {
    @NameInMap("Node")
    private Node node;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeRoleZoneInfoResponseBody(Builder builder) {
        this.node = builder.node;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRoleZoneInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return node
     */
    public Node getNode() {
        return this.node;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Node node; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The role of the node. Valid values:
         * <p>
         * 
         * *   **master**: master node
         * *   **slave**: replica node
         */
        public Builder node(Node node) {
            this.node = node;
            return this;
        }

        /**
         * The ID of the instance. You can call the [DescribeInstances](~~60933~~) operation to query instance IDs.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * Indicates whether the bandwidth of the node is increased. Valid values:
         * <p>
         * 
         * *   **true**: The bandwidth of the node is not increased.
         * *   **false**: The bandwidth of the node is increased.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * This parameter is used only for internal maintenance of ApsaraDB for Redis instances.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the node is a read replica. If the node is a read replica, **3** is returned.
         * <p>
         * 
         * >  If the node is not a read replica, no value is returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeRoleZoneInfoResponseBody build() {
            return new DescribeRoleZoneInfoResponseBody(this);
        } 

    } 

    public static class NodeInfo extends TeaModel {
        @NameInMap("CurrentBandWidth")
        private Long currentBandWidth;

        @NameInMap("CurrentMinorVersion")
        private String currentMinorVersion;

        @NameInMap("CustinsId")
        private String custinsId;

        @NameInMap("DefaultBandWidth")
        private Long defaultBandWidth;

        @NameInMap("InsName")
        private String insName;

        @NameInMap("InsType")
        private Integer insType;

        @NameInMap("IsLatestVersion")
        private Integer isLatestVersion;

        @NameInMap("IsOpenBandWidthService")
        private Boolean isOpenBandWidthService;

        @NameInMap("NodeId")
        private String nodeId;

        @NameInMap("NodeType")
        private String nodeType;

        @NameInMap("Role")
        private String role;

        @NameInMap("ZoneId")
        private String zoneId;

        private NodeInfo(Builder builder) {
            this.currentBandWidth = builder.currentBandWidth;
            this.currentMinorVersion = builder.currentMinorVersion;
            this.custinsId = builder.custinsId;
            this.defaultBandWidth = builder.defaultBandWidth;
            this.insName = builder.insName;
            this.insType = builder.insType;
            this.isLatestVersion = builder.isLatestVersion;
            this.isOpenBandWidthService = builder.isOpenBandWidthService;
            this.nodeId = builder.nodeId;
            this.nodeType = builder.nodeType;
            this.role = builder.role;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeInfo create() {
            return builder().build();
        }

        /**
         * @return currentBandWidth
         */
        public Long getCurrentBandWidth() {
            return this.currentBandWidth;
        }

        /**
         * @return currentMinorVersion
         */
        public String getCurrentMinorVersion() {
            return this.currentMinorVersion;
        }

        /**
         * @return custinsId
         */
        public String getCustinsId() {
            return this.custinsId;
        }

        /**
         * @return defaultBandWidth
         */
        public Long getDefaultBandWidth() {
            return this.defaultBandWidth;
        }

        /**
         * @return insName
         */
        public String getInsName() {
            return this.insName;
        }

        /**
         * @return insType
         */
        public Integer getInsType() {
            return this.insType;
        }

        /**
         * @return isLatestVersion
         */
        public Integer getIsLatestVersion() {
            return this.isLatestVersion;
        }

        /**
         * @return isOpenBandWidthService
         */
        public Boolean getIsOpenBandWidthService() {
            return this.isOpenBandWidthService;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Long currentBandWidth; 
            private String currentMinorVersion; 
            private String custinsId; 
            private Long defaultBandWidth; 
            private String insName; 
            private Integer insType; 
            private Integer isLatestVersion; 
            private Boolean isOpenBandWidthService; 
            private String nodeId; 
            private String nodeType; 
            private String role; 
            private String zoneId; 

            /**
             * The number of the returned page.
             */
            public Builder currentBandWidth(Long currentBandWidth) {
                this.currentBandWidth = currentBandWidth;
                return this;
            }

            /**
             * The number of entries to return on each page. Valid values: **10**, **20**, and **50**. Default value: **10**.
             */
            public Builder currentMinorVersion(String currentMinorVersion) {
                this.currentMinorVersion = currentMinorVersion;
                return this;
            }

            /**
             * CustinsId.
             */
            public Builder custinsId(String custinsId) {
                this.custinsId = custinsId;
                return this;
            }

            /**
             * The node type. Valid values:
             * <p>
             * 
             * *   **db**: data node.
             * *   **proxy**: proxy node.
             * *   **normal**: regular node. This value is returned when the instance runs in the standard architecture.
             */
            public Builder defaultBandWidth(Long defaultBandWidth) {
                this.defaultBandWidth = defaultBandWidth;
                return this;
            }

            /**
             * Indicates whether the minor version is the latest version. Valid values:
             * <p>
             * 
             * *   **0**: The minor version is not the latest version.
             * *   **1**: The minor version is the latest version.
             * 
             * >  To update the minor version, call the [ModifyInstanceMinorVersion](~~129381~~) operation.
             */
            public Builder insName(String insName) {
                this.insName = insName;
                return this;
            }

            /**
             * Details about each node in an ApsaraDB for Redis instance.
             */
            public Builder insType(Integer insType) {
                this.insType = insType;
                return this;
            }

            /**
             * The number of entries returned per page.
             */
            public Builder isLatestVersion(Integer isLatestVersion) {
                this.isLatestVersion = isLatestVersion;
                return this;
            }

            /**
             * DescribeRoleZoneInfo
             */
            public Builder isOpenBandWidthService(Boolean isOpenBandWidthService) {
                this.isOpenBandWidthService = isOpenBandWidthService;
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
             * The ID of the request.
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * Queries information about the type, minor version, and bandwidth of specific nodes in an ApsaraDB for Redis instance, and zones where the nodes are deployed.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public NodeInfo build() {
                return new NodeInfo(this);
            } 

        } 

    }
    public static class Node extends TeaModel {
        @NameInMap("NodeInfo")
        private java.util.List < NodeInfo> nodeInfo;

        private Node(Builder builder) {
            this.nodeInfo = builder.nodeInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Node create() {
            return builder().build();
        }

        /**
         * @return nodeInfo
         */
        public java.util.List < NodeInfo> getNodeInfo() {
            return this.nodeInfo;
        }

        public static final class Builder {
            private java.util.List < NodeInfo> nodeInfo; 

            /**
             * NodeInfo.
             */
            public Builder nodeInfo(java.util.List < NodeInfo> nodeInfo) {
                this.nodeInfo = nodeInfo;
                return this;
            }

            public Node build() {
                return new Node(this);
            } 

        } 

    }
}
