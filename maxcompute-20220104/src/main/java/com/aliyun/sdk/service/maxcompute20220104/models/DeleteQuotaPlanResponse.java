// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteQuotaPlanResponse} extends {@link TeaModel}
 *
 * <p>DeleteQuotaPlanResponse</p>
 */
public class DeleteQuotaPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteQuotaPlanResponseBody body;

    private DeleteQuotaPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteQuotaPlanResponse create() {
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
    public DeleteQuotaPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteQuotaPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteQuotaPlanResponseBody body);

        @Override
        DeleteQuotaPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteQuotaPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteQuotaPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteQuotaPlanResponse response) {
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
        public Builder body(DeleteQuotaPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteQuotaPlanResponse build() {
            return new DeleteQuotaPlanResponse(this);
        } 

    } 

}
