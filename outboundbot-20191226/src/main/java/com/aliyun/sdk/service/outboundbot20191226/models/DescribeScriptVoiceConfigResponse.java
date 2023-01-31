// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScriptVoiceConfigResponse} extends {@link TeaModel}
 *
 * <p>DescribeScriptVoiceConfigResponse</p>
 */
public class DescribeScriptVoiceConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeScriptVoiceConfigResponseBody body;

    private DescribeScriptVoiceConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeScriptVoiceConfigResponse create() {
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
    public DescribeScriptVoiceConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeScriptVoiceConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeScriptVoiceConfigResponseBody body);

        @Override
        DescribeScriptVoiceConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeScriptVoiceConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeScriptVoiceConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeScriptVoiceConfigResponse response) {
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
        public Builder body(DescribeScriptVoiceConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeScriptVoiceConfigResponse build() {
            return new DescribeScriptVoiceConfigResponse(this);
        } 

    } 

}
