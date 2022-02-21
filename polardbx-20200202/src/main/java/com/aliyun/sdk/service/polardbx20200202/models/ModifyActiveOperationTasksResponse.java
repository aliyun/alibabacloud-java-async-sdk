// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyActiveOperationTasksResponse} extends {@link TeaModel}
 *
 * <p>ModifyActiveOperationTasksResponse</p>
 */
public class ModifyActiveOperationTasksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyActiveOperationTasksResponseBody body;

    private ModifyActiveOperationTasksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyActiveOperationTasksResponse create() {
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
    public ModifyActiveOperationTasksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyActiveOperationTasksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyActiveOperationTasksResponseBody body);

        @Override
        ModifyActiveOperationTasksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyActiveOperationTasksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyActiveOperationTasksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyActiveOperationTasksResponse response) {
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
        public Builder body(ModifyActiveOperationTasksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyActiveOperationTasksResponse build() {
            return new ModifyActiveOperationTasksResponse(this);
        } 

    } 

}
