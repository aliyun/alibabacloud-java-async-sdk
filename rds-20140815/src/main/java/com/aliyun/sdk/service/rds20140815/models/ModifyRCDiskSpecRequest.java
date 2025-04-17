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
         * <li><strong>true (default)</strong>: automatically completes the payment. Make sure that your account balance is sufficient.</li>
         * <li><strong>false</strong>: does not automatically complete the payment. An unpaid order is generated.</li>
         * </ul>
         * <blockquote>
         * <p> If your account balance is insufficient, you can set the AutoPay parameter to false. In this case, an unpaid order is generated. You can complete the payment in the Expenses and Costs console.</p>
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
         * <p>The new disk type. Valid values:</p>
         * <ul>
         * <li><strong>cloud_essd</strong>: ESSD.</li>
         * <li><strong>cloud_auto</strong>: ESSD AutoPL disk</li>
         * </ul>
         * <p>This parameter is empty by default.</p>
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
         * <p>Specifies whether to perform a dry run. Valid values: Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs a dry run and does not perform the actual request. The system checks the request parameters, request syntax, limits, and available resources.</li>
         * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, the operation is performed.</li>
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
         * <p>The PL of the disk. Valid values:</p>
         * <ul>
         * <li><strong>PL1</strong> (default): A single ESSD can deliver up to 50,000 random read/write IOPS.</li>
         * <li><strong>PL2</strong>: A single ESSD delivers up to 100,000 random read/write IOPS.</li>
         * <li><strong>PL3</strong>: A single ESSD delivers up to 1,000,000 random read/write IOPS.</li>
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
         * <p>The ID of the region in which the instance resides.</p>
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
