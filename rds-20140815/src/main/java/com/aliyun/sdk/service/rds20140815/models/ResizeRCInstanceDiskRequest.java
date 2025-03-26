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
 * {@link ResizeRCInstanceDiskRequest} extends {@link RequestModel}
 *
 * <p>ResizeRCInstanceDiskRequest</p>
 */
public class ResizeRCInstanceDiskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskId")
    private String diskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewSize")
    private Long newSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private ResizeRCInstanceDiskRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.diskId = builder.diskId;
        this.dryRun = builder.dryRun;
        this.instanceId = builder.instanceId;
        this.newSize = builder.newSize;
        this.regionId = builder.regionId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResizeRCInstanceDiskRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return newSize
     */
    public Long getNewSize() {
        return this.newSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ResizeRCInstanceDiskRequest, Builder> {
        private Boolean autoPay; 
        private String diskId; 
        private Boolean dryRun; 
        private String instanceId; 
        private Long newSize; 
        private String regionId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ResizeRCInstanceDiskRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.diskId = request.diskId;
            this.dryRun = request.dryRun;
            this.instanceId = request.instanceId;
            this.newSize = request.newSize;
            this.regionId = request.regionId;
            this.type = request.type;
        } 

        /**
         * <p>Specifies whether to enable the automatic payment feature for the instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong> (default): enables the feature. Make sure that your account balance is sufficient.</li>
         * <li><strong>false</strong>: disables the feature. An unpaid order is generated.</li>
         * </ul>
         * <blockquote>
         * <p> If your account balance is insufficient, you can set AutoPay to false. In this case, an unpaid order is generated. You can complete the payment in the Expenses and Costs console.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * DiskId.
         */
        public Builder diskId(String diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, service limits, and insufficient inventory errors.</li>
         * <li><strong>false</strong>: performs a dry run and performs the actual request. If the request passes the dry run, the instance is created.</li>
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
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf62br2491p5l****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The new disk size. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder newSize(Long newSize) {
            this.putQueryParameter("NewSize", newSize);
            this.newSize = newSize;
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

        /**
         * <p>The method that you want to use to resize the disk. Valid values:</p>
         * <ul>
         * <li><strong>offline</strong> (default): resizes disks offline. After you resize a disk offline, you must restart the instance for the resizing operation to take effect.</li>
         * <li><strong>online</strong>: resizes disks online. After you resize a disk online, the resizing operation takes effect immediately and you do not need to restart the instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ResizeRCInstanceDiskRequest build() {
            return new ResizeRCInstanceDiskRequest(this);
        } 

    } 

}
