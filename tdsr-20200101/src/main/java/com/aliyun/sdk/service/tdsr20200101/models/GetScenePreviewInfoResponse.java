// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetScenePreviewInfoResponse} extends {@link TeaModel}
 *
 * <p>GetScenePreviewInfoResponse</p>
 */
public class GetScenePreviewInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetScenePreviewInfoResponseBody body;

    private GetScenePreviewInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetScenePreviewInfoResponse create() {
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
    public GetScenePreviewInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetScenePreviewInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetScenePreviewInfoResponseBody body);

        @Override
        GetScenePreviewInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetScenePreviewInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetScenePreviewInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetScenePreviewInfoResponse response) {
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
        public Builder body(GetScenePreviewInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetScenePreviewInfoResponse build() {
            return new GetScenePreviewInfoResponse(this);
        } 

    } 

}
