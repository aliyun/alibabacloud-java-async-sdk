// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMonitorGroupDynamicRuleResponse} extends {@link TeaModel}
 *
 * <p>DeleteMonitorGroupDynamicRuleResponse</p>
 */
public class DeleteMonitorGroupDynamicRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteMonitorGroupDynamicRuleResponseBody body;

    private DeleteMonitorGroupDynamicRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteMonitorGroupDynamicRuleResponse create() {
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
    public DeleteMonitorGroupDynamicRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteMonitorGroupDynamicRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteMonitorGroupDynamicRuleResponseBody body);

        @Override
        DeleteMonitorGroupDynamicRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteMonitorGroupDynamicRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteMonitorGroupDynamicRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteMonitorGroupDynamicRuleResponse response) {
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
        public Builder body(DeleteMonitorGroupDynamicRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteMonitorGroupDynamicRuleResponse build() {
            return new DeleteMonitorGroupDynamicRuleResponse(this);
        } 

    } 

}
