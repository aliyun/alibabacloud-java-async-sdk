// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyNodeSpecResponse} extends {@link TeaModel}
 *
 * <p>ModifyNodeSpecResponse</p>
 */
public class ModifyNodeSpecResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyNodeSpecResponseBody body;

    private ModifyNodeSpecResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyNodeSpecResponse create() {
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
    public ModifyNodeSpecResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyNodeSpecResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyNodeSpecResponseBody body);

        @Override
        ModifyNodeSpecResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyNodeSpecResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyNodeSpecResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyNodeSpecResponse response) {
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
        public Builder body(ModifyNodeSpecResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyNodeSpecResponse build() {
            return new ModifyNodeSpecResponse(this);
        } 

    } 

}
