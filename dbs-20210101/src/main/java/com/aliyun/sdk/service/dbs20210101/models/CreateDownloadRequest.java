// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20210101.models;

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
 * {@link CreateDownloadRequest} extends {@link RequestModel}
 *
 * <p>CreateDownloadRequest</p>
 */
public class CreateDownloadRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdminDatabase")
    private String adminDatabase;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BakSetId")
    private String bakSetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BakSetSize")
    private String bakSetSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BakSetType")
    private String bakSetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterName")
    private String clusterName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DownloadPointInTime")
    private String downloadPointInTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FormatType")
    private String formatType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsCluster")
    private String isCluster;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsPhysical")
    private Boolean isPhysical;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrimaryKeyTypeOnly")
    private String primaryKeyTypeOnly;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetBucket")
    private String targetBucket;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetOssRegion")
    private String targetOssRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetPath")
    private String targetPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    private String targetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseZstd")
    private String useZstd;

    private CreateDownloadRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.adminDatabase = builder.adminDatabase;
        this.bakSetId = builder.bakSetId;
        this.bakSetSize = builder.bakSetSize;
        this.bakSetType = builder.bakSetType;
        this.clusterName = builder.clusterName;
        this.downloadPointInTime = builder.downloadPointInTime;
        this.formatType = builder.formatType;
        this.instanceName = builder.instanceName;
        this.isCluster = builder.isCluster;
        this.isPhysical = builder.isPhysical;
        this.primaryKeyTypeOnly = builder.primaryKeyTypeOnly;
        this.regionCode = builder.regionCode;
        this.targetBucket = builder.targetBucket;
        this.targetOssRegion = builder.targetOssRegion;
        this.targetPath = builder.targetPath;
        this.targetType = builder.targetType;
        this.useZstd = builder.useZstd;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDownloadRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return adminDatabase
     */
    public String getAdminDatabase() {
        return this.adminDatabase;
    }

    /**
     * @return bakSetId
     */
    public String getBakSetId() {
        return this.bakSetId;
    }

    /**
     * @return bakSetSize
     */
    public String getBakSetSize() {
        return this.bakSetSize;
    }

    /**
     * @return bakSetType
     */
    public String getBakSetType() {
        return this.bakSetType;
    }

    /**
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * @return downloadPointInTime
     */
    public String getDownloadPointInTime() {
        return this.downloadPointInTime;
    }

    /**
     * @return formatType
     */
    public String getFormatType() {
        return this.formatType;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return isCluster
     */
    public String getIsCluster() {
        return this.isCluster;
    }

    /**
     * @return isPhysical
     */
    public Boolean getIsPhysical() {
        return this.isPhysical;
    }

    /**
     * @return primaryKeyTypeOnly
     */
    public String getPrimaryKeyTypeOnly() {
        return this.primaryKeyTypeOnly;
    }

    /**
     * @return regionCode
     */
    public String getRegionCode() {
        return this.regionCode;
    }

    /**
     * @return targetBucket
     */
    public String getTargetBucket() {
        return this.targetBucket;
    }

    /**
     * @return targetOssRegion
     */
    public String getTargetOssRegion() {
        return this.targetOssRegion;
    }

    /**
     * @return targetPath
     */
    public String getTargetPath() {
        return this.targetPath;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    /**
     * @return useZstd
     */
    public String getUseZstd() {
        return this.useZstd;
    }

    public static final class Builder extends Request.Builder<CreateDownloadRequest, Builder> {
        private String regionId; 
        private String adminDatabase; 
        private String bakSetId; 
        private String bakSetSize; 
        private String bakSetType; 
        private String clusterName; 
        private String downloadPointInTime; 
        private String formatType; 
        private String instanceName; 
        private String isCluster; 
        private Boolean isPhysical; 
        private String primaryKeyTypeOnly; 
        private String regionCode; 
        private String targetBucket; 
        private String targetOssRegion; 
        private String targetPath; 
        private String targetType; 
        private String useZstd; 

        private Builder() {
            super();
        } 

        private Builder(CreateDownloadRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.adminDatabase = request.adminDatabase;
            this.bakSetId = request.bakSetId;
            this.bakSetSize = request.bakSetSize;
            this.bakSetType = request.bakSetType;
            this.clusterName = request.clusterName;
            this.downloadPointInTime = request.downloadPointInTime;
            this.formatType = request.formatType;
            this.instanceName = request.instanceName;
            this.isCluster = request.isCluster;
            this.isPhysical = request.isPhysical;
            this.primaryKeyTypeOnly = request.primaryKeyTypeOnly;
            this.regionCode = request.regionCode;
            this.targetBucket = request.targetBucket;
            this.targetOssRegion = request.targetOssRegion;
            this.targetPath = request.targetPath;
            this.targetType = request.targetType;
            this.useZstd = request.useZstd;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AdminDatabase.
         */
        public Builder adminDatabase(String adminDatabase) {
            this.putQueryParameter("AdminDatabase", adminDatabase);
            this.adminDatabase = adminDatabase;
            return this;
        }

        /**
         * <p>The ID of the backup set. You can call the <a href="https://help.aliyun.com/document_detail/26273.html">DescribeBackups</a> operation to query the ID of the backup set.</p>
         * <blockquote>
         * <p>This parameter is required if the BakSetType parameter is set to full.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>146005****</p>
         */
        public Builder bakSetId(String bakSetId) {
            this.putQueryParameter("BakSetId", bakSetId);
            this.bakSetId = bakSetId;
            return this;
        }

        /**
         * <p>The size of the full backup set. Unit: bytes. You can call the <a href="https://help.aliyun.com/document_detail/26273.html">DescribeBackups</a> operation to query the size of the full backup set.</p>
         * 
         * <strong>example:</strong>
         * <p>216****</p>
         */
        public Builder bakSetSize(String bakSetSize) {
            this.putQueryParameter("BakSetSize", bakSetSize);
            this.bakSetSize = bakSetSize;
            return this;
        }

        /**
         * <p>The type of the download task. Valid values:</p>
         * <ul>
         * <li><strong>full</strong>: downloads a full backup set.</li>
         * <li><strong>pitr</strong>: downloads a backup set at a specific point in time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>full</p>
         */
        public Builder bakSetType(String bakSetType) {
            this.putQueryParameter("BakSetType", bakSetType);
            this.bakSetType = bakSetType;
            return this;
        }

        /**
         * ClusterName.
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * <p>The point in time at which the backup set is downloaded. Specify a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * <blockquote>
         * <p>This parameter is required if the BakSetType parameter is set to pitr.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1661331864000</p>
         */
        public Builder downloadPointInTime(String downloadPointInTime) {
            this.putQueryParameter("DownloadPointInTime", downloadPointInTime);
            this.downloadPointInTime = downloadPointInTime;
            return this;
        }

        /**
         * <p>The format to which the downloaded backup set is converted. Valid values:</p>
         * <ul>
         * <li><strong>CSV</strong></li>
         * <li><strong>SQL</strong></li>
         * <li><strong>Parquet</strong></li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>CSV</p>
         */
        public Builder formatType(String formatType) {
            this.putQueryParameter("FormatType", formatType);
            this.formatType = formatType;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-wz994c1t1****</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * IsCluster.
         */
        public Builder isCluster(String isCluster) {
            this.putQueryParameter("IsCluster", isCluster);
            this.isCluster = isCluster;
            return this;
        }

        /**
         * IsPhysical.
         */
        public Builder isPhysical(Boolean isPhysical) {
            this.putQueryParameter("IsPhysical", isPhysical);
            this.isPhysical = isPhysical;
            return this;
        }

        /**
         * PrimaryKeyTypeOnly.
         */
        public Builder primaryKeyTypeOnly(String primaryKeyTypeOnly) {
            this.putQueryParameter("PrimaryKeyTypeOnly", primaryKeyTypeOnly);
            this.primaryKeyTypeOnly = primaryKeyTypeOnly;
            return this;
        }

        /**
         * <p>The ID of the region in which the instance resides. You can call the <a href="https://help.aliyun.com/document_detail/26231.html">DescribeDBInstanceAttribute</a> operation to query the region ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionCode(String regionCode) {
            this.putQueryParameter("RegionCode", regionCode);
            this.regionCode = regionCode;
            return this;
        }

        /**
         * <p>The name of the OSS bucket that is used to store the backup set.</p>
         * <ul>
         * <li>This parameter is required if the TargetType parameter is set to OSS.</li>
         * <li>Make sure that your account is granted the <strong>AliyunDBSDefaultRole</strong> permission. For more information, see <a href="https://help.aliyun.com/document_detail/26307.html">Use RAM for resource authorization</a>. You can also grant permissions based on the operation instructions in the Resource Access Management (RAM) console.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test123</p>
         */
        public Builder targetBucket(String targetBucket) {
            this.putQueryParameter("TargetBucket", targetBucket);
            this.targetBucket = targetBucket;
            return this;
        }

        /**
         * <p>The region in which the OSS bucket resides.</p>
         * <blockquote>
         * <p>This parameter is required if the TargetType parameter is set to OSS.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder targetOssRegion(String targetOssRegion) {
            this.putQueryParameter("TargetOssRegion", targetOssRegion);
            this.targetOssRegion = targetOssRegion;
            return this;
        }

        /**
         * <p>The destination path to which the backup set is downloaded.</p>
         * <blockquote>
         * <p>This parameter is required if the TargetType parameter is set to OSS.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test_db/path</p>
         */
        public Builder targetPath(String targetPath) {
            this.putQueryParameter("TargetPath", targetPath);
            this.targetPath = targetPath;
            return this;
        }

        /**
         * <p>The type of the destination to which the backup set is downloaded. Valid values:</p>
         * <ul>
         * <li><strong>OSS</strong></li>
         * <li><strong>URL</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        /**
         * UseZstd.
         */
        public Builder useZstd(String useZstd) {
            this.putQueryParameter("UseZstd", useZstd);
            this.useZstd = useZstd;
            return this;
        }

        @Override
        public CreateDownloadRequest build() {
            return new CreateDownloadRequest(this);
        } 

    } 

}
