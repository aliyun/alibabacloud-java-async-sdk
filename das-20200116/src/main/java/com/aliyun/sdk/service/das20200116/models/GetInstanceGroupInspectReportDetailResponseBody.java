// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link GetInstanceGroupInspectReportDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceGroupInspectReportDetailResponseBody</p>
 */
public class GetInstanceGroupInspectReportDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private GetInstanceGroupInspectReportDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceGroupInspectReportDetailResponseBody create() {
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
     * @return data
     */
    public Data getData() {
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
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(GetInstanceGroupInspectReportDetailResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>ReportDetail</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message returned for the request.</p>
         * <blockquote>
         * <p>If the request is successful, <strong>Successful</strong> is returned. If the request fails, exception information such as an error code is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li>true: The request is successful.</li>
         * <li>false: The request fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public GetInstanceGroupInspectReportDetailResponseBody build() {
            return new GetInstanceGroupInspectReportDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInstanceGroupInspectReportDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceGroupInspectReportDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReportDetail")
        private String reportDetail;

        @com.aliyun.core.annotation.NameInMap("ReportId")
        private String reportId;

        private Data(Builder builder) {
            this.reportDetail = builder.reportDetail;
            this.reportId = builder.reportId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return reportDetail
         */
        public String getReportDetail() {
            return this.reportDetail;
        }

        /**
         * @return reportId
         */
        public String getReportId() {
            return this.reportId;
        }

        public static final class Builder {
            private String reportDetail; 
            private String reportId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.reportDetail = model.reportDetail;
                this.reportId = model.reportId;
            } 

            /**
             * <p>The content of the operations report, which mainly includes the report date and diagnostic details of managed instances.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;### Summary\n\nReport date: 2025-12-10  \nComparison period: [previous day] → 2025-12-10 The rest is omitted&quot;</p>
             */
            public Builder reportDetail(String reportDetail) {
                this.reportDetail = reportDetail;
                return this;
            }

            /**
             * <p>The report ID.</p>
             * 
             * <strong>example:</strong>
             * <p>13f52040-5a6e-42c3-bb84-051f5d6d****</p>
             */
            public Builder reportId(String reportId) {
                this.reportId = reportId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
