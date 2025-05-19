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
 * {@link ListAlarmHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>ListAlarmHistoryResponseBody</p>
 */
public class ListAlarmHistoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlarmHistoryList")
    private AlarmHistoryList alarmHistoryList;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Cursor")
    private String cursor;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListAlarmHistoryResponseBody(Builder builder) {
        this.alarmHistoryList = builder.alarmHistoryList;
        this.code = builder.code;
        this.cursor = builder.cursor;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlarmHistoryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarmHistoryList
     */
    public AlarmHistoryList getAlarmHistoryList() {
        return this.alarmHistoryList;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return cursor
     */
    public String getCursor() {
        return this.cursor;
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
        private AlarmHistoryList alarmHistoryList; 
        private String code; 
        private String cursor; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListAlarmHistoryResponseBody model) {
            this.alarmHistoryList = model.alarmHistoryList;
            this.code = model.code;
            this.cursor = model.cursor;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * AlarmHistoryList.
         */
        public Builder alarmHistoryList(AlarmHistoryList alarmHistoryList) {
            this.alarmHistoryList = alarmHistoryList;
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
         * Cursor.
         */
        public Builder cursor(String cursor) {
            this.cursor = cursor;
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

        public ListAlarmHistoryResponseBody build() {
            return new ListAlarmHistoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAlarmHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlarmHistoryResponseBody</p>
     */
    public static class AlarmHistory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmTime")
        private Long alarmTime;

        @com.aliyun.core.annotation.NameInMap("ContactGroups")
        private String contactGroups;

        @com.aliyun.core.annotation.NameInMap("Dimension")
        private String dimension;

        @com.aliyun.core.annotation.NameInMap("EvaluationCount")
        private Integer evaluationCount;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("LastTime")
        private Long lastTime;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private AlarmHistory(Builder builder) {
            this.alarmTime = builder.alarmTime;
            this.contactGroups = builder.contactGroups;
            this.dimension = builder.dimension;
            this.evaluationCount = builder.evaluationCount;
            this.id = builder.id;
            this.instanceName = builder.instanceName;
            this.lastTime = builder.lastTime;
            this.metricName = builder.metricName;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.state = builder.state;
            this.status = builder.status;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlarmHistory create() {
            return builder().build();
        }

        /**
         * @return alarmTime
         */
        public Long getAlarmTime() {
            return this.alarmTime;
        }

        /**
         * @return contactGroups
         */
        public String getContactGroups() {
            return this.contactGroups;
        }

        /**
         * @return dimension
         */
        public String getDimension() {
            return this.dimension;
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
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return lastTime
         */
        public Long getLastTime() {
            return this.lastTime;
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
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Long alarmTime; 
            private String contactGroups; 
            private String dimension; 
            private Integer evaluationCount; 
            private String id; 
            private String instanceName; 
            private Long lastTime; 
            private String metricName; 
            private String name; 
            private String namespace; 
            private String state; 
            private Integer status; 
            private String value; 

            private Builder() {
            } 

            private Builder(AlarmHistory model) {
                this.alarmTime = model.alarmTime;
                this.contactGroups = model.contactGroups;
                this.dimension = model.dimension;
                this.evaluationCount = model.evaluationCount;
                this.id = model.id;
                this.instanceName = model.instanceName;
                this.lastTime = model.lastTime;
                this.metricName = model.metricName;
                this.name = model.name;
                this.namespace = model.namespace;
                this.state = model.state;
                this.status = model.status;
                this.value = model.value;
            } 

            /**
             * AlarmTime.
             */
            public Builder alarmTime(Long alarmTime) {
                this.alarmTime = alarmTime;
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
             * Dimension.
             */
            public Builder dimension(String dimension) {
                this.dimension = dimension;
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
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * LastTime.
             */
            public Builder lastTime(Long lastTime) {
                this.lastTime = lastTime;
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
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public AlarmHistory build() {
                return new AlarmHistory(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAlarmHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlarmHistoryResponseBody</p>
     */
    public static class AlarmHistoryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmHistory")
        private java.util.List<AlarmHistory> alarmHistory;

        private AlarmHistoryList(Builder builder) {
            this.alarmHistory = builder.alarmHistory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlarmHistoryList create() {
            return builder().build();
        }

        /**
         * @return alarmHistory
         */
        public java.util.List<AlarmHistory> getAlarmHistory() {
            return this.alarmHistory;
        }

        public static final class Builder {
            private java.util.List<AlarmHistory> alarmHistory; 

            private Builder() {
            } 

            private Builder(AlarmHistoryList model) {
                this.alarmHistory = model.alarmHistory;
            } 

            /**
             * AlarmHistory.
             */
            public Builder alarmHistory(java.util.List<AlarmHistory> alarmHistory) {
                this.alarmHistory = alarmHistory;
                return this;
            }

            public AlarmHistoryList build() {
                return new AlarmHistoryList(this);
            } 

        } 

    }
}
