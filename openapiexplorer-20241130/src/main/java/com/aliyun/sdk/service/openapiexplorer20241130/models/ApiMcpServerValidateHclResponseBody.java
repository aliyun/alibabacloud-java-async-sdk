// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openapiexplorer20241130.models;

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
 * {@link ApiMcpServerValidateHclResponseBody} extends {@link TeaModel}
 *
 * <p>ApiMcpServerValidateHclResponseBody</p>
 */
public class ApiMcpServerValidateHclResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("diagnosticReport")
    private Object diagnosticReport;

    @com.aliyun.core.annotation.NameInMap("errors")
    private java.util.List<String> errors;

    @com.aliyun.core.annotation.NameInMap("hash")
    private String hash;

    @com.aliyun.core.annotation.NameInMap("isValid")
    private Boolean isValid;

    @com.aliyun.core.annotation.NameInMap("parameters")
    private java.util.List<?> parameters;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("warnings")
    private java.util.List<String> warnings;

    private ApiMcpServerValidateHclResponseBody(Builder builder) {
        this.diagnosticReport = builder.diagnosticReport;
        this.errors = builder.errors;
        this.hash = builder.hash;
        this.isValid = builder.isValid;
        this.parameters = builder.parameters;
        this.requestId = builder.requestId;
        this.warnings = builder.warnings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApiMcpServerValidateHclResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return diagnosticReport
     */
    public Object getDiagnosticReport() {
        return this.diagnosticReport;
    }

    /**
     * @return errors
     */
    public java.util.List<String> getErrors() {
        return this.errors;
    }

    /**
     * @return hash
     */
    public String getHash() {
        return this.hash;
    }

    /**
     * @return isValid
     */
    public Boolean getIsValid() {
        return this.isValid;
    }

    /**
     * @return parameters
     */
    public java.util.List<?> getParameters() {
        return this.parameters;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return warnings
     */
    public java.util.List<String> getWarnings() {
        return this.warnings;
    }

    public static final class Builder {
        private Object diagnosticReport; 
        private java.util.List<String> errors; 
        private String hash; 
        private Boolean isValid; 
        private java.util.List<?> parameters; 
        private String requestId; 
        private java.util.List<String> warnings; 

        private Builder() {
        } 

        private Builder(ApiMcpServerValidateHclResponseBody model) {
            this.diagnosticReport = model.diagnosticReport;
            this.errors = model.errors;
            this.hash = model.hash;
            this.isValid = model.isValid;
            this.parameters = model.parameters;
            this.requestId = model.requestId;
            this.warnings = model.warnings;
        } 

        /**
         * diagnosticReport.
         */
        public Builder diagnosticReport(Object diagnosticReport) {
            this.diagnosticReport = diagnosticReport;
            return this;
        }

        /**
         * errors.
         */
        public Builder errors(java.util.List<String> errors) {
            this.errors = errors;
            return this;
        }

        /**
         * hash.
         */
        public Builder hash(String hash) {
            this.hash = hash;
            return this;
        }

        /**
         * isValid.
         */
        public Builder isValid(Boolean isValid) {
            this.isValid = isValid;
            return this;
        }

        /**
         * parameters.
         */
        public Builder parameters(java.util.List<?> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * warnings.
         */
        public Builder warnings(java.util.List<String> warnings) {
            this.warnings = warnings;
            return this;
        }

        public ApiMcpServerValidateHclResponseBody build() {
            return new ApiMcpServerValidateHclResponseBody(this);
        } 

    } 

}
