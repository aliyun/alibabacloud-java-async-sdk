// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDiagnosticResponseBody} extends {@link TeaModel}
 *
 * <p>GetDiagnosticResponseBody</p>
 */
public class GetDiagnosticResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("DiagnosticKey")
    private String diagnosticKey;

    @NameInMap("DiagnosticProduct")
    private String diagnosticProduct;

    @NameInMap("DiagnosticResult")
    private DiagnosticResult diagnosticResult;

    @NameInMap("DiagnosticTime")
    private String diagnosticTime;

    @NameInMap("HttpCode")
    private String httpCode;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("Recommends")
    private java.util.Map < String, ? > recommends;

    @NameInMap("ReportId")
    private String reportId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    @NameInMap("StatusReason")
    private String statusReason;

    @NameInMap("Success")
    private String success;

    private GetDiagnosticResponseBody(Builder builder) {
        this.code = builder.code;
        this.diagnosticKey = builder.diagnosticKey;
        this.diagnosticProduct = builder.diagnosticProduct;
        this.diagnosticResult = builder.diagnosticResult;
        this.diagnosticTime = builder.diagnosticTime;
        this.httpCode = builder.httpCode;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.recommends = builder.recommends;
        this.reportId = builder.reportId;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.statusReason = builder.statusReason;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDiagnosticResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return diagnosticKey
     */
    public String getDiagnosticKey() {
        return this.diagnosticKey;
    }

    /**
     * @return diagnosticProduct
     */
    public String getDiagnosticProduct() {
        return this.diagnosticProduct;
    }

    /**
     * @return diagnosticResult
     */
    public DiagnosticResult getDiagnosticResult() {
        return this.diagnosticResult;
    }

    /**
     * @return diagnosticTime
     */
    public String getDiagnosticTime() {
        return this.diagnosticTime;
    }

    /**
     * @return httpCode
     */
    public String getHttpCode() {
        return this.httpCode;
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
     * @return recommends
     */
    public java.util.Map < String, ? > getRecommends() {
        return this.recommends;
    }

    /**
     * @return reportId
     */
    public String getReportId() {
        return this.reportId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return statusReason
     */
    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String diagnosticKey; 
        private String diagnosticProduct; 
        private DiagnosticResult diagnosticResult; 
        private String diagnosticTime; 
        private String httpCode; 
        private Integer httpStatusCode; 
        private String message; 
        private java.util.Map < String, ? > recommends; 
        private String reportId; 
        private String requestId; 
        private String status; 
        private String statusReason; 
        private String success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * DiagnosticKey.
         */
        public Builder diagnosticKey(String diagnosticKey) {
            this.diagnosticKey = diagnosticKey;
            return this;
        }

        /**
         * DiagnosticProduct.
         */
        public Builder diagnosticProduct(String diagnosticProduct) {
            this.diagnosticProduct = diagnosticProduct;
            return this;
        }

        /**
         * DiagnosticResult.
         */
        public Builder diagnosticResult(DiagnosticResult diagnosticResult) {
            this.diagnosticResult = diagnosticResult;
            return this;
        }

        /**
         * DiagnosticTime.
         */
        public Builder diagnosticTime(String diagnosticTime) {
            this.diagnosticTime = diagnosticTime;
            return this;
        }

        /**
         * HttpCode.
         */
        public Builder httpCode(String httpCode) {
            this.httpCode = httpCode;
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
         * Recommends.
         */
        public Builder recommends(java.util.Map < String, ? > recommends) {
            this.recommends = recommends;
            return this;
        }

        /**
         * ReportId.
         */
        public Builder reportId(String reportId) {
            this.reportId = reportId;
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
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * StatusReason.
         */
        public Builder statusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public GetDiagnosticResponseBody build() {
            return new GetDiagnosticResponseBody(this);
        } 

    } 

    public static class DiagnosticResult extends TeaModel {
        @NameInMap("FailedResources")
        private java.util.Map < String, ? > failedResources;

        @NameInMap("RosActionMessages")
        private java.util.Map < String, ? > rosActionMessages;

        @NameInMap("StackMessages")
        private java.util.Map < String, ? > stackMessages;

        private DiagnosticResult(Builder builder) {
            this.failedResources = builder.failedResources;
            this.rosActionMessages = builder.rosActionMessages;
            this.stackMessages = builder.stackMessages;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiagnosticResult create() {
            return builder().build();
        }

        /**
         * @return failedResources
         */
        public java.util.Map < String, ? > getFailedResources() {
            return this.failedResources;
        }

        /**
         * @return rosActionMessages
         */
        public java.util.Map < String, ? > getRosActionMessages() {
            return this.rosActionMessages;
        }

        /**
         * @return stackMessages
         */
        public java.util.Map < String, ? > getStackMessages() {
            return this.stackMessages;
        }

        public static final class Builder {
            private java.util.Map < String, ? > failedResources; 
            private java.util.Map < String, ? > rosActionMessages; 
            private java.util.Map < String, ? > stackMessages; 

            /**
             * FailedResources.
             */
            public Builder failedResources(java.util.Map < String, ? > failedResources) {
                this.failedResources = failedResources;
                return this;
            }

            /**
             * RosActionMessages.
             */
            public Builder rosActionMessages(java.util.Map < String, ? > rosActionMessages) {
                this.rosActionMessages = rosActionMessages;
                return this;
            }

            /**
             * StackMessages.
             */
            public Builder stackMessages(java.util.Map < String, ? > stackMessages) {
                this.stackMessages = stackMessages;
                return this;
            }

            public DiagnosticResult build() {
                return new DiagnosticResult(this);
            } 

        } 

    }
}
