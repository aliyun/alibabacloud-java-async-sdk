// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyActiveOperationMaintainConfResponse} extends {@link TeaModel}
 *
 * <p>ModifyActiveOperationMaintainConfResponse</p>
 */
public class ModifyActiveOperationMaintainConfResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyActiveOperationMaintainConfResponseBody body;

    private ModifyActiveOperationMaintainConfResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyActiveOperationMaintainConfResponse create() {
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
    public ModifyActiveOperationMaintainConfResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyActiveOperationMaintainConfResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyActiveOperationMaintainConfResponseBody body);

        @Override
        ModifyActiveOperationMaintainConfResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyActiveOperationMaintainConfResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyActiveOperationMaintainConfResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyActiveOperationMaintainConfResponse response) {
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
        public Builder body(ModifyActiveOperationMaintainConfResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyActiveOperationMaintainConfResponse build() {
            return new ModifyActiveOperationMaintainConfResponse(this);
        } 

    } 

}
