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
         * Code.
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
             * ReportDetail.
             */
            public Builder reportDetail(String reportDetail) {
                this.reportDetail = reportDetail;
                return this;
            }

            /**
             * ReportId.
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
