// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGatewaySecretDetailsResponse} extends {@link TeaModel}
 *
 * <p>DescribeGatewaySecretDetailsResponse</p>
 */
public class DescribeGatewaySecretDetailsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeGatewaySecretDetailsResponseBody body;

    private DescribeGatewaySecretDetailsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeGatewaySecretDetailsResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public DescribeGatewaySecretDetailsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeGatewaySecretDetailsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeGatewaySecretDetailsResponseBody body);

        @Override
        DescribeGatewaySecretDetailsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeGatewaySecretDetailsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeGatewaySecretDetailsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeGatewaySecretDetailsResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(DescribeGatewaySecretDetailsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeGatewaySecretDetailsResponse build() {
            return new DescribeGatewaySecretDetailsResponse(this);
        } 

    } 

}
