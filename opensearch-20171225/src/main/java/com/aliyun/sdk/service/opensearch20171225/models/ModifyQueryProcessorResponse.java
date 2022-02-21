// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyQueryProcessorResponse} extends {@link TeaModel}
 *
 * <p>ModifyQueryProcessorResponse</p>
 */
public class ModifyQueryProcessorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyQueryProcessorResponseBody body;

    private ModifyQueryProcessorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyQueryProcessorResponse create() {
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
    public ModifyQueryProcessorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyQueryProcessorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyQueryProcessorResponseBody body);

        @Override
        ModifyQueryProcessorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyQueryProcessorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyQueryProcessorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyQueryProcessorResponse response) {
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
        public Builder body(ModifyQueryProcessorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyQueryProcessorResponse build() {
            return new ModifyQueryProcessorResponse(this);
        } 

    } 

}
