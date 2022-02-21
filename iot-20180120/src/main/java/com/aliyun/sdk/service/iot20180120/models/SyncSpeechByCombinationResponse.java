// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SyncSpeechByCombinationResponse} extends {@link TeaModel}
 *
 * <p>SyncSpeechByCombinationResponse</p>
 */
public class SyncSpeechByCombinationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SyncSpeechByCombinationResponseBody body;

    private SyncSpeechByCombinationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SyncSpeechByCombinationResponse create() {
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
    public SyncSpeechByCombinationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SyncSpeechByCombinationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SyncSpeechByCombinationResponseBody body);

        @Override
        SyncSpeechByCombinationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SyncSpeechByCombinationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SyncSpeechByCombinationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SyncSpeechByCombinationResponse response) {
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
        public Builder body(SyncSpeechByCombinationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SyncSpeechByCombinationResponse build() {
            return new SyncSpeechByCombinationResponse(this);
        } 

    } 

}
