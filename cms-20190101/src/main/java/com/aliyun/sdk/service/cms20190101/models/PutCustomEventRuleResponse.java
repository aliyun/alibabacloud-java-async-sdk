// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutCustomEventRuleResponse} extends {@link TeaModel}
 *
 * <p>PutCustomEventRuleResponse</p>
 */
public class PutCustomEventRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PutCustomEventRuleResponseBody body;

    private PutCustomEventRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PutCustomEventRuleResponse create() {
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
    public PutCustomEventRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PutCustomEventRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PutCustomEventRuleResponseBody body);

        @Override
        PutCustomEventRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PutCustomEventRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PutCustomEventRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PutCustomEventRuleResponse response) {
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
        public Builder body(PutCustomEventRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PutCustomEventRuleResponse build() {
            return new PutCustomEventRuleResponse(this);
        } 

    } 

}
