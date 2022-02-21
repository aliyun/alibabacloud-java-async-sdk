// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRouteRuleResponse} extends {@link TeaModel}
 *
 * <p>UpdateRouteRuleResponse</p>
 */
public class UpdateRouteRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateRouteRuleResponseBody body;

    private UpdateRouteRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateRouteRuleResponse create() {
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
    public UpdateRouteRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateRouteRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateRouteRuleResponseBody body);

        @Override
        UpdateRouteRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateRouteRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateRouteRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateRouteRuleResponse response) {
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
        public Builder body(UpdateRouteRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateRouteRuleResponse build() {
            return new UpdateRouteRuleResponse(this);
        } 

    } 

}
