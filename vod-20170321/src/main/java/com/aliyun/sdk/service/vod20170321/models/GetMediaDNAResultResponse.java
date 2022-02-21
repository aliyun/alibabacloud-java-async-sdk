// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMediaDNAResultResponse} extends {@link TeaModel}
 *
 * <p>GetMediaDNAResultResponse</p>
 */
public class GetMediaDNAResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMediaDNAResultResponseBody body;

    private GetMediaDNAResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMediaDNAResultResponse create() {
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
    public GetMediaDNAResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMediaDNAResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMediaDNAResultResponseBody body);

        @Override
        GetMediaDNAResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMediaDNAResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMediaDNAResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMediaDNAResultResponse response) {
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
        public Builder body(GetMediaDNAResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMediaDNAResultResponse build() {
            return new GetMediaDNAResultResponse(this);
        } 

    } 

}
