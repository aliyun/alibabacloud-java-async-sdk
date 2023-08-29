// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMasFunnelResponse} extends {@link TeaModel}
 *
 * <p>CreateMasFunnelResponse</p>
 */
public class CreateMasFunnelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateMasFunnelResponseBody body;

    private CreateMasFunnelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateMasFunnelResponse create() {
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
    public CreateMasFunnelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateMasFunnelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateMasFunnelResponseBody body);

        @Override
        CreateMasFunnelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateMasFunnelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateMasFunnelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateMasFunnelResponse response) {
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
        public Builder body(CreateMasFunnelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateMasFunnelResponse build() {
            return new CreateMasFunnelResponse(this);
        } 

    } 

}
