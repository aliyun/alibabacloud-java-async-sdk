// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteModelResponse} extends {@link TeaModel}
 *
 * <p>DeleteModelResponse</p>
 */
public class DeleteModelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteModelResponseBody body;

    private DeleteModelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteModelResponse create() {
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
    public DeleteModelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteModelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteModelResponseBody body);

        @Override
        DeleteModelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteModelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteModelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteModelResponse response) {
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
        public Builder body(DeleteModelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteModelResponse build() {
            return new DeleteModelResponse(this);
        } 

    } 

}
