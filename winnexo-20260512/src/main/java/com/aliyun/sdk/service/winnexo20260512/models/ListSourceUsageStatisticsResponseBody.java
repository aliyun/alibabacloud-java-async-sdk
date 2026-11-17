// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link ListSourceUsageStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSourceUsageStatisticsResponseBody</p>
 */
public class ListSourceUsageStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("hasMore")
    private Boolean hasMore;

    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("page")
    private Long page;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private ListSourceUsageStatisticsResponseBody(Builder builder) {
        this.code = builder.code;
        this.hasMore = builder.hasMore;
        this.items = builder.items;
        this.message = builder.message;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSourceUsageStatisticsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return hasMore
     */
    public Boolean getHasMore() {
        return this.hasMore;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return page
     */
    public Long getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private Boolean hasMore; 
        private java.util.List<Items> items; 
        private String message; 
        private Long page; 
        private Long pageSize; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(ListSourceUsageStatisticsResponseBody model) {
            this.code = model.code;
            this.hasMore = model.hasMore;
            this.items = model.items;
            this.message = model.message;
            this.page = model.page;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Indicates whether there is a next page.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder hasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }

        /**
         * <p>The user information.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;sourceId&quot;:&quot;src_9401&quot;,&quot;sourceName&quot;:&quot;Product documentation&quot;,&quot;sourceType&quot;:&quot;KNOWLEDGE_BASE&quot;,&quot;retrievalCount&quot;:12,&quot;usageCount&quot;:5,&quot;lastEventTime&quot;:&quot;2026-11-05T08:00:00Z&quot;}]</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The description of the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>The requested resource does not exist</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Long page) {
            this.page = page;
            return this;
        }

        /**
         * <p>The page size. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of data entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListSourceUsageStatisticsResponseBody build() {
            return new ListSourceUsageStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSourceUsageStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSourceUsageStatisticsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("lastEventTime")
        private String lastEventTime;

        @com.aliyun.core.annotation.NameInMap("retrievalCount")
        private Long retrievalCount;

        @com.aliyun.core.annotation.NameInMap("sourceId")
        private String sourceId;

        @com.aliyun.core.annotation.NameInMap("sourceName")
        private String sourceName;

        @com.aliyun.core.annotation.NameInMap("sourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("usageCount")
        private Long usageCount;

        private Items(Builder builder) {
            this.lastEventTime = builder.lastEventTime;
            this.retrievalCount = builder.retrievalCount;
            this.sourceId = builder.sourceId;
            this.sourceName = builder.sourceName;
            this.sourceType = builder.sourceType;
            this.usageCount = builder.usageCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return lastEventTime
         */
        public String getLastEventTime() {
            return this.lastEventTime;
        }

        /**
         * @return retrievalCount
         */
        public Long getRetrievalCount() {
            return this.retrievalCount;
        }

        /**
         * @return sourceId
         */
        public String getSourceId() {
            return this.sourceId;
        }

        /**
         * @return sourceName
         */
        public String getSourceName() {
            return this.sourceName;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return usageCount
         */
        public Long getUsageCount() {
            return this.usageCount;
        }

        public static final class Builder {
            private String lastEventTime; 
            private Long retrievalCount; 
            private String sourceId; 
            private String sourceName; 
            private String sourceType; 
            private Long usageCount; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.lastEventTime = model.lastEventTime;
                this.retrievalCount = model.retrievalCount;
                this.sourceId = model.sourceId;
                this.sourceName = model.sourceName;
                this.sourceType = model.sourceType;
                this.usageCount = model.usageCount;
            } 

            /**
             * <p>The time of the most recent reporting and ingestion within the filtered range.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-02 11:20:09</p>
             */
            public Builder lastEventTime(String lastEventTime) {
                this.lastEventTime = lastEventTime;
                return this;
            }

            /**
             * <p>The number of deduplicated sources.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder retrievalCount(Long retrievalCount) {
                this.retrievalCount = retrievalCount;
                return this;
            }

            /**
             * <p>The ID of the data source, which is unique within the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder sourceId(String sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * <p>The name of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>test123</p>
             */
            public Builder sourceName(String sourceName) {
                this.sourceName = sourceName;
                return this;
            }

            /**
             * <p>The skill source type.</p>
             * 
             * <strong>example:</strong>
             * <p>BUILTIN</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The number of used sources.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder usageCount(Long usageCount) {
                this.usageCount = usageCount;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
