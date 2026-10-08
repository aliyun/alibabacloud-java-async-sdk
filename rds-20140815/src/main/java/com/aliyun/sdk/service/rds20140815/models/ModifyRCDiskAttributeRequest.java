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
 * {@link ModifyRCDiskAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyRCDiskAttributeRequest</p>
 */
public class ModifyRCDiskAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BurstingEnabled")
    private Boolean burstingEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeleteWithInstance")
    private Boolean deleteWithInstance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String diskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskName")
    private String diskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ModifyRCDiskAttributeRequest(Builder builder) {
        super(builder);
        this.burstingEnabled = builder.burstingEnabled;
        this.deleteWithInstance = builder.deleteWithInstance;
        this.description = builder.description;
        this.diskId = builder.diskId;
        this.diskName = builder.diskName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyRCDiskAttributeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return burstingEnabled
     */
    public Boolean getBurstingEnabled() {
        return this.burstingEnabled;
    }

    /**
     * @return deleteWithInstance
     */
    public Boolean getDeleteWithInstance() {
        return this.deleteWithInstance;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return diskId
     */
    public String getDiskId() {
        return this.diskId;
    }

    /**
     * @return diskName
     */
    public String getDiskName() {
        return this.diskName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyRCDiskAttributeRequest, Builder> {
        private Boolean burstingEnabled; 
        private Boolean deleteWithInstance; 
        private String description; 
        private String diskId; 
        private String diskName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyRCDiskAttributeRequest request) {
            super(request);
            this.burstingEnabled = request.burstingEnabled;
            this.deleteWithInstance = request.deleteWithInstance;
            this.description = request.description;
            this.diskId = request.diskId;
            this.diskName = request.diskName;
            this.regionId = request.regionId;
        } 

        /**
         * <p>Specifies whether to enable the performance burst feature for cloud disks that support burst. Valid values:</p>
         * <p>true: Enabled.
         * false: Disabled.
         * Note
         * An error is returned if you pass any value for cloud disks that do not support the burst feature.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder burstingEnabled(Boolean burstingEnabled) {
            this.putQueryParameter("BurstingEnabled", burstingEnabled);
            this.burstingEnabled = burstingEnabled;
            return this;
        }

        /**
         * <p>Specifies whether to release the cloud disk when the associated instance is released. Default value: null, which indicates that the current value is not changed.</p>
         * <p>Cloud disks that have the multi-attach feature enabled do not support this parameter.</p>
         * <p>An error is returned if you set DeleteWithInstance to false in the following cases:</p>
         * <p>The category of the cloud disk is local disk (ephemeral).
         * The category of the cloud disk is basic cloud disk (cloud) and the cloud disk is not detachable (Portable=false).
         * Warning
         * If you set DeleteWithInstance to false and the ECS instance to which the cloud disk is attached is security-locked with &quot;LockReason&quot; : &quot;security&quot; in OperationLocks, the DeleteWithInstance attribute of the cloud disk is ignored and the cloud disk is released together with the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder deleteWithInstance(Boolean deleteWithInstance) {
            this.putQueryParameter("DeleteWithInstance", deleteWithInstance);
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }

        /**
         * <p>The description of the cloud disk. The description must be 2 to 256 characters in length and cannot start with http:// or https://.</p>
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
         * <p>The ID of the cloud disk whose attributes you want to modify.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rcd-wz9c8isqly8637zw****</p>
         */
        public Builder diskId(String diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
            return this;
        }

        /**
         * <p>The name of the cloud disk. The name must be 2 to 128 characters in length and can contain Unicode characters under the letter category (including letters from various languages, Chinese characters, and digits). The name can contain colons (:), underscores (_), periods (.), or hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>testDisk</p>
         */
        public Builder diskName(String diskName) {
            this.putQueryParameter("DiskName", diskName);
            this.diskName = diskName;
            return this;
        }

        /**
         * <p>The region ID. You can call DescribeRegions to obtain the region ID.</p>
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

        @Override
        public ModifyRCDiskAttributeRequest build() {
            return new ModifyRCDiskAttributeRequest(this);
        } 

    } 

}
