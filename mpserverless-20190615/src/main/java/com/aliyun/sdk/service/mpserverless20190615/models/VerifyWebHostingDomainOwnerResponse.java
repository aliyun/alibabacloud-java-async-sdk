// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyWebHostingDomainOwnerResponse} extends {@link TeaModel}
 *
 * <p>VerifyWebHostingDomainOwnerResponse</p>
 */
public class VerifyWebHostingDomainOwnerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private VerifyWebHostingDomainOwnerResponseBody body;

    private VerifyWebHostingDomainOwnerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static VerifyWebHostingDomainOwnerResponse create() {
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
    public VerifyWebHostingDomainOwnerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<VerifyWebHostingDomainOwnerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(VerifyWebHostingDomainOwnerResponseBody body);

        @Override
        VerifyWebHostingDomainOwnerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<VerifyWebHostingDomainOwnerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private VerifyWebHostingDomainOwnerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(VerifyWebHostingDomainOwnerResponse response) {
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
        public Builder body(VerifyWebHostingDomainOwnerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public VerifyWebHostingDomainOwnerResponse build() {
            return new VerifyWebHostingDomainOwnerResponse(this);
        } 

    } 

}
