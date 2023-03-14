// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHostAccountRequest} extends {@link RequestModel}
 *
 * <p>CreateHostAccountRequest</p>
 */
public class CreateHostAccountRequest extends Request {
    @Query
    @NameInMap("HostAccountName")
    @Validation(required = true)
    private String hostAccountName;

    @Query
    @NameInMap("HostId")
    @Validation(required = true)
    private String hostId;

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
    @NameInMap("ProtocolName")
    @Validation(required = true)
    private String protocolName;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private CreateHostAccountRequest(Builder builder) {
        super(builder);
        this.hostAccountName = builder.hostAccountName;
        this.hostId = builder.hostId;
        this.hostShareKeyId = builder.hostShareKeyId;
        this.instanceId = builder.instanceId;
        this.passPhrase = builder.passPhrase;
        this.password = builder.password;
        this.privateKey = builder.privateKey;
        this.protocolName = builder.protocolName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHostAccountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hostAccountName
     */
    public String getHostAccountName() {
        return this.hostAccountName;
    }

    /**
     * @return hostId
     */
    public String getHostId() {
        return this.hostId;
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
     * @return protocolName
     */
    public String getProtocolName() {
        return this.protocolName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateHostAccountRequest, Builder> {
        private String hostAccountName; 
        private String hostId; 
        private String hostShareKeyId; 
        private String instanceId; 
        private String passPhrase; 
        private String password; 
        private String privateKey; 
        private String protocolName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateHostAccountRequest request) {
            super(request);
            this.hostAccountName = request.hostAccountName;
            this.hostId = request.hostId;
            this.hostShareKeyId = request.hostShareKeyId;
            this.instanceId = request.instanceId;
            this.passPhrase = request.passPhrase;
            this.password = request.password;
            this.privateKey = request.privateKey;
            this.protocolName = request.protocolName;
            this.regionId = request.regionId;
        } 

        /**
         * The name of the host account that you want to add. The name can be up to 128 characters in length.
         */
        public Builder hostAccountName(String hostAccountName) {
            this.putQueryParameter("HostAccountName", hostAccountName);
            this.hostAccountName = hostAccountName;
            return this;
        }

        /**
         * The ID of the host to which you want to add a host account.
         * <p>
         * 
         * >  You can call the [ListHosts](~~200665~~) operation to query the ID of the host.
         */
        public Builder hostId(String hostId) {
            this.putQueryParameter("HostId", hostId);
            this.hostId = hostId;
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
         * The ID of the bastion host in which you want to add a host account to the host.
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
         * The passphrase of the private key for the host account.
         * <p>
         * 
         * >  You can specify this parameter when the ProtocolName parameter is set to SSH. If the ProtocolName parameter is set to RDP, you do not need to specify this parameter.
         */
        public Builder passPhrase(String passPhrase) {
            this.putQueryParameter("PassPhrase", passPhrase);
            this.passPhrase = passPhrase;
            return this;
        }

        /**
         * The password of the host account.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * The private key of the host account. The value is a Base64-encoded string.
         * <p>
         * 
         * >  This parameter takes effect only when the ProtocolName parameter is set to SSH. If the ProtocolName parameter is set to RDP, you do not need to specify this parameter. You can configure a password and a private key for the host account at the same time. If both a password and a private key are configured for the host account, Bastionhost preferentially uses the private key to log on to the host.
         */
        public Builder privateKey(String privateKey) {
            this.putQueryParameter("PrivateKey", privateKey);
            this.privateKey = privateKey;
            return this;
        }

        /**
         * The protocol of the host to which you want to add a host account.
         * <p>
         * 
         * Valid values:
         * 
         * *   SSH
         * *   RDP
         */
        public Builder protocolName(String protocolName) {
            this.putQueryParameter("ProtocolName", protocolName);
            this.protocolName = protocolName;
            return this;
        }

        /**
         * The region ID of the bastion host in which you want to add a host account to the host.
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
        public CreateHostAccountRequest build() {
            return new CreateHostAccountRequest(this);
        } 

    } 

}
