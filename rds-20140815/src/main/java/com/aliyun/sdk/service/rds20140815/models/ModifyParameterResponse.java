// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyParameterResponse} extends {@link TeaModel}
 *
 * <p>ModifyParameterResponse</p>
 */
public class ModifyParameterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyParameterResponseBody body;

    private ModifyParameterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyParameterResponse create() {
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
    public ModifyParameterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyParameterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyParameterResponseBody body);

        @Override
        ModifyParameterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyParameterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyParameterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyParameterResponse response) {
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
        public Builder body(ModifyParameterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyParameterResponse build() {
            return new ModifyParameterResponse(this);
        } 

    } 

}
