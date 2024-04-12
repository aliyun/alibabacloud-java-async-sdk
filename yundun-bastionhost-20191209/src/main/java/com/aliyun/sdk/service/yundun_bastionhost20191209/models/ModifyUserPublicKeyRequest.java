// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyUserPublicKeyRequest} extends {@link RequestModel}
 *
 * <p>ModifyUserPublicKeyRequest</p>
 */
public class ModifyUserPublicKeyRequest extends Request {
    @Query
    @NameInMap("Comment")
    private String comment;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("PublicKey")
    private String publicKey;

    @Query
    @NameInMap("PublicKeyId")
    @Validation(required = true)
    private String publicKeyId;

    @Query
    @NameInMap("PublicKeyName")
    private String publicKeyName;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private ModifyUserPublicKeyRequest(Builder builder) {
        super(builder);
        this.comment = builder.comment;
        this.instanceId = builder.instanceId;
        this.publicKey = builder.publicKey;
        this.publicKeyId = builder.publicKeyId;
        this.publicKeyName = builder.publicKeyName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyUserPublicKeyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return publicKey
     */
    public String getPublicKey() {
        return this.publicKey;
    }

    /**
     * @return publicKeyId
     */
    public String getPublicKeyId() {
        return this.publicKeyId;
    }

    /**
     * @return publicKeyName
     */
    public String getPublicKeyName() {
        return this.publicKeyName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyUserPublicKeyRequest, Builder> {
        private String comment; 
        private String instanceId; 
        private String publicKey; 
        private String publicKeyId; 
        private String publicKeyName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyUserPublicKeyRequest request) {
            super(request);
            this.comment = request.comment;
            this.instanceId = request.instanceId;
            this.publicKey = request.publicKey;
            this.publicKeyId = request.publicKeyId;
            this.publicKeyName = request.publicKeyName;
            this.regionId = request.regionId;
        } 

        /**
         * The new description of the user group. The description can be up to 500 characters in length.
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * The ID of the bastion host that is used to modify the public key of the user.
         * <p>
         * 
         * > You can call the [describeinstances](~~153281~~) operation to query the ID of the bastion host.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The new public key.
         * <p>
         * 
         * > The public key must be encoded in Base64.
         */
        public Builder publicKey(String publicKey) {
            this.putQueryParameter("PublicKey", publicKey);
            this.publicKey = publicKey;
            return this;
        }

        /**
         * The ID of the public key that you want to modify.
         */
        public Builder publicKeyId(String publicKeyId) {
            this.putQueryParameter("PublicKeyId", publicKeyId);
            this.publicKeyId = publicKeyId;
            return this;
        }

        /**
         * The name of the public key that you want to modify. This name can be up to 128 characters in length.
         */
        public Builder publicKeyName(String publicKeyName) {
            this.putQueryParameter("PublicKeyName", publicKeyName);
            this.publicKeyName = publicKeyName;
            return this;
        }

        /**
         * The region ID of the bastion host that is used to modify the public key of the user.
         * <p>
         * 
         * > For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyUserPublicKeyRequest build() {
            return new ModifyUserPublicKeyRequest(this);
        } 

    } 

}
