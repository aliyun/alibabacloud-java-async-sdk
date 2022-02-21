// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVpnRouteEntryResponse} extends {@link TeaModel}
 *
 * <p>CreateVpnRouteEntryResponse</p>
 */
public class CreateVpnRouteEntryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateVpnRouteEntryResponseBody body;

    private CreateVpnRouteEntryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateVpnRouteEntryResponse create() {
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
    public CreateVpnRouteEntryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateVpnRouteEntryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateVpnRouteEntryResponseBody body);

        @Override
        CreateVpnRouteEntryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateVpnRouteEntryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateVpnRouteEntryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateVpnRouteEntryResponse response) {
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
        public Builder body(CreateVpnRouteEntryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateVpnRouteEntryResponse build() {
            return new CreateVpnRouteEntryResponse(this);
        } 

    } 

}
