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
 * {@link RenewRCInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>RenewRCInstanceResponseBody</p>
 */
public class RenewRCInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("OrderIds")
    private String orderIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RenewRCInstanceResponseBody(Builder builder) {
        this.DBInstanceId = builder.DBInstanceId;
        this.orderId = builder.orderId;
        this.orderIds = builder.orderIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenewRCInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return orderIds
     */
    public String getOrderIds() {
        return this.orderIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String DBInstanceId; 
        private String orderId; 
        private String orderIds; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(RenewRCInstanceResponseBody model) {
            this.DBInstanceId = model.DBInstanceId;
            this.orderId = model.orderId;
            this.orderIds = model.orderIds;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the RDS Custom instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rc-dh2jf9n6j4s14926****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
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
         * <p>The order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>23202700556****</p>
         */
        public Builder orderIds(String orderIds) {
            this.orderIds = orderIds;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EFFC7565-B3CF-5CFA-9E1F-164DD1E1F498</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RenewRCInstanceResponseBody build() {
            return new RenewRCInstanceResponseBody(this);
        } 

    } 

}
