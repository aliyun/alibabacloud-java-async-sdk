// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PurchaseReservedInstancesOfferingResponse} extends {@link TeaModel}
 *
 * <p>PurchaseReservedInstancesOfferingResponse</p>
 */
public class PurchaseReservedInstancesOfferingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PurchaseReservedInstancesOfferingResponseBody body;

    private PurchaseReservedInstancesOfferingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PurchaseReservedInstancesOfferingResponse create() {
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
    public PurchaseReservedInstancesOfferingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PurchaseReservedInstancesOfferingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PurchaseReservedInstancesOfferingResponseBody body);

        @Override
        PurchaseReservedInstancesOfferingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PurchaseReservedInstancesOfferingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PurchaseReservedInstancesOfferingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PurchaseReservedInstancesOfferingResponse response) {
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
        public Builder body(PurchaseReservedInstancesOfferingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PurchaseReservedInstancesOfferingResponse build() {
            return new PurchaseReservedInstancesOfferingResponse(this);
        } 

    } 

}
