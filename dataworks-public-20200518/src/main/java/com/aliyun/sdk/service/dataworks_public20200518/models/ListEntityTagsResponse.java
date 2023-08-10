// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEntityTagsResponse} extends {@link TeaModel}
 *
 * <p>ListEntityTagsResponse</p>
 */
public class ListEntityTagsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListEntityTagsResponseBody body;

    private ListEntityTagsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListEntityTagsResponse create() {
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
    public ListEntityTagsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListEntityTagsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListEntityTagsResponseBody body);

        @Override
        ListEntityTagsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListEntityTagsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListEntityTagsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListEntityTagsResponse response) {
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
        public Builder body(ListEntityTagsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListEntityTagsResponse build() {
            return new ListEntityTagsResponse(this);
        } 

    } 

}
