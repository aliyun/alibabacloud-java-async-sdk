// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyRouteRuleResponse} extends {@link TeaModel}
 *
 * <p>VerifyRouteRuleResponse</p>
 */
public class VerifyRouteRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private VerifyRouteRuleResponseBody body;

    private VerifyRouteRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static VerifyRouteRuleResponse create() {
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
    public VerifyRouteRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<VerifyRouteRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(VerifyRouteRuleResponseBody body);

        @Override
        VerifyRouteRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<VerifyRouteRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private VerifyRouteRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(VerifyRouteRuleResponse response) {
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
        public Builder body(VerifyRouteRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public VerifyRouteRuleResponse build() {
            return new VerifyRouteRuleResponse(this);
        } 

    } 

}
