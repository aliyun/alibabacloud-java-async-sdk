// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qweneduaisuite20261102.models;

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
 * {@link GetQwenEduApiActivationStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetQwenEduApiActivationStatusResponseBody</p>
 */
public class GetQwenEduApiActivationStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetQwenEduApiActivationStatusResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQwenEduApiActivationStatusResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetQwenEduApiActivationStatusResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The API status or POP error code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The activation result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request error message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The <strong>POP request ID</strong>. This field is not returned if signature verification or identity authentication fails.</p>
         * 
         * <strong>example:</strong>
         * <p>5C5E3F0A-2B0E-4F7B-9C55-0E1A6A0E2F11</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetQwenEduApiActivationStatusResponseBody build() {
            return new GetQwenEduApiActivationStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetQwenEduApiActivationStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetQwenEduApiActivationStatusResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("failCode")
        private String failCode;

        @com.aliyun.core.annotation.NameInMap("failMessage")
        private String failMessage;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Data(Builder builder) {
            this.failCode = builder.failCode;
            this.failMessage = builder.failMessage;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return failCode
         */
        public String getFailCode() {
            return this.failCode;
        }

        /**
         * @return failMessage
         */
        public String getFailMessage() {
            return this.failMessage;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String failCode; 
            private String failMessage; 
            private String status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.failCode = model.failCode;
                this.failMessage = model.failMessage;
                this.status = model.status;
            } 

            /**
             * <p>The <strong>failure code</strong>. For more information, see 3.4.</p>
             * 
             * <strong>example:</strong>
             * <p>ACTIVATION_FAILED</p>
             */
            public Builder failCode(String failCode) {
                this.failCode = failCode;
                return this;
            }

            /**
             * <p>The <strong>failure description</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>Service activation failed. Try again later</p>
             */
            public Builder failMessage(String failMessage) {
                this.failMessage = failMessage;
                return this;
            }

            /**
             * <p>The activation status. Valid values:</p>
             * <ul>
             * <li>ACTIVE: Activated.</li>
             * <li>ACTIVATING: Activating.</li>
             * <li>FAILED: Activation failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ACTIVE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
