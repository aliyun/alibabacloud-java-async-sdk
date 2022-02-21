// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApiGatewayAppSecurityResponse} extends {@link TeaModel}
 *
 * <p>DescribeApiGatewayAppSecurityResponse</p>
 */
public class DescribeApiGatewayAppSecurityResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeApiGatewayAppSecurityResponseBody body;

    private DescribeApiGatewayAppSecurityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeApiGatewayAppSecurityResponse create() {
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
    public DescribeApiGatewayAppSecurityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeApiGatewayAppSecurityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeApiGatewayAppSecurityResponseBody body);

        @Override
        DescribeApiGatewayAppSecurityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeApiGatewayAppSecurityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeApiGatewayAppSecurityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeApiGatewayAppSecurityResponse response) {
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
        public Builder body(DescribeApiGatewayAppSecurityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeApiGatewayAppSecurityResponse build() {
            return new DescribeApiGatewayAppSecurityResponse(this);
        } 

    } 

}
