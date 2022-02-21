// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiagnoseReportResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiagnoseReportResponseBody</p>
 */
public class DescribeDiagnoseReportResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private DescribeDiagnoseReportResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiagnoseReportResponseBody create() {
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

    public static final class Builder {
        private String requestId; 
        private Result result; 

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

        public DescribeDiagnoseReportResponseBody build() {
            return new DescribeDiagnoseReportResponseBody(this);
        } 

    } 

    public static class Detail extends TeaModel {
        @NameInMap("desc")
        private String desc;

        @NameInMap("name")
        private String name;

        @NameInMap("result")
        private String result;

        @NameInMap("suggest")
        private String suggest;

        @NameInMap("type")
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
             * desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * result.
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
             * type.
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
        @NameInMap("detail")
        private Detail detail;

        @NameInMap("health")
        private String health;

        @NameInMap("item")
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
             * detail.
             */
            public Builder detail(Detail detail) {
                this.detail = detail;
                return this;
            }

            /**
             * health.
             */
            public Builder health(String health) {
                this.health = health;
                return this;
            }

            /**
             * item.
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
        @NameInMap("createTime")
        private Long createTime;

        @NameInMap("diagnoseItems")
        private java.util.List < DiagnoseItems> diagnoseItems;

        @NameInMap("health")
        private String health;

        @NameInMap("instanceId")
        private String instanceId;

        @NameInMap("reportId")
        private String reportId;

        @NameInMap("state")
        private String state;

        @NameInMap("trigger")
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
             * createTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * diagnoseItems.
             */
            public Builder diagnoseItems(java.util.List < DiagnoseItems> diagnoseItems) {
                this.diagnoseItems = diagnoseItems;
                return this;
            }

            /**
             * health.
             */
            public Builder health(String health) {
                this.health = health;
                return this;
            }

            /**
             * instanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * reportId.
             */
            public Builder reportId(String reportId) {
                this.reportId = reportId;
                return this;
            }

            /**
             * state.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * trigger.
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
