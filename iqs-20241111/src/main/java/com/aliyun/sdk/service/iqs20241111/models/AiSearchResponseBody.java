// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241111.models;

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
 * {@link AiSearchResponseBody} extends {@link TeaModel}
 *
 * <p>AiSearchResponseBody</p>
 */
public class AiSearchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("header")
    private AiSearchResponseBodyHeader header;

    @com.aliyun.core.annotation.NameInMap("payload")
    private String payload;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private AiSearchResponseBody(Builder builder) {
        this.header = builder.header;
        this.payload = builder.payload;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AiSearchResponseBody create() {
        return builder().build();
    }

    /**
     * @return header
     */
    public AiSearchResponseBodyHeader getHeader() {
        return this.header;
    }

    /**
     * @return payload
     */
    public String getPayload() {
        return this.payload;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AiSearchResponseBodyHeader header; 
        private String payload; 
        private String requestId; 

        /**
         * header.
         */
        public Builder header(AiSearchResponseBodyHeader header) {
            this.header = header;
            return this;
        }

        /**
         * payload.
         */
        public Builder payload(String payload) {
            this.payload = payload;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>ECB2144C-E277-5434-80E6-12D26678D364</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AiSearchResponseBody build() {
            return new AiSearchResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AiSearchResponseBody} extends {@link TeaModel}
     *
     * <p>AiSearchResponseBody</p>
     */
    public static class OriginalQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("industry")
        private String industry;

        @com.aliyun.core.annotation.NameInMap("page")
        private Integer page;

        @com.aliyun.core.annotation.NameInMap("query")
        private String query;

        @com.aliyun.core.annotation.NameInMap("timeRange")
        private String timeRange;

        private OriginalQuery(Builder builder) {
            this.industry = builder.industry;
            this.page = builder.page;
            this.query = builder.query;
            this.timeRange = builder.timeRange;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OriginalQuery create() {
            return builder().build();
        }

        /**
         * @return industry
         */
        public String getIndustry() {
            return this.industry;
        }

        /**
         * @return page
         */
        public Integer getPage() {
            return this.page;
        }

        /**
         * @return query
         */
        public String getQuery() {
            return this.query;
        }

        /**
         * @return timeRange
         */
        public String getTimeRange() {
            return this.timeRange;
        }

        public static final class Builder {
            private String industry; 
            private Integer page; 
            private String query; 
            private String timeRange; 

            /**
             * industry.
             */
            public Builder industry(String industry) {
                this.industry = industry;
                return this;
            }

            /**
             * page.
             */
            public Builder page(Integer page) {
                this.page = page;
                return this;
            }

            /**
             * query.
             */
            public Builder query(String query) {
                this.query = query;
                return this;
            }

            /**
             * timeRange.
             */
            public Builder timeRange(String timeRange) {
                this.timeRange = timeRange;
                return this;
            }

            public OriginalQuery build() {
                return new OriginalQuery(this);
            } 

        } 

    }
    /**
     * 
     * {@link AiSearchResponseBody} extends {@link TeaModel}
     *
     * <p>AiSearchResponseBody</p>
     */
    public static class Rewrite extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("timeRange")
        private String timeRange;

        private Rewrite(Builder builder) {
            this.enabled = builder.enabled;
            this.timeRange = builder.timeRange;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rewrite create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return timeRange
         */
        public String getTimeRange() {
            return this.timeRange;
        }

        public static final class Builder {
            private Boolean enabled; 
            private String timeRange; 

            /**
             * enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * timeRange.
             */
            public Builder timeRange(String timeRange) {
                this.timeRange = timeRange;
                return this;
            }

            public Rewrite build() {
                return new Rewrite(this);
            } 

        } 

    }
    /**
     * 
     * {@link AiSearchResponseBody} extends {@link TeaModel}
     *
     * <p>AiSearchResponseBody</p>
     */
    public static class QueryContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("originalQuery")
        private OriginalQuery originalQuery;

        @com.aliyun.core.annotation.NameInMap("rewrite")
        private Rewrite rewrite;

        private QueryContext(Builder builder) {
            this.originalQuery = builder.originalQuery;
            this.rewrite = builder.rewrite;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryContext create() {
            return builder().build();
        }

        /**
         * @return originalQuery
         */
        public OriginalQuery getOriginalQuery() {
            return this.originalQuery;
        }

        /**
         * @return rewrite
         */
        public Rewrite getRewrite() {
            return this.rewrite;
        }

        public static final class Builder {
            private OriginalQuery originalQuery; 
            private Rewrite rewrite; 

            /**
             * originalQuery.
             */
            public Builder originalQuery(OriginalQuery originalQuery) {
                this.originalQuery = originalQuery;
                return this;
            }

            /**
             * rewrite.
             */
            public Builder rewrite(Rewrite rewrite) {
                this.rewrite = rewrite;
                return this;
            }

            public QueryContext build() {
                return new QueryContext(this);
            } 

        } 

    }
    /**
     * 
     * {@link AiSearchResponseBody} extends {@link TeaModel}
     *
     * <p>AiSearchResponseBody</p>
     */
    public static class AiSearchResponseBodyHeader extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("event")
        private String event;

        @com.aliyun.core.annotation.NameInMap("eventId")
        private String eventId;

        @com.aliyun.core.annotation.NameInMap("queryContext")
        private QueryContext queryContext;

        @com.aliyun.core.annotation.NameInMap("responseTime")
        private Long responseTime;

        private AiSearchResponseBodyHeader(Builder builder) {
            this.event = builder.event;
            this.eventId = builder.eventId;
            this.queryContext = builder.queryContext;
            this.responseTime = builder.responseTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AiSearchResponseBodyHeader create() {
            return builder().build();
        }

        /**
         * @return event
         */
        public String getEvent() {
            return this.event;
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return queryContext
         */
        public QueryContext getQueryContext() {
            return this.queryContext;
        }

        /**
         * @return responseTime
         */
        public Long getResponseTime() {
            return this.responseTime;
        }

        public static final class Builder {
            private String event; 
            private String eventId; 
            private QueryContext queryContext; 
            private Long responseTime; 

            /**
             * event.
             */
            public Builder event(String event) {
                this.event = event;
                return this;
            }

            /**
             * eventId.
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * queryContext.
             */
            public Builder queryContext(QueryContext queryContext) {
                this.queryContext = queryContext;
                return this;
            }

            /**
             * responseTime.
             */
            public Builder responseTime(Long responseTime) {
                this.responseTime = responseTime;
                return this;
            }

            public AiSearchResponseBodyHeader build() {
                return new AiSearchResponseBodyHeader(this);
            } 

        } 

    }
}
