// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecuteGtmRecoveryPlanResponse} extends {@link TeaModel}
 *
 * <p>ExecuteGtmRecoveryPlanResponse</p>
 */
public class ExecuteGtmRecoveryPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ExecuteGtmRecoveryPlanResponseBody body;

    private ExecuteGtmRecoveryPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ExecuteGtmRecoveryPlanResponse create() {
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
    public ExecuteGtmRecoveryPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ExecuteGtmRecoveryPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ExecuteGtmRecoveryPlanResponseBody body);

        @Override
        ExecuteGtmRecoveryPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ExecuteGtmRecoveryPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ExecuteGtmRecoveryPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ExecuteGtmRecoveryPlanResponse response) {
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
        public Builder body(ExecuteGtmRecoveryPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ExecuteGtmRecoveryPlanResponse build() {
            return new ExecuteGtmRecoveryPlanResponse(this);
        } 

    } 

}
