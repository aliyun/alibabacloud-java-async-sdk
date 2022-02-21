// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEscalationPlanResponse} extends {@link TeaModel}
 *
 * <p>DeleteEscalationPlanResponse</p>
 */
public class DeleteEscalationPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteEscalationPlanResponseBody body;

    private DeleteEscalationPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteEscalationPlanResponse create() {
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
    public DeleteEscalationPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteEscalationPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteEscalationPlanResponseBody body);

        @Override
        DeleteEscalationPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteEscalationPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteEscalationPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteEscalationPlanResponse response) {
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
        public Builder body(DeleteEscalationPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteEscalationPlanResponse build() {
            return new DeleteEscalationPlanResponse(this);
        } 

    } 

}
