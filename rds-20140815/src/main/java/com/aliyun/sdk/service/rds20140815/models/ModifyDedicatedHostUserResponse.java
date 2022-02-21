// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDedicatedHostUserResponse} extends {@link TeaModel}
 *
 * <p>ModifyDedicatedHostUserResponse</p>
 */
public class ModifyDedicatedHostUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDedicatedHostUserResponseBody body;

    private ModifyDedicatedHostUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDedicatedHostUserResponse create() {
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
    public ModifyDedicatedHostUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDedicatedHostUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDedicatedHostUserResponseBody body);

        @Override
        ModifyDedicatedHostUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDedicatedHostUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDedicatedHostUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDedicatedHostUserResponse response) {
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
        public Builder body(ModifyDedicatedHostUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDedicatedHostUserResponse build() {
            return new ModifyDedicatedHostUserResponse(this);
        } 

    } 

}
