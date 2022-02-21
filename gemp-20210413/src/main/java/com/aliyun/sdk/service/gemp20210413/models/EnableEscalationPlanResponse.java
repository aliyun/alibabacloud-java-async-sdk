// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableEscalationPlanResponse} extends {@link TeaModel}
 *
 * <p>EnableEscalationPlanResponse</p>
 */
public class EnableEscalationPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableEscalationPlanResponseBody body;

    private EnableEscalationPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableEscalationPlanResponse create() {
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
    public EnableEscalationPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableEscalationPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableEscalationPlanResponseBody body);

        @Override
        EnableEscalationPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableEscalationPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableEscalationPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableEscalationPlanResponse response) {
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
        public Builder body(EnableEscalationPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableEscalationPlanResponse build() {
            return new EnableEscalationPlanResponse(this);
        } 

    } 

}
