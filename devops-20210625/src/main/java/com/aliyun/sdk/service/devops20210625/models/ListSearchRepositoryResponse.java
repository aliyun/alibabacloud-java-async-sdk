// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSearchRepositoryResponse} extends {@link TeaModel}
 *
 * <p>ListSearchRepositoryResponse</p>
 */
public class ListSearchRepositoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSearchRepositoryResponseBody body;

    private ListSearchRepositoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSearchRepositoryResponse create() {
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
    public ListSearchRepositoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSearchRepositoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSearchRepositoryResponseBody body);

        @Override
        ListSearchRepositoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSearchRepositoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSearchRepositoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSearchRepositoryResponse response) {
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
        public Builder body(ListSearchRepositoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSearchRepositoryResponse build() {
            return new ListSearchRepositoryResponse(this);
        } 

    } 

}
