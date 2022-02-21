// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDataSourcesResponse} extends {@link TeaModel}
 *
 * <p>DeleteDataSourcesResponse</p>
 */
public class DeleteDataSourcesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDataSourcesResponseBody body;

    private DeleteDataSourcesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDataSourcesResponse create() {
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
    public DeleteDataSourcesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDataSourcesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDataSourcesResponseBody body);

        @Override
        DeleteDataSourcesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDataSourcesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDataSourcesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDataSourcesResponse response) {
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
        public Builder body(DeleteDataSourcesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDataSourcesResponse build() {
            return new DeleteDataSourcesResponse(this);
        } 

    } 

}
