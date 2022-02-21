// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDbscResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDbscResponseBody</p>
 */
public class CreateDbscResponseBody extends TeaModel {
    @NameInMap("DbscId")
    private String dbscId;

    @NameInMap("OrderId")
    private String orderId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateDbscResponseBody(Builder builder) {
        this.dbscId = builder.dbscId;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDbscResponseBody create() {
        return builder().build();
    }

    /**
     * @return dbscId
     */
    public String getDbscId() {
        return this.dbscId;
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
        private String dbscId; 
        private String orderId; 
        private String requestId; 

        /**
         * DbscId.
         */
        public Builder dbscId(String dbscId) {
            this.dbscId = dbscId;
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

        public CreateDbscResponseBody build() {
            return new CreateDbscResponseBody(this);
        } 

    } 

}
