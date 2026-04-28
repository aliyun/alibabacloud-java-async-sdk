// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link CreateGatewayResponseBody} extends {@link TeaModel}
 *
 * <p>CreateGatewayResponseBody</p>
 */
public class CreateGatewayResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GwClusterId")
    private String gwClusterId;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateGatewayResponseBody(Builder builder) {
        this.gwClusterId = builder.gwClusterId;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGatewayResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gwClusterId
     */
    public String getGwClusterId() {
        return this.gwClusterId;
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

    public static final class Builder {
        private String gwClusterId; 
        private String orderId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateGatewayResponseBody model) {
            this.gwClusterId = model.gwClusterId;
            this.orderId = model.orderId;
            this.requestId = model.requestId;
        } 

        /**
         * GwClusterId.
         */
        public Builder gwClusterId(String gwClusterId) {
            this.gwClusterId = gwClusterId;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>F9F1CB1A-B1D5-4EF5-A53A-************</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateGatewayResponseBody build() {
            return new CreateGatewayResponseBody(this);
        } 

    } 

}
