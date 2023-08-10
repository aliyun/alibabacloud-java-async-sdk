// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDedicatedClusterResponse} extends {@link TeaModel}
 *
 * <p>ListDedicatedClusterResponse</p>
 */
public class ListDedicatedClusterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDedicatedClusterResponseBody body;

    private ListDedicatedClusterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDedicatedClusterResponse create() {
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
    public ListDedicatedClusterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDedicatedClusterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDedicatedClusterResponseBody body);

        @Override
        ListDedicatedClusterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDedicatedClusterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDedicatedClusterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDedicatedClusterResponse response) {
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
        public Builder body(ListDedicatedClusterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDedicatedClusterResponse build() {
            return new ListDedicatedClusterResponse(this);
        } 

    } 

}
