// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetectUserFaceByUrlResponse} extends {@link TeaModel}
 *
 * <p>DetectUserFaceByUrlResponse</p>
 */
public class DetectUserFaceByUrlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DetectUserFaceByUrlResponseBody body;

    private DetectUserFaceByUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DetectUserFaceByUrlResponse create() {
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
    public DetectUserFaceByUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DetectUserFaceByUrlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DetectUserFaceByUrlResponseBody body);

        @Override
        DetectUserFaceByUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DetectUserFaceByUrlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DetectUserFaceByUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DetectUserFaceByUrlResponse response) {
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
        public Builder body(DetectUserFaceByUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DetectUserFaceByUrlResponse build() {
            return new DetectUserFaceByUrlResponse(this);
        } 

    } 

}
