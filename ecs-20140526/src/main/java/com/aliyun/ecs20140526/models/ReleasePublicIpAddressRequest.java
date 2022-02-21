// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleasePublicIpAddressRequest} extends {@link RequestModel}
 *
 * <p>ReleasePublicIpAddressRequest</p>
 */
public class ReleasePublicIpAddressRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("PublicIpAddress")
    private String publicIpAddress;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    private ReleasePublicIpAddressRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.publicIpAddress = builder.publicIpAddress;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleasePublicIpAddressRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return publicIpAddress
     */
    public String getPublicIpAddress() {
        return this.publicIpAddress;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<ReleasePublicIpAddressRequest, Builder> {
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private String publicIpAddress; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(ReleasePublicIpAddressRequest response) {
            super(response);
            this.sourceRegionId = response.sourceRegionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.publicIpAddress = response.publicIpAddress;
            this.instanceId = response.instanceId;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * The ID of the resource master account, that is, the UID.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The public IP address of the instance.
         */
        public Builder publicIpAddress(String publicIpAddress) {
            this.putQueryParameter("PublicIpAddress", publicIpAddress);
            this.publicIpAddress = publicIpAddress;
            return this;
        }

        /**
         * The specified instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public ReleasePublicIpAddressRequest build() {
            return new ReleasePublicIpAddressRequest(this);
        } 

    } 

}
