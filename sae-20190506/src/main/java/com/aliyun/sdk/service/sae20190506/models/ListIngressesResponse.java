// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIngressesResponse} extends {@link TeaModel}
 *
 * <p>ListIngressesResponse</p>
 */
public class ListIngressesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListIngressesResponseBody body;

    private ListIngressesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListIngressesResponse create() {
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
    public ListIngressesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListIngressesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListIngressesResponseBody body);

        @Override
        ListIngressesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListIngressesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListIngressesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListIngressesResponse response) {
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
        public Builder body(ListIngressesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListIngressesResponse build() {
            return new ListIngressesResponse(this);
        } 

    } 

}
