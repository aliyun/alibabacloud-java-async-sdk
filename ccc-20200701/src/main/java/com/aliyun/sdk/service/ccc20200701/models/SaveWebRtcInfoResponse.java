// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveWebRtcInfoResponse} extends {@link TeaModel}
 *
 * <p>SaveWebRtcInfoResponse</p>
 */
public class SaveWebRtcInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SaveWebRtcInfoResponseBody body;

    private SaveWebRtcInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SaveWebRtcInfoResponse create() {
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
    public SaveWebRtcInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveWebRtcInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SaveWebRtcInfoResponseBody body);

        @Override
        SaveWebRtcInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveWebRtcInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SaveWebRtcInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveWebRtcInfoResponse response) {
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
        public Builder body(SaveWebRtcInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveWebRtcInfoResponse build() {
            return new SaveWebRtcInfoResponse(this);
        } 

    } 

}
