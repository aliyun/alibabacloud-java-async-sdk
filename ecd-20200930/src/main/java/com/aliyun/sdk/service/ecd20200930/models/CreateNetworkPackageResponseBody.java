// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNetworkPackageResponseBody} extends {@link TeaModel}
 *
 * <p>CreateNetworkPackageResponseBody</p>
 */
public class CreateNetworkPackageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NetworkPackageId")
    private String networkPackageId;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateNetworkPackageResponseBody(Builder builder) {
        this.networkPackageId = builder.networkPackageId;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNetworkPackageResponseBody create() {
        return builder().build();
    }

    /**
     * @return networkPackageId
     */
    public String getNetworkPackageId() {
        return this.networkPackageId;
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
        private String networkPackageId; 
        private String orderId; 
        private String requestId; 

        /**
         * The ID of the premium bandwidth plan.
         */
        public Builder networkPackageId(String networkPackageId) {
            this.networkPackageId = networkPackageId;
            return this;
        }

        /**
         * The ID of the bill.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateNetworkPackageResponseBody build() {
            return new CreateNetworkPackageResponseBody(this);
        } 

    } 

}
