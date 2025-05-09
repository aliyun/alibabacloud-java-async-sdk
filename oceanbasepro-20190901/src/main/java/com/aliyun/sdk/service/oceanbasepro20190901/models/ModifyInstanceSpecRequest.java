// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link ModifyInstanceSpecRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceSpecRequest</p>
 */
public class ModifyInstanceSpecRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DiskSize")
    private Long diskSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DiskType")
    private String diskType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceClass")
    private String instanceClass;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpgradeSpecNative")
    private Boolean upgradeSpecNative;

    private ModifyInstanceSpecRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.diskSize = builder.diskSize;
        this.diskType = builder.diskType;
        this.dryRun = builder.dryRun;
        this.instanceClass = builder.instanceClass;
        this.instanceId = builder.instanceId;
        this.upgradeSpecNative = builder.upgradeSpecNative;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceSpecRequest create() {
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
     * @return diskSize
     */
    public Long getDiskSize() {
        return this.diskSize;
    }

    /**
     * @return diskType
     */
    public String getDiskType() {
        return this.diskType;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return instanceClass
     */
    public String getInstanceClass() {
        return this.instanceClass;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return upgradeSpecNative
     */
    public Boolean getUpgradeSpecNative() {
        return this.upgradeSpecNative;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceSpecRequest, Builder> {
        private String regionId; 
        private Long diskSize; 
        private String diskType; 
        private Boolean dryRun; 
        private String instanceClass; 
        private String instanceId; 
        private Boolean upgradeSpecNative; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceSpecRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.diskSize = request.diskSize;
            this.diskType = request.diskType;
            this.dryRun = request.dryRun;
            this.instanceClass = request.instanceClass;
            this.instanceId = request.instanceId;
            this.upgradeSpecNative = request.upgradeSpecNative;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The size of the storage space, in GB. The required storage space varies based on the cluster specifications:</p>
         * <ul>
         * <li>8C32G: 100 GB to 10 TB.</li>
         * <li>14C70G: 200 GB to 10 TB.</li>
         * <li>30C180G: 400 GB to 10 TB.</li>
         * <li>62C400G: 800 GB to 10 TB. The preceding minimum storage space sizes are the default storage space sizes of the corresponding cluster specification plans.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder diskSize(Long diskSize) {
            this.putBodyParameter("DiskSize", diskSize);
            this.diskSize = diskSize;
            return this;
        }

        /**
         * <p>Disk type.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd_pl1</p>
         */
        public Builder diskType(String diskType) {
            this.putBodyParameter("DiskType", diskType);
            this.diskType = diskType;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run for the request. Default value: false. Valid values:</p>
         * <ul>
         * <li>true: Only a dry-run request is sent and the instance settings are not modified. If the dry run succeeds, DryRunResult=true is returned. If the dry run fails, an error code is returned.</li>
         * <li>false: If the DryRun parameter is set to false, no dry run is performed and the DryRunResult parameter returns false.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The specifications of the cluster. You can specify one of the following four plans:</p>
         * <ul>
         * <li>8C32GB: indicates 8 CPU cores and 32 GB of memory.</li>
         * <li>14C70GB: indicates 14 CPU cores and 70 GB of memory. This is the default value.</li>
         * <li>30C180GB: indicates 30 CPU cores and 180 GB of memory.</li>
         * <li>62C400GB: indicates 62 CPU cores and 400 GB of memory.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>14C70GB</p>
         */
        public Builder instanceClass(String instanceClass) {
            this.putBodyParameter("InstanceClass", instanceClass);
            this.instanceClass = instanceClass;
            return this;
        }

        /**
         * <p>The ID of the OceanBase cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ob3h8ytroxxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * UpgradeSpecNative.
         */
        public Builder upgradeSpecNative(Boolean upgradeSpecNative) {
            this.putBodyParameter("UpgradeSpecNative", upgradeSpecNative);
            this.upgradeSpecNative = upgradeSpecNative;
            return this;
        }

        @Override
        public ModifyInstanceSpecRequest build() {
            return new ModifyInstanceSpecRequest(this);
        } 

    } 

}
