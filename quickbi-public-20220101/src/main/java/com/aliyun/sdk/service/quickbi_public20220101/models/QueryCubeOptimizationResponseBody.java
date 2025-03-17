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
 * {@link QueryCubeOptimizationResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCubeOptimizationResponseBody</p>
 */
public class QueryCubeOptimizationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("Success")
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
    public java.util.List<Result> getResult() {
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
        private java.util.List<Result> result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryCubeOptimizationResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D787E1A3-A93C-424A-B626-C2B05DF8D885</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
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

        public QueryCubeOptimizationResponseBody build() {
            return new QueryCubeOptimizationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryCubeOptimizationResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCubeOptimizationResponseBody</p>
     */
    public static class CubePerformanceDiagnoseModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CacheCostTimeAvg")
        private Double cacheCostTimeAvg;

        @com.aliyun.core.annotation.NameInMap("CacheQueryCount")
        private Integer cacheQueryCount;

        @com.aliyun.core.annotation.NameInMap("CostTimeAvg")
        private Double costTimeAvg;

        @com.aliyun.core.annotation.NameInMap("CubeId")
        private String cubeId;

        @com.aliyun.core.annotation.NameInMap("CubeName")
        private String cubeName;

        @com.aliyun.core.annotation.NameInMap("QueryCount")
        private Integer queryCount;

        @com.aliyun.core.annotation.NameInMap("QueryCountAvg")
        private Double queryCountAvg;

        @com.aliyun.core.annotation.NameInMap("QueryOverFivePercentNum")
        private Double queryOverFivePercentNum;

        @com.aliyun.core.annotation.NameInMap("QueryOverFiveSecPercent")
        private String queryOverFiveSecPercent;

        @com.aliyun.core.annotation.NameInMap("QueryOverTenSecPercent")
        private String queryOverTenSecPercent;

        @com.aliyun.core.annotation.NameInMap("QueryOverTenSecPercentNum")
        private Double queryOverTenSecPercentNum;

        @com.aliyun.core.annotation.NameInMap("QueryTimeoutCount")
        private Integer queryTimeoutCount;

        @com.aliyun.core.annotation.NameInMap("QueryTimeoutCountPercent")
        private Double queryTimeoutCountPercent;

        @com.aliyun.core.annotation.NameInMap("QuickIndexCostTimeAvg")
        private Double quickIndexCostTimeAvg;

        @com.aliyun.core.annotation.NameInMap("QuickIndexQueryCount")
        private Integer quickIndexQueryCount;

        @com.aliyun.core.annotation.NameInMap("RepeatQueryPercent")
        private String repeatQueryPercent;

        @com.aliyun.core.annotation.NameInMap("RepeatQueryPercentNum")
        private Double repeatQueryPercentNum;

        @com.aliyun.core.annotation.NameInMap("RepeatSqlQueryCount")
        private Integer repeatSqlQueryCount;

        @com.aliyun.core.annotation.NameInMap("RepeatSqlQueryPercent")
        private String repeatSqlQueryPercent;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        @com.aliyun.core.annotation.NameInMap("WorkspaceName")
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

            private Builder() {
            } 

            private Builder(CubePerformanceDiagnoseModel model) {
                this.cacheCostTimeAvg = model.cacheCostTimeAvg;
                this.cacheQueryCount = model.cacheQueryCount;
                this.costTimeAvg = model.costTimeAvg;
                this.cubeId = model.cubeId;
                this.cubeName = model.cubeName;
                this.queryCount = model.queryCount;
                this.queryCountAvg = model.queryCountAvg;
                this.queryOverFivePercentNum = model.queryOverFivePercentNum;
                this.queryOverFiveSecPercent = model.queryOverFiveSecPercent;
                this.queryOverTenSecPercent = model.queryOverTenSecPercent;
                this.queryOverTenSecPercentNum = model.queryOverTenSecPercentNum;
                this.queryTimeoutCount = model.queryTimeoutCount;
                this.queryTimeoutCountPercent = model.queryTimeoutCountPercent;
                this.quickIndexCostTimeAvg = model.quickIndexCostTimeAvg;
                this.quickIndexQueryCount = model.quickIndexQueryCount;
                this.repeatQueryPercent = model.repeatQueryPercent;
                this.repeatQueryPercentNum = model.repeatQueryPercentNum;
                this.repeatSqlQueryCount = model.repeatSqlQueryCount;
                this.repeatSqlQueryPercent = model.repeatSqlQueryPercent;
                this.workspaceId = model.workspaceId;
                this.workspaceName = model.workspaceName;
            } 

            /**
             * <p>The average duration of cache hits.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cacheCostTimeAvg(Double cacheCostTimeAvg) {
                this.cacheCostTimeAvg = cacheCostTimeAvg;
                return this;
            }

            /**
             * <p>The number of cache hits.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cacheQueryCount(Integer cacheQueryCount) {
                this.cacheQueryCount = cacheQueryCount;
                return this;
            }

            /**
             * <p>The average query duration associated with the SQL pattern.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder costTimeAvg(Double costTimeAvg) {
                this.costTimeAvg = costTimeAvg;
                return this;
            }

            /**
             * <p>The dataset ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3e45b61a-9ba8-4c7c-8248-8dbe69945636</p>
             */
            public Builder cubeId(String cubeId) {
                this.cubeId = cubeId;
                return this;
            }

            /**
             * <p>The name of the dataset.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder cubeName(String cubeName) {
                this.cubeName = cubeName;
                return this;
            }

            /**
             * <p>The number of queries.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder queryCount(Integer queryCount) {
                this.queryCount = queryCount;
                return this;
            }

            /**
             * <p>The average number of queries.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder queryCountAvg(Double queryCountAvg) {
                this.queryCountAvg = queryCountAvg;
                return this;
            }

            /**
             * <p>The percentage of the number of queries that exceed the 5S.</p>
             * 
             * <strong>example:</strong>
             * <p>0.1</p>
             */
            public Builder queryOverFivePercentNum(Double queryOverFivePercentNum) {
                this.queryOverFivePercentNum = queryOverFivePercentNum;
                return this;
            }

            /**
             * <p>Query the proportion of more than 5S.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder queryOverFiveSecPercent(String queryOverFiveSecPercent) {
                this.queryOverFiveSecPercent = queryOverFiveSecPercent;
                return this;
            }

            /**
             * <p>The percentage of queries that exceed 10s.</p>
             * 
             * <strong>example:</strong>
             * <p>0.1</p>
             */
            public Builder queryOverTenSecPercent(String queryOverTenSecPercent) {
                this.queryOverTenSecPercent = queryOverTenSecPercent;
                return this;
            }

            /**
             * <p>The percentage of queries that exceed 10s.</p>
             * 
             * <strong>example:</strong>
             * <p>0.3</p>
             */
            public Builder queryOverTenSecPercentNum(Double queryOverTenSecPercentNum) {
                this.queryOverTenSecPercentNum = queryOverTenSecPercentNum;
                return this;
            }

            /**
             * <p>The number of times that the chart query times out.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder queryTimeoutCount(Integer queryTimeoutCount) {
                this.queryTimeoutCount = queryTimeoutCount;
                return this;
            }

            /**
             * <p>The percentage of timeout times for chart queries.</p>
             * 
             * <strong>example:</strong>
             * <p>0.3</p>
             */
            public Builder queryTimeoutCountPercent(Double queryTimeoutCountPercent) {
                this.queryTimeoutCountPercent = queryTimeoutCountPercent;
                return this;
            }

            /**
             * <p>The average time consumed by the Quick engine query.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder quickIndexCostTimeAvg(Double quickIndexCostTimeAvg) {
                this.quickIndexCostTimeAvg = quickIndexCostTimeAvg;
                return this;
            }

            /**
             * <p>The number of times that the Quick engine is hit.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder quickIndexQueryCount(Integer quickIndexQueryCount) {
                this.quickIndexQueryCount = quickIndexQueryCount;
                return this;
            }

            /**
             * <p>The proportion of duplicate queries.</p>
             * 
             * <strong>example:</strong>
             * <p>0.1</p>
             */
            public Builder repeatQueryPercent(String repeatQueryPercent) {
                this.repeatQueryPercent = repeatQueryPercent;
                return this;
            }

            /**
             * <p>The number of duplicate queries.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder repeatQueryPercentNum(Double repeatQueryPercentNum) {
                this.repeatQueryPercentNum = repeatQueryPercentNum;
                return this;
            }

            /**
             * <p>The number of times the query is repeated.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder repeatSqlQueryCount(Integer repeatSqlQueryCount) {
                this.repeatSqlQueryCount = repeatSqlQueryCount;
                return this;
            }

            /**
             * <p>The proportion of duplicate queries.</p>
             * 
             * <strong>example:</strong>
             * <p>0.3</p>
             */
            public Builder repeatSqlQueryPercent(String repeatSqlQueryPercent) {
                this.repeatSqlQueryPercent = repeatSqlQueryPercent;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>6ea74bff-c818-4188-b462-dbb45a24dbac</p>
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            /**
             * <p>The name of the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>eco0sh0prods</p>
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
    /**
     * 
     * {@link QueryCubeOptimizationResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCubeOptimizationResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdviceType")
        private String adviceType;

        @com.aliyun.core.annotation.NameInMap("CubePerformanceDiagnoseModel")
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

            private Builder() {
            } 

            private Builder(Result model) {
                this.adviceType = model.adviceType;
                this.cubePerformanceDiagnoseModel = model.cubePerformanceDiagnoseModel;
            } 

            /**
             * <p>The type of the suggestion. Valid values:</p>
             * <ul>
             * <li><strong>OPEN_CACHE</strong>: Open cache.</li>
             * <li><strong>OPEN_QUICK_ENGINE</strong>: Open FAST Cache.</li>
             * <li><strong>INCREASE_CACHE_TIME</strong>: Increase the cache time.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OPENQUICKENGINE</p>
             */
            public Builder adviceType(String adviceType) {
                this.adviceType = adviceType;
                return this;
            }

            /**
             * <p>The diagnostic information about the dataset.</p>
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
