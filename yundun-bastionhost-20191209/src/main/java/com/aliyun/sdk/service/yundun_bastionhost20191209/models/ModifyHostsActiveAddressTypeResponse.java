// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyHostsActiveAddressTypeResponse} extends {@link TeaModel}
 *
 * <p>ModifyHostsActiveAddressTypeResponse</p>
 */
public class ModifyHostsActiveAddressTypeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyHostsActiveAddressTypeResponseBody body;

    private ModifyHostsActiveAddressTypeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyHostsActiveAddressTypeResponse create() {
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
    public ModifyHostsActiveAddressTypeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyHostsActiveAddressTypeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyHostsActiveAddressTypeResponseBody body);

        @Override
        ModifyHostsActiveAddressTypeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyHostsActiveAddressTypeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyHostsActiveAddressTypeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyHostsActiveAddressTypeResponse response) {
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
        public Builder body(ModifyHostsActiveAddressTypeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyHostsActiveAddressTypeResponse build() {
            return new ModifyHostsActiveAddressTypeResponse(this);
        } 

    } 

}
