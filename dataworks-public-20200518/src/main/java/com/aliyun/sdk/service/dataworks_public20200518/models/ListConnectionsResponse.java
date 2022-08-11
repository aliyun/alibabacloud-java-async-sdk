// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConnectionsResponse} extends {@link TeaModel}
 *
 * <p>ListConnectionsResponse</p>
 */
public class ListConnectionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListConnectionsResponseBody body;

    private ListConnectionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListConnectionsResponse create() {
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
    public ListConnectionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListConnectionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListConnectionsResponseBody body);

        @Override
        ListConnectionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListConnectionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListConnectionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListConnectionsResponse response) {
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
        public Builder body(ListConnectionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListConnectionsResponse build() {
            return new ListConnectionsResponse(this);
        } 

    } 

}
