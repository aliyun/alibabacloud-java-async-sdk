// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDedicatedHostClusterResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDedicatedHostClusterResponseBody</p>
 */
public class CreateDedicatedHostClusterResponseBody extends TeaModel {
    @NameInMap("DedicatedHostClusterId")
    private String dedicatedHostClusterId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateDedicatedHostClusterResponseBody(Builder builder) {
        this.dedicatedHostClusterId = builder.dedicatedHostClusterId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDedicatedHostClusterResponseBody create() {
        return builder().build();
    }

    /**
     * @return dedicatedHostClusterId
     */
    public String getDedicatedHostClusterId() {
        return this.dedicatedHostClusterId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String dedicatedHostClusterId; 
        private String requestId; 

        /**
         * The ID of the dedicated host cluster.
         */
        public Builder dedicatedHostClusterId(String dedicatedHostClusterId) {
            this.dedicatedHostClusterId = dedicatedHostClusterId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDedicatedHostClusterResponseBody build() {
            return new CreateDedicatedHostClusterResponseBody(this);
        } 

    } 

}
