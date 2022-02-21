// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAIPlanResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAIPlanResponseBody</p>
 */
public class QueryAIPlanResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryAIPlanResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAIPlanResponseBody create() {
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private String errorMessage; 
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
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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

        public QueryAIPlanResponseBody build() {
            return new QueryAIPlanResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("Description")
        private String description;

        @NameInMap("IntervalTiming")
        private Integer intervalTiming;

        @NameInMap("PlanId")
        private String planId;

        @NameInMap("PlanTemplateId")
        private String planTemplateId;

        @NameInMap("PreTiming")
        private Long preTiming;

        @NameInMap("TriggerEnum")
        private Integer triggerEnum;

        private List(Builder builder) {
            this.appId = builder.appId;
            this.description = builder.description;
            this.intervalTiming = builder.intervalTiming;
            this.planId = builder.planId;
            this.planTemplateId = builder.planTemplateId;
            this.preTiming = builder.preTiming;
            this.triggerEnum = builder.triggerEnum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return intervalTiming
         */
        public Integer getIntervalTiming() {
            return this.intervalTiming;
        }

        /**
         * @return planId
         */
        public String getPlanId() {
            return this.planId;
        }

        /**
         * @return planTemplateId
         */
        public String getPlanTemplateId() {
            return this.planTemplateId;
        }

        /**
         * @return preTiming
         */
        public Long getPreTiming() {
            return this.preTiming;
        }

        /**
         * @return triggerEnum
         */
        public Integer getTriggerEnum() {
            return this.triggerEnum;
        }

        public static final class Builder {
            private String appId; 
            private String description; 
            private Integer intervalTiming; 
            private String planId; 
            private String planTemplateId; 
            private Long preTiming; 
            private Integer triggerEnum; 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * IntervalTiming.
             */
            public Builder intervalTiming(Integer intervalTiming) {
                this.intervalTiming = intervalTiming;
                return this;
            }

            /**
             * PlanId.
             */
            public Builder planId(String planId) {
                this.planId = planId;
                return this;
            }

            /**
             * PlanTemplateId.
             */
            public Builder planTemplateId(String planTemplateId) {
                this.planTemplateId = planTemplateId;
                return this;
            }

            /**
             * PreTiming.
             */
            public Builder preTiming(Long preTiming) {
                this.preTiming = preTiming;
                return this;
            }

            /**
             * TriggerEnum.
             */
            public Builder triggerEnum(Integer triggerEnum) {
                this.triggerEnum = triggerEnum;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("List")
        private java.util.List < List> list;

        @NameInMap("PageCount")
        private Integer pageCount;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.currentPage = builder.currentPage;
            this.list = builder.list;
            this.pageCount = builder.pageCount;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return pageCount
         */
        public Integer getPageCount() {
            return this.pageCount;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer currentPage; 
            private java.util.List < List> list; 
            private Integer pageCount; 
            private Integer pageSize; 
            private Long total; 

            /**
             * CurrentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * PageCount.
             */
            public Builder pageCount(Integer pageCount) {
                this.pageCount = pageCount;
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
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
