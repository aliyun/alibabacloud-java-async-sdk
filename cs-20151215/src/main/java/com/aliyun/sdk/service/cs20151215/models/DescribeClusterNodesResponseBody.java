// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link DescribeClusterNodesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterNodesResponseBody</p>
 */
public class DescribeClusterNodesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("nodes")
    private java.util.List<Nodes> nodes;

    @com.aliyun.core.annotation.NameInMap("page")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nodes
     */
    public java.util.List<Nodes> getNodes() {
        return this.nodes;
    }

    /**
     * @return page
     */
    public Page getPage() {
        return this.page;
    }

    public static final class Builder {
        private java.util.List<Nodes> nodes; 
        private Page page; 

        private Builder() {
        } 

        private Builder(DescribeClusterNodesResponseBody model) {
            this.nodes = model.nodes;
            this.page = model.page;
        } 

        /**
         * <p>The list of node details.</p>
         */
        public Builder nodes(java.util.List<Nodes> nodes) {
            this.nodes = nodes;
            return this;
        }

        /**
         * <p>The pagination information.</p>
         */
        public Builder page(Page page) {
            this.page = page;
            return this;
        }

        public DescribeClusterNodesResponseBody build() {
            return new DescribeClusterNodesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeClusterNodesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterNodesResponseBody</p>
     */
    public static class Nodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("creation_time")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("error_message")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("expired_time")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("host_name")
        private String hostName;

        @com.aliyun.core.annotation.NameInMap("image_id")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("instance_charge_type")
        private String instanceChargeType;

        @com.aliyun.core.annotation.NameInMap("instance_id")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("instance_name")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("instance_role")
        private String instanceRole;

        @com.aliyun.core.annotation.NameInMap("instance_status")
        private String instanceStatus;

        @com.aliyun.core.annotation.NameInMap("instance_type")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("instance_type_family")
        private String instanceTypeFamily;

        @com.aliyun.core.annotation.NameInMap("ip_address")
        private java.util.List<String> ipAddress;

        @com.aliyun.core.annotation.NameInMap("is_aliyun_node")
        private Boolean isAliyunNode;

        @com.aliyun.core.annotation.NameInMap("node_name")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("node_status")
        private String nodeStatus;

        @com.aliyun.core.annotation.NameInMap("nodepool_id")
        private String nodepoolId;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("spot_strategy")
        private String spotStrategy;

        @com.aliyun.core.annotation.NameInMap("state")
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
        public java.util.List<String> getIpAddress() {
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
            private java.util.List<String> ipAddress; 
            private Boolean isAliyunNode; 
            private String nodeName; 
            private String nodeStatus; 
            private String nodepoolId; 
            private String source; 
            private String spotStrategy; 
            private String state; 

            private Builder() {
            } 

            private Builder(Nodes model) {
                this.creationTime = model.creationTime;
                this.errorMessage = model.errorMessage;
                this.expiredTime = model.expiredTime;
                this.hostName = model.hostName;
                this.imageId = model.imageId;
                this.instanceChargeType = model.instanceChargeType;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.instanceRole = model.instanceRole;
                this.instanceStatus = model.instanceStatus;
                this.instanceType = model.instanceType;
                this.instanceTypeFamily = model.instanceTypeFamily;
                this.ipAddress = model.ipAddress;
                this.isAliyunNode = model.isAliyunNode;
                this.nodeName = model.nodeName;
                this.nodeStatus = model.nodeStatus;
                this.nodepoolId = model.nodepoolId;
                this.source = model.source;
                this.spotStrategy = model.spotStrategy;
                this.state = model.state;
            } 

            /**
             * <p>The time when the node was created. The time follows the ISO 8601 standard and includes the time zone.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-04-16T07:28:00Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The error message returned when the node was created.</p>
             * 
             * <strong>example:</strong>
             * <p>error***</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The time when the node expires. The time follows the ISO 8601 standard and includes the time zone.</p>
             * 
             * <strong>example:</strong>
             * <p>2099-12-31T15:59:00Z</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The hostname of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>iZ2vcckdmxp7u0urj2k****</p>
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * <p>The ID of the system image used by the node.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun_3_x64_20G_alibase_20241218.vhd</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The billing method of the node. Valid values:</p>
             * <ul>
             * <li><code>PrePaid</code>: subscription.</li>
             * <li><code>PostPaid</code>: pay-as-you-go.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PostPaid</p>
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * <p>The instance ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>i-2vcckdmxp7u0urj2****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the node in the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>worker-k8s-for-cs-c5cdf7e3938bc4f8eb0e44b21a80f****</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The role of the node. Valid values:</p>
             * <ul>
             * <li>Master: the master node of the cluster.</li>
             * <li>Worker: the worker node of the cluster.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Worker</p>
             */
            public Builder instanceRole(String instanceRole) {
                this.instanceRole = instanceRole;
                return this;
            }

            /**
             * <p>The ECS instance status of the node. Valid values:</p>
             * <ul>
             * <li><code>Pending</code>: the instance is being created.</li>
             * <li><code>Running</code>: the instance is running.</li>
             * <li><code>Starting</code>: the instance is starting.</li>
             * <li><code>Stopping</code>: the instance is stopping.</li>
             * <li><code>Stopped</code>: the instance is stopped.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * <p>The node specifications.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.c5.xlarge</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The name of the ECS instance family to which the node belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.c5</p>
             */
            public Builder instanceTypeFamily(String instanceTypeFamily) {
                this.instanceTypeFamily = instanceTypeFamily;
                return this;
            }

            /**
             * <p>The IP addresses of the node.</p>
             */
            public Builder ipAddress(java.util.List<String> ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * <p>Specifies whether the node is an Alibaba Cloud instance. Valid values:</p>
             * <ul>
             * <li><code>true</code>: the node is an Alibaba Cloud instance.</li>
             * <li><code>false</code>: the node is not an Alibaba Cloud instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isAliyunNode(Boolean isAliyunNode) {
                this.isAliyunNode = isAliyunNode;
                return this;
            }

            /**
             * <p>The name of the node, which is the node identifier in the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-chengdu.192.168xx.xx</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>Specifies whether the node is ready. Valid values:</p>
             * <ul>
             * <li><code>Ready</code>: the node is ready.</li>
             * <li><code>NotReady</code>: the node is not ready.</li>
             * <li><code>Unknown</code>: the status is unknown.</li>
             * <li><code>Offline</code>: the node is offline.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Ready</p>
             */
            public Builder nodeStatus(String nodeStatus) {
                this.nodeStatus = nodeStatus;
                return this;
            }

            /**
             * <p>The node pool ID.</p>
             * 
             * <strong>example:</strong>
             * <p>np0794239424a84eb7a95327369d56****</p>
             */
            public Builder nodepoolId(String nodepoolId) {
                this.nodepoolId = nodepoolId;
                return this;
            }

            /**
             * <p>The method used to initialize the node, such as manual creation or creation by Resource Orchestration Service (ROS).</p>
             * 
             * <strong>example:</strong>
             * <p>ess</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The type of the spot instance. Valid values:</p>
             * <ul>
             * <li>NoSpot: the instance is not a spot instance.</li>
             * <li>SpotWithPriceLimit: the instance is a spot instance with a maximum price limit.</li>
             * <li>SpotAsPriceGo: the instance is a spot instance whose price is automatically set based on the current market price.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NoSpot</p>
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * <p>The running state of the node. Valid values:</p>
             * <ul>
             * <li><code>pending</code>: the node is being created.</li>
             * <li><code>running</code>: the node is running.</li>
             * <li><code>starting</code>: the node is starting.</li>
             * <li><code>stopping</code>: the node is stopping.</li>
             * <li><code>stopped</code>: the node is stopped.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>running</p>
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
    /**
     * 
     * {@link DescribeClusterNodesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterNodesResponseBody</p>
     */
    public static class Page extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("page_number")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("page_size")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("total_count")
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

            private Builder() {
            } 

            private Builder(Page model) {
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The maximum number of records to return per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of results.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
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
