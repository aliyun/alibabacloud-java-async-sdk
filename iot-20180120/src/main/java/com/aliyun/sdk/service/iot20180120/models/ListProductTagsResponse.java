// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProductTagsResponse} extends {@link TeaModel}
 *
 * <p>ListProductTagsResponse</p>
 */
public class ListProductTagsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListProductTagsResponseBody body;

    private ListProductTagsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListProductTagsResponse create() {
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
    public ListProductTagsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListProductTagsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListProductTagsResponseBody body);

        @Override
        ListProductTagsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListProductTagsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListProductTagsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListProductTagsResponse response) {
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
        public Builder body(ListProductTagsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListProductTagsResponse build() {
            return new ListProductTagsResponse(this);
        } 

    } 

}
