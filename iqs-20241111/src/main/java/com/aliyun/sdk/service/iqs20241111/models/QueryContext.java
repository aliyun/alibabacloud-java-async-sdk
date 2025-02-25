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
 * {@link QueryContext} extends {@link TeaModel}
 *
 * <p>QueryContext</p>
 */
public class QueryContext extends TeaModel {
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

    /**
     * 
     * {@link QueryContext} extends {@link TeaModel}
     *
     * <p>QueryContext</p>
     */
    public static class OriginalQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("industry")
        private String industry;

        @com.aliyun.core.annotation.NameInMap("page")
        private String page;

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
        public String getPage() {
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
            private String page; 
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
            public Builder page(String page) {
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
     * {@link QueryContext} extends {@link TeaModel}
     *
     * <p>QueryContext</p>
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
}
