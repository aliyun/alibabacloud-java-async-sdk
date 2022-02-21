// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pcdn20170411.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisablePcdnControlRuleResponse} extends {@link TeaModel}
 *
 * <p>DisablePcdnControlRuleResponse</p>
 */
public class DisablePcdnControlRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisablePcdnControlRuleResponseBody body;

    private DisablePcdnControlRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisablePcdnControlRuleResponse create() {
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
    public DisablePcdnControlRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisablePcdnControlRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisablePcdnControlRuleResponseBody body);

        @Override
        DisablePcdnControlRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisablePcdnControlRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisablePcdnControlRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisablePcdnControlRuleResponse response) {
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
        public Builder body(DisablePcdnControlRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisablePcdnControlRuleResponse build() {
            return new DisablePcdnControlRuleResponse(this);
        } 

    } 

}
