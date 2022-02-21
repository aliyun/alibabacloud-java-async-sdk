// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVideoInfoResponse} extends {@link TeaModel}
 *
 * <p>GetVideoInfoResponse</p>
 */
public class GetVideoInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetVideoInfoResponseBody body;

    private GetVideoInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetVideoInfoResponse create() {
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
    public GetVideoInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetVideoInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetVideoInfoResponseBody body);

        @Override
        GetVideoInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetVideoInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetVideoInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetVideoInfoResponse response) {
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
        public Builder body(GetVideoInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetVideoInfoResponse build() {
            return new GetVideoInfoResponse(this);
        } 

    } 

}
