// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyApiGroupVpcWhitelistResponse} extends {@link TeaModel}
 *
 * <p>ModifyApiGroupVpcWhitelistResponse</p>
 */
public class ModifyApiGroupVpcWhitelistResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyApiGroupVpcWhitelistResponseBody body;

    private ModifyApiGroupVpcWhitelistResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyApiGroupVpcWhitelistResponse create() {
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
    public ModifyApiGroupVpcWhitelistResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyApiGroupVpcWhitelistResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyApiGroupVpcWhitelistResponseBody body);

        @Override
        ModifyApiGroupVpcWhitelistResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyApiGroupVpcWhitelistResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyApiGroupVpcWhitelistResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyApiGroupVpcWhitelistResponse response) {
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
        public Builder body(ModifyApiGroupVpcWhitelistResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyApiGroupVpcWhitelistResponse build() {
            return new ModifyApiGroupVpcWhitelistResponse(this);
        } 

    } 

}
