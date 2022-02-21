// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCdnDomainResponse} extends {@link TeaModel}
 *
 * <p>ModifyCdnDomainResponse</p>
 */
public class ModifyCdnDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyCdnDomainResponseBody body;

    private ModifyCdnDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyCdnDomainResponse create() {
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
    public ModifyCdnDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyCdnDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyCdnDomainResponseBody body);

        @Override
        ModifyCdnDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyCdnDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyCdnDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyCdnDomainResponse response) {
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
        public Builder body(ModifyCdnDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyCdnDomainResponse build() {
            return new ModifyCdnDomainResponse(this);
        } 

    } 

}
