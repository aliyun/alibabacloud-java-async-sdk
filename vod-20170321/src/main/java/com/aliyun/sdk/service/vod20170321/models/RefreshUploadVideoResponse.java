// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshUploadVideoResponse} extends {@link TeaModel}
 *
 * <p>RefreshUploadVideoResponse</p>
 */
public class RefreshUploadVideoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RefreshUploadVideoResponseBody body;

    private RefreshUploadVideoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RefreshUploadVideoResponse create() {
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
    public RefreshUploadVideoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RefreshUploadVideoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RefreshUploadVideoResponseBody body);

        @Override
        RefreshUploadVideoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RefreshUploadVideoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RefreshUploadVideoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RefreshUploadVideoResponse response) {
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
        public Builder body(RefreshUploadVideoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RefreshUploadVideoResponse build() {
            return new RefreshUploadVideoResponse(this);
        } 

    } 

}
