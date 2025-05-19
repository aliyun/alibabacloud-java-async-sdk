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
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Size")
    private Integer size;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotId")
    private String snapshotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

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
        this.resourceGroupId = builder.resourceGroupId;
        this.size = builder.size;
        this.snapshotId = builder.snapshotId;
        this.tag = builder.tag;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
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
        private String resourceGroupId; 
        private Integer size; 
        private String snapshotId; 
        private java.util.List<Tag> tag; 
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
            this.resourceGroupId = request.resourceGroupId;
            this.size = request.size;
            this.snapshotId = request.snapshotId;
            this.tag = request.tag;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>Specifies whether to enable automatic payment. Valid values:</p>
         * <ul>
         * <li><strong>true</strong> (default): enables automatic payment. Make sure that your account balance is sufficient.</li>
         * <li><strong>false</strong>: does not automatically complete the payment. An unpaid order is generated.</li>
         * </ul>
         * <blockquote>
         * <p> If your account balance is insufficient, you can set the parameter to false. In this case, an unpaid order is generated. You can complete the payment in the Expenses and Costs console.</p>
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
         * <p>The disk description. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
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
         * <p>The data disk type. Valid values:</p>
         * <ul>
         * <li><strong>cloud_efficiency</strong>: ultra disk</li>
         * <li><strong>cloud_ssd</strong>: standard SSD</li>
         * <li><strong>cloud_essd</strong>: ESSD</li>
         * <li><strong>cloud_auto</strong> (default): Premium ESSD</li>
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
         * <p>The name of the data disk. The name must be 2 to 128 characters in length and can contain letters and digits. The name can contain colons (:), underscores (_), periods (.), and hyphens (-).</p>
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
         * <p>The ID of the instance to which you want to attach the disk.</p>
         * 
         * <strong>example:</strong>
         * <p>rc-v28c6k3jupp61m2t****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The performance level (PL) of ESSDs. Valid values:</p>
         * <ul>
         * <li><strong>PL0</strong>: A single ESSD delivers up to 10,000 random read/write IOPS.</li>
         * <li><strong>PL1: An ESSD delivers up to 50,000 random read/write IOPS.</strong></li>
         * <li><strong>PL2</strong>: A single ESSD delivers up to 100,000 random read/write IOPS.</li>
         * <li><strong>PL3</strong>: A single ESSD delivers up to 1,000,000 random read/write IOPS.</li>
         * </ul>
         * <p>For information about ESSD PLs, see <a href="https://help.aliyun.com/document_detail/2859916.html">ESSDs</a>.</p>
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The disk size. Unit: GiB. This parameter is required. Valid values:</p>
         * <ul>
         * <li><p>Valid values if you set DiskCategory to <strong>cloud_efficiency</strong>: 20 to 32768.</p>
         * </li>
         * <li><p>Valid values if you set DiskCategory to <strong>cloud_ssd</strong>: 20 to 32768.</p>
         * </li>
         * <li><p>Valid values if you set DiskCategory to <strong>cloud_auto</strong>: 1 to 65536.</p>
         * </li>
         * <li><p>Valid values when DiskCategory is set to cloud_essd: depending on the value of <strong>PerformanceLevel</strong>.****</p>
         * <ul>
         * <li>Valid values if PerformanceLevel is set to PL0: 1 to 65536</li>
         * <li>Valid values if PerformanceLevel is set to PL1: 20 to 65536</li>
         * <li>Valid values if PerformanceLevel is set to PL2: 461 to 65536</li>
         * <li>Valid values if PerformanceLevel is set to PL3: 1261 to 65536</li>
         * </ul>
         * </li>
         * </ul>
         * <p>If <strong>SnapshotId</strong> is specified and the size of the corresponding snapshot is greater than the <strong>Size</strong> value, the size of the created disk is the same as that of the snapshot. If the snapshot size is less than the <strong>Size</strong> value, the size of the created disk is equal to the <strong>Size</strong> value.</p>
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
         * <p>The snapshot that you want to use to create the disk.</p>
         * <ul>
         * <li>If the size of the snapshot specified by <strong>SnapshotId</strong> is greater than the value of <strong>Size</strong>, the size of the created disk is equal to the specified snapshot size. If the snapshot size is less than the <strong>Size</strong> value, the size of the created disk is equal to the <strong>Size</strong> value.</li>
         * <li>You cannot create elastic ephemeral disks from snapshots.</li>
         * <li>Snapshots that were created on or before July 15, 2013 cannot be used to create disks.</li>
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
         * Tag.
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The zone ID.</p>
         * <p>This parameter is required if you do not specify <strong>InstanceId</strong>.</p>
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

    /**
     * 
     * {@link CreateRCDiskRequest} extends {@link TeaModel}
     *
     * <p>CreateRCDiskRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
