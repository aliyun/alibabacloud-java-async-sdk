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
         * <p>Specifies whether to enable the performance burst feature for disks that support this feature. Valid values:</p>
         * <p>true: enables the feature.
         * false: disables the feature.
         * Note
         * An error is returned if you specify any value for a disk that does not support the performance burst feature.</p>
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
         * <p>Specifies whether to release the disk when the instance is released. Default value: null. A value of null indicates that the current value remains unchanged.</p>
         * <p>You cannot configure this parameter for cloud disks that have the multi-attach feature enabled.</p>
         * <p>An error is returned if you set the DeleteWithInstance parameter to false in the following scenarios:</p>
         * <p>The disk category is local disk (ephemeral).
         * The disk category is basic cloud disk (cloud) and the disk is not detachable (Portable=false).
         * Warning
         * If you set this parameter to false and the ECS instance to which the disk is attached is locked for security reasons (the OperationLocks parameter indicates &quot;LockReason&quot; : &quot;security&quot;), the disk is released along with the instance regardless of the DeleteWithInstance setting when the instance is released.</p>
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
         * <p>The description of the disk. The description must be 2 to 256 characters in length and cannot start with http:// or https://.</p>
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
         * <p>The ID of the disk whose attributes you want to modify.</p>
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
         * <p>The cloud disk name. The name must be 2 to 128 characters in length and can contain characters in the Letter category of Unicode, such as English letters, Chinese characters, and digits. It can also contain colons (:), underscores (_), periods (.), and hyphens (-).</p>
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

        @Override
        public ModifyRCDiskAttributeRequest build() {
            return new ModifyRCDiskAttributeRequest(this);
        } 

    } 

}
