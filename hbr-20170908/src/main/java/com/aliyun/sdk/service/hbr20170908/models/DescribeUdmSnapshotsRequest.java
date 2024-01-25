// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUdmSnapshotsRequest} extends {@link RequestModel}
 *
 * <p>DescribeUdmSnapshotsRequest</p>
 */
public class DescribeUdmSnapshotsRequest extends Request {
    @Query
    @NameInMap("DiskId")
    private String diskId;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private Long endTime;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("JobId")
    private String jobId;

    @Body
    @NameInMap("SnapshotIds")
    private java.util.Map < String, ? > snapshotIds;

    @Query
    @NameInMap("SourceType")
    @Validation(required = true)
    private String sourceType;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private Long startTime;

    @Query
    @NameInMap("UdmRegionId")
    @Validation(required = true)
    private String udmRegionId;

    private DescribeUdmSnapshotsRequest(Builder builder) {
        super(builder);
        this.diskId = builder.diskId;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.jobId = builder.jobId;
        this.snapshotIds = builder.snapshotIds;
        this.sourceType = builder.sourceType;
        this.startTime = builder.startTime;
        this.udmRegionId = builder.udmRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUdmSnapshotsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return diskId
     */
    public String getDiskId() {
        return this.diskId;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return snapshotIds
     */
    public java.util.Map < String, ? > getSnapshotIds() {
        return this.snapshotIds;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return udmRegionId
     */
    public String getUdmRegionId() {
        return this.udmRegionId;
    }

    public static final class Builder extends Request.Builder<DescribeUdmSnapshotsRequest, Builder> {
        private String diskId; 
        private Long endTime; 
        private String instanceId; 
        private String jobId; 
        private java.util.Map < String, ? > snapshotIds; 
        private String sourceType; 
        private Long startTime; 
        private String udmRegionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUdmSnapshotsRequest request) {
            super(request);
            this.diskId = request.diskId;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.jobId = request.jobId;
            this.snapshotIds = request.snapshotIds;
            this.sourceType = request.sourceType;
            this.startTime = request.startTime;
            this.udmRegionId = request.udmRegionId;
        } 

        /**
         * The ID of the disk.
         */
        public Builder diskId(String diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
            return this;
        }

        /**
         * The end of the time range to query. The value must be a UNIX timestamp. Unit: seconds.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The ID of the ECS instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the backup job.
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * The list of backup snapshots.
         */
        public Builder snapshotIds(java.util.Map < String, ? > snapshotIds) {
            String snapshotIdsShrink = shrink(snapshotIds, "SnapshotIds", "json");
            this.putBodyParameter("SnapshotIds", snapshotIdsShrink);
            this.snapshotIds = snapshotIds;
            return this;
        }

        /**
         * The type of the data source. Valid values:
         * <p>
         * 
         * *   **UDM_ECS**: ECS instance backup
         * *   **UDM_ECS_DISK**: disk backup subtask of ECS instance backup
         * *   **UDM_DISK**: disk backup
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * The beginning of the time range to query. The value must be a UNIX timestamp. Unit: seconds.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The ID of the region where the ECS instance resides.
         */
        public Builder udmRegionId(String udmRegionId) {
            this.putQueryParameter("UdmRegionId", udmRegionId);
            this.udmRegionId = udmRegionId;
            return this;
        }

        @Override
        public DescribeUdmSnapshotsRequest build() {
            return new DescribeUdmSnapshotsRequest(this);
        } 

    } 

}
