// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyReservedInstanceAutoRenewAttributeResponse} extends {@link TeaModel}
 *
 * <p>ModifyReservedInstanceAutoRenewAttributeResponse</p>
 */
public class ModifyReservedInstanceAutoRenewAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyReservedInstanceAutoRenewAttributeResponseBody body;

    private ModifyReservedInstanceAutoRenewAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyReservedInstanceAutoRenewAttributeResponse create() {
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
    public ModifyReservedInstanceAutoRenewAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyReservedInstanceAutoRenewAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyReservedInstanceAutoRenewAttributeResponseBody body);

        @Override
        ModifyReservedInstanceAutoRenewAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyReservedInstanceAutoRenewAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyReservedInstanceAutoRenewAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyReservedInstanceAutoRenewAttributeResponse response) {
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
        public Builder body(ModifyReservedInstanceAutoRenewAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyReservedInstanceAutoRenewAttributeResponse build() {
            return new ModifyReservedInstanceAutoRenewAttributeResponse(this);
        } 

    } 

}
