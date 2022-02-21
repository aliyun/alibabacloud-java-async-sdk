// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEscalationPlanResponse} extends {@link TeaModel}
 *
 * <p>GetEscalationPlanResponse</p>
 */
public class GetEscalationPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetEscalationPlanResponseBody body;

    private GetEscalationPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetEscalationPlanResponse create() {
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
    public GetEscalationPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetEscalationPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetEscalationPlanResponseBody body);

        @Override
        GetEscalationPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetEscalationPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetEscalationPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetEscalationPlanResponse response) {
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
        public Builder body(GetEscalationPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetEscalationPlanResponse build() {
            return new GetEscalationPlanResponse(this);
        } 

    } 

}
