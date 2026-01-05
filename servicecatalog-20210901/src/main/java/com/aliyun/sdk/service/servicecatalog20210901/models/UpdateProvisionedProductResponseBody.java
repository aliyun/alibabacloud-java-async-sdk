// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateProvisionedProductResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateProvisionedProductResponseBody</p>
 */
public class UpdateProvisionedProductResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ProvisionedProductId")
    private String provisionedProductId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(UpdateProvisionedProductResponseBody model) {
            this.provisionedProductId = model.provisionedProductId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the product instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pp-bp1ddg1n2a****</p>
         */
        public Builder provisionedProductId(String provisionedProductId) {
            this.provisionedProductId = provisionedProductId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0FEEF92D-4052-5202-87D0-3D8EC16F81BF</p>
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
