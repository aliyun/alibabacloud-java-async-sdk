// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dfs20180620.models;

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
 * {@link AttachVscMountPointRequest} extends {@link RequestModel}
 *
 * <p>AttachVscMountPointRequest</p>
 */
public class AttachVscMountPointRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inputRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MountPointId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mountPointId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseAssumeRoleChkServerPerm")
    private Boolean useAssumeRoleChkServerPerm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VscIds")
    private java.util.List<String> vscIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VscType")
    private String vscType;

    private AttachVscMountPointRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.fileSystemId = builder.fileSystemId;
        this.inputRegionId = builder.inputRegionId;
        this.instanceIds = builder.instanceIds;
        this.mountPointId = builder.mountPointId;
        this.useAssumeRoleChkServerPerm = builder.useAssumeRoleChkServerPerm;
        this.vscIds = builder.vscIds;
        this.vscType = builder.vscType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachVscMountPointRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return inputRegionId
     */
    public String getInputRegionId() {
        return this.inputRegionId;
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return mountPointId
     */
    public String getMountPointId() {
        return this.mountPointId;
    }

    /**
     * @return useAssumeRoleChkServerPerm
     */
    public Boolean getUseAssumeRoleChkServerPerm() {
        return this.useAssumeRoleChkServerPerm;
    }

    /**
     * @return vscIds
     */
    public java.util.List<String> getVscIds() {
        return this.vscIds;
    }

    /**
     * @return vscType
     */
    public String getVscType() {
        return this.vscType;
    }

    public static final class Builder extends Request.Builder<AttachVscMountPointRequest, Builder> {
        private String regionId; 
        private String description; 
        private String fileSystemId; 
        private String inputRegionId; 
        private java.util.List<String> instanceIds; 
        private String mountPointId; 
        private Boolean useAssumeRoleChkServerPerm; 
        private java.util.List<String> vscIds; 
        private String vscType; 

        private Builder() {
            super();
        } 

        private Builder(AttachVscMountPointRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
            this.fileSystemId = request.fileSystemId;
            this.inputRegionId = request.inputRegionId;
            this.instanceIds = request.instanceIds;
            this.mountPointId = request.mountPointId;
            this.useAssumeRoleChkServerPerm = request.useAssumeRoleChkServerPerm;
            this.vscIds = request.vscIds;
            this.vscType = request.vscType;
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
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>037****e1d</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder inputRegionId(String inputRegionId) {
            this.putQueryParameter("InputRegionId", inputRegionId);
            this.inputRegionId = inputRegionId;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            String instanceIdsShrink = shrink(instanceIds, "InstanceIds", "json");
            this.putQueryParameter("InstanceIds", instanceIdsShrink);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>037cb49e1d-c***5</p>
         */
        public Builder mountPointId(String mountPointId) {
            this.putQueryParameter("MountPointId", mountPointId);
            this.mountPointId = mountPointId;
            return this;
        }

        /**
         * UseAssumeRoleChkServerPerm.
         */
        public Builder useAssumeRoleChkServerPerm(Boolean useAssumeRoleChkServerPerm) {
            this.putQueryParameter("UseAssumeRoleChkServerPerm", useAssumeRoleChkServerPerm);
            this.useAssumeRoleChkServerPerm = useAssumeRoleChkServerPerm;
            return this;
        }

        /**
         * VscIds.
         */
        public Builder vscIds(java.util.List<String> vscIds) {
            String vscIdsShrink = shrink(vscIds, "VscIds", "json");
            this.putQueryParameter("VscIds", vscIdsShrink);
            this.vscIds = vscIds;
            return this;
        }

        /**
         * VscType.
         */
        public Builder vscType(String vscType) {
            this.putQueryParameter("VscType", vscType);
            this.vscType = vscType;
            return this;
        }

        @Override
        public AttachVscMountPointRequest build() {
            return new AttachVscMountPointRequest(this);
        } 

    } 

}
