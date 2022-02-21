// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDhcpOptionsSetsResponse} extends {@link TeaModel}
 *
 * <p>ListDhcpOptionsSetsResponse</p>
 */
public class ListDhcpOptionsSetsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDhcpOptionsSetsResponseBody body;

    private ListDhcpOptionsSetsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDhcpOptionsSetsResponse create() {
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
    public ListDhcpOptionsSetsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDhcpOptionsSetsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDhcpOptionsSetsResponseBody body);

        @Override
        ListDhcpOptionsSetsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDhcpOptionsSetsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDhcpOptionsSetsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDhcpOptionsSetsResponse response) {
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
        public Builder body(ListDhcpOptionsSetsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDhcpOptionsSetsResponse build() {
            return new ListDhcpOptionsSetsResponse(this);
        } 

    } 

}
