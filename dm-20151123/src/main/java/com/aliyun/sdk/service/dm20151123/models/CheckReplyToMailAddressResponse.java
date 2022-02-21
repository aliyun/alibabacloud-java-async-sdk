// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckReplyToMailAddressResponse} extends {@link TeaModel}
 *
 * <p>CheckReplyToMailAddressResponse</p>
 */
public class CheckReplyToMailAddressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckReplyToMailAddressResponseBody body;

    private CheckReplyToMailAddressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckReplyToMailAddressResponse create() {
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
    public CheckReplyToMailAddressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckReplyToMailAddressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckReplyToMailAddressResponseBody body);

        @Override
        CheckReplyToMailAddressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckReplyToMailAddressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckReplyToMailAddressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckReplyToMailAddressResponse response) {
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
        public Builder body(CheckReplyToMailAddressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckReplyToMailAddressResponse build() {
            return new CheckReplyToMailAddressResponse(this);
        } 

    } 

}
