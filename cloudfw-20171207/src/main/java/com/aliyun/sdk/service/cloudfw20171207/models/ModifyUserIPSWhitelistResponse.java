// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyUserIPSWhitelistResponse} extends {@link TeaModel}
 *
 * <p>ModifyUserIPSWhitelistResponse</p>
 */
public class ModifyUserIPSWhitelistResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyUserIPSWhitelistResponseBody body;

    private ModifyUserIPSWhitelistResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyUserIPSWhitelistResponse create() {
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
    public ModifyUserIPSWhitelistResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyUserIPSWhitelistResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyUserIPSWhitelistResponseBody body);

        @Override
        ModifyUserIPSWhitelistResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyUserIPSWhitelistResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyUserIPSWhitelistResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyUserIPSWhitelistResponse response) {
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
        public Builder body(ModifyUserIPSWhitelistResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyUserIPSWhitelistResponse build() {
            return new ModifyUserIPSWhitelistResponse(this);
        } 

    } 

}
