// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMemoryNodesResponseBody} extends {@link TeaModel}
 *
 * <p>ListMemoryNodesResponseBody</p>
 */
public class ListMemoryNodesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("memoryNodes")
    private java.util.List < MemoryNodes> memoryNodes;

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

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return memoryNodes
     */
    public java.util.List < MemoryNodes> getMemoryNodes() {
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
        private java.util.List < MemoryNodes> memoryNodes; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * memoryNodes.
         */
        public Builder memoryNodes(java.util.List < MemoryNodes> memoryNodes) {
            this.memoryNodes = memoryNodes;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListMemoryNodesResponseBody build() {
            return new ListMemoryNodesResponseBody(this);
        } 

    } 

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

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * memoryNodeId.
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
