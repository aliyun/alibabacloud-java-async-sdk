// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeASMGatewayImportedServicesResponse} extends {@link TeaModel}
 *
 * <p>DescribeASMGatewayImportedServicesResponse</p>
 */
public class DescribeASMGatewayImportedServicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeASMGatewayImportedServicesResponseBody body;

    private DescribeASMGatewayImportedServicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeASMGatewayImportedServicesResponse create() {
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
    public DescribeASMGatewayImportedServicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeASMGatewayImportedServicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeASMGatewayImportedServicesResponseBody body);

        @Override
        DescribeASMGatewayImportedServicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeASMGatewayImportedServicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeASMGatewayImportedServicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeASMGatewayImportedServicesResponse response) {
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
        public Builder body(DescribeASMGatewayImportedServicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeASMGatewayImportedServicesResponse build() {
            return new DescribeASMGatewayImportedServicesResponse(this);
        } 

    } 

}
