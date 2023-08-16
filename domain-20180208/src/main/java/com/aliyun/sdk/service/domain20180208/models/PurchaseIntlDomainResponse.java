// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PurchaseIntlDomainResponse} extends {@link TeaModel}
 *
 * <p>PurchaseIntlDomainResponse</p>
 */
public class PurchaseIntlDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PurchaseIntlDomainResponseBody body;

    private PurchaseIntlDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PurchaseIntlDomainResponse create() {
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
    public PurchaseIntlDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PurchaseIntlDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PurchaseIntlDomainResponseBody body);

        @Override
        PurchaseIntlDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PurchaseIntlDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PurchaseIntlDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PurchaseIntlDomainResponse response) {
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
        public Builder body(PurchaseIntlDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PurchaseIntlDomainResponse build() {
            return new PurchaseIntlDomainResponse(this);
        } 

    } 

}
