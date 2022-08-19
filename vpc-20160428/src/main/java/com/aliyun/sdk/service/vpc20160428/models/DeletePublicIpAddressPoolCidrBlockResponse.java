// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePublicIpAddressPoolCidrBlockResponse} extends {@link TeaModel}
 *
 * <p>DeletePublicIpAddressPoolCidrBlockResponse</p>
 */
public class DeletePublicIpAddressPoolCidrBlockResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeletePublicIpAddressPoolCidrBlockResponseBody body;

    private DeletePublicIpAddressPoolCidrBlockResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeletePublicIpAddressPoolCidrBlockResponse create() {
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
    public DeletePublicIpAddressPoolCidrBlockResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeletePublicIpAddressPoolCidrBlockResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeletePublicIpAddressPoolCidrBlockResponseBody body);

        @Override
        DeletePublicIpAddressPoolCidrBlockResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeletePublicIpAddressPoolCidrBlockResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeletePublicIpAddressPoolCidrBlockResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeletePublicIpAddressPoolCidrBlockResponse response) {
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
        public Builder body(DeletePublicIpAddressPoolCidrBlockResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeletePublicIpAddressPoolCidrBlockResponse build() {
            return new DeletePublicIpAddressPoolCidrBlockResponse(this);
        } 

    } 

}
