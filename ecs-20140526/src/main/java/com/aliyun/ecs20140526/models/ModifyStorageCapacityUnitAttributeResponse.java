// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyStorageCapacityUnitAttributeResponse} extends {@link TeaModel}
 *
 * <p>ModifyStorageCapacityUnitAttributeResponse</p>
 */
public class ModifyStorageCapacityUnitAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyStorageCapacityUnitAttributeResponseBody body;

    private ModifyStorageCapacityUnitAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyStorageCapacityUnitAttributeResponse create() {
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
    public ModifyStorageCapacityUnitAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyStorageCapacityUnitAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyStorageCapacityUnitAttributeResponseBody body);

        @Override
        ModifyStorageCapacityUnitAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyStorageCapacityUnitAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyStorageCapacityUnitAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyStorageCapacityUnitAttributeResponse response) {
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
        public Builder body(ModifyStorageCapacityUnitAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyStorageCapacityUnitAttributeResponse build() {
            return new ModifyStorageCapacityUnitAttributeResponse(this);
        } 

    } 

}
