// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBatchOperateCardsTaskResponse} extends {@link TeaModel}
 *
 * <p>DeleteBatchOperateCardsTaskResponse</p>
 */
public class DeleteBatchOperateCardsTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteBatchOperateCardsTaskResponseBody body;

    private DeleteBatchOperateCardsTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteBatchOperateCardsTaskResponse create() {
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
    public DeleteBatchOperateCardsTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteBatchOperateCardsTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteBatchOperateCardsTaskResponseBody body);

        @Override
        DeleteBatchOperateCardsTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteBatchOperateCardsTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteBatchOperateCardsTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteBatchOperateCardsTaskResponse response) {
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
        public Builder body(DeleteBatchOperateCardsTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteBatchOperateCardsTaskResponse build() {
            return new DeleteBatchOperateCardsTaskResponse(this);
        } 

    } 

}
