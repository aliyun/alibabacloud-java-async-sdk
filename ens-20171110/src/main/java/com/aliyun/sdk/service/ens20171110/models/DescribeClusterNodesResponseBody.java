// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
    @com.aliyun.core.annotation.NameInMap("Nodes")
    private java.util.List<Nodes> nodes;

    @com.aliyun.core.annotation.NameInMap("Page")
    private Page page;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeClusterNodesResponseBody(Builder builder) {
        this.nodes = builder.nodes;
        this.page = builder.page;
        this.requestId = builder.requestId;
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

        private Builder(DescribeClusterNodesResponseBody model) {
            this.nodes = model.nodes;
            this.page = model.page;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The node information.</p>
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
         * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BA984</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
    public static class NodeInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContainerRuntimeVersion")
        private String containerRuntimeVersion;

        @com.aliyun.core.annotation.NameInMap("KubeletVersion")
        private String kubeletVersion;

        @com.aliyun.core.annotation.NameInMap("OsImage")
        private String osImage;

        private NodeInfo(Builder builder) {
            this.containerRuntimeVersion = builder.containerRuntimeVersion;
            this.kubeletVersion = builder.kubeletVersion;
            this.osImage = builder.osImage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeInfo create() {
            return builder().build();
        }

        /**
         * @return containerRuntimeVersion
         */
        public String getContainerRuntimeVersion() {
            return this.containerRuntimeVersion;
        }

        /**
         * @return kubeletVersion
         */
        public String getKubeletVersion() {
            return this.kubeletVersion;
        }

        /**
         * @return osImage
         */
        public String getOsImage() {
            return this.osImage;
        }

        public static final class Builder {
            private String containerRuntimeVersion; 
            private String kubeletVersion; 
            private String osImage; 

            private Builder() {
            } 

            private Builder(NodeInfo model) {
                this.containerRuntimeVersion = model.containerRuntimeVersion;
                this.kubeletVersion = model.kubeletVersion;
                this.osImage = model.osImage;
            } 

            /**
             * <p>The container runtime version.</p>
             * 
             * <strong>example:</strong>
             * <p>containerd://1.6.28</p>
             */
            public Builder containerRuntimeVersion(String containerRuntimeVersion) {
                this.containerRuntimeVersion = containerRuntimeVersion;
                return this;
            }

            /**
             * <p>The kubelet version of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>v1.30.7-aliyun.1</p>
             */
            public Builder kubeletVersion(String kubeletVersion) {
                this.kubeletVersion = kubeletVersion;
                return this;
            }

            /**
             * <p>The operating system image of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>CentOS Linux 7 (Core)</p>
             */
            public Builder osImage(String osImage) {
                this.osImage = osImage;
                return this;
            }

            public NodeInfo build() {
                return new NodeInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeClusterNodesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterNodesResponseBody</p>
     */
    public static class Nodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        private String ensRegionId;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("IpAddress")
        private java.util.List<String> ipAddress;

        @com.aliyun.core.annotation.NameInMap("NodeInfo")
        private NodeInfo nodeInfo;

        @com.aliyun.core.annotation.NameInMap("NodepoolId")
        private String nodepoolId;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        private Nodes(Builder builder) {
            this.clusterId = builder.clusterId;
            this.ensRegionId = builder.ensRegionId;
            this.imageId = builder.imageId;
            this.instanceId = builder.instanceId;
            this.ipAddress = builder.ipAddress;
            this.nodeInfo = builder.nodeInfo;
            this.nodepoolId = builder.nodepoolId;
            this.payType = builder.payType;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodes create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return ensRegionId
         */
        public String getEnsRegionId() {
            return this.ensRegionId;
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
         * @return ipAddress
         */
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

        /**
         * @return nodeInfo
         */
        public NodeInfo getNodeInfo() {
            return this.nodeInfo;
        }

        /**
         * @return nodepoolId
         */
        public String getNodepoolId() {
            return this.nodepoolId;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String clusterId; 
            private String ensRegionId; 
            private String imageId; 
            private String instanceId; 
            private java.util.List<String> ipAddress; 
            private NodeInfo nodeInfo; 
            private String nodepoolId; 
            private String payType; 
            private String state; 

            private Builder() {
            } 

            private Builder(Nodes model) {
                this.clusterId = model.clusterId;
                this.ensRegionId = model.ensRegionId;
                this.imageId = model.imageId;
                this.instanceId = model.instanceId;
                this.ipAddress = model.ipAddress;
                this.nodeInfo = model.nodeInfo;
                this.nodepoolId = model.nodepoolId;
                this.payType = model.payType;
                this.state = model.state;
            } 

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>eck-xxxxxxxx</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The ENS edge zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-fuzhou-23</p>
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * <p>The instance image ID.</p>
             * 
             * <strong>example:</strong>
             * <p>m-680cki2ruj1q2bm0mz1k9tnbz</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i-51mctytg7tv4yw4amu3oczxsx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The IP address of the ENS instance.</p>
             */
            public Builder ipAddress(java.util.List<String> ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * <p>The node information.</p>
             */
            public Builder nodeInfo(NodeInfo nodeInfo) {
                this.nodeInfo = nodeInfo;
                return this;
            }

            /**
             * <p>The node pool ID.</p>
             * 
             * <strong>example:</strong>
             * <p>np861febb748f84f5f9f1c76819eff7f56</p>
             */
            public Builder nodepoolId(String nodepoolId) {
                this.nodepoolId = nodepoolId;
                return this;
            }

            /**
             * <p>The billing method. Valid values:</p>
             * <ul>
             * <li>PostPaid: pay-as-you-go.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PrePaid</p>
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * <p>The status of the node pool. Valid values:</p>
             * <ul>
             * <li>initial: The node pool is being created.</li>
             * <li>running: The node pool is created.</li>
             * <li>removing: The node pool is being removed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>initial</p>
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
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
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
