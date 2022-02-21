// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPGHbaConfigResponse} extends {@link TeaModel}
 *
 * <p>ModifyPGHbaConfigResponse</p>
 */
public class ModifyPGHbaConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyPGHbaConfigResponseBody body;

    private ModifyPGHbaConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyPGHbaConfigResponse create() {
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
    public ModifyPGHbaConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyPGHbaConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyPGHbaConfigResponseBody body);

        @Override
        ModifyPGHbaConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyPGHbaConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyPGHbaConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyPGHbaConfigResponse response) {
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
        public Builder body(ModifyPGHbaConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyPGHbaConfigResponse build() {
            return new ModifyPGHbaConfigResponse(this);
        } 

    } 

}
