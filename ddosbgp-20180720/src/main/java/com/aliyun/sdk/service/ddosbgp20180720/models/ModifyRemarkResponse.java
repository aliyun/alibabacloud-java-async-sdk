// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyRemarkResponse} extends {@link TeaModel}
 *
 * <p>ModifyRemarkResponse</p>
 */
public class ModifyRemarkResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyRemarkResponseBody body;

    private ModifyRemarkResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyRemarkResponse create() {
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
    public ModifyRemarkResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyRemarkResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyRemarkResponseBody body);

        @Override
        ModifyRemarkResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyRemarkResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyRemarkResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyRemarkResponse response) {
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
        public Builder body(ModifyRemarkResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyRemarkResponse build() {
            return new ModifyRemarkResponse(this);
        } 

    } 

}
