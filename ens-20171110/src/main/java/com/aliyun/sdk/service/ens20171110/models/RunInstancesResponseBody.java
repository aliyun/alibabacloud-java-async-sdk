// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link RunInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>RunInstancesResponseBody</p>
 */
public class RunInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RunInstancesResponseBody(Builder builder) {
        this.instanceIds = builder.instanceIds;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunInstancesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
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
        private java.util.List<String> instanceIds; 
        private String orderId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(RunInstancesResponseBody model) {
            this.instanceIds = model.instanceIds;
            this.orderId = model.orderId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The IDs of instances.</p>
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>213177957850399</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>91E4AFBE-4E35-5D2A-A886-BB477C9953D2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RunInstancesResponseBody build() {
            return new RunInstancesResponseBody(this);
        } 

    } 

}
