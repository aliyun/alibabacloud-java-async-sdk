// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCdnDomainOwnerResponse} extends {@link TeaModel}
 *
 * <p>ModifyCdnDomainOwnerResponse</p>
 */
public class ModifyCdnDomainOwnerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyCdnDomainOwnerResponseBody body;

    private ModifyCdnDomainOwnerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyCdnDomainOwnerResponse create() {
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
    public ModifyCdnDomainOwnerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyCdnDomainOwnerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyCdnDomainOwnerResponseBody body);

        @Override
        ModifyCdnDomainOwnerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyCdnDomainOwnerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyCdnDomainOwnerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyCdnDomainOwnerResponse response) {
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
        public Builder body(ModifyCdnDomainOwnerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyCdnDomainOwnerResponse build() {
            return new ModifyCdnDomainOwnerResponse(this);
        } 

    } 

}
