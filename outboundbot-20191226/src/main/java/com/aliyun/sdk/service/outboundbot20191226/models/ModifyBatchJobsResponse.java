// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyBatchJobsResponse} extends {@link TeaModel}
 *
 * <p>ModifyBatchJobsResponse</p>
 */
public class ModifyBatchJobsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyBatchJobsResponseBody body;

    private ModifyBatchJobsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyBatchJobsResponse create() {
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
    public ModifyBatchJobsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyBatchJobsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyBatchJobsResponseBody body);

        @Override
        ModifyBatchJobsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyBatchJobsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyBatchJobsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyBatchJobsResponse response) {
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
        public Builder body(ModifyBatchJobsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyBatchJobsResponse build() {
            return new ModifyBatchJobsResponse(this);
        } 

    } 

}
