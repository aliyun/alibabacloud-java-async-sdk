// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVpnConnectionResponse} extends {@link TeaModel}
 *
 * <p>CreateVpnConnectionResponse</p>
 */
public class CreateVpnConnectionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateVpnConnectionResponseBody body;

    private CreateVpnConnectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateVpnConnectionResponse create() {
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
    public CreateVpnConnectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateVpnConnectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateVpnConnectionResponseBody body);

        @Override
        CreateVpnConnectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateVpnConnectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateVpnConnectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateVpnConnectionResponse response) {
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
        public Builder body(CreateVpnConnectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateVpnConnectionResponse build() {
            return new CreateVpnConnectionResponse(this);
        } 

    } 

}
