// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUploadAudioDataParamsResponse} extends {@link TeaModel}
 *
 * <p>GetUploadAudioDataParamsResponse</p>
 */
public class GetUploadAudioDataParamsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetUploadAudioDataParamsResponseBody body;

    private GetUploadAudioDataParamsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetUploadAudioDataParamsResponse create() {
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
    public GetUploadAudioDataParamsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetUploadAudioDataParamsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetUploadAudioDataParamsResponseBody body);

        @Override
        GetUploadAudioDataParamsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetUploadAudioDataParamsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetUploadAudioDataParamsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetUploadAudioDataParamsResponse response) {
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
        public Builder body(GetUploadAudioDataParamsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetUploadAudioDataParamsResponse build() {
            return new GetUploadAudioDataParamsResponse(this);
        } 

    } 

}
