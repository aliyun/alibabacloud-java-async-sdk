// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link CreateRCDiskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRCDiskResponseBody</p>
 */
public class CreateRCDiskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DiskId")
    private String diskId;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateRCDiskResponseBody(Builder builder) {
        this.diskId = builder.diskId;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRCDiskResponseBody create() {
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
         * <p>The disk ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rcd-2zegrjtnkp6dqbe1egca</p>
         */
        public Builder diskId(String diskId) {
            this.diskId = diskId;
            return this;
        }

        /**
         * <p>The order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>100789370230206</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F2911788-25E8-42E5-A3A3-1B38D263F01E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateRCDiskResponseBody build() {
            return new CreateRCDiskResponseBody(this);
        } 

    } 

}
