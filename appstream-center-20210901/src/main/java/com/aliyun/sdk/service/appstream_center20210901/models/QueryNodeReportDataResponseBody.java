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
 * {@link QueryNodeReportDataResponseBody} extends {@link TeaModel}
 *
 * <p>QueryNodeReportDataResponseBody</p>
 */
public class QueryNodeReportDataResponseBody extends TeaModel {
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

    private QueryNodeReportDataResponseBody(Builder builder) {
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

    public static QueryNodeReportDataResponseBody create() {
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

        private Builder(QueryNodeReportDataResponseBody model) {
            this.code = model.code;
            this.count = model.count;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.reportDataModel = model.reportDataModel;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The business status code. A value of 200 indicates that the request is successful. Other values indicate that the request failed.</p>
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
         * <p>The description of the request processing result. If the request is successful, success is usually returned.</p>
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
         * <p>The list of node report data.</p>
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

        public QueryNodeReportDataResponseBody build() {
            return new QueryNodeReportDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryNodeReportDataResponseBody} extends {@link TeaModel}
     *
     * <p>QueryNodeReportDataResponseBody</p>
     */
    public static class ReportDataModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeCount")
        private Long nodeCount;

        @com.aliyun.core.annotation.NameInMap("PostpaidNodeCount")
        private Long postpaidNodeCount;

        @com.aliyun.core.annotation.NameInMap("PrepaidNodeCount")
        private Long prepaidNodeCount;

        @com.aliyun.core.annotation.NameInMap("StatDate")
        private String statDate;

        private ReportDataModel(Builder builder) {
            this.nodeCount = builder.nodeCount;
            this.postpaidNodeCount = builder.postpaidNodeCount;
            this.prepaidNodeCount = builder.prepaidNodeCount;
            this.statDate = builder.statDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReportDataModel create() {
            return builder().build();
        }

        /**
         * @return nodeCount
         */
        public Long getNodeCount() {
            return this.nodeCount;
        }

        /**
         * @return postpaidNodeCount
         */
        public Long getPostpaidNodeCount() {
            return this.postpaidNodeCount;
        }

        /**
         * @return prepaidNodeCount
         */
        public Long getPrepaidNodeCount() {
            return this.prepaidNodeCount;
        }

        /**
         * @return statDate
         */
        public String getStatDate() {
            return this.statDate;
        }

        public static final class Builder {
            private Long nodeCount; 
            private Long postpaidNodeCount; 
            private Long prepaidNodeCount; 
            private String statDate; 

            private Builder() {
            } 

            private Builder(ReportDataModel model) {
                this.nodeCount = model.nodeCount;
                this.postpaidNodeCount = model.postpaidNodeCount;
                this.prepaidNodeCount = model.prepaidNodeCount;
                this.statDate = model.statDate;
            } 

            /**
             * <p>The total number of nodes for the record.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder nodeCount(Long nodeCount) {
                this.nodeCount = nodeCount;
                return this;
            }

            /**
             * <p>The number of pay-as-you-go nodes in the record.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder postpaidNodeCount(Long postpaidNodeCount) {
                this.postpaidNodeCount = postpaidNodeCount;
                return this;
            }

            /**
             * <p>The number of subscription nodes in the record.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder prepaidNodeCount(Long prepaidNodeCount) {
                this.prepaidNodeCount = prepaidNodeCount;
                return this;
            }

            /**
             * <p>The statistical time. The 1d granularity returns the time in the yyyy-MM-dd format. The 1m, 30m, and 6h granularities return the time in the yyyy-MM-dd HH:mm format. The string itself does not carry a time zone and is interpreted in the Asia/Shanghai (UTC+8) time zone.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-01</p>
             */
            public Builder statDate(String statDate) {
                this.statDate = statDate;
                return this;
            }

            public ReportDataModel build() {
                return new ReportDataModel(this);
            } 

        } 

    }
}
