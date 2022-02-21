// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyVodDomainOwnerResponse} extends {@link TeaModel}
 *
 * <p>VerifyVodDomainOwnerResponse</p>
 */
public class VerifyVodDomainOwnerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private VerifyVodDomainOwnerResponseBody body;

    private VerifyVodDomainOwnerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static VerifyVodDomainOwnerResponse create() {
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
    public VerifyVodDomainOwnerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<VerifyVodDomainOwnerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(VerifyVodDomainOwnerResponseBody body);

        @Override
        VerifyVodDomainOwnerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<VerifyVodDomainOwnerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private VerifyVodDomainOwnerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(VerifyVodDomainOwnerResponse response) {
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
        public Builder body(VerifyVodDomainOwnerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public VerifyVodDomainOwnerResponse build() {
            return new VerifyVodDomainOwnerResponse(this);
        } 

    } 

}
