// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPtsSceneResponse} extends {@link TeaModel}
 *
 * <p>ModifyPtsSceneResponse</p>
 */
public class ModifyPtsSceneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyPtsSceneResponseBody body;

    private ModifyPtsSceneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyPtsSceneResponse create() {
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
    public ModifyPtsSceneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyPtsSceneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyPtsSceneResponseBody body);

        @Override
        ModifyPtsSceneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyPtsSceneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyPtsSceneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyPtsSceneResponse response) {
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
        public Builder body(ModifyPtsSceneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyPtsSceneResponse build() {
            return new ModifyPtsSceneResponse(this);
        } 

    } 

}
