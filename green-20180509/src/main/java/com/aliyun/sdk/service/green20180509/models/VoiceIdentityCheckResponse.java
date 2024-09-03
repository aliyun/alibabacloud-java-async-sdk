// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20180509.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VoiceIdentityCheckResponse} extends {@link TeaModel}
 *
 * <p>VoiceIdentityCheckResponse</p>
 */
public class VoiceIdentityCheckResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private VoiceIdentityCheckResponseBody body;

    private VoiceIdentityCheckResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static VoiceIdentityCheckResponse create() {
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
    public VoiceIdentityCheckResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<VoiceIdentityCheckResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(VoiceIdentityCheckResponseBody body);

        @Override
        VoiceIdentityCheckResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<VoiceIdentityCheckResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private VoiceIdentityCheckResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(VoiceIdentityCheckResponse response) {
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
        public Builder body(VoiceIdentityCheckResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public VoiceIdentityCheckResponse build() {
            return new VoiceIdentityCheckResponse(this);
        } 

    } 

}
