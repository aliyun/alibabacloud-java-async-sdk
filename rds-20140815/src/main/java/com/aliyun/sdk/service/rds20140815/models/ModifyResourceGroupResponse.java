// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyResourceGroupResponse} extends {@link TeaModel}
 *
 * <p>ModifyResourceGroupResponse</p>
 */
public class ModifyResourceGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyResourceGroupResponseBody body;

    private ModifyResourceGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyResourceGroupResponse create() {
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
    public ModifyResourceGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyResourceGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyResourceGroupResponseBody body);

        @Override
        ModifyResourceGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyResourceGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyResourceGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyResourceGroupResponse response) {
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
        public Builder body(ModifyResourceGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyResourceGroupResponse build() {
            return new ModifyResourceGroupResponse(this);
        } 

    } 

}
