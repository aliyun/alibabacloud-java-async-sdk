// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link GetTrainingJobErrorInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetTrainingJobErrorInfoResponseBody</p>
 */
public class GetTrainingJobErrorInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorInfo")
    private ErrorInfo errorInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetTrainingJobErrorInfoResponseBody(Builder builder) {
        this.errorInfo = builder.errorInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTrainingJobErrorInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorInfo
     */
    public ErrorInfo getErrorInfo() {
        return this.errorInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ErrorInfo errorInfo; 
        private String requestId; 

        /**
         * ErrorInfo.
         */
        public Builder errorInfo(ErrorInfo errorInfo) {
            this.errorInfo = errorInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetTrainingJobErrorInfoResponseBody build() {
            return new GetTrainingJobErrorInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTrainingJobErrorInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetTrainingJobErrorInfoResponseBody</p>
     */
    public static class ErrorInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdditionalInfo")
        private String additionalInfo;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        private ErrorInfo(Builder builder) {
            this.additionalInfo = builder.additionalInfo;
            this.code = builder.code;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorInfo create() {
            return builder().build();
        }

        /**
         * @return additionalInfo
         */
        public String getAdditionalInfo() {
            return this.additionalInfo;
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

        public static final class Builder {
            private String additionalInfo; 
            private String code; 
            private String message; 

            /**
             * AdditionalInfo.
             */
            public Builder additionalInfo(String additionalInfo) {
                this.additionalInfo = additionalInfo;
                return this;
            }

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public ErrorInfo build() {
                return new ErrorInfo(this);
            } 

        } 

    }
}
