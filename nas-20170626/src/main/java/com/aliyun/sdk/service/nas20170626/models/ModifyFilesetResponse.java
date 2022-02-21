// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyFilesetResponse} extends {@link TeaModel}
 *
 * <p>ModifyFilesetResponse</p>
 */
public class ModifyFilesetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyFilesetResponseBody body;

    private ModifyFilesetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyFilesetResponse create() {
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
    public ModifyFilesetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyFilesetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyFilesetResponseBody body);

        @Override
        ModifyFilesetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyFilesetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyFilesetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyFilesetResponse response) {
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
        public Builder body(ModifyFilesetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyFilesetResponse build() {
            return new ModifyFilesetResponse(this);
        } 

    } 

}
