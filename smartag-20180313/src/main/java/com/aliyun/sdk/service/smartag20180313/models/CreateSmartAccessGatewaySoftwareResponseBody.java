// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link CreateSmartAccessGatewaySoftwareResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSmartAccessGatewaySoftwareResponseBody</p>
 */
public class CreateSmartAccessGatewaySoftwareResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("SmartAGId")
    private String smartAGId;

    private CreateSmartAccessGatewaySoftwareResponseBody(Builder builder) {
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.smartAGId = builder.smartAGId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSmartAccessGatewaySoftwareResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return smartAGId
     */
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public static final class Builder {
        private String orderId; 
        private String requestId; 
        private String resourceGroupId; 
        private String smartAGId; 

        private Builder() {
        } 

        private Builder(CreateSmartAccessGatewaySoftwareResponseBody model) {
            this.orderId = model.orderId;
            this.requestId = model.requestId;
            this.resourceGroupId = model.resourceGroupId;
            this.smartAGId = model.smartAGId;
        } 

        /**
         * <p>The ID of the order that you placed to purchase the SAG app instance.</p>
         * 
         * <strong>example:</strong>
         * <p>203000000000000</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>24675405-74DF-4C94-82C6-B749580C498E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the SAG app instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm2iu4fnc****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The ID of the SAG app instance.</p>
         * 
         * <strong>example:</strong>
         * <p>sag-gnhe6sywtare5******</p>
         */
        public Builder smartAGId(String smartAGId) {
            this.smartAGId = smartAGId;
            return this;
        }

        public CreateSmartAccessGatewaySoftwareResponseBody build() {
            return new CreateSmartAccessGatewaySoftwareResponseBody(this);
        } 

    } 

}
