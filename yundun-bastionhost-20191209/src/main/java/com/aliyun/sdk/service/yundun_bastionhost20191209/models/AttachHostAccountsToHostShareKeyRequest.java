// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachHostAccountsToHostShareKeyRequest} extends {@link RequestModel}
 *
 * <p>AttachHostAccountsToHostShareKeyRequest</p>
 */
public class AttachHostAccountsToHostShareKeyRequest extends Request {
    @Query
    @NameInMap("HostAccountIds")
    private String hostAccountIds;

    @Query
    @NameInMap("HostShareKeyId")
    private String hostShareKeyId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private AttachHostAccountsToHostShareKeyRequest(Builder builder) {
        super(builder);
        this.hostAccountIds = builder.hostAccountIds;
        this.hostShareKeyId = builder.hostShareKeyId;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachHostAccountsToHostShareKeyRequest create() {
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

    public static final class Builder extends Request.Builder<AttachHostAccountsToHostShareKeyRequest, Builder> {
        private String hostAccountIds; 
        private String hostShareKeyId; 
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AttachHostAccountsToHostShareKeyRequest request) {
            super(request);
            this.hostAccountIds = request.hostAccountIds;
            this.hostShareKeyId = request.hostShareKeyId;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
        } 

        /**
         * HostAccountIds.
         */
        public Builder hostAccountIds(String hostAccountIds) {
            this.putQueryParameter("HostAccountIds", hostAccountIds);
            this.hostAccountIds = hostAccountIds;
            return this;
        }

        /**
         * HostShareKeyId.
         */
        public Builder hostShareKeyId(String hostShareKeyId) {
            this.putQueryParameter("HostShareKeyId", hostShareKeyId);
            this.hostShareKeyId = hostShareKeyId;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public AttachHostAccountsToHostShareKeyRequest build() {
            return new AttachHostAccountsToHostShareKeyRequest(this);
        } 

    } 

}
