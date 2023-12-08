// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableElasticPlanResponse} extends {@link TeaModel}
 *
 * <p>EnableElasticPlanResponse</p>
 */
public class EnableElasticPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableElasticPlanResponseBody body;

    private EnableElasticPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableElasticPlanResponse create() {
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
    public EnableElasticPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableElasticPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableElasticPlanResponseBody body);

        @Override
        EnableElasticPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableElasticPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableElasticPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableElasticPlanResponse response) {
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
        public Builder body(EnableElasticPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableElasticPlanResponse build() {
            return new EnableElasticPlanResponse(this);
        } 

    } 

}
