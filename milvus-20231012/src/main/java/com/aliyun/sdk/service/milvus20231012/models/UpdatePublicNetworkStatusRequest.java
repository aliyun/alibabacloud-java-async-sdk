// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.milvus20231012.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePublicNetworkStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdatePublicNetworkStatusRequest</p>
 */
public class UpdatePublicNetworkStatusRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cidr")
    private String cidr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComponentType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String componentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PublicNetworkEnabled")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean publicNetworkEnabled;

    private UpdatePublicNetworkStatusRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.cidr = builder.cidr;
        this.componentType = builder.componentType;
        this.instanceId = builder.instanceId;
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
     * @return cidr
     */
    public String getCidr() {
        return this.cidr;
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
     * @return publicNetworkEnabled
     */
    public Boolean getPublicNetworkEnabled() {
        return this.publicNetworkEnabled;
    }

    public static final class Builder extends Request.Builder<UpdatePublicNetworkStatusRequest, Builder> {
        private String regionId; 
        private String cidr; 
        private String componentType; 
        private String instanceId; 
        private Boolean publicNetworkEnabled; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePublicNetworkStatusRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.cidr = request.cidr;
            this.componentType = request.componentType;
            this.instanceId = request.instanceId;
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
         * Cidr.
         */
        public Builder cidr(String cidr) {
            this.putQueryParameter("Cidr", cidr);
            this.cidr = cidr;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
