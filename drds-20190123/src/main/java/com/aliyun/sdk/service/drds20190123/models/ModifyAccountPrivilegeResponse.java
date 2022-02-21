// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAccountPrivilegeResponse} extends {@link TeaModel}
 *
 * <p>ModifyAccountPrivilegeResponse</p>
 */
public class ModifyAccountPrivilegeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyAccountPrivilegeResponseBody body;

    private ModifyAccountPrivilegeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyAccountPrivilegeResponse create() {
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
    public ModifyAccountPrivilegeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyAccountPrivilegeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyAccountPrivilegeResponseBody body);

        @Override
        ModifyAccountPrivilegeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyAccountPrivilegeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyAccountPrivilegeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyAccountPrivilegeResponse response) {
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
        public Builder body(ModifyAccountPrivilegeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyAccountPrivilegeResponse build() {
            return new ModifyAccountPrivilegeResponse(this);
        } 

    } 

}
