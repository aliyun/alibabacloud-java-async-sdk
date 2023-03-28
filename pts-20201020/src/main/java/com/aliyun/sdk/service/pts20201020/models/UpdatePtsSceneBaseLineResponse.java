// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePtsSceneBaseLineResponse} extends {@link TeaModel}
 *
 * <p>UpdatePtsSceneBaseLineResponse</p>
 */
public class UpdatePtsSceneBaseLineResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdatePtsSceneBaseLineResponseBody body;

    private UpdatePtsSceneBaseLineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdatePtsSceneBaseLineResponse create() {
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
    public UpdatePtsSceneBaseLineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdatePtsSceneBaseLineResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdatePtsSceneBaseLineResponseBody body);

        @Override
        UpdatePtsSceneBaseLineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdatePtsSceneBaseLineResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdatePtsSceneBaseLineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdatePtsSceneBaseLineResponse response) {
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
        public Builder body(UpdatePtsSceneBaseLineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdatePtsSceneBaseLineResponse build() {
            return new UpdatePtsSceneBaseLineResponse(this);
        } 

    } 

}
