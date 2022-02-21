// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVideoPlayAuthResponse} extends {@link TeaModel}
 *
 * <p>GetVideoPlayAuthResponse</p>
 */
public class GetVideoPlayAuthResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetVideoPlayAuthResponseBody body;

    private GetVideoPlayAuthResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetVideoPlayAuthResponse create() {
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
    public GetVideoPlayAuthResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetVideoPlayAuthResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetVideoPlayAuthResponseBody body);

        @Override
        GetVideoPlayAuthResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetVideoPlayAuthResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetVideoPlayAuthResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetVideoPlayAuthResponse response) {
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
        public Builder body(GetVideoPlayAuthResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetVideoPlayAuthResponse build() {
            return new GetVideoPlayAuthResponse(this);
        } 

    } 

}
