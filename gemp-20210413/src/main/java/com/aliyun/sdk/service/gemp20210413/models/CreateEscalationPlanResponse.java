// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEscalationPlanResponse} extends {@link TeaModel}
 *
 * <p>CreateEscalationPlanResponse</p>
 */
public class CreateEscalationPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateEscalationPlanResponseBody body;

    private CreateEscalationPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateEscalationPlanResponse create() {
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
    public CreateEscalationPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateEscalationPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateEscalationPlanResponseBody body);

        @Override
        CreateEscalationPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateEscalationPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateEscalationPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateEscalationPlanResponse response) {
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
        public Builder body(CreateEscalationPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateEscalationPlanResponse build() {
            return new CreateEscalationPlanResponse(this);
        } 

    } 

}
