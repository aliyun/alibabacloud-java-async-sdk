// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SavepointFailure} extends {@link TeaModel}
 *
 * <p>SavepointFailure</p>
 */
public class SavepointFailure extends TeaModel {
    @NameInMap("failedAt")
    private Long failedAt;

    @NameInMap("message")
    private String message;

    @NameInMap("reason")
    private String reason;

    private SavepointFailure(Builder builder) {
        this.failedAt = builder.failedAt;
        this.message = builder.message;
        this.reason = builder.reason;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SavepointFailure create() {
        return builder().build();
    }

    /**
     * @return failedAt
     */
    public Long getFailedAt() {
        return this.failedAt;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    public static final class Builder {
        private Long failedAt; 
        private String message; 
        private String reason; 

        /**
         * failedAt.
         */
        public Builder failedAt(Long failedAt) {
            this.failedAt = failedAt;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * reason.
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        public SavepointFailure build() {
            return new SavepointFailure(this);
        } 

    } 

}
