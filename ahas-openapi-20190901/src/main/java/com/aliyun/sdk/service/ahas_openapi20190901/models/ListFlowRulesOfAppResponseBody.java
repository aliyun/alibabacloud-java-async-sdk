// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFlowRulesOfAppResponseBody} extends {@link TeaModel}
 *
 * <p>ListFlowRulesOfAppResponseBody</p>
 */
public class ListFlowRulesOfAppResponseBody extends TeaModel {
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

    private ListFlowRulesOfAppResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFlowRulesOfAppResponseBody create() {
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

        public ListFlowRulesOfAppResponseBody build() {
            return new ListFlowRulesOfAppResponseBody(this);
        } 

    } 

    public static class Datas extends TeaModel {
        @NameInMap("AppName")
        private String appName;

        @NameInMap("ClusterEstimatedMaxQps")
        private Float clusterEstimatedMaxQps;

        @NameInMap("ClusterFallbackStrategy")
        private Integer clusterFallbackStrategy;

        @NameInMap("ClusterFallbackThreshold")
        private Integer clusterFallbackThreshold;

        @NameInMap("ClusterMode")
        private Boolean clusterMode;

        @NameInMap("ClusterThresholdType")
        private Integer clusterThresholdType;

        @NameInMap("ControlBehavior")
        private Integer controlBehavior;

        @NameInMap("Enable")
        private Boolean enable;

        @NameInMap("LimitOrigin")
        private String limitOrigin;

        @NameInMap("MaxQueueingTimeMs")
        private Integer maxQueueingTimeMs;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("RefResource")
        private String refResource;

        @NameInMap("RelationStrategy")
        private Integer relationStrategy;

        @NameInMap("Resource")
        private String resource;

        @NameInMap("RuleId")
        private Long ruleId;

        @NameInMap("StatDurationMs")
        private Integer statDurationMs;

        @NameInMap("Threshold")
        private Float threshold;

        @NameInMap("WarmUpPeriodSec")
        private Integer warmUpPeriodSec;

        private Datas(Builder builder) {
            this.appName = builder.appName;
            this.clusterEstimatedMaxQps = builder.clusterEstimatedMaxQps;
            this.clusterFallbackStrategy = builder.clusterFallbackStrategy;
            this.clusterFallbackThreshold = builder.clusterFallbackThreshold;
            this.clusterMode = builder.clusterMode;
            this.clusterThresholdType = builder.clusterThresholdType;
            this.controlBehavior = builder.controlBehavior;
            this.enable = builder.enable;
            this.limitOrigin = builder.limitOrigin;
            this.maxQueueingTimeMs = builder.maxQueueingTimeMs;
            this.namespace = builder.namespace;
            this.refResource = builder.refResource;
            this.relationStrategy = builder.relationStrategy;
            this.resource = builder.resource;
            this.ruleId = builder.ruleId;
            this.statDurationMs = builder.statDurationMs;
            this.threshold = builder.threshold;
            this.warmUpPeriodSec = builder.warmUpPeriodSec;
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
         * @return clusterEstimatedMaxQps
         */
        public Float getClusterEstimatedMaxQps() {
            return this.clusterEstimatedMaxQps;
        }

        /**
         * @return clusterFallbackStrategy
         */
        public Integer getClusterFallbackStrategy() {
            return this.clusterFallbackStrategy;
        }

        /**
         * @return clusterFallbackThreshold
         */
        public Integer getClusterFallbackThreshold() {
            return this.clusterFallbackThreshold;
        }

        /**
         * @return clusterMode
         */
        public Boolean getClusterMode() {
            return this.clusterMode;
        }

        /**
         * @return clusterThresholdType
         */
        public Integer getClusterThresholdType() {
            return this.clusterThresholdType;
        }

        /**
         * @return controlBehavior
         */
        public Integer getControlBehavior() {
            return this.controlBehavior;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return limitOrigin
         */
        public String getLimitOrigin() {
            return this.limitOrigin;
        }

        /**
         * @return maxQueueingTimeMs
         */
        public Integer getMaxQueueingTimeMs() {
            return this.maxQueueingTimeMs;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return refResource
         */
        public String getRefResource() {
            return this.refResource;
        }

        /**
         * @return relationStrategy
         */
        public Integer getRelationStrategy() {
            return this.relationStrategy;
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
         * @return statDurationMs
         */
        public Integer getStatDurationMs() {
            return this.statDurationMs;
        }

        /**
         * @return threshold
         */
        public Float getThreshold() {
            return this.threshold;
        }

        /**
         * @return warmUpPeriodSec
         */
        public Integer getWarmUpPeriodSec() {
            return this.warmUpPeriodSec;
        }

        public static final class Builder {
            private String appName; 
            private Float clusterEstimatedMaxQps; 
            private Integer clusterFallbackStrategy; 
            private Integer clusterFallbackThreshold; 
            private Boolean clusterMode; 
            private Integer clusterThresholdType; 
            private Integer controlBehavior; 
            private Boolean enable; 
            private String limitOrigin; 
            private Integer maxQueueingTimeMs; 
            private String namespace; 
            private String refResource; 
            private Integer relationStrategy; 
            private String resource; 
            private Long ruleId; 
            private Integer statDurationMs; 
            private Float threshold; 
            private Integer warmUpPeriodSec; 

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * ClusterEstimatedMaxQps.
             */
            public Builder clusterEstimatedMaxQps(Float clusterEstimatedMaxQps) {
                this.clusterEstimatedMaxQps = clusterEstimatedMaxQps;
                return this;
            }

            /**
             * ClusterFallbackStrategy.
             */
            public Builder clusterFallbackStrategy(Integer clusterFallbackStrategy) {
                this.clusterFallbackStrategy = clusterFallbackStrategy;
                return this;
            }

            /**
             * ClusterFallbackThreshold.
             */
            public Builder clusterFallbackThreshold(Integer clusterFallbackThreshold) {
                this.clusterFallbackThreshold = clusterFallbackThreshold;
                return this;
            }

            /**
             * ClusterMode.
             */
            public Builder clusterMode(Boolean clusterMode) {
                this.clusterMode = clusterMode;
                return this;
            }

            /**
             * ClusterThresholdType.
             */
            public Builder clusterThresholdType(Integer clusterThresholdType) {
                this.clusterThresholdType = clusterThresholdType;
                return this;
            }

            /**
             * ControlBehavior.
             */
            public Builder controlBehavior(Integer controlBehavior) {
                this.controlBehavior = controlBehavior;
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
             * LimitOrigin.
             */
            public Builder limitOrigin(String limitOrigin) {
                this.limitOrigin = limitOrigin;
                return this;
            }

            /**
             * MaxQueueingTimeMs.
             */
            public Builder maxQueueingTimeMs(Integer maxQueueingTimeMs) {
                this.maxQueueingTimeMs = maxQueueingTimeMs;
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
             * RefResource.
             */
            public Builder refResource(String refResource) {
                this.refResource = refResource;
                return this;
            }

            /**
             * RelationStrategy.
             */
            public Builder relationStrategy(Integer relationStrategy) {
                this.relationStrategy = relationStrategy;
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
             * StatDurationMs.
             */
            public Builder statDurationMs(Integer statDurationMs) {
                this.statDurationMs = statDurationMs;
                return this;
            }

            /**
             * Threshold.
             */
            public Builder threshold(Float threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * WarmUpPeriodSec.
             */
            public Builder warmUpPeriodSec(Integer warmUpPeriodSec) {
                this.warmUpPeriodSec = warmUpPeriodSec;
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
