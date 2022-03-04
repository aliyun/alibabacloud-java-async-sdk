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
         * The details of the node.
         */
        public Builder nodes(java.util.List < Nodes> nodes) {
            this.nodes = nodes;
            return this;
        }

        /**
         * The page information.
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

        @NameInMap("state")
        private String state;

        @NameInMap("spot_strategy")
        private String spotStrategy;

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
            this.state = builder.state;
            this.spotStrategy = builder.spotStrategy;
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
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return spotStrategy
         */
        public String getSpotStrategy() {
            return this.spotStrategy;
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
            private String state; 
            private String spotStrategy; 

            /**
             * The time when the node was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The error message when the node is created.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The expiration time of the node.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * The hostname of the node.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * The ID of the system image used by the node.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * The billing method of the node. Valid values:
             * <p>
             * 
             * -"PrePaid": subscription. When you select this type of payment method, you must ensure that your account supports balance payment or credit payment. Otherwise, the error message "InvalidPayMethod" is returned.
             * 
             * -"PostPaid": pay-as-you-go.
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * The ID of the node instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the node in the cluster.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * Node role type:
             * <p>
             * 
             * -Master: The Master node of the cluster.
             * -Worker: the cluster Worker node.
             */
            public Builder instanceRole(String instanceRole) {
                this.instanceRole = instanceRole;
                return this;
            }

            /**
             * The running status of the node.
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * The node type.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The name of the ECS family to which the node belongs.
             */
            public Builder instanceTypeFamily(String instanceTypeFamily) {
                this.instanceTypeFamily = instanceTypeFamily;
                return this;
            }

            /**
             * The ip address of the node.
             */
            public Builder ipAddress(java.util.List < String > ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * Indicates whether the instance is an Alibaba Cloud instance. Valid values:
             * <p>
             * 
             * -"true": indicates an Alibaba Cloud instance.
             * 
             * -"false": Not an Alibaba Cloud instance.
             */
            public Builder isAliyunNode(Boolean isAliyunNode) {
                this.isAliyunNode = isAliyunNode;
                return this;
            }

            /**
             * The node name of the cluster.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * Indicates whether the node is ready. Valid values:
             * <p>
             * 
             * -"true": the node is ready.
             * 
             * -"false": the node is not ready.
             */
            public Builder nodeStatus(String nodeStatus) {
                this.nodeStatus = nodeStatus;
                return this;
            }

            /**
             * The ID of the node pool.
             */
            public Builder nodepoolId(String nodepoolId) {
                this.nodepoolId = nodepoolId;
                return this;
            }

            /**
             * How to initialize a node, for example, manually create a node or create a node by using ROS.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * The running status of the node. Valid values:
             * <p>
             * 
             * -"pending": creating.
             * 
             * -"running": running.
             * 
             * -"starting": starting.
             * 
             * -"stopping": stopping.
             * 
             * -"stopped": stopped.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The type of the preemptible instance. Valid values:
             * <p>
             * -NoSpot: a non-preemptible instance.
             * -SpotWithPriceLimit: sets the maximum price for preemptible instances.
             * -SpotAsPriceGo: the system automatically bids based on the actual market price.
             * 
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
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
             * The page number.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of records displayed on each page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of results.
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
