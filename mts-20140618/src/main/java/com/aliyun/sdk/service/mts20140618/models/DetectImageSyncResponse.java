// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetectImageSyncResponse} extends {@link TeaModel}
 *
 * <p>DetectImageSyncResponse</p>
 */
public class DetectImageSyncResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DetectImageSyncResponseBody body;

    private DetectImageSyncResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DetectImageSyncResponse create() {
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
    public DetectImageSyncResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DetectImageSyncResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DetectImageSyncResponseBody body);

        @Override
        DetectImageSyncResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DetectImageSyncResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DetectImageSyncResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DetectImageSyncResponse response) {
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
        public Builder body(DetectImageSyncResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DetectImageSyncResponse build() {
            return new DetectImageSyncResponse(this);
        } 

    } 

}
