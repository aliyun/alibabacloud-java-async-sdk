// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConnectedClustersResponse} extends {@link TeaModel}
 *
 * <p>ListConnectedClustersResponse</p>
 */
public class ListConnectedClustersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListConnectedClustersResponseBody body;

    private ListConnectedClustersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListConnectedClustersResponse create() {
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
    public ListConnectedClustersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListConnectedClustersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListConnectedClustersResponseBody body);

        @Override
        ListConnectedClustersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListConnectedClustersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListConnectedClustersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListConnectedClustersResponse response) {
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
        public Builder body(ListConnectedClustersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListConnectedClustersResponse build() {
            return new ListConnectedClustersResponse(this);
        } 

    } 

}
