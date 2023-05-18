// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSharedResourcesResponse} extends {@link TeaModel}
 *
 * <p>ListSharedResourcesResponse</p>
 */
public class ListSharedResourcesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSharedResourcesResponseBody body;

    private ListSharedResourcesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSharedResourcesResponse create() {
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
    public ListSharedResourcesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSharedResourcesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSharedResourcesResponseBody body);

        @Override
        ListSharedResourcesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSharedResourcesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSharedResourcesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSharedResourcesResponse response) {
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
        public Builder body(ListSharedResourcesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSharedResourcesResponse build() {
            return new ListSharedResourcesResponse(this);
        } 

    } 

}
