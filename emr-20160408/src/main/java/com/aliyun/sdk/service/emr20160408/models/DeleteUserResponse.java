// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteUserResponse} extends {@link TeaModel}
 *
 * <p>DeleteUserResponse</p>
 */
public class DeleteUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteUserResponseBody body;

    private DeleteUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteUserResponse create() {
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
    public DeleteUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteUserResponseBody body);

        @Override
        DeleteUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteUserResponse response) {
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
        public Builder body(DeleteUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteUserResponse build() {
            return new DeleteUserResponse(this);
        } 

    } 

}
