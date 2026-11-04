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
 * {@link QueryDauReportDataResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDauReportDataResponseBody</p>
 */
public class QueryDauReportDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("DauReportDataModel")
    private java.util.List<DauReportDataModel> dauReportDataModel;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryDauReportDataResponseBody(Builder builder) {
        this.code = builder.code;
        this.count = builder.count;
        this.dauReportDataModel = builder.dauReportDataModel;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDauReportDataResponseBody create() {
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
     * @return dauReportDataModel
     */
    public java.util.List<DauReportDataModel> getDauReportDataModel() {
        return this.dauReportDataModel;
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

    public static final class Builder {
        private String code; 
        private Integer count; 
        private java.util.List<DauReportDataModel> dauReportDataModel; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QueryDauReportDataResponseBody model) {
            this.code = model.code;
            this.count = model.count;
            this.dauReportDataModel = model.dauReportDataModel;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The business status code. A value of <code>200</code> indicates that the request was processed. Other values indicate that the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The total number of entries that meet the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The list of daily active user report data.</p>
         */
        public Builder dauReportDataModel(java.util.List<DauReportDataModel> dauReportDataModel) {
            this.dauReportDataModel = dauReportDataModel;
            return this;
        }

        /**
         * <p>The message about the request processing result. If the request is successful, <code>success</code> is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number of the current response.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page in the current response.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The unique identifier of the request. You can use this ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryDauReportDataResponseBody build() {
            return new QueryDauReportDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDauReportDataResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDauReportDataResponseBody</p>
     */
    public static class DauReportDataModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dau")
        private Long dau;

        @com.aliyun.core.annotation.NameInMap("StatDate")
        private String statDate;

        @com.aliyun.core.annotation.NameInMap("StreamingDau")
        private Long streamingDau;

        private DauReportDataModel(Builder builder) {
            this.dau = builder.dau;
            this.statDate = builder.statDate;
            this.streamingDau = builder.streamingDau;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DauReportDataModel create() {
            return builder().build();
        }

        /**
         * @return dau
         */
        public Long getDau() {
            return this.dau;
        }

        /**
         * @return statDate
         */
        public String getStatDate() {
            return this.statDate;
        }

        /**
         * @return streamingDau
         */
        public Long getStreamingDau() {
            return this.streamingDau;
        }

        public static final class Builder {
            private Long dau; 
            private String statDate; 
            private Long streamingDau; 

            private Builder() {
            } 

            private Builder(DauReportDataModel model) {
                this.dau = model.dau;
                this.statDate = model.statDate;
                this.streamingDau = model.streamingDau;
            } 

            /**
             * <p>The number of active users within the statistical period. Unit: users.</p>
             * 
             * <strong>example:</strong>
             * <p>128</p>
             */
            public Builder dau(Long dau) {
                this.dau = dau;
                return this;
            }

            /**
             * <p>The statistical date. Format: <code>yyyy-MM-dd</code>. The string does not contain time zone information and is interpreted as a calendar date in the Asia/Shanghai (UTC+8) time zone.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-01</p>
             */
            public Builder statDate(String statDate) {
                this.statDate = statDate;
                return this;
            }

            /**
             * <p>The number of active users who initiated sessions through streaming access within the statistical period. Unit: users.</p>
             * 
             * <strong>example:</strong>
             * <p>96</p>
             */
            public Builder streamingDau(Long streamingDau) {
                this.streamingDau = streamingDau;
                return this;
            }

            public DauReportDataModel build() {
                return new DauReportDataModel(this);
            } 

        } 

    }
}
