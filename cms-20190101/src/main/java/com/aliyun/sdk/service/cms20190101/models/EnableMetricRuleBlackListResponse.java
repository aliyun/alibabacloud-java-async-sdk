// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableMetricRuleBlackListResponse} extends {@link TeaModel}
 *
 * <p>EnableMetricRuleBlackListResponse</p>
 */
public class EnableMetricRuleBlackListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableMetricRuleBlackListResponseBody body;

    private EnableMetricRuleBlackListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableMetricRuleBlackListResponse create() {
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
    public EnableMetricRuleBlackListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableMetricRuleBlackListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableMetricRuleBlackListResponseBody body);

        @Override
        EnableMetricRuleBlackListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableMetricRuleBlackListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableMetricRuleBlackListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableMetricRuleBlackListResponse response) {
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
        public Builder body(EnableMetricRuleBlackListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableMetricRuleBlackListResponse build() {
            return new EnableMetricRuleBlackListResponse(this);
        } 

    } 

}
