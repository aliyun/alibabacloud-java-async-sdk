// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePickUpWaybillPreQueryResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePickUpWaybillPreQueryResponseBody</p>
 */
public class CreatePickUpWaybillPreQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreatePickUpWaybillPreQueryResponseBody(Builder builder) {
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePickUpWaybillPreQueryResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    public static final class Builder {
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 

        /**
         * The result set.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreatePickUpWaybillPreQueryResponseBody build() {
            return new CreatePickUpWaybillPreQueryResponseBody(this);
        } 

    } 

    public static class TimeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("SelectDisableTip")
        private String selectDisableTip;

        @com.aliyun.core.annotation.NameInMap("Selectable")
        private Boolean selectable;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private TimeList(Builder builder) {
            this.endTime = builder.endTime;
            this.selectDisableTip = builder.selectDisableTip;
            this.selectable = builder.selectable;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimeList create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return selectDisableTip
         */
        public String getSelectDisableTip() {
            return this.selectDisableTip;
        }

        /**
         * @return selectable
         */
        public Boolean getSelectable() {
            return this.selectable;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String endTime; 
            private String selectDisableTip; 
            private Boolean selectable; 
            private String startTime; 

            /**
             * The end of the time range.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The tip displayed when the scheduled pickup is not available.
             */
            public Builder selectDisableTip(String selectDisableTip) {
                this.selectDisableTip = selectDisableTip;
                return this;
            }

            /**
             * Indicates whether the time range can be selected for the scheduled pickup.
             */
            public Builder selectable(Boolean selectable) {
                this.selectable = selectable;
                return this;
            }

            /**
             * The beginning of the time range.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public TimeList build() {
                return new TimeList(this);
            } 

        } 

    }
    public static class AppointTimes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("DateSelectable")
        private Boolean dateSelectable;

        @com.aliyun.core.annotation.NameInMap("TimeList")
        private java.util.List < TimeList> timeList;

        private AppointTimes(Builder builder) {
            this.date = builder.date;
            this.dateSelectable = builder.dateSelectable;
            this.timeList = builder.timeList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppointTimes create() {
            return builder().build();
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return dateSelectable
         */
        public Boolean getDateSelectable() {
            return this.dateSelectable;
        }

        /**
         * @return timeList
         */
        public java.util.List < TimeList> getTimeList() {
            return this.timeList;
        }

        public static final class Builder {
            private String date; 
            private Boolean dateSelectable; 
            private java.util.List < TimeList> timeList; 

            /**
             * The date in the YYYY-MM-DD format.
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * Indicates whether the date is selectable.
             */
            public Builder dateSelectable(Boolean dateSelectable) {
                this.dateSelectable = dateSelectable;
                return this;
            }

            /**
             * The time range for the scheduled pickup for this date.
             */
            public Builder timeList(java.util.List < TimeList> timeList) {
                this.timeList = timeList;
                return this;
            }

            public AppointTimes build() {
                return new AppointTimes(this);
            } 

        } 

    }
    public static class RealTime extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SelectDisableTip")
        private String selectDisableTip;

        @com.aliyun.core.annotation.NameInMap("Selectable")
        private Boolean selectable;

        private RealTime(Builder builder) {
            this.name = builder.name;
            this.selectDisableTip = builder.selectDisableTip;
            this.selectable = builder.selectable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RealTime create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return selectDisableTip
         */
        public String getSelectDisableTip() {
            return this.selectDisableTip;
        }

        /**
         * @return selectable
         */
        public Boolean getSelectable() {
            return this.selectable;
        }

        public static final class Builder {
            private String name; 
            private String selectDisableTip; 
            private Boolean selectable; 

            /**
             * The name of the real-time order type.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The tip displayed when the real-time order cannot be placed.
             */
            public Builder selectDisableTip(String selectDisableTip) {
                this.selectDisableTip = selectDisableTip;
                return this;
            }

            /**
             * Indicates whether the real-time order can be placed after the deadline for placing a real-time order is reached.
             */
            public Builder selectable(Boolean selectable) {
                this.selectable = selectable;
                return this;
            }

            public RealTime build() {
                return new RealTime(this);
            } 

        } 

    }
    public static class CpTimeSelectList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppointTimes")
        private java.util.List < AppointTimes> appointTimes;

        @com.aliyun.core.annotation.NameInMap("PrePrice")
        private String prePrice;

        @com.aliyun.core.annotation.NameInMap("RealTime")
        private RealTime realTime;

        private CpTimeSelectList(Builder builder) {
            this.appointTimes = builder.appointTimes;
            this.prePrice = builder.prePrice;
            this.realTime = builder.realTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CpTimeSelectList create() {
            return builder().build();
        }

        /**
         * @return appointTimes
         */
        public java.util.List < AppointTimes> getAppointTimes() {
            return this.appointTimes;
        }

        /**
         * @return prePrice
         */
        public String getPrePrice() {
            return this.prePrice;
        }

        /**
         * @return realTime
         */
        public RealTime getRealTime() {
            return this.realTime;
        }

        public static final class Builder {
            private java.util.List < AppointTimes> appointTimes; 
            private String prePrice; 
            private RealTime realTime; 

            /**
             * The available time for the scheduled pickup. If the current courier company cannot accept the scheduled pickup, this field is left empty.
             */
            public Builder appointTimes(java.util.List < AppointTimes> appointTimes) {
                this.appointTimes = appointTimes;
                return this;
            }

            /**
             * The estimated price. Unit: CNY. The value is accurate to two decimal places. The value of this parameter is displayed if an estimated weight is specified.
             */
            public Builder prePrice(String prePrice) {
                this.prePrice = prePrice;
                return this;
            }

            /**
             * The information about whether the real-time order can be selected.
             */
            public Builder realTime(RealTime realTime) {
                this.realTime = realTime;
                return this;
            }

            public CpTimeSelectList build() {
                return new CpTimeSelectList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("CpTimeSelectList")
        private java.util.List < CpTimeSelectList> cpTimeSelectList;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private Data(Builder builder) {
            this.code = builder.code;
            this.cpTimeSelectList = builder.cpTimeSelectList;
            this.errorCode = builder.errorCode;
            this.errorMsg = builder.errorMsg;
            this.message = builder.message;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return cpTimeSelectList
         */
        public java.util.List < CpTimeSelectList> getCpTimeSelectList() {
            return this.cpTimeSelectList;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String code; 
            private java.util.List < CpTimeSelectList> cpTimeSelectList; 
            private String errorCode; 
            private String errorMsg; 
            private String message; 
            private Boolean success; 

            /**
             * The response code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The information about whether the courier company can accept the order.
             */
            public Builder cpTimeSelectList(java.util.List < CpTimeSelectList> cpTimeSelectList) {
                this.cpTimeSelectList = cpTimeSelectList;
                return this;
            }

            /**
             * The error code.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * The error message.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * The response content.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * Indicates whether the request was successful.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
