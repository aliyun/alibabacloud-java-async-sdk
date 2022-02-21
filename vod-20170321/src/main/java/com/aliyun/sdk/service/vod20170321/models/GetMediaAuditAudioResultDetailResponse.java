// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMediaAuditAudioResultDetailResponse} extends {@link TeaModel}
 *
 * <p>GetMediaAuditAudioResultDetailResponse</p>
 */
public class GetMediaAuditAudioResultDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMediaAuditAudioResultDetailResponseBody body;

    private GetMediaAuditAudioResultDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMediaAuditAudioResultDetailResponse create() {
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
    public GetMediaAuditAudioResultDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMediaAuditAudioResultDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMediaAuditAudioResultDetailResponseBody body);

        @Override
        GetMediaAuditAudioResultDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMediaAuditAudioResultDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMediaAuditAudioResultDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMediaAuditAudioResultDetailResponse response) {
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
        public Builder body(GetMediaAuditAudioResultDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMediaAuditAudioResultDetailResponse build() {
            return new GetMediaAuditAudioResultDetailResponse(this);
        } 

    } 

}
