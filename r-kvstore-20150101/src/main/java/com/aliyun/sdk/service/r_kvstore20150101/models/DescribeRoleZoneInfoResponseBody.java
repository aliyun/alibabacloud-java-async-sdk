// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeRoleZoneInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRoleZoneInfoResponseBody</p>
 */
public class DescribeRoleZoneInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Node")
    private Node node;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>Details about each node in an ApsaraDB for Redis instance.</p>
         */
        public Builder node(Node node) {
            this.node = node;
            return this;
        }

        /**
         * <p>The number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>224B97FB-A275-4EAC-86E9-8922FEA2****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeRoleZoneInfoResponseBody build() {
            return new DescribeRoleZoneInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRoleZoneInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRoleZoneInfoResponseBody</p>
     */
    public static class NodeInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentBandWidth")
        private Long currentBandWidth;

        @com.aliyun.core.annotation.NameInMap("CurrentMinorVersion")
        private String currentMinorVersion;

        @com.aliyun.core.annotation.NameInMap("CustinsId")
        private String custinsId;

        @com.aliyun.core.annotation.NameInMap("DefaultBandWidth")
        private Long defaultBandWidth;

        @com.aliyun.core.annotation.NameInMap("InsName")
        private String insName;

        @com.aliyun.core.annotation.NameInMap("InsType")
        private Integer insType;

        @com.aliyun.core.annotation.NameInMap("IsLatestVersion")
        private Integer isLatestVersion;

        @com.aliyun.core.annotation.NameInMap("IsOpenBandWidthService")
        private Boolean isOpenBandWidthService;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
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
             * <p>The current bandwidth of the node, which consists of the default bandwidth and the increased bandwidth. Unit: MB/s.</p>
             * <blockquote>
             * <ul>
             * <li>You can call the <a href="https://help.aliyun.com/document_detail/206173.html">EnableAdditionalBandwidth</a> operation to specify the increased bandwidth.</li>
             * <li>You can also use this parameter to calculate the increased bandwidth. For example, if the default bandwidth of the node is 96 MB/s and the returned value of this parameter is 100, the increased bandwidth is 4 MB/s.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder currentBandWidth(Long currentBandWidth) {
                this.currentBandWidth = currentBandWidth;
                return this;
            }

            /**
             * <p>The minor version of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>redis-5.0_0.3.10</p>
             */
            public Builder currentMinorVersion(String currentMinorVersion) {
                this.currentMinorVersion = currentMinorVersion;
                return this;
            }

            /**
             * <p>The ID of the data shard.</p>
             * 
             * <strong>example:</strong>
             * <p>30381****</p>
             */
            public Builder custinsId(String custinsId) {
                this.custinsId = custinsId;
                return this;
            }

            /**
             * <p>The default bandwidth of the node. Unit: MB/s.</p>
             * 
             * <strong>example:</strong>
             * <p>96</p>
             */
            public Builder defaultBandWidth(Long defaultBandWidth) {
                this.defaultBandWidth = defaultBandWidth;
                return this;
            }

            /**
             * <p>The ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>r-t4nlenc2p04uvb****</p>
             */
            public Builder insName(String insName) {
                this.insName = insName;
                return this;
            }

            /**
             * <p>Indicates whether the node is a read replica. If the node is a read replica, <strong>3</strong> is returned.</p>
             * <blockquote>
             * <p> If the node is not a read replica, no value is returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder insType(Integer insType) {
                this.insType = insType;
                return this;
            }

            /**
             * <p>Indicates whether the minor version is the latest version. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The minor version is not the latest version.</li>
             * <li><strong>1</strong>: The minor version is the latest version.</li>
             * </ul>
             * <blockquote>
             * <p> To update the minor version, call the <a href="https://help.aliyun.com/document_detail/129381.html">ModifyInstanceMinorVersion</a> operation.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isLatestVersion(Integer isLatestVersion) {
                this.isLatestVersion = isLatestVersion;
                return this;
            }

            /**
             * <p>Indicates whether the bandwidth of the node is increased. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The bandwidth of the node is not increased.</li>
             * <li><strong>false</strong>: The bandwidth of the node is increased.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isOpenBandWidthService(Boolean isOpenBandWidthService) {
                this.isOpenBandWidthService = isOpenBandWidthService;
                return this;
            }

            /**
             * <p>This parameter is used only for internal maintenance of ApsaraDB for Redis instances.</p>
             * 
             * <strong>example:</strong>
             * <p>10065****</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The node type. Valid values:</p>
             * <ul>
             * <li><strong>db</strong>: data node.</li>
             * <li><strong>proxy</strong>: proxy node.</li>
             * <li><strong>normal</strong>: regular node. This value is returned when the instance runs in the standard architecture.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * <p>The role of the node. Valid values:</p>
             * <ul>
             * <li><strong>master</strong>: master node</li>
             * <li><strong>slave</strong>: replica node</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>master</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>The ID of the zone.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-b</p>
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
    /**
     * 
     * {@link DescribeRoleZoneInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRoleZoneInfoResponseBody</p>
     */
    public static class Node extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeInfo")
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
