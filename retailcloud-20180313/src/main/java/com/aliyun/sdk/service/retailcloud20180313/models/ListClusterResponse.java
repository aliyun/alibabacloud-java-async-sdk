// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterResponse} extends {@link TeaModel}
 *
 * <p>ListClusterResponse</p>
 */
public class ListClusterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListClusterResponseBody body;

    private ListClusterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListClusterResponse create() {
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
    public ListClusterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListClusterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListClusterResponseBody body);

        @Override
        ListClusterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListClusterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListClusterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListClusterResponse response) {
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
        public Builder body(ListClusterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListClusterResponse build() {
            return new ListClusterResponse(this);
        } 

    } 

}
