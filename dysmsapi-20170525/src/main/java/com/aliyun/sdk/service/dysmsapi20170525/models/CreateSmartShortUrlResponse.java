// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSmartShortUrlResponse} extends {@link TeaModel}
 *
 * <p>CreateSmartShortUrlResponse</p>
 */
public class CreateSmartShortUrlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSmartShortUrlResponseBody body;

    private CreateSmartShortUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSmartShortUrlResponse create() {
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
    public CreateSmartShortUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSmartShortUrlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSmartShortUrlResponseBody body);

        @Override
        CreateSmartShortUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSmartShortUrlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSmartShortUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSmartShortUrlResponse response) {
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
        public Builder body(CreateSmartShortUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSmartShortUrlResponse build() {
            return new CreateSmartShortUrlResponse(this);
        } 

    } 

}
