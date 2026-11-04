// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link QuerySessionReportDataResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySessionReportDataResponseBody</p>
 */
public class QuerySessionReportDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("ReportDataModel")
    private java.util.List<ReportDataModel> reportDataModel;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QuerySessionReportDataResponseBody(Builder builder) {
        this.code = builder.code;
        this.count = builder.count;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.reportDataModel = builder.reportDataModel;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySessionReportDataResponseBody create() {
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
     * @return count
     */
    public Integer getCount() {
        return this.count;
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
     * @return reportDataModel
     */
    public java.util.List<ReportDataModel> getReportDataModel() {
        return this.reportDataModel;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Integer count; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List<ReportDataModel> reportDataModel; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QuerySessionReportDataResponseBody model) {
            this.code = model.code;
            this.count = model.count;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.reportDataModel = model.reportDataModel;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The business status code. <code>200</code> indicates that the request was processed successfully. Other values indicate that the processing failed.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The total number of records that meet the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The description of the request processing result. <code>success</code> is usually returned when the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number corresponding to the current response.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page used in the current response.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The list of session report data.</p>
         */
        public Builder reportDataModel(java.util.List<ReportDataModel> reportDataModel) {
            this.reportDataModel = reportDataModel;
            return this;
        }

        /**
         * <p>The unique identifier of the request, which can be used to troubleshoot request issues.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QuerySessionReportDataResponseBody build() {
            return new QuerySessionReportDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySessionReportDataResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySessionReportDataResponseBody</p>
     */
    public static class ReportDataModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectSessionCount")
        private Long connectSessionCount;

        @com.aliyun.core.annotation.NameInMap("SessionCount")
        private Long sessionCount;

        @com.aliyun.core.annotation.NameInMap("StatDate")
        private String statDate;

        @com.aliyun.core.annotation.NameInMap("StreamingSessionCount")
        private Long streamingSessionCount;

        private ReportDataModel(Builder builder) {
            this.connectSessionCount = builder.connectSessionCount;
            this.sessionCount = builder.sessionCount;
            this.statDate = builder.statDate;
            this.streamingSessionCount = builder.streamingSessionCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReportDataModel create() {
            return builder().build();
        }

        /**
         * @return connectSessionCount
         */
        public Long getConnectSessionCount() {
            return this.connectSessionCount;
        }

        /**
         * @return sessionCount
         */
        public Long getSessionCount() {
            return this.sessionCount;
        }

        /**
         * @return statDate
         */
        public String getStatDate() {
            return this.statDate;
        }

        /**
         * @return streamingSessionCount
         */
        public Long getStreamingSessionCount() {
            return this.streamingSessionCount;
        }

        public static final class Builder {
            private Long connectSessionCount; 
            private Long sessionCount; 
            private String statDate; 
            private Long streamingSessionCount; 

            private Builder() {
            } 

            private Builder(ReportDataModel model) {
                this.connectSessionCount = model.connectSessionCount;
                this.sessionCount = model.sessionCount;
                this.statDate = model.statDate;
                this.streamingSessionCount = model.streamingSessionCount;
            } 

            /**
             * <p>The number of connected sessions in the record.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder connectSessionCount(Long connectSessionCount) {
                this.connectSessionCount = connectSessionCount;
                return this;
            }

            /**
             * <p>The total number of sessions corresponding to the record.</p>
             * 
             * <strong>example:</strong>
             * <p>36</p>
             */
            public Builder sessionCount(Long sessionCount) {
                this.sessionCount = sessionCount;
                return this;
            }

            /**
             * <p>The statistical time. The <code>1d</code> granularity returns <code>yyyy-MM-dd</code>. The <code>1m</code>, <code>30m</code>, and <code>6h</code> granularities return <code>yyyy-MM-dd HH:mm</code>. The string itself does not carry a time zone and is interpreted in the Asia/Shanghai (UTC+8) time zone.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-01</p>
             */
            public Builder statDate(String statDate) {
                this.statDate = statDate;
                return this;
            }

            /**
             * <p>The number of sessions established through streaming access in the record.</p>
             * 
             * <strong>example:</strong>
             * <p>24</p>
             */
            public Builder streamingSessionCount(Long streamingSessionCount) {
                this.streamingSessionCount = streamingSessionCount;
                return this;
            }

            public ReportDataModel build() {
                return new ReportDataModel(this);
            } 

        } 

    }
}
