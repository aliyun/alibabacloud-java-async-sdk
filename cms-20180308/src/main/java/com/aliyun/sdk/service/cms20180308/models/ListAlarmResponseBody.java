// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20180308.models;

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
 * {@link ListAlarmResponseBody} extends {@link TeaModel}
 *
 * <p>ListAlarmResponseBody</p>
 */
public class ListAlarmResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlarmList")
    private AlarmList alarmList;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private Integer nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private ListAlarmResponseBody(Builder builder) {
        this.alarmList = builder.alarmList;
        this.code = builder.code;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlarmResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarmList
     */
    public AlarmList getAlarmList() {
        return this.alarmList;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public Integer getNextToken() {
        return this.nextToken;
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

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private AlarmList alarmList; 
        private String code; 
        private String message; 
        private Integer nextToken; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListAlarmResponseBody model) {
            this.alarmList = model.alarmList;
            this.code = model.code;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
            this.total = model.total;
        } 

        /**
         * AlarmList.
         */
        public Builder alarmList(AlarmList alarmList) {
            this.alarmList = alarmList;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * NextToken.
         */
        public Builder nextToken(Integer nextToken) {
            this.nextToken = nextToken;
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

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListAlarmResponseBody build() {
            return new ListAlarmResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAlarmResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlarmResponseBody</p>
     */
    public static class Alarm extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @com.aliyun.core.annotation.NameInMap("ContactGroups")
        private String contactGroups;

        @com.aliyun.core.annotation.NameInMap("Dimensions")
        private String dimensions;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Integer endTime;

        @com.aliyun.core.annotation.NameInMap("EvaluationCount")
        private Integer evaluationCount;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("NotifyType")
        private Integer notifyType;

        @com.aliyun.core.annotation.NameInMap("Period")
        private Integer period;

        @com.aliyun.core.annotation.NameInMap("SilenceTime")
        private Integer silenceTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Integer startTime;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Statistics")
        private String statistics;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private String threshold;

        @com.aliyun.core.annotation.NameInMap("Webhook")
        private String webhook;

        private Alarm(Builder builder) {
            this.comparisonOperator = builder.comparisonOperator;
            this.contactGroups = builder.contactGroups;
            this.dimensions = builder.dimensions;
            this.enable = builder.enable;
            this.endTime = builder.endTime;
            this.evaluationCount = builder.evaluationCount;
            this.id = builder.id;
            this.metricName = builder.metricName;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.notifyType = builder.notifyType;
            this.period = builder.period;
            this.silenceTime = builder.silenceTime;
            this.startTime = builder.startTime;
            this.state = builder.state;
            this.statistics = builder.statistics;
            this.threshold = builder.threshold;
            this.webhook = builder.webhook;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Alarm create() {
            return builder().build();
        }

        /**
         * @return comparisonOperator
         */
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        /**
         * @return contactGroups
         */
        public String getContactGroups() {
            return this.contactGroups;
        }

        /**
         * @return dimensions
         */
        public String getDimensions() {
            return this.dimensions;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return endTime
         */
        public Integer getEndTime() {
            return this.endTime;
        }

        /**
         * @return evaluationCount
         */
        public Integer getEvaluationCount() {
            return this.evaluationCount;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return notifyType
         */
        public Integer getNotifyType() {
            return this.notifyType;
        }

        /**
         * @return period
         */
        public Integer getPeriod() {
            return this.period;
        }

        /**
         * @return silenceTime
         */
        public Integer getSilenceTime() {
            return this.silenceTime;
        }

        /**
         * @return startTime
         */
        public Integer getStartTime() {
            return this.startTime;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return statistics
         */
        public String getStatistics() {
            return this.statistics;
        }

        /**
         * @return threshold
         */
        public String getThreshold() {
            return this.threshold;
        }

        /**
         * @return webhook
         */
        public String getWebhook() {
            return this.webhook;
        }

        public static final class Builder {
            private String comparisonOperator; 
            private String contactGroups; 
            private String dimensions; 
            private Boolean enable; 
            private Integer endTime; 
            private Integer evaluationCount; 
            private String id; 
            private String metricName; 
            private String name; 
            private String namespace; 
            private Integer notifyType; 
            private Integer period; 
            private Integer silenceTime; 
            private Integer startTime; 
            private String state; 
            private String statistics; 
            private String threshold; 
            private String webhook; 

            private Builder() {
            } 

            private Builder(Alarm model) {
                this.comparisonOperator = model.comparisonOperator;
                this.contactGroups = model.contactGroups;
                this.dimensions = model.dimensions;
                this.enable = model.enable;
                this.endTime = model.endTime;
                this.evaluationCount = model.evaluationCount;
                this.id = model.id;
                this.metricName = model.metricName;
                this.name = model.name;
                this.namespace = model.namespace;
                this.notifyType = model.notifyType;
                this.period = model.period;
                this.silenceTime = model.silenceTime;
                this.startTime = model.startTime;
                this.state = model.state;
                this.statistics = model.statistics;
                this.threshold = model.threshold;
                this.webhook = model.webhook;
            } 

            /**
             * ComparisonOperator.
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * ContactGroups.
             */
            public Builder contactGroups(String contactGroups) {
                this.contactGroups = contactGroups;
                return this;
            }

            /**
             * Dimensions.
             */
            public Builder dimensions(String dimensions) {
                this.dimensions = dimensions;
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
             * EndTime.
             */
            public Builder endTime(Integer endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * EvaluationCount.
             */
            public Builder evaluationCount(Integer evaluationCount) {
                this.evaluationCount = evaluationCount;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MetricName.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
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
             * NotifyType.
             */
            public Builder notifyType(Integer notifyType) {
                this.notifyType = notifyType;
                return this;
            }

            /**
             * Period.
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * SilenceTime.
             */
            public Builder silenceTime(Integer silenceTime) {
                this.silenceTime = silenceTime;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Integer startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * Statistics.
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * Threshold.
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * Webhook.
             */
            public Builder webhook(String webhook) {
                this.webhook = webhook;
                return this;
            }

            public Alarm build() {
                return new Alarm(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAlarmResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlarmResponseBody</p>
     */
    public static class AlarmList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alarm")
        private java.util.List<Alarm> alarm;

        private AlarmList(Builder builder) {
            this.alarm = builder.alarm;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlarmList create() {
            return builder().build();
        }

        /**
         * @return alarm
         */
        public java.util.List<Alarm> getAlarm() {
            return this.alarm;
        }

        public static final class Builder {
            private java.util.List<Alarm> alarm; 

            private Builder() {
            } 

            private Builder(AlarmList model) {
                this.alarm = model.alarm;
            } 

            /**
             * Alarm.
             */
            public Builder alarm(java.util.List<Alarm> alarm) {
                this.alarm = alarm;
                return this;
            }

            public AlarmList build() {
                return new AlarmList(this);
            } 

        } 

    }
}
