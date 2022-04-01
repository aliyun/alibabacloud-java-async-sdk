// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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

    @NameInMap("OrderId")
    private String orderId;

    @NameInMap("RequestId")
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
         * DiskId.
         */
        public Builder diskId(String diskId) {
            this.diskId = diskId;
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

        public CreateDiskResponseBody build() {
            return new CreateDiskResponseBody(this);
        } 

    } 

}
