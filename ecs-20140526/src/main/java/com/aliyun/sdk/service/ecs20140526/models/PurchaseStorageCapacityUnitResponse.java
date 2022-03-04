// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PurchaseStorageCapacityUnitResponse} extends {@link TeaModel}
 *
 * <p>PurchaseStorageCapacityUnitResponse</p>
 */
public class PurchaseStorageCapacityUnitResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PurchaseStorageCapacityUnitResponseBody body;

    private PurchaseStorageCapacityUnitResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PurchaseStorageCapacityUnitResponse create() {
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
    public PurchaseStorageCapacityUnitResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PurchaseStorageCapacityUnitResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PurchaseStorageCapacityUnitResponseBody body);

        @Override
        PurchaseStorageCapacityUnitResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PurchaseStorageCapacityUnitResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PurchaseStorageCapacityUnitResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PurchaseStorageCapacityUnitResponse response) {
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
        public Builder body(PurchaseStorageCapacityUnitResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PurchaseStorageCapacityUnitResponse build() {
            return new PurchaseStorageCapacityUnitResponse(this);
        } 

    } 

}
