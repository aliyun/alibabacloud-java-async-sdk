// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetSnapshotCallbackAuthResponse} extends {@link TeaModel}
 *
 * <p>SetSnapshotCallbackAuthResponse</p>
 */
public class SetSnapshotCallbackAuthResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetSnapshotCallbackAuthResponseBody body;

    private SetSnapshotCallbackAuthResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetSnapshotCallbackAuthResponse create() {
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
    public SetSnapshotCallbackAuthResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetSnapshotCallbackAuthResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetSnapshotCallbackAuthResponseBody body);

        @Override
        SetSnapshotCallbackAuthResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetSnapshotCallbackAuthResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetSnapshotCallbackAuthResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetSnapshotCallbackAuthResponse response) {
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
        public Builder body(SetSnapshotCallbackAuthResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetSnapshotCallbackAuthResponse build() {
            return new SetSnapshotCallbackAuthResponse(this);
        } 

    } 

}
