// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link QueryEmbeddedInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryEmbeddedInfoResponseBody</p>
 */
public class QueryEmbeddedInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryEmbeddedInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryEmbeddedInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryEmbeddedInfoResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D787E1A3-A93C-424A-B626-C2B05DF8D885</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The embedded information of the reports under the organization.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li>true: The request was successful.</li>
         * <li>false: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryEmbeddedInfoResponseBody build() {
            return new QueryEmbeddedInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryEmbeddedInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryEmbeddedInfoResponseBody</p>
     */
    public static class Detail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DashboardOfflineQuery")
        private Integer dashboardOfflineQuery;

        @com.aliyun.core.annotation.NameInMap("Page")
        private Integer page;

        @com.aliyun.core.annotation.NameInMap("Report")
        private Integer report;

        private Detail(Builder builder) {
            this.dashboardOfflineQuery = builder.dashboardOfflineQuery;
            this.page = builder.page;
            this.report = builder.report;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Detail create() {
            return builder().build();
        }

        /**
         * @return dashboardOfflineQuery
         */
        public Integer getDashboardOfflineQuery() {
            return this.dashboardOfflineQuery;
        }

        /**
         * @return page
         */
        public Integer getPage() {
            return this.page;
        }

        /**
         * @return report
         */
        public Integer getReport() {
            return this.report;
        }

        public static final class Builder {
            private Integer dashboardOfflineQuery; 
            private Integer page; 
            private Integer report; 

            private Builder() {
            } 

            private Builder(Detail model) {
                this.dashboardOfflineQuery = model.dashboardOfflineQuery;
                this.page = model.page;
                this.report = model.report;
            } 

            /**
             * <p>The number of embedded self-service fetching.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder dashboardOfflineQuery(Integer dashboardOfflineQuery) {
                this.dashboardOfflineQuery = dashboardOfflineQuery;
                return this;
            }

            /**
             * <p>The number of embedded dashboards.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder page(Integer page) {
                this.page = page;
                return this;
            }

            /**
             * <p>The number of embedded spreadsheets.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder report(Integer report) {
                this.report = report;
                return this;
            }

            public Detail build() {
                return new Detail(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryEmbeddedInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryEmbeddedInfoResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Detail")
        private Detail detail;

        @com.aliyun.core.annotation.NameInMap("EmbeddedCount")
        private Integer embeddedCount;

        @com.aliyun.core.annotation.NameInMap("MaxCount")
        private Integer maxCount;

        private Result(Builder builder) {
            this.detail = builder.detail;
            this.embeddedCount = builder.embeddedCount;
            this.maxCount = builder.maxCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public Detail getDetail() {
            return this.detail;
        }

        /**
         * @return embeddedCount
         */
        public Integer getEmbeddedCount() {
            return this.embeddedCount;
        }

        /**
         * @return maxCount
         */
        public Integer getMaxCount() {
            return this.maxCount;
        }

        public static final class Builder {
            private Detail detail; 
            private Integer embeddedCount; 
            private Integer maxCount; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.detail = model.detail;
                this.embeddedCount = model.embeddedCount;
                this.maxCount = model.maxCount;
            } 

            /**
             * <p>Embed the statistics of the work.</p>
             */
            public Builder detail(Detail detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The number of reports that are currently embedded.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder embeddedCount(Integer embeddedCount) {
                this.embeddedCount = embeddedCount;
                return this;
            }

            /**
             * <p>The maximum number of reports that can be embedded.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder maxCount(Integer maxCount) {
                this.maxCount = maxCount;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
