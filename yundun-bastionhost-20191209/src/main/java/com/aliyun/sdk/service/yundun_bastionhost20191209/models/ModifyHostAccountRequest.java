// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyHostAccountRequest} extends {@link RequestModel}
 *
 * <p>ModifyHostAccountRequest</p>
 */
public class ModifyHostAccountRequest extends Request {
    @Query
    @NameInMap("HostAccountId")
    @Validation(required = true)
    private String hostAccountId;

    @Query
    @NameInMap("HostAccountName")
    private String hostAccountName;

    @Query
    @NameInMap("HostShareKeyId")
    private String hostShareKeyId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("PassPhrase")
    private String passPhrase;

    @Query
    @NameInMap("Password")
    private String password;

    @Query
    @NameInMap("PrivateKey")
    private String privateKey;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private ModifyHostAccountRequest(Builder builder) {
        super(builder);
        this.hostAccountId = builder.hostAccountId;
        this.hostAccountName = builder.hostAccountName;
        this.hostShareKeyId = builder.hostShareKeyId;
        this.instanceId = builder.instanceId;
        this.passPhrase = builder.passPhrase;
        this.password = builder.password;
        this.privateKey = builder.privateKey;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyHostAccountRequest create() {
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
     * @return hostAccountName
     */
    public String getHostAccountName() {
        return this.hostAccountName;
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
     * @return passPhrase
     */
    public String getPassPhrase() {
        return this.passPhrase;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return privateKey
     */
    public String getPrivateKey() {
        return this.privateKey;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyHostAccountRequest, Builder> {
        private String hostAccountId; 
        private String hostAccountName; 
        private String hostShareKeyId; 
        private String instanceId; 
        private String passPhrase; 
        private String password; 
        private String privateKey; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyHostAccountRequest request) {
            super(request);
            this.hostAccountId = request.hostAccountId;
            this.hostAccountName = request.hostAccountName;
            this.hostShareKeyId = request.hostShareKeyId;
            this.instanceId = request.instanceId;
            this.passPhrase = request.passPhrase;
            this.password = request.password;
            this.privateKey = request.privateKey;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the host account whose information you want to modify.
         * <p>
         * 
         * > : You can call the [ListHostAccounts](~~204372~~) operation to query the ID of the host account.
         */
        public Builder hostAccountId(String hostAccountId) {
            this.putQueryParameter("HostAccountId", hostAccountId);
            this.hostAccountId = hostAccountId;
            return this;
        }

        /**
         * The new name of the host account. The name can be up to 128 characters in length.
         */
        public Builder hostAccountName(String hostAccountName) {
            this.putQueryParameter("HostAccountName", hostAccountName);
            this.hostAccountName = hostAccountName;
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
         * The ID of the bastion host in which you want to modify the information about the host account.
         * <p>
         * 
         * > : You can call the [DescribeInstances](~~153281~~) operation to query the ID of the bastion host.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The passphrase of the new private key for the host account.
         * <p>
         * 
         * > : This parameter takes effect only when the protocol of the host is set to SSH. If the protocol of the host is set to RDP, this parameter is not required.
         */
        public Builder passPhrase(String passPhrase) {
            this.putQueryParameter("PassPhrase", passPhrase);
            this.passPhrase = passPhrase;
            return this;
        }

        /**
         * The new password of the host account.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * The new private key of the host account. The value is a Base64-encoded string.
         * <p>
         * 
         * > : This parameter takes effect only when the protocol of the host is set to SSH. If the protocol of the host is set to RDP, this parameter is not required. You can call the [GetHostAccount](~~204391~~) operation to query the protocol used by the host. You can configure a password and a private key for the host account at the same time. If both a password and a private key are configured for the host account, Bastionhost preferentially uses the private key for logon.
         */
        public Builder privateKey(String privateKey) {
            this.putQueryParameter("PrivateKey", privateKey);
            this.privateKey = privateKey;
            return this;
        }

        /**
         * The region ID of the bastion host in which you want to modify the information about the host account.
         * <p>
         * 
         * > : For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyHostAccountRequest build() {
            return new ModifyHostAccountRequest(this);
        } 

    } 

}
