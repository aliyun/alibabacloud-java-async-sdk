// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link CreateEnvironmentResponseBody} extends {@link TeaModel}
 *
 * <p>CreateEnvironmentResponseBody</p>
 */
public class CreateEnvironmentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateEnvironmentResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEnvironmentResponseBody create() {
        return builder().build();
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

        /**
         * <p>Response code.</p>
         * 
         * <strong>example:</strong>
         * <p>Ok</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID, used for tracing the API call chain.</p>
         * 
         * <strong>example:</strong>
         * <p>3C3B9A12-3868-5EB9-8BEA-F99E03DD125C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateEnvironmentResponseBody build() {
            return new CreateEnvironmentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateEnvironmentResponseBody} extends {@link TeaModel}
     *
     * <p>CreateEnvironmentResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("environmentId")
        private String environmentId;

        private Data(Builder builder) {
            this.environmentId = builder.environmentId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return environmentId
         */
        public String getEnvironmentId() {
            return this.environmentId;
        }

        public static final class Builder {
            private String environmentId; 

            /**
             * <p>Environment ID.</p>
             * 
             * <strong>example:</strong>
             * <p>env-cq7l5s5lhtgi6qasrdc0</p>
             */
            public Builder environmentId(String environmentId) {
                this.environmentId = environmentId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
