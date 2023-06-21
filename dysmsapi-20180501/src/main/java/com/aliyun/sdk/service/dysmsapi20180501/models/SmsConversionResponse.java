// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SmsConversionResponse} extends {@link TeaModel}
 *
 * <p>SmsConversionResponse</p>
 */
public class SmsConversionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SmsConversionResponseBody body;

    private SmsConversionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SmsConversionResponse create() {
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
    public SmsConversionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SmsConversionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SmsConversionResponseBody body);

        @Override
        SmsConversionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SmsConversionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SmsConversionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SmsConversionResponse response) {
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
        public Builder body(SmsConversionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SmsConversionResponse build() {
            return new SmsConversionResponse(this);
        } 

    } 

}
