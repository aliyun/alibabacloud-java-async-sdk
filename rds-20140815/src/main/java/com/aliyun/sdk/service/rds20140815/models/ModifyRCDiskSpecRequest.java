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
 * {@link ModifyRCDiskSpecRequest} extends {@link RequestModel}
 *
 * <p>ModifyRCDiskSpecRequest</p>
 */
public class ModifyRCDiskSpecRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskCategory")
    private String diskCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskId")
    private String diskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PerformanceLevel")
    private String performanceLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ModifyRCDiskSpecRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.diskCategory = builder.diskCategory;
        this.diskId = builder.diskId;
        this.dryRun = builder.dryRun;
        this.performanceLevel = builder.performanceLevel;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyRCDiskSpecRequest create() {
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
     * @return diskCategory
     */
    public String getDiskCategory() {
        return this.diskCategory;
    }

    /**
     * @return diskId
     */
    public String getDiskId() {
        return this.diskId;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return performanceLevel
     */
    public String getPerformanceLevel() {
        return this.performanceLevel;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyRCDiskSpecRequest, Builder> {
        private Boolean autoPay; 
        private String diskCategory; 
        private String diskId; 
        private Boolean dryRun; 
        private String performanceLevel; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyRCDiskSpecRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.diskCategory = request.diskCategory;
            this.diskId = request.diskId;
            this.dryRun = request.dryRun;
            this.performanceLevel = request.performanceLevel;
            this.regionId = request.regionId;
        } 

        /**
         * <p>Specifies whether to enable automatic payment. Valid values:</p>
         * <ul>
         * <li><strong>true</strong> (default): Automatic payment is enabled. Make sure that your account balance is sufficient.</li>
         * <li><strong>false</strong>: Only an order is generated. No payment is made.</li>
         * </ul>
         * <blockquote>
         * <p>If your payment method has an insufficient balance, set AutoPay to false. An unpaid order is generated. You can log on to the ApsaraDB RDS console to complete the payment.</p>
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
         * <p>The type of the cloud disk. Valid values:</p>
         * <ul>
         * <li><strong>cloud_essd</strong> (default): ESSD cloud disk.</li>
         * <li><strong>cloud_auto</strong>: ESSD AutoPL cloud disk.</li>
         * <li><strong>cloud_ssd</strong>: standard SSD.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        public Builder diskCategory(String diskCategory) {
            this.putQueryParameter("DiskCategory", diskCategory);
            this.diskCategory = diskCategory;
            return this;
        }

        /**
         * <p>The cloud disk ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rcd-wz9f3peueu5npsl****</p>
         */
        public Builder diskId(String diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run for this operation. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: A dry run is performed without executing the change. The check items include request parameters, request format, business limits, and inventory.</li>
         * <li><strong>false</strong> (default): A normal request is sent. After the check is passed, the change is directly executed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The performance level (PL) of the ESSD cloud disk. Valid values:</p>
         * <ul>
         * <li><p><strong>PL1</strong> (default): A maximum of 50,000 random read/write IOPS per disk.</p>
         * </li>
         * <li><p><strong>PL2</strong>: A maximum of 100,000 random read/write IOPS per disk.</p>
         * </li>
         * <li><p><strong>PL3</strong>: A maximum of 1,000,000 random read/write IOPS per disk.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PL2</p>
         */
        public Builder performanceLevel(String performanceLevel) {
            this.putQueryParameter("PerformanceLevel", performanceLevel);
            this.performanceLevel = performanceLevel;
            return this;
        }

        /**
         * <p>The region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyRCDiskSpecRequest build() {
            return new ModifyRCDiskSpecRequest(this);
        } 

    } 

}
