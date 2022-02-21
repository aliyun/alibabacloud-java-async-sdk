// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyMixResponse} extends {@link TeaModel}
 *
 * <p>ModifyMixResponse</p>
 */
public class ModifyMixResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyMixResponseBody body;

    private ModifyMixResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyMixResponse create() {
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
    public ModifyMixResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyMixResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyMixResponseBody body);

        @Override
        ModifyMixResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyMixResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyMixResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyMixResponse response) {
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
        public Builder body(ModifyMixResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyMixResponse build() {
            return new ModifyMixResponse(this);
        } 

    } 

}
