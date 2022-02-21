// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceConnectionsResponse} extends {@link TeaModel}
 *
 * <p>ListServiceConnectionsResponse</p>
 */
public class ListServiceConnectionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListServiceConnectionsResponseBody body;

    private ListServiceConnectionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListServiceConnectionsResponse create() {
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
    public ListServiceConnectionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListServiceConnectionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListServiceConnectionsResponseBody body);

        @Override
        ListServiceConnectionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListServiceConnectionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListServiceConnectionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListServiceConnectionsResponse response) {
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
        public Builder body(ListServiceConnectionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListServiceConnectionsResponse build() {
            return new ListServiceConnectionsResponse(this);
        } 

    } 

}
