// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetScenePreviewResourceResponse} extends {@link TeaModel}
 *
 * <p>GetScenePreviewResourceResponse</p>
 */
public class GetScenePreviewResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetScenePreviewResourceResponseBody body;

    private GetScenePreviewResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetScenePreviewResourceResponse create() {
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
    public GetScenePreviewResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetScenePreviewResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetScenePreviewResourceResponseBody body);

        @Override
        GetScenePreviewResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetScenePreviewResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetScenePreviewResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetScenePreviewResourceResponse response) {
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
        public Builder body(GetScenePreviewResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetScenePreviewResourceResponse build() {
            return new GetScenePreviewResourceResponse(this);
        } 

    } 

}
