// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyHostShareKeyRequest} extends {@link RequestModel}
 *
 * <p>ModifyHostShareKeyRequest</p>
 */
public class ModifyHostShareKeyRequest extends Request {
    @Query
    @NameInMap("HostShareKeyId")
    @Validation(required = true)
    private String hostShareKeyId;

    @Query
    @NameInMap("HostShareKeyName")
    private String hostShareKeyName;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("PassPhrase")
    private String passPhrase;

    @Query
    @NameInMap("PrivateKey")
    private String privateKey;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private ModifyHostShareKeyRequest(Builder builder) {
        super(builder);
        this.hostShareKeyId = builder.hostShareKeyId;
        this.hostShareKeyName = builder.hostShareKeyName;
        this.instanceId = builder.instanceId;
        this.passPhrase = builder.passPhrase;
        this.privateKey = builder.privateKey;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyHostShareKeyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hostShareKeyId
     */
    public String getHostShareKeyId() {
        return this.hostShareKeyId;
    }

    /**
     * @return hostShareKeyName
     */
    public String getHostShareKeyName() {
        return this.hostShareKeyName;
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

    public static final class Builder extends Request.Builder<ModifyHostShareKeyRequest, Builder> {
        private String hostShareKeyId; 
        private String hostShareKeyName; 
        private String instanceId; 
        private String passPhrase; 
        private String privateKey; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyHostShareKeyRequest request) {
            super(request);
            this.hostShareKeyId = request.hostShareKeyId;
            this.hostShareKeyName = request.hostShareKeyName;
            this.instanceId = request.instanceId;
            this.passPhrase = request.passPhrase;
            this.privateKey = request.privateKey;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the shared key whose information you want to modify.
         */
        public Builder hostShareKeyId(String hostShareKeyId) {
            this.putQueryParameter("HostShareKeyId", hostShareKeyId);
            this.hostShareKeyId = hostShareKeyId;
            return this;
        }

        /**
         * The name of the shared key.
         */
        public Builder hostShareKeyName(String hostShareKeyName) {
            this.putQueryParameter("HostShareKeyName", hostShareKeyName);
            this.hostShareKeyName = hostShareKeyName;
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
         * The passphrase of the private key. The value is a Base64-encoded string.
         */
        public Builder passPhrase(String passPhrase) {
            this.putQueryParameter("PassPhrase", passPhrase);
            this.passPhrase = passPhrase;
            return this;
        }

        /**
         * The private key. The value is a Base64-encoded string.
         */
        public Builder privateKey(String privateKey) {
            this.putQueryParameter("PrivateKey", privateKey);
            this.privateKey = privateKey;
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
        public ModifyHostShareKeyRequest build() {
            return new ModifyHostShareKeyRequest(this);
        } 

    } 

}
