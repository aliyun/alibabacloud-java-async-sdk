// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetRuleResponse} extends {@link TeaModel}
 *
 * <p>SetRuleResponse</p>
 */
public class SetRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetRuleResponseBody body;

    private SetRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetRuleResponse create() {
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
    public SetRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetRuleResponseBody body);

        @Override
        SetRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetRuleResponse response) {
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
        public Builder body(SetRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetRuleResponse build() {
            return new SetRuleResponse(this);
        } 

    } 

}
