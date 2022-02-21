// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBizDataRangeResponse} extends {@link TeaModel}
 *
 * <p>DeleteBizDataRangeResponse</p>
 */
public class DeleteBizDataRangeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteBizDataRangeResponseBody body;

    private DeleteBizDataRangeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteBizDataRangeResponse create() {
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
    public DeleteBizDataRangeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteBizDataRangeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteBizDataRangeResponseBody body);

        @Override
        DeleteBizDataRangeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteBizDataRangeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteBizDataRangeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteBizDataRangeResponse response) {
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
        public Builder body(DeleteBizDataRangeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteBizDataRangeResponse build() {
            return new DeleteBizDataRangeResponse(this);
        } 

    } 

}
