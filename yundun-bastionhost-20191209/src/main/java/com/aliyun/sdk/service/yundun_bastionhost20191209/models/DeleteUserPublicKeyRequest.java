// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteUserPublicKeyRequest} extends {@link RequestModel}
 *
 * <p>DeleteUserPublicKeyRequest</p>
 */
public class DeleteUserPublicKeyRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("PublicKeyId")
    @Validation(required = true)
    private String publicKeyId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private DeleteUserPublicKeyRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.publicKeyId = builder.publicKeyId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUserPublicKeyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return publicKeyId
     */
    public String getPublicKeyId() {
        return this.publicKeyId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteUserPublicKeyRequest, Builder> {
        private String instanceId; 
        private String publicKeyId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteUserPublicKeyRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.publicKeyId = request.publicKeyId;
            this.regionId = request.regionId;
        } 

        /**
         * The region ID of the bastion host on which you want to delete the public key from the user.
         * <p>
         * 
         * > You can call the [DescribeInstances](~~153281~~) operation to query the ID of the bastion host.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the public key.
         */
        public Builder publicKeyId(String publicKeyId) {
            this.putQueryParameter("PublicKeyId", publicKeyId);
            this.publicKeyId = publicKeyId;
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
        public DeleteUserPublicKeyRequest build() {
            return new DeleteUserPublicKeyRequest(this);
        } 

    } 

}
