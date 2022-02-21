// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRepositoryResponse} extends {@link TeaModel}
 *
 * <p>ListRepositoryResponse</p>
 */
public class ListRepositoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListRepositoryResponseBody body;

    private ListRepositoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListRepositoryResponse create() {
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
    public ListRepositoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListRepositoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListRepositoryResponseBody body);

        @Override
        ListRepositoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListRepositoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListRepositoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListRepositoryResponse response) {
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
        public Builder body(ListRepositoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListRepositoryResponse build() {
            return new ListRepositoryResponse(this);
        } 

    } 

}
