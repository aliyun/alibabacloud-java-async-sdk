// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAlarmHistoriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAlarmHistoriesResponseBody</p>
 */
public class ListAlarmHistoriesResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("HttpCode")
    private String httpCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListAlarmHistoriesResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.httpCode = builder.httpCode;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlarmHistoriesResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return httpCode
     */
    public String getHttpCode() {
        return this.httpCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String errorCode; 
        private String httpCode; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * HttpCode.
         */
        public Builder httpCode(String httpCode) {
            this.httpCode = httpCode;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAlarmHistoriesResponseBody build() {
            return new ListAlarmHistoriesResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AlarmContent")
        private String alarmContent;

        @NameInMap("AlarmDingDing")
        private String alarmDingDing;

        @NameInMap("AlarmEmail")
        private String alarmEmail;

        @NameInMap("AlarmName")
        private String alarmName;

        @NameInMap("AlarmPhone")
        private String alarmPhone;

        @NameInMap("AlarmTime")
        private String alarmTime;

        private Data(Builder builder) {
            this.alarmContent = builder.alarmContent;
            this.alarmDingDing = builder.alarmDingDing;
            this.alarmEmail = builder.alarmEmail;
            this.alarmName = builder.alarmName;
            this.alarmPhone = builder.alarmPhone;
            this.alarmTime = builder.alarmTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return alarmContent
         */
        public String getAlarmContent() {
            return this.alarmContent;
        }

        /**
         * @return alarmDingDing
         */
        public String getAlarmDingDing() {
            return this.alarmDingDing;
        }

        /**
         * @return alarmEmail
         */
        public String getAlarmEmail() {
            return this.alarmEmail;
        }

        /**
         * @return alarmName
         */
        public String getAlarmName() {
            return this.alarmName;
        }

        /**
         * @return alarmPhone
         */
        public String getAlarmPhone() {
            return this.alarmPhone;
        }

        /**
         * @return alarmTime
         */
        public String getAlarmTime() {
            return this.alarmTime;
        }

        public static final class Builder {
            private String alarmContent; 
            private String alarmDingDing; 
            private String alarmEmail; 
            private String alarmName; 
            private String alarmPhone; 
            private String alarmTime; 

            /**
             * AlarmContent.
             */
            public Builder alarmContent(String alarmContent) {
                this.alarmContent = alarmContent;
                return this;
            }

            /**
             * AlarmDingDing.
             */
            public Builder alarmDingDing(String alarmDingDing) {
                this.alarmDingDing = alarmDingDing;
                return this;
            }

            /**
             * AlarmEmail.
             */
            public Builder alarmEmail(String alarmEmail) {
                this.alarmEmail = alarmEmail;
                return this;
            }

            /**
             * AlarmName.
             */
            public Builder alarmName(String alarmName) {
                this.alarmName = alarmName;
                return this;
            }

            /**
             * AlarmPhone.
             */
            public Builder alarmPhone(String alarmPhone) {
                this.alarmPhone = alarmPhone;
                return this;
            }

            /**
             * AlarmTime.
             */
            public Builder alarmTime(String alarmTime) {
                this.alarmTime = alarmTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
