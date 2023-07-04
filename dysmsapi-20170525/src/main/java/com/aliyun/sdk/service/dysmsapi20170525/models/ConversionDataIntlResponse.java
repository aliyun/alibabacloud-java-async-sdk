// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConversionDataIntlResponse} extends {@link TeaModel}
 *
 * <p>ConversionDataIntlResponse</p>
 */
public class ConversionDataIntlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ConversionDataIntlResponseBody body;

    private ConversionDataIntlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ConversionDataIntlResponse create() {
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
    public ConversionDataIntlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ConversionDataIntlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ConversionDataIntlResponseBody body);

        @Override
        ConversionDataIntlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ConversionDataIntlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ConversionDataIntlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ConversionDataIntlResponse response) {
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
        public Builder body(ConversionDataIntlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ConversionDataIntlResponse build() {
            return new ConversionDataIntlResponse(this);
        } 

    } 

}
