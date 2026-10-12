// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link ValidateConnectionResponseBody} extends {@link TeaModel}
 *
 * <p>ValidateConnectionResponseBody</p>
 */
public class ValidateConnectionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Details")
    private java.util.Map<String, String> details;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ValidateConnectionResponseBody(Builder builder) {
        this.code = builder.code;
        this.details = builder.details;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateConnectionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return details
     */
    public java.util.Map<String, String> getDetails() {
        return this.details;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String code; 
        private java.util.Map<String, String> details; 
        private String message; 
        private String requestId; 
        private String status; 

        private Builder() {
        } 

        private Builder(ValidateConnectionResponseBody model) {
            this.code = model.code;
            this.details = model.details;
            this.message = model.message;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * <p>The error code returned if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>403</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The details of the validation result.</p>
         */
        public Builder details(java.util.Map<String, String> details) {
            this.details = details;
            return this;
        }

        /**
         * <p>A description of the validation result.</p>
         * 
         * <strong>example:</strong>
         * <p>The connection is reachable.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5A14FA81-DD4E-******-6343FE44B941</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The validation status.</p>
         * <ul>
         * <li><p>success: The validation is successful.</p>
         * </li>
         * <li><p>failed: The validation failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public ValidateConnectionResponseBody build() {
            return new ValidateConnectionResponseBody(this);
        } 

    } 

}
