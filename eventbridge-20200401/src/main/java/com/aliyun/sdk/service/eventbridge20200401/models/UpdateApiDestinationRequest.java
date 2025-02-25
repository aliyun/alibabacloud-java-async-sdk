// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * {@link UpdateApiDestinationRequest} extends {@link RequestModel}
 *
 * <p>UpdateApiDestinationRequest</p>
 */
public class UpdateApiDestinationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiDestinationName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 127, minLength = 2)
    private String apiDestinationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionName")
    @com.aliyun.core.annotation.Validation(maxLength = 127, minLength = 2)
    private String connectionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 255)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HttpApiParameters")
    private HttpApiParameters httpApiParameters;

    private UpdateApiDestinationRequest(Builder builder) {
        super(builder);
        this.apiDestinationName = builder.apiDestinationName;
        this.connectionName = builder.connectionName;
        this.description = builder.description;
        this.httpApiParameters = builder.httpApiParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApiDestinationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return httpApiParameters
     */
    public HttpApiParameters getHttpApiParameters() {
        return this.httpApiParameters;
    }

    public static final class Builder extends Request.Builder<UpdateApiDestinationRequest, Builder> {
        private String apiDestinationName; 
        private String connectionName; 
        private String description; 
        private HttpApiParameters httpApiParameters; 

        private Builder() {
            super();
        } 

        private Builder(UpdateApiDestinationRequest request) {
            super(request);
            this.apiDestinationName = request.apiDestinationName;
            this.connectionName = request.connectionName;
            this.description = request.description;
            this.httpApiParameters = request.httpApiParameters;
        } 

        /**
         * The name of the API destination. The name must be 2 to 127 characters in length.
         */
        public Builder apiDestinationName(String apiDestinationName) {
            this.putQueryParameter("ApiDestinationName", apiDestinationName);
            this.apiDestinationName = apiDestinationName;
            return this;
        }

        /**
         * The name of the connection. The name must be 2 to 127 characters in length.
         * <p>
         * 
         * Note: Before you configure this parameter, you must call the CreateConnection operation to create a connection. Then, set this parameter to the name of the connection that you created.
         */
        public Builder connectionName(String connectionName) {
            this.putQueryParameter("ConnectionName", connectionName);
            this.connectionName = connectionName;
            return this;
        }

        /**
         * The description of the API destination. The description can be up to 255 characters in length.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The parameters that are configured for the API destination.
         */
        public Builder httpApiParameters(HttpApiParameters httpApiParameters) {
            String httpApiParametersShrink = shrink(httpApiParameters, "HttpApiParameters", "json");
            this.putQueryParameter("HttpApiParameters", httpApiParametersShrink);
            this.httpApiParameters = httpApiParameters;
            return this;
        }

        @Override
        public UpdateApiDestinationRequest build() {
            return new UpdateApiDestinationRequest(this);
        } 

    } 

    public static class HttpApiParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Endpoint")
        @com.aliyun.core.annotation.Validation(maxLength = 127)
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
             * The endpoint of the API destination. The endpoint can be up to 127 characters in length.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * The HTTP request method. Valid values:
             * <p>
             * 
             * - GET
             * - POST
             * - HEAD
             * - DELETE
             * - PUT
             * - PATCH
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
}
