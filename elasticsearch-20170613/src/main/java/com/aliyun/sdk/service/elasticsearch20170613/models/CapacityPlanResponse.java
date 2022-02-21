// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CapacityPlanResponse} extends {@link TeaModel}
 *
 * <p>CapacityPlanResponse</p>
 */
public class CapacityPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CapacityPlanResponseBody body;

    private CapacityPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CapacityPlanResponse create() {
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
    public CapacityPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CapacityPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CapacityPlanResponseBody body);

        @Override
        CapacityPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CapacityPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CapacityPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CapacityPlanResponse response) {
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
        public Builder body(CapacityPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CapacityPlanResponse build() {
            return new CapacityPlanResponse(this);
        } 

    } 

}
