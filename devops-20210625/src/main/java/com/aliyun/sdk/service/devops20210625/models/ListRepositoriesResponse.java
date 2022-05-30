// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRepositoriesResponse} extends {@link TeaModel}
 *
 * <p>ListRepositoriesResponse</p>
 */
public class ListRepositoriesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListRepositoriesResponseBody body;

    private ListRepositoriesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListRepositoriesResponse create() {
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
    public ListRepositoriesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListRepositoriesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListRepositoriesResponseBody body);

        @Override
        ListRepositoriesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListRepositoriesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListRepositoriesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListRepositoriesResponse response) {
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
        public Builder body(ListRepositoriesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListRepositoriesResponse build() {
            return new ListRepositoriesResponse(this);
        } 

    } 

}
