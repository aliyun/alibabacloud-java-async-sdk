// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyGlobalAccelerationInstanceSpecResponse} extends {@link TeaModel}
 *
 * <p>ModifyGlobalAccelerationInstanceSpecResponse</p>
 */
public class ModifyGlobalAccelerationInstanceSpecResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyGlobalAccelerationInstanceSpecResponseBody body;

    private ModifyGlobalAccelerationInstanceSpecResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyGlobalAccelerationInstanceSpecResponse create() {
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
    public ModifyGlobalAccelerationInstanceSpecResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyGlobalAccelerationInstanceSpecResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyGlobalAccelerationInstanceSpecResponseBody body);

        @Override
        ModifyGlobalAccelerationInstanceSpecResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyGlobalAccelerationInstanceSpecResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyGlobalAccelerationInstanceSpecResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyGlobalAccelerationInstanceSpecResponse response) {
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
        public Builder body(ModifyGlobalAccelerationInstanceSpecResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyGlobalAccelerationInstanceSpecResponse build() {
            return new ModifyGlobalAccelerationInstanceSpecResponse(this);
        } 

    } 

}
