// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDiskSpecRequest} extends {@link RequestModel}
 *
 * <p>ModifyDiskSpecRequest</p>
 */
public class ModifyDiskSpecRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskCategory")
    private String diskCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String diskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PerformanceControlOptions")
    private PerformanceControlOptions performanceControlOptions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PerformanceLevel")
    private String performanceLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProvisionedIops")
    private Long provisionedIops;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
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
         * The new category of the disk. Valid values:
         * <p>
         * 
         * *   cloud_essd: enhanced SSD (ESSD)
         * *   cloud_auto: ESSD AutoPL disk
         * *   cloud_ssd: standard SSD
         * *   cloud_efficiency: ultra disk
         * 
         * This parameter is empty by default, which indicates that the disk category is not changed.
         * 
         * > 
         * 
         * *   The preceding values are listed in descending order of disk performance. Subscription disks cannot be downgraded.
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
         * Specifies whether to perform only a dry run, without performing the actual request. Valid values:
         * <p>
         * 
         * *   true: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, service limits, and insufficient ECS resources. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.
         * *   false: performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.
         * 
         * Default value: false.
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
         * The disk performance specifications.
         */
        public Builder performanceControlOptions(PerformanceControlOptions performanceControlOptions) {
            this.putQueryParameter("PerformanceControlOptions", performanceControlOptions);
            this.performanceControlOptions = performanceControlOptions;
            return this;
        }

        /**
         * The new performance level of the ESSD. Valid values:
         * <p>
         * 
         * *   PL0: An ESSD can deliver up to 10,000 random read/write IOPS.
         * *   PL1: An ESSD can deliver up to 50,000 random read/write IOPS.
         * *   PL2: An ESSD can deliver up to 100,000 random read/write IOPS.
         * *   PL3: An ESSD delivers up to 1,000,000 random read/write IOPS.
         * 
         * Default value: PL1.
         */
        public Builder performanceLevel(String performanceLevel) {
            this.putQueryParameter("PerformanceLevel", performanceLevel);
            this.performanceLevel = performanceLevel;
            return this;
        }

        /**
         * The provisioned read/write IOPS of the ESSD AutoPL disk. Valid values: 0 to min{50,000, 1,000 × Capacity - Baseline IOPS}.
         * <p>
         * 
         * Baseline IOPS = min{1,800 + 50 × Capacity, 50,000}.
         * 
         * >  This parameter is available only if you set DiskCategory to cloud_auto. For more information, see [ESSD AutoPL disks](~~368372~~) and [Modify the performance configurations of an ESSD AutoPL disk](~~413275~~).
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
        @com.aliyun.core.annotation.NameInMap("IOPS")
        private Integer IOPS;

        @com.aliyun.core.annotation.NameInMap("Recover")
        private String recover;

        @com.aliyun.core.annotation.NameInMap("Throughput")
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
             * The new IOPS rate of the disk. You can modify the IOPS rate of only disks in dedicated block storage clusters.
             * <p>
             * 
             * Valid values: 900 to maximum IOPS per disk (with an increment of 100).
             * 
             * For more information, see [Block storage performance](~~25382~~).
             */
            public Builder IOPS(Integer IOPS) {
                this.IOPS = IOPS;
                return this;
            }

            /**
             * Specifies whether to reset the IOPS rate and throughput of the disk. This parameter takes effect only when the disk belongs to a dedicated block storage cluster.
             * <p>
             * 
             * After you specify this parameter, PerformanceControlOptions.IOPS and PerformanceControlOptions.Throughput do not take effect.
             * 
             * Set the value to All, which indicates that the IOPS rate and throughput of the disk are reset to the initial values.
             */
            public Builder recover(String recover) {
                this.recover = recover;
                return this;
            }

            /**
             * The new throughput of the disk. You can modify the throughput of only disks in dedicated block storage clusters. Unit: MB/s.
             * <p>
             * 
             * Valid values: 60 to maximum throughput per disk.
             * 
             * For more information, see [Block storage performance](~~25382~~).
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
