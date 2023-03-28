// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopPtsSceneResponse} extends {@link TeaModel}
 *
 * <p>StopPtsSceneResponse</p>
 */
public class StopPtsSceneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopPtsSceneResponseBody body;

    private StopPtsSceneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopPtsSceneResponse create() {
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
    public StopPtsSceneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopPtsSceneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopPtsSceneResponseBody body);

        @Override
        StopPtsSceneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopPtsSceneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopPtsSceneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopPtsSceneResponse response) {
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
        public Builder body(StopPtsSceneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopPtsSceneResponse build() {
            return new StopPtsSceneResponse(this);
        } 

    } 

}
