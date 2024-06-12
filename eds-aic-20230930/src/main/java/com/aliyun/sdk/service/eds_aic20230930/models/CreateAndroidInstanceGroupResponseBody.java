// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAndroidInstanceGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAndroidInstanceGroupResponseBody</p>
 */
public class CreateAndroidInstanceGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceGroupIds")
    private java.util.List < String > instanceGroupIds;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateAndroidInstanceGroupResponseBody(Builder builder) {
        this.instanceGroupIds = builder.instanceGroupIds;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAndroidInstanceGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceGroupIds
     */
    public java.util.List < String > getInstanceGroupIds() {
        return this.instanceGroupIds;
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
        private java.util.List < String > instanceGroupIds; 
        private String orderId; 
        private String requestId; 

        /**
         * InstanceGroupIds.
         */
        public Builder instanceGroupIds(java.util.List < String > instanceGroupIds) {
            this.instanceGroupIds = instanceGroupIds;
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

        public CreateAndroidInstanceGroupResponseBody build() {
            return new CreateAndroidInstanceGroupResponseBody(this);
        } 

    } 

}
