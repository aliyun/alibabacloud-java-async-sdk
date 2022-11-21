// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRepositoryCommitsResponse} extends {@link TeaModel}
 *
 * <p>ListRepositoryCommitsResponse</p>
 */
public class ListRepositoryCommitsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListRepositoryCommitsResponseBody body;

    private ListRepositoryCommitsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListRepositoryCommitsResponse create() {
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
    public ListRepositoryCommitsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListRepositoryCommitsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListRepositoryCommitsResponseBody body);

        @Override
        ListRepositoryCommitsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListRepositoryCommitsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListRepositoryCommitsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListRepositoryCommitsResponse response) {
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
        public Builder body(ListRepositoryCommitsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListRepositoryCommitsResponse build() {
            return new ListRepositoryCommitsResponse(this);
        } 

    } 

}
