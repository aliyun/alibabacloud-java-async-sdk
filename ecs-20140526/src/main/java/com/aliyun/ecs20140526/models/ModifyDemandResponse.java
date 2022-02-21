// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDemandResponse} extends {@link TeaModel}
 *
 * <p>ModifyDemandResponse</p>
 */
public class ModifyDemandResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDemandResponseBody body;

    private ModifyDemandResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDemandResponse create() {
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
    public ModifyDemandResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDemandResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDemandResponseBody body);

        @Override
        ModifyDemandResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDemandResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDemandResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDemandResponse response) {
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
        public Builder body(ModifyDemandResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDemandResponse build() {
            return new ModifyDemandResponse(this);
        } 

    } 

}
