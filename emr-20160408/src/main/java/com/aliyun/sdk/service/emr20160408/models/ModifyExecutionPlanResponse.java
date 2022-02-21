// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyExecutionPlanResponse} extends {@link TeaModel}
 *
 * <p>ModifyExecutionPlanResponse</p>
 */
public class ModifyExecutionPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyExecutionPlanResponseBody body;

    private ModifyExecutionPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyExecutionPlanResponse create() {
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
    public ModifyExecutionPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyExecutionPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyExecutionPlanResponseBody body);

        @Override
        ModifyExecutionPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyExecutionPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyExecutionPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyExecutionPlanResponse response) {
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
        public Builder body(ModifyExecutionPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyExecutionPlanResponse build() {
            return new ModifyExecutionPlanResponse(this);
        } 

    } 

}
