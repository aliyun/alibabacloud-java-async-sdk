// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link ListFileTypeResponseBody} extends {@link TeaModel}
 *
 * <p>ListFileTypeResponseBody</p>
 */
public class ListFileTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NodeTypeInfoList")
    private NodeTypeInfoList nodeTypeInfoList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListFileTypeResponseBody(Builder builder) {
        this.nodeTypeInfoList = builder.nodeTypeInfoList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFileTypeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nodeTypeInfoList
     */
    public NodeTypeInfoList getNodeTypeInfoList() {
        return this.nodeTypeInfoList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private NodeTypeInfoList nodeTypeInfoList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListFileTypeResponseBody model) {
            this.nodeTypeInfoList = model.nodeTypeInfoList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about node types.</p>
         */
        public Builder nodeTypeInfoList(NodeTypeInfoList nodeTypeInfoList) {
            this.nodeTypeInfoList = nodeTypeInfoList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0000-ABCD-EFG****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListFileTypeResponseBody build() {
            return new ListFileTypeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListFileTypeResponseBody} extends {@link TeaModel}
     *
     * <p>ListFileTypeResponseBody</p>
     */
    public static class NodeTypeInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeType")
        private Integer nodeType;

        @com.aliyun.core.annotation.NameInMap("NodeTypeName")
        private String nodeTypeName;

        private NodeTypeInfo(Builder builder) {
            this.nodeType = builder.nodeType;
            this.nodeTypeName = builder.nodeTypeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeTypeInfo create() {
            return builder().build();
        }

        /**
         * @return nodeType
         */
        public Integer getNodeType() {
            return this.nodeType;
        }

        /**
         * @return nodeTypeName
         */
        public String getNodeTypeName() {
            return this.nodeTypeName;
        }

        public static final class Builder {
            private Integer nodeType; 
            private String nodeTypeName; 

            private Builder() {
            } 

            private Builder(NodeTypeInfo model) {
                this.nodeType = model.nodeType;
                this.nodeTypeName = model.nodeTypeName;
            } 

            /**
             * <p>The code of the node type. The codes and names of node types have the following mappings: 6 (Shell), 10 (ODPS SQL), 11 (ODPS MR), 23 (Data Integration), 24 (ODPS Script), 99 (zero load), 221 (PyODPS 2), 225 (ODPS Spark), 227 (EMR Hive), 228 (EMR Spark), 229 (EMR Spark SQL), 230 (EMR MR), 239 (OSS object inspection), 257 (EMR Shell), 258 (EMR Spark Shell), 259 (EMR Presto), 260 (EMR Impala), 900 (real-time synchronization), 1089 (cross-tenant collaboration), 1091 (Hologres development), 1093 (Hologres SQL), 1100 (assignment), and 1221 (PyODPS 3)</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder nodeType(Integer nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * <p>The name of the node type. The codes and names of node types have the following mappings: 6 (Shell), 10 (ODPS SQL), 11 (ODPS MR), 23 (Data Integration), 24 (ODPS Script), 99 (zero load), 221 (PyODPS 2), 225 (ODPS Spark), 227 (EMR Hive), 228 (EMR Spark), 229 (EMR Spark SQL), 230 (EMR MR), 239 (OSS object inspection), 257 (EMR Shell), 258 (EMR Spark Shell), 259 (EMR Presto), 260 (EMR Impala), 900 (real-time synchronization), 1089 (cross-tenant collaboration), 1091 (Hologres development), 1093 (Hologres SQL), 1100 (assignment), and 1221 (PyODPS 3)</p>
             * 
             * <strong>example:</strong>
             * <p>ODPS SQL</p>
             */
            public Builder nodeTypeName(String nodeTypeName) {
                this.nodeTypeName = nodeTypeName;
                return this;
            }

            public NodeTypeInfo build() {
                return new NodeTypeInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListFileTypeResponseBody} extends {@link TeaModel}
     *
     * <p>ListFileTypeResponseBody</p>
     */
    public static class NodeTypeInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeTypeInfo")
        private java.util.List<NodeTypeInfo> nodeTypeInfo;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private NodeTypeInfoList(Builder builder) {
            this.nodeTypeInfo = builder.nodeTypeInfo;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeTypeInfoList create() {
            return builder().build();
        }

        /**
         * @return nodeTypeInfo
         */
        public java.util.List<NodeTypeInfo> getNodeTypeInfo() {
            return this.nodeTypeInfo;
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
            private java.util.List<NodeTypeInfo> nodeTypeInfo; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(NodeTypeInfoList model) {
                this.nodeTypeInfo = model.nodeTypeInfo;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The information about the node type.</p>
             */
            public Builder nodeTypeInfo(java.util.List<NodeTypeInfo> nodeTypeInfo) {
                this.nodeTypeInfo = nodeTypeInfo;
                return this;
            }

            /**
             * <p>The page number.</p>
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
             * <p>50</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>127</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public NodeTypeInfoList build() {
                return new NodeTypeInfoList(this);
            } 

        } 

    }
}
