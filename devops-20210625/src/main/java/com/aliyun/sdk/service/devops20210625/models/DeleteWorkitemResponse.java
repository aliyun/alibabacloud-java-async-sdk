// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteWorkitemResponse} extends {@link TeaModel}
 *
 * <p>DeleteWorkitemResponse</p>
 */
public class DeleteWorkitemResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteWorkitemResponseBody body;

    private DeleteWorkitemResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteWorkitemResponse create() {
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
    public DeleteWorkitemResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteWorkitemResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteWorkitemResponseBody body);

        @Override
        DeleteWorkitemResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteWorkitemResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteWorkitemResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteWorkitemResponse response) {
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
        public Builder body(DeleteWorkitemResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteWorkitemResponse build() {
            return new DeleteWorkitemResponse(this);
        } 

    } 

}
