// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRepositoryTagsResponse} extends {@link TeaModel}
 *
 * <p>ListRepositoryTagsResponse</p>
 */
public class ListRepositoryTagsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListRepositoryTagsResponseBody body;

    private ListRepositoryTagsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListRepositoryTagsResponse create() {
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
    public ListRepositoryTagsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListRepositoryTagsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListRepositoryTagsResponseBody body);

        @Override
        ListRepositoryTagsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListRepositoryTagsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListRepositoryTagsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListRepositoryTagsResponse response) {
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
        public Builder body(ListRepositoryTagsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListRepositoryTagsResponse build() {
            return new ListRepositoryTagsResponse(this);
        } 

    } 

}
