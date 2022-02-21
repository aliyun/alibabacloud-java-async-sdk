// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRouteRuleResponse} extends {@link TeaModel}
 *
 * <p>DeleteRouteRuleResponse</p>
 */
public class DeleteRouteRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteRouteRuleResponseBody body;

    private DeleteRouteRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteRouteRuleResponse create() {
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
    public DeleteRouteRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteRouteRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteRouteRuleResponseBody body);

        @Override
        DeleteRouteRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteRouteRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteRouteRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteRouteRuleResponse response) {
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
        public Builder body(DeleteRouteRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteRouteRuleResponse build() {
            return new DeleteRouteRuleResponse(this);
        } 

    } 

}
