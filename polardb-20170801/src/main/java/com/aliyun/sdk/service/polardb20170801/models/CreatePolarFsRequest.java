// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link CreatePolarFsRequest} extends {@link RequestModel}
 *
 * <p>CreatePolarFsRequest</p>
 */
public class CreatePolarFsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccelerateStorageSize")
    private Long accelerateStorageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccelerateSwitch")
    private String accelerateSwitch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccelerateType")
    private String accelerateType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizedUserIds")
    private String authorizedUserIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoUseCoupon")
    private Boolean autoUseCoupon;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreationCategory")
    private String creationCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomBucketCount")
    private Integer customBucketCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomBucketPath")
    private String customBucketPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomBucketPathList")
    private java.util.List<CustomBucketPathList> customBucketPathList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomOssAk")
    private String customOssAk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomOssSk")
    private String customOssSk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBType")
    private String DBType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromotionCode")
    private String promotionCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageSpace")
    @com.aliyun.core.annotation.Validation(maximum = 100000, minimum = 10)
    private Long storageSpace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageType")
    private String storageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsedTime")
    private String usedTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VPCId")
    private String VPCId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private CreatePolarFsRequest(Builder builder) {
        super(builder);
        this.accelerateStorageSize = builder.accelerateStorageSize;
        this.accelerateSwitch = builder.accelerateSwitch;
        this.accelerateType = builder.accelerateType;
        this.authorizedUserIds = builder.authorizedUserIds;
        this.autoRenew = builder.autoRenew;
        this.autoUseCoupon = builder.autoUseCoupon;
        this.creationCategory = builder.creationCategory;
        this.customBucketCount = builder.customBucketCount;
        this.customBucketPath = builder.customBucketPath;
        this.customBucketPathList = builder.customBucketPathList;
        this.customOssAk = builder.customOssAk;
        this.customOssSk = builder.customOssSk;
        this.DBClusterId = builder.DBClusterId;
        this.DBType = builder.DBType;
        this.payType = builder.payType;
        this.period = builder.period;
        this.promotionCode = builder.promotionCode;
        this.regionId = builder.regionId;
        this.storageSpace = builder.storageSpace;
        this.storageType = builder.storageType;
        this.usedTime = builder.usedTime;
        this.VPCId = builder.VPCId;
        this.vSwitchId = builder.vSwitchId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePolarFsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accelerateStorageSize
     */
    public Long getAccelerateStorageSize() {
        return this.accelerateStorageSize;
    }

    /**
     * @return accelerateSwitch
     */
    public String getAccelerateSwitch() {
        return this.accelerateSwitch;
    }

    /**
     * @return accelerateType
     */
    public String getAccelerateType() {
        return this.accelerateType;
    }

    /**
     * @return authorizedUserIds
     */
    public String getAuthorizedUserIds() {
        return this.authorizedUserIds;
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return autoUseCoupon
     */
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    /**
     * @return creationCategory
     */
    public String getCreationCategory() {
        return this.creationCategory;
    }

    /**
     * @return customBucketCount
     */
    public Integer getCustomBucketCount() {
        return this.customBucketCount;
    }

    /**
     * @return customBucketPath
     */
    public String getCustomBucketPath() {
        return this.customBucketPath;
    }

    /**
     * @return customBucketPathList
     */
    public java.util.List<CustomBucketPathList> getCustomBucketPathList() {
        return this.customBucketPathList;
    }

    /**
     * @return customOssAk
     */
    public String getCustomOssAk() {
        return this.customOssAk;
    }

    /**
     * @return customOssSk
     */
    public String getCustomOssSk() {
        return this.customOssSk;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return DBType
     */
    public String getDBType() {
        return this.DBType;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return promotionCode
     */
    public String getPromotionCode() {
        return this.promotionCode;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return storageSpace
     */
    public Long getStorageSpace() {
        return this.storageSpace;
    }

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    /**
     * @return usedTime
     */
    public String getUsedTime() {
        return this.usedTime;
    }

    /**
     * @return VPCId
     */
    public String getVPCId() {
        return this.VPCId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreatePolarFsRequest, Builder> {
        private Long accelerateStorageSize; 
        private String accelerateSwitch; 
        private String accelerateType; 
        private String authorizedUserIds; 
        private Boolean autoRenew; 
        private Boolean autoUseCoupon; 
        private String creationCategory; 
        private Integer customBucketCount; 
        private String customBucketPath; 
        private java.util.List<CustomBucketPathList> customBucketPathList; 
        private String customOssAk; 
        private String customOssSk; 
        private String DBClusterId; 
        private String DBType; 
        private String payType; 
        private String period; 
        private String promotionCode; 
        private String regionId; 
        private Long storageSpace; 
        private String storageType; 
        private String usedTime; 
        private String VPCId; 
        private String vSwitchId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreatePolarFsRequest request) {
            super(request);
            this.accelerateStorageSize = request.accelerateStorageSize;
            this.accelerateSwitch = request.accelerateSwitch;
            this.accelerateType = request.accelerateType;
            this.authorizedUserIds = request.authorizedUserIds;
            this.autoRenew = request.autoRenew;
            this.autoUseCoupon = request.autoUseCoupon;
            this.creationCategory = request.creationCategory;
            this.customBucketCount = request.customBucketCount;
            this.customBucketPath = request.customBucketPath;
            this.customBucketPathList = request.customBucketPathList;
            this.customOssAk = request.customOssAk;
            this.customOssSk = request.customOssSk;
            this.DBClusterId = request.DBClusterId;
            this.DBType = request.DBType;
            this.payType = request.payType;
            this.period = request.period;
            this.promotionCode = request.promotionCode;
            this.regionId = request.regionId;
            this.storageSpace = request.storageSpace;
            this.storageType = request.storageType;
            this.usedTime = request.usedTime;
            this.VPCId = request.VPCId;
            this.vSwitchId = request.vSwitchId;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>The acceleration storage space for Basic Edition with acceleration enabled. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder accelerateStorageSize(Long accelerateStorageSize) {
            this.putQueryParameter("AccelerateStorageSize", accelerateStorageSize);
            this.accelerateStorageSize = accelerateStorageSize;
            return this;
        }

        /**
         * <p>The acceleration mode. Valid values:</p>
         * <ul>
         * <li><strong>ONLY</strong>: enables acceleration only.</li>
         * <li><strong>ON</strong>: enables cold data storage and acceleration.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ONLY</p>
         */
        public Builder accelerateSwitch(String accelerateSwitch) {
            this.putQueryParameter("AccelerateSwitch", accelerateSwitch);
            this.accelerateSwitch = accelerateSwitch;
            return this;
        }

        /**
         * <p>The acceleration type. Valid values: </p>
         * <ul>
         * <li><strong>juice</strong>: file system acceleration.</li>
         * <li><strong>alluxio</strong>: transparent acceleration.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>alluxio</p>
         */
        public Builder accelerateType(String accelerateType) {
            this.putQueryParameter("AccelerateType", accelerateType);
            this.accelerateType = accelerateType;
            return this;
        }

        /**
         * <p>The list of authorized account IDs for Cold Storage Edition instances, separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>128***********，198***********</p>
         */
        public Builder authorizedUserIds(String authorizedUserIds) {
            this.putQueryParameter("AuthorizedUserIds", authorizedUserIds);
            this.authorizedUserIds = authorizedUserIds;
            return this;
        }

        /**
         * <p>Specifies whether to enable auto-renewal. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Auto-renewal is enabled.</li>
         * <li><strong>false</strong>: Auto-renewal is disabled.</li>
         * </ul>
         * <p>Default value: <strong>false</strong>.</p>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>PayType</strong> is set to <strong>Prepaid</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>Specifies whether to automatically use coupons. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Coupons are used (default).</li>
         * <li><strong>false</strong>: Coupons are not used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoUseCoupon(Boolean autoUseCoupon) {
            this.putQueryParameter("AutoUseCoupon", autoUseCoupon);
            this.autoUseCoupon = autoUseCoupon;
            return this;
        }

        /**
         * <p>The edition. Valid values:</p>
         * <ul>
         * <li><strong>basic</strong>: Basic Edition (default).</li>
         * <li><strong>cold</strong>: Cold Storage Edition.</li>
         * <li><strong>high_performance</strong>: High-performance Edition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>basic</p>
         */
        public Builder creationCategory(String creationCategory) {
            this.putQueryParameter("CreationCategory", creationCategory);
            this.creationCategory = creationCategory;
            return this;
        }

        /**
         * <p>The number of buckets.</p>
         * <blockquote>
         * <p>This parameter is required only when acceleration (file system acceleration) is enabled.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder customBucketCount(Integer customBucketCount) {
            this.putQueryParameter("CustomBucketCount", customBucketCount);
            this.customBucketCount = customBucketCount;
            return this;
        }

        /**
         * <p>The bucket path.</p>
         * <blockquote>
         * <p>This parameter is required only when acceleration (file system acceleration) is enabled.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/test</p>
         */
        public Builder customBucketPath(String customBucketPath) {
            this.putQueryParameter("CustomBucketPath", customBucketPath);
            this.customBucketPath = customBucketPath;
            return this;
        }

        /**
         * <p>The bucket and path information.</p>
         * <blockquote>
         * <p>This parameter is required for transparent acceleration scenarios.</p>
         * </blockquote>
         */
        public Builder customBucketPathList(java.util.List<CustomBucketPathList> customBucketPathList) {
            this.putQueryParameter("CustomBucketPathList", customBucketPathList);
            this.customBucketPathList = customBucketPathList;
            return this;
        }

        /**
         * <p>The custom AccessKey ID.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder customOssAk(String customOssAk) {
            this.putQueryParameter("CustomOssAk", customOssAk);
            this.customOssAk = customOssAk;
            return this;
        }

        /**
         * <p>The custom AccessKey secret.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder customOssSk(String customOssSk) {
            this.putQueryParameter("CustomOssSk", customOssSk);
            this.customOssSk = customOssSk;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-**************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The database engine. Valid values:</p>
         * <ul>
         * <li><strong>MySQL</strong></li>
         * <li><strong>PostgreSQL</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder DBType(String DBType) {
            this.putQueryParameter("DBType", DBType);
            this.DBType = DBType;
            return this;
        }

        /**
         * <p>The billing method. Valid values: </p>
         * <ul>
         * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
         * <li><strong>Prepaid</strong>: subscription.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Postpaid</p>
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * <p>This parameter is required when <strong>PayType</strong> is set to <strong>Prepaid</strong>. Specifies whether the subscription cluster uses a yearly or monthly billing cycle. You must pass this parameter when the billing method is subscription. </p>
         * <ul>
         * <li><strong>Year</strong>: The subscription period is measured in years.</li>
         * <li><strong>Month</strong>: The subscription period is measured in months.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The coupon code. If this parameter is not specified, the default coupon is used.</p>
         * 
         * <strong>example:</strong>
         * <p>727xxxxxx934</p>
         */
        public Builder promotionCode(String promotionCode) {
            this.putQueryParameter("PromotionCode", promotionCode);
            this.promotionCode = promotionCode;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query region IDs.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The storage space. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder storageSpace(Long storageSpace) {
            this.putQueryParameter("StorageSpace", storageSpace);
            this.storageSpace = storageSpace;
            return this;
        }

        /**
         * <p>Valid values for high-performance storage type:</p>
         * <ul>
         * <li><strong>ESSDPL0</strong></li>
         * <li><strong>ESSDPL1</strong></li>
         * </ul>
         * <p>Valid values for Basic Edition storage type:</p>
         * <ul>
         * <li><strong>city_redundancy (zone-redundant)</strong></li>
         * </ul>
         * <p>Valid values for Cold Storage Edition storage type:</p>
         * <ul>
         * <li><strong>city_redundancy (zone-redundant)</strong></li>
         * <li><strong>local_redundancy (locally redundant)</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>local_redundancy</p>
         */
        public Builder storageType(String storageType) {
            this.putQueryParameter("StorageType", storageType);
            this.storageType = storageType;
            return this;
        }

        /**
         * <p>This parameter is required when <strong>PayType</strong> is set to <strong>Prepaid</strong>.</p>
         * <ul>
         * <li>When <strong>Period</strong> is set to <strong>Month</strong>, the valid values of <strong>UsedTime</strong> are integers in the range of <code>[1-9]</code>.</li>
         * <li>When <strong>Period</strong> is set to <strong>Year</strong>, the valid values of <strong>UsedTime</strong> are integers in the range of <code>[1-3]</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder usedTime(String usedTime) {
            this.putQueryParameter("UsedTime", usedTime);
            this.usedTime = usedTime;
            return this;
        }

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-*******************</p>
         */
        public Builder VPCId(String VPCId) {
            this.putQueryParameter("VPCId", VPCId);
            this.VPCId = VPCId;
            return this;
        }

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-*********************</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-i</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreatePolarFsRequest build() {
            return new CreatePolarFsRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreatePolarFsRequest} extends {@link TeaModel}
     *
     * <p>CreatePolarFsRequest</p>
     */
    public static class CustomBucketPathList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bucket")
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        private CustomBucketPathList(Builder builder) {
            this.bucket = builder.bucket;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomBucketPathList create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        public static final class Builder {
            private String bucket; 
            private String path; 

            private Builder() {
            } 

            private Builder(CustomBucketPathList model) {
                this.bucket = model.bucket;
                this.path = model.path;
            } 

            /**
             * <p>The custom storage bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>pfs-xxx.oss-[regionId]-internal.aliyuncs.com</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>The custom storage path.</p>
             * 
             * <strong>example:</strong>
             * <p>/data</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public CustomBucketPathList build() {
                return new CustomBucketPathList(this);
            } 

        } 

    }
}
