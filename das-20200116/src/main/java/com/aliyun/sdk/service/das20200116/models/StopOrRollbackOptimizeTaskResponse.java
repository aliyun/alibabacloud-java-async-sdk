// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopOrRollbackOptimizeTaskResponse} extends {@link TeaModel}
 *
 * <p>StopOrRollbackOptimizeTaskResponse</p>
 */
public class StopOrRollbackOptimizeTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopOrRollbackOptimizeTaskResponseBody body;

    private StopOrRollbackOptimizeTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopOrRollbackOptimizeTaskResponse create() {
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
    public StopOrRollbackOptimizeTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopOrRollbackOptimizeTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopOrRollbackOptimizeTaskResponseBody body);

        @Override
        StopOrRollbackOptimizeTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopOrRollbackOptimizeTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopOrRollbackOptimizeTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopOrRollbackOptimizeTaskResponse response) {
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
        public Builder body(StopOrRollbackOptimizeTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopOrRollbackOptimizeTaskResponse build() {
            return new StopOrRollbackOptimizeTaskResponse(this);
        } 

    } 

}
