// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryComponentPerformanceResponseBody} extends {@link TeaModel}
 *
 * <p>QueryComponentPerformanceResponseBody</p>
 */
public class QueryComponentPerformanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    @NameInMap("Success")
    private Boolean success;

    private QueryComponentPerformanceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryComponentPerformanceResponseBody create() {
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
    public java.util.List < Result> getResult() {
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
        private java.util.List < Result> result; 
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
        public Builder result(java.util.List < Result> result) {
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

        public QueryComponentPerformanceResponseBody build() {
            return new QueryComponentPerformanceResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("CacheCostTimeAvg")
        private Double cacheCostTimeAvg;

        @NameInMap("CacheQueryCount")
        private Integer cacheQueryCount;

        @NameInMap("ComponentId")
        private String componentId;

        @NameInMap("ComponentName")
        private String componentName;

        @NameInMap("CostTimeAvg")
        private Double costTimeAvg;

        @NameInMap("QueryCount")
        private Integer queryCount;

        @NameInMap("QueryCountAvg")
        private Double queryCountAvg;

        @NameInMap("QueryOverFivePercentNum")
        private Double queryOverFivePercentNum;

        @NameInMap("QueryOverFiveSecPercent")
        private String queryOverFiveSecPercent;

        @NameInMap("QueryOverTenSecPercent")
        private String queryOverTenSecPercent;

        @NameInMap("QueryOverTenSecPercentNum")
        private Double queryOverTenSecPercentNum;

        @NameInMap("QueryTimeoutCount")
        private Integer queryTimeoutCount;

        @NameInMap("QueryTimeoutCountPercent")
        private Double queryTimeoutCountPercent;

        @NameInMap("QuickIndexCostTimeAvg")
        private Double quickIndexCostTimeAvg;

        @NameInMap("QuickIndexQueryCount")
        private Integer quickIndexQueryCount;

        @NameInMap("RepeatQueryPercent")
        private String repeatQueryPercent;

        @NameInMap("RepeatQueryPercentNum")
        private Double repeatQueryPercentNum;

        @NameInMap("RepeatSqlQueryCount")
        private Integer repeatSqlQueryCount;

        @NameInMap("RepeatSqlQueryPercent")
        private String repeatSqlQueryPercent;

        @NameInMap("ReportId")
        private String reportId;

        @NameInMap("ReportName")
        private String reportName;

        @NameInMap("ReportType")
        private String reportType;

        @NameInMap("WorkspaceId")
        private String workspaceId;

        @NameInMap("WorkspaceName")
        private String workspaceName;

        private Result(Builder builder) {
            this.cacheCostTimeAvg = builder.cacheCostTimeAvg;
            this.cacheQueryCount = builder.cacheQueryCount;
            this.componentId = builder.componentId;
            this.componentName = builder.componentName;
            this.costTimeAvg = builder.costTimeAvg;
            this.queryCount = builder.queryCount;
            this.queryCountAvg = builder.queryCountAvg;
            this.queryOverFivePercentNum = builder.queryOverFivePercentNum;
            this.queryOverFiveSecPercent = builder.queryOverFiveSecPercent;
            this.queryOverTenSecPercent = builder.queryOverTenSecPercent;
            this.queryOverTenSecPercentNum = builder.queryOverTenSecPercentNum;
            this.queryTimeoutCount = builder.queryTimeoutCount;
            this.queryTimeoutCountPercent = builder.queryTimeoutCountPercent;
            this.quickIndexCostTimeAvg = builder.quickIndexCostTimeAvg;
            this.quickIndexQueryCount = builder.quickIndexQueryCount;
            this.repeatQueryPercent = builder.repeatQueryPercent;
            this.repeatQueryPercentNum = builder.repeatQueryPercentNum;
            this.repeatSqlQueryCount = builder.repeatSqlQueryCount;
            this.repeatSqlQueryPercent = builder.repeatSqlQueryPercent;
            this.reportId = builder.reportId;
            this.reportName = builder.reportName;
            this.reportType = builder.reportType;
            this.workspaceId = builder.workspaceId;
            this.workspaceName = builder.workspaceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return cacheCostTimeAvg
         */
        public Double getCacheCostTimeAvg() {
            return this.cacheCostTimeAvg;
        }

        /**
         * @return cacheQueryCount
         */
        public Integer getCacheQueryCount() {
            return this.cacheQueryCount;
        }

        /**
         * @return componentId
         */
        public String getComponentId() {
            return this.componentId;
        }

        /**
         * @return componentName
         */
        public String getComponentName() {
            return this.componentName;
        }

        /**
         * @return costTimeAvg
         */
        public Double getCostTimeAvg() {
            return this.costTimeAvg;
        }

        /**
         * @return queryCount
         */
        public Integer getQueryCount() {
            return this.queryCount;
        }

        /**
         * @return queryCountAvg
         */
        public Double getQueryCountAvg() {
            return this.queryCountAvg;
        }

        /**
         * @return queryOverFivePercentNum
         */
        public Double getQueryOverFivePercentNum() {
            return this.queryOverFivePercentNum;
        }

        /**
         * @return queryOverFiveSecPercent
         */
        public String getQueryOverFiveSecPercent() {
            return this.queryOverFiveSecPercent;
        }

        /**
         * @return queryOverTenSecPercent
         */
        public String getQueryOverTenSecPercent() {
            return this.queryOverTenSecPercent;
        }

        /**
         * @return queryOverTenSecPercentNum
         */
        public Double getQueryOverTenSecPercentNum() {
            return this.queryOverTenSecPercentNum;
        }

        /**
         * @return queryTimeoutCount
         */
        public Integer getQueryTimeoutCount() {
            return this.queryTimeoutCount;
        }

        /**
         * @return queryTimeoutCountPercent
         */
        public Double getQueryTimeoutCountPercent() {
            return this.queryTimeoutCountPercent;
        }

        /**
         * @return quickIndexCostTimeAvg
         */
        public Double getQuickIndexCostTimeAvg() {
            return this.quickIndexCostTimeAvg;
        }

        /**
         * @return quickIndexQueryCount
         */
        public Integer getQuickIndexQueryCount() {
            return this.quickIndexQueryCount;
        }

        /**
         * @return repeatQueryPercent
         */
        public String getRepeatQueryPercent() {
            return this.repeatQueryPercent;
        }

        /**
         * @return repeatQueryPercentNum
         */
        public Double getRepeatQueryPercentNum() {
            return this.repeatQueryPercentNum;
        }

        /**
         * @return repeatSqlQueryCount
         */
        public Integer getRepeatSqlQueryCount() {
            return this.repeatSqlQueryCount;
        }

        /**
         * @return repeatSqlQueryPercent
         */
        public String getRepeatSqlQueryPercent() {
            return this.repeatSqlQueryPercent;
        }

        /**
         * @return reportId
         */
        public String getReportId() {
            return this.reportId;
        }

        /**
         * @return reportName
         */
        public String getReportName() {
            return this.reportName;
        }

        /**
         * @return reportType
         */
        public String getReportType() {
            return this.reportType;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        /**
         * @return workspaceName
         */
        public String getWorkspaceName() {
            return this.workspaceName;
        }

        public static final class Builder {
            private Double cacheCostTimeAvg; 
            private Integer cacheQueryCount; 
            private String componentId; 
            private String componentName; 
            private Double costTimeAvg; 
            private Integer queryCount; 
            private Double queryCountAvg; 
            private Double queryOverFivePercentNum; 
            private String queryOverFiveSecPercent; 
            private String queryOverTenSecPercent; 
            private Double queryOverTenSecPercentNum; 
            private Integer queryTimeoutCount; 
            private Double queryTimeoutCountPercent; 
            private Double quickIndexCostTimeAvg; 
            private Integer quickIndexQueryCount; 
            private String repeatQueryPercent; 
            private Double repeatQueryPercentNum; 
            private Integer repeatSqlQueryCount; 
            private String repeatSqlQueryPercent; 
            private String reportId; 
            private String reportName; 
            private String reportType; 
            private String workspaceId; 
            private String workspaceName; 

            /**
             * CacheCostTimeAvg.
             */
            public Builder cacheCostTimeAvg(Double cacheCostTimeAvg) {
                this.cacheCostTimeAvg = cacheCostTimeAvg;
                return this;
            }

            /**
             * CacheQueryCount.
             */
            public Builder cacheQueryCount(Integer cacheQueryCount) {
                this.cacheQueryCount = cacheQueryCount;
                return this;
            }

            /**
             * ComponentId.
             */
            public Builder componentId(String componentId) {
                this.componentId = componentId;
                return this;
            }

            /**
             * ComponentName.
             */
            public Builder componentName(String componentName) {
                this.componentName = componentName;
                return this;
            }

            /**
             * CostTimeAvg.
             */
            public Builder costTimeAvg(Double costTimeAvg) {
                this.costTimeAvg = costTimeAvg;
                return this;
            }

            /**
             * QueryCount.
             */
            public Builder queryCount(Integer queryCount) {
                this.queryCount = queryCount;
                return this;
            }

            /**
             * QueryCountAvg.
             */
            public Builder queryCountAvg(Double queryCountAvg) {
                this.queryCountAvg = queryCountAvg;
                return this;
            }

            /**
             * QueryOverFivePercentNum.
             */
            public Builder queryOverFivePercentNum(Double queryOverFivePercentNum) {
                this.queryOverFivePercentNum = queryOverFivePercentNum;
                return this;
            }

            /**
             * QueryOverFiveSecPercent.
             */
            public Builder queryOverFiveSecPercent(String queryOverFiveSecPercent) {
                this.queryOverFiveSecPercent = queryOverFiveSecPercent;
                return this;
            }

            /**
             * QueryOverTenSecPercent.
             */
            public Builder queryOverTenSecPercent(String queryOverTenSecPercent) {
                this.queryOverTenSecPercent = queryOverTenSecPercent;
                return this;
            }

            /**
             * QueryOverTenSecPercentNum.
             */
            public Builder queryOverTenSecPercentNum(Double queryOverTenSecPercentNum) {
                this.queryOverTenSecPercentNum = queryOverTenSecPercentNum;
                return this;
            }

            /**
             * QueryTimeoutCount.
             */
            public Builder queryTimeoutCount(Integer queryTimeoutCount) {
                this.queryTimeoutCount = queryTimeoutCount;
                return this;
            }

            /**
             * QueryTimeoutCountPercent.
             */
            public Builder queryTimeoutCountPercent(Double queryTimeoutCountPercent) {
                this.queryTimeoutCountPercent = queryTimeoutCountPercent;
                return this;
            }

            /**
             * QuickIndexCostTimeAvg.
             */
            public Builder quickIndexCostTimeAvg(Double quickIndexCostTimeAvg) {
                this.quickIndexCostTimeAvg = quickIndexCostTimeAvg;
                return this;
            }

            /**
             * QuickIndexQueryCount.
             */
            public Builder quickIndexQueryCount(Integer quickIndexQueryCount) {
                this.quickIndexQueryCount = quickIndexQueryCount;
                return this;
            }

            /**
             * RepeatQueryPercent.
             */
            public Builder repeatQueryPercent(String repeatQueryPercent) {
                this.repeatQueryPercent = repeatQueryPercent;
                return this;
            }

            /**
             * RepeatQueryPercentNum.
             */
            public Builder repeatQueryPercentNum(Double repeatQueryPercentNum) {
                this.repeatQueryPercentNum = repeatQueryPercentNum;
                return this;
            }

            /**
             * RepeatSqlQueryCount.
             */
            public Builder repeatSqlQueryCount(Integer repeatSqlQueryCount) {
                this.repeatSqlQueryCount = repeatSqlQueryCount;
                return this;
            }

            /**
             * RepeatSqlQueryPercent.
             */
            public Builder repeatSqlQueryPercent(String repeatSqlQueryPercent) {
                this.repeatSqlQueryPercent = repeatSqlQueryPercent;
                return this;
            }

            /**
             * ReportId.
             */
            public Builder reportId(String reportId) {
                this.reportId = reportId;
                return this;
            }

            /**
             * ReportName.
             */
            public Builder reportName(String reportName) {
                this.reportName = reportName;
                return this;
            }

            /**
             * ReportType.
             */
            public Builder reportType(String reportType) {
                this.reportType = reportType;
                return this;
            }

            /**
             * WorkspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            /**
             * WorkspaceName.
             */
            public Builder workspaceName(String workspaceName) {
                this.workspaceName = workspaceName;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
