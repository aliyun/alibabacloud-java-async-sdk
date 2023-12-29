// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ErrorInfo} extends {@link TeaModel}
 *
 * <p>ErrorInfo</p>
 */
public class ErrorInfo extends TeaModel {
    @NameInMap("errorMessage")
    private String errorMessage;

    @NameInMap("stackTrace")
    private String stackTrace;

    private ErrorInfo(Builder builder) {
        this.errorMessage = builder.errorMessage;
        this.stackTrace = builder.stackTrace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ErrorInfo create() {
        return builder().build();
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return stackTrace
     */
    public String getStackTrace() {
        return this.stackTrace;
    }

    public static final class Builder {
        private String errorMessage; 
        private String stackTrace; 

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * stackTrace.
         */
        public Builder stackTrace(String stackTrace) {
            this.stackTrace = stackTrace;
            return this;
        }

        public ErrorInfo build() {
            return new ErrorInfo(this);
        } 

    } 

}
