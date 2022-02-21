// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourceTagsResponse} extends {@link TeaModel}
 *
 * <p>ListResourceTagsResponse</p>
 */
public class ListResourceTagsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListResourceTagsResponseBody body;

    private ListResourceTagsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListResourceTagsResponse create() {
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
    public ListResourceTagsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListResourceTagsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListResourceTagsResponseBody body);

        @Override
        ListResourceTagsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListResourceTagsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListResourceTagsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListResourceTagsResponse response) {
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
        public Builder body(ListResourceTagsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListResourceTagsResponse build() {
            return new ListResourceTagsResponse(this);
        } 

    } 

}
