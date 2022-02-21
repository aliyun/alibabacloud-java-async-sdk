// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddShortUrlResponse} extends {@link TeaModel}
 *
 * <p>AddShortUrlResponse</p>
 */
public class AddShortUrlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddShortUrlResponseBody body;

    private AddShortUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddShortUrlResponse create() {
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
    public AddShortUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddShortUrlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddShortUrlResponseBody body);

        @Override
        AddShortUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddShortUrlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddShortUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddShortUrlResponse response) {
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
        public Builder body(AddShortUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddShortUrlResponse build() {
            return new AddShortUrlResponse(this);
        } 

    } 

}
