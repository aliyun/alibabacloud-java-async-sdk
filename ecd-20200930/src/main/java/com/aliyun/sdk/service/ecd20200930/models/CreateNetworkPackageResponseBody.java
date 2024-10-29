// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The ID of the premium bandwidth plan.</p>
         * 
         * <strong>example:</strong>
         * <p>np-amtp8e8q1o9e4****</p>
         */
        public Builder networkPackageId(String networkPackageId) {
            this.networkPackageId = networkPackageId;
            return this;
        }

        /**
         * <p>The ID of the bill.</p>
         * 
         * <strong>example:</strong>
         * <p>234526262716724</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>269BDB16-2CD8-4865-84BD-11C40BC21DB0</p>
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
