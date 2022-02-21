// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SilenceTimeoutResponse} extends {@link TeaModel}
 *
 * <p>SilenceTimeoutResponse</p>
 */
public class SilenceTimeoutResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SilenceTimeoutResponseBody body;

    private SilenceTimeoutResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SilenceTimeoutResponse create() {
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
    public SilenceTimeoutResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SilenceTimeoutResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SilenceTimeoutResponseBody body);

        @Override
        SilenceTimeoutResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SilenceTimeoutResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SilenceTimeoutResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SilenceTimeoutResponse response) {
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
        public Builder body(SilenceTimeoutResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SilenceTimeoutResponse build() {
            return new SilenceTimeoutResponse(this);
        } 

    } 

}
