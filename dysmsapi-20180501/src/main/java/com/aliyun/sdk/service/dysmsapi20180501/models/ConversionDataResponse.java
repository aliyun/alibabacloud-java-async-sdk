// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConversionDataResponse} extends {@link TeaModel}
 *
 * <p>ConversionDataResponse</p>
 */
public class ConversionDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ConversionDataResponseBody body;

    private ConversionDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ConversionDataResponse create() {
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
    public ConversionDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ConversionDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ConversionDataResponseBody body);

        @Override
        ConversionDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ConversionDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ConversionDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ConversionDataResponse response) {
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
        public Builder body(ConversionDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ConversionDataResponse build() {
            return new ConversionDataResponse(this);
        } 

    } 

}
