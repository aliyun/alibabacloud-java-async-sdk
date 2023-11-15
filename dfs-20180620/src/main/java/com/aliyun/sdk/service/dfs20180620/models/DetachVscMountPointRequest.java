// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dfs20180620.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachVscMountPointRequest} extends {@link RequestModel}
 *
 * <p>DetachVscMountPointRequest</p>
 */
public class DetachVscMountPointRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("FileSystemId")
    @Validation(required = true)
    private String fileSystemId;

    @Query
    @NameInMap("InputRegionId")
    @Validation(required = true)
    private String inputRegionId;

    @Query
    @NameInMap("InstanceIds")
    private java.util.Map < String, ? > instanceIds;

    @Query
    @NameInMap("MountPointId")
    @Validation(required = true)
    private String mountPointId;

    @Query
    @NameInMap("VscIds")
    private java.util.List < String > vscIds;

    private DetachVscMountPointRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.fileSystemId = builder.fileSystemId;
        this.inputRegionId = builder.inputRegionId;
        this.instanceIds = builder.instanceIds;
        this.mountPointId = builder.mountPointId;
        this.vscIds = builder.vscIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachVscMountPointRequest create() {
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
    public java.util.Map < String, ? > getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return mountPointId
     */
    public String getMountPointId() {
        return this.mountPointId;
    }

    /**
     * @return vscIds
     */
    public java.util.List < String > getVscIds() {
        return this.vscIds;
    }

    public static final class Builder extends Request.Builder<DetachVscMountPointRequest, Builder> {
        private String regionId; 
        private String description; 
        private String fileSystemId; 
        private String inputRegionId; 
        private java.util.Map < String, ? > instanceIds; 
        private String mountPointId; 
        private java.util.List < String > vscIds; 

        private Builder() {
            super();
        } 

        private Builder(DetachVscMountPointRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
            this.fileSystemId = request.fileSystemId;
            this.inputRegionId = request.inputRegionId;
            this.instanceIds = request.instanceIds;
            this.mountPointId = request.mountPointId;
            this.vscIds = request.vscIds;
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
         * FileSystemId.
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * InputRegionId.
         */
        public Builder inputRegionId(String inputRegionId) {
            this.putQueryParameter("InputRegionId", inputRegionId);
            this.inputRegionId = inputRegionId;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(java.util.Map < String, ? > instanceIds) {
            String instanceIdsShrink = shrink(instanceIds, "InstanceIds", "json");
            this.putQueryParameter("InstanceIds", instanceIdsShrink);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * MountPointId.
         */
        public Builder mountPointId(String mountPointId) {
            this.putQueryParameter("MountPointId", mountPointId);
            this.mountPointId = mountPointId;
            return this;
        }

        /**
         * VscIds.
         */
        public Builder vscIds(java.util.List < String > vscIds) {
            String vscIdsShrink = shrink(vscIds, "VscIds", "json");
            this.putQueryParameter("VscIds", vscIdsShrink);
            this.vscIds = vscIds;
            return this;
        }

        @Override
        public DetachVscMountPointRequest build() {
            return new DetachVscMountPointRequest(this);
        } 

    } 

}
