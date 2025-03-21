// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link FindContainerNetworkConnectRequest} extends {@link RequestModel}
 *
 * <p>FindContainerNetworkConnectRequest</p>
 */
public class FindContainerNetworkConnectRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CriteriaType")
    private String criteriaType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Long currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstNode")
    private DstNode dstNode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcNode")
    private SrcNode srcNode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    private FindContainerNetworkConnectRequest(Builder builder) {
        super(builder);
        this.criteriaType = builder.criteriaType;
        this.currentPage = builder.currentPage;
        this.dstNode = builder.dstNode;
        this.endTime = builder.endTime;
        this.pageSize = builder.pageSize;
        this.srcNode = builder.srcNode;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindContainerNetworkConnectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return criteriaType
     */
    public String getCriteriaType() {
        return this.criteriaType;
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return dstNode
     */
    public DstNode getDstNode() {
        return this.dstNode;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return srcNode
     */
    public SrcNode getSrcNode() {
        return this.srcNode;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<FindContainerNetworkConnectRequest, Builder> {
        private String criteriaType; 
        private Long currentPage; 
        private DstNode dstNode; 
        private Long endTime; 
        private Long pageSize; 
        private SrcNode srcNode; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(FindContainerNetworkConnectRequest request) {
            super(request);
            this.criteriaType = request.criteriaType;
            this.currentPage = request.currentPage;
            this.dstNode = request.dstNode;
            this.endTime = request.endTime;
            this.pageSize = request.pageSize;
            this.srcNode = request.srcNode;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The type of the information that you want to query. Valid values:</p>
         * <ul>
         * <li><strong>EDGE</strong>: connection information</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EDGE</p>
         */
        public Builder criteriaType(String criteriaType) {
            this.putQueryParameter("CriteriaType", criteriaType);
            this.criteriaType = criteriaType;
            return this;
        }

        /**
         * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Long currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The information about the destination node.</p>
         */
        public Builder dstNode(DstNode dstNode) {
            String dstNodeShrink = shrink(dstNode, "DstNode", "json");
            this.putQueryParameter("DstNode", dstNodeShrink);
            this.dstNode = dstNode;
            return this;
        }

        /**
         * <p>The end time of the network connection.</p>
         * 
         * <strong>example:</strong>
         * <p>1649260799999</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
         * <blockquote>
         * <p>We recommend that you do not leave this parameter empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The information about the source node.</p>
         */
        public Builder srcNode(SrcNode srcNode) {
            String srcNodeShrink = shrink(srcNode, "SrcNode", "json");
            this.putQueryParameter("SrcNode", srcNodeShrink);
            this.srcNode = srcNode;
            return this;
        }

        /**
         * <p>The start time of the network connection.</p>
         * 
         * <strong>example:</strong>
         * <p>1666886400000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public FindContainerNetworkConnectRequest build() {
            return new FindContainerNetworkConnectRequest(this);
        } 

    } 

    /**
     * 
     * {@link FindContainerNetworkConnectRequest} extends {@link TeaModel}
     *
     * <p>FindContainerNetworkConnectRequest</p>
     */
    public static class DstNode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("NodeIds")
        private java.util.List<String> nodeIds;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("PodName")
        private String podName;

        private DstNode(Builder builder) {
            this.appName = builder.appName;
            this.clusterId = builder.clusterId;
            this.namespace = builder.namespace;
            this.nodeIds = builder.nodeIds;
            this.nodeType = builder.nodeType;
            this.podName = builder.podName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DstNode create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return nodeIds
         */
        public java.util.List<String> getNodeIds() {
            return this.nodeIds;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return podName
         */
        public String getPodName() {
            return this.podName;
        }

        public static final class Builder {
            private String appName; 
            private String clusterId; 
            private String namespace; 
            private java.util.List<String> nodeIds; 
            private String nodeType; 
            private String podName; 

            /**
             * <p>The name of the container application.</p>
             * 
             * <strong>example:</strong>
             * <p>nginx-ingress-controller</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The ID of the container cluster.</p>
             * <blockquote>
             * <p>You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to query the IDs of container clusters.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>f5x833820xx</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The namespace of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The node IDs.</p>
             */
            public Builder nodeIds(java.util.List<String> nodeIds) {
                this.nodeIds = nodeIds;
                return this;
            }

            /**
             * <p>The type of the node. Valid values:</p>
             * <ul>
             * <li><strong>app</strong>: application, which indicates that the node type is application.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>app</p>
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * <p>The name of the pod.</p>
             * 
             * <strong>example:</strong>
             * <p>abc-deployment-yacs-31144-39265-1384966-7f8c8cd578-h6mhb</p>
             */
            public Builder podName(String podName) {
                this.podName = podName;
                return this;
            }

            public DstNode build() {
                return new DstNode(this);
            } 

        } 

    }
    /**
     * 
     * {@link FindContainerNetworkConnectRequest} extends {@link TeaModel}
     *
     * <p>FindContainerNetworkConnectRequest</p>
     */
    public static class SrcNode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("NodeIds")
        private java.util.List<String> nodeIds;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("PodName")
        private String podName;

        private SrcNode(Builder builder) {
            this.appName = builder.appName;
            this.clusterId = builder.clusterId;
            this.namespace = builder.namespace;
            this.nodeIds = builder.nodeIds;
            this.nodeType = builder.nodeType;
            this.podName = builder.podName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SrcNode create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return nodeIds
         */
        public java.util.List<String> getNodeIds() {
            return this.nodeIds;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return podName
         */
        public String getPodName() {
            return this.podName;
        }

        public static final class Builder {
            private String appName; 
            private String clusterId; 
            private String namespace; 
            private java.util.List<String> nodeIds; 
            private String nodeType; 
            private String podName; 

            /**
             * <p>The name of the container application.</p>
             * 
             * <strong>example:</strong>
             * <p>arms-prometheus-ack-arms-prometheus</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The ID of the container cluster.</p>
             * <blockquote>
             * <p>You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to query the IDs of container clusters.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>c56xxx1775dea0</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The namespace of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The node IDs.</p>
             */
            public Builder nodeIds(java.util.List<String> nodeIds) {
                this.nodeIds = nodeIds;
                return this;
            }

            /**
             * <p>The type of the node. Valid values:</p>
             * <ul>
             * <li><strong>app</strong>: application, which indicates that the node type is application.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>app</p>
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * <p>The name of the pod.</p>
             * 
             * <strong>example:</strong>
             * <p>abc-deployment-yacs-31144-39265-1384966-7f8c8cd578-h6mhb</p>
             */
            public Builder podName(String podName) {
                this.podName = podName;
                return this;
            }

            public SrcNode build() {
                return new SrcNode(this);
            } 

        } 

    }
}
