// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDataSourceResponse} extends {@link TeaModel}
 *
 * <p>DeleteDataSourceResponse</p>
 */
public class DeleteDataSourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDataSourceResponseBody body;

    private DeleteDataSourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDataSourceResponse create() {
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
    public DeleteDataSourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDataSourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDataSourceResponseBody body);

        @Override
        DeleteDataSourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDataSourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDataSourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDataSourceResponse response) {
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
        public Builder body(DeleteDataSourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDataSourceResponse build() {
            return new DeleteDataSourceResponse(this);
        } 

    } 

}
