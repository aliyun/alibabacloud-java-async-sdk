// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreatePickUpWaybillPreQueryResponseBody model) {
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The result set.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9FC30594-3841-43AD-9008-03393BCB5CD2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreatePickUpWaybillPreQueryResponseBody build() {
            return new CreatePickUpWaybillPreQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreatePickUpWaybillPreQueryResponseBody} extends {@link TeaModel}
     *
     * <p>CreatePickUpWaybillPreQueryResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(TimeList model) {
                this.endTime = model.endTime;
                this.selectDisableTip = model.selectDisableTip;
                this.selectable = model.selectable;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The end of the time range.</p>
             * 
             * <strong>example:</strong>
             * <p>12:00:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The tip displayed when the scheduled pickup is not available.</p>
             * 
             * <strong>example:</strong>
             * <p>Appointment Full</p>
             */
            public Builder selectDisableTip(String selectDisableTip) {
                this.selectDisableTip = selectDisableTip;
                return this;
            }

            /**
             * <p>Indicates whether the time range can be selected for the scheduled pickup.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder selectable(Boolean selectable) {
                this.selectable = selectable;
                return this;
            }

            /**
             * <p>The beginning of the time range.</p>
             * 
             * <strong>example:</strong>
             * <p>10:00:00</p>
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
    /**
     * 
     * {@link CreatePickUpWaybillPreQueryResponseBody} extends {@link TeaModel}
     *
     * <p>CreatePickUpWaybillPreQueryResponseBody</p>
     */
    public static class AppointTimes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("DateSelectable")
        private Boolean dateSelectable;

        @com.aliyun.core.annotation.NameInMap("TimeList")
        private java.util.List<TimeList> timeList;

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
        public java.util.List<TimeList> getTimeList() {
            return this.timeList;
        }

        public static final class Builder {
            private String date; 
            private Boolean dateSelectable; 
            private java.util.List<TimeList> timeList; 

            private Builder() {
            } 

            private Builder(AppointTimes model) {
                this.date = model.date;
                this.dateSelectable = model.dateSelectable;
                this.timeList = model.timeList;
            } 

            /**
             * <p>The date in the YYYY-MM-DD format.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-28</p>
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * <p>Indicates whether the date is selectable.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder dateSelectable(Boolean dateSelectable) {
                this.dateSelectable = dateSelectable;
                return this;
            }

            /**
             * <p>The time range for the scheduled pickup for this date.</p>
             */
            public Builder timeList(java.util.List<TimeList> timeList) {
                this.timeList = timeList;
                return this;
            }

            public AppointTimes build() {
                return new AppointTimes(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePickUpWaybillPreQueryResponseBody} extends {@link TeaModel}
     *
     * <p>CreatePickUpWaybillPreQueryResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(RealTime model) {
                this.name = model.name;
                this.selectDisableTip = model.selectDisableTip;
                this.selectable = model.selectable;
            } 

            /**
             * <p>The name of the real-time order type.</p>
             * 
             * <strong>example:</strong>
             * <p>Aliyun</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The tip displayed when the real-time order cannot be placed.</p>
             * 
             * <strong>example:</strong>
             * <p>Exceeding the real-time ordering time range.</p>
             */
            public Builder selectDisableTip(String selectDisableTip) {
                this.selectDisableTip = selectDisableTip;
                return this;
            }

            /**
             * <p>Indicates whether the real-time order can be placed after the deadline for placing a real-time order is reached.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
    /**
     * 
     * {@link CreatePickUpWaybillPreQueryResponseBody} extends {@link TeaModel}
     *
     * <p>CreatePickUpWaybillPreQueryResponseBody</p>
     */
    public static class CpTimeSelectList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppointTimes")
        private java.util.List<AppointTimes> appointTimes;

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
        public java.util.List<AppointTimes> getAppointTimes() {
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
            private java.util.List<AppointTimes> appointTimes; 
            private String prePrice; 
            private RealTime realTime; 

            private Builder() {
            } 

            private Builder(CpTimeSelectList model) {
                this.appointTimes = model.appointTimes;
                this.prePrice = model.prePrice;
                this.realTime = model.realTime;
            } 

            /**
             * <p>The available time for the scheduled pickup. If the current courier company cannot accept the scheduled pickup, this field is left empty.</p>
             */
            public Builder appointTimes(java.util.List<AppointTimes> appointTimes) {
                this.appointTimes = appointTimes;
                return this;
            }

            /**
             * <p>The estimated price. Unit: CNY. The value is accurate to two decimal places. The value of this parameter is displayed if an estimated weight is specified.</p>
             * 
             * <strong>example:</strong>
             * <p>12.50</p>
             */
            public Builder prePrice(String prePrice) {
                this.prePrice = prePrice;
                return this;
            }

            /**
             * <p>The information about whether the real-time order can be selected.</p>
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
    /**
     * 
     * {@link CreatePickUpWaybillPreQueryResponseBody} extends {@link TeaModel}
     *
     * <p>CreatePickUpWaybillPreQueryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("CpTimeSelectList")
        private java.util.List<CpTimeSelectList> cpTimeSelectList;

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
        public java.util.List<CpTimeSelectList> getCpTimeSelectList() {
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
            private java.util.List<CpTimeSelectList> cpTimeSelectList; 
            private String errorCode; 
            private String errorMsg; 
            private String message; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.code = model.code;
                this.cpTimeSelectList = model.cpTimeSelectList;
                this.errorCode = model.errorCode;
                this.errorMsg = model.errorMsg;
                this.message = model.message;
                this.success = model.success;
            } 

            /**
             * <p>The response code.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The information about whether the courier company can accept the order.</p>
             */
            public Builder cpTimeSelectList(java.util.List<CpTimeSelectList> cpTimeSelectList) {
                this.cpTimeSelectList = cpTimeSelectList;
                return this;
            }

            /**
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>none</p>
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * <p>The response content.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>Indicates whether the request was successful.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
