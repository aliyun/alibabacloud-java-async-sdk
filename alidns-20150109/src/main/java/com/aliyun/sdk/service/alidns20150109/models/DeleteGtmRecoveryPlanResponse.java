// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteGtmRecoveryPlanResponse} extends {@link TeaModel}
 *
 * <p>DeleteGtmRecoveryPlanResponse</p>
 */
public class DeleteGtmRecoveryPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteGtmRecoveryPlanResponseBody body;

    private DeleteGtmRecoveryPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteGtmRecoveryPlanResponse create() {
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
    public DeleteGtmRecoveryPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteGtmRecoveryPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteGtmRecoveryPlanResponseBody body);

        @Override
        DeleteGtmRecoveryPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteGtmRecoveryPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteGtmRecoveryPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteGtmRecoveryPlanResponse response) {
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
        public Builder body(DeleteGtmRecoveryPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteGtmRecoveryPlanResponse build() {
            return new DeleteGtmRecoveryPlanResponse(this);
        } 

    } 

}
