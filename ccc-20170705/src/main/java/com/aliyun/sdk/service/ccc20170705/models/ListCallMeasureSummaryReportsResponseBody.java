// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

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
 * {@link ListCallMeasureSummaryReportsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCallMeasureSummaryReportsResponseBody</p>
 */
public class ListCallMeasureSummaryReportsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CallMeasureSummaryReportList")
    private CallMeasureSummaryReportList callMeasureSummaryReportList;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListCallMeasureSummaryReportsResponseBody(Builder builder) {
        this.callMeasureSummaryReportList = builder.callMeasureSummaryReportList;
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCallMeasureSummaryReportsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callMeasureSummaryReportList
     */
    public CallMeasureSummaryReportList getCallMeasureSummaryReportList() {
        return this.callMeasureSummaryReportList;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private CallMeasureSummaryReportList callMeasureSummaryReportList; 
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListCallMeasureSummaryReportsResponseBody model) {
            this.callMeasureSummaryReportList = model.callMeasureSummaryReportList;
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * CallMeasureSummaryReportList.
         */
        public Builder callMeasureSummaryReportList(CallMeasureSummaryReportList callMeasureSummaryReportList) {
            this.callMeasureSummaryReportList = callMeasureSummaryReportList;
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

        public ListCallMeasureSummaryReportsResponseBody build() {
            return new ListCallMeasureSummaryReportsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCallMeasureSummaryReportsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCallMeasureSummaryReportsResponseBody</p>
     */
    public static class CallMeasureSummaryReport extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Day")
        private String day;

        @com.aliyun.core.annotation.NameInMap("InboundCount")
        private Long inboundCount;

        @com.aliyun.core.annotation.NameInMap("InboundDurationByMinute")
        private Long inboundDurationByMinute;

        @com.aliyun.core.annotation.NameInMap("Month")
        private String month;

        @com.aliyun.core.annotation.NameInMap("OutboundCount")
        private Long outboundCount;

        @com.aliyun.core.annotation.NameInMap("OutboundDurationByMinute")
        private Long outboundDurationByMinute;

        @com.aliyun.core.annotation.NameInMap("Year")
        private String year;

        private CallMeasureSummaryReport(Builder builder) {
            this.day = builder.day;
            this.inboundCount = builder.inboundCount;
            this.inboundDurationByMinute = builder.inboundDurationByMinute;
            this.month = builder.month;
            this.outboundCount = builder.outboundCount;
            this.outboundDurationByMinute = builder.outboundDurationByMinute;
            this.year = builder.year;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CallMeasureSummaryReport create() {
            return builder().build();
        }

        /**
         * @return day
         */
        public String getDay() {
            return this.day;
        }

        /**
         * @return inboundCount
         */
        public Long getInboundCount() {
            return this.inboundCount;
        }

        /**
         * @return inboundDurationByMinute
         */
        public Long getInboundDurationByMinute() {
            return this.inboundDurationByMinute;
        }

        /**
         * @return month
         */
        public String getMonth() {
            return this.month;
        }

        /**
         * @return outboundCount
         */
        public Long getOutboundCount() {
            return this.outboundCount;
        }

        /**
         * @return outboundDurationByMinute
         */
        public Long getOutboundDurationByMinute() {
            return this.outboundDurationByMinute;
        }

        /**
         * @return year
         */
        public String getYear() {
            return this.year;
        }

        public static final class Builder {
            private String day; 
            private Long inboundCount; 
            private Long inboundDurationByMinute; 
            private String month; 
            private Long outboundCount; 
            private Long outboundDurationByMinute; 
            private String year; 

            private Builder() {
            } 

            private Builder(CallMeasureSummaryReport model) {
                this.day = model.day;
                this.inboundCount = model.inboundCount;
                this.inboundDurationByMinute = model.inboundDurationByMinute;
                this.month = model.month;
                this.outboundCount = model.outboundCount;
                this.outboundDurationByMinute = model.outboundDurationByMinute;
                this.year = model.year;
            } 

            /**
             * Day.
             */
            public Builder day(String day) {
                this.day = day;
                return this;
            }

            /**
             * InboundCount.
             */
            public Builder inboundCount(Long inboundCount) {
                this.inboundCount = inboundCount;
                return this;
            }

            /**
             * InboundDurationByMinute.
             */
            public Builder inboundDurationByMinute(Long inboundDurationByMinute) {
                this.inboundDurationByMinute = inboundDurationByMinute;
                return this;
            }

            /**
             * Month.
             */
            public Builder month(String month) {
                this.month = month;
                return this;
            }

            /**
             * OutboundCount.
             */
            public Builder outboundCount(Long outboundCount) {
                this.outboundCount = outboundCount;
                return this;
            }

            /**
             * OutboundDurationByMinute.
             */
            public Builder outboundDurationByMinute(Long outboundDurationByMinute) {
                this.outboundDurationByMinute = outboundDurationByMinute;
                return this;
            }

            /**
             * Year.
             */
            public Builder year(String year) {
                this.year = year;
                return this;
            }

            public CallMeasureSummaryReport build() {
                return new CallMeasureSummaryReport(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCallMeasureSummaryReportsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCallMeasureSummaryReportsResponseBody</p>
     */
    public static class CallMeasureSummaryReportList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallMeasureSummaryReport")
        private java.util.List<CallMeasureSummaryReport> callMeasureSummaryReport;

        private CallMeasureSummaryReportList(Builder builder) {
            this.callMeasureSummaryReport = builder.callMeasureSummaryReport;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CallMeasureSummaryReportList create() {
            return builder().build();
        }

        /**
         * @return callMeasureSummaryReport
         */
        public java.util.List<CallMeasureSummaryReport> getCallMeasureSummaryReport() {
            return this.callMeasureSummaryReport;
        }

        public static final class Builder {
            private java.util.List<CallMeasureSummaryReport> callMeasureSummaryReport; 

            private Builder() {
            } 

            private Builder(CallMeasureSummaryReportList model) {
                this.callMeasureSummaryReport = model.callMeasureSummaryReport;
            } 

            /**
             * CallMeasureSummaryReport.
             */
            public Builder callMeasureSummaryReport(java.util.List<CallMeasureSummaryReport> callMeasureSummaryReport) {
                this.callMeasureSummaryReport = callMeasureSummaryReport;
                return this;
            }

            public CallMeasureSummaryReportList build() {
                return new CallMeasureSummaryReportList(this);
            } 

        } 

    }
}
