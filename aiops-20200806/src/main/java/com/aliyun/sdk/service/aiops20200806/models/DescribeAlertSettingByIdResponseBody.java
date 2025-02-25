// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAlertSettingByIdResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAlertSettingByIdResponseBody</p>
 */
public class DescribeAlertSettingByIdResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    private DescribeAlertSettingByIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlertSettingByIdResponseBody create() {
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String status; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
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
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeAlertSettingByIdResponseBody build() {
            return new DescribeAlertSettingByIdResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AlarmLevel")
        private String alarmLevel;

        @NameInMap("AlertBusinessSettingId")
        private Long alertBusinessSettingId;

        @NameInMap("AlertName")
        private String alertName;

        @NameInMap("DataCreateTime")
        private String dataCreateTime;

        @NameInMap("DataCreateUser")
        private String dataCreateUser;

        @NameInMap("DataModifyTime")
        private String dataModifyTime;

        @NameInMap("DataModifyUser")
        private String dataModifyUser;

        @NameInMap("SendDingtalkNotice")
        private Boolean sendDingtalkNotice;

        @NameInMap("SendEmailNotice")
        private Boolean sendEmailNotice;

        @NameInMap("SendSmsNotice")
        private Boolean sendSmsNotice;

        @NameInMap("SettingStatus")
        private Long settingStatus;

        @NameInMap("StopDuration")
        private Long stopDuration;

        @NameInMap("Uid")
        private Long uid;

        private Data(Builder builder) {
            this.alarmLevel = builder.alarmLevel;
            this.alertBusinessSettingId = builder.alertBusinessSettingId;
            this.alertName = builder.alertName;
            this.dataCreateTime = builder.dataCreateTime;
            this.dataCreateUser = builder.dataCreateUser;
            this.dataModifyTime = builder.dataModifyTime;
            this.dataModifyUser = builder.dataModifyUser;
            this.sendDingtalkNotice = builder.sendDingtalkNotice;
            this.sendEmailNotice = builder.sendEmailNotice;
            this.sendSmsNotice = builder.sendSmsNotice;
            this.settingStatus = builder.settingStatus;
            this.stopDuration = builder.stopDuration;
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return alarmLevel
         */
        public String getAlarmLevel() {
            return this.alarmLevel;
        }

        /**
         * @return alertBusinessSettingId
         */
        public Long getAlertBusinessSettingId() {
            return this.alertBusinessSettingId;
        }

        /**
         * @return alertName
         */
        public String getAlertName() {
            return this.alertName;
        }

        /**
         * @return dataCreateTime
         */
        public String getDataCreateTime() {
            return this.dataCreateTime;
        }

        /**
         * @return dataCreateUser
         */
        public String getDataCreateUser() {
            return this.dataCreateUser;
        }

        /**
         * @return dataModifyTime
         */
        public String getDataModifyTime() {
            return this.dataModifyTime;
        }

        /**
         * @return dataModifyUser
         */
        public String getDataModifyUser() {
            return this.dataModifyUser;
        }

        /**
         * @return sendDingtalkNotice
         */
        public Boolean getSendDingtalkNotice() {
            return this.sendDingtalkNotice;
        }

        /**
         * @return sendEmailNotice
         */
        public Boolean getSendEmailNotice() {
            return this.sendEmailNotice;
        }

        /**
         * @return sendSmsNotice
         */
        public Boolean getSendSmsNotice() {
            return this.sendSmsNotice;
        }

        /**
         * @return settingStatus
         */
        public Long getSettingStatus() {
            return this.settingStatus;
        }

        /**
         * @return stopDuration
         */
        public Long getStopDuration() {
            return this.stopDuration;
        }

        /**
         * @return uid
         */
        public Long getUid() {
            return this.uid;
        }

        public static final class Builder {
            private String alarmLevel; 
            private Long alertBusinessSettingId; 
            private String alertName; 
            private String dataCreateTime; 
            private String dataCreateUser; 
            private String dataModifyTime; 
            private String dataModifyUser; 
            private Boolean sendDingtalkNotice; 
            private Boolean sendEmailNotice; 
            private Boolean sendSmsNotice; 
            private Long settingStatus; 
            private Long stopDuration; 
            private Long uid; 

            /**
             * AlarmLevel.
             */
            public Builder alarmLevel(String alarmLevel) {
                this.alarmLevel = alarmLevel;
                return this;
            }

            /**
             * AlertBusinessSettingId.
             */
            public Builder alertBusinessSettingId(Long alertBusinessSettingId) {
                this.alertBusinessSettingId = alertBusinessSettingId;
                return this;
            }

            /**
             * AlertName.
             */
            public Builder alertName(String alertName) {
                this.alertName = alertName;
                return this;
            }

            /**
             * DataCreateTime.
             */
            public Builder dataCreateTime(String dataCreateTime) {
                this.dataCreateTime = dataCreateTime;
                return this;
            }

            /**
             * DataCreateUser.
             */
            public Builder dataCreateUser(String dataCreateUser) {
                this.dataCreateUser = dataCreateUser;
                return this;
            }

            /**
             * DataModifyTime.
             */
            public Builder dataModifyTime(String dataModifyTime) {
                this.dataModifyTime = dataModifyTime;
                return this;
            }

            /**
             * DataModifyUser.
             */
            public Builder dataModifyUser(String dataModifyUser) {
                this.dataModifyUser = dataModifyUser;
                return this;
            }

            /**
             * SendDingtalkNotice.
             */
            public Builder sendDingtalkNotice(Boolean sendDingtalkNotice) {
                this.sendDingtalkNotice = sendDingtalkNotice;
                return this;
            }

            /**
             * SendEmailNotice.
             */
            public Builder sendEmailNotice(Boolean sendEmailNotice) {
                this.sendEmailNotice = sendEmailNotice;
                return this;
            }

            /**
             * SendSmsNotice.
             */
            public Builder sendSmsNotice(Boolean sendSmsNotice) {
                this.sendSmsNotice = sendSmsNotice;
                return this;
            }

            /**
             * SettingStatus.
             */
            public Builder settingStatus(Long settingStatus) {
                this.settingStatus = settingStatus;
                return this;
            }

            /**
             * StopDuration.
             */
            public Builder stopDuration(Long stopDuration) {
                this.stopDuration = stopDuration;
                return this;
            }

            /**
             * Uid.
             */
            public Builder uid(Long uid) {
                this.uid = uid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
