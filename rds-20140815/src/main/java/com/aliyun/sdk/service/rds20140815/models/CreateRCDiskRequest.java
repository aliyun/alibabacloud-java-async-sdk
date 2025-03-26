// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link CreateRCDiskRequest} extends {@link RequestModel}
 *
 * <p>CreateRCDiskRequest</p>
 */
public class CreateRCDiskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskCategory")
    private String diskCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskName")
    private String diskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PerformanceLevel")
    private String performanceLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    private String periodUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Size")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer size;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotId")
    private String snapshotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private CreateRCDiskRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.autoRenew = builder.autoRenew;
        this.description = builder.description;
        this.diskCategory = builder.diskCategory;
        this.diskName = builder.diskName;
        this.instanceChargeType = builder.instanceChargeType;
        this.instanceId = builder.instanceId;
        this.performanceLevel = builder.performanceLevel;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.regionId = builder.regionId;
        this.size = builder.size;
        this.snapshotId = builder.snapshotId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRCDiskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return diskCategory
     */
    public String getDiskCategory() {
        return this.diskCategory;
    }

    /**
     * @return diskName
     */
    public String getDiskName() {
        return this.diskName;
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return performanceLevel
     */
    public String getPerformanceLevel() {
        return this.performanceLevel;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return snapshotId
     */
    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateRCDiskRequest, Builder> {
        private Boolean autoPay; 
        private Boolean autoRenew; 
        private String description; 
        private String diskCategory; 
        private String diskName; 
        private String instanceChargeType; 
        private String instanceId; 
        private String performanceLevel; 
        private Integer period; 
        private String periodUnit; 
        private String regionId; 
        private Integer size; 
        private String snapshotId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateRCDiskRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.autoRenew = request.autoRenew;
            this.description = request.description;
            this.diskCategory = request.diskCategory;
            this.diskName = request.diskName;
            this.instanceChargeType = request.instanceChargeType;
            this.instanceId = request.instanceId;
            this.performanceLevel = request.performanceLevel;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.regionId = request.regionId;
            this.size = request.size;
            this.snapshotId = request.snapshotId;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>Specifies whether to enable automatic payment. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables the feature. You must make sure that your account balance is sufficient.</li>
         * <li><strong>false</strong>: disables the feature. An unpaid order is generated.</li>
         * </ul>
         * <blockquote>
         * <p> Default value: true. If your account balance is insufficient, you can set AutoPay to false to generate an unpaid order. Then, you can log on to the ApsaraDB RDS console to complete the payment.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * <p>Specifies whether to enable auto-renewal. You must specify this parameter only when the data disk uses the subscription billing method. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <blockquote>
         * <p> The auto-renewal cycle is one month for a monthly subscription. The auto-renewal cycle is one year for a yearly subscription.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>The disk description. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>. By default, this parameter is left empty.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The category of the data disk. Valid values:</p>
         * <ul>
         * <li><strong>cloud</strong> (default): basic disk</li>
         * <li><strong>cloud_efficiency</strong>: ultra disk.</li>
         * <li><strong>cloud_ssd</strong>: standard SSD.</li>
         * <li><strong>cloud_essd</strong>: Enterprise SSD (ESSD).</li>
         * <li><strong>cloud_auto</strong>: ESSD AutoPL disk</li>
         * <li><strong>cloud_essd_entry</strong>: ESSD Entry disk</li>
         * <li><strong>elastic_ephemeral_disk_standard</strong>: standard elastic ephemeral disk</li>
         * <li><strong>elastic_ephemeral_disk_premium</strong>: premium elastic ephemeral disk</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        public Builder diskCategory(String diskCategory) {
            this.putQueryParameter("DiskCategory", diskCategory);
            this.diskCategory = diskCategory;
            return this;
        }

        /**
         * <p>The disk name. The name must be 2 to 128 characters in length and can contain letters and digits. The name can contain colons (:), underscores (_), periods (.), and hyphens (-).</p>
         * <p>By default, this parameter is left empty.</p>
         * 
         * <strong>example:</strong>
         * <p>ZStack-Hybrid-Test-ECS-Instance</p>
         */
        public Builder diskName(String diskName) {
            this.putQueryParameter("DiskName", diskName);
            this.diskName = diskName;
            return this;
        }

        /**
         * <p>The billing method. Set the value to <strong>Postpaid</strong>, which specifies the pay-as-you-go billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>Postpaid</p>
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The performance level (PL) of the disk if the disk is an ESSD. Valid values:</p>
         * <ul>
         * <li><strong>PL0</strong>: A single ESSD delivers up to 10,000 random read/write IOPS.</li>
         * <li><strong>PL1</strong> (default): A single ESSD can deliver up to 50,000 random read/write IOPS.</li>
         * <li><strong>PL2</strong>: A single ESSD delivers up to 100,000 random read/write IOPS.</li>
         * <li><strong>PL3</strong>: A single ESSD delivers up to 1,000,000 random read/write IOPS.</li>
         * </ul>
         * <p>For information about ESSD PLs, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        public Builder performanceLevel(String performanceLevel) {
            this.putQueryParameter("PerformanceLevel", performanceLevel);
            this.performanceLevel = performanceLevel;
            return this;
        }

        /**
         * <p>A reserved parameter. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>A reserved parameter. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
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
         * <p>The disk size. Unit: GiB. This parameter is required. Valid values:</p>
         * <ul>
         * <li><p>Valid values if you set DiskCategory to <strong>cloud</strong>: 5 to 2000.</p>
         * </li>
         * <li><p>Valid values if you set DiskCategory to <strong>cloud_efficiency</strong>: 20 to 32768.</p>
         * </li>
         * <li><p>Valid values if you set DiskCategory to <strong>cloud_ssd</strong>: 20 to 32768.</p>
         * </li>
         * <li><p>Valid values if you set DiskCategory to <strong>cloud_essd</strong>: depend on the value of PerformanceLevel.</p>
         * <ul>
         * <li>Valid values if PerformanceLevel is set to PL0: 1 to 65536</li>
         * <li>Valid values if PerformanceLevel is set to PL1: 20 to 65536</li>
         * <li>Valid values if PerformanceLevel is set to PL2: 461 to 65536</li>
         * <li>Valid values if PerformanceLevel is set to PL3: 1261 to 65536</li>
         * </ul>
         * </li>
         * <li><p>Valid values if you set DiskCategory to <strong>cloud_auto</strong>: 1 to 65536.</p>
         * </li>
         * <li><p>Valid values if you set DiskCategory to <strong>cloud_essd_entry</strong>: 10 to 32768.</p>
         * </li>
         * <li><p>Valid values if you set DiskCategory to <strong>elastic_ephemeral_disk_standard</strong>: 64 to 8192.</p>
         * </li>
         * <li><p>Valid values if you set DiskCategory to <strong>elastic_ephemeral_disk_premium</strong>: 64 to 8192.</p>
         * </li>
         * </ul>
         * <p>If <code>SnapshotId</code> is specified, the following limits apply to <code>SnapshotId</code> and <code>Size</code>:</p>
         * <ul>
         * <li>If the size of the snapshot specified by <code>SnapshotId</code> is larger than the value of <code>Size</code>, the size of the created disk is equal to the size of the snapshot.</li>
         * <li>If the size of the snapshot specified by <code>SnapshotId</code> is smaller than the value of <code>Size</code>, the size of the created disk is equal to the value of <code>Size</code>.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        public Builder size(Integer size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * <p>The snapshot that you want to use to create the disk. Snapshots that were created on or before July 15, 2013 cannot be used to create disks. The following limits apply to <code>SnapshotId</code> and <code>Size</code>:</p>
         * <ul>
         * <li>If the size of the snapshot specified by <code>SnapshotId</code> is larger than the value of <code>Size</code>, the size of the created disk is equal to the specified snapshot size.</li>
         * <li>If the size of the snapshot specified by <code>SnapshotId</code> is smaller than the value of <code>Size</code>, the size of the created disk is equal to the value of <code>Size</code>.</li>
         * <li>You cannot create elastic ephemeral disks from snapshots.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>rcds-umtnkvevqbu****</p>
         */
        public Builder snapshotId(String snapshotId) {
            this.putQueryParameter("SnapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-a</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateRCDiskRequest build() {
            return new CreateRCDiskRequest(this);
        } 

    } 

}
