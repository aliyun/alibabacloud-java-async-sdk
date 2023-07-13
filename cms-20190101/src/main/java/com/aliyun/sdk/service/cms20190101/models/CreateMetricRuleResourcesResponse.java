// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMetricRuleResourcesResponse} extends {@link TeaModel}
 *
 * <p>CreateMetricRuleResourcesResponse</p>
 */
public class CreateMetricRuleResourcesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateMetricRuleResourcesResponseBody body;

    private CreateMetricRuleResourcesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateMetricRuleResourcesResponse create() {
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
    public CreateMetricRuleResourcesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateMetricRuleResourcesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateMetricRuleResourcesResponseBody body);

        @Override
        CreateMetricRuleResourcesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateMetricRuleResourcesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateMetricRuleResourcesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateMetricRuleResourcesResponse response) {
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
        public Builder body(CreateMetricRuleResourcesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateMetricRuleResourcesResponse build() {
            return new CreateMetricRuleResourcesResponse(this);
        } 

    } 

}
