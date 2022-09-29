// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20170622.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteReceiverDetailResponse} extends {@link TeaModel}
 *
 * <p>DeleteReceiverDetailResponse</p>
 */
public class DeleteReceiverDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteReceiverDetailResponseBody body;

    private DeleteReceiverDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteReceiverDetailResponse create() {
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
    public DeleteReceiverDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteReceiverDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteReceiverDetailResponseBody body);

        @Override
        DeleteReceiverDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteReceiverDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteReceiverDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteReceiverDetailResponse response) {
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
        public Builder body(DeleteReceiverDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteReceiverDetailResponse build() {
            return new DeleteReceiverDetailResponse(this);
        } 

    } 

}
