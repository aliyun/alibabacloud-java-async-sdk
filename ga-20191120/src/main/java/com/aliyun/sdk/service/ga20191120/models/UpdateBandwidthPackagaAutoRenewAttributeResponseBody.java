// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateBandwidthPackagaAutoRenewAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateBandwidthPackagaAutoRenewAttributeResponseBody</p>
 */
public class UpdateBandwidthPackagaAutoRenewAttributeResponseBody extends TeaModel {
    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("RequestId")
    private String requestId;

    private UpdateBandwidthPackagaAutoRenewAttributeResponseBody(Builder builder) {
        this.instanceId = builder.instanceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateBandwidthPackagaAutoRenewAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String instanceId; 
        private String requestId; 

        /**
         * The ID of the bandwidth plan.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateBandwidthPackagaAutoRenewAttributeResponseBody build() {
            return new UpdateBandwidthPackagaAutoRenewAttributeResponseBody(this);
        } 

    } 

}
