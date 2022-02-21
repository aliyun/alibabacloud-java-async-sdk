// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateExecutionPlanResponse} extends {@link TeaModel}
 *
 * <p>CreateExecutionPlanResponse</p>
 */
public class CreateExecutionPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateExecutionPlanResponseBody body;

    private CreateExecutionPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateExecutionPlanResponse create() {
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
    public CreateExecutionPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateExecutionPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateExecutionPlanResponseBody body);

        @Override
        CreateExecutionPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateExecutionPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateExecutionPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateExecutionPlanResponse response) {
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
        public Builder body(CreateExecutionPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateExecutionPlanResponse build() {
            return new CreateExecutionPlanResponse(this);
        } 

    } 

}
