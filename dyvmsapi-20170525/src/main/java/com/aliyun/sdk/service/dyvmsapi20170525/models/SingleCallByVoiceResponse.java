// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SingleCallByVoiceResponse} extends {@link TeaModel}
 *
 * <p>SingleCallByVoiceResponse</p>
 */
public class SingleCallByVoiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SingleCallByVoiceResponseBody body;

    private SingleCallByVoiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SingleCallByVoiceResponse create() {
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
    public SingleCallByVoiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SingleCallByVoiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SingleCallByVoiceResponseBody body);

        @Override
        SingleCallByVoiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SingleCallByVoiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SingleCallByVoiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SingleCallByVoiceResponse response) {
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
        public Builder body(SingleCallByVoiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SingleCallByVoiceResponse build() {
            return new SingleCallByVoiceResponse(this);
        } 

    } 

}
