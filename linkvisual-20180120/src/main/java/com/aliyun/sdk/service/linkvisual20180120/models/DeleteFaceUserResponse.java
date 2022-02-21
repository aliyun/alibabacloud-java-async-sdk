// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFaceUserResponse} extends {@link TeaModel}
 *
 * <p>DeleteFaceUserResponse</p>
 */
public class DeleteFaceUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteFaceUserResponseBody body;

    private DeleteFaceUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteFaceUserResponse create() {
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
    public DeleteFaceUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteFaceUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteFaceUserResponseBody body);

        @Override
        DeleteFaceUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteFaceUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteFaceUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteFaceUserResponse response) {
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
        public Builder body(DeleteFaceUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteFaceUserResponse build() {
            return new DeleteFaceUserResponse(this);
        } 

    } 

}
