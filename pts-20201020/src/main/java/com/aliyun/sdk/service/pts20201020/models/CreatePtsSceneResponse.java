// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePtsSceneResponse} extends {@link TeaModel}
 *
 * <p>CreatePtsSceneResponse</p>
 */
public class CreatePtsSceneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreatePtsSceneResponseBody body;

    private CreatePtsSceneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreatePtsSceneResponse create() {
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
    public CreatePtsSceneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreatePtsSceneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreatePtsSceneResponseBody body);

        @Override
        CreatePtsSceneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreatePtsSceneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreatePtsSceneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreatePtsSceneResponse response) {
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
        public Builder body(CreatePtsSceneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreatePtsSceneResponse build() {
            return new CreatePtsSceneResponse(this);
        } 

    } 

}
