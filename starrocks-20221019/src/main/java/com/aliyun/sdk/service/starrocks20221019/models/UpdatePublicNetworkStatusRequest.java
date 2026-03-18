// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019.models;

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
 * {@link UpdatePublicNetworkStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdatePublicNetworkStatusRequest</p>
 */
public class UpdatePublicNetworkStatusRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComponentType")
    private String componentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeGroupId")
    private String nodeGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PublicNetworkEnabled")
    private Boolean publicNetworkEnabled;

    private UpdatePublicNetworkStatusRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.componentType = builder.componentType;
        this.instanceId = builder.instanceId;
        this.nodeGroupId = builder.nodeGroupId;
        this.publicNetworkEnabled = builder.publicNetworkEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePublicNetworkStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return componentType
     */
    public String getComponentType() {
        return this.componentType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return nodeGroupId
     */
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    /**
     * @return publicNetworkEnabled
     */
    public Boolean getPublicNetworkEnabled() {
        return this.publicNetworkEnabled;
    }

    public static final class Builder extends Request.Builder<UpdatePublicNetworkStatusRequest, Builder> {
        private String regionId; 
        private String componentType; 
        private String instanceId; 
        private String nodeGroupId; 
        private Boolean publicNetworkEnabled; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePublicNetworkStatusRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.componentType = request.componentType;
            this.instanceId = request.instanceId;
            this.nodeGroupId = request.nodeGroupId;
            this.publicNetworkEnabled = request.publicNetworkEnabled;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ComponentType.
         */
        public Builder componentType(String componentType) {
            this.putQueryParameter("ComponentType", componentType);
            this.componentType = componentType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c-b25e21e24388****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * NodeGroupId.
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.putQueryParameter("NodeGroupId", nodeGroupId);
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        /**
         * PublicNetworkEnabled.
         */
        public Builder publicNetworkEnabled(Boolean publicNetworkEnabled) {
            this.putQueryParameter("PublicNetworkEnabled", publicNetworkEnabled);
            this.publicNetworkEnabled = publicNetworkEnabled;
            return this;
        }

        @Override
        public UpdatePublicNetworkStatusRequest build() {
            return new UpdatePublicNetworkStatusRequest(this);
        } 

    } 

}
