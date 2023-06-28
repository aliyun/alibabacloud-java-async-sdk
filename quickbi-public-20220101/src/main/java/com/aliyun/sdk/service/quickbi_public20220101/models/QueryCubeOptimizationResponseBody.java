// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCubeOptimizationResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCubeOptimizationResponseBody</p>
 */
public class QueryCubeOptimizationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    @NameInMap("Success")
    private Boolean success;

    private QueryCubeOptimizationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCubeOptimizationResponseBody create() {
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

        public QueryCubeOptimizationResponseBody build() {
            return new QueryCubeOptimizationResponseBody(this);
        } 

    } 

    public static class CubePerformanceDiagnoseModel extends TeaModel {
        @NameInMap("CacheCostTimeAvg")
        private Double cacheCostTimeAvg;

        @NameInMap("CacheQueryCount")
        private Integer cacheQueryCount;

        @NameInMap("CostTimeAvg")
        private Double costTimeAvg;

        @NameInMap("CubeId")
        private String cubeId;

        @NameInMap("CubeName")
        private String cubeName;

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

        @NameInMap("WorkspaceId")
        private String workspaceId;

        @NameInMap("WorkspaceName")
        private String workspaceName;

        private CubePerformanceDiagnoseModel(Builder builder) {
            this.cacheCostTimeAvg = builder.cacheCostTimeAvg;
            this.cacheQueryCount = builder.cacheQueryCount;
            this.costTimeAvg = builder.costTimeAvg;
            this.cubeId = builder.cubeId;
            this.cubeName = builder.cubeName;
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
            this.workspaceId = builder.workspaceId;
            this.workspaceName = builder.workspaceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CubePerformanceDiagnoseModel create() {
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
         * @return costTimeAvg
         */
        public Double getCostTimeAvg() {
            return this.costTimeAvg;
        }

        /**
         * @return cubeId
         */
        public String getCubeId() {
            return this.cubeId;
        }

        /**
         * @return cubeName
         */
        public String getCubeName() {
            return this.cubeName;
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
            private Double costTimeAvg; 
            private String cubeId; 
            private String cubeName; 
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
             * CostTimeAvg.
             */
            public Builder costTimeAvg(Double costTimeAvg) {
                this.costTimeAvg = costTimeAvg;
                return this;
            }

            /**
             * CubeId.
             */
            public Builder cubeId(String cubeId) {
                this.cubeId = cubeId;
                return this;
            }

            /**
             * CubeName.
             */
            public Builder cubeName(String cubeName) {
                this.cubeName = cubeName;
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

            public CubePerformanceDiagnoseModel build() {
                return new CubePerformanceDiagnoseModel(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("AdviceType")
        private String adviceType;

        @NameInMap("CubePerformanceDiagnoseModel")
        private CubePerformanceDiagnoseModel cubePerformanceDiagnoseModel;

        private Result(Builder builder) {
            this.adviceType = builder.adviceType;
            this.cubePerformanceDiagnoseModel = builder.cubePerformanceDiagnoseModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return adviceType
         */
        public String getAdviceType() {
            return this.adviceType;
        }

        /**
         * @return cubePerformanceDiagnoseModel
         */
        public CubePerformanceDiagnoseModel getCubePerformanceDiagnoseModel() {
            return this.cubePerformanceDiagnoseModel;
        }

        public static final class Builder {
            private String adviceType; 
            private CubePerformanceDiagnoseModel cubePerformanceDiagnoseModel; 

            /**
             * AdviceType.
             */
            public Builder adviceType(String adviceType) {
                this.adviceType = adviceType;
                return this;
            }

            /**
             * CubePerformanceDiagnoseModel.
             */
            public Builder cubePerformanceDiagnoseModel(CubePerformanceDiagnoseModel cubePerformanceDiagnoseModel) {
                this.cubePerformanceDiagnoseModel = cubePerformanceDiagnoseModel;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
