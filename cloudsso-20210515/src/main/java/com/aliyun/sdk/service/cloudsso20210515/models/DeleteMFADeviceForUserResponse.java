// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMFADeviceForUserResponse} extends {@link TeaModel}
 *
 * <p>DeleteMFADeviceForUserResponse</p>
 */
public class DeleteMFADeviceForUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteMFADeviceForUserResponseBody body;

    private DeleteMFADeviceForUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteMFADeviceForUserResponse create() {
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
    public DeleteMFADeviceForUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteMFADeviceForUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteMFADeviceForUserResponseBody body);

        @Override
        DeleteMFADeviceForUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteMFADeviceForUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteMFADeviceForUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteMFADeviceForUserResponse response) {
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
        public Builder body(DeleteMFADeviceForUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteMFADeviceForUserResponse build() {
            return new DeleteMFADeviceForUserResponse(this);
        } 

    } 

}
