// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVideoComposeResultResponse} extends {@link TeaModel}
 *
 * <p>GetVideoComposeResultResponse</p>
 */
public class GetVideoComposeResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetVideoComposeResultResponseBody body;

    private GetVideoComposeResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetVideoComposeResultResponse create() {
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
    public GetVideoComposeResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetVideoComposeResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetVideoComposeResultResponseBody body);

        @Override
        GetVideoComposeResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetVideoComposeResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetVideoComposeResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetVideoComposeResultResponse response) {
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
        public Builder body(GetVideoComposeResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetVideoComposeResultResponse build() {
            return new GetVideoComposeResultResponse(this);
        } 

    } 

}
