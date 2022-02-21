// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableRouteRuleResponse} extends {@link TeaModel}
 *
 * <p>DisableRouteRuleResponse</p>
 */
public class DisableRouteRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableRouteRuleResponseBody body;

    private DisableRouteRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableRouteRuleResponse create() {
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
    public DisableRouteRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableRouteRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableRouteRuleResponseBody body);

        @Override
        DisableRouteRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableRouteRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableRouteRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableRouteRuleResponse response) {
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
        public Builder body(DisableRouteRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableRouteRuleResponse build() {
            return new DisableRouteRuleResponse(this);
        } 

    } 

}
