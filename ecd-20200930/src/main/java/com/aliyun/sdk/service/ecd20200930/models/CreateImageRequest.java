// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link CreateImageRequest} extends {@link RequestModel}
 *
 * <p>CreateImageRequest</p>
 */
public class CreateImageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoCleanUserdata")
    private Boolean autoCleanUserdata;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSnapshotIds")
    private java.util.List<String> dataSnapshotIds;

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
    private java.util.List<String> snapshotIds;

    private CreateImageRequest(Builder builder) {
        super(builder);
        this.autoCleanUserdata = builder.autoCleanUserdata;
        this.dataSnapshotIds = builder.dataSnapshotIds;
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
     * @return dataSnapshotIds
     */
    public java.util.List<String> getDataSnapshotIds() {
        return this.dataSnapshotIds;
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
    public java.util.List<String> getSnapshotIds() {
        return this.snapshotIds;
    }

    public static final class Builder extends Request.Builder<CreateImageRequest, Builder> {
        private Boolean autoCleanUserdata; 
        private java.util.List<String> dataSnapshotIds; 
        private String description; 
        private String desktopId; 
        private String diskType; 
        private String imageName; 
        private String imageResourceType; 
        private String regionId; 
        private String snapshotId; 
        private java.util.List<String> snapshotIds; 

        private Builder() {
            super();
        } 

        private Builder(CreateImageRequest request) {
            super(request);
            this.autoCleanUserdata = request.autoCleanUserdata;
            this.dataSnapshotIds = request.dataSnapshotIds;
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
         * <p>Specifies whether to clear personal user data. If this parameter is set to <code>true</code>, the created image clears data in all directories under <code>C:\\Users</code> except the <code>Administrator</code> and <code>Public</code> directories.</p>
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
         * <p>The list of data cloud disk snapshot IDs. To include data cloud disks when creating an image, specify the corresponding data cloud disk snapshot IDs. A maximum of 100 IDs are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;s-bp67acfmxazb4ph****&quot;, &quot;s-bp67acfmxazb5qh****&quot;]</p>
         */
        public Builder dataSnapshotIds(java.util.List<String> dataSnapshotIds) {
            this.putQueryParameter("DataSnapshotIds", dataSnapshotIds);
            this.dataSnapshotIds = dataSnapshotIds;
            return this;
        }

        /**
         * <p>The description of the image. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
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
         * <p>The cloud computer ID.</p>
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
         * <p>The disk data included in the image.</p>
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
         * <p>The image name. The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (_), and hyphens (-). The name must start with a letter or a Chinese character and cannot start with <code>http://</code> or <code>https://</code>.</p>
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
         * <p>deprecated</p>
         */
        public Builder imageResourceType(String imageResourceType) {
            this.putQueryParameter("ImageResourceType", imageResourceType);
            this.imageResourceType = imageResourceType;
            return this;
        }

        /**
         * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to query the regions supported by WUYING Workspace.</p>
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
         * <p>The snapshot ID.</p>
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
         * <p>The list of snapshot IDs.</p>
         */
        public Builder snapshotIds(java.util.List<String> snapshotIds) {
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
