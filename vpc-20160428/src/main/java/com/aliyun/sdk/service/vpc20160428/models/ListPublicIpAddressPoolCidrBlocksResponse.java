// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPublicIpAddressPoolCidrBlocksResponse} extends {@link TeaModel}
 *
 * <p>ListPublicIpAddressPoolCidrBlocksResponse</p>
 */
public class ListPublicIpAddressPoolCidrBlocksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPublicIpAddressPoolCidrBlocksResponseBody body;

    private ListPublicIpAddressPoolCidrBlocksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPublicIpAddressPoolCidrBlocksResponse create() {
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
    public ListPublicIpAddressPoolCidrBlocksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPublicIpAddressPoolCidrBlocksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPublicIpAddressPoolCidrBlocksResponseBody body);

        @Override
        ListPublicIpAddressPoolCidrBlocksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPublicIpAddressPoolCidrBlocksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPublicIpAddressPoolCidrBlocksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPublicIpAddressPoolCidrBlocksResponse response) {
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
        public Builder body(ListPublicIpAddressPoolCidrBlocksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPublicIpAddressPoolCidrBlocksResponse build() {
            return new ListPublicIpAddressPoolCidrBlocksResponse(this);
        } 

    } 

}
