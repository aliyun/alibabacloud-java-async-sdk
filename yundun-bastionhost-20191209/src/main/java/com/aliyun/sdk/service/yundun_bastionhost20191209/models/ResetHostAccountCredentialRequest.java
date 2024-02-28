// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetHostAccountCredentialRequest} extends {@link RequestModel}
 *
 * <p>ResetHostAccountCredentialRequest</p>
 */
public class ResetHostAccountCredentialRequest extends Request {
    @Query
    @NameInMap("CredentialType")
    @Validation(required = true)
    private String credentialType;

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

    private ResetHostAccountCredentialRequest(Builder builder) {
        super(builder);
        this.credentialType = builder.credentialType;
        this.hostAccountId = builder.hostAccountId;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetHostAccountCredentialRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return credentialType
     */
    public String getCredentialType() {
        return this.credentialType;
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

    public static final class Builder extends Request.Builder<ResetHostAccountCredentialRequest, Builder> {
        private String credentialType; 
        private String hostAccountId; 
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ResetHostAccountCredentialRequest request) {
            super(request);
            this.credentialType = request.credentialType;
            this.hostAccountId = request.hostAccountId;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
        } 

        /**
         * The type of the logon credential that you want to delete. Valid values:
         * <p>
         * 
         * *   **Password**
         * *   **PrivateKey**
         */
        public Builder credentialType(String credentialType) {
            this.putQueryParameter("CredentialType", credentialType);
            this.credentialType = credentialType;
            return this;
        }

        /**
         * The ID of the host account for which the logon credential is to be deleted.
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
         * The ID of the bastion host from which you want to delete the logon credential for the host account.
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
         * The region ID of the bastion host from which you want to delete the logon credential for the host account.
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
        public ResetHostAccountCredentialRequest build() {
            return new ResetHostAccountCredentialRequest(this);
        } 

    } 

}
