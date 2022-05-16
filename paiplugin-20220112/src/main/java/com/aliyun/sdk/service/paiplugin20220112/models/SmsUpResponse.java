// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SmsUpResponse} extends {@link TeaModel}
 *
 * <p>SmsUpResponse</p>
 */
public class SmsUpResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SmsUpResponseBody body;

    private SmsUpResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SmsUpResponse create() {
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
    public SmsUpResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SmsUpResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SmsUpResponseBody body);

        @Override
        SmsUpResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SmsUpResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SmsUpResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SmsUpResponse response) {
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
        public Builder body(SmsUpResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SmsUpResponse build() {
            return new SmsUpResponse(this);
        } 

    } 

}
