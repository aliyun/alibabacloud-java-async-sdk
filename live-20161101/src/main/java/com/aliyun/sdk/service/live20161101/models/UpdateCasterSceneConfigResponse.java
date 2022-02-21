// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCasterSceneConfigResponse} extends {@link TeaModel}
 *
 * <p>UpdateCasterSceneConfigResponse</p>
 */
public class UpdateCasterSceneConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateCasterSceneConfigResponseBody body;

    private UpdateCasterSceneConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateCasterSceneConfigResponse create() {
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
    public UpdateCasterSceneConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateCasterSceneConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateCasterSceneConfigResponseBody body);

        @Override
        UpdateCasterSceneConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateCasterSceneConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateCasterSceneConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateCasterSceneConfigResponse response) {
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
        public Builder body(UpdateCasterSceneConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateCasterSceneConfigResponse build() {
            return new UpdateCasterSceneConfigResponse(this);
        } 

    } 

}
