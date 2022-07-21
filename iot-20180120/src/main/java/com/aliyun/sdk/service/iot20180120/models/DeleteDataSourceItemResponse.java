// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDataSourceItemResponse} extends {@link TeaModel}
 *
 * <p>DeleteDataSourceItemResponse</p>
 */
public class DeleteDataSourceItemResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDataSourceItemResponseBody body;

    private DeleteDataSourceItemResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDataSourceItemResponse create() {
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
    public DeleteDataSourceItemResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDataSourceItemResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDataSourceItemResponseBody body);

        @Override
        DeleteDataSourceItemResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDataSourceItemResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDataSourceItemResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDataSourceItemResponse response) {
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
        public Builder body(DeleteDataSourceItemResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDataSourceItemResponse build() {
            return new DeleteDataSourceItemResponse(this);
        } 

    } 

}
