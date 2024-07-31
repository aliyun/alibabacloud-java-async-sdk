// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyHybridCloudSdkPullinStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyHybridCloudSdkPullinStatusRequest</p>
 */
public class ModifyHybridCloudSdkPullinStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PullinStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pullinStatus;

    private ModifyHybridCloudSdkPullinStatusRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.mid = builder.mid;
        this.pullinStatus = builder.pullinStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyHybridCloudSdkPullinStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return mid
     */
    public String getMid() {
        return this.mid;
    }

    /**
     * @return pullinStatus
     */
    public String getPullinStatus() {
        return this.pullinStatus;
    }

    public static final class Builder extends Request.Builder<ModifyHybridCloudSdkPullinStatusRequest, Builder> {
        private String instanceId; 
        private String mid; 
        private String pullinStatus; 

        private Builder() {
            super();
        } 

        private Builder(ModifyHybridCloudSdkPullinStatusRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.mid = request.mid;
            this.pullinStatus = request.pullinStatus;
        } 

        /**
         * The ID of the WAF instance.
         * <p>
         * 
         * >  You can call the [DescribeInstanceInfo](~~140857~~) operation to query the ID of the WAF instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the SDK.
         */
        public Builder mid(String mid) {
            this.putQueryParameter("Mid", mid);
            this.mid = mid;
            return this;
        }

        /**
         * The status of traffic redirection. Valid values:
         * <p>
         * 
         * *   **on**
         * *   **off**
         */
        public Builder pullinStatus(String pullinStatus) {
            this.putQueryParameter("PullinStatus", pullinStatus);
            this.pullinStatus = pullinStatus;
            return this;
        }

        @Override
        public ModifyHybridCloudSdkPullinStatusRequest build() {
            return new ModifyHybridCloudSdkPullinStatusRequest(this);
        } 

    } 

}
