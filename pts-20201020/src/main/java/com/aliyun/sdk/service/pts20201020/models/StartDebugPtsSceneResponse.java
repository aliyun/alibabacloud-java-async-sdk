// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartDebugPtsSceneResponse} extends {@link TeaModel}
 *
 * <p>StartDebugPtsSceneResponse</p>
 */
public class StartDebugPtsSceneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartDebugPtsSceneResponseBody body;

    private StartDebugPtsSceneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartDebugPtsSceneResponse create() {
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
    public StartDebugPtsSceneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartDebugPtsSceneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartDebugPtsSceneResponseBody body);

        @Override
        StartDebugPtsSceneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartDebugPtsSceneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartDebugPtsSceneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartDebugPtsSceneResponse response) {
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
        public Builder body(StartDebugPtsSceneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartDebugPtsSceneResponse build() {
            return new StartDebugPtsSceneResponse(this);
        } 

    } 

}
