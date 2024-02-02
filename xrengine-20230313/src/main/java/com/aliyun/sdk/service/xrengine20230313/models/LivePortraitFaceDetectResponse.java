// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LivePortraitFaceDetectResponse} extends {@link TeaModel}
 *
 * <p>LivePortraitFaceDetectResponse</p>
 */
public class LivePortraitFaceDetectResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private LivePortraitFaceDetectResponseBody body;

    private LivePortraitFaceDetectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static LivePortraitFaceDetectResponse create() {
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public LivePortraitFaceDetectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<LivePortraitFaceDetectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(LivePortraitFaceDetectResponseBody body);

        @Override
        LivePortraitFaceDetectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<LivePortraitFaceDetectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private LivePortraitFaceDetectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(LivePortraitFaceDetectResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(LivePortraitFaceDetectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public LivePortraitFaceDetectResponse build() {
            return new LivePortraitFaceDetectResponse(this);
        } 

    } 

}
