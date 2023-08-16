// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BidDomainResponse} extends {@link TeaModel}
 *
 * <p>BidDomainResponse</p>
 */
public class BidDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BidDomainResponseBody body;

    private BidDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BidDomainResponse create() {
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
    public BidDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BidDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BidDomainResponseBody body);

        @Override
        BidDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BidDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BidDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BidDomainResponse response) {
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
        public Builder body(BidDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BidDomainResponse build() {
            return new BidDomainResponse(this);
        } 

    } 

}
