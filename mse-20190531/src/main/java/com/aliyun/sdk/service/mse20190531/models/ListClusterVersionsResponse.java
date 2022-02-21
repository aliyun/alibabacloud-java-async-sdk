// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterVersionsResponse} extends {@link TeaModel}
 *
 * <p>ListClusterVersionsResponse</p>
 */
public class ListClusterVersionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListClusterVersionsResponseBody body;

    private ListClusterVersionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListClusterVersionsResponse create() {
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
    public ListClusterVersionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListClusterVersionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListClusterVersionsResponseBody body);

        @Override
        ListClusterVersionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListClusterVersionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListClusterVersionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListClusterVersionsResponse response) {
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
        public Builder body(ListClusterVersionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListClusterVersionsResponse build() {
            return new ListClusterVersionsResponse(this);
        } 

    } 

}
