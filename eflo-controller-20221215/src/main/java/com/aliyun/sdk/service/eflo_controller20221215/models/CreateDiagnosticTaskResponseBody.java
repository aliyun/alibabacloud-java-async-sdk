// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link CreateDiagnosticTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDiagnosticTaskResponseBody</p>
 */
public class CreateDiagnosticTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DiagnosticId")
    private String diagnosticId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateDiagnosticTaskResponseBody(Builder builder) {
        this.diagnosticId = builder.diagnosticId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDiagnosticTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return diagnosticId
     */
    public String getDiagnosticId() {
        return this.diagnosticId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String diagnosticId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateDiagnosticTaskResponseBody model) {
            this.diagnosticId = model.diagnosticId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Diagnosis ID</p>
         * 
         * <strong>example:</strong>
         * <p>diag-i150553931717380274931</p>
         */
        public Builder diagnosticId(String diagnosticId) {
            this.diagnosticId = diagnosticId;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>A511C02A-0127-51AA-A9F9-966382C9A1B5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDiagnosticTaskResponseBody build() {
            return new CreateDiagnosticTaskResponseBody(this);
        } 

    } 

}
