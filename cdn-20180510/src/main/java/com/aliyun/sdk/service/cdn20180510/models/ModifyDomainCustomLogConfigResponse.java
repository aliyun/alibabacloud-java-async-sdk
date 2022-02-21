// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDomainCustomLogConfigResponse} extends {@link TeaModel}
 *
 * <p>ModifyDomainCustomLogConfigResponse</p>
 */
public class ModifyDomainCustomLogConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDomainCustomLogConfigResponseBody body;

    private ModifyDomainCustomLogConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDomainCustomLogConfigResponse create() {
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
    public ModifyDomainCustomLogConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDomainCustomLogConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDomainCustomLogConfigResponseBody body);

        @Override
        ModifyDomainCustomLogConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDomainCustomLogConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDomainCustomLogConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDomainCustomLogConfigResponse response) {
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
        public Builder body(ModifyDomainCustomLogConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDomainCustomLogConfigResponse build() {
            return new ModifyDomainCustomLogConfigResponse(this);
        } 

    } 

}
