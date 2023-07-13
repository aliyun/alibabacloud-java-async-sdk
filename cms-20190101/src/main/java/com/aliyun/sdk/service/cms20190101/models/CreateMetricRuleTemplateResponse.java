// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMetricRuleTemplateResponse} extends {@link TeaModel}
 *
 * <p>CreateMetricRuleTemplateResponse</p>
 */
public class CreateMetricRuleTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateMetricRuleTemplateResponseBody body;

    private CreateMetricRuleTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateMetricRuleTemplateResponse create() {
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
    public CreateMetricRuleTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateMetricRuleTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateMetricRuleTemplateResponseBody body);

        @Override
        CreateMetricRuleTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateMetricRuleTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateMetricRuleTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateMetricRuleTemplateResponse response) {
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
        public Builder body(CreateMetricRuleTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateMetricRuleTemplateResponse build() {
            return new CreateMetricRuleTemplateResponse(this);
        } 

    } 

}
