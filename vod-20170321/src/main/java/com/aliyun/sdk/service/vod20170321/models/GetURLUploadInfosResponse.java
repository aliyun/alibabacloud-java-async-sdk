// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetURLUploadInfosResponse} extends {@link TeaModel}
 *
 * <p>GetURLUploadInfosResponse</p>
 */
public class GetURLUploadInfosResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetURLUploadInfosResponseBody body;

    private GetURLUploadInfosResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetURLUploadInfosResponse create() {
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
    public GetURLUploadInfosResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetURLUploadInfosResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetURLUploadInfosResponseBody body);

        @Override
        GetURLUploadInfosResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetURLUploadInfosResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetURLUploadInfosResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetURLUploadInfosResponse response) {
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
        public Builder body(GetURLUploadInfosResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetURLUploadInfosResponse build() {
            return new GetURLUploadInfosResponse(this);
        } 

    } 

}
