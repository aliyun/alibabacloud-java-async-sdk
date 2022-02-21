// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRoutineResponse} extends {@link TeaModel}
 *
 * <p>DeleteRoutineResponse</p>
 */
public class DeleteRoutineResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteRoutineResponseBody body;

    private DeleteRoutineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteRoutineResponse create() {
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
    public DeleteRoutineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteRoutineResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteRoutineResponseBody body);

        @Override
        DeleteRoutineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteRoutineResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteRoutineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteRoutineResponse response) {
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
        public Builder body(DeleteRoutineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteRoutineResponse build() {
            return new DeleteRoutineResponse(this);
        } 

    } 

}
