// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateImageRequest} extends {@link RequestModel}
 *
 * <p>CreateImageRequest</p>
 */
public class CreateImageRequest extends Request {
    @Query
    @NameInMap("AutoCleanUserdata")
    private Boolean autoCleanUserdata;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("DesktopId")
    private String desktopId;

    @Query
    @NameInMap("DiskType")
    private String diskType;

    @Query
    @NameInMap("ImageName")
    private String imageName;

    @Query
    @NameInMap("ImageResourceType")
    private String imageResourceType;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SnapshotId")
    private String snapshotId;

    @Query
    @NameInMap("SnapshotIds")
    private java.util.List < String > snapshotIds;

    private CreateImageRequest(Builder builder) {
        super(builder);
        this.autoCleanUserdata = builder.autoCleanUserdata;
        this.description = builder.description;
        this.desktopId = builder.desktopId;
        this.diskType = builder.diskType;
        this.imageName = builder.imageName;
        this.imageResourceType = builder.imageResourceType;
        this.regionId = builder.regionId;
        this.snapshotId = builder.snapshotId;
        this.snapshotIds = builder.snapshotIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateImageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoCleanUserdata
     */
    public Boolean getAutoCleanUserdata() {
        return this.autoCleanUserdata;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return desktopId
     */
    public String getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return diskType
     */
    public String getDiskType() {
        return this.diskType;
    }

    /**
     * @return imageName
     */
    public String getImageName() {
        return this.imageName;
    }

    /**
     * @return imageResourceType
     */
    public String getImageResourceType() {
        return this.imageResourceType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return snapshotId
     */
    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * @return snapshotIds
     */
    public java.util.List < String > getSnapshotIds() {
        return this.snapshotIds;
    }

    public static final class Builder extends Request.Builder<CreateImageRequest, Builder> {
        private Boolean autoCleanUserdata; 
        private String description; 
        private String desktopId; 
        private String diskType; 
        private String imageName; 
        private String imageResourceType; 
        private String regionId; 
        private String snapshotId; 
        private java.util.List < String > snapshotIds; 

        private Builder() {
            super();
        } 

        private Builder(CreateImageRequest request) {
            super(request);
            this.autoCleanUserdata = request.autoCleanUserdata;
            this.description = request.description;
            this.desktopId = request.desktopId;
            this.diskType = request.diskType;
            this.imageName = request.imageName;
            this.imageResourceType = request.imageResourceType;
            this.regionId = request.regionId;
            this.snapshotId = request.snapshotId;
            this.snapshotIds = request.snapshotIds;
        } 

        /**
         * Specifies whether to clear private data of users. If you set AutoCleanUserdata to `true`, the custom image clears the data directories, excluding the `Administrator` and `Public` directories, in the `C:\Users` directory.
         */
        public Builder autoCleanUserdata(Boolean autoCleanUserdata) {
            this.putQueryParameter("AutoCleanUserdata", autoCleanUserdata);
            this.autoCleanUserdata = autoCleanUserdata;
            return this;
        }

        /**
         * The description of the custom image. The description must be 2 to 256 characters in length. It cannot start with `http://` or `https://`.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The ID of the cloud computer.
         */
        public Builder desktopId(String desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * The disk data that is contained in the custom image.
         * <p>
         * 
         * Valid values:
         * 
         * - SYSTEM: only contain data from system disks.
         * - ALL: contain data from system disks and user disks. [default]
         */
        public Builder diskType(String diskType) {
            this.putQueryParameter("DiskType", diskType);
            this.diskType = diskType;
            return this;
        }

        /**
         * The name of the image. The name must be 2 to 128 characters in length. The name must start with a letter but cannot start with `http://` or `https://`. The name can contain letters, digits, colons (:), underscores (\_), and hyphens (-).
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * This parameter is not publicly available.
         */
        public Builder imageResourceType(String imageResourceType) {
            this.putQueryParameter("ImageResourceType", imageResourceType);
            this.imageResourceType = imageResourceType;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the snapshot.
         */
        public Builder snapshotId(String snapshotId) {
            this.putQueryParameter("SnapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        /**
         * The IDs of the snapshots.
         */
        public Builder snapshotIds(java.util.List < String > snapshotIds) {
            this.putQueryParameter("SnapshotIds", snapshotIds);
            this.snapshotIds = snapshotIds;
            return this;
        }

        @Override
        public CreateImageRequest build() {
            return new CreateImageRequest(this);
        } 

    } 

}
