// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSnapshotCallbackAuthResponse} extends {@link TeaModel}
 *
 * <p>DeleteSnapshotCallbackAuthResponse</p>
 */
public class DeleteSnapshotCallbackAuthResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteSnapshotCallbackAuthResponseBody body;

    private DeleteSnapshotCallbackAuthResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteSnapshotCallbackAuthResponse create() {
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
    public DeleteSnapshotCallbackAuthResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteSnapshotCallbackAuthResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteSnapshotCallbackAuthResponseBody body);

        @Override
        DeleteSnapshotCallbackAuthResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteSnapshotCallbackAuthResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteSnapshotCallbackAuthResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteSnapshotCallbackAuthResponse response) {
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
        public Builder body(DeleteSnapshotCallbackAuthResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteSnapshotCallbackAuthResponse build() {
            return new DeleteSnapshotCallbackAuthResponse(this);
        } 

    } 

}
