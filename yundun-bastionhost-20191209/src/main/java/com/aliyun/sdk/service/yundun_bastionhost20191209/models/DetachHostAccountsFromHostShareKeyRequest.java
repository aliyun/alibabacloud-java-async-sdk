// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachHostAccountsFromHostShareKeyRequest} extends {@link RequestModel}
 *
 * <p>DetachHostAccountsFromHostShareKeyRequest</p>
 */
public class DetachHostAccountsFromHostShareKeyRequest extends Request {
    @Query
    @NameInMap("HostAccountIds")
    @Validation(required = true)
    private String hostAccountIds;

    @Query
    @NameInMap("HostShareKeyId")
    @Validation(required = true)
    private String hostShareKeyId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private DetachHostAccountsFromHostShareKeyRequest(Builder builder) {
        super(builder);
        this.hostAccountIds = builder.hostAccountIds;
        this.hostShareKeyId = builder.hostShareKeyId;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachHostAccountsFromHostShareKeyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hostAccountIds
     */
    public String getHostAccountIds() {
        return this.hostAccountIds;
    }

    /**
     * @return hostShareKeyId
     */
    public String getHostShareKeyId() {
        return this.hostShareKeyId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DetachHostAccountsFromHostShareKeyRequest, Builder> {
        private String hostAccountIds; 
        private String hostShareKeyId; 
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DetachHostAccountsFromHostShareKeyRequest request) {
            super(request);
            this.hostAccountIds = request.hostAccountIds;
            this.hostShareKeyId = request.hostShareKeyId;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
        } 

        /**
         * The IDs of the host accounts.
         */
        public Builder hostAccountIds(String hostAccountIds) {
            this.putQueryParameter("HostAccountIds", hostAccountIds);
            this.hostAccountIds = hostAccountIds;
            return this;
        }

        /**
         * The ID of the shared key.
         */
        public Builder hostShareKeyId(String hostShareKeyId) {
            this.putQueryParameter("HostShareKeyId", hostShareKeyId);
            this.hostShareKeyId = hostShareKeyId;
            return this;
        }

        /**
         * The ID of the bastion host. You can call the [DescribeInstances](~~153281~~) operation to query the ID of the bastion host.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The region ID of the bastion host. For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DetachHostAccountsFromHostShareKeyRequest build() {
            return new DetachHostAccountsFromHostShareKeyRequest(this);
        } 

    } 

}
