// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link ModifyDiskSpecRequest} extends {@link RequestModel}
 *
 * <p>ModifyDiskSpecRequest</p>
 */
public class ModifyDiskSpecRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationZoneId")
    private String destinationZoneId;

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
        this.destinationZoneId = builder.destinationZoneId;
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
     * @return destinationZoneId
     */
    public String getDestinationZoneId() {
        return this.destinationZoneId;
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
        private String destinationZoneId; 
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
            this.destinationZoneId = request.destinationZoneId;
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
         * <blockquote>
         * <p>This parameter is in invitational preview and is not available for use.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-g</p>
         */
        public Builder destinationZoneId(String destinationZoneId) {
            this.putQueryParameter("DestinationZoneId", destinationZoneId);
            this.destinationZoneId = destinationZoneId;
            return this;
        }

        /**
         * <p>The new type of the disk. Valid values:</p>
         * <ul>
         * <li><p>cloud_essd: enterprise SSD (ESSD).</p>
         * </li>
         * <li><p>cloud_auto: ESSD AutoPL disk.</p>
         * </li>
         * <li><p>cloud_ssd: standard SSD.
         * &lt;props=&quot;china&quot;&gt;</p>
         * </li>
         * <li><p>cloud_essd_entry: ESSD Entry disk.</p>
         * </li>
         * <li><p>cloud_efficiency: ultra disk.</p>
         * </li>
         * </ul>
         * <p>Default value: empty, which indicates that the disk type is not changed.</p>
         * <blockquote>
         * <ul>
         * <li>The valid values above are listed in descending order of disk performance. If the specified disk is a subscription disk, you cannot downgrade the disk type.</li>
         * </ul>
         * </blockquote>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li>ESSD Entry disks can be changed only to enterprise SSDs (ESSDs) or ESSD AutoPL disks. For more information, see <a href="https://help.aliyun.com/document_detail/161980.html">Change the disk type</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        public Builder diskCategory(String diskCategory) {
            this.putQueryParameter("DiskCategory", diskCategory);
            this.diskCategory = diskCategory;
            return this;
        }

        /**
         * <p>The ID of the disk.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d-bp131n0q38u3a4zi****</p>
         */
        public Builder diskId(String diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run. Valid values:</p>
         * <ul>
         * <li><p>true: performs only a dry run. The system checks whether your AccessKey pair is valid, whether RAM users are granted permissions, and whether the required parameters are specified. If the check fails, the corresponding error is returned. If the check succeeds, the DryRunOperation error code is returned.</p>
         * </li>
         * <li><p>false: performs a dry run and performs the actual request. If the check succeeds, a 2XX HTTP status code is returned and the disk type or ESSD performance level is changed.</p>
         * </li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
         * <p>The disk performance control parameters.</p>
         */
        public Builder performanceControlOptions(PerformanceControlOptions performanceControlOptions) {
            this.putQueryParameter("PerformanceControlOptions", performanceControlOptions);
            this.performanceControlOptions = performanceControlOptions;
            return this;
        }

        /**
         * <p>The new performance level (PL) of an ESSD. Valid values:</p>
         * <ul>
         * <li>PL0: A single disk can deliver up to 10,000 random read/write IOPS.</li>
         * <li>PL1: A single disk can deliver up to 50,000 random read/write IOPS.</li>
         * <li>PL2: A single disk can deliver up to 100,000 random read/write IOPS.</li>
         * <li>PL3: A single disk can deliver up to 1,000,000 random read/write IOPS.</li>
         * </ul>
         * <p>Default value: PL1.</p>
         * 
         * <strong>example:</strong>
         * <p>PL2</p>
         */
        public Builder performanceLevel(String performanceLevel) {
            this.putQueryParameter("PerformanceLevel", performanceLevel);
            this.performanceLevel = performanceLevel;
            return this;
        }

        /**
         * <p>Specifies whether to modify the provisioned read/write IOPS of an ESSD AutoPL disk.</p>
         * <p>Valid values: 0 to min{50000, 1000 × Capacity - Baseline performance}.</p>
         * <p>Baseline performance = min{1,800 + 50 × Capacity, 50,000}.</p>
         * <blockquote>
         * <p>This parameter is supported only when DiskCategory is set to cloud_auto. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a> and <a href="https://help.aliyun.com/document_detail/413275.html">Modify the provisioned performance of an ESSD AutoPL disk</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>50000</p>
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

    /**
     * 
     * {@link ModifyDiskSpecRequest} extends {@link TeaModel}
     *
     * <p>ModifyDiskSpecRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(PerformanceControlOptions model) {
                this.IOPS = model.IOPS;
                this.recover = model.recover;
                this.throughput = model.throughput;
            } 

            /**
             * <p>The target IOPS of the disk. Only the IOPS of disks in a dedicated storage cluster can be modified.</p>
             * <p>Valid values: 900 to the maximum IOPS per disk, in increments of 100.</p>
             * <p>For more information, see <a href="https://help.aliyun.com/document_detail/25382.html">Disk performance</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder IOPS(Integer IOPS) {
                this.IOPS = IOPS;
                return this;
            }

            /**
             * <p>Resets the disk performance. Only disks in a dedicated storage cluster are supported.</p>
             * <p>If this parameter is set, the PerformanceControlOptions.IOPS and PerformanceControlOptions.Throughput parameters do not take effect.</p>
             * <p>Currently, only the value All is supported, which resets the disk IOPS and throughput to their initial values.</p>
             * 
             * <strong>example:</strong>
             * <p>All</p>
             */
            public Builder recover(String recover) {
                this.recover = recover;
                return this;
            }

            /**
             * <p>The target throughput of the disk. Only the throughput of disks in a dedicated storage cluster can be modified. Unit: MB/s.</p>
             * <p>Valid values: 60 to the maximum throughput per disk.</p>
             * <p>For more information, see <a href="https://help.aliyun.com/document_detail/25382.html">Disk performance</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
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
