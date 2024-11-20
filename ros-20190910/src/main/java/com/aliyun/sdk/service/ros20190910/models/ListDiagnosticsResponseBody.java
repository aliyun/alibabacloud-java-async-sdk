// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDiagnosticsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDiagnosticsResponseBody</p>
 */
public class ListDiagnosticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Diagnostics")
    private java.util.List < Diagnostics> diagnostics;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The items that are diagnosed.</p>
         */
        public Builder diagnostics(java.util.List < Diagnostics> diagnostics) {
            this.diagnostics = diagnostics;
            return this;
        }

        /**
         * <p>The HTTP status code returned. The value 200 indicates that the request was successful.</p>
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
         * <p>You are not authorized to complete this action.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f01****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1983D1C4-88EA-5D7D-90AB-467D01867A5D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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

        public ListDiagnosticsResponseBody build() {
            return new ListDiagnosticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDiagnosticsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDiagnosticsResponseBody</p>
     */
    public static class Diagnostics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DiagnosticKey")
        private String diagnosticKey;

        @com.aliyun.core.annotation.NameInMap("DiagnosticProduct")
        private String diagnosticProduct;

        @com.aliyun.core.annotation.NameInMap("ReportId")
        private String reportId;

        @com.aliyun.core.annotation.NameInMap("Status")
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
             * <p>The time when the diagnostic report was generated.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-08-01T02:23:55</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The keyword in the diagnosis.</p>
             * 
             * <strong>example:</strong>
             * <p>047D84D9-D3EB-5DA8-87F1-9A7DD5598A5D</p>
             */
            public Builder diagnosticKey(String diagnosticKey) {
                this.diagnosticKey = diagnosticKey;
                return this;
            }

            /**
             * <p>The product that is diagnosed.</p>
             * 
             * <strong>example:</strong>
             * <p>ros</p>
             */
            public Builder diagnosticProduct(String diagnosticProduct) {
                this.diagnosticProduct = diagnosticProduct;
                return this;
            }

            /**
             * <p>The ID of the diagnostic report.</p>
             * 
             * <strong>example:</strong>
             * <p>dr-2963bfbcac834f1a****</p>
             */
            public Builder reportId(String reportId) {
                this.reportId = reportId;
                return this;
            }

            /**
             * <p>The diagnosis status.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
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
