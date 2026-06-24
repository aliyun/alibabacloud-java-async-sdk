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
 * {@link DiagnoseInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DiagnoseInstanceResponseBody</p>
 */
public class DiagnoseInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private DiagnoseInstanceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DiagnoseInstanceResponseBody create() {
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

        private Builder(DiagnoseInstanceResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The ID of the report.</p>
         * 
         * <strong>example:</strong>
         * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1D***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The diagnosis status. Valid values: Supported: SUCCESS, FAILED, and RUNNING.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public DiagnoseInstanceResponseBody build() {
            return new DiagnoseInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DiagnoseInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DiagnoseInstanceResponseBody</p>
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
     * {@link DiagnoseInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DiagnoseInstanceResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("diagnosisMode")
        private String diagnosisMode;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("reportId")
        private String reportId;

        @com.aliyun.core.annotation.NameInMap("state")
        private String state;

        private Result(Builder builder) {
            this.createTime = builder.createTime;
            this.diagnosisMode = builder.diagnosisMode;
            this.instanceId = builder.instanceId;
            this.items = builder.items;
            this.reportId = builder.reportId;
            this.state = builder.state;
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
         * @return diagnosisMode
         */
        public String getDiagnosisMode() {
            return this.diagnosisMode;
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

        public static final class Builder {
            private Long createTime; 
            private String diagnosisMode; 
            private String instanceId; 
            private java.util.List<Items> items; 
            private String reportId; 
            private String state; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.createTime = model.createTime;
                this.diagnosisMode = model.diagnosisMode;
                this.instanceId = model.instanceId;
                this.items = model.items;
                this.reportId = model.reportId;
                this.state = model.state;
            } 

            /**
             * <p>The ID of the diagnostic instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1535745731000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
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

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
