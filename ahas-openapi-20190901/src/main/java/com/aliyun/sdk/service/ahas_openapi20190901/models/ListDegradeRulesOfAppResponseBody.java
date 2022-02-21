// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDegradeRulesOfAppResponseBody} extends {@link TeaModel}
 *
 * <p>ListDegradeRulesOfAppResponseBody</p>
 */
public class ListDegradeRulesOfAppResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListDegradeRulesOfAppResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDegradeRulesOfAppResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListDegradeRulesOfAppResponseBody build() {
            return new ListDegradeRulesOfAppResponseBody(this);
        } 

    } 

    public static class Datas extends TeaModel {
        @NameInMap("AppName")
        private String appName;

        @NameInMap("Enable")
        private Boolean enable;

        @NameInMap("HalfOpenBaseAmountPerStep")
        private Integer halfOpenBaseAmountPerStep;

        @NameInMap("HalfOpenRecoveryStepNum")
        private Integer halfOpenRecoveryStepNum;

        @NameInMap("MinRequestAmount")
        private Integer minRequestAmount;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("RecoveryTimeoutMs")
        private Integer recoveryTimeoutMs;

        @NameInMap("Resource")
        private String resource;

        @NameInMap("RuleId")
        private Long ruleId;

        @NameInMap("SlowRtMs")
        private Integer slowRtMs;

        @NameInMap("StatDurationMs")
        private Integer statDurationMs;

        @NameInMap("Strategy")
        private Integer strategy;

        @NameInMap("Threshold")
        private Float threshold;

        private Datas(Builder builder) {
            this.appName = builder.appName;
            this.enable = builder.enable;
            this.halfOpenBaseAmountPerStep = builder.halfOpenBaseAmountPerStep;
            this.halfOpenRecoveryStepNum = builder.halfOpenRecoveryStepNum;
            this.minRequestAmount = builder.minRequestAmount;
            this.namespace = builder.namespace;
            this.recoveryTimeoutMs = builder.recoveryTimeoutMs;
            this.resource = builder.resource;
            this.ruleId = builder.ruleId;
            this.slowRtMs = builder.slowRtMs;
            this.statDurationMs = builder.statDurationMs;
            this.strategy = builder.strategy;
            this.threshold = builder.threshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Datas create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return halfOpenBaseAmountPerStep
         */
        public Integer getHalfOpenBaseAmountPerStep() {
            return this.halfOpenBaseAmountPerStep;
        }

        /**
         * @return halfOpenRecoveryStepNum
         */
        public Integer getHalfOpenRecoveryStepNum() {
            return this.halfOpenRecoveryStepNum;
        }

        /**
         * @return minRequestAmount
         */
        public Integer getMinRequestAmount() {
            return this.minRequestAmount;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return recoveryTimeoutMs
         */
        public Integer getRecoveryTimeoutMs() {
            return this.recoveryTimeoutMs;
        }

        /**
         * @return resource
         */
        public String getResource() {
            return this.resource;
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        /**
         * @return slowRtMs
         */
        public Integer getSlowRtMs() {
            return this.slowRtMs;
        }

        /**
         * @return statDurationMs
         */
        public Integer getStatDurationMs() {
            return this.statDurationMs;
        }

        /**
         * @return strategy
         */
        public Integer getStrategy() {
            return this.strategy;
        }

        /**
         * @return threshold
         */
        public Float getThreshold() {
            return this.threshold;
        }

        public static final class Builder {
            private String appName; 
            private Boolean enable; 
            private Integer halfOpenBaseAmountPerStep; 
            private Integer halfOpenRecoveryStepNum; 
            private Integer minRequestAmount; 
            private String namespace; 
            private Integer recoveryTimeoutMs; 
            private String resource; 
            private Long ruleId; 
            private Integer slowRtMs; 
            private Integer statDurationMs; 
            private Integer strategy; 
            private Float threshold; 

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * HalfOpenBaseAmountPerStep.
             */
            public Builder halfOpenBaseAmountPerStep(Integer halfOpenBaseAmountPerStep) {
                this.halfOpenBaseAmountPerStep = halfOpenBaseAmountPerStep;
                return this;
            }

            /**
             * HalfOpenRecoveryStepNum.
             */
            public Builder halfOpenRecoveryStepNum(Integer halfOpenRecoveryStepNum) {
                this.halfOpenRecoveryStepNum = halfOpenRecoveryStepNum;
                return this;
            }

            /**
             * MinRequestAmount.
             */
            public Builder minRequestAmount(Integer minRequestAmount) {
                this.minRequestAmount = minRequestAmount;
                return this;
            }

            /**
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * RecoveryTimeoutMs.
             */
            public Builder recoveryTimeoutMs(Integer recoveryTimeoutMs) {
                this.recoveryTimeoutMs = recoveryTimeoutMs;
                return this;
            }

            /**
             * Resource.
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * SlowRtMs.
             */
            public Builder slowRtMs(Integer slowRtMs) {
                this.slowRtMs = slowRtMs;
                return this;
            }

            /**
             * StatDurationMs.
             */
            public Builder statDurationMs(Integer statDurationMs) {
                this.statDurationMs = statDurationMs;
                return this;
            }

            /**
             * Strategy.
             */
            public Builder strategy(Integer strategy) {
                this.strategy = strategy;
                return this;
            }

            /**
             * Threshold.
             */
            public Builder threshold(Float threshold) {
                this.threshold = threshold;
                return this;
            }

            public Datas build() {
                return new Datas(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Datas")
        private java.util.List < Datas> datas;

        @NameInMap("PageIndex")
        private Integer pageIndex;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        @NameInMap("TotalPage")
        private Integer totalPage;

        private Data(Builder builder) {
            this.datas = builder.datas;
            this.pageIndex = builder.pageIndex;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
            this.totalPage = builder.totalPage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return datas
         */
        public java.util.List < Datas> getDatas() {
            return this.datas;
        }

        /**
         * @return pageIndex
         */
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return totalPage
         */
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public static final class Builder {
            private java.util.List < Datas> datas; 
            private Integer pageIndex; 
            private Integer pageSize; 
            private Integer totalCount; 
            private Integer totalPage; 

            /**
             * Datas.
             */
            public Builder datas(java.util.List < Datas> datas) {
                this.datas = datas;
                return this;
            }

            /**
             * PageIndex.
             */
            public Builder pageIndex(Integer pageIndex) {
                this.pageIndex = pageIndex;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * TotalPage.
             */
            public Builder totalPage(Integer totalPage) {
                this.totalPage = totalPage;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
