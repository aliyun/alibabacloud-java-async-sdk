// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSecurityScoreRuleResponse} extends {@link TeaModel}
 *
 * <p>GetSecurityScoreRuleResponse</p>
 */
public class GetSecurityScoreRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSecurityScoreRuleResponseBody body;

    private GetSecurityScoreRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSecurityScoreRuleResponse create() {
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
    public GetSecurityScoreRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSecurityScoreRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSecurityScoreRuleResponseBody body);

        @Override
        GetSecurityScoreRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSecurityScoreRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSecurityScoreRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSecurityScoreRuleResponse response) {
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
        public Builder body(GetSecurityScoreRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSecurityScoreRuleResponse build() {
            return new GetSecurityScoreRuleResponse(this);
        } 

    } 

}
