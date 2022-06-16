// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyApplicationResponse} extends {@link TeaModel}
 *
 * <p>ModifyApplicationResponse</p>
 */
public class ModifyApplicationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyApplicationResponseBody body;

    private ModifyApplicationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyApplicationResponse create() {
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
    public ModifyApplicationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyApplicationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyApplicationResponseBody body);

        @Override
        ModifyApplicationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyApplicationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyApplicationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyApplicationResponse response) {
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
        public Builder body(ModifyApplicationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyApplicationResponse build() {
            return new ModifyApplicationResponse(this);
        } 

    } 

}
