// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetDisksRequest} extends {@link RequestModel}
 *
 * <p>ResetDisksRequest</p>
 */
public class ResetDisksRequest extends Request {
    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("Disk")
    private java.util.List < Disk> disk;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    private ResetDisksRequest(Builder builder) {
        super(builder);
        this.resourceOwnerId = builder.resourceOwnerId;
        this.disk = builder.disk;
        this.regionId = builder.regionId;
        this.dryRun = builder.dryRun;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetDisksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return disk
     */
    public java.util.List < Disk> getDisk() {
        return this.disk;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static final class Builder extends Request.Builder<ResetDisksRequest, Builder> {
        private Long resourceOwnerId; 
        private java.util.List < Disk> disk; 
        private String regionId; 
        private Boolean dryRun; 

        private Builder() {
            super();
        } 

        private Builder(ResetDisksRequest response) {
            super(response);
            this.resourceOwnerId = response.resourceOwnerId;
            this.disk = response.disk;
            this.regionId = response.regionId;
            this.dryRun = response.dryRun;
        } 

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * Disk.
         */
        public Builder disk(java.util.List < Disk> disk) {
            this.putQueryParameter("Disk", disk);
            this.disk = disk;
            return this;
        }

        /**
         * The ID of the region. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Specifies whether to PreCheck the request. Valid values:
         * <p>
         * 
         * -true: sends a check request and does not roll back the disk. Check items include required parameters, request format, and resource status restrictions. If the check fails, the corresponding error message is returned. If the check succeeds, the error code "DryRunOperation" is returned ".
         * -false: a normal request is sent and the disk rollback operation is initiated after the check.
         * 
         * Default value: false
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        @Override
        public ResetDisksRequest build() {
            return new ResetDisksRequest(this);
        } 

    } 

    public static class Disk extends TeaModel {
        @NameInMap("SnapshotId")
        private String snapshotId;

        @NameInMap("DiskId")
        private String diskId;

        private Disk(Builder builder) {
            this.snapshotId = builder.snapshotId;
            this.diskId = builder.diskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Disk create() {
            return builder().build();
        }

        /**
         * @return snapshotId
         */
        public String getSnapshotId() {
            return this.snapshotId;
        }

        /**
         * @return diskId
         */
        public String getDiskId() {
            return this.diskId;
        }

        public static final class Builder {
            private String snapshotId; 
            private String diskId; 

            /**
             * 实例快照中，指定云盘对应的快照ID。N的取值范围：1~10
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * 指定待回滚的云盘ID。N的取值范围：1~10
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            public Disk build() {
                return new Disk(this);
            } 

        } 

    }
}
