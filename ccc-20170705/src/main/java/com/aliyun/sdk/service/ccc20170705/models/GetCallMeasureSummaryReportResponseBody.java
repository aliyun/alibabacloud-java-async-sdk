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
 * {@link GetCallMeasureSummaryReportResponseBody} extends {@link TeaModel}
 *
 * <p>GetCallMeasureSummaryReportResponseBody</p>
 */
public class GetCallMeasureSummaryReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NumberReports")
    private NumberReports numberReports;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("SummaryReport")
    private SummaryReport summaryReport;

    private GetCallMeasureSummaryReportResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.numberReports = builder.numberReports;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.summaryReport = builder.summaryReport;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCallMeasureSummaryReportResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return numberReports
     */
    public NumberReports getNumberReports() {
        return this.numberReports;
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
     * @return summaryReport
     */
    public SummaryReport getSummaryReport() {
        return this.summaryReport;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private NumberReports numberReports; 
        private String requestId; 
        private Boolean success; 
        private SummaryReport summaryReport; 

        private Builder() {
        } 

        private Builder(GetCallMeasureSummaryReportResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.numberReports = model.numberReports;
            this.requestId = model.requestId;
            this.success = model.success;
            this.summaryReport = model.summaryReport;
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
         * NumberReports.
         */
        public Builder numberReports(NumberReports numberReports) {
            this.numberReports = numberReports;
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
         * SummaryReport.
         */
        public Builder summaryReport(SummaryReport summaryReport) {
            this.summaryReport = summaryReport;
            return this;
        }

        public GetCallMeasureSummaryReportResponseBody build() {
            return new GetCallMeasureSummaryReportResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCallMeasureSummaryReportResponseBody} extends {@link TeaModel}
     *
     * <p>GetCallMeasureSummaryReportResponseBody</p>
     */
    public static class NumberReport extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Day")
        private Integer day;

        @com.aliyun.core.annotation.NameInMap("InboundCount")
        private Long inboundCount;

        @com.aliyun.core.annotation.NameInMap("InboundDurationByMinute")
        private Long inboundDurationByMinute;

        @com.aliyun.core.annotation.NameInMap("Month")
        private Integer month;

        @com.aliyun.core.annotation.NameInMap("Number")
        private String number;

        @com.aliyun.core.annotation.NameInMap("OutboundCount")
        private Long outboundCount;

        @com.aliyun.core.annotation.NameInMap("OutboundDurationByMinute")
        private Long outboundDurationByMinute;

        @com.aliyun.core.annotation.NameInMap("Year")
        private Integer year;

        private NumberReport(Builder builder) {
            this.day = builder.day;
            this.inboundCount = builder.inboundCount;
            this.inboundDurationByMinute = builder.inboundDurationByMinute;
            this.month = builder.month;
            this.number = builder.number;
            this.outboundCount = builder.outboundCount;
            this.outboundDurationByMinute = builder.outboundDurationByMinute;
            this.year = builder.year;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NumberReport create() {
            return builder().build();
        }

        /**
         * @return day
         */
        public Integer getDay() {
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
        public Integer getMonth() {
            return this.month;
        }

        /**
         * @return number
         */
        public String getNumber() {
            return this.number;
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
        public Integer getYear() {
            return this.year;
        }

        public static final class Builder {
            private Integer day; 
            private Long inboundCount; 
            private Long inboundDurationByMinute; 
            private Integer month; 
            private String number; 
            private Long outboundCount; 
            private Long outboundDurationByMinute; 
            private Integer year; 

            private Builder() {
            } 

            private Builder(NumberReport model) {
                this.day = model.day;
                this.inboundCount = model.inboundCount;
                this.inboundDurationByMinute = model.inboundDurationByMinute;
                this.month = model.month;
                this.number = model.number;
                this.outboundCount = model.outboundCount;
                this.outboundDurationByMinute = model.outboundDurationByMinute;
                this.year = model.year;
            } 

            /**
             * Day.
             */
            public Builder day(Integer day) {
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
            public Builder month(Integer month) {
                this.month = month;
                return this;
            }

            /**
             * Number.
             */
            public Builder number(String number) {
                this.number = number;
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
            public Builder year(Integer year) {
                this.year = year;
                return this;
            }

            public NumberReport build() {
                return new NumberReport(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCallMeasureSummaryReportResponseBody} extends {@link TeaModel}
     *
     * <p>GetCallMeasureSummaryReportResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NumberReport")
        private java.util.List<NumberReport> numberReport;

        private List(Builder builder) {
            this.numberReport = builder.numberReport;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return numberReport
         */
        public java.util.List<NumberReport> getNumberReport() {
            return this.numberReport;
        }

        public static final class Builder {
            private java.util.List<NumberReport> numberReport; 

            private Builder() {
            } 

            private Builder(List model) {
                this.numberReport = model.numberReport;
            } 

            /**
             * NumberReport.
             */
            public Builder numberReport(java.util.List<NumberReport> numberReport) {
                this.numberReport = numberReport;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCallMeasureSummaryReportResponseBody} extends {@link TeaModel}
     *
     * <p>GetCallMeasureSummaryReportResponseBody</p>
     */
    public static class NumberReports extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private List list;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private NumberReports(Builder builder) {
            this.list = builder.list;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NumberReports create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public List getList() {
            return this.list;
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
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private List list; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(NumberReports model) {
                this.list = model.list;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * List.
             */
            public Builder list(List list) {
                this.list = list;
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
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public NumberReports build() {
                return new NumberReports(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCallMeasureSummaryReportResponseBody} extends {@link TeaModel}
     *
     * <p>GetCallMeasureSummaryReportResponseBody</p>
     */
    public static class SummaryReport extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Day")
        private Integer day;

        @com.aliyun.core.annotation.NameInMap("InboundCount")
        private Long inboundCount;

        @com.aliyun.core.annotation.NameInMap("InboundDurationByMinute")
        private Long inboundDurationByMinute;

        @com.aliyun.core.annotation.NameInMap("Month")
        private Integer month;

        @com.aliyun.core.annotation.NameInMap("OutboundCount")
        private Long outboundCount;

        @com.aliyun.core.annotation.NameInMap("OutboundDurationByMinute")
        private Long outboundDurationByMinute;

        @com.aliyun.core.annotation.NameInMap("Year")
        private Integer year;

        private SummaryReport(Builder builder) {
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

        public static SummaryReport create() {
            return builder().build();
        }

        /**
         * @return day
         */
        public Integer getDay() {
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
        public Integer getMonth() {
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
        public Integer getYear() {
            return this.year;
        }

        public static final class Builder {
            private Integer day; 
            private Long inboundCount; 
            private Long inboundDurationByMinute; 
            private Integer month; 
            private Long outboundCount; 
            private Long outboundDurationByMinute; 
            private Integer year; 

            private Builder() {
            } 

            private Builder(SummaryReport model) {
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
            public Builder day(Integer day) {
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
            public Builder month(Integer month) {
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
            public Builder year(Integer year) {
                this.year = year;
                return this;
            }

            public SummaryReport build() {
                return new SummaryReport(this);
            } 

        } 

    }
}
