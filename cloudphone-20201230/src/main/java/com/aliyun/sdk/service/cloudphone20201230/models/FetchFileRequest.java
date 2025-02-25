// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudphone20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FetchFileRequest} extends {@link RequestModel}
 *
 * <p>FetchFileRequest</p>
 */
public class FetchFileRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("OssBucket")
    @Validation(required = true)
    private String ossBucket;

    @Query
    @NameInMap("OssObject")
    @Validation(required = true)
    private String ossObject;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Path")
    @Validation(required = true)
    private String path;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private FetchFileRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.instanceId = builder.instanceId;
        this.ossBucket = builder.ossBucket;
        this.ossObject = builder.ossObject;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.path = builder.path;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FetchFileRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ossBucket
     */
    public String getOssBucket() {
        return this.ossBucket;
    }

    /**
     * @return ossObject
     */
    public String getOssObject() {
        return this.ossObject;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<FetchFileRequest, Builder> {
        private String sourceRegionId; 
        private String instanceId; 
        private String ossBucket; 
        private String ossObject; 
        private String ownerAccount; 
        private Long ownerId; 
        private String path; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(FetchFileRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.instanceId = request.instanceId;
            this.ossBucket = request.ossBucket;
            this.ossObject = request.ossObject;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.path = request.path;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
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
         * The ID of the instance on which you want to run the command. Valid values of N: 1 to 10.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The OSS bucket to which the file that you want to upload.
         * <p>
         * 
         * >  Before you import an APK file to the OSS bucket for the first time, add a Resource Access Management (RAM) policy. Otherwise, NoSetRoletoECSServiceAcount appears.
         */
        public Builder ossBucket(String ossBucket) {
            this.putQueryParameter("OssBucket", ossBucket);
            this.ossBucket = ossBucket;
            return this;
        }

        /**
         * The name that you want to save to OSS.
         */
        public Builder ossObject(String ossObject) {
            this.putQueryParameter("OssObject", ossObject);
            this.ossObject = ossObject;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The path in which you want to store the file in the cloud phone.
         */
        public Builder path(String path) {
            this.putQueryParameter("Path", path);
            this.path = path;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public FetchFileRequest build() {
            return new FetchFileRequest(this);
        } 

    } 

}
