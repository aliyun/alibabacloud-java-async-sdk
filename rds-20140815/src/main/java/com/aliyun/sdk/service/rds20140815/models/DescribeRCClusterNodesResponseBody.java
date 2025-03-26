// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeRCClusterNodesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRCClusterNodesResponseBody</p>
 */
public class DescribeRCClusterNodesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Nodes")
    private java.util.List<Nodes> nodes;

    @com.aliyun.core.annotation.NameInMap("Page")
    private Page page;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeRCClusterNodesResponseBody(Builder builder) {
        this.nodes = builder.nodes;
        this.page = builder.page;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRCClusterNodesResponseBody create() {
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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Nodes> nodes; 
        private Page page; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeRCClusterNodesResponseBody model) {
            this.nodes = model.nodes;
            this.page = model.page;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the nodes.</p>
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

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16C62438-491B-5C02-9B49-BA924A1372A2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRCClusterNodesResponseBody build() {
            return new DescribeRCClusterNodesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRCClusterNodesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCClusterNodesResponseBody</p>
     */
    public static class Nodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DockerVersion")
        private String dockerVersion;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceRole")
        private String instanceRole;

        @com.aliyun.core.annotation.NameInMap("IpAddresses")
        private java.util.List<String> ipAddresses;

        @com.aliyun.core.annotation.NameInMap("IsAliyunNode")
        private Boolean isAliyunNode;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("NodePoolId")
        private String nodePoolId;

        @com.aliyun.core.annotation.NameInMap("NodeStatus")
        private String nodeStatus;

        @com.aliyun.core.annotation.NameInMap("RuntimeVersion")
        private String runtimeVersion;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        private Nodes(Builder builder) {
            this.creationTime = builder.creationTime;
            this.dockerVersion = builder.dockerVersion;
            this.imageId = builder.imageId;
            this.instanceId = builder.instanceId;
            this.instanceRole = builder.instanceRole;
            this.ipAddresses = builder.ipAddresses;
            this.isAliyunNode = builder.isAliyunNode;
            this.nodeName = builder.nodeName;
            this.nodePoolId = builder.nodePoolId;
            this.nodeStatus = builder.nodeStatus;
            this.runtimeVersion = builder.runtimeVersion;
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
         * @return dockerVersion
         */
        public String getDockerVersion() {
            return this.dockerVersion;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceRole
         */
        public String getInstanceRole() {
            return this.instanceRole;
        }

        /**
         * @return ipAddresses
         */
        public java.util.List<String> getIpAddresses() {
            return this.ipAddresses;
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
         * @return nodePoolId
         */
        public String getNodePoolId() {
            return this.nodePoolId;
        }

        /**
         * @return nodeStatus
         */
        public String getNodeStatus() {
            return this.nodeStatus;
        }

        /**
         * @return runtimeVersion
         */
        public String getRuntimeVersion() {
            return this.runtimeVersion;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String creationTime; 
            private String dockerVersion; 
            private String imageId; 
            private String instanceId; 
            private String instanceRole; 
            private java.util.List<String> ipAddresses; 
            private Boolean isAliyunNode; 
            private String nodeName; 
            private String nodePoolId; 
            private String nodeStatus; 
            private String runtimeVersion; 
            private String state; 

            private Builder() {
            } 

            private Builder(Nodes model) {
                this.creationTime = model.creationTime;
                this.dockerVersion = model.dockerVersion;
                this.imageId = model.imageId;
                this.instanceId = model.instanceId;
                this.instanceRole = model.instanceRole;
                this.ipAddresses = model.ipAddresses;
                this.isAliyunNode = model.isAliyunNode;
                this.nodeName = model.nodeName;
                this.nodePoolId = model.nodePoolId;
                this.nodeStatus = model.nodeStatus;
                this.runtimeVersion = model.runtimeVersion;
                this.state = model.state;
            } 

            /**
             * <p>The time when the node was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-21T07:20:09Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The container version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder dockerVersion(String dockerVersion) {
                this.dockerVersion = dockerVersion;
                return this;
            }

            /**
             * <p>The image ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>m-2oqiu973jwcxe****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rc-u79597n5f54s5bnz****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The node role. Valid values:</p>
             * <ul>
             * <li><strong>Master</strong>: master node</li>
             * <li><strong>Worker</strong>: worker node</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Master</p>
             */
            public Builder instanceRole(String instanceRole) {
                this.instanceRole = instanceRole;
                return this;
            }

            /**
             * <p>The IP address.</p>
             */
            public Builder ipAddresses(java.util.List<String> ipAddresses) {
                this.ipAddresses = ipAddresses;
                return this;
            }

            /**
             * <p>Indicates whether the node is provided by Alibaba Cloud. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
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
             * <p>The node name, which is the identifier of the RDS Custom node in the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou.192.168.XXX.XXX</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>The node pool ID.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder nodePoolId(String nodePoolId) {
                this.nodePoolId = nodePoolId;
                return this;
            }

            /**
             * <p>Indicates whether the node is ready. Valid values:</p>
             * <ul>
             * <li><strong>Ready</strong>: The node is ready.</li>
             * <li><strong>NotReady</strong>: The node is not ready.</li>
             * <li><strong>Unknown</strong>: The status of the node is unknown.</li>
             * <li><strong>Offline</strong>: The node is offline.</li>
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
             * <p>The runtime of the ACK cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-21T07:20:09Z</p>
             */
            public Builder runtimeVersion(String runtimeVersion) {
                this.runtimeVersion = runtimeVersion;
                return this;
            }

            /**
             * <p>The node status. Valid values:</p>
             * <ul>
             * <li><strong>pending</strong></li>
             * <li><strong>running</strong></li>
             * <li><strong>starting</strong></li>
             * <li><strong>stopping</strong></li>
             * <li><strong>stopped</strong></li>
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
     * {@link DescribeRCClusterNodesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCClusterNodesResponseBody</p>
     */
    public static class Page extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

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
        public Long getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long pageNumber; 
            private Long pageSize; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Page model) {
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The maximum number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Page build() {
                return new Page(this);
            } 

        } 

    }
}
