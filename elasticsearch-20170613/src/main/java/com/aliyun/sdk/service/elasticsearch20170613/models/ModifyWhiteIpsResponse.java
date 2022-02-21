// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWhiteIpsResponse} extends {@link TeaModel}
 *
 * <p>ModifyWhiteIpsResponse</p>
 */
public class ModifyWhiteIpsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyWhiteIpsResponseBody body;

    private ModifyWhiteIpsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyWhiteIpsResponse create() {
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
    public ModifyWhiteIpsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyWhiteIpsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyWhiteIpsResponseBody body);

        @Override
        ModifyWhiteIpsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyWhiteIpsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyWhiteIpsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyWhiteIpsResponse response) {
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
        public Builder body(ModifyWhiteIpsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyWhiteIpsResponse build() {
            return new ModifyWhiteIpsResponse(this);
        } 

    } 

}
