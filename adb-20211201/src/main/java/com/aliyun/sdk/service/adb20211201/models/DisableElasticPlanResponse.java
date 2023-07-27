// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableElasticPlanResponse} extends {@link TeaModel}
 *
 * <p>DisableElasticPlanResponse</p>
 */
public class DisableElasticPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableElasticPlanResponseBody body;

    private DisableElasticPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableElasticPlanResponse create() {
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
    public DisableElasticPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableElasticPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableElasticPlanResponseBody body);

        @Override
        DisableElasticPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableElasticPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableElasticPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableElasticPlanResponse response) {
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
        public Builder body(DisableElasticPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableElasticPlanResponse build() {
            return new DisableElasticPlanResponse(this);
        } 

    } 

}
