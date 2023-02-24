// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePickUpWaybillPreQueryResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePickUpWaybillPreQueryResponseBody</p>
 */
public class CreatePickUpWaybillPreQueryResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * Id of the request
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
        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("SelectDisableTip")
        private String selectDisableTip;

        @NameInMap("Selectable")
        private Boolean selectable;

        @NameInMap("StartTime")
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
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * SelectDisableTip.
             */
            public Builder selectDisableTip(String selectDisableTip) {
                this.selectDisableTip = selectDisableTip;
                return this;
            }

            /**
             * Selectable.
             */
            public Builder selectable(Boolean selectable) {
                this.selectable = selectable;
                return this;
            }

            /**
             * StartTime.
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
        @NameInMap("Date")
        private String date;

        @NameInMap("DateSelectable")
        private Boolean dateSelectable;

        @NameInMap("TimeList")
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
             * Date.
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * DateSelectable.
             */
            public Builder dateSelectable(Boolean dateSelectable) {
                this.dateSelectable = dateSelectable;
                return this;
            }

            /**
             * TimeList.
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
        @NameInMap("Name")
        private String name;

        @NameInMap("SelectDisableTip")
        private String selectDisableTip;

        @NameInMap("Selectable")
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * SelectDisableTip.
             */
            public Builder selectDisableTip(String selectDisableTip) {
                this.selectDisableTip = selectDisableTip;
                return this;
            }

            /**
             * Selectable.
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
        @NameInMap("AppointTimes")
        private java.util.List < AppointTimes> appointTimes;

        @NameInMap("PrePrice")
        private String prePrice;

        @NameInMap("RealTime")
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
             * AppointTimes.
             */
            public Builder appointTimes(java.util.List < AppointTimes> appointTimes) {
                this.appointTimes = appointTimes;
                return this;
            }

            /**
             * PrePrice.
             */
            public Builder prePrice(String prePrice) {
                this.prePrice = prePrice;
                return this;
            }

            /**
             * RealTime.
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
        @NameInMap("Code")
        private String code;

        @NameInMap("CpTimeSelectList")
        private java.util.List < CpTimeSelectList> cpTimeSelectList;

        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorMsg")
        private String errorMsg;

        @NameInMap("Message")
        private String message;

        @NameInMap("Success")
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
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * CpTimeSelectList.
             */
            public Builder cpTimeSelectList(java.util.List < CpTimeSelectList> cpTimeSelectList) {
                this.cpTimeSelectList = cpTimeSelectList;
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
             * ErrorMsg.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
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
             * Success.
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
