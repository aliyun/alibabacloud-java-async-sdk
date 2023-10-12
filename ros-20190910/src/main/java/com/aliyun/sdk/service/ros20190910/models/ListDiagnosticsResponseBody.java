// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDiagnosticsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDiagnosticsResponseBody</p>
 */
public class ListDiagnosticsResponseBody extends TeaModel {
    @NameInMap("Diagnostics")
    private java.util.List < Diagnostics> diagnostics;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    private ListDiagnosticsResponseBody(Builder builder) {
        this.diagnostics = builder.diagnostics;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDiagnosticsResponseBody create() {
        return builder().build();
    }

    /**
     * @return diagnostics
     */
    public java.util.List < Diagnostics> getDiagnostics() {
        return this.diagnostics;
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
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private java.util.List < Diagnostics> diagnostics; 
        private Integer httpStatusCode; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private String success; 

        /**
         * Diagnostics.
         */
        public Builder diagnostics(java.util.List < Diagnostics> diagnostics) {
            this.diagnostics = diagnostics;
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
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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

        public ListDiagnosticsResponseBody build() {
            return new ListDiagnosticsResponseBody(this);
        } 

    } 

    public static class Diagnostics extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DiagnosticKey")
        private String diagnosticKey;

        @NameInMap("DiagnosticProduct")
        private String diagnosticProduct;

        @NameInMap("ReportId")
        private String reportId;

        @NameInMap("Status")
        private String status;

        private Diagnostics(Builder builder) {
            this.createTime = builder.createTime;
            this.diagnosticKey = builder.diagnosticKey;
            this.diagnosticProduct = builder.diagnosticProduct;
            this.reportId = builder.reportId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Diagnostics create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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
         * @return reportId
         */
        public String getReportId() {
            return this.reportId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String createTime; 
            private String diagnosticKey; 
            private String diagnosticProduct; 
            private String reportId; 
            private String status; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * ReportId.
             */
            public Builder reportId(String reportId) {
                this.reportId = reportId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Diagnostics build() {
                return new Diagnostics(this);
            } 

        } 

    }
}
