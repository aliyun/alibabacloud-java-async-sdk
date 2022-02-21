// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteProjectAppResponse} extends {@link TeaModel}
 *
 * <p>DeleteProjectAppResponse</p>
 */
public class DeleteProjectAppResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteProjectAppResponseBody body;

    private DeleteProjectAppResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteProjectAppResponse create() {
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
    public DeleteProjectAppResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteProjectAppResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteProjectAppResponseBody body);

        @Override
        DeleteProjectAppResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteProjectAppResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteProjectAppResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteProjectAppResponse response) {
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
        public Builder body(DeleteProjectAppResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteProjectAppResponse build() {
            return new DeleteProjectAppResponse(this);
        } 

    } 

}
