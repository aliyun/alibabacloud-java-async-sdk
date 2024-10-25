// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AttachNetworkInterfaceRequest} extends {@link RequestModel}
 *
 * <p>AttachNetworkInterfaceRequest</p>
 */
public class AttachNetworkInterfaceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkInterfaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String networkInterfaceId;

    private AttachNetworkInterfaceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.networkInterfaceId = builder.networkInterfaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachNetworkInterfaceRequest create() {
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
     * @return networkInterfaceId
     */
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    public static final class Builder extends Request.Builder<AttachNetworkInterfaceRequest, Builder> {
        private String instanceId; 
        private String networkInterfaceId; 

        private Builder() {
            super();
        } 

        private Builder(AttachNetworkInterfaceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.networkInterfaceId = request.networkInterfaceId;
        } 

        /**
         * <p>The ID of the instance</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-5p67acfmxazb4p****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the ENI.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-58z57orgmt6d1****</p>
         */
        public Builder networkInterfaceId(String networkInterfaceId) {
            this.putQueryParameter("NetworkInterfaceId", networkInterfaceId);
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }

        @Override
        public AttachNetworkInterfaceRequest build() {
            return new AttachNetworkInterfaceRequest(this);
        } 

    } 

}
