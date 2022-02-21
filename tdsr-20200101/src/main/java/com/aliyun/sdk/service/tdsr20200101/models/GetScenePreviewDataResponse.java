// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetScenePreviewDataResponse} extends {@link TeaModel}
 *
 * <p>GetScenePreviewDataResponse</p>
 */
public class GetScenePreviewDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetScenePreviewDataResponseBody body;

    private GetScenePreviewDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetScenePreviewDataResponse create() {
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
    public GetScenePreviewDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetScenePreviewDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetScenePreviewDataResponseBody body);

        @Override
        GetScenePreviewDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetScenePreviewDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetScenePreviewDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetScenePreviewDataResponse response) {
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
        public Builder body(GetScenePreviewDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetScenePreviewDataResponse build() {
            return new GetScenePreviewDataResponse(this);
        } 

    } 

}
