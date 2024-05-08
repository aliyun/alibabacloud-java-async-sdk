// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDiskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDiskResponseBody</p>
 */
public class CreateDiskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DiskId")
    private String diskId;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateDiskResponseBody(Builder builder) {
        this.diskId = builder.diskId;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDiskResponseBody create() {
        return builder().build();
    }

    /**
     * @return diskId
     */
    public String getDiskId() {
        return this.diskId;
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
        private String diskId; 
        private String orderId; 
        private String requestId; 

        /**
         * The disk ID.
         */
        public Builder diskId(String diskId) {
            this.diskId = diskId;
            return this;
        }

        /**
         * The order ID.
         * <p>
         * 
         * > The order ID is returned only when you create a subscription disk.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDiskResponseBody build() {
            return new CreateDiskResponseBody(this);
        } 

    } 

}
