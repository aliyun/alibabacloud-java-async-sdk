// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SavePtsSceneResponse} extends {@link TeaModel}
 *
 * <p>SavePtsSceneResponse</p>
 */
public class SavePtsSceneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SavePtsSceneResponseBody body;

    private SavePtsSceneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SavePtsSceneResponse create() {
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
    public SavePtsSceneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SavePtsSceneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SavePtsSceneResponseBody body);

        @Override
        SavePtsSceneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SavePtsSceneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SavePtsSceneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SavePtsSceneResponse response) {
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
        public Builder body(SavePtsSceneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SavePtsSceneResponse build() {
            return new SavePtsSceneResponse(this);
        } 

    } 

}
