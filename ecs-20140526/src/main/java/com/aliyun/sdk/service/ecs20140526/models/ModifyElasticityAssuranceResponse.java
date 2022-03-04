// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyElasticityAssuranceResponse} extends {@link TeaModel}
 *
 * <p>ModifyElasticityAssuranceResponse</p>
 */
public class ModifyElasticityAssuranceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyElasticityAssuranceResponseBody body;

    private ModifyElasticityAssuranceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyElasticityAssuranceResponse create() {
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
    public ModifyElasticityAssuranceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyElasticityAssuranceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyElasticityAssuranceResponseBody body);

        @Override
        ModifyElasticityAssuranceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyElasticityAssuranceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyElasticityAssuranceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyElasticityAssuranceResponse response) {
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
        public Builder body(ModifyElasticityAssuranceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyElasticityAssuranceResponse build() {
            return new ModifyElasticityAssuranceResponse(this);
        } 

    } 

}
