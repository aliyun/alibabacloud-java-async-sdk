// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCasterProgramResponse} extends {@link TeaModel}
 *
 * <p>ModifyCasterProgramResponse</p>
 */
public class ModifyCasterProgramResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyCasterProgramResponseBody body;

    private ModifyCasterProgramResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyCasterProgramResponse create() {
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
    public ModifyCasterProgramResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyCasterProgramResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyCasterProgramResponseBody body);

        @Override
        ModifyCasterProgramResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyCasterProgramResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyCasterProgramResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyCasterProgramResponse response) {
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
        public Builder body(ModifyCasterProgramResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyCasterProgramResponse build() {
            return new ModifyCasterProgramResponse(this);
        } 

    } 

}
