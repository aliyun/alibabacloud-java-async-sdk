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
    @com.aliyun.core.annotation.NameInMap("ProtocolType")
    private String protocolType;

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
        this.protocolType = builder.protocolType;
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
     * @return protocolType
     */
    public String getProtocolType() {
        return this.protocolType;
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
        private String protocolType; 
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
            this.protocolType = request.protocolType;
            this.regionId = request.regionId;
            this.storageType = request.storageType;
        } 

        /**
         * <p>The description of the NAS file system.</p>
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
         * <p>Specifies whether to use a Key Management Service (KMS) managed key to encrypt data stored in the file system. Encrypted data does not need to be decrypted during read and write operations.</p>
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
         * <p>The name of the NAS file system. The name must meet the following requirements: The name must be 2 to 128 characters in length and can contain letters and Chinese characters. The name must start with a letter or a Chinese character and cannot start with <code>http://</code> or <code>https://</code>. The name can contain digits, underscores (_), or hyphens (-).</p>
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
         * <p>The office network ID.</p>
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
         * <p>The protocol type.</p>
         * 
         * <strong>example:</strong>
         * <p>ASP</p>
         */
        public Builder protocolType(String protocolType) {
            this.putQueryParameter("ProtocolType", protocolType);
            this.protocolType = protocolType;
            return this;
        }

        /**
         * <p>The region ID. You can call <a href="~~DescribeRegions~~">DescribeRegions</a> to query the list of regions supported by Elastic Desktop Service.</p>
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
         * <p>The storage type of the NAS file system.</p>
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
