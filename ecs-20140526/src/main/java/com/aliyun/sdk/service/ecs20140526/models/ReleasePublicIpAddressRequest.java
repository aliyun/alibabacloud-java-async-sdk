// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("PublicIpAddress")
    @Validation(required = true)
    private String publicIpAddress;

    private ReleasePublicIpAddressRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.instanceId = builder.instanceId;
        this.publicIpAddress = builder.publicIpAddress;
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return publicIpAddress
     */
    public String getPublicIpAddress() {
        return this.publicIpAddress;
    }

    public static final class Builder extends Request.Builder<ReleasePublicIpAddressRequest, Builder> {
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private String instanceId; 
        private String publicIpAddress; 

        private Builder() {
            super();
        } 

        private Builder(ReleasePublicIpAddressRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.instanceId = request.instanceId;
            this.publicIpAddress = request.publicIpAddress;
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
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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

        @Override
        public ReleasePublicIpAddressRequest build() {
            return new ReleasePublicIpAddressRequest(this);
        } 

    } 

}
