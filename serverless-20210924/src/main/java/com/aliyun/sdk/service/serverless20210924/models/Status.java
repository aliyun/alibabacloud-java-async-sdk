// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Status} extends {@link TeaModel}
 *
 * <p>Status</p>
 */
public class Status extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("message")
    private String message;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    @Validation(required = true)
    private Boolean success;

    private Status(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Status create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * A machine-readable description of why this operation is in the failure status. If this value is empty there is no information available.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * A human-readable description of the status of this operation.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * ID of the request. May be null.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Whether the operation is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public Status build() {
            return new Status(this);
        } 

    } 

}
