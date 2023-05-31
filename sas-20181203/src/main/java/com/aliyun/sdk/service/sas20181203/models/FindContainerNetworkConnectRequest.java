// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FindContainerNetworkConnectRequest} extends {@link RequestModel}
 *
 * <p>FindContainerNetworkConnectRequest</p>
 */
public class FindContainerNetworkConnectRequest extends Request {
    @Query
    @NameInMap("CriteriaType")
    private String criteriaType;

    @Query
    @NameInMap("CurrentPage")
    private Long currentPage;

    @Query
    @NameInMap("DstNode")
    private DstNode dstNode;

    @Query
    @NameInMap("EndTime")
    private Long endTime;

    @Query
    @NameInMap("PageSize")
    private Long pageSize;

    @Query
    @NameInMap("SrcNode")
    private SrcNode srcNode;

    @Query
    @NameInMap("StartTime")
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
         * The type of the information that you want to query. Valid values:
         * <p>
         * 
         * *   **EDGE**: connection information
         */
        public Builder criteriaType(String criteriaType) {
            this.putQueryParameter("CriteriaType", criteriaType);
            this.criteriaType = criteriaType;
            return this;
        }

        /**
         * The number of the page to return. Default value: **1**.
         */
        public Builder currentPage(Long currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The information about the destination node.
         */
        public Builder dstNode(DstNode dstNode) {
            String dstNodeShrink = shrink(dstNode, "DstNode", "json");
            this.putQueryParameter("DstNode", dstNodeShrink);
            this.dstNode = dstNode;
            return this;
        }

        /**
         * The end time of the network connection.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.
         * <p>
         * 
         * > We recommend that you do not leave this parameter empty.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The information about the source node.
         */
        public Builder srcNode(SrcNode srcNode) {
            String srcNodeShrink = shrink(srcNode, "SrcNode", "json");
            this.putQueryParameter("SrcNode", srcNodeShrink);
            this.srcNode = srcNode;
            return this;
        }

        /**
         * The start time of the network connection.
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

    public static class DstNode extends TeaModel {
        @NameInMap("AppName")
        private String appName;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("NodeIds")
        private java.util.List < String > nodeIds;

        @NameInMap("NodeType")
        private String nodeType;

        @NameInMap("PodName")
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
        public java.util.List < String > getNodeIds() {
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
            private java.util.List < String > nodeIds; 
            private String nodeType; 
            private String podName; 

            /**
             * The name of the container application.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * The ID of the container cluster.
             * <p>
             * 
             * > You can call the [DescribeGroupedContainerInstances](~~DescribeGroupedContainerInstances~~) operation to query the IDs of container clusters.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The namespace of the cluster.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * The node IDs.
             */
            public Builder nodeIds(java.util.List < String > nodeIds) {
                this.nodeIds = nodeIds;
                return this;
            }

            /**
             * The type of the node. Valid values:
             * <p>
             * 
             * *   **app**: application, which indicates that the node type is application.
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * The name of the pod.
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
    public static class SrcNode extends TeaModel {
        @NameInMap("AppName")
        private String appName;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("NodeIds")
        private java.util.List < String > nodeIds;

        @NameInMap("NodeType")
        private String nodeType;

        @NameInMap("PodName")
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
        public java.util.List < String > getNodeIds() {
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
            private java.util.List < String > nodeIds; 
            private String nodeType; 
            private String podName; 

            /**
             * The name of the container application.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * The ID of the container cluster.
             * <p>
             * 
             * > You can call the [DescribeGroupedContainerInstances](~~DescribeGroupedContainerInstances~~) operation to query the IDs of container clusters.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The namespace of the cluster.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * The node IDs.
             */
            public Builder nodeIds(java.util.List < String > nodeIds) {
                this.nodeIds = nodeIds;
                return this;
            }

            /**
             * The type of the node. Valid values:
             * <p>
             * 
             * *   **app**: application, which indicates that the node type is application.
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * The name of the pod.
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
