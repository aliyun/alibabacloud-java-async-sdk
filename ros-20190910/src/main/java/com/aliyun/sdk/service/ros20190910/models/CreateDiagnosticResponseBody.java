// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDiagnosticResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDiagnosticResponseBody</p>
 */
public class CreateDiagnosticResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DiagnosticType")
    private String diagnosticType;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("ReportId")
    private String reportId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private CreateDiagnosticResponseBody(Builder builder) {
        this.code = builder.code;
        this.diagnosticType = builder.diagnosticType;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.reportId = builder.reportId;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDiagnosticResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return diagnosticType
     */
    public String getDiagnosticType() {
        return this.diagnosticType;
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
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String diagnosticType; 
        private Integer httpStatusCode; 
        private String message; 
        private String reportId; 
        private String requestId; 
        private String success; 

        /**
         * The error code returned.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The type of the item that is diagnosed.
         */
        public Builder diagnosticType(String diagnosticType) {
            this.diagnosticType = diagnosticType;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the diagnostic report.
         */
        public Builder reportId(String reportId) {
            this.reportId = reportId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public CreateDiagnosticResponseBody build() {
            return new CreateDiagnosticResponseBody(this);
        } 

    } 

}
