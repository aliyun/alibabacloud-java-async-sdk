// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link DescribeDiagnoseReportResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiagnoseReportResponseBody</p>
 */
public class DescribeDiagnoseReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
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
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(DescribeDiagnoseReportResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

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

    /**
     * 
     * {@link DescribeDiagnoseReportResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDiagnoseReportResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Detail model) {
                this.desc = model.desc;
                this.name = model.name;
                this.result = model.result;
                this.suggest = model.suggest;
                this.type = model.type;
            } 

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
    /**
     * 
     * {@link DescribeDiagnoseReportResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDiagnoseReportResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(DiagnoseItems model) {
                this.detail = model.detail;
                this.health = model.health;
                this.item = model.item;
            } 

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
    /**
     * 
     * {@link DescribeDiagnoseReportResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDiagnoseReportResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("detail")
        private java.util.Map<String, ?> detail;

        @com.aliyun.core.annotation.NameInMap("item")
        private String item;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("state")
        private String state;

        @com.aliyun.core.annotation.NameInMap("suggest")
        private String suggest;

        private Items(Builder builder) {
            this.desc = builder.desc;
            this.detail = builder.detail;
            this.item = builder.item;
            this.name = builder.name;
            this.state = builder.state;
            this.suggest = builder.suggest;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return detail
         */
        public java.util.Map<String, ?> getDetail() {
            return this.detail;
        }

        /**
         * @return item
         */
        public String getItem() {
            return this.item;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return suggest
         */
        public String getSuggest() {
            return this.suggest;
        }

        public static final class Builder {
            private String desc; 
            private java.util.Map<String, ?> detail; 
            private String item; 
            private String name; 
            private String state; 
            private String suggest; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.desc = model.desc;
                this.detail = model.detail;
                this.item = model.item;
                this.name = model.name;
                this.state = model.state;
                this.suggest = model.suggest;
            } 

            /**
             * desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * detail.
             */
            public Builder detail(java.util.Map<String, ?> detail) {
                this.detail = detail;
                return this;
            }

            /**
             * item.
             */
            public Builder item(String item) {
                this.item = item;
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
             * state.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * suggest.
             */
            public Builder suggest(String suggest) {
                this.suggest = suggest;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDiagnoseReportResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDiagnoseReportResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("diagnoseItems")
        private java.util.List<DiagnoseItems> diagnoseItems;

        @com.aliyun.core.annotation.NameInMap("diagnosisMode")
        private String diagnosisMode;

        @com.aliyun.core.annotation.NameInMap("health")
        private String health;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("reportId")
        private String reportId;

        @com.aliyun.core.annotation.NameInMap("state")
        private String state;

        @com.aliyun.core.annotation.NameInMap("trigger")
        private String trigger;

        private Result(Builder builder) {
            this.createTime = builder.createTime;
            this.diagnoseItems = builder.diagnoseItems;
            this.diagnosisMode = builder.diagnosisMode;
            this.health = builder.health;
            this.instanceId = builder.instanceId;
            this.items = builder.items;
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
        public java.util.List<DiagnoseItems> getDiagnoseItems() {
            return this.diagnoseItems;
        }

        /**
         * @return diagnosisMode
         */
        public String getDiagnosisMode() {
            return this.diagnosisMode;
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
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
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
            private java.util.List<DiagnoseItems> diagnoseItems; 
            private String diagnosisMode; 
            private String health; 
            private String instanceId; 
            private java.util.List<Items> items; 
            private String reportId; 
            private String state; 
            private String trigger; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.createTime = model.createTime;
                this.diagnoseItems = model.diagnoseItems;
                this.diagnosisMode = model.diagnosisMode;
                this.health = model.health;
                this.instanceId = model.instanceId;
                this.items = model.items;
                this.reportId = model.reportId;
                this.state = model.state;
                this.trigger = model.trigger;
            } 

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
            public Builder diagnoseItems(java.util.List<DiagnoseItems> diagnoseItems) {
                this.diagnoseItems = diagnoseItems;
                return this;
            }

            /**
             * diagnosisMode.
             */
            public Builder diagnosisMode(String diagnosisMode) {
                this.diagnosisMode = diagnosisMode;
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
             * items.
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
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
