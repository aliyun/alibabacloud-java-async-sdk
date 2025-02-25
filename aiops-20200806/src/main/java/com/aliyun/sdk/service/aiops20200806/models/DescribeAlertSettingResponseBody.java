// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAlertSettingResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAlertSettingResponseBody</p>
 */
public class DescribeAlertSettingResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    @NameInMap("Total")
    private Integer total;

    private DescribeAlertSettingResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlertSettingResponseBody create() {
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
    public java.util.List < Data> getData() {
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

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer code; 
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 
        private String status; 
        private Integer total; 

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
        public Builder data(java.util.List < Data> data) {
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

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeAlertSettingResponseBody build() {
            return new DescribeAlertSettingResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AlarmLevel")
        private String alarmLevel;

        @NameInMap("AlertName")
        private String alertName;

        @NameInMap("AlertSettingId")
        private Long alertSettingId;

        @NameInMap("BusinessGroupIds")
        private String businessGroupIds;

        @NameInMap("BusinessGroupNames")
        private String businessGroupNames;

        @NameInMap("ContactIds")
        private String contactIds;

        @NameInMap("ContactNames")
        private String contactNames;

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

        @NameInMap("TotalBusinessResourceNumber")
        private Long totalBusinessResourceNumber;

        private Data(Builder builder) {
            this.alarmLevel = builder.alarmLevel;
            this.alertName = builder.alertName;
            this.alertSettingId = builder.alertSettingId;
            this.businessGroupIds = builder.businessGroupIds;
            this.businessGroupNames = builder.businessGroupNames;
            this.contactIds = builder.contactIds;
            this.contactNames = builder.contactNames;
            this.sendDingtalkNotice = builder.sendDingtalkNotice;
            this.sendEmailNotice = builder.sendEmailNotice;
            this.sendSmsNotice = builder.sendSmsNotice;
            this.settingStatus = builder.settingStatus;
            this.stopDuration = builder.stopDuration;
            this.totalBusinessResourceNumber = builder.totalBusinessResourceNumber;
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
         * @return alertName
         */
        public String getAlertName() {
            return this.alertName;
        }

        /**
         * @return alertSettingId
         */
        public Long getAlertSettingId() {
            return this.alertSettingId;
        }

        /**
         * @return businessGroupIds
         */
        public String getBusinessGroupIds() {
            return this.businessGroupIds;
        }

        /**
         * @return businessGroupNames
         */
        public String getBusinessGroupNames() {
            return this.businessGroupNames;
        }

        /**
         * @return contactIds
         */
        public String getContactIds() {
            return this.contactIds;
        }

        /**
         * @return contactNames
         */
        public String getContactNames() {
            return this.contactNames;
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
         * @return totalBusinessResourceNumber
         */
        public Long getTotalBusinessResourceNumber() {
            return this.totalBusinessResourceNumber;
        }

        public static final class Builder {
            private String alarmLevel; 
            private String alertName; 
            private Long alertSettingId; 
            private String businessGroupIds; 
            private String businessGroupNames; 
            private String contactIds; 
            private String contactNames; 
            private Boolean sendDingtalkNotice; 
            private Boolean sendEmailNotice; 
            private Boolean sendSmsNotice; 
            private Long settingStatus; 
            private Long stopDuration; 
            private Long totalBusinessResourceNumber; 

            /**
             * AlarmLevel.
             */
            public Builder alarmLevel(String alarmLevel) {
                this.alarmLevel = alarmLevel;
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
             * AlertSettingId.
             */
            public Builder alertSettingId(Long alertSettingId) {
                this.alertSettingId = alertSettingId;
                return this;
            }

            /**
             * BusinessGroupIds.
             */
            public Builder businessGroupIds(String businessGroupIds) {
                this.businessGroupIds = businessGroupIds;
                return this;
            }

            /**
             * BusinessGroupNames.
             */
            public Builder businessGroupNames(String businessGroupNames) {
                this.businessGroupNames = businessGroupNames;
                return this;
            }

            /**
             * ContactIds.
             */
            public Builder contactIds(String contactIds) {
                this.contactIds = contactIds;
                return this;
            }

            /**
             * ContactNames.
             */
            public Builder contactNames(String contactNames) {
                this.contactNames = contactNames;
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
             * TotalBusinessResourceNumber.
             */
            public Builder totalBusinessResourceNumber(Long totalBusinessResourceNumber) {
                this.totalBusinessResourceNumber = totalBusinessResourceNumber;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
