// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutMonitorGroupDynamicRuleResponse} extends {@link TeaModel}
 *
 * <p>PutMonitorGroupDynamicRuleResponse</p>
 */
public class PutMonitorGroupDynamicRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PutMonitorGroupDynamicRuleResponseBody body;

    private PutMonitorGroupDynamicRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PutMonitorGroupDynamicRuleResponse create() {
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
    public PutMonitorGroupDynamicRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PutMonitorGroupDynamicRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PutMonitorGroupDynamicRuleResponseBody body);

        @Override
        PutMonitorGroupDynamicRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PutMonitorGroupDynamicRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PutMonitorGroupDynamicRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PutMonitorGroupDynamicRuleResponse response) {
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
        public Builder body(PutMonitorGroupDynamicRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PutMonitorGroupDynamicRuleResponse build() {
            return new PutMonitorGroupDynamicRuleResponse(this);
        } 

    } 

}
