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
 * {@link CreateNASFileSystemRequest} extends {@link RequestModel}
 *
 * <p>CreateNASFileSystemRequest</p>
 */
public class CreateNASFileSystemRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptType")
    private String encryptType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

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
         * <p>Description of the NAS file system.</p>
         * 
         * <strong>example:</strong>
         * <p>testDescription</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Whether the file system is encrypted. Uses KMS service-managed keys to encrypt the file system&quot;s on-disk data. No decryption is required when reading and writing encrypted data. Possible values and their meanings:</p>
         * <ul>
         * <li>0: Not encrypted.</li>
         * <li>1: Encrypted using NAS-managed keys.</li>
         * </ul>
         * <p>Default value: 0</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder encryptType(String encryptType) {
            this.putQueryParameter("EncryptType", encryptType);
            this.encryptType = encryptType;
            return this;
        }

        /**
         * <p>Name of the NAS file system.
         * The file name must follow these rules:</p>
         * <ul>
         * <li>Length: 2 to 128 English or Chinese characters.</li>
         * <li>Must start with an uppercase or lowercase letter or a Chinese character, cannot start with http:// or https://.</li>
         * <li>Can include numbers, underscores (_), or hyphens (-).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>testNAS</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>Workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-363353****</p>
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * <p>Region ID.</p>
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
         * <p>Storage specification type of the NAS file system. Allowed values:</p>
         * <ul>
         * <li>Capacity: Capacity type.</li>
         * <li>Performance: Performance type.</li>
         * </ul>
         * <p>Default value: Capacity</p>
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
        public CreateNASFileSystemRequest build() {
            return new CreateNASFileSystemRequest(this);
        } 

    } 

}
