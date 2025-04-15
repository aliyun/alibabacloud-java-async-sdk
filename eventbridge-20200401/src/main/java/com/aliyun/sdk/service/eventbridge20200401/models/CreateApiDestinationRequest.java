// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link CreateApiDestinationRequest} extends {@link RequestModel}
 *
 * <p>CreateApiDestinationRequest</p>
 */
public class CreateApiDestinationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiDestinationName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 127, minLength = 2)
    private String apiDestinationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 127, minLength = 2)
    private String connectionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 255)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HttpApiParameters")
    @com.aliyun.core.annotation.Validation(required = true)
    private HttpApiParameters httpApiParameters;

    private CreateApiDestinationRequest(Builder builder) {
        super(builder);
        this.apiDestinationName = builder.apiDestinationName;
        this.connectionName = builder.connectionName;
        this.description = builder.description;
        this.httpApiParameters = builder.httpApiParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApiDestinationRequest create() {
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

    public static final class Builder extends Request.Builder<CreateApiDestinationRequest, Builder> {
        private String apiDestinationName; 
        private String connectionName; 
        private String description; 
        private HttpApiParameters httpApiParameters; 

        private Builder() {
            super();
        } 

        private Builder(CreateApiDestinationRequest request) {
            super(request);
            this.apiDestinationName = request.apiDestinationName;
            this.connectionName = request.connectionName;
            this.description = request.description;
            this.httpApiParameters = request.httpApiParameters;
        } 

        /**
         * <p>The name of the API destination. The name must be 2 to 127 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>api-destination-name</p>
         */
        public Builder apiDestinationName(String apiDestinationName) {
            this.putQueryParameter("ApiDestinationName", apiDestinationName);
            this.apiDestinationName = apiDestinationName;
            return this;
        }

        /**
         * <p>The name of the connection. The name must be 2 to 127 characters in length.</p>
         * <blockquote>
         * <p> Before you configure this parameter, you must call the CreateConnection operation to create a connection. Then, set this parameter to the name of the connection that you created.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>connection-name</p>
         */
        public Builder connectionName(String connectionName) {
            this.putQueryParameter("ConnectionName", connectionName);
            this.connectionName = connectionName;
            return this;
        }

        /**
         * <p>The description of the API destination. The description can be up to 255 characters in length.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The parameters that are configured for the API destination.</p>
         * <p>This parameter is required.</p>
         */
        public Builder httpApiParameters(HttpApiParameters httpApiParameters) {
            String httpApiParametersShrink = shrink(httpApiParameters, "HttpApiParameters", "json");
            this.putQueryParameter("HttpApiParameters", httpApiParametersShrink);
            this.httpApiParameters = httpApiParameters;
            return this;
        }

        @Override
        public CreateApiDestinationRequest build() {
            return new CreateApiDestinationRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateApiDestinationRequest} extends {@link TeaModel}
     *
     * <p>CreateApiDestinationRequest</p>
     */
    public static class HttpApiParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Endpoint")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 127)
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("Method")
        @com.aliyun.core.annotation.Validation(required = true)
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

            private Builder() {
            } 

            private Builder(HttpApiParameters model) {
                this.endpoint = model.endpoint;
                this.method = model.method;
            } 

            /**
             * <p>The endpoint of the API destination. The endpoint can be up to 127 characters in length.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://127.0.0.1:8001/api">http://127.0.0.1:8001/api</a></p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The HTTP request method. Valid values:</p>
             * <ul>
             * <li>GET</li>
             * <li>POST</li>
             * <li>HEAD</li>
             * <li>DELETE</li>
             * <li>PUT</li>
             * <li>PATCH</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>POST</p>
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
