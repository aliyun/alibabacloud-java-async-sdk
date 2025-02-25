// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * {@link GetApiDestinationResponseBody} extends {@link TeaModel}
 *
 * <p>GetApiDestinationResponseBody</p>
 */
public class GetApiDestinationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetApiDestinationResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApiDestinationResponseBody create() {
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
         * The returned response code. The value Success indicates that the request is successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message. If the request is successful, success is returned. If the request failed, an error code is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetApiDestinationResponseBody build() {
            return new GetApiDestinationResponseBody(this);
        } 

    } 

    public static class HttpApiParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("Method")
        private String method;

        private HttpApiParameters(Builder builder) {
            this.endpoint = builder.endpoint;
            this.method = builder.method;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HttpApiParameters create() {
            return builder().build();
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        public static final class Builder {
            private String endpoint; 
            private String method; 

            /**
             * The endpoint of the API destination.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * The HTTP request method. Valid values:
             * <p>
             * 
             * *   POST
             * *   GET
             * *   DELETE
             * *   PUT
             * *   HEAD
             * *   TRACE
             * *   PATCH
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            public HttpApiParameters build() {
                return new HttpApiParameters(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiDestinationName")
        private String apiDestinationName;

        @com.aliyun.core.annotation.NameInMap("ConnectionName")
        private String connectionName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("HttpApiParameters")
        private HttpApiParameters httpApiParameters;

        private Data(Builder builder) {
            this.apiDestinationName = builder.apiDestinationName;
            this.connectionName = builder.connectionName;
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
            this.httpApiParameters = builder.httpApiParameters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return apiDestinationName
         */
        public String getApiDestinationName() {
            return this.apiDestinationName;
        }

        /**
         * @return connectionName
         */
        public String getConnectionName() {
            return this.connectionName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return httpApiParameters
         */
        public HttpApiParameters getHttpApiParameters() {
            return this.httpApiParameters;
        }

        public static final class Builder {
            private String apiDestinationName; 
            private String connectionName; 
            private String description; 
            private Long gmtCreate; 
            private HttpApiParameters httpApiParameters; 

            /**
             * The name of the API destination.
             */
            public Builder apiDestinationName(String apiDestinationName) {
                this.apiDestinationName = apiDestinationName;
                return this;
            }

            /**
             * The connection name.
             */
            public Builder connectionName(String connectionName) {
                this.connectionName = connectionName;
                return this;
            }

            /**
             * The description of the API destination.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The time when the API destination was created.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The request parameters that are configured for the API destination.
             */
            public Builder httpApiParameters(HttpApiParameters httpApiParameters) {
                this.httpApiParameters = httpApiParameters;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
