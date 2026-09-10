// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link ListDataCheckReportInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataCheckReportInstanceResponseBody</p>
 */
public class ListDataCheckReportInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("errMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private ListDataCheckReportInstanceResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataCheckReportInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
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
        private java.util.List<Data> data; 
        private String errCode; 
        private String errMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListDataCheckReportInstanceResponseBody model) {
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The list of report historical instances.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code. An empty string is returned if the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message. An empty string is returned if the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The request ID, which is used to locate and troubleshoot issues for this call.</p>
         * 
         * <strong>example:</strong>
         * <p>4C467B38-3910-4477-9B0B-6963D83B4E72</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful. Valid values:</p>
         * <ul>
         * <li>true: The call is successful.</li>
         * <li>false: The call failed. Troubleshoot by using errCode and errMessage.</li>
         * </ul>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListDataCheckReportInstanceResponseBody build() {
            return new ListDataCheckReportInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataCheckReportInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataCheckReportInstanceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("batchId")
        private String batchId;

        @com.aliyun.core.annotation.NameInMap("label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("reportTime")
        private String reportTime;

        private Data(Builder builder) {
            this.batchId = builder.batchId;
            this.label = builder.label;
            this.reportTime = builder.reportTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return batchId
         */
        public String getBatchId() {
            return this.batchId;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return reportTime
         */
        public String getReportTime() {
            return this.reportTime;
        }

        public static final class Builder {
            private String batchId; 
            private String label; 
            private String reportTime; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.batchId = model.batchId;
                this.label = model.label;
                this.reportTime = model.reportTime;
            } 

            /**
             * <p>The batch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>20001</p>
             */
            public Builder batchId(String batchId) {
                this.batchId = batchId;
                return this;
            }

            /**
             * <p>The report label.</p>
             * 
             * <strong>example:</strong>
             * <p>daily_check</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The report generation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-01 12:00:00</p>
             */
            public Builder reportTime(String reportTime) {
                this.reportTime = reportTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
