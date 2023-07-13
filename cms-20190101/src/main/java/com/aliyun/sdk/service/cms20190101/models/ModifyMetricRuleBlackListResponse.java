// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyMetricRuleBlackListResponse} extends {@link TeaModel}
 *
 * <p>ModifyMetricRuleBlackListResponse</p>
 */
public class ModifyMetricRuleBlackListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyMetricRuleBlackListResponseBody body;

    private ModifyMetricRuleBlackListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyMetricRuleBlackListResponse create() {
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
    public ModifyMetricRuleBlackListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyMetricRuleBlackListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyMetricRuleBlackListResponseBody body);

        @Override
        ModifyMetricRuleBlackListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyMetricRuleBlackListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyMetricRuleBlackListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyMetricRuleBlackListResponse response) {
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
        public Builder body(ModifyMetricRuleBlackListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyMetricRuleBlackListResponse build() {
            return new ModifyMetricRuleBlackListResponse(this);
        } 

    } 

}
