// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyOrderAutoRebootTimeResponse} extends {@link TeaModel}
 *
 * <p>ModifyOrderAutoRebootTimeResponse</p>
 */
public class ModifyOrderAutoRebootTimeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyOrderAutoRebootTimeResponseBody body;

    private ModifyOrderAutoRebootTimeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyOrderAutoRebootTimeResponse create() {
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
    public ModifyOrderAutoRebootTimeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyOrderAutoRebootTimeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyOrderAutoRebootTimeResponseBody body);

        @Override
        ModifyOrderAutoRebootTimeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyOrderAutoRebootTimeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyOrderAutoRebootTimeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyOrderAutoRebootTimeResponse response) {
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
        public Builder body(ModifyOrderAutoRebootTimeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyOrderAutoRebootTimeResponse build() {
            return new ModifyOrderAutoRebootTimeResponse(this);
        } 

    } 

}
