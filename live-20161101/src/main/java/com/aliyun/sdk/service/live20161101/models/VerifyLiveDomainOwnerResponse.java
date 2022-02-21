// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyLiveDomainOwnerResponse} extends {@link TeaModel}
 *
 * <p>VerifyLiveDomainOwnerResponse</p>
 */
public class VerifyLiveDomainOwnerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private VerifyLiveDomainOwnerResponseBody body;

    private VerifyLiveDomainOwnerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static VerifyLiveDomainOwnerResponse create() {
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
    public VerifyLiveDomainOwnerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<VerifyLiveDomainOwnerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(VerifyLiveDomainOwnerResponseBody body);

        @Override
        VerifyLiveDomainOwnerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<VerifyLiveDomainOwnerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private VerifyLiveDomainOwnerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(VerifyLiveDomainOwnerResponse response) {
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
        public Builder body(VerifyLiveDomainOwnerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public VerifyLiveDomainOwnerResponse build() {
            return new VerifyLiveDomainOwnerResponse(this);
        } 

    } 

}
