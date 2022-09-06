// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDownloadFileResponse} extends {@link TeaModel}
 *
 * <p>GetDownloadFileResponse</p>
 */
public class GetDownloadFileResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDownloadFileResponseBody body;

    private GetDownloadFileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDownloadFileResponse create() {
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
    public GetDownloadFileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDownloadFileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDownloadFileResponseBody body);

        @Override
        GetDownloadFileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDownloadFileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDownloadFileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDownloadFileResponse response) {
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
        public Builder body(GetDownloadFileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDownloadFileResponse build() {
            return new GetDownloadFileResponse(this);
        } 

    } 

}
