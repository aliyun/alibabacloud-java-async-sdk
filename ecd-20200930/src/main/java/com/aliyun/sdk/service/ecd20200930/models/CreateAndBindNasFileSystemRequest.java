// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateAndBindNasFileSystemRequest} extends {@link RequestModel}
 *
 * <p>CreateAndBindNasFileSystemRequest</p>
 */
public class CreateAndBindNasFileSystemRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String desktopGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptType")
    private Integer encryptType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserIds")
    private java.util.List<String> endUserIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String officeSiteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageType")
    @com.aliyun.core.annotation.Validation(required = true)
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
    public java.util.List<String> getEndUserIds() {
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
        private java.util.List<String> endUserIds; 
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
         * <p>The description of the NAS file system.</p>
         * 
         * <strong>example:</strong>
         * <p>newDescription</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the shared cloud computer.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dg-fh0vdzyh6rdc*****</p>
         */
        public Builder desktopGroupId(String desktopGroupId) {
            this.putQueryParameter("DesktopGroupId", desktopGroupId);
            this.desktopGroupId = desktopGroupId;
            return this;
        }

        /**
         * <p>Specifies whether the file system uses a KMS-managed key to encrypt data at rest. Encrypted data does not need to be decrypted during read and write operations.</p>
         * <blockquote>
         * <p>NAS-managed keys are supported when <code>FileSystemType</code> is set to <code>standard</code> or <code>extreme</code>. User-managed keys are supported when <code>FileSystemType</code> is set to <code>extreme</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder encryptType(Integer encryptType) {
            this.putQueryParameter("EncryptType", encryptType);
            this.encryptType = encryptType;
            return this;
        }

        /**
         * <p>The list of user IDs.</p>
         */
        public Builder endUserIds(java.util.List<String> endUserIds) {
            this.putQueryParameter("EndUserIds", endUserIds);
            this.endUserIds = endUserIds;
            return this;
        }

        /**
         * <p>The name of the NAS file system.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>szy-asp-upm-test</p>
         */
        public Builder fileSystemName(String fileSystemName) {
            this.putQueryParameter("FileSystemName", fileSystemName);
            this.fileSystemName = fileSystemName;
            return this;
        }

        /**
         * <p>The ID of the office network.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing+dir-15657*****</p>
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * <p>The region ID. You can call <a href="~~DescribeRegions~~">DescribeRegions</a> to query the regions supported by Elastic Desktop Service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The storage specification type of the NAS file system.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Capacity</p>
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
