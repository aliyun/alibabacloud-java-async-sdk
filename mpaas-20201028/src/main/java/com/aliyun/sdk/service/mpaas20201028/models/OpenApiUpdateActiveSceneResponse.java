// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenApiUpdateActiveSceneResponse} extends {@link TeaModel}
 *
 * <p>OpenApiUpdateActiveSceneResponse</p>
 */
public class OpenApiUpdateActiveSceneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OpenApiUpdateActiveSceneResponseBody body;

    private OpenApiUpdateActiveSceneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OpenApiUpdateActiveSceneResponse create() {
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
    public OpenApiUpdateActiveSceneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OpenApiUpdateActiveSceneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OpenApiUpdateActiveSceneResponseBody body);

        @Override
        OpenApiUpdateActiveSceneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OpenApiUpdateActiveSceneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OpenApiUpdateActiveSceneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OpenApiUpdateActiveSceneResponse response) {
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
        public Builder body(OpenApiUpdateActiveSceneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OpenApiUpdateActiveSceneResponse build() {
            return new OpenApiUpdateActiveSceneResponse(this);
        } 

    } 

}
