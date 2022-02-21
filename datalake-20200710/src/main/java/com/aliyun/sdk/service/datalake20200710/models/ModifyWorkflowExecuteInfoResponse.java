// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWorkflowExecuteInfoResponse} extends {@link TeaModel}
 *
 * <p>ModifyWorkflowExecuteInfoResponse</p>
 */
public class ModifyWorkflowExecuteInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyWorkflowExecuteInfoResponseBody body;

    private ModifyWorkflowExecuteInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyWorkflowExecuteInfoResponse create() {
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
    public ModifyWorkflowExecuteInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyWorkflowExecuteInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyWorkflowExecuteInfoResponseBody body);

        @Override
        ModifyWorkflowExecuteInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyWorkflowExecuteInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyWorkflowExecuteInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyWorkflowExecuteInfoResponse response) {
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
        public Builder body(ModifyWorkflowExecuteInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyWorkflowExecuteInfoResponse build() {
            return new ModifyWorkflowExecuteInfoResponse(this);
        } 

    } 

}
