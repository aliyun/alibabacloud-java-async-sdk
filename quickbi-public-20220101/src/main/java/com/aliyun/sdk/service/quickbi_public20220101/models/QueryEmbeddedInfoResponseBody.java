// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryEmbeddedInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryEmbeddedInfoResponseBody</p>
 */
public class QueryEmbeddedInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("Success")
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

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryEmbeddedInfoResponseBody build() {
            return new QueryEmbeddedInfoResponseBody(this);
        } 

    } 

    public static class Detail extends TeaModel {
        @NameInMap("DashboardOfflineQuery")
        private Integer dashboardOfflineQuery;

        @NameInMap("Page")
        private Integer page;

        @NameInMap("Report")
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

            /**
             * DashboardOfflineQuery.
             */
            public Builder dashboardOfflineQuery(Integer dashboardOfflineQuery) {
                this.dashboardOfflineQuery = dashboardOfflineQuery;
                return this;
            }

            /**
             * Page.
             */
            public Builder page(Integer page) {
                this.page = page;
                return this;
            }

            /**
             * Report.
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
    public static class Result extends TeaModel {
        @NameInMap("Detail")
        private Detail detail;

        @NameInMap("EmbeddedCount")
        private Integer embeddedCount;

        @NameInMap("MaxCount")
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

            /**
             * Detail.
             */
            public Builder detail(Detail detail) {
                this.detail = detail;
                return this;
            }

            /**
             * EmbeddedCount.
             */
            public Builder embeddedCount(Integer embeddedCount) {
                this.embeddedCount = embeddedCount;
                return this;
            }

            /**
             * MaxCount.
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
