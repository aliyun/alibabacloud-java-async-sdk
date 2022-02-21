// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePrecisionTaskResponse} extends {@link TeaModel}
 *
 * <p>DeletePrecisionTaskResponse</p>
 */
public class DeletePrecisionTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeletePrecisionTaskResponseBody body;

    private DeletePrecisionTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeletePrecisionTaskResponse create() {
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
    public DeletePrecisionTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeletePrecisionTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeletePrecisionTaskResponseBody body);

        @Override
        DeletePrecisionTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeletePrecisionTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeletePrecisionTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeletePrecisionTaskResponse response) {
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
        public Builder body(DeletePrecisionTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeletePrecisionTaskResponse build() {
            return new DeletePrecisionTaskResponse(this);
        } 

    } 

}
