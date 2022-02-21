// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyResourcePoolResponse} extends {@link TeaModel}
 *
 * <p>ModifyResourcePoolResponse</p>
 */
public class ModifyResourcePoolResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyResourcePoolResponseBody body;

    private ModifyResourcePoolResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyResourcePoolResponse create() {
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
    public ModifyResourcePoolResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyResourcePoolResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyResourcePoolResponseBody body);

        @Override
        ModifyResourcePoolResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyResourcePoolResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyResourcePoolResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyResourcePoolResponse response) {
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
        public Builder body(ModifyResourcePoolResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyResourcePoolResponse build() {
            return new ModifyResourcePoolResponse(this);
        } 

    } 

}
