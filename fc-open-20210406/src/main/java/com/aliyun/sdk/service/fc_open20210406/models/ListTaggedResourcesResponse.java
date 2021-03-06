// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTaggedResourcesResponse} extends {@link TeaModel}
 *
 * <p>ListTaggedResourcesResponse</p>
 */
public class ListTaggedResourcesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListTaggedResourcesResponseBody body;

    private ListTaggedResourcesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListTaggedResourcesResponse create() {
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
    public ListTaggedResourcesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTaggedResourcesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListTaggedResourcesResponseBody body);

        @Override
        ListTaggedResourcesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTaggedResourcesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListTaggedResourcesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTaggedResourcesResponse response) {
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
        public Builder body(ListTaggedResourcesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTaggedResourcesResponse build() {
            return new ListTaggedResourcesResponse(this);
        } 

    } 

}
