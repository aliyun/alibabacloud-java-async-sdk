// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRouteRuleResponse} extends {@link TeaModel}
 *
 * <p>CreateRouteRuleResponse</p>
 */
public class CreateRouteRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateRouteRuleResponseBody body;

    private CreateRouteRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateRouteRuleResponse create() {
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
    public CreateRouteRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateRouteRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateRouteRuleResponseBody body);

        @Override
        CreateRouteRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateRouteRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateRouteRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateRouteRuleResponse response) {
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
        public Builder body(CreateRouteRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateRouteRuleResponse build() {
            return new CreateRouteRuleResponse(this);
        } 

    } 

}
