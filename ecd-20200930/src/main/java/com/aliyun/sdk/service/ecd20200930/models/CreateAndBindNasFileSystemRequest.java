// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAndBindNasFileSystemRequest} extends {@link RequestModel}
 *
 * <p>CreateAndBindNasFileSystemRequest</p>
 */
public class CreateAndBindNasFileSystemRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("DesktopGroupId")
    @Validation(required = true)
    private String desktopGroupId;

    @Query
    @NameInMap("EncryptType")
    private Integer encryptType;

    @Query
    @NameInMap("EndUserIds")
    private java.util.List < String > endUserIds;

    @Query
    @NameInMap("FileSystemName")
    @Validation(required = true)
    private String fileSystemName;

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
    @Validation(required = true)
    private String storageType;

    private CreateAndBindNasFileSystemRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.desktopGroupId = builder.desktopGroupId;
        this.encryptType = builder.encryptType;
        this.endUserIds = builder.endUserIds;
        this.fileSystemName = builder.fileSystemName;
        this.officeSiteId = builder.officeSiteId;
        this.regionId = builder.regionId;
        this.storageType = builder.storageType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAndBindNasFileSystemRequest create() {
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
     * @return desktopGroupId
     */
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    /**
     * @return encryptType
     */
    public Integer getEncryptType() {
        return this.encryptType;
    }

    /**
     * @return endUserIds
     */
    public java.util.List < String > getEndUserIds() {
        return this.endUserIds;
    }

    /**
     * @return fileSystemName
     */
    public String getFileSystemName() {
        return this.fileSystemName;
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

    public static final class Builder extends Request.Builder<CreateAndBindNasFileSystemRequest, Builder> {
        private String description; 
        private String desktopGroupId; 
        private Integer encryptType; 
        private java.util.List < String > endUserIds; 
        private String fileSystemName; 
        private String officeSiteId; 
        private String regionId; 
        private String storageType; 

        private Builder() {
            super();
        } 

        private Builder(CreateAndBindNasFileSystemRequest request) {
            super(request);
            this.description = request.description;
            this.desktopGroupId = request.desktopGroupId;
            this.encryptType = request.encryptType;
            this.endUserIds = request.endUserIds;
            this.fileSystemName = request.fileSystemName;
            this.officeSiteId = request.officeSiteId;
            this.regionId = request.regionId;
            this.storageType = request.storageType;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DesktopGroupId.
         */
        public Builder desktopGroupId(String desktopGroupId) {
            this.putQueryParameter("DesktopGroupId", desktopGroupId);
            this.desktopGroupId = desktopGroupId;
            return this;
        }

        /**
         * EncryptType.
         */
        public Builder encryptType(Integer encryptType) {
            this.putQueryParameter("EncryptType", encryptType);
            this.encryptType = encryptType;
            return this;
        }

        /**
         * EndUserIds.
         */
        public Builder endUserIds(java.util.List < String > endUserIds) {
            this.putQueryParameter("EndUserIds", endUserIds);
            this.endUserIds = endUserIds;
            return this;
        }

        /**
         * FileSystemName.
         */
        public Builder fileSystemName(String fileSystemName) {
            this.putQueryParameter("FileSystemName", fileSystemName);
            this.fileSystemName = fileSystemName;
            return this;
        }

        /**
         * OfficeSiteId.
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
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

        /**
         * StorageType.
         */
        public Builder storageType(String storageType) {
            this.putQueryParameter("StorageType", storageType);
            this.storageType = storageType;
            return this;
        }

        @Override
        public CreateAndBindNasFileSystemRequest build() {
            return new CreateAndBindNasFileSystemRequest(this);
        } 

    } 

}
