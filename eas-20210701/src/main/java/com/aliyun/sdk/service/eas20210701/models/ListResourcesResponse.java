// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourcesResponse} extends {@link TeaModel}
 *
 * <p>ListResourcesResponse</p>
 */
public class ListResourcesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListResourcesResponseBody body;

    private ListResourcesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListResourcesResponse create() {
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
    public ListResourcesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListResourcesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListResourcesResponseBody body);

        @Override
        ListResourcesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListResourcesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListResourcesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListResourcesResponse response) {
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
        public Builder body(ListResourcesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListResourcesResponse build() {
            return new ListResourcesResponse(this);
        } 

    } 

}
