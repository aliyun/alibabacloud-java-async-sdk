// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifySmsCodeResponse} extends {@link TeaModel}
 *
 * <p>VerifySmsCodeResponse</p>
 */
public class VerifySmsCodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private VerifySmsCodeResponseBody body;

    private VerifySmsCodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static VerifySmsCodeResponse create() {
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
    public VerifySmsCodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<VerifySmsCodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(VerifySmsCodeResponseBody body);

        @Override
        VerifySmsCodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<VerifySmsCodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private VerifySmsCodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(VerifySmsCodeResponse response) {
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
        public Builder body(VerifySmsCodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public VerifySmsCodeResponse build() {
            return new VerifySmsCodeResponse(this);
        } 

    } 

}
