// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx320240624.models;

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
 * {@link ListAlarmEventResponseBody} extends {@link TeaModel}
 *
 * <p>ListAlarmEventResponseBody</p>
 */
public class ListAlarmEventResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListAlarmEventResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlarmEventResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder data(Data data) {
            this.data = data;
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

        public ListAlarmEventResponseBody build() {
            return new ListAlarmEventResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAlarmEventResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlarmEventResponseBody</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmChannel")
        private String alarmChannel;

        @com.aliyun.core.annotation.NameInMap("AlarmContacts")
        private String alarmContacts;

        @com.aliyun.core.annotation.NameInMap("AlarmMessage")
        private String alarmMessage;

        @com.aliyun.core.annotation.NameInMap("AlarmStatus")
        private String alarmStatus;

        @com.aliyun.core.annotation.NameInMap("AlarmType")
        private String alarmType;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("JobName")
        private String jobName;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        private Records(Builder builder) {
            this.alarmChannel = builder.alarmChannel;
            this.alarmContacts = builder.alarmContacts;
            this.alarmMessage = builder.alarmMessage;
            this.alarmStatus = builder.alarmStatus;
            this.alarmType = builder.alarmType;
            this.appName = builder.appName;
            this.jobName = builder.jobName;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return alarmChannel
         */
        public String getAlarmChannel() {
            return this.alarmChannel;
        }

        /**
         * @return alarmContacts
         */
        public String getAlarmContacts() {
            return this.alarmContacts;
        }

        /**
         * @return alarmMessage
         */
        public String getAlarmMessage() {
            return this.alarmMessage;
        }

        /**
         * @return alarmStatus
         */
        public String getAlarmStatus() {
            return this.alarmStatus;
        }

        /**
         * @return alarmType
         */
        public String getAlarmType() {
            return this.alarmType;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return jobName
         */
        public String getJobName() {
            return this.jobName;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        public static final class Builder {
            private String alarmChannel; 
            private String alarmContacts; 
            private String alarmMessage; 
            private String alarmStatus; 
            private String alarmType; 
            private String appName; 
            private String jobName; 
            private String time; 

            /**
             * AlarmChannel.
             */
            public Builder alarmChannel(String alarmChannel) {
                this.alarmChannel = alarmChannel;
                return this;
            }

            /**
             * AlarmContacts.
             */
            public Builder alarmContacts(String alarmContacts) {
                this.alarmContacts = alarmContacts;
                return this;
            }

            /**
             * AlarmMessage.
             */
            public Builder alarmMessage(String alarmMessage) {
                this.alarmMessage = alarmMessage;
                return this;
            }

            /**
             * AlarmStatus.
             */
            public Builder alarmStatus(String alarmStatus) {
                this.alarmStatus = alarmStatus;
                return this;
            }

            /**
             * AlarmType.
             */
            public Builder alarmType(String alarmType) {
                this.alarmType = alarmType;
                return this;
            }

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * JobName.
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAlarmEventResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlarmEventResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Records")
        private java.util.List<Records> records;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.records = builder.records;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return records
         */
        public java.util.List<Records> getRecords() {
            return this.records;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private java.util.List<Records> records; 
            private Long total; 

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
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
             * Records.
             */
            public Builder records(java.util.List<Records> records) {
                this.records = records;
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
