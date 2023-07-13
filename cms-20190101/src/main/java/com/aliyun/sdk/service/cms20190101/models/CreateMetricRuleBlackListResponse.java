// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMetricRuleBlackListResponse} extends {@link TeaModel}
 *
 * <p>CreateMetricRuleBlackListResponse</p>
 */
public class CreateMetricRuleBlackListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateMetricRuleBlackListResponseBody body;

    private CreateMetricRuleBlackListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateMetricRuleBlackListResponse create() {
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
    public CreateMetricRuleBlackListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateMetricRuleBlackListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateMetricRuleBlackListResponseBody body);

        @Override
        CreateMetricRuleBlackListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateMetricRuleBlackListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateMetricRuleBlackListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateMetricRuleBlackListResponse response) {
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
        public Builder body(CreateMetricRuleBlackListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateMetricRuleBlackListResponse build() {
            return new CreateMetricRuleBlackListResponse(this);
        } 

    } 

}
