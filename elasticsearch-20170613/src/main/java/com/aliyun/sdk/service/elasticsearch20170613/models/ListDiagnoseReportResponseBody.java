// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDiagnoseReportResponseBody} extends {@link TeaModel}
 *
 * <p>ListDiagnoseReportResponseBody</p>
 */
public class ListDiagnoseReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Headers")
    private Headers headers;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List < Result> result;

    private ListDiagnoseReportResponseBody(Builder builder) {
        this.headers = builder.headers;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDiagnoseReportResponseBody create() {
        return builder().build();
    }

    /**
     * @return headers
     */
    public Headers getHeaders() {
        return this.headers;
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

    public static final class Builder {
        private Headers headers; 
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * The total number of entries returned.
         */
        public Builder headers(Headers headers) {
            this.headers = headers;
            return this;
        }

        /**
         * The header of the response.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The trigger mode of health diagnostics. Valid values:
         * <p>
         * 
         * *   SYSTEM: The system is automatically triggered.
         * *   INNER: internal trigger
         * *   USER: manually triggered by the user
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListDiagnoseReportResponseBody build() {
            return new ListDiagnoseReportResponseBody(this);
        } 

    } 

    public static class Headers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("X-Total-Count")
        private Integer xTotalCount;

        private Headers(Builder builder) {
            this.xTotalCount = builder.xTotalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Headers create() {
            return builder().build();
        }

        /**
         * @return xTotalCount
         */
        public Integer getXTotalCount() {
            return this.xTotalCount;
        }

        public static final class Builder {
            private Integer xTotalCount; 

            /**
             * The returned results.
             */
            public Builder xTotalCount(Integer xTotalCount) {
                this.xTotalCount = xTotalCount;
                return this;
            }

            public Headers build() {
                return new Headers(this);
            } 

        } 

    }
    public static class Detail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("suggest")
        private String suggest;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Detail(Builder builder) {
            this.desc = builder.desc;
            this.name = builder.name;
            this.result = builder.result;
            this.suggest = builder.suggest;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Detail create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return suggest
         */
        public String getSuggest() {
            return this.suggest;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String desc; 
            private String name; 
            private String result; 
            private String suggest; 
            private String type; 

            /**
             * The diagnosis.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * The description of the diagnostic item.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The suggestion for the diagnosis.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * suggest.
             */
            public Builder suggest(String suggest) {
                this.suggest = suggest;
                return this;
            }

            /**
             * The full name of the diagnostic item.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Detail build() {
                return new Detail(this);
            } 

        } 

    }
    public static class DiagnoseItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("detail")
        private Detail detail;

        @com.aliyun.core.annotation.NameInMap("health")
        private String health;

        @com.aliyun.core.annotation.NameInMap("item")
        private String item;

        private DiagnoseItems(Builder builder) {
            this.detail = builder.detail;
            this.health = builder.health;
            this.item = builder.item;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiagnoseItems create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public Detail getDetail() {
            return this.detail;
        }

        /**
         * @return health
         */
        public String getHealth() {
            return this.health;
        }

        /**
         * @return item
         */
        public String getItem() {
            return this.item;
        }

        public static final class Builder {
            private Detail detail; 
            private String health; 
            private String item; 

            /**
             * The type of the diagnostic result. Valid values:
             * <p>
             * 
             * *   TEXT: text description
             * *   CONSOLE_API: console-triggered
             * *   ES_API: API triggered
             */
            public Builder detail(Detail detail) {
                this.detail = detail;
                return this;
            }

            /**
             * The details of the diagnostic item.
             */
            public Builder health(String health) {
                this.health = health;
                return this;
            }

            /**
             * The health of the diagnostic item. Supported: GREEN, YELLOW, RED, and UNKNOWN.
             */
            public Builder item(String item) {
                this.item = item;
                return this;
            }

            public DiagnoseItems build() {
                return new DiagnoseItems(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("diagnoseItems")
        private java.util.List < DiagnoseItems> diagnoseItems;

        @com.aliyun.core.annotation.NameInMap("health")
        private String health;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("reportId")
        private String reportId;

        @com.aliyun.core.annotation.NameInMap("state")
        private String state;

        @com.aliyun.core.annotation.NameInMap("trigger")
        private String trigger;

        private Result(Builder builder) {
            this.createTime = builder.createTime;
            this.diagnoseItems = builder.diagnoseItems;
            this.health = builder.health;
            this.instanceId = builder.instanceId;
            this.reportId = builder.reportId;
            this.state = builder.state;
            this.trigger = builder.trigger;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return diagnoseItems
         */
        public java.util.List < DiagnoseItems> getDiagnoseItems() {
            return this.diagnoseItems;
        }

        /**
         * @return health
         */
        public String getHealth() {
            return this.health;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return reportId
         */
        public String getReportId() {
            return this.reportId;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return trigger
         */
        public String getTrigger() {
            return this.trigger;
        }

        public static final class Builder {
            private Long createTime; 
            private java.util.List < DiagnoseItems> diagnoseItems; 
            private String health; 
            private String instanceId; 
            private String reportId; 
            private String state; 
            private String trigger; 

            /**
             * The ID of the report.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The name of the item.
             */
            public Builder diagnoseItems(java.util.List < DiagnoseItems> diagnoseItems) {
                this.diagnoseItems = diagnoseItems;
                return this;
            }

            /**
             * Reports the list of diagnostic item information.
             */
            public Builder health(String health) {
                this.health = health;
                return this;
            }

            /**
             * The overall health of the cluster in the report. Supported: GREEN, YELLOW, RED, and UNKNOWN.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The diagnosis status. Valid values: Supported: SUCCESS, FAILED, and RUNNING.
             */
            public Builder reportId(String reportId) {
                this.reportId = reportId;
                return this;
            }

            /**
             * The ID of the instance for diagnosis.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The timestamp when the report was created.
             */
            public Builder trigger(String trigger) {
                this.trigger = trigger;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
