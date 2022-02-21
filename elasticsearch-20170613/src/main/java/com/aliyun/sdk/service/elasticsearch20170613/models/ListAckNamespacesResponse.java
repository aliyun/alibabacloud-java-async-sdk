// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAckNamespacesResponse} extends {@link TeaModel}
 *
 * <p>ListAckNamespacesResponse</p>
 */
public class ListAckNamespacesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAckNamespacesResponseBody body;

    private ListAckNamespacesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAckNamespacesResponse create() {
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
    public ListAckNamespacesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAckNamespacesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAckNamespacesResponseBody body);

        @Override
        ListAckNamespacesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAckNamespacesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAckNamespacesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAckNamespacesResponse response) {
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
        public Builder body(ListAckNamespacesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAckNamespacesResponse build() {
            return new ListAckNamespacesResponse(this);
        } 

    } 

}
