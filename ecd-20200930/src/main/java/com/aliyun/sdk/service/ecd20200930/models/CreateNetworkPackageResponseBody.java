// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNetworkPackageResponseBody} extends {@link TeaModel}
 *
 * <p>CreateNetworkPackageResponseBody</p>
 */
public class CreateNetworkPackageResponseBody extends TeaModel {
    @NameInMap("NetworkPackageId")
    private String networkPackageId;

    @NameInMap("OrderId")
    private String orderId;

    @NameInMap("RequestId")
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
         * NetworkPackageId.
         */
        public Builder networkPackageId(String networkPackageId) {
            this.networkPackageId = networkPackageId;
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
         * RequestId.
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
