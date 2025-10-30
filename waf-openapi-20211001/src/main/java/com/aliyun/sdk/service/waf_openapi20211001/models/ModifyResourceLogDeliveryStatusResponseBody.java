// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link ModifyResourceLogDeliveryStatusResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyResourceLogDeliveryStatusResponseBody</p>
 */
public class ModifyResourceLogDeliveryStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeliveryName")
    private String deliveryName;

    @com.aliyun.core.annotation.NameInMap("DeliveryType")
    private String deliveryType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private Boolean status;

    private ModifyResourceLogDeliveryStatusResponseBody(Builder builder) {
        this.deliveryName = builder.deliveryName;
        this.deliveryType = builder.deliveryType;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyResourceLogDeliveryStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deliveryName
     */
    public String getDeliveryName() {
        return this.deliveryName;
    }

    /**
     * @return deliveryType
     */
    public String getDeliveryType() {
        return this.deliveryType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public Boolean getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String deliveryName; 
        private String deliveryType; 
        private String requestId; 
        private Boolean status; 

        private Builder() {
        } 

        private Builder(ModifyResourceLogDeliveryStatusResponseBody model) {
            this.deliveryName = model.deliveryName;
            this.deliveryType = model.deliveryType;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * DeliveryName.
         */
        public Builder deliveryName(String deliveryName) {
            this.deliveryName = deliveryName;
            return this;
        }

        /**
         * DeliveryType.
         */
        public Builder deliveryType(String deliveryType) {
            this.deliveryType = deliveryType;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Boolean status) {
            this.status = status;
            return this;
        }

        public ModifyResourceLogDeliveryStatusResponseBody build() {
            return new ModifyResourceLogDeliveryStatusResponseBody(this);
        } 

    } 

}
