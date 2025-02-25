// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link ExportImageRequest} extends {@link RequestModel}
 *
 * <p>ExportImageRequest</p>
 */
public class ExportImageRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageFormat")
    private String imageFormat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OSSBucket")
    @com.aliyun.core.annotation.Validation(required = true)
    private String OSSBucket;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OSSPrefix")
    private String OSSPrefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleName")
    private String roleName;

    private ExportImageRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.imageFormat = builder.imageFormat;
        this.imageId = builder.imageId;
        this.OSSBucket = builder.OSSBucket;
        this.OSSPrefix = builder.OSSPrefix;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.roleName = builder.roleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportImageRequest create() {
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
     * @return imageFormat
     */
    public String getImageFormat() {
        return this.imageFormat;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return OSSBucket
     */
    public String getOSSBucket() {
        return this.OSSBucket;
    }

    /**
     * @return OSSPrefix
     */
    public String getOSSPrefix() {
        return this.OSSPrefix;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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

    /**
     * @return roleName
     */
    public String getRoleName() {
        return this.roleName;
    }

    public static final class Builder extends Request.Builder<ExportImageRequest, Builder> {
        private String sourceRegionId; 
        private String imageFormat; 
        private String imageId; 
        private String OSSBucket; 
        private String OSSPrefix; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String roleName; 

        private Builder() {
            super();
        } 

        private Builder(ExportImageRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.imageFormat = request.imageFormat;
            this.imageId = request.imageId;
            this.OSSBucket = request.OSSBucket;
            this.OSSPrefix = request.OSSPrefix;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.roleName = request.roleName;
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
         * <p>The format in which you want to export the custom image. Valid values:</p>
         * <ul>
         * <li>raw</li>
         * <li>vhd</li>
         * <li>qcow2</li>
         * <li>vmdk</li>
         * <li>vdi</li>
         * </ul>
         * <p>Default value: raw.</p>
         * 
         * <strong>example:</strong>
         * <p>raw</p>
         */
        public Builder imageFormat(String imageFormat) {
            this.putQueryParameter("ImageFormat", imageFormat);
            this.imageFormat = imageFormat;
            return this;
        }

        /**
         * <p>The custom image ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>m-bp67acfmxazb4p****</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The OSS bucket in which you want to store the exported custom image.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testexportImage</p>
         */
        public Builder OSSBucket(String OSSBucket) {
            this.putQueryParameter("OSSBucket", OSSBucket);
            this.OSSBucket = OSSBucket;
            return this;
        }

        /**
         * <p>The prefix for the name of the OSS object. The prefix must be 1 to 30 characters in length and can contain digits and letters.</p>
         * 
         * <strong>example:</strong>
         * <p>EcsExport</p>
         */
        public Builder OSSPrefix(String OSSPrefix) {
            this.putQueryParameter("OSSPrefix", OSSPrefix);
            this.OSSPrefix = OSSPrefix;
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
         * <p>The region ID of the custom image. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
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

        /**
         * <p>The name of the RAM role that you want to use to export the custom image.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunECSImageExportDefaultRole</p>
         */
        public Builder roleName(String roleName) {
            this.putQueryParameter("RoleName", roleName);
            this.roleName = roleName;
            return this;
        }

        @Override
        public ExportImageRequest build() {
            return new ExportImageRequest(this);
        } 

    } 

}
