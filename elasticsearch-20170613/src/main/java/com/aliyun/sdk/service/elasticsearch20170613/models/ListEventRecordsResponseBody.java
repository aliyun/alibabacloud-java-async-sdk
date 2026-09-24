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
 * {@link ListEventRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>ListEventRecordsResponseBody</p>
 */
public class ListEventRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private ListEventRecordsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEventRecordsResponseBody create() {
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

        private Builder(ListEventRecordsResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7F40EAA1-6F1D-4DD9-8DB8-C5F00C4E****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned result.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ListEventRecordsResponseBody build() {
            return new ListEventRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEventRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>ListEventRecordsResponseBody</p>
     */
    public static class ActionSuggest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("suggestActions")
        private java.util.List<String> suggestActions;

        @com.aliyun.core.annotation.NameInMap("suggestText")
        private String suggestText;

        @com.aliyun.core.annotation.NameInMap("suggestType")
        private String suggestType;

        private ActionSuggest(Builder builder) {
            this.suggestActions = builder.suggestActions;
            this.suggestText = builder.suggestText;
            this.suggestType = builder.suggestType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ActionSuggest create() {
            return builder().build();
        }

        /**
         * @return suggestActions
         */
        public java.util.List<String> getSuggestActions() {
            return this.suggestActions;
        }

        /**
         * @return suggestText
         */
        public String getSuggestText() {
            return this.suggestText;
        }

        /**
         * @return suggestType
         */
        public String getSuggestType() {
            return this.suggestType;
        }

        public static final class Builder {
            private java.util.List<String> suggestActions; 
            private String suggestText; 
            private String suggestType; 

            private Builder() {
            } 

            private Builder(ActionSuggest model) {
                this.suggestActions = model.suggestActions;
                this.suggestText = model.suggestText;
                this.suggestType = model.suggestType;
            } 

            /**
             * <p>The suggested action.</p>
             */
            public Builder suggestActions(java.util.List<String> suggestActions) {
                this.suggestActions = suggestActions;
                return this;
            }

            /**
             * <p>The text of the suggested action.</p>
             * 
             * <strong>example:</strong>
             * <p>“”</p>
             */
            public Builder suggestText(String suggestText) {
                this.suggestText = suggestText;
                return this;
            }

            /**
             * <p>The type of the suggested action.</p>
             * 
             * <strong>example:</strong>
             * <p>promptText</p>
             */
            public Builder suggestType(String suggestType) {
                this.suggestType = suggestType;
                return this;
            }

            public ActionSuggest build() {
                return new ActionSuggest(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListEventRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>ListEventRecordsResponseBody</p>
     */
    public static class ShowContent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actionSuggest")
        private ActionSuggest actionSuggest;

        @com.aliyun.core.annotation.NameInMap("desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("eventStatus")
        private String eventStatus;

        @com.aliyun.core.annotation.NameInMap("eventTime")
        private String eventTime;

        @com.aliyun.core.annotation.NameInMap("executeFinishTime")
        private String executeFinishTime;

        @com.aliyun.core.annotation.NameInMap("executeStartTime")
        private String executeStartTime;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("opsChangeId")
        private String opsChangeId;

        private ShowContent(Builder builder) {
            this.actionSuggest = builder.actionSuggest;
            this.desc = builder.desc;
            this.eventStatus = builder.eventStatus;
            this.eventTime = builder.eventTime;
            this.executeFinishTime = builder.executeFinishTime;
            this.executeStartTime = builder.executeStartTime;
            this.instanceId = builder.instanceId;
            this.opsChangeId = builder.opsChangeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ShowContent create() {
            return builder().build();
        }

        /**
         * @return actionSuggest
         */
        public ActionSuggest getActionSuggest() {
            return this.actionSuggest;
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return eventStatus
         */
        public String getEventStatus() {
            return this.eventStatus;
        }

        /**
         * @return eventTime
         */
        public String getEventTime() {
            return this.eventTime;
        }

        /**
         * @return executeFinishTime
         */
        public String getExecuteFinishTime() {
            return this.executeFinishTime;
        }

        /**
         * @return executeStartTime
         */
        public String getExecuteStartTime() {
            return this.executeStartTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return opsChangeId
         */
        public String getOpsChangeId() {
            return this.opsChangeId;
        }

        public static final class Builder {
            private ActionSuggest actionSuggest; 
            private String desc; 
            private String eventStatus; 
            private String eventTime; 
            private String executeFinishTime; 
            private String executeStartTime; 
            private String instanceId; 
            private String opsChangeId; 

            private Builder() {
            } 

            private Builder(ShowContent model) {
                this.actionSuggest = model.actionSuggest;
                this.desc = model.desc;
                this.eventStatus = model.eventStatus;
                this.eventTime = model.eventTime;
                this.executeFinishTime = model.executeFinishTime;
                this.executeStartTime = model.executeStartTime;
                this.instanceId = model.instanceId;
                this.opsChangeId = model.opsChangeId;
            } 

            /**
             * <p>The suggested action.</p>
             */
            public Builder actionSuggest(ActionSuggest actionSuggest) {
                this.actionSuggest = actionSuggest;
                return this;
            }

            /**
             * <p>The event description.</p>
             * 
             * <strong>example:</strong>
             * <p>Instance.SpecModify</p>
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * <p>The event status.</p>
             * 
             * <strong>example:</strong>
             * <p>Executed</p>
             */
            public Builder eventStatus(String eventStatus) {
                this.eventStatus = eventStatus;
                return this;
            }

            /**
             * <p>The time when the event occurred.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-05-08 18:31:01</p>
             */
            public Builder eventTime(String eventTime) {
                this.eventTime = eventTime;
                return this;
            }

            /**
             * <p>The end time of the O&amp;M execution for the event.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-05-08 18:41:01</p>
             */
            public Builder executeFinishTime(String executeFinishTime) {
                this.executeFinishTime = executeFinishTime;
                return this;
            }

            /**
             * <p>The start time of the O&amp;M execution for the event.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-05-08 18:31:00</p>
             */
            public Builder executeStartTime(String executeStartTime) {
                this.executeStartTime = executeStartTime;
                return this;
            }

            /**
             * <p>The instance ID of the instance on which the event occurred.</p>
             * 
             * <strong>example:</strong>
             * <p>es-cn-a5cb2dece****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The execution ID of the cluster change.</p>
             * 
             * <strong>example:</strong>
             * <p>f183728022a1c769e97b4*****</p>
             */
            public Builder opsChangeId(String opsChangeId) {
                this.opsChangeId = opsChangeId;
                return this;
            }

            public ShowContent build() {
                return new ShowContent(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListEventRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>ListEventRecordsResponseBody</p>
     */
    public static class ResultResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("autoAlarm")
        private Boolean autoAlarm;

        @com.aliyun.core.annotation.NameInMap("displayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("dryRun")
        private Boolean dryRun;

        @com.aliyun.core.annotation.NameInMap("level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("mustOps")
        private Boolean mustOps;

        @com.aliyun.core.annotation.NameInMap("product")
        private String product;

        @com.aliyun.core.annotation.NameInMap("scheduleExecuteTime")
        private String scheduleExecuteTime;

        @com.aliyun.core.annotation.NameInMap("scheduleFinishTime")
        private String scheduleFinishTime;

        @com.aliyun.core.annotation.NameInMap("showContent")
        private ShowContent showContent;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private ResultResult(Builder builder) {
            this.autoAlarm = builder.autoAlarm;
            this.displayName = builder.displayName;
            this.dryRun = builder.dryRun;
            this.level = builder.level;
            this.mustOps = builder.mustOps;
            this.product = builder.product;
            this.scheduleExecuteTime = builder.scheduleExecuteTime;
            this.scheduleFinishTime = builder.scheduleFinishTime;
            this.showContent = builder.showContent;
            this.source = builder.source;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultResult create() {
            return builder().build();
        }

        /**
         * @return autoAlarm
         */
        public Boolean getAutoAlarm() {
            return this.autoAlarm;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return dryRun
         */
        public Boolean getDryRun() {
            return this.dryRun;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return mustOps
         */
        public Boolean getMustOps() {
            return this.mustOps;
        }

        /**
         * @return product
         */
        public String getProduct() {
            return this.product;
        }

        /**
         * @return scheduleExecuteTime
         */
        public String getScheduleExecuteTime() {
            return this.scheduleExecuteTime;
        }

        /**
         * @return scheduleFinishTime
         */
        public String getScheduleFinishTime() {
            return this.scheduleFinishTime;
        }

        /**
         * @return showContent
         */
        public ShowContent getShowContent() {
            return this.showContent;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Boolean autoAlarm; 
            private String displayName; 
            private Boolean dryRun; 
            private String level; 
            private Boolean mustOps; 
            private String product; 
            private String scheduleExecuteTime; 
            private String scheduleFinishTime; 
            private ShowContent showContent; 
            private String source; 
            private String status; 
            private String type; 

            private Builder() {
            } 

            private Builder(ResultResult model) {
                this.autoAlarm = model.autoAlarm;
                this.displayName = model.displayName;
                this.dryRun = model.dryRun;
                this.level = model.level;
                this.mustOps = model.mustOps;
                this.product = model.product;
                this.scheduleExecuteTime = model.scheduleExecuteTime;
                this.scheduleFinishTime = model.scheduleFinishTime;
                this.showContent = model.showContent;
                this.source = model.source;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * <p>Indicates whether automatic alerting is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder autoAlarm(Boolean autoAlarm) {
                this.autoAlarm = autoAlarm;
                return this;
            }

            /**
             * <p>The display name of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>Instance.SpecModify</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>Indicates whether this is a dry run.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder dryRun(Boolean dryRun) {
                this.dryRun = dryRun;
                return this;
            }

            /**
             * <p>The event level.</p>
             * 
             * <strong>example:</strong>
             * <p>Info</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>Indicates whether O&amp;M processing is required.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder mustOps(Boolean mustOps) {
                this.mustOps = mustOps;
                return this;
            }

            /**
             * <p>The product type of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>elasticsearch</p>
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * <p>The scheduled execution time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-05-08 18:41:01</p>
             */
            public Builder scheduleExecuteTime(String scheduleExecuteTime) {
                this.scheduleExecuteTime = scheduleExecuteTime;
                return this;
            }

            /**
             * <p>The scheduled end time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-05-08 18:41:01</p>
             */
            public Builder scheduleFinishTime(String scheduleFinishTime) {
                this.scheduleFinishTime = scheduleFinishTime;
                return this;
            }

            /**
             * <p>The event content.</p>
             */
            public Builder showContent(ShowContent showContent) {
                this.showContent = showContent;
                return this;
            }

            /**
             * <p>The source of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>webConsole</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The event status.</p>
             * 
             * <strong>example:</strong>
             * <p>Executed</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The event type.</p>
             * 
             * <strong>example:</strong>
             * <p>UserOperator</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ResultResult build() {
                return new ResultResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListEventRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>ListEventRecordsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("result")
        private java.util.List<ResultResult> result;

        @com.aliyun.core.annotation.NameInMap("total")
        private String total;

        private Result(Builder builder) {
            this.result = builder.result;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return result
         */
        public java.util.List<ResultResult> getResult() {
            return this.result;
        }

        /**
         * @return total
         */
        public String getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<ResultResult> result; 
            private String total; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.result = model.result;
                this.total = model.total;
            } 

            /**
             * <p>The returned content.</p>
             */
            public Builder result(java.util.List<ResultResult> result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The total number of records.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder total(String total) {
                this.total = total;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
