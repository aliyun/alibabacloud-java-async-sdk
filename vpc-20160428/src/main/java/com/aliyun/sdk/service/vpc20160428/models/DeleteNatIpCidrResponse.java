// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteNatIpCidrResponse} extends {@link TeaModel}
 *
 * <p>DeleteNatIpCidrResponse</p>
 */
public class DeleteNatIpCidrResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteNatIpCidrResponseBody body;

    private DeleteNatIpCidrResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteNatIpCidrResponse create() {
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
    public DeleteNatIpCidrResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteNatIpCidrResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteNatIpCidrResponseBody body);

        @Override
        DeleteNatIpCidrResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteNatIpCidrResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteNatIpCidrResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteNatIpCidrResponse response) {
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
        public Builder body(DeleteNatIpCidrResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteNatIpCidrResponse build() {
            return new DeleteNatIpCidrResponse(this);
        } 

    } 

}
