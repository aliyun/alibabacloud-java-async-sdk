// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateBatchOperateCardsTaskResponse} extends {@link TeaModel}
 *
 * <p>UpdateBatchOperateCardsTaskResponse</p>
 */
public class UpdateBatchOperateCardsTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateBatchOperateCardsTaskResponseBody body;

    private UpdateBatchOperateCardsTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateBatchOperateCardsTaskResponse create() {
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
    public UpdateBatchOperateCardsTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateBatchOperateCardsTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateBatchOperateCardsTaskResponseBody body);

        @Override
        UpdateBatchOperateCardsTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateBatchOperateCardsTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateBatchOperateCardsTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateBatchOperateCardsTaskResponse response) {
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
        public Builder body(UpdateBatchOperateCardsTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateBatchOperateCardsTaskResponse build() {
            return new UpdateBatchOperateCardsTaskResponse(this);
        } 

    } 

}
