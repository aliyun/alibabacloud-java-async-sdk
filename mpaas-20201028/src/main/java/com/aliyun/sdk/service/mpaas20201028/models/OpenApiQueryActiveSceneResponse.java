// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenApiQueryActiveSceneResponse} extends {@link TeaModel}
 *
 * <p>OpenApiQueryActiveSceneResponse</p>
 */
public class OpenApiQueryActiveSceneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OpenApiQueryActiveSceneResponseBody body;

    private OpenApiQueryActiveSceneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OpenApiQueryActiveSceneResponse create() {
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
    public OpenApiQueryActiveSceneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OpenApiQueryActiveSceneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OpenApiQueryActiveSceneResponseBody body);

        @Override
        OpenApiQueryActiveSceneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OpenApiQueryActiveSceneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OpenApiQueryActiveSceneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OpenApiQueryActiveSceneResponse response) {
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
        public Builder body(OpenApiQueryActiveSceneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OpenApiQueryActiveSceneResponse build() {
            return new OpenApiQueryActiveSceneResponse(this);
        } 

    } 

}
