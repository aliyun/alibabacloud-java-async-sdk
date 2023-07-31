// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.avatar20220130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAvatarResponse} extends {@link TeaModel}
 *
 * <p>DeleteAvatarResponse</p>
 */
public class DeleteAvatarResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteAvatarResponseBody body;

    private DeleteAvatarResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteAvatarResponse create() {
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
    public DeleteAvatarResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteAvatarResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteAvatarResponseBody body);

        @Override
        DeleteAvatarResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteAvatarResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteAvatarResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteAvatarResponse response) {
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
        public Builder body(DeleteAvatarResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteAvatarResponse build() {
            return new DeleteAvatarResponse(this);
        } 

    } 

}
