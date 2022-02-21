// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDhcpOptionsSetResponse} extends {@link TeaModel}
 *
 * <p>DeleteDhcpOptionsSetResponse</p>
 */
public class DeleteDhcpOptionsSetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDhcpOptionsSetResponseBody body;

    private DeleteDhcpOptionsSetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDhcpOptionsSetResponse create() {
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
    public DeleteDhcpOptionsSetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDhcpOptionsSetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDhcpOptionsSetResponseBody body);

        @Override
        DeleteDhcpOptionsSetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDhcpOptionsSetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDhcpOptionsSetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDhcpOptionsSetResponse response) {
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
        public Builder body(DeleteDhcpOptionsSetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDhcpOptionsSetResponse build() {
            return new DeleteDhcpOptionsSetResponse(this);
        } 

    } 

}
