// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ShareSpeechByCombinationResponse} extends {@link TeaModel}
 *
 * <p>ShareSpeechByCombinationResponse</p>
 */
public class ShareSpeechByCombinationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ShareSpeechByCombinationResponseBody body;

    private ShareSpeechByCombinationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ShareSpeechByCombinationResponse create() {
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
    public ShareSpeechByCombinationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ShareSpeechByCombinationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ShareSpeechByCombinationResponseBody body);

        @Override
        ShareSpeechByCombinationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ShareSpeechByCombinationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ShareSpeechByCombinationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ShareSpeechByCombinationResponse response) {
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
        public Builder body(ShareSpeechByCombinationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ShareSpeechByCombinationResponse build() {
            return new ShareSpeechByCombinationResponse(this);
        } 

    } 

}
