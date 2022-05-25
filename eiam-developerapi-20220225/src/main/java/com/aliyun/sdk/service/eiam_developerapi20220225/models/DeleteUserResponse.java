// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * {@link DeleteUserResponse} extends {@link TeaModel}
 *
 * <p>DeleteUserResponse</p>
 */
public class DeleteUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    private DeleteUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
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

    public interface Builder extends Response.Builder<DeleteUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        @Override
        DeleteUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteUserResponse response) {
            super(response);
            this.headers = response.headers;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        @Override
        public DeleteUserResponse build() {
            return new DeleteUserResponse(this);
        } 

    } 

}
