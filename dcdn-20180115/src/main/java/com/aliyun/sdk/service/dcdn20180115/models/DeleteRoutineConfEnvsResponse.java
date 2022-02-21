// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRoutineConfEnvsResponse} extends {@link TeaModel}
 *
 * <p>DeleteRoutineConfEnvsResponse</p>
 */
public class DeleteRoutineConfEnvsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteRoutineConfEnvsResponseBody body;

    private DeleteRoutineConfEnvsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteRoutineConfEnvsResponse create() {
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
    public DeleteRoutineConfEnvsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteRoutineConfEnvsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteRoutineConfEnvsResponseBody body);

        @Override
        DeleteRoutineConfEnvsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteRoutineConfEnvsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteRoutineConfEnvsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteRoutineConfEnvsResponse response) {
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
        public Builder body(DeleteRoutineConfEnvsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteRoutineConfEnvsResponse build() {
            return new DeleteRoutineConfEnvsResponse(this);
        } 

    } 

}
