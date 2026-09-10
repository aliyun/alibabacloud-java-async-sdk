// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link ValidateModuleResponseBody} extends {@link TeaModel}
 *
 * <p>ValidateModuleResponseBody</p>
 */
public class ValidateModuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("moduleValidationId")
    private String moduleValidationId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private ValidateModuleResponseBody(Builder builder) {
        this.message = builder.message;
        this.moduleValidationId = builder.moduleValidationId;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateModuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return moduleValidationId
     */
    public String getModuleValidationId() {
        return this.moduleValidationId;
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

    public static final class Builder {
        private String message; 
        private String moduleValidationId; 
        private String requestId; 
        private String status; 

        private Builder() {
        } 

        private Builder(ValidateModuleResponseBody model) {
            this.message = model.message;
            this.moduleValidationId = model.moduleValidationId;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * <p>The validation message.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The validation ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BF72A6FB-B07</p>
         */
        public Builder moduleValidationId(String moduleValidationId) {
            this.moduleValidationId = moduleValidationId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BF72A6FB-B071-5F2E-A036-9D62545B962C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The validation result. Valid values:</p>
         * <ul>
         * <li>Initializing: initialization in progress.</li>
         * <li>Validating: validation in progress.</li>
         * <li>Validated: validation succeeded.</li>
         * <li>Errored: validation failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Validating</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public ValidateModuleResponseBody build() {
            return new ValidateModuleResponseBody(this);
        } 

    } 

}
