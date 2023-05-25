// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDiskSpecRequest} extends {@link RequestModel}
 *
 * <p>ModifyDiskSpecRequest</p>
 */
public class ModifyDiskSpecRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("DiskCategory")
    private String diskCategory;

    @Query
    @NameInMap("DiskId")
    @Validation(required = true)
    private String diskId;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PerformanceControlOptions")
    private PerformanceControlOptions performanceControlOptions;

    @Query
    @NameInMap("PerformanceLevel")
    private String performanceLevel;

    @Query
    @NameInMap("ProvisionedIops")
    private Long provisionedIops;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ModifyDiskSpecRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.diskCategory = builder.diskCategory;
        this.diskId = builder.diskId;
        this.dryRun = builder.dryRun;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.performanceControlOptions = builder.performanceControlOptions;
        this.performanceLevel = builder.performanceLevel;
        this.provisionedIops = builder.provisionedIops;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDiskSpecRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return diskCategory
     */
    public String getDiskCategory() {
        return this.diskCategory;
    }

    /**
     * @return diskId
     */
    public String getDiskId() {
        return this.diskId;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return performanceControlOptions
     */
    public PerformanceControlOptions getPerformanceControlOptions() {
        return this.performanceControlOptions;
    }

    /**
     * @return performanceLevel
     */
    public String getPerformanceLevel() {
        return this.performanceLevel;
    }

    /**
     * @return provisionedIops
     */
    public Long getProvisionedIops() {
        return this.provisionedIops;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<ModifyDiskSpecRequest, Builder> {
        private String sourceRegionId; 
        private String diskCategory; 
        private String diskId; 
        private Boolean dryRun; 
        private String ownerAccount; 
        private Long ownerId; 
        private PerformanceControlOptions performanceControlOptions; 
        private String performanceLevel; 
        private Long provisionedIops; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDiskSpecRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.diskCategory = request.diskCategory;
            this.diskId = request.diskId;
            this.dryRun = request.dryRun;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.performanceControlOptions = request.performanceControlOptions;
            this.performanceLevel = request.performanceLevel;
            this.provisionedIops = request.provisionedIops;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * The new category of the disk. Default value: PL1. Valid values:
         * <p>
         * 
         * *   cloud_essd: ESSD.
         * *   cloud_auto: ESSD AutoPL disk.
         * *   cloud_ssd: The system creates an SSD.
         * *   cloud_efficiency: The system creates an ultra disk.
         * 
         * This parameter is empty by default, which indicates that the disk category is not changed.
         * 
         * > The preceding values are listed in descending order of disk performance. The performance level of a subscription cloud disk cannot be downgraded.
         */
        public Builder diskCategory(String diskCategory) {
            this.putQueryParameter("DiskCategory", diskCategory);
            this.diskCategory = diskCategory;
            return this;
        }

        /**
         * The disk ID.
         */
        public Builder diskId(String diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
            return this;
        }

        /**
         * Specifies whether to perform only a dry run without performing the actual request. Default value: PL1. Valid values:
         * <p>
         * 
         * *   true: performs only a dry run. The system checks the required parameters, request syntax, service limits, and available ECS resources. If the request fails the dry run, the corresponding error message is returned. If the check succeeds, the `DryRunOperation` error code is returned.
         * *   false: The validity of the request is checked. If the check succeeds, a 2xx HTTP status code is returned and the request is made.
         * 
         * Default value: false
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * 磁盘性能控制参数集合
         */
        public Builder performanceControlOptions(PerformanceControlOptions performanceControlOptions) {
            this.putQueryParameter("PerformanceControlOptions", performanceControlOptions);
            this.performanceControlOptions = performanceControlOptions;
            return this;
        }

        /**
         * The new performance level of the ESSD. Default value: PL1. Valid values:
         * <p>
         * 
         * *   PL0: An ESSD can deliver up to 10,000 random read/write IOPS.
         * *   PL1: An ESSD can deliver up to 50,000 random read/write IOPS.
         * *   PL2: An ESSD can deliver up to 100,000 random read/write IOPS.
         * *   PL3: An ESSD delivers up to 1,000,000 random read/write IOPS.
         * 
         * Default value: PL1
         */
        public Builder performanceLevel(String performanceLevel) {
            this.putQueryParameter("PerformanceLevel", performanceLevel);
            this.performanceLevel = performanceLevel;
            return this;
        }

        /**
         * The provisioned read/write IOPS of the ESSD AutoPL disk. Valid values: 0 to min{50,000, 1,000 × Capacity - Baseline IOPS}
         * <p>
         * 
         * Baseline IOPS = min{1,800 + 50 × Capacity, 50,000}
         * 
         * > This parameter is available only if you set DiskCategory to cloud_auto. For more information, see [ESSD AutoPL disks](~~368372~~) and [Modify the performance configurations of an ESSD AutoPL disk](~~413275~~).
         */
        public Builder provisionedIops(Long provisionedIops) {
            this.putQueryParameter("ProvisionedIops", provisionedIops);
            this.provisionedIops = provisionedIops;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public ModifyDiskSpecRequest build() {
            return new ModifyDiskSpecRequest(this);
        } 

    } 

    public static class PerformanceControlOptions extends TeaModel {
        @NameInMap("IOPS")
        private Integer IOPS;

        @NameInMap("Recover")
        private String recover;

        @NameInMap("Throughput")
        private Integer throughput;

        private PerformanceControlOptions(Builder builder) {
            this.IOPS = builder.IOPS;
            this.recover = builder.recover;
            this.throughput = builder.throughput;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PerformanceControlOptions create() {
            return builder().build();
        }

        /**
         * @return IOPS
         */
        public Integer getIOPS() {
            return this.IOPS;
        }

        /**
         * @return recover
         */
        public String getRecover() {
            return this.recover;
        }

        /**
         * @return throughput
         */
        public Integer getThroughput() {
            return this.throughput;
        }

        public static final class Builder {
            private Integer IOPS; 
            private String recover; 
            private Integer throughput; 

            /**
             * 目标云盘IOPS。仅支持修改专属存储集群云盘IOPS。
             * <p>
             * 
             * 取值范围：900~单盘最大IOPS，步长100。
             * 
             * 
             * 更多信息，请参见[云盘性能](~~25382~~)。
             */
            public Builder IOPS(Integer IOPS) {
                this.IOPS = IOPS;
                return this;
            }

            /**
             * 重置云盘性能，仅支持专属存储集群云盘。
             * <p>
             * 
             * 设置该参数后，PerformanceControlOptions.IOPS和PerformanceControlOptions.Throughput参数不生效。
             * 
             * 
             * 目前仅支持设置为All（重置云盘IOPS和吞吐量到初始值）。
             */
            public Builder recover(String recover) {
                this.recover = recover;
                return this;
            }

            /**
             * 目标云盘吞吐量，仅支持修改专属存储集群云盘吞吐量，单位MB/s。
             * <p>
             * 
             * 取值范围：60~单盘最大吞吐量。
             * 
             * 更多信息，请参见[云盘性能](~~25382~~)。
             */
            public Builder throughput(Integer throughput) {
                this.throughput = throughput;
                return this;
            }

            public PerformanceControlOptions build() {
                return new PerformanceControlOptions(this);
            } 

        } 

    }
}
