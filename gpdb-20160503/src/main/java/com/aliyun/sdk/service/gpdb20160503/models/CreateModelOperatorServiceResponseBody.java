// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link CreateModelOperatorServiceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateModelOperatorServiceResponseBody</p>
 */
public class CreateModelOperatorServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceId")
    private String serviceId;

    private CreateModelOperatorServiceResponseBody(Builder builder) {
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
        this.serviceId = builder.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateModelOperatorServiceResponseBody create() {
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
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    public static final class Builder {
        private String orderId; 
        private String requestId; 
        private String serviceId; 

        private Builder() {
        } 

        private Builder(CreateModelOperatorServiceResponseBody model) {
            this.orderId = model.orderId;
            this.requestId = model.requestId;
            this.serviceId = model.serviceId;
        } 

        /**
         * <p>The ID of the sales order generated when the model creation operator sub-service is created.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789012345</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The ID of the request. You can use the ID to locate and troubleshoot the request.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the model operator service that corresponds to the sales order. The return of this ID does not indicate that the service has been activated. You can call ListModelOperatorServices to query the subsequent status.</p>
         * 
         * <strong>example:</strong>
         * <p>adbpg-mo-123456789abc</p>
         */
        public Builder serviceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        public CreateModelOperatorServiceResponseBody build() {
            return new CreateModelOperatorServiceResponseBody(this);
        } 

    } 

}
