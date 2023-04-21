// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSnapshotsRequest} extends {@link RequestModel}
 *
 * <p>DescribeSnapshotsRequest</p>
 */
public class DescribeSnapshotsRequest extends Request {
    @Query
    @NameInMap("Creator")
    private String creator;

    @Query
    @NameInMap("DesktopId")
    private String desktopId;

    @Query
    @NameInMap("DesktopName")
    private String desktopName;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 100)
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SnapshotId")
    private String snapshotId;

    @Query
    @NameInMap("SnapshotName")
    private String snapshotName;

    @Query
    @NameInMap("SnapshotType")
    private String snapshotType;

    @Query
    @NameInMap("SourceDiskType")
    private String sourceDiskType;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    private DescribeSnapshotsRequest(Builder builder) {
        super(builder);
        this.creator = builder.creator;
        this.desktopId = builder.desktopId;
        this.desktopName = builder.desktopName;
        this.endTime = builder.endTime;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.snapshotId = builder.snapshotId;
        this.snapshotName = builder.snapshotName;
        this.snapshotType = builder.snapshotType;
        this.sourceDiskType = builder.sourceDiskType;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSnapshotsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return desktopId
     */
    public String getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return desktopName
     */
    public String getDesktopName() {
        return this.desktopName;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
     * @return snapshotName
     */
    public String getSnapshotName() {
        return this.snapshotName;
    }

    /**
     * @return snapshotType
     */
    public String getSnapshotType() {
        return this.snapshotType;
    }

    /**
     * @return sourceDiskType
     */
    public String getSourceDiskType() {
        return this.sourceDiskType;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeSnapshotsRequest, Builder> {
        private String creator; 
        private String desktopId; 
        private String desktopName; 
        private String endTime; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private String snapshotId; 
        private String snapshotName; 
        private String snapshotType; 
        private String sourceDiskType; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSnapshotsRequest request) {
            super(request);
            this.creator = request.creator;
            this.desktopId = request.desktopId;
            this.desktopName = request.desktopName;
            this.endTime = request.endTime;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.snapshotId = request.snapshotId;
            this.snapshotName = request.snapshotName;
            this.snapshotType = request.snapshotType;
            this.sourceDiskType = request.sourceDiskType;
            this.startTime = request.startTime;
        } 

        /**
         * Creator.
         */
        public Builder creator(String creator) {
            this.putQueryParameter("Creator", creator);
            this.creator = creator;
            return this;
        }

        /**
         * The ID of the cloud desktop.
         */
        public Builder desktopId(String desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * The name of the cloud desktop.
         */
        public Builder desktopName(String desktopName) {
            this.putQueryParameter("DesktopName", desktopName);
            this.desktopName = desktopName;
            return this;
        }

        /**
         * The time when you want to stop creating the snapshot. Specify the time in the [ISO 8601](~~25696~~) standard in the yyyy-mm-ddthh:mm:ssz format. The time must be in UTC.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The maximum number of entries to return on each page.
         * <p>
         * 
         * *   Maximum value: 100
         * *   Default value: 10
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that determines the start point of the query. Set the value to the value of NextToken that is returned from the last call.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the region. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
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
         * The name of the snapshot. The name must be 2 to 128 characters in length. It can contain letters, digits, colons (:), underscores (\_), and hyphens (-). It must start with a letter and cannot start with `http://` or `https://`.
         * <p>
         * 
         * It cannot start with `auto` because snapshots whose names start with auto are recognized as automatic snapshots.
         */
        public Builder snapshotName(String snapshotName) {
            this.putQueryParameter("SnapshotName", snapshotName);
            this.snapshotName = snapshotName;
            return this;
        }

        /**
         * The type of the snapshot. Default value: all.
         * <p>
         * 
         * Valid values:
         * 
         * *   auto: auto snapshot
         * *   user: manual snapshot
         * *   all: all types of snapshots
         */
        public Builder snapshotType(String snapshotType) {
            this.putQueryParameter("SnapshotType", snapshotType);
            this.snapshotType = snapshotType;
            return this;
        }

        /**
         * The type of the source disk for which you want to create the snapshot. Valid values:
         * <p>
         * 
         * *   System: system disk
         * *   Data: data disk
         * 
         * > The value of this parameter is not case-sensitive.
         */
        public Builder sourceDiskType(String sourceDiskType) {
            this.putQueryParameter("SourceDiskType", sourceDiskType);
            this.sourceDiskType = sourceDiskType;
            return this;
        }

        /**
         * The time when you want to create the snapshot. Specify the time in the [ISO 8601](~~25696~~) standard in the yyyy-mm-ddthh:mm:ssz format. The time must be in UTC.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeSnapshotsRequest build() {
            return new DescribeSnapshotsRequest(this);
        } 

    } 

}
