// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

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
    @NameInMap("DedicatedBlockStorageClusterId")
    private String dedicatedBlockStorageClusterId;

    @NameInMap("DedicatedBlockStorageClusterOrderId")
    private String dedicatedBlockStorageClusterOrderId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateDedicatedBlockStorageClusterResponseBody(Builder builder) {
        this.dedicatedBlockStorageClusterId = builder.dedicatedBlockStorageClusterId;
        this.dedicatedBlockStorageClusterOrderId = builder.dedicatedBlockStorageClusterOrderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDedicatedBlockStorageClusterResponseBody create() {
        return builder().build();
    }

    /**
     * @return dedicatedBlockStorageClusterId
     */
    public String getDedicatedBlockStorageClusterId() {
        return this.dedicatedBlockStorageClusterId;
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

    public static final class Builder {
        private String dedicatedBlockStorageClusterId; 
        private String dedicatedBlockStorageClusterOrderId; 
        private String requestId; 

        /**
         * DedicatedBlockStorageClusterId.
         */
        public Builder dedicatedBlockStorageClusterId(String dedicatedBlockStorageClusterId) {
            this.dedicatedBlockStorageClusterId = dedicatedBlockStorageClusterId;
            return this;
        }

        /**
         * DedicatedBlockStorageClusterOrderId.
         */
        public Builder dedicatedBlockStorageClusterOrderId(String dedicatedBlockStorageClusterOrderId) {
            this.dedicatedBlockStorageClusterOrderId = dedicatedBlockStorageClusterOrderId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDedicatedBlockStorageClusterResponseBody build() {
            return new CreateDedicatedBlockStorageClusterResponseBody(this);
        } 

    } 

}
