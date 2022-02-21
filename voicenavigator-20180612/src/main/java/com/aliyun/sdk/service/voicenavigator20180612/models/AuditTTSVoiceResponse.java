// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AuditTTSVoiceResponse} extends {@link TeaModel}
 *
 * <p>AuditTTSVoiceResponse</p>
 */
public class AuditTTSVoiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AuditTTSVoiceResponseBody body;

    private AuditTTSVoiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AuditTTSVoiceResponse create() {
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
    public AuditTTSVoiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AuditTTSVoiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AuditTTSVoiceResponseBody body);

        @Override
        AuditTTSVoiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AuditTTSVoiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AuditTTSVoiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AuditTTSVoiceResponse response) {
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
        public Builder body(AuditTTSVoiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AuditTTSVoiceResponse build() {
            return new AuditTTSVoiceResponse(this);
        } 

    } 

}
