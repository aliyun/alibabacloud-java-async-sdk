// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyDcdnDomainOwnerResponse} extends {@link TeaModel}
 *
 * <p>VerifyDcdnDomainOwnerResponse</p>
 */
public class VerifyDcdnDomainOwnerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private VerifyDcdnDomainOwnerResponseBody body;

    private VerifyDcdnDomainOwnerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static VerifyDcdnDomainOwnerResponse create() {
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
    public VerifyDcdnDomainOwnerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<VerifyDcdnDomainOwnerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(VerifyDcdnDomainOwnerResponseBody body);

        @Override
        VerifyDcdnDomainOwnerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<VerifyDcdnDomainOwnerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private VerifyDcdnDomainOwnerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(VerifyDcdnDomainOwnerResponse response) {
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
        public Builder body(VerifyDcdnDomainOwnerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public VerifyDcdnDomainOwnerResponse build() {
            return new VerifyDcdnDomainOwnerResponse(this);
        } 

    } 

}
