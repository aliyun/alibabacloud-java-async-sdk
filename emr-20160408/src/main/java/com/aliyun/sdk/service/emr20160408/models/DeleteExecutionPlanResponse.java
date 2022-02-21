// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteExecutionPlanResponse} extends {@link TeaModel}
 *
 * <p>DeleteExecutionPlanResponse</p>
 */
public class DeleteExecutionPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteExecutionPlanResponseBody body;

    private DeleteExecutionPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteExecutionPlanResponse create() {
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
    public DeleteExecutionPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteExecutionPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteExecutionPlanResponseBody body);

        @Override
        DeleteExecutionPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteExecutionPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteExecutionPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteExecutionPlanResponse response) {
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
        public Builder body(DeleteExecutionPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteExecutionPlanResponse build() {
            return new DeleteExecutionPlanResponse(this);
        } 

    } 

}
