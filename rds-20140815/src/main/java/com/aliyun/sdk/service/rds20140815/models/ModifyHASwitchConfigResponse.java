// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyHASwitchConfigResponse} extends {@link TeaModel}
 *
 * <p>ModifyHASwitchConfigResponse</p>
 */
public class ModifyHASwitchConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyHASwitchConfigResponseBody body;

    private ModifyHASwitchConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyHASwitchConfigResponse create() {
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
    public ModifyHASwitchConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyHASwitchConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyHASwitchConfigResponseBody body);

        @Override
        ModifyHASwitchConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyHASwitchConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyHASwitchConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyHASwitchConfigResponse response) {
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
        public Builder body(ModifyHASwitchConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyHASwitchConfigResponse build() {
            return new ModifyHASwitchConfigResponse(this);
        } 

    } 

}
