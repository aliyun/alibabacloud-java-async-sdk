// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeployDISyncTaskResponse} extends {@link TeaModel}
 *
 * <p>DeployDISyncTaskResponse</p>
 */
public class DeployDISyncTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeployDISyncTaskResponseBody body;

    private DeployDISyncTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeployDISyncTaskResponse create() {
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
    public DeployDISyncTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeployDISyncTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeployDISyncTaskResponseBody body);

        @Override
        DeployDISyncTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeployDISyncTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeployDISyncTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeployDISyncTaskResponse response) {
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
        public Builder body(DeployDISyncTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeployDISyncTaskResponse build() {
            return new DeployDISyncTaskResponse(this);
        } 

    } 

}
