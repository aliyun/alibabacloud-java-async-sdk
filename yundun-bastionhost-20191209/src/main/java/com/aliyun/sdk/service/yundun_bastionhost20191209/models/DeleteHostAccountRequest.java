// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteHostAccountRequest} extends {@link RequestModel}
 *
 * <p>DeleteHostAccountRequest</p>
 */
public class DeleteHostAccountRequest extends Request {
    @Query
    @NameInMap("HostAccountId")
    @Validation(required = true)
    private String hostAccountId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private DeleteHostAccountRequest(Builder builder) {
        super(builder);
        this.hostAccountId = builder.hostAccountId;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteHostAccountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hostAccountId
     */
    public String getHostAccountId() {
        return this.hostAccountId;
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

    public static final class Builder extends Request.Builder<DeleteHostAccountRequest, Builder> {
        private String hostAccountId; 
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteHostAccountRequest request) {
            super(request);
            this.hostAccountId = request.hostAccountId;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the host account that you want to remove.
         * <p>
         * 
         * >  You can call the [ListHostAccounts](~~204372~~) operation to query the ID of the host account.
         */
        public Builder hostAccountId(String hostAccountId) {
            this.putQueryParameter("HostAccountId", hostAccountId);
            this.hostAccountId = hostAccountId;
            return this;
        }

        /**
         * The ID of the bastion host from which you want to remove the host account.
         * <p>
         * 
         * >  You can call the [DescribeInstances](~~153281~~) operation to query the ID of the bastion host.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The region ID of the bastion host from which you want to remove the host account.
         * <p>
         * 
         * >  For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteHostAccountRequest build() {
            return new DeleteHostAccountRequest(this);
        } 

    } 

}
