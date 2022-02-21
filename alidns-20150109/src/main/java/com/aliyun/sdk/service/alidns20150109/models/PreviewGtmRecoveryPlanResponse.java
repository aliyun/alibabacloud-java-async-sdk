// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PreviewGtmRecoveryPlanResponse} extends {@link TeaModel}
 *
 * <p>PreviewGtmRecoveryPlanResponse</p>
 */
public class PreviewGtmRecoveryPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PreviewGtmRecoveryPlanResponseBody body;

    private PreviewGtmRecoveryPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PreviewGtmRecoveryPlanResponse create() {
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
    public PreviewGtmRecoveryPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PreviewGtmRecoveryPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PreviewGtmRecoveryPlanResponseBody body);

        @Override
        PreviewGtmRecoveryPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PreviewGtmRecoveryPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PreviewGtmRecoveryPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PreviewGtmRecoveryPlanResponse response) {
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
        public Builder body(PreviewGtmRecoveryPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PreviewGtmRecoveryPlanResponse build() {
            return new PreviewGtmRecoveryPlanResponse(this);
        } 

    } 

}
