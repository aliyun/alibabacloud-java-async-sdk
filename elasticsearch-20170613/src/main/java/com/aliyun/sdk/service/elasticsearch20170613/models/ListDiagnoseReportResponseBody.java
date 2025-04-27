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
    private java.util.List<Result> result;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private Headers headers; 
        private String requestId; 
        private java.util.List<Result> result; 

        private Builder() {
        } 

        private Builder(ListDiagnoseReportResponseBody model) {
            this.headers = model.headers;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The total number of entries returned.</p>
         */
        public Builder headers(Headers headers) {
            this.headers = headers;
            return this;
        }

        /**
         * <p>The header of the response.</p>
         * 
         * <strong>example:</strong>
         * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The trigger mode of health diagnostics. Valid values:</p>
         * <ul>
         * <li>SYSTEM: The system is automatically triggered.</li>
         * <li>INNER: internal trigger</li>
         * <li>USER: manually triggered by the user</li>
         * </ul>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        public ListDiagnoseReportResponseBody build() {
            return new ListDiagnoseReportResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDiagnoseReportResponseBody} extends {@link TeaModel}
     *
     * <p>ListDiagnoseReportResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Headers model) {
                this.xTotalCount = model.xTotalCount;
            } 

            /**
             * <p>The returned results.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
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
    /**
     * 
     * {@link ListDiagnoseReportResponseBody} extends {@link TeaModel}
     *
     * <p>ListDiagnoseReportResponseBody</p>
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
             * <p>The diagnosis.</p>
             * 
             * <strong>example:</strong>
             * <p>Check whether the number of replica shards is optimal and easy to maintain</p>
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * <p>The description of the diagnostic item.</p>
             * 
             * <strong>example:</strong>
             * <p>Number of Replica Shards</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The suggestion for the diagnosis.</p>
             * 
             * <strong>example:</strong>
             * <p>You may need to adjust the numbers of replica shards of some indices as follows:  [geoname08 : 0 -&gt; 1][geoname09 : 0 -&gt; 1][geonametest01 : 0 -&gt; 1]</p>
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
             * <p>The full name of the diagnostic item.</p>
             * 
             * <strong>example:</strong>
             * <p>ES_API</p>
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
     * {@link ListDiagnoseReportResponseBody} extends {@link TeaModel}
     *
     * <p>ListDiagnoseReportResponseBody</p>
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
             * <p>The type of the diagnostic result. Valid values:</p>
             * <ul>
             * <li>TEXT: text description</li>
             * <li>CONSOLE_API: console-triggered</li>
             * <li>ES_API: API triggered</li>
             * </ul>
             */
            public Builder detail(Detail detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The details of the diagnostic item.</p>
             * 
             * <strong>example:</strong>
             * <p>YELLOW</p>
             */
            public Builder health(String health) {
                this.health = health;
                return this;
            }

            /**
             * <p>The health of the diagnostic item. Supported: GREEN, YELLOW, RED, and UNKNOWN.</p>
             * 
             * <strong>example:</strong>
             * <p>IndexAliasUseDiagnostic</p>
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
     * {@link ListDiagnoseReportResponseBody} extends {@link TeaModel}
     *
     * <p>ListDiagnoseReportResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("diagnoseItems")
        private java.util.List<DiagnoseItems> diagnoseItems;

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
        public java.util.List<DiagnoseItems> getDiagnoseItems() {
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
            private java.util.List<DiagnoseItems> diagnoseItems; 
            private String health; 
            private String instanceId; 
            private String reportId; 
            private String state; 
            private String trigger; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.createTime = model.createTime;
                this.diagnoseItems = model.diagnoseItems;
                this.health = model.health;
                this.instanceId = model.instanceId;
                this.reportId = model.reportId;
                this.state = model.state;
                this.trigger = model.trigger;
            } 

            /**
             * <p>The ID of the report.</p>
             * 
             * <strong>example:</strong>
             * <p>1535745731000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The name of the item.</p>
             */
            public Builder diagnoseItems(java.util.List<DiagnoseItems> diagnoseItems) {
                this.diagnoseItems = diagnoseItems;
                return this;
            }

            /**
             * <p>Reports the list of diagnostic item information.</p>
             * 
             * <strong>example:</strong>
             * <p>YELLOW</p>
             */
            public Builder health(String health) {
                this.health = health;
                return this;
            }

            /**
             * <p>The overall health of the cluster in the report. Supported: GREEN, YELLOW, RED, and UNKNOWN.</p>
             * 
             * <strong>example:</strong>
             * <p>es-cn-abc</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The diagnosis status. Valid values: Supported: SUCCESS, FAILED, and RUNNING.</p>
             * 
             * <strong>example:</strong>
             * <p>trigger__2020-08-17T17:09:02f</p>
             */
            public Builder reportId(String reportId) {
                this.reportId = reportId;
                return this;
            }

            /**
             * <p>The ID of the instance for diagnosis.</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The timestamp when the report was created.</p>
             * 
             * <strong>example:</strong>
             * <p>USER</p>
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
