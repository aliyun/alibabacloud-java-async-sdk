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
    @Validation(required = true)
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
         * AutoCleanUserdata.
         */
        public Builder autoCleanUserdata(Boolean autoCleanUserdata) {
            this.putQueryParameter("AutoCleanUserdata", autoCleanUserdata);
            this.autoCleanUserdata = autoCleanUserdata;
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
         * DesktopId.
         */
        public Builder desktopId(String desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * DiskType.
         */
        public Builder diskType(String diskType) {
            this.putQueryParameter("DiskType", diskType);
            this.diskType = diskType;
            return this;
        }

        /**
         * ImageName.
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * ImageResourceType.
         */
        public Builder imageResourceType(String imageResourceType) {
            this.putQueryParameter("ImageResourceType", imageResourceType);
            this.imageResourceType = imageResourceType;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SnapshotId.
         */
        public Builder snapshotId(String snapshotId) {
            this.putQueryParameter("SnapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        /**
         * SnapshotIds.
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
