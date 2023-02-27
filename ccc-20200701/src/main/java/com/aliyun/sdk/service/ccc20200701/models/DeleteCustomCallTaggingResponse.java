// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCustomCallTaggingResponse} extends {@link TeaModel}
 *
 * <p>DeleteCustomCallTaggingResponse</p>
 */
public class DeleteCustomCallTaggingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteCustomCallTaggingResponseBody body;

    private DeleteCustomCallTaggingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteCustomCallTaggingResponse create() {
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
    public DeleteCustomCallTaggingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteCustomCallTaggingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteCustomCallTaggingResponseBody body);

        @Override
        DeleteCustomCallTaggingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteCustomCallTaggingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteCustomCallTaggingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteCustomCallTaggingResponse response) {
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
        public Builder body(DeleteCustomCallTaggingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteCustomCallTaggingResponse build() {
            return new DeleteCustomCallTaggingResponse(this);
        } 

    } 

}
