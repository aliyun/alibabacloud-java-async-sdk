// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyUnrecognizingConfigResponse} extends {@link TeaModel}
 *
 * <p>ModifyUnrecognizingConfigResponse</p>
 */
public class ModifyUnrecognizingConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyUnrecognizingConfigResponseBody body;

    private ModifyUnrecognizingConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyUnrecognizingConfigResponse create() {
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
    public ModifyUnrecognizingConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyUnrecognizingConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyUnrecognizingConfigResponseBody body);

        @Override
        ModifyUnrecognizingConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyUnrecognizingConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyUnrecognizingConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyUnrecognizingConfigResponse response) {
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
        public Builder body(ModifyUnrecognizingConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyUnrecognizingConfigResponse build() {
            return new ModifyUnrecognizingConfigResponse(this);
        } 

    } 

}
