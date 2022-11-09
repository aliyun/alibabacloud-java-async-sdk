// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddShardingNodeResponseBody} extends {@link TeaModel}
 *
 * <p>AddShardingNodeResponseBody</p>
 */
public class AddShardingNodeResponseBody extends TeaModel {
    @NameInMap("NodeIds")
    private java.util.List < String > nodeIds;

    @NameInMap("OrderId")
    private Long orderId;

    @NameInMap("RequestId")
    private String requestId;

    private AddShardingNodeResponseBody(Builder builder) {
        this.nodeIds = builder.nodeIds;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddShardingNodeResponseBody create() {
        return builder().build();
    }

    /**
     * @return nodeIds
     */
    public java.util.List < String > getNodeIds() {
        return this.nodeIds;
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > nodeIds; 
        private Long orderId; 
        private String requestId; 

        /**
         * NodeIds.
         */
        public Builder nodeIds(java.util.List < String > nodeIds) {
            this.nodeIds = nodeIds;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(Long orderId) {
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

        public AddShardingNodeResponseBody build() {
            return new AddShardingNodeResponseBody(this);
        } 

    } 

}
