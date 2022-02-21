// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePricingModuleResponse} extends {@link TeaModel}
 *
 * <p>DescribePricingModuleResponse</p>
 */
public class DescribePricingModuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePricingModuleResponseBody body;

    private DescribePricingModuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePricingModuleResponse create() {
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
    public DescribePricingModuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePricingModuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePricingModuleResponseBody body);

        @Override
        DescribePricingModuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePricingModuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePricingModuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePricingModuleResponse response) {
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
        public Builder body(DescribePricingModuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePricingModuleResponse build() {
            return new DescribePricingModuleResponse(this);
        } 

    } 

}
