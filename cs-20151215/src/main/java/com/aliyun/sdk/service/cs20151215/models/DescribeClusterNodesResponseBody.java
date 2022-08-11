// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterNodesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterNodesResponseBody</p>
 */
public class DescribeClusterNodesResponseBody extends TeaModel {
    @NameInMap("nodes")
    private java.util.List < Nodes> nodes;

    @NameInMap("page")
    private Page page;

    private DescribeClusterNodesResponseBody(Builder builder) {
        this.nodes = builder.nodes;
        this.page = builder.page;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterNodesResponseBody create() {
        return builder().build();
    }

    /**
     * @return nodes
     */
    public java.util.List < Nodes> getNodes() {
        return this.nodes;
    }

    /**
     * @return page
     */
    public Page getPage() {
        return this.page;
    }

    public static final class Builder {
        private java.util.List < Nodes> nodes; 
        private Page page; 

        /**
         * 节点信息列表。
         */
        public Builder nodes(java.util.List < Nodes> nodes) {
            this.nodes = nodes;
            return this;
        }

        /**
         * 分页信息。
         */
        public Builder page(Page page) {
            this.page = page;
            return this;
        }

        public DescribeClusterNodesResponseBody build() {
            return new DescribeClusterNodesResponseBody(this);
        } 

    } 

    public static class Nodes extends TeaModel {
        @NameInMap("creation_time")
        private String creationTime;

        @NameInMap("error_message")
        private String errorMessage;

        @NameInMap("expired_time")
        private String expiredTime;

        @NameInMap("host_name")
        private String hostName;

        @NameInMap("image_id")
        private String imageId;

        @NameInMap("instance_charge_type")
        private String instanceChargeType;

        @NameInMap("instance_id")
        private String instanceId;

        @NameInMap("instance_name")
        private String instanceName;

        @NameInMap("instance_role")
        private String instanceRole;

        @NameInMap("instance_status")
        private String instanceStatus;

        @NameInMap("instance_type")
        private String instanceType;

        @NameInMap("instance_type_family")
        private String instanceTypeFamily;

        @NameInMap("ip_address")
        private java.util.List < String > ipAddress;

        @NameInMap("is_aliyun_node")
        private Boolean isAliyunNode;

        @NameInMap("node_name")
        private String nodeName;

        @NameInMap("node_status")
        private String nodeStatus;

        @NameInMap("nodepool_id")
        private String nodepoolId;

        @NameInMap("source")
        private String source;

        @NameInMap("spot_strategy")
        private String spotStrategy;

        @NameInMap("state")
        private String state;

        private Nodes(Builder builder) {
            this.creationTime = builder.creationTime;
            this.errorMessage = builder.errorMessage;
            this.expiredTime = builder.expiredTime;
            this.hostName = builder.hostName;
            this.imageId = builder.imageId;
            this.instanceChargeType = builder.instanceChargeType;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.instanceRole = builder.instanceRole;
            this.instanceStatus = builder.instanceStatus;
            this.instanceType = builder.instanceType;
            this.instanceTypeFamily = builder.instanceTypeFamily;
            this.ipAddress = builder.ipAddress;
            this.isAliyunNode = builder.isAliyunNode;
            this.nodeName = builder.nodeName;
            this.nodeStatus = builder.nodeStatus;
            this.nodepoolId = builder.nodepoolId;
            this.source = builder.source;
            this.spotStrategy = builder.spotStrategy;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodes create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return instanceChargeType
         */
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return instanceRole
         */
        public String getInstanceRole() {
            return this.instanceRole;
        }

        /**
         * @return instanceStatus
         */
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return instanceTypeFamily
         */
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        /**
         * @return ipAddress
         */
        public java.util.List < String > getIpAddress() {
            return this.ipAddress;
        }

        /**
         * @return isAliyunNode
         */
        public Boolean getIsAliyunNode() {
            return this.isAliyunNode;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return nodeStatus
         */
        public String getNodeStatus() {
            return this.nodeStatus;
        }

        /**
         * @return nodepoolId
         */
        public String getNodepoolId() {
            return this.nodepoolId;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return spotStrategy
         */
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String creationTime; 
            private String errorMessage; 
            private String expiredTime; 
            private String hostName; 
            private String imageId; 
            private String instanceChargeType; 
            private String instanceId; 
            private String instanceName; 
            private String instanceRole; 
            private String instanceStatus; 
            private String instanceType; 
            private String instanceTypeFamily; 
            private java.util.List < String > ipAddress; 
            private Boolean isAliyunNode; 
            private String nodeName; 
            private String nodeStatus; 
            private String nodepoolId; 
            private String source; 
            private String spotStrategy; 
            private String state; 

            /**
             * 节点创建时间。
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * 错误信息说明。
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * 节点过期时间。
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * 节点主机名。
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * 节点使用的镜像ID。
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * 节点付费类型。
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * 节点实例ID。
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * 节点名称。
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * 节点实例角色类型，Master或Worker。
             */
            public Builder instanceRole(String instanceRole) {
                this.instanceRole = instanceRole;
                return this;
            }

            /**
             * 节点实例状态，
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * 节点实例类型。
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * 节点实例所属ECS实例簇名称。
             */
            public Builder instanceTypeFamily(String instanceTypeFamily) {
                this.instanceTypeFamily = instanceTypeFamily;
                return this;
            }

            /**
             * 节点IP地址。
             */
            public Builder ipAddress(java.util.List < String > ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * 节点是否为aliyun实例。
             */
            public Builder isAliyunNode(Boolean isAliyunNode) {
                this.isAliyunNode = isAliyunNode;
                return this;
            }

            /**
             * 节点名称，该名称是k8s专用名称。
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * 节点状态，是否Ready。
             */
            public Builder nodeStatus(String nodeStatus) {
                this.nodeStatus = nodeStatus;
                return this;
            }

            /**
             * 节点池ID。
             */
            public Builder nodepoolId(String nodepoolId) {
                this.nodepoolId = nodepoolId;
                return this;
            }

            /**
             * 节点通过什么方式创建出来的，例如：ROS。
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * 抢占时实例类型
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * ECS运行状态，例如：Running。
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
    public static class Page extends TeaModel {
        @NameInMap("page_number")
        private Integer pageNumber;

        @NameInMap("page_size")
        private Integer pageSize;

        @NameInMap("total_count")
        private Integer totalCount;

        private Page(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Page create() {
            return builder().build();
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
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * 总页数。
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * 单页展示结果数量。
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * 结果总条数。
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Page build() {
                return new Page(this);
            } 

        } 

    }
}
