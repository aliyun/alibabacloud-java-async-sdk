// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRouteStrategyResponse} extends {@link TeaModel}
 *
 * <p>CreateRouteStrategyResponse</p>
 */
public class CreateRouteStrategyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateRouteStrategyResponseBody body;

    private CreateRouteStrategyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateRouteStrategyResponse create() {
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
    public CreateRouteStrategyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateRouteStrategyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateRouteStrategyResponseBody body);

        @Override
        CreateRouteStrategyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateRouteStrategyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateRouteStrategyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateRouteStrategyResponse response) {
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
        public Builder body(CreateRouteStrategyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateRouteStrategyResponse build() {
            return new CreateRouteStrategyResponse(this);
        } 

    } 

}
