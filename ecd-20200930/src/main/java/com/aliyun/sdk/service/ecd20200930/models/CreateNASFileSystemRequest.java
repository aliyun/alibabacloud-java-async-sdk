// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNASFileSystemRequest} extends {@link RequestModel}
 *
 * <p>CreateNASFileSystemRequest</p>
 */
public class CreateNASFileSystemRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("EncryptType")
    private String encryptType;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("OfficeSiteId")
    @Validation(required = true)
    private String officeSiteId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("StorageType")
    private String storageType;

    private CreateNASFileSystemRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.encryptType = builder.encryptType;
        this.name = builder.name;
        this.officeSiteId = builder.officeSiteId;
        this.regionId = builder.regionId;
        this.storageType = builder.storageType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNASFileSystemRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return encryptType
     */
    public String getEncryptType() {
        return this.encryptType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    public static final class Builder extends Request.Builder<CreateNASFileSystemRequest, Builder> {
        private String description; 
        private String encryptType; 
        private String name; 
        private String officeSiteId; 
        private String regionId; 
        private String storageType; 

        private Builder() {
            super();
        } 

        private Builder(CreateNASFileSystemRequest request) {
            super(request);
            this.description = request.description;
            this.encryptType = request.encryptType;
            this.name = request.name;
            this.officeSiteId = request.officeSiteId;
            this.regionId = request.regionId;
            this.storageType = request.storageType;
        } 

        /**
         * The description of the NAS file system.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Specifies whether to encrypt the data in the NAS file system. You can use keys that are managed by Key Management Service (KMS) to encrypt the data that is stored in a NAS file system. When you read and write the encrypted data, the data is automatically decrypted. Valid values:
         * <p>
         * 
         * *   0: does not encrypt the data in the NAS file system.
         * *   1: encrypts the data in the NAS file system by using NAS-managed keys.
         * 
         * Default value: 0.
         */
        public Builder encryptType(String encryptType) {
            this.putQueryParameter("EncryptType", encryptType);
            this.encryptType = encryptType;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The ID of the workspace.
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The storage type of the NAS file system. Valid values:
         * <p>
         * 
         * *   Capacity
         * *   Performance
         * 
         * Default value: Capacity.
         */
        public Builder storageType(String storageType) {
            this.putQueryParameter("StorageType", storageType);
            this.storageType = storageType;
            return this;
        }

        @Override
        public CreateNASFileSystemRequest build() {
            return new CreateNASFileSystemRequest(this);
        } 

    } 

}
