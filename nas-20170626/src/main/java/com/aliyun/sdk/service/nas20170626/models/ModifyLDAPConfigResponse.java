// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyLDAPConfigResponse} extends {@link TeaModel}
 *
 * <p>ModifyLDAPConfigResponse</p>
 */
public class ModifyLDAPConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyLDAPConfigResponseBody body;

    private ModifyLDAPConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyLDAPConfigResponse create() {
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
    public ModifyLDAPConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyLDAPConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyLDAPConfigResponseBody body);

        @Override
        ModifyLDAPConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyLDAPConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyLDAPConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyLDAPConfigResponse response) {
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
        public Builder body(ModifyLDAPConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyLDAPConfigResponse build() {
            return new ModifyLDAPConfigResponse(this);
        } 

    } 

}
