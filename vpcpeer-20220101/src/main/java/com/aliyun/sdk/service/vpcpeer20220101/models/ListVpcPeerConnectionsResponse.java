// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcpeer20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVpcPeerConnectionsResponse} extends {@link TeaModel}
 *
 * <p>ListVpcPeerConnectionsResponse</p>
 */
public class ListVpcPeerConnectionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListVpcPeerConnectionsResponseBody body;

    private ListVpcPeerConnectionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListVpcPeerConnectionsResponse create() {
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
    public ListVpcPeerConnectionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListVpcPeerConnectionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListVpcPeerConnectionsResponseBody body);

        @Override
        ListVpcPeerConnectionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListVpcPeerConnectionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListVpcPeerConnectionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListVpcPeerConnectionsResponse response) {
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
        public Builder body(ListVpcPeerConnectionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListVpcPeerConnectionsResponse build() {
            return new ListVpcPeerConnectionsResponse(this);
        } 

    } 

}
