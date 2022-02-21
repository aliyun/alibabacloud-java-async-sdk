// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProductByTagsResponse} extends {@link TeaModel}
 *
 * <p>ListProductByTagsResponse</p>
 */
public class ListProductByTagsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListProductByTagsResponseBody body;

    private ListProductByTagsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListProductByTagsResponse create() {
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
    public ListProductByTagsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListProductByTagsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListProductByTagsResponseBody body);

        @Override
        ListProductByTagsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListProductByTagsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListProductByTagsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListProductByTagsResponse response) {
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
        public Builder body(ListProductByTagsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListProductByTagsResponse build() {
            return new ListProductByTagsResponse(this);
        } 

    } 

}
