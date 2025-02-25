// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

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
 * {@link CreateServiceInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateServiceInstanceResponseBody</p>
 */
public class CreateServiceInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MarketInstanceId")
    private String marketInstanceId;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceInstanceId")
    private String serviceInstanceId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private CreateServiceInstanceResponseBody(Builder builder) {
        this.marketInstanceId = builder.marketInstanceId;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
        this.serviceInstanceId = builder.serviceInstanceId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return marketInstanceId
     */
    public String getMarketInstanceId() {
        return this.marketInstanceId;
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
     * @return serviceInstanceId
     */
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String marketInstanceId; 
        private String orderId; 
        private String requestId; 
        private String serviceInstanceId; 
        private String status; 

        /**
         * <p>The MartketInstance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>786***45</p>
         */
        public Builder marketInstanceId(String marketInstanceId) {
            this.marketInstanceId = marketInstanceId;
            return this;
        }

        /**
         * <p>The order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2306175xxxxxxxx</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4DB0F536-B3BE-4F0D-BD29-E83FB56D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The service instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>si-d6ab3a63ccbb4b17****</p>
         */
        public Builder serviceInstanceId(String serviceInstanceId) {
            this.serviceInstanceId = serviceInstanceId;
            return this;
        }

        /**
         * <p>The status of the service instance. Valid values:</p>
         * <ul>
         * <li><strong>Created</strong></li>
         * <li><strong>Deploying</strong></li>
         * <li><strong>DeployedFailed</strong></li>
         * <li><strong>Deployed</strong></li>
         * <li><strong>Upgrading</strong></li>
         * <li><strong>Deleting</strong></li>
         * <li><strong>Deleted</strong></li>
         * <li><strong>DeletedFailed</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Created</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public CreateServiceInstanceResponseBody build() {
            return new CreateServiceInstanceResponseBody(this);
        } 

    } 

}
