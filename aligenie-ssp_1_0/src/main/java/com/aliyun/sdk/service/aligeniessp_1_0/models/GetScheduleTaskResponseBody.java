// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0.models;

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
 * {@link GetScheduleTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetScheduleTaskResponseBody</p>
 */
public class GetScheduleTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private GetScheduleTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScheduleTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
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
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(GetScheduleTaskResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>Response code</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Response message</p>
         * 
         * <strong>example:</strong>
         * <p>调用成功</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>F7E21065-6C21-1158-A2F9-AEFE5CAB7C94</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Service response parameters</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetScheduleTaskResponseBody build() {
            return new GetScheduleTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetScheduleTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetScheduleTaskResponseBody</p>
     */
    public static class ActionTopicList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomAction")
        private java.util.Map<String, ?> customAction;

        private ActionTopicList(Builder builder) {
            this.customAction = builder.customAction;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ActionTopicList create() {
            return builder().build();
        }

        /**
         * @return customAction
         */
        public java.util.Map<String, ?> getCustomAction() {
            return this.customAction;
        }

        public static final class Builder {
            private java.util.Map<String, ?> customAction; 

            private Builder() {
            } 

            private Builder(ActionTopicList model) {
                this.customAction = model.customAction;
            } 

            /**
             * <p>Vendor-defined command</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;k1&quot;:&quot;v1&quot;,&quot;k2&quot;:{&quot;key&quot;:1}}</p>
             */
            public Builder customAction(java.util.Map<String, ?> customAction) {
                this.customAction = customAction;
                return this;
            }

            public ActionTopicList build() {
                return new ActionTopicList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetScheduleTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetScheduleTaskResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionTopicList")
        private java.util.List<ActionTopicList> actionTopicList;

        @com.aliyun.core.annotation.NameInMap("Cron")
        private String cron;

        @com.aliyun.core.annotation.NameInMap("ScheduleEndTime")
        private String scheduleEndTime;

        @com.aliyun.core.annotation.NameInMap("ScheduleId")
        private Long scheduleId;

        @com.aliyun.core.annotation.NameInMap("ScheduleStartTime")
        private String scheduleStartTime;

        @com.aliyun.core.annotation.NameInMap("ScheduleType")
        private String scheduleType;

        private Result(Builder builder) {
            this.actionTopicList = builder.actionTopicList;
            this.cron = builder.cron;
            this.scheduleEndTime = builder.scheduleEndTime;
            this.scheduleId = builder.scheduleId;
            this.scheduleStartTime = builder.scheduleStartTime;
            this.scheduleType = builder.scheduleType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return actionTopicList
         */
        public java.util.List<ActionTopicList> getActionTopicList() {
            return this.actionTopicList;
        }

        /**
         * @return cron
         */
        public String getCron() {
            return this.cron;
        }

        /**
         * @return scheduleEndTime
         */
        public String getScheduleEndTime() {
            return this.scheduleEndTime;
        }

        /**
         * @return scheduleId
         */
        public Long getScheduleId() {
            return this.scheduleId;
        }

        /**
         * @return scheduleStartTime
         */
        public String getScheduleStartTime() {
            return this.scheduleStartTime;
        }

        /**
         * @return scheduleType
         */
        public String getScheduleType() {
            return this.scheduleType;
        }

        public static final class Builder {
            private java.util.List<ActionTopicList> actionTopicList; 
            private String cron; 
            private String scheduleEndTime; 
            private Long scheduleId; 
            private String scheduleStartTime; 
            private String scheduleType; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.actionTopicList = model.actionTopicList;
                this.cron = model.cron;
                this.scheduleEndTime = model.scheduleEndTime;
                this.scheduleId = model.scheduleId;
                this.scheduleStartTime = model.scheduleStartTime;
                this.scheduleType = model.scheduleType;
            } 

            /**
             * <p>Trigger behavior</p>
             */
            public Builder actionTopicList(java.util.List<ActionTopicList> actionTopicList) {
                this.actionTopicList = actionTopicList;
                return this;
            }

            /**
             * <p>Trigger Cron Expression</p>
             * 
             * <strong>example:</strong>
             * <p>0 10 20 30 6 ? 2022</p>
             */
            public Builder cron(String cron) {
                this.cron = cron;
                return this;
            }

            /**
             * <p>Validity Period - End Time</p>
             * 
             * <strong>example:</strong>
             * <p>1659169473000</p>
             */
            public Builder scheduleEndTime(String scheduleEndTime) {
                this.scheduleEndTime = scheduleEndTime;
                return this;
            }

            /**
             * <p>Job ID</p>
             * 
             * <strong>example:</strong>
             * <p>1234567</p>
             */
            public Builder scheduleId(Long scheduleId) {
                this.scheduleId = scheduleId;
                return this;
            }

            /**
             * <p>Validity Period - Start Time</p>
             * 
             * <strong>example:</strong>
             * <p>1656577473000</p>
             */
            public Builder scheduleStartTime(String scheduleStartTime) {
                this.scheduleStartTime = scheduleStartTime;
                return this;
            }

            /**
             * <p>Schedule Type</p>
             * 
             * <strong>example:</strong>
             * <p>ONCE</p>
             */
            public Builder scheduleType(String scheduleType) {
                this.scheduleType = scheduleType;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
