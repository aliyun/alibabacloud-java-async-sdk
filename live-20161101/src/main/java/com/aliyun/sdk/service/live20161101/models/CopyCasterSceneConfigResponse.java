// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CopyCasterSceneConfigResponse} extends {@link TeaModel}
 *
 * <p>CopyCasterSceneConfigResponse</p>
 */
public class CopyCasterSceneConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CopyCasterSceneConfigResponseBody body;

    private CopyCasterSceneConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CopyCasterSceneConfigResponse create() {
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
    public CopyCasterSceneConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CopyCasterSceneConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CopyCasterSceneConfigResponseBody body);

        @Override
        CopyCasterSceneConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CopyCasterSceneConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CopyCasterSceneConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CopyCasterSceneConfigResponse response) {
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
        public Builder body(CopyCasterSceneConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CopyCasterSceneConfigResponse build() {
            return new CopyCasterSceneConfigResponse(this);
        } 

    } 

}
