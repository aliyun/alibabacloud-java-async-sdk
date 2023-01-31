// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTagsResponse} extends {@link TeaModel}
 *
 * <p>ListTagsResponse</p>
 */
public class ListTagsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListTagsResponseBody body;

    private ListTagsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListTagsResponse create() {
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
    public ListTagsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTagsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListTagsResponseBody body);

        @Override
        ListTagsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTagsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListTagsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTagsResponse response) {
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
        public Builder body(ListTagsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTagsResponse build() {
            return new ListTagsResponse(this);
        } 

    } 

}
