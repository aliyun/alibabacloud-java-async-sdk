// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyParametersResponse} extends {@link TeaModel}
 *
 * <p>ModifyParametersResponse</p>
 */
public class ModifyParametersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyParametersResponseBody body;

    private ModifyParametersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyParametersResponse create() {
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
    public ModifyParametersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyParametersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyParametersResponseBody body);

        @Override
        ModifyParametersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyParametersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyParametersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyParametersResponse response) {
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
        public Builder body(ModifyParametersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyParametersResponse build() {
            return new ModifyParametersResponse(this);
        } 

    } 

}
