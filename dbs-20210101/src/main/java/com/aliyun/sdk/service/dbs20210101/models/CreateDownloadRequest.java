// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDownloadRequest} extends {@link RequestModel}
 *
 * <p>CreateDownloadRequest</p>
 */
public class CreateDownloadRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("BakSetId")
    private String bakSetId;

    @Query
    @NameInMap("BakSetSize")
    private String bakSetSize;

    @Query
    @NameInMap("BakSetType")
    private String bakSetType;

    @Query
    @NameInMap("DownloadPointInTime")
    private String downloadPointInTime;

    @Query
    @NameInMap("FormatType")
    private String formatType;

    @Query
    @NameInMap("InstanceName")
    @Validation(required = true)
    private String instanceName;

    @Query
    @NameInMap("RegionCode")
    @Validation(required = true)
    private String regionCode;

    @Query
    @NameInMap("TargetBucket")
    private String targetBucket;

    @Query
    @NameInMap("TargetOssRegion")
    private String targetOssRegion;

    @Query
    @NameInMap("TargetPath")
    private String targetPath;

    @Query
    @NameInMap("TargetType")
    private String targetType;

    private CreateDownloadRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bakSetId = builder.bakSetId;
        this.bakSetSize = builder.bakSetSize;
        this.bakSetType = builder.bakSetType;
        this.downloadPointInTime = builder.downloadPointInTime;
        this.formatType = builder.formatType;
        this.instanceName = builder.instanceName;
        this.regionCode = builder.regionCode;
        this.targetBucket = builder.targetBucket;
        this.targetOssRegion = builder.targetOssRegion;
        this.targetPath = builder.targetPath;
        this.targetType = builder.targetType;
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

    public static final class Builder extends Request.Builder<CreateDownloadRequest, Builder> {
        private String regionId; 
        private String bakSetId; 
        private String bakSetSize; 
        private String bakSetType; 
        private String downloadPointInTime; 
        private String formatType; 
        private String instanceName; 
        private String regionCode; 
        private String targetBucket; 
        private String targetOssRegion; 
        private String targetPath; 
        private String targetType; 

        private Builder() {
            super();
        } 

        private Builder(CreateDownloadRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bakSetId = request.bakSetId;
            this.bakSetSize = request.bakSetSize;
            this.bakSetType = request.bakSetType;
            this.downloadPointInTime = request.downloadPointInTime;
            this.formatType = request.formatType;
            this.instanceName = request.instanceName;
            this.regionCode = request.regionCode;
            this.targetBucket = request.targetBucket;
            this.targetOssRegion = request.targetOssRegion;
            this.targetPath = request.targetPath;
            this.targetType = request.targetType;
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
         * The ID of the backup set. You can call the [DescribeBackups](~~26273~~) operation to query the ID of the backup set.
         * <p>
         * 
         * > This parameter is required if the BakSetType parameter is set to full.
         */
        public Builder bakSetId(String bakSetId) {
            this.putQueryParameter("BakSetId", bakSetId);
            this.bakSetId = bakSetId;
            return this;
        }

        /**
         * The size of the full backup set. Unit: bytes. You can call the [DescribeBackups](~~26273~~) operation to query the size of the full backup set.
         */
        public Builder bakSetSize(String bakSetSize) {
            this.putQueryParameter("BakSetSize", bakSetSize);
            this.bakSetSize = bakSetSize;
            return this;
        }

        /**
         * The type of the download task. Valid values:
         * <p>
         * 
         * *   **full**: downloads a full backup set.
         * *   **pitr**: downloads a backup set at a specific point in time.
         */
        public Builder bakSetType(String bakSetType) {
            this.putQueryParameter("BakSetType", bakSetType);
            this.bakSetType = bakSetType;
            return this;
        }

        /**
         * The point in time at which the backup set is downloaded. Specify a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         * <p>
         * 
         * > This parameter is required if the BakSetType parameter is set to pitr.
         */
        public Builder downloadPointInTime(String downloadPointInTime) {
            this.putQueryParameter("DownloadPointInTime", downloadPointInTime);
            this.downloadPointInTime = downloadPointInTime;
            return this;
        }

        /**
         * The format to which the downloaded backup set is converted. Valid values:
         * <p>
         * 
         * *   **CSV**
         * *   **SQL**
         * *   **Parquet**
         * 
         * > This parameter is required.
         */
        public Builder formatType(String formatType) {
            this.putQueryParameter("FormatType", formatType);
            this.formatType = formatType;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * The ID of the region in which the instance resides. You can call the [DescribeDBInstanceAttribute](~~26231~~) operation to query the region ID of the instance.
         */
        public Builder regionCode(String regionCode) {
            this.putQueryParameter("RegionCode", regionCode);
            this.regionCode = regionCode;
            return this;
        }

        /**
         * The name of the OSS bucket that is used to store the backup set.
         * <p>
         * 
         * *   This parameter is required if the TargetType parameter is set to OSS.
         * *   Make sure that your account is granted the **AliyunDBSDefaultRole** permission. For more information, see [Use RAM for resource authorization](~~26307~~). You can also grant permissions based on the operation instructions in the Resource Access Management (RAM) console.
         */
        public Builder targetBucket(String targetBucket) {
            this.putQueryParameter("TargetBucket", targetBucket);
            this.targetBucket = targetBucket;
            return this;
        }

        /**
         * The region in which the OSS bucket resides.
         * <p>
         * 
         * > This parameter is required if the TargetType parameter is set to OSS.
         */
        public Builder targetOssRegion(String targetOssRegion) {
            this.putQueryParameter("TargetOssRegion", targetOssRegion);
            this.targetOssRegion = targetOssRegion;
            return this;
        }

        /**
         * The destination path to which the backup set is downloaded.
         * <p>
         * 
         * > This parameter is required if the TargetType parameter is set to OSS.
         */
        public Builder targetPath(String targetPath) {
            this.putQueryParameter("TargetPath", targetPath);
            this.targetPath = targetPath;
            return this;
        }

        /**
         * The type of the destination to which the backup set is downloaded. Valid values:
         * <p>
         * 
         * *   **OSS**
         * *   **URL**
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        @Override
        public CreateDownloadRequest build() {
            return new CreateDownloadRequest(this);
        } 

    } 

}
