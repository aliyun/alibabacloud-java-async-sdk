// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BuySecretNoResponse} extends {@link TeaModel}
 *
 * <p>BuySecretNoResponse</p>
 */
public class BuySecretNoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BuySecretNoResponseBody body;

    private BuySecretNoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BuySecretNoResponse create() {
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
    public BuySecretNoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BuySecretNoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BuySecretNoResponseBody body);

        @Override
        BuySecretNoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BuySecretNoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BuySecretNoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BuySecretNoResponse response) {
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
        public Builder body(BuySecretNoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BuySecretNoResponse build() {
            return new BuySecretNoResponse(this);
        } 

    } 

}
