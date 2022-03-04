// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDedicatedBlockStorageClusterResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDedicatedBlockStorageClusterResponseBody</p>
 */
public class CreateDedicatedBlockStorageClusterResponseBody extends TeaModel {
    @NameInMap("DedicatedBlockStorageClusterOrderId")
    private String dedicatedBlockStorageClusterOrderId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("DedicatedBlockStorageClusterId")
    private String dedicatedBlockStorageClusterId;

    private CreateDedicatedBlockStorageClusterResponseBody(Builder builder) {
        this.dedicatedBlockStorageClusterOrderId = builder.dedicatedBlockStorageClusterOrderId;
        this.requestId = builder.requestId;
        this.dedicatedBlockStorageClusterId = builder.dedicatedBlockStorageClusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDedicatedBlockStorageClusterResponseBody create() {
        return builder().build();
    }

    /**
     * @return dedicatedBlockStorageClusterOrderId
     */
    public String getDedicatedBlockStorageClusterOrderId() {
        return this.dedicatedBlockStorageClusterOrderId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return dedicatedBlockStorageClusterId
     */
    public String getDedicatedBlockStorageClusterId() {
        return this.dedicatedBlockStorageClusterId;
    }

    public static final class Builder {
        private String dedicatedBlockStorageClusterOrderId; 
        private String requestId; 
        private String dedicatedBlockStorageClusterId; 

        /**
         * The ID of the order.
         */
        public Builder dedicatedBlockStorageClusterOrderId(String dedicatedBlockStorageClusterOrderId) {
            this.dedicatedBlockStorageClusterOrderId = dedicatedBlockStorageClusterOrderId;
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
         * The ID of the dedicated block storage cluster.
         */
        public Builder dedicatedBlockStorageClusterId(String dedicatedBlockStorageClusterId) {
            this.dedicatedBlockStorageClusterId = dedicatedBlockStorageClusterId;
            return this;
        }

        public CreateDedicatedBlockStorageClusterResponseBody build() {
            return new CreateDedicatedBlockStorageClusterResponseBody(this);
        } 

    } 

}
