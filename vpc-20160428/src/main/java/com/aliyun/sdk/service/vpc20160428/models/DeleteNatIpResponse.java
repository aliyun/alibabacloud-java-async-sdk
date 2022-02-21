// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteNatIpResponse} extends {@link TeaModel}
 *
 * <p>DeleteNatIpResponse</p>
 */
public class DeleteNatIpResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteNatIpResponseBody body;

    private DeleteNatIpResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteNatIpResponse create() {
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
    public DeleteNatIpResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteNatIpResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteNatIpResponseBody body);

        @Override
        DeleteNatIpResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteNatIpResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteNatIpResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteNatIpResponse response) {
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
        public Builder body(DeleteNatIpResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteNatIpResponse build() {
            return new DeleteNatIpResponse(this);
        } 

    } 

}
