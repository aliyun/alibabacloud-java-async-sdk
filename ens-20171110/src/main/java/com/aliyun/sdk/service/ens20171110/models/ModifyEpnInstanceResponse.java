// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyEpnInstanceResponse} extends {@link TeaModel}
 *
 * <p>ModifyEpnInstanceResponse</p>
 */
public class ModifyEpnInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyEpnInstanceResponseBody body;

    private ModifyEpnInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyEpnInstanceResponse create() {
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
    public ModifyEpnInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyEpnInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyEpnInstanceResponseBody body);

        @Override
        ModifyEpnInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyEpnInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyEpnInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyEpnInstanceResponse response) {
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
        public Builder body(ModifyEpnInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyEpnInstanceResponse build() {
            return new ModifyEpnInstanceResponse(this);
        } 

    } 

}
