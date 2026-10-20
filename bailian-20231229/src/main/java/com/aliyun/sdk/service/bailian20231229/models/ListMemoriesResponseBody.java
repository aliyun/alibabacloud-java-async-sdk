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
 * {@link ListMemoriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListMemoriesResponseBody</p>
 */
public class ListMemoriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("memories")
    private java.util.List<Memories> memories;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    private ListMemoriesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.memories = builder.memories;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMemoriesResponseBody create() {
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
     * @return memories
     */
    public java.util.List<Memories> getMemories() {
        return this.memories;
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

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private Integer maxResults; 
        private java.util.List<Memories> memories; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(ListMemoriesResponseBody model) {
            this.maxResults = model.maxResults;
            this.memories = model.memories;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * <p>The number of long-term memory entities per page in a paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The list of long-term memory entities.</p>
         */
        public Builder memories(java.util.List<Memories> memories) {
            this.memories = memories;
            return this;
        }

        /**
         * <p>The pagination token returned in this call.</p>
         * 
         * <strong>example:</strong>
         * <p>dc270401186b433f975d7e1faaa3xxxx</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6a71f2d9-f1c9-913b-818b-11402910xxxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>105</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The workspace ID to which the long-term memory list belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-3z7uw7fwz0vexxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public ListMemoriesResponseBody build() {
            return new ListMemoriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMemoriesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMemoriesResponseBody</p>
     */
    public static class Memories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("memoryId")
        private String memoryId;

        private Memories(Builder builder) {
            this.description = builder.description;
            this.memoryId = builder.memoryId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Memories create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return memoryId
         */
        public String getMemoryId() {
            return this.memoryId;
        }

        public static final class Builder {
            private String description; 
            private String memoryId; 

            private Builder() {
            } 

            private Builder(Memories model) {
                this.description = model.description;
                this.memoryId = model.memoryId;
            } 

            /**
             * <p>The description of the long-term memory.</p>
             * 
             * <strong>example:</strong>
             * <p>Long-term memory of user A for my large model application $APP_ID</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The long-term memory ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3fc531f4519444beaafffa4538f6xxxx</p>
             */
            public Builder memoryId(String memoryId) {
                this.memoryId = memoryId;
                return this;
            }

            public Memories build() {
                return new Memories(this);
            } 

        } 

    }
}
