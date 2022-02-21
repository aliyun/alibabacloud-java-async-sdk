// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetCasterSceneConfigResponse} extends {@link TeaModel}
 *
 * <p>SetCasterSceneConfigResponse</p>
 */
public class SetCasterSceneConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetCasterSceneConfigResponseBody body;

    private SetCasterSceneConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetCasterSceneConfigResponse create() {
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
    public SetCasterSceneConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetCasterSceneConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetCasterSceneConfigResponseBody body);

        @Override
        SetCasterSceneConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetCasterSceneConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetCasterSceneConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetCasterSceneConfigResponse response) {
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
        public Builder body(SetCasterSceneConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetCasterSceneConfigResponse build() {
            return new SetCasterSceneConfigResponse(this);
        } 

    } 

}
