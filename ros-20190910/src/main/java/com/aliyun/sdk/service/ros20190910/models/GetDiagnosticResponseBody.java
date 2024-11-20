// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDiagnosticResponseBody} extends {@link TeaModel}
 *
 * <p>GetDiagnosticResponseBody</p>
 */
public class GetDiagnosticResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DiagnosticKey")
    private String diagnosticKey;

    @com.aliyun.core.annotation.NameInMap("DiagnosticProduct")
    private String diagnosticProduct;

    @com.aliyun.core.annotation.NameInMap("DiagnosticResult")
    private DiagnosticResult diagnosticResult;

    @com.aliyun.core.annotation.NameInMap("DiagnosticTime")
    private String diagnosticTime;

    @com.aliyun.core.annotation.NameInMap("HttpCode")
    private String httpCode;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Recommends")
    private java.util.Map < String, ? > recommends;

    @com.aliyun.core.annotation.NameInMap("ReportId")
    private String reportId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("StatusReason")
    private String statusReason;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The error code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Forbidden</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The keyword in the diagnosis.</p>
         * 
         * <strong>example:</strong>
         * <p>0938F60C-A2CA-5A2E-9983-03EB1E6D7AE2</p>
         */
        public Builder diagnosticKey(String diagnosticKey) {
            this.diagnosticKey = diagnosticKey;
            return this;
        }

        /**
         * <p>The name of the diagnostic item.</p>
         * 
         * <strong>example:</strong>
         * <p>ros</p>
         */
        public Builder diagnosticProduct(String diagnosticProduct) {
            this.diagnosticProduct = diagnosticProduct;
            return this;
        }

        /**
         * <p>The diagnosis result.</p>
         */
        public Builder diagnosticResult(DiagnosticResult diagnosticResult) {
            this.diagnosticResult = diagnosticResult;
            return this;
        }

        /**
         * <p>The time when the diagnosis was performed.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-27T03:32:03Z</p>
         */
        public Builder diagnosticTime(String diagnosticTime) {
            this.diagnosticTime = diagnosticTime;
            return this;
        }

        /**
         * <p>The HTTP status code</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpCode(String httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified parameter ReportId is invalid, Can not find diagnostic report dr-5f6135782f104b0f****.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The suggestion for the diagnosis.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;RosActionMessages&quot;: {&quot;Reason&quot;: &quot;Fail to delete stack (fc966920-450a-456b-983c-deeaec8e****), as deletion protection is enabled.&quot;, &quot;Recommend&quot;: &quot;&quot;}}</p>
         */
        public Builder recommends(java.util.Map < String, ? > recommends) {
            this.recommends = recommends;
            return this;
        }

        /**
         * <p>The ID of the diagnostic report.</p>
         * 
         * <strong>example:</strong>
         * <p>dr-cc80afc48c8741e9****</p>
         */
        public Builder reportId(String reportId) {
            this.reportId = reportId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>96A24844-9603-5E79-BDF4-EFD412FC5D4C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The diagnosis status. Valid values:</p>
         * <ul>
         * <li>Running: The diagnosis is in progress.</li>
         * <li>Complete: The diagnosis is complete.</li>
         * <li>Failed: The diagnosis failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The reason for the diagnosis status.</p>
         * 
         * <strong>example:</strong>
         * <p>Complete</p>
         */
        public Builder statusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public GetDiagnosticResponseBody build() {
            return new GetDiagnosticResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDiagnosticResponseBody} extends {@link TeaModel}
     *
     * <p>GetDiagnosticResponseBody</p>
     */
    public static class DiagnosticResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailedResources")
        private java.util.Map < String, ? > failedResources;

        @com.aliyun.core.annotation.NameInMap("RosActionMessages")
        private java.util.Map < String, ? > rosActionMessages;

        @com.aliyun.core.annotation.NameInMap("StackMessages")
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
             * <p>The resources that failed to be diagnosed.</p>
             */
            public Builder failedResources(java.util.Map < String, ? > failedResources) {
                this.failedResources = failedResources;
                return this;
            }

            /**
             * <p>The information about Resource Orchestration Service (ROS) calling.</p>
             */
            public Builder rosActionMessages(java.util.Map < String, ? > rosActionMessages) {
                this.rosActionMessages = rosActionMessages;
                return this;
            }

            /**
             * <p>The stack information.</p>
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
