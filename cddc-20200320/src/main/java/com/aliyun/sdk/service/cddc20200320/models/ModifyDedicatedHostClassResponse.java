// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cddc20200320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDedicatedHostClassResponse} extends {@link TeaModel}
 *
 * <p>ModifyDedicatedHostClassResponse</p>
 */
public class ModifyDedicatedHostClassResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDedicatedHostClassResponseBody body;

    private ModifyDedicatedHostClassResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDedicatedHostClassResponse create() {
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
    public ModifyDedicatedHostClassResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDedicatedHostClassResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDedicatedHostClassResponseBody body);

        @Override
        ModifyDedicatedHostClassResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDedicatedHostClassResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDedicatedHostClassResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDedicatedHostClassResponse response) {
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
        public Builder body(ModifyDedicatedHostClassResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDedicatedHostClassResponse build() {
            return new ModifyDedicatedHostClassResponse(this);
        } 

    } 

}
