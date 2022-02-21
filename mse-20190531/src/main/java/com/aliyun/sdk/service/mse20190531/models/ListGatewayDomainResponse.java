// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGatewayDomainResponse} extends {@link TeaModel}
 *
 * <p>ListGatewayDomainResponse</p>
 */
public class ListGatewayDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListGatewayDomainResponseBody body;

    private ListGatewayDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListGatewayDomainResponse create() {
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
    public ListGatewayDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListGatewayDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListGatewayDomainResponseBody body);

        @Override
        ListGatewayDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListGatewayDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListGatewayDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListGatewayDomainResponse response) {
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
        public Builder body(ListGatewayDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListGatewayDomainResponse build() {
            return new ListGatewayDomainResponse(this);
        } 

    } 

}
