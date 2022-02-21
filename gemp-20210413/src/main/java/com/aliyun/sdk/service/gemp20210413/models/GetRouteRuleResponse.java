// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRouteRuleResponse} extends {@link TeaModel}
 *
 * <p>GetRouteRuleResponse</p>
 */
public class GetRouteRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetRouteRuleResponseBody body;

    private GetRouteRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetRouteRuleResponse create() {
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
    public GetRouteRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetRouteRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetRouteRuleResponseBody body);

        @Override
        GetRouteRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetRouteRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetRouteRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetRouteRuleResponse response) {
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
        public Builder body(GetRouteRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetRouteRuleResponse build() {
            return new GetRouteRuleResponse(this);
        } 

    } 

}
