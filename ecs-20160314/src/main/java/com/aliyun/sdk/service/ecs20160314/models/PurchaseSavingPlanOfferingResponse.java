// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PurchaseSavingPlanOfferingResponse} extends {@link TeaModel}
 *
 * <p>PurchaseSavingPlanOfferingResponse</p>
 */
public class PurchaseSavingPlanOfferingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PurchaseSavingPlanOfferingResponseBody body;

    private PurchaseSavingPlanOfferingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PurchaseSavingPlanOfferingResponse create() {
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
    public PurchaseSavingPlanOfferingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PurchaseSavingPlanOfferingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PurchaseSavingPlanOfferingResponseBody body);

        @Override
        PurchaseSavingPlanOfferingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PurchaseSavingPlanOfferingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PurchaseSavingPlanOfferingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PurchaseSavingPlanOfferingResponse response) {
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
        public Builder body(PurchaseSavingPlanOfferingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PurchaseSavingPlanOfferingResponse build() {
            return new PurchaseSavingPlanOfferingResponse(this);
        } 

    } 

}
