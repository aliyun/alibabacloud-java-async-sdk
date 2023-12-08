// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BillingApplicationResponse} extends {@link TeaModel}
 *
 * <p>BillingApplicationResponse</p>
 */
public class BillingApplicationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BillingApplicationResponseBody body;

    private BillingApplicationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BillingApplicationResponse create() {
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
    public BillingApplicationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BillingApplicationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BillingApplicationResponseBody body);

        @Override
        BillingApplicationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BillingApplicationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BillingApplicationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BillingApplicationResponse response) {
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
        public Builder body(BillingApplicationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BillingApplicationResponse build() {
            return new BillingApplicationResponse(this);
        } 

    } 

}
