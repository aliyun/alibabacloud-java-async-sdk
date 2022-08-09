// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetCardStopRuleResponse} extends {@link TeaModel}
 *
 * <p>SetCardStopRuleResponse</p>
 */
public class SetCardStopRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetCardStopRuleResponseBody body;

    private SetCardStopRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetCardStopRuleResponse create() {
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
    public SetCardStopRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetCardStopRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetCardStopRuleResponseBody body);

        @Override
        SetCardStopRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetCardStopRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetCardStopRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetCardStopRuleResponse response) {
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
        public Builder body(SetCardStopRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetCardStopRuleResponse build() {
            return new SetCardStopRuleResponse(this);
        } 

    } 

}
