// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPublicIpAddressPoolsResponse} extends {@link TeaModel}
 *
 * <p>ListPublicIpAddressPoolsResponse</p>
 */
public class ListPublicIpAddressPoolsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPublicIpAddressPoolsResponseBody body;

    private ListPublicIpAddressPoolsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPublicIpAddressPoolsResponse create() {
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
    public ListPublicIpAddressPoolsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPublicIpAddressPoolsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPublicIpAddressPoolsResponseBody body);

        @Override
        ListPublicIpAddressPoolsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPublicIpAddressPoolsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPublicIpAddressPoolsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPublicIpAddressPoolsResponse response) {
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
        public Builder body(ListPublicIpAddressPoolsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPublicIpAddressPoolsResponse build() {
            return new ListPublicIpAddressPoolsResponse(this);
        } 

    } 

}
