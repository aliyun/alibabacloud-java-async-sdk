// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartPtsSceneResponse} extends {@link TeaModel}
 *
 * <p>StartPtsSceneResponse</p>
 */
public class StartPtsSceneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartPtsSceneResponseBody body;

    private StartPtsSceneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartPtsSceneResponse create() {
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
    public StartPtsSceneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartPtsSceneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartPtsSceneResponseBody body);

        @Override
        StartPtsSceneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartPtsSceneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartPtsSceneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartPtsSceneResponse response) {
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
        public Builder body(StartPtsSceneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartPtsSceneResponse build() {
            return new StartPtsSceneResponse(this);
        } 

    } 

}
