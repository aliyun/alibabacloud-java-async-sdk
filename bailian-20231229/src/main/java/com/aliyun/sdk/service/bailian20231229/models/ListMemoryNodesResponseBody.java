// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

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
 * {@link ListMemoryNodesResponseBody} extends {@link TeaModel}
 *
 * <p>ListMemoryNodesResponseBody</p>
 */
public class ListMemoryNodesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("memoryNodes")
    private java.util.List<MemoryNodes> memoryNodes;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListMemoryNodesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.memoryNodes = builder.memoryNodes;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMemoryNodesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return memoryNodes
     */
    public java.util.List<MemoryNodes> getMemoryNodes() {
        return this.memoryNodes;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private Integer maxResults; 
        private java.util.List<MemoryNodes> memoryNodes; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListMemoryNodesResponseBody model) {
            this.maxResults = model.maxResults;
            this.memoryNodes = model.memoryNodes;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The maximum number of results returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The array of memory nodes.</p>
         */
        public Builder memoryNodes(java.util.List<MemoryNodes> memoryNodes) {
            this.memoryNodes = memoryNodes;
            return this;
        }

        /**
         * <p>The token used for token-based pagination.</p>
         * 
         * <strong>example:</strong>
         * <p>dc270401186b433f975d7e1faaa34e0e</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6a71f2d9-f1c9-913b-818b-114029103cad</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of memory nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListMemoryNodesResponseBody build() {
            return new ListMemoryNodesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMemoryNodesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMemoryNodesResponseBody</p>
     */
    public static class MemoryNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("memoryNodeId")
        private String memoryNodeId;

        private MemoryNodes(Builder builder) {
            this.content = builder.content;
            this.memoryNodeId = builder.memoryNodeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MemoryNodes create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return memoryNodeId
         */
        public String getMemoryNodeId() {
            return this.memoryNodeId;
        }

        public static final class Builder {
            private String content; 
            private String memoryNodeId; 

            private Builder() {
            } 

            private Builder(MemoryNodes model) {
                this.content = model.content;
                this.memoryNodeId = model.memoryNodeId;
            } 

            /**
             * <p>The content of the memory node.</p>
             * 
             * <strong>example:</strong>
             * <p>用户喜欢吃西红柿炒鸡蛋</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The memory node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>68de06c95368463a8be4a84efc872cc5</p>
             */
            public Builder memoryNodeId(String memoryNodeId) {
                this.memoryNodeId = memoryNodeId;
                return this;
            }

            public MemoryNodes build() {
                return new MemoryNodes(this);
            } 

        } 

    }
}
