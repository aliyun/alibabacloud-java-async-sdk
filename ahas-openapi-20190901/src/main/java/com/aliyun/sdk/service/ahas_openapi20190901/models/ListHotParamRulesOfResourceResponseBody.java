// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHotParamRulesOfResourceResponseBody} extends {@link TeaModel}
 *
 * <p>ListHotParamRulesOfResourceResponseBody</p>
 */
public class ListHotParamRulesOfResourceResponseBody extends TeaModel {
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

    private ListHotParamRulesOfResourceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHotParamRulesOfResourceResponseBody create() {
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

        public ListHotParamRulesOfResourceResponseBody build() {
            return new ListHotParamRulesOfResourceResponseBody(this);
        } 

    } 

    public static class ParamFlowItemList extends TeaModel {
        @NameInMap("ItemType")
        private String itemType;

        @NameInMap("ItemValue")
        private String itemValue;

        @NameInMap("Threshold")
        private Float threshold;

        private ParamFlowItemList(Builder builder) {
            this.itemType = builder.itemType;
            this.itemValue = builder.itemValue;
            this.threshold = builder.threshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParamFlowItemList create() {
            return builder().build();
        }

        /**
         * @return itemType
         */
        public String getItemType() {
            return this.itemType;
        }

        /**
         * @return itemValue
         */
        public String getItemValue() {
            return this.itemValue;
        }

        /**
         * @return threshold
         */
        public Float getThreshold() {
            return this.threshold;
        }

        public static final class Builder {
            private String itemType; 
            private String itemValue; 
            private Float threshold; 

            /**
             * ItemType.
             */
            public Builder itemType(String itemType) {
                this.itemType = itemType;
                return this;
            }

            /**
             * ItemValue.
             */
            public Builder itemValue(String itemValue) {
                this.itemValue = itemValue;
                return this;
            }

            /**
             * Threshold.
             */
            public Builder threshold(Float threshold) {
                this.threshold = threshold;
                return this;
            }

            public ParamFlowItemList build() {
                return new ParamFlowItemList(this);
            } 

        } 

    }
    public static class Datas extends TeaModel {
        @NameInMap("AppName")
        private String appName;

        @NameInMap("BurstCount")
        private Integer burstCount;

        @NameInMap("ControlBehavior")
        private Integer controlBehavior;

        @NameInMap("Enable")
        private Boolean enable;

        @NameInMap("MaxQueueingTimeMs")
        private Integer maxQueueingTimeMs;

        @NameInMap("MetricType")
        private Integer metricType;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("ParamFlowItemList")
        private java.util.List < ParamFlowItemList> paramFlowItemList;

        @NameInMap("ParamIdx")
        private Integer paramIdx;

        @NameInMap("Resource")
        private String resource;

        @NameInMap("RuleId")
        private Long ruleId;

        @NameInMap("StatDurationSec")
        private Long statDurationSec;

        @NameInMap("Threshold")
        private Float threshold;

        private Datas(Builder builder) {
            this.appName = builder.appName;
            this.burstCount = builder.burstCount;
            this.controlBehavior = builder.controlBehavior;
            this.enable = builder.enable;
            this.maxQueueingTimeMs = builder.maxQueueingTimeMs;
            this.metricType = builder.metricType;
            this.namespace = builder.namespace;
            this.paramFlowItemList = builder.paramFlowItemList;
            this.paramIdx = builder.paramIdx;
            this.resource = builder.resource;
            this.ruleId = builder.ruleId;
            this.statDurationSec = builder.statDurationSec;
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
         * @return burstCount
         */
        public Integer getBurstCount() {
            return this.burstCount;
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
         * @return maxQueueingTimeMs
         */
        public Integer getMaxQueueingTimeMs() {
            return this.maxQueueingTimeMs;
        }

        /**
         * @return metricType
         */
        public Integer getMetricType() {
            return this.metricType;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return paramFlowItemList
         */
        public java.util.List < ParamFlowItemList> getParamFlowItemList() {
            return this.paramFlowItemList;
        }

        /**
         * @return paramIdx
         */
        public Integer getParamIdx() {
            return this.paramIdx;
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
         * @return statDurationSec
         */
        public Long getStatDurationSec() {
            return this.statDurationSec;
        }

        /**
         * @return threshold
         */
        public Float getThreshold() {
            return this.threshold;
        }

        public static final class Builder {
            private String appName; 
            private Integer burstCount; 
            private Integer controlBehavior; 
            private Boolean enable; 
            private Integer maxQueueingTimeMs; 
            private Integer metricType; 
            private String namespace; 
            private java.util.List < ParamFlowItemList> paramFlowItemList; 
            private Integer paramIdx; 
            private String resource; 
            private Long ruleId; 
            private Long statDurationSec; 
            private Float threshold; 

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * BurstCount.
             */
            public Builder burstCount(Integer burstCount) {
                this.burstCount = burstCount;
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
             * MaxQueueingTimeMs.
             */
            public Builder maxQueueingTimeMs(Integer maxQueueingTimeMs) {
                this.maxQueueingTimeMs = maxQueueingTimeMs;
                return this;
            }

            /**
             * MetricType.
             */
            public Builder metricType(Integer metricType) {
                this.metricType = metricType;
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
             * ParamFlowItemList.
             */
            public Builder paramFlowItemList(java.util.List < ParamFlowItemList> paramFlowItemList) {
                this.paramFlowItemList = paramFlowItemList;
                return this;
            }

            /**
             * ParamIdx.
             */
            public Builder paramIdx(Integer paramIdx) {
                this.paramIdx = paramIdx;
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
             * StatDurationSec.
             */
            public Builder statDurationSec(Long statDurationSec) {
                this.statDurationSec = statDurationSec;
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
