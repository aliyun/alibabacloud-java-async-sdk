// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyElasticPlanResponse} extends {@link TeaModel}
 *
 * <p>ModifyElasticPlanResponse</p>
 */
public class ModifyElasticPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyElasticPlanResponseBody body;

    private ModifyElasticPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyElasticPlanResponse create() {
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
    public ModifyElasticPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyElasticPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyElasticPlanResponseBody body);

        @Override
        ModifyElasticPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyElasticPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyElasticPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyElasticPlanResponse response) {
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
        public Builder body(ModifyElasticPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyElasticPlanResponse build() {
            return new ModifyElasticPlanResponse(this);
        } 

    } 

}
