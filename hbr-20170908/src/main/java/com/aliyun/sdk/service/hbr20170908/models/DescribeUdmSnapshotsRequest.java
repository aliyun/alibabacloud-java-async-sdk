// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeUdmSnapshotsRequest} extends {@link RequestModel}
 *
 * <p>DescribeUdmSnapshotsRequest</p>
 */
public class DescribeUdmSnapshotsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskId")
    private String diskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SnapshotIds")
    private java.util.Map < String, ? > snapshotIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UdmRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the disk.</p>
         * 
         * <strong>example:</strong>
         * <p>d-bp1560750pclffpzxy70</p>
         */
        public Builder diskId(String diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
            return this;
        }

        /**
         * <p>The end of the time range to query. The value must be a UNIX timestamp. Unit: seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1643092168</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ID of the ECS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp18x2k7sw925ir7ofh8</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the backup job.</p>
         * 
         * <strong>example:</strong>
         * <p>job-*********************</p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The list of backup snapshots.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;s-000e3vhhu62xsm6v92r0&quot;]</p>
         */
        public Builder snapshotIds(java.util.Map < String, ? > snapshotIds) {
            String snapshotIdsShrink = shrink(snapshotIds, "SnapshotIds", "json");
            this.putBodyParameter("SnapshotIds", snapshotIdsShrink);
            this.snapshotIds = snapshotIds;
            return this;
        }

        /**
         * <p>The type of the data source. Valid values:</p>
         * <ul>
         * <li><strong>UDM_ECS</strong>: ECS instance backup</li>
         * <li><strong>UDM_ECS_DISK</strong>: disk backup subtask of ECS instance backup</li>
         * <li><strong>UDM_DISK</strong>: disk backup</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>UDM_ECS</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. The value must be a UNIX timestamp. Unit: seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1642057551</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The ID of the region where the ECS instance resides.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
