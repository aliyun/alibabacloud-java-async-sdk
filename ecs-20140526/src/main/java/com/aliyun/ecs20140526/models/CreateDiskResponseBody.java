// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDiskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDiskResponseBody</p>
 */
public class CreateDiskResponseBody extends TeaModel {
    @NameInMap("DiskId")
    private String diskId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("OrderId")
    private String orderId;

    private CreateDiskResponseBody(Builder builder) {
        this.diskId = builder.diskId;
        this.requestId = builder.requestId;
        this.orderId = builder.orderId;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    public static final class Builder {
        private String diskId; 
        private String requestId; 
        private String orderId; 

        /**
         * The ID of the disk.
         */
        public Builder diskId(String diskId) {
            this.diskId = diskId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the generated order.
         * <p>
         * 
         * > The Order ID is returned only when a subscription disk is created.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public CreateDiskResponseBody build() {
            return new CreateDiskResponseBody(this);
        } 

    } 

}
