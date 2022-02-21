// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopRuleResponse} extends {@link TeaModel}
 *
 * <p>StopRuleResponse</p>
 */
public class StopRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopRuleResponseBody body;

    private StopRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopRuleResponse create() {
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
    public StopRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopRuleResponseBody body);

        @Override
        StopRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopRuleResponse response) {
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
        public Builder body(StopRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopRuleResponse build() {
            return new StopRuleResponse(this);
        } 

    } 

}
