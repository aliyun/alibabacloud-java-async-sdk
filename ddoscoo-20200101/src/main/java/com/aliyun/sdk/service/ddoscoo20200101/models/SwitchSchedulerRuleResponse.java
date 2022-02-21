// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SwitchSchedulerRuleResponse} extends {@link TeaModel}
 *
 * <p>SwitchSchedulerRuleResponse</p>
 */
public class SwitchSchedulerRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SwitchSchedulerRuleResponseBody body;

    private SwitchSchedulerRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SwitchSchedulerRuleResponse create() {
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
    public SwitchSchedulerRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SwitchSchedulerRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SwitchSchedulerRuleResponseBody body);

        @Override
        SwitchSchedulerRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SwitchSchedulerRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SwitchSchedulerRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SwitchSchedulerRuleResponse response) {
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
        public Builder body(SwitchSchedulerRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SwitchSchedulerRuleResponse build() {
            return new SwitchSchedulerRuleResponse(this);
        } 

    } 

}
