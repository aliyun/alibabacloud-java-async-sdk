// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAsyncInvokeConfigResponse} extends {@link TeaModel}
 *
 * <p>DeleteAsyncInvokeConfigResponse</p>
 */
public class DeleteAsyncInvokeConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    private DeleteAsyncInvokeConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
    }

    public static DeleteAsyncInvokeConfigResponse create() {
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

    public interface Builder extends Response.Builder<DeleteAsyncInvokeConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        @Override
        DeleteAsyncInvokeConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteAsyncInvokeConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteAsyncInvokeConfigResponse response) {
            super(response);
            this.headers = response.headers;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        @Override
        public DeleteAsyncInvokeConfigResponse build() {
            return new DeleteAsyncInvokeConfigResponse(this);
        } 

    } 

}
