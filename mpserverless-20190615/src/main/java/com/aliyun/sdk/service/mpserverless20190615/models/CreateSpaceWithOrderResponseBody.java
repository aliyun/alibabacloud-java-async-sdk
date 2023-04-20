// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSpaceWithOrderResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSpaceWithOrderResponseBody</p>
 */
public class CreateSpaceWithOrderResponseBody extends TeaModel {
    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("OrderId")
    private String orderId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SpaceId")
    private String spaceId;

    private CreateSpaceWithOrderResponseBody(Builder builder) {
        this.instanceId = builder.instanceId;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
        this.spaceId = builder.spaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSpaceWithOrderResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    public static final class Builder {
        private String instanceId; 
        private String orderId; 
        private String requestId; 
        private String spaceId; 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
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

        /**
         * SpaceId.
         */
        public Builder spaceId(String spaceId) {
            this.spaceId = spaceId;
            return this;
        }

        public CreateSpaceWithOrderResponseBody build() {
            return new CreateSpaceWithOrderResponseBody(this);
        } 

    } 

}
