// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link SearchMemoriesResponseBody} extends {@link TeaModel}
 *
 * <p>SearchMemoriesResponseBody</p>
 */
public class SearchMemoriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Page")
    private String page;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Results")
    private java.util.List<Results> results;

    @com.aliyun.core.annotation.NameInMap("Total")
    private String total;

    @com.aliyun.core.annotation.NameInMap("TotalPages")
    private String totalPages;

    private SearchMemoriesResponseBody(Builder builder) {
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.results = builder.results;
        this.total = builder.total;
        this.totalPages = builder.totalPages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchMemoriesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return page
     */
    public String getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return results
     */
    public java.util.List<Results> getResults() {
        return this.results;
    }

    /**
     * @return total
     */
    public String getTotal() {
        return this.total;
    }

    /**
     * @return totalPages
     */
    public String getTotalPages() {
        return this.totalPages;
    }

    public static final class Builder {
        private String page; 
        private String pageSize; 
        private String requestId; 
        private java.util.List<Results> results; 
        private String total; 
        private String totalPages; 

        private Builder() {
        } 

        private Builder(SearchMemoriesResponseBody model) {
            this.page = model.page;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.results = model.results;
            this.total = model.total;
            this.totalPages = model.totalPages;
        } 

        /**
         * Page.
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3E5CD764-FCCA-5C9C-838E-20E0DE84B2AF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of results.</p>
         */
        public Builder results(java.util.List<Results> results) {
            this.results = results;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(String total) {
            this.total = total;
            return this;
        }

        /**
         * TotalPages.
         */
        public Builder totalPages(String totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public SearchMemoriesResponseBody build() {
            return new SearchMemoriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SearchMemoriesResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMemoriesResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private String memory;

        @com.aliyun.core.annotation.NameInMap("MemoryAgentId")
        private String memoryAgentId;

        @com.aliyun.core.annotation.NameInMap("MemoryUserId")
        private String memoryUserId;

        @com.aliyun.core.annotation.NameInMap("Metadata")
        private String metadata;

        @com.aliyun.core.annotation.NameInMap("Score")
        private String score;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private Results(Builder builder) {
            this.createTime = builder.createTime;
            this.id = builder.id;
            this.memory = builder.memory;
            this.memoryAgentId = builder.memoryAgentId;
            this.memoryUserId = builder.memoryUserId;
            this.metadata = builder.metadata;
            this.score = builder.score;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return memory
         */
        public String getMemory() {
            return this.memory;
        }

        /**
         * @return memoryAgentId
         */
        public String getMemoryAgentId() {
            return this.memoryAgentId;
        }

        /**
         * @return memoryUserId
         */
        public String getMemoryUserId() {
            return this.memoryUserId;
        }

        /**
         * @return metadata
         */
        public String getMetadata() {
            return this.metadata;
        }

        /**
         * @return score
         */
        public String getScore() {
            return this.score;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private String id; 
            private String memory; 
            private String memoryAgentId; 
            private String memoryUserId; 
            private String metadata; 
            private String score; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.createTime = model.createTime;
                this.id = model.id;
                this.memory = model.memory;
                this.memoryAgentId = model.memoryAgentId;
                this.memoryUserId = model.memoryUserId;
                this.metadata = model.metadata;
                this.score = model.score;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-09-26T08:25:44Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The memory ID.</p>
             * 
             * <strong>example:</strong>
             * <p>423</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The memory content.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The agent to which the memory belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>agent1</p>
             */
            public Builder memoryAgentId(String memoryAgentId) {
                this.memoryAgentId = memoryAgentId;
                return this;
            }

            /**
             * <p>The user to whom the memory belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>user1</p>
             */
            public Builder memoryUserId(String memoryUserId) {
                this.memoryUserId = memoryUserId;
                return this;
            }

            /**
             * <p>The metadata.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;tags\&quot;:\&quot;Issue_date_2023-11-30,VD_现行有效\&quot;}</p>
             */
            public Builder metadata(String metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>The score.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-10-16T02:27:33Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
