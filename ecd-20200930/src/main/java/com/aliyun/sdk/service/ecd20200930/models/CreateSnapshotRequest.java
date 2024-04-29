// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSnapshotRequest} extends {@link RequestModel}
 *
 * <p>CreateSnapshotRequest</p>
 */
public class CreateSnapshotRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String desktopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 2)
    private String snapshotName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceDiskType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceDiskType;

    private CreateSnapshotRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.desktopId = builder.desktopId;
        this.regionId = builder.regionId;
        this.snapshotName = builder.snapshotName;
        this.sourceDiskType = builder.sourceDiskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSnapshotRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return snapshotName
     */
    public String getSnapshotName() {
        return this.snapshotName;
    }

    /**
     * @return sourceDiskType
     */
    public String getSourceDiskType() {
        return this.sourceDiskType;
    }

    public static final class Builder extends Request.Builder<CreateSnapshotRequest, Builder> {
        private String description; 
        private String desktopId; 
        private String regionId; 
        private String snapshotName; 
        private String sourceDiskType; 

        private Builder() {
            super();
        } 

        private Builder(CreateSnapshotRequest request) {
            super(request);
            this.description = request.description;
            this.desktopId = request.desktopId;
            this.regionId = request.regionId;
            this.snapshotName = request.snapshotName;
            this.sourceDiskType = request.sourceDiskType;
        } 

        /**
         * The description of the snapshot. The description can be up to 128 characters in length.
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
         * The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The name of the snapshot. The name must be 2 to 127 characters in length. The name must start with a letter. The name can contain letters, digits, underscores (\_), and hyphens (-). The name cannot start with `auto` because snapshots whose names start with auto are recognized as automatic snapshots.
         */
        public Builder snapshotName(String snapshotName) {
            this.putQueryParameter("SnapshotName", snapshotName);
            this.snapshotName = snapshotName;
            return this;
        }

        /**
         * The type of the disk for which you want to create a snapshot.
         * <p>
         * 
         * Valid values:
         * 
         * *   system: system disk
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   data: data disk
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder sourceDiskType(String sourceDiskType) {
            this.putQueryParameter("SourceDiskType", sourceDiskType);
            this.sourceDiskType = sourceDiskType;
            return this;
        }

        @Override
        public CreateSnapshotRequest build() {
            return new CreateSnapshotRequest(this);
        } 

    } 

}
