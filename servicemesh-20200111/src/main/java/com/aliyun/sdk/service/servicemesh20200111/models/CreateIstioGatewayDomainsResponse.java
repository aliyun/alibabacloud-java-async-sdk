// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIstioGatewayDomainsResponse} extends {@link TeaModel}
 *
 * <p>CreateIstioGatewayDomainsResponse</p>
 */
public class CreateIstioGatewayDomainsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateIstioGatewayDomainsResponseBody body;

    private CreateIstioGatewayDomainsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateIstioGatewayDomainsResponse create() {
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
    public CreateIstioGatewayDomainsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateIstioGatewayDomainsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateIstioGatewayDomainsResponseBody body);

        @Override
        CreateIstioGatewayDomainsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateIstioGatewayDomainsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateIstioGatewayDomainsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateIstioGatewayDomainsResponse response) {
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
        public Builder body(CreateIstioGatewayDomainsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateIstioGatewayDomainsResponse build() {
            return new CreateIstioGatewayDomainsResponse(this);
        } 

    } 

}
