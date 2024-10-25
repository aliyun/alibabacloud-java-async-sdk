// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PutHybridMonitorMetricDataResponseBody} extends {@link TeaModel}
 *
 * <p>PutHybridMonitorMetricDataResponseBody</p>
 */
public class PutHybridMonitorMetricDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ErrorDetail")
    private java.util.List < ErrorDetail> errorDetail;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private PutHybridMonitorMetricDataResponseBody(Builder builder) {
        this.code = builder.code;
        this.errorDetail = builder.errorDetail;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutHybridMonitorMetricDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return errorDetail
     */
    public java.util.List < ErrorDetail> getErrorDetail() {
        return this.errorDetail;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < ErrorDetail> errorDetail; 
        private String requestId; 

        /**
         * <p>The HTTP status code.</p>
         * <blockquote>
         * <p> The status code 200 indicates that the request was successful.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The details of invalid parameters.</p>
         * <p>If a request parameter is invalid, the details of the invalid parameter are returned.</p>
         */
        public Builder errorDetail(java.util.List < ErrorDetail> errorDetail) {
            this.errorDetail = errorDetail;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5DB1CBCA-D14A-55FA-814F-B4DBD9735F68</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PutHybridMonitorMetricDataResponseBody build() {
            return new PutHybridMonitorMetricDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PutHybridMonitorMetricDataResponseBody} extends {@link TeaModel}
     *
     * <p>PutHybridMonitorMetricDataResponseBody</p>
     */
    public static class ErrorDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Index")
        private Long index;

        private ErrorDetail(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.index = builder.index;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorDetail create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return index
         */
        public Long getIndex() {
            return this.index;
        }

        public static final class Builder {
            private String errorMessage; 
            private Long index; 

            /**
             * <p>The error message of the invalid parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>label name :123 not match [a-zA-Z_][a-zA-Z0-9_]*</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The position of the error message in the array.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder index(Long index) {
                this.index = index;
                return this;
            }

            public ErrorDetail build() {
                return new ErrorDetail(this);
            } 

        } 

    }
}
