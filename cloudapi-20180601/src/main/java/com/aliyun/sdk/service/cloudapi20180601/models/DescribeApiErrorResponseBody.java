// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20180601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApiErrorResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApiErrorResponseBody</p>
 */
public class DescribeApiErrorResponseBody extends TeaModel {
    @NameInMap("ClientErrors")
    private ClientErrors clientErrors;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ServerErrors")
    private ServerErrors serverErrors;

    private DescribeApiErrorResponseBody(Builder builder) {
        this.clientErrors = builder.clientErrors;
        this.requestId = builder.requestId;
        this.serverErrors = builder.serverErrors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApiErrorResponseBody create() {
        return builder().build();
    }

    /**
     * @return clientErrors
     */
    public ClientErrors getClientErrors() {
        return this.clientErrors;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serverErrors
     */
    public ServerErrors getServerErrors() {
        return this.serverErrors;
    }

    public static final class Builder {
        private ClientErrors clientErrors; 
        private String requestId; 
        private ServerErrors serverErrors; 

        /**
         * ClientErrors.
         */
        public Builder clientErrors(ClientErrors clientErrors) {
            this.clientErrors = clientErrors;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ServerErrors.
         */
        public Builder serverErrors(ServerErrors serverErrors) {
            this.serverErrors = serverErrors;
            return this;
        }

        public DescribeApiErrorResponseBody build() {
            return new DescribeApiErrorResponseBody(this);
        } 

    } 

    public static class ClientError extends TeaModel {
        @NameInMap("Time")
        private String time;

        @NameInMap("Value")
        private String value;

        private ClientError(Builder builder) {
            this.time = builder.time;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientError create() {
            return builder().build();
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String time; 
            private String value; 

            /**
             * Time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ClientError build() {
                return new ClientError(this);
            } 

        } 

    }
    public static class ClientErrors extends TeaModel {
        @NameInMap("ClientError")
        private java.util.List < ClientError> clientError;

        private ClientErrors(Builder builder) {
            this.clientError = builder.clientError;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientErrors create() {
            return builder().build();
        }

        /**
         * @return clientError
         */
        public java.util.List < ClientError> getClientError() {
            return this.clientError;
        }

        public static final class Builder {
            private java.util.List < ClientError> clientError; 

            /**
             * ClientError.
             */
            public Builder clientError(java.util.List < ClientError> clientError) {
                this.clientError = clientError;
                return this;
            }

            public ClientErrors build() {
                return new ClientErrors(this);
            } 

        } 

    }
    public static class ServerError extends TeaModel {
        @NameInMap("Time")
        private String time;

        @NameInMap("Value")
        private String value;

        private ServerError(Builder builder) {
            this.time = builder.time;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServerError create() {
            return builder().build();
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String time; 
            private String value; 

            /**
             * Time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ServerError build() {
                return new ServerError(this);
            } 

        } 

    }
    public static class ServerErrors extends TeaModel {
        @NameInMap("ServerError")
        private java.util.List < ServerError> serverError;

        private ServerErrors(Builder builder) {
            this.serverError = builder.serverError;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServerErrors create() {
            return builder().build();
        }

        /**
         * @return serverError
         */
        public java.util.List < ServerError> getServerError() {
            return this.serverError;
        }

        public static final class Builder {
            private java.util.List < ServerError> serverError; 

            /**
             * ServerError.
             */
            public Builder serverError(java.util.List < ServerError> serverError) {
                this.serverError = serverError;
                return this;
            }

            public ServerErrors build() {
                return new ServerErrors(this);
            } 

        } 

    }
}
