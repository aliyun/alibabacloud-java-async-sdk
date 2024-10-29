// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateImageRequest} extends {@link RequestModel}
 *
 * <p>CreateImageRequest</p>
 */
public class CreateImageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoCleanUserdata")
    private Boolean autoCleanUserdata;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopId")
    private String desktopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskType")
    private String diskType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageName")
    private String imageName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageResourceType")
    private String imageResourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotId")
    private String snapshotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotIds")
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
         * <p>Specifies whether to clear private data of users. If you set AutoCleanUserdata to <code>true</code>, the custom image clears the data directories, excluding the <code>Administrator</code> and <code>Public</code> directories, in the <code>C:\Users</code> directory.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoCleanUserdata(Boolean autoCleanUserdata) {
            this.putQueryParameter("AutoCleanUserdata", autoCleanUserdata);
            this.autoCleanUserdata = autoCleanUserdata;
            return this;
        }

        /**
         * <p>The description of the custom image. The description must be 2 to 256 characters in length. It cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>This is description.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the cloud computer.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-7w78ozhjcwa3u****</p>
         */
        public Builder desktopId(String desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * <p>The disk data that is contained in the custom image.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>SYSTEM: only contain data from system disks.</li>
         * <li>ALL: contain data from system disks and user disks. [default]</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        public Builder diskType(String diskType) {
            this.putQueryParameter("DiskType", diskType);
            this.diskType = diskType;
            return this;
        }

        /**
         * <p>The name of the image. The name must be 2 to 128 characters in length. The name must start with a letter but cannot start with <code>http://</code> or <code>https://</code>. The name can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>testImageName</p>
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * <p>This parameter is not publicly available.</p>
         * 
         * <strong>example:</strong>
         * <p>To be hidden.</p>
         */
        public Builder imageResourceType(String imageResourceType) {
            this.putQueryParameter("ImageResourceType", imageResourceType);
            this.imageResourceType = imageResourceType;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
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

        /**
         * <p>The ID of the snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>s-2zefuwk8l6ytcgd3bf4o</p>
         */
        public Builder snapshotId(String snapshotId) {
            this.putQueryParameter("SnapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        /**
         * <p>The IDs of the snapshots.</p>
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
