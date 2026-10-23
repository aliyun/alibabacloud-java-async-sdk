// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link CreateDedicatedHostClusterResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDedicatedHostClusterResponseBody</p>
 */
public class CreateDedicatedHostClusterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DedicatedHostClusterId")
    private String dedicatedHostClusterId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateDedicatedHostClusterResponseBody model) {
            this.dedicatedHostClusterId = model.dedicatedHostClusterId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the host group.</p>
         * 
         * <strong>example:</strong>
         * <p>dc-bp12wlf6bw0vz9v2****</p>
         */
        public Builder dedicatedHostClusterId(String dedicatedHostClusterId) {
            this.dedicatedHostClusterId = dedicatedHostClusterId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E2A664A6-2933-4C64-88AE-5033D003****</p>
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
