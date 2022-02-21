// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteProblemResponse} extends {@link TeaModel}
 *
 * <p>DeleteProblemResponse</p>
 */
public class DeleteProblemResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteProblemResponseBody body;

    private DeleteProblemResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteProblemResponse create() {
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
    public DeleteProblemResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteProblemResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteProblemResponseBody body);

        @Override
        DeleteProblemResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteProblemResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteProblemResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteProblemResponse response) {
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
        public Builder body(DeleteProblemResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteProblemResponse build() {
            return new DeleteProblemResponse(this);
        } 

    } 

}
