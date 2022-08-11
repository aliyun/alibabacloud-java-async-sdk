// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFileTypeResponseBody} extends {@link TeaModel}
 *
 * <p>ListFileTypeResponseBody</p>
 */
public class ListFileTypeResponseBody extends TeaModel {
    @NameInMap("NodeTypeInfoList")
    private NodeTypeInfoList nodeTypeInfoList;

    @NameInMap("RequestId")
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

        /**
         * NodeTypeInfoList.
         */
        public Builder nodeTypeInfoList(NodeTypeInfoList nodeTypeInfoList) {
            this.nodeTypeInfoList = nodeTypeInfoList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListFileTypeResponseBody build() {
            return new ListFileTypeResponseBody(this);
        } 

    } 

    public static class NodeTypeInfo extends TeaModel {
        @NameInMap("NodeType")
        private Integer nodeType;

        @NameInMap("NodeTypeName")
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

            /**
             * NodeType.
             */
            public Builder nodeType(Integer nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * NodeTypeName.
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
    public static class NodeTypeInfoList extends TeaModel {
        @NameInMap("NodeTypeInfo")
        private java.util.List < NodeTypeInfo> nodeTypeInfo;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
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
        public java.util.List < NodeTypeInfo> getNodeTypeInfo() {
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
            private java.util.List < NodeTypeInfo> nodeTypeInfo; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * NodeTypeInfo.
             */
            public Builder nodeTypeInfo(java.util.List < NodeTypeInfo> nodeTypeInfo) {
                this.nodeTypeInfo = nodeTypeInfo;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
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
