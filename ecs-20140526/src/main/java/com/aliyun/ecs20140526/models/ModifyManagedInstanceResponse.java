// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyManagedInstanceResponse} extends {@link TeaModel}
 *
 * <p>ModifyManagedInstanceResponse</p>
 */
public class ModifyManagedInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyManagedInstanceResponseBody body;

    private ModifyManagedInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyManagedInstanceResponse create() {
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
    public ModifyManagedInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyManagedInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyManagedInstanceResponseBody body);

        @Override
        ModifyManagedInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyManagedInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyManagedInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyManagedInstanceResponse response) {
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
        public Builder body(ModifyManagedInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyManagedInstanceResponse build() {
            return new ModifyManagedInstanceResponse(this);
        } 

    } 

}
