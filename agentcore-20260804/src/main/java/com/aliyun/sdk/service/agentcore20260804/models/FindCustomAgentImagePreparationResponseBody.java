// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link FindCustomAgentImagePreparationResponseBody} extends {@link TeaModel}
 *
 * <p>FindCustomAgentImagePreparationResponseBody</p>
 */
public class FindCustomAgentImagePreparationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private FindCustomAgentImagePreparationResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindCustomAgentImagePreparationResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(FindCustomAgentImagePreparationResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business status code.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The preparation query result. For the asynchronous execution status, refer to the phase.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426614174000</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the API call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public FindCustomAgentImagePreparationResponseBody build() {
            return new FindCustomAgentImagePreparationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link FindCustomAgentImagePreparationResponseBody} extends {@link TeaModel}
     *
     * <p>FindCustomAgentImagePreparationResponseBody</p>
     */
    public static class Error extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        private Error(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Error create() {
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

        public static final class Builder {
            private String code; 
            private String message; 

            private Builder() {
            } 

            private Builder(Error model) {
                this.code = model.code;
                this.message = model.message;
            } 

            /**
             * <p>The business error code for image preparation. This code is used to identify the failure type. For the specific cause, refer to the message.</p>
             * 
             * <strong>example:</strong>
             * <p>ImageSyncFailed</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The specific cause of the failure. This may include underlying errors such as image not found, authentication failure, network timeout, or certificate verification error. Passwords, tokens, or authentication headers are not returned. If the underlying system does not provide a cause, a general description is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>tls: failed to verify certificate: x509: certificate signed by unknown authority</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public Error build() {
                return new Error(this);
            } 

        } 

    }
    /**
     * 
     * {@link FindCustomAgentImagePreparationResponseBody} extends {@link TeaModel}
     *
     * <p>FindCustomAgentImagePreparationResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("error")
        private Error error;

        @com.aliyun.core.annotation.NameInMap("failedPhase")
        private String failedPhase;

        @com.aliyun.core.annotation.NameInMap("phase")
        private String phase;

        @com.aliyun.core.annotation.NameInMap("preparationId")
        private String preparationId;

        private Data(Builder builder) {
            this.agentId = builder.agentId;
            this.error = builder.error;
            this.failedPhase = builder.failedPhase;
            this.phase = builder.phase;
            this.preparationId = builder.preparationId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return error
         */
        public Error getError() {
            return this.error;
        }

        /**
         * @return failedPhase
         */
        public String getFailedPhase() {
            return this.failedPhase;
        }

        /**
         * @return phase
         */
        public String getPhase() {
            return this.phase;
        }

        /**
         * @return preparationId
         */
        public String getPreparationId() {
            return this.preparationId;
        }

        public static final class Builder {
            private String agentId; 
            private Error error; 
            private String failedPhase; 
            private String phase; 
            private String preparationId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.agentId = model.agentId;
                this.error = model.error;
                this.failedPhase = model.failedPhase;
                this.phase = model.phase;
                this.preparationId = model.preparationId;
            } 

            /**
             * <p>The ID of the target agent.</p>
             * 
             * <strong>example:</strong>
             * <p>agent-example</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The security error. This parameter is returned only when the task fails. Otherwise, the value is null.</p>
             */
            public Builder error(Error error) {
                this.error = error;
                return this;
            }

            /**
             * <p>The phase where the failure occurred. This parameter is returned only when the phase is FAILED. Otherwise, the value is null.</p>
             * 
             * <strong>example:</strong>
             * <p>COPYING</p>
             */
            public Builder failedPhase(String failedPhase) {
                this.failedPhase = failedPhase;
                return this;
            }

            /**
             * <p>The current phase. Only SUCCEEDED indicates that the target version is deployed successfully.</p>
             * 
             * <strong>example:</strong>
             * <p>FAILED</p>
             */
            public Builder phase(String phase) {
                this.phase = phase;
                return this;
            }

            /**
             * <p>The ID of the task submitted in the console.</p>
             * 
             * <strong>example:</strong>
             * <p>agent-example:1</p>
             */
            public Builder preparationId(String preparationId) {
                this.preparationId = preparationId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
