// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableEscalationPlanResponse} extends {@link TeaModel}
 *
 * <p>DisableEscalationPlanResponse</p>
 */
public class DisableEscalationPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableEscalationPlanResponseBody body;

    private DisableEscalationPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableEscalationPlanResponse create() {
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
    public DisableEscalationPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableEscalationPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableEscalationPlanResponseBody body);

        @Override
        DisableEscalationPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableEscalationPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableEscalationPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableEscalationPlanResponse response) {
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
        public Builder body(DisableEscalationPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableEscalationPlanResponse build() {
            return new DisableEscalationPlanResponse(this);
        } 

    } 

}
