// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateProvisionedProductResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateProvisionedProductResponseBody</p>
 */
public class UpdateProvisionedProductResponseBody extends TeaModel {
    @NameInMap("ProvisionedProductId")
    private String provisionedProductId;

    @NameInMap("RequestId")
    private String requestId;

    private UpdateProvisionedProductResponseBody(Builder builder) {
        this.provisionedProductId = builder.provisionedProductId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProvisionedProductResponseBody create() {
        return builder().build();
    }

    /**
     * @return provisionedProductId
     */
    public String getProvisionedProductId() {
        return this.provisionedProductId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String provisionedProductId; 
        private String requestId; 

        /**
         * The ID of the product instance.
         */
        public Builder provisionedProductId(String provisionedProductId) {
            this.provisionedProductId = provisionedProductId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateProvisionedProductResponseBody build() {
            return new UpdateProvisionedProductResponseBody(this);
        } 

    } 

}
