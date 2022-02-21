// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyNodeSpecBatchResponse} extends {@link TeaModel}
 *
 * <p>ModifyNodeSpecBatchResponse</p>
 */
public class ModifyNodeSpecBatchResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyNodeSpecBatchResponseBody body;

    private ModifyNodeSpecBatchResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyNodeSpecBatchResponse create() {
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
    public ModifyNodeSpecBatchResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyNodeSpecBatchResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyNodeSpecBatchResponseBody body);

        @Override
        ModifyNodeSpecBatchResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyNodeSpecBatchResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyNodeSpecBatchResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyNodeSpecBatchResponse response) {
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
        public Builder body(ModifyNodeSpecBatchResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyNodeSpecBatchResponse build() {
            return new ModifyNodeSpecBatchResponse(this);
        } 

    } 

}
