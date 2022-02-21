// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPWByDomainResponse} extends {@link TeaModel}
 *
 * <p>ModifyPWByDomainResponse</p>
 */
public class ModifyPWByDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyPWByDomainResponseBody body;

    private ModifyPWByDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyPWByDomainResponse create() {
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
    public ModifyPWByDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyPWByDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyPWByDomainResponseBody body);

        @Override
        ModifyPWByDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyPWByDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyPWByDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyPWByDomainResponse response) {
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
        public Builder body(ModifyPWByDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyPWByDomainResponse build() {
            return new ModifyPWByDomainResponse(this);
        } 

    } 

}
