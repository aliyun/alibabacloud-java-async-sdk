// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyActiveOperationTaskResponse} extends {@link TeaModel}
 *
 * <p>ModifyActiveOperationTaskResponse</p>
 */
public class ModifyActiveOperationTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyActiveOperationTaskResponseBody body;

    private ModifyActiveOperationTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyActiveOperationTaskResponse create() {
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
    public ModifyActiveOperationTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyActiveOperationTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyActiveOperationTaskResponseBody body);

        @Override
        ModifyActiveOperationTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyActiveOperationTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyActiveOperationTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyActiveOperationTaskResponse response) {
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
        public Builder body(ModifyActiveOperationTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyActiveOperationTaskResponse build() {
            return new ModifyActiveOperationTaskResponse(this);
        } 

    } 

}
