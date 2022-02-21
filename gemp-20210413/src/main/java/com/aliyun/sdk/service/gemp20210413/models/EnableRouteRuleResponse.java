// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableRouteRuleResponse} extends {@link TeaModel}
 *
 * <p>EnableRouteRuleResponse</p>
 */
public class EnableRouteRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableRouteRuleResponseBody body;

    private EnableRouteRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableRouteRuleResponse create() {
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
    public EnableRouteRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableRouteRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableRouteRuleResponseBody body);

        @Override
        EnableRouteRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableRouteRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableRouteRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableRouteRuleResponse response) {
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
        public Builder body(EnableRouteRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableRouteRuleResponse build() {
            return new EnableRouteRuleResponse(this);
        } 

    } 

}
