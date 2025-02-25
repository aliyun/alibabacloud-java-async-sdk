// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hsm20231113.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SwitchClusterMasterRequest} extends {@link RequestModel}
 *
 * <p>SwitchClusterMasterRequest</p>
 */
public class SwitchClusterMasterRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private SwitchClusterMasterRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SwitchClusterMasterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<SwitchClusterMasterRequest, Builder> {
        private String clusterId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(SwitchClusterMasterRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.instanceId = request.instanceId;
        } 

        /**
         * The cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The ID of the HSM that you want to promote to the master HSM.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public SwitchClusterMasterRequest build() {
            return new SwitchClusterMasterRequest(this);
        } 

    } 

}
