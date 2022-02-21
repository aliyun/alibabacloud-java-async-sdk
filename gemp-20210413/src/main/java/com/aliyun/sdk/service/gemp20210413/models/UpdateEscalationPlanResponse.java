// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEscalationPlanResponse} extends {@link TeaModel}
 *
 * <p>UpdateEscalationPlanResponse</p>
 */
public class UpdateEscalationPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateEscalationPlanResponseBody body;

    private UpdateEscalationPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateEscalationPlanResponse create() {
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
    public UpdateEscalationPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateEscalationPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateEscalationPlanResponseBody body);

        @Override
        UpdateEscalationPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateEscalationPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateEscalationPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateEscalationPlanResponse response) {
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
        public Builder body(UpdateEscalationPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateEscalationPlanResponse build() {
            return new UpdateEscalationPlanResponse(this);
        } 

    } 

}
