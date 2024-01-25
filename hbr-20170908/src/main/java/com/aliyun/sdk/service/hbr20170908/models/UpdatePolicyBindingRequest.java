// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePolicyBindingRequest} extends {@link RequestModel}
 *
 * <p>UpdatePolicyBindingRequest</p>
 */
public class UpdatePolicyBindingRequest extends Request {
    @Query
    @NameInMap("AdvancedOptions")
    private AdvancedOptions advancedOptions;

    @Body
    @NameInMap("DataSourceId")
    @Validation(required = true)
    private String dataSourceId;

    @Query
    @NameInMap("Disabled")
    private Boolean disabled;

    @Query
    @NameInMap("PolicyBindingDescription")
    private String policyBindingDescription;

    @Body
    @NameInMap("PolicyId")
    @Validation(required = true)
    private String policyId;

    @Query
    @NameInMap("SourceType")
    @Validation(required = true)
    private String sourceType;

    private UpdatePolicyBindingRequest(Builder builder) {
        super(builder);
        this.advancedOptions = builder.advancedOptions;
        this.dataSourceId = builder.dataSourceId;
        this.disabled = builder.disabled;
        this.policyBindingDescription = builder.policyBindingDescription;
        this.policyId = builder.policyId;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePolicyBindingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return advancedOptions
     */
    public AdvancedOptions getAdvancedOptions() {
        return this.advancedOptions;
    }

    /**
     * @return dataSourceId
     */
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * @return disabled
     */
    public Boolean getDisabled() {
        return this.disabled;
    }

    /**
     * @return policyBindingDescription
     */
    public String getPolicyBindingDescription() {
        return this.policyBindingDescription;
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    public static final class Builder extends Request.Builder<UpdatePolicyBindingRequest, Builder> {
        private AdvancedOptions advancedOptions; 
        private String dataSourceId; 
        private Boolean disabled; 
        private String policyBindingDescription; 
        private String policyId; 
        private String sourceType; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePolicyBindingRequest request) {
            super(request);
            this.advancedOptions = request.advancedOptions;
            this.dataSourceId = request.dataSourceId;
            this.disabled = request.disabled;
            this.policyBindingDescription = request.policyBindingDescription;
            this.policyId = request.policyId;
            this.sourceType = request.sourceType;
        } 

        /**
         * The advanced options.
         */
        public Builder advancedOptions(AdvancedOptions advancedOptions) {
            String advancedOptionsShrink = shrink(advancedOptions, "AdvancedOptions", "json");
            this.putQueryParameter("AdvancedOptions", advancedOptionsShrink);
            this.advancedOptions = advancedOptions;
            return this;
        }

        /**
         * The ID of the data source.
         */
        public Builder dataSourceId(String dataSourceId) {
            this.putBodyParameter("DataSourceId", dataSourceId);
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * Specifies whether to disable the backup policy for the data source.
         * <p>
         * 
         * *   true: disables the backup policy for the data source
         * *   false: enables the backup policy for the data source
         */
        public Builder disabled(Boolean disabled) {
            this.putQueryParameter("Disabled", disabled);
            this.disabled = disabled;
            return this;
        }

        /**
         * The description of the association.
         */
        public Builder policyBindingDescription(String policyBindingDescription) {
            this.putQueryParameter("PolicyBindingDescription", policyBindingDescription);
            this.policyBindingDescription = policyBindingDescription;
            return this;
        }

        /**
         * The ID of the backup policy.
         */
        public Builder policyId(String policyId) {
            this.putBodyParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * The type of the data source. Valid values:
         * <p>
         * 
         * *   **UDM_ECS**: ECS instance backup
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        @Override
        public UpdatePolicyBindingRequest build() {
            return new UpdatePolicyBindingRequest(this);
        } 

    } 

    public static class CommonFileSystemDetail extends TeaModel {
        @NameInMap("FetchSliceSize")
        private Long fetchSliceSize;

        @NameInMap("FullOnIncrementFail")
        private Boolean fullOnIncrementFail;

        private CommonFileSystemDetail(Builder builder) {
            this.fetchSliceSize = builder.fetchSliceSize;
            this.fullOnIncrementFail = builder.fullOnIncrementFail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CommonFileSystemDetail create() {
            return builder().build();
        }

        /**
         * @return fetchSliceSize
         */
        public Long getFetchSliceSize() {
            return this.fetchSliceSize;
        }

        /**
         * @return fullOnIncrementFail
         */
        public Boolean getFullOnIncrementFail() {
            return this.fullOnIncrementFail;
        }

        public static final class Builder {
            private Long fetchSliceSize; 
            private Boolean fullOnIncrementFail; 

            /**
             * FetchSliceSize.
             */
            public Builder fetchSliceSize(Long fetchSliceSize) {
                this.fetchSliceSize = fetchSliceSize;
                return this;
            }

            /**
             * FullOnIncrementFail.
             */
            public Builder fullOnIncrementFail(Boolean fullOnIncrementFail) {
                this.fullOnIncrementFail = fullOnIncrementFail;
                return this;
            }

            public CommonFileSystemDetail build() {
                return new CommonFileSystemDetail(this);
            } 

        } 

    }
    public static class OssDetail extends TeaModel {
        @NameInMap("InventoryCleanupPolicy")
        private String inventoryCleanupPolicy;

        @NameInMap("InventoryId")
        private String inventoryId;

        private OssDetail(Builder builder) {
            this.inventoryCleanupPolicy = builder.inventoryCleanupPolicy;
            this.inventoryId = builder.inventoryId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OssDetail create() {
            return builder().build();
        }

        /**
         * @return inventoryCleanupPolicy
         */
        public String getInventoryCleanupPolicy() {
            return this.inventoryCleanupPolicy;
        }

        /**
         * @return inventoryId
         */
        public String getInventoryId() {
            return this.inventoryId;
        }

        public static final class Builder {
            private String inventoryCleanupPolicy; 
            private String inventoryId; 

            /**
             * Specifies whether the system deletes the inventory lists after a backup is complete. This parameter is available only when OSS inventory lists are used. Valid values:
             * <p>
             * 
             * *   **NO_CLEANUP**: Does not delete inventory lists.
             * *   **DELETE_CURRENT**: Deletes the current inventory list.
             * *   **DELETE_CURRENT_AND_PREVIOUS**: Deletes all inventory lists.
             */
            public Builder inventoryCleanupPolicy(String inventoryCleanupPolicy) {
                this.inventoryCleanupPolicy = inventoryCleanupPolicy;
                return this;
            }

            /**
             * The name of the OSS inventory list. The OSS inventory list specified for this parameter is used for performance optimization.
             * <p>
             * 
             * *   If you want to back up more than 100 million OSS objects, we recommend that you use inventory lists to accelerate incremental backup. Storage fees for inventory lists are included in your OSS bills.
             * *   An extended period of time is required for OSS to generate inventory lists. Before inventory lists are generated, OSS objects may fail to be backed up. In this case, you can back up the OSS objects in the next backup cycle.
             */
            public Builder inventoryId(String inventoryId) {
                this.inventoryId = inventoryId;
                return this;
            }

            public OssDetail build() {
                return new OssDetail(this);
            } 

        } 

    }
    public static class UdmDetail extends TeaModel {
        @NameInMap("AppConsistent")
        private Boolean appConsistent;

        @NameInMap("DiskIdList")
        private java.util.List < String > diskIdList;

        @NameInMap("EnableFsFreeze")
        private Boolean enableFsFreeze;

        @NameInMap("EnableWriters")
        private Boolean enableWriters;

        @NameInMap("ExcludeDiskIdList")
        private java.util.List < String > excludeDiskIdList;

        @NameInMap("PostScriptPath")
        private String postScriptPath;

        @NameInMap("PreScriptPath")
        private String preScriptPath;

        @NameInMap("RamRoleName")
        private String ramRoleName;

        @NameInMap("SnapshotGroup")
        private Boolean snapshotGroup;

        @NameInMap("TimeoutInSeconds")
        private Long timeoutInSeconds;

        private UdmDetail(Builder builder) {
            this.appConsistent = builder.appConsistent;
            this.diskIdList = builder.diskIdList;
            this.enableFsFreeze = builder.enableFsFreeze;
            this.enableWriters = builder.enableWriters;
            this.excludeDiskIdList = builder.excludeDiskIdList;
            this.postScriptPath = builder.postScriptPath;
            this.preScriptPath = builder.preScriptPath;
            this.ramRoleName = builder.ramRoleName;
            this.snapshotGroup = builder.snapshotGroup;
            this.timeoutInSeconds = builder.timeoutInSeconds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UdmDetail create() {
            return builder().build();
        }

        /**
         * @return appConsistent
         */
        public Boolean getAppConsistent() {
            return this.appConsistent;
        }

        /**
         * @return diskIdList
         */
        public java.util.List < String > getDiskIdList() {
            return this.diskIdList;
        }

        /**
         * @return enableFsFreeze
         */
        public Boolean getEnableFsFreeze() {
            return this.enableFsFreeze;
        }

        /**
         * @return enableWriters
         */
        public Boolean getEnableWriters() {
            return this.enableWriters;
        }

        /**
         * @return excludeDiskIdList
         */
        public java.util.List < String > getExcludeDiskIdList() {
            return this.excludeDiskIdList;
        }

        /**
         * @return postScriptPath
         */
        public String getPostScriptPath() {
            return this.postScriptPath;
        }

        /**
         * @return preScriptPath
         */
        public String getPreScriptPath() {
            return this.preScriptPath;
        }

        /**
         * @return ramRoleName
         */
        public String getRamRoleName() {
            return this.ramRoleName;
        }

        /**
         * @return snapshotGroup
         */
        public Boolean getSnapshotGroup() {
            return this.snapshotGroup;
        }

        /**
         * @return timeoutInSeconds
         */
        public Long getTimeoutInSeconds() {
            return this.timeoutInSeconds;
        }

        public static final class Builder {
            private Boolean appConsistent; 
            private java.util.List < String > diskIdList; 
            private Boolean enableFsFreeze; 
            private Boolean enableWriters; 
            private java.util.List < String > excludeDiskIdList; 
            private String postScriptPath; 
            private String preScriptPath; 
            private String ramRoleName; 
            private Boolean snapshotGroup; 
            private Long timeoutInSeconds; 

            /**
             * Specifies whether to enable application consistency. You can enable application consistency only if all disks are ESSDs.
             */
            public Builder appConsistent(Boolean appConsistent) {
                this.appConsistent = appConsistent;
                return this;
            }

            /**
             * The IDs of the disks that require protection. This parameter is not required if all disks require protection.
             */
            public Builder diskIdList(java.util.List < String > diskIdList) {
                this.diskIdList = diskIdList;
                return this;
            }

            /**
             * This parameter is required only if the **AppConsistent** parameter is set to **true**. This parameter specifies whether to enable Linux fsfreeze to put file systems into the read-only state before application-consistent snapshots are created. Default value: true.
             */
            public Builder enableFsFreeze(Boolean enableFsFreeze) {
                this.enableFsFreeze = enableFsFreeze;
                return this;
            }

            /**
             * This parameter is required only if the **AppConsistent** parameter is set to **true**. This parameter specifies whether to create application-consistent snapshots. Valid values:
             * <p>
             * 
             * *   true: creates application-consistent snapshots.
             * *   false: creates file system-consistent snapshots.
             * 
             * Default value: true.
             */
            public Builder enableWriters(Boolean enableWriters) {
                this.enableWriters = enableWriters;
                return this;
            }

            /**
             * The IDs of the disks that require no protection. This parameter is not required if the DiskIdList parameter is specified.
             */
            public Builder excludeDiskIdList(java.util.List < String > excludeDiskIdList) {
                this.excludeDiskIdList = excludeDiskIdList;
                return this;
            }

            /**
             * This parameter is required only if the **AppConsistent** parameter is set to **true**. This parameter specifies the path of the post-thaw scripts that are executed after application-consistent snapshots are created.
             */
            public Builder postScriptPath(String postScriptPath) {
                this.postScriptPath = postScriptPath;
                return this;
            }

            /**
             * This parameter is required only if the **AppConsistent** parameter is set to **true**. This parameter specifies the path of the pre-freeze scripts that are executed before application-consistent snapshots are created.
             */
            public Builder preScriptPath(String preScriptPath) {
                this.preScriptPath = preScriptPath;
                return this;
            }

            /**
             * This parameter is required only if the **AppConsistent** parameter is set to **true**. This parameter specifies the name of the Resource Access Management (RAM) role that is required to create application-consistent snapshots.
             */
            public Builder ramRoleName(String ramRoleName) {
                this.ramRoleName = ramRoleName;
                return this;
            }

            /**
             * Specifies whether to create a snapshot-consistent group. You can create a snapshot-consistent group only if all disks are enhanced SSDs (ESSDs).
             */
            public Builder snapshotGroup(Boolean snapshotGroup) {
                this.snapshotGroup = snapshotGroup;
                return this;
            }

            /**
             * This parameter is required only if the **AppConsistent** parameter is set to **true**. This parameter specifies the I/O freeze timeout period. Default value: 30. Unit: seconds.
             */
            public Builder timeoutInSeconds(Long timeoutInSeconds) {
                this.timeoutInSeconds = timeoutInSeconds;
                return this;
            }

            public UdmDetail build() {
                return new UdmDetail(this);
            } 

        } 

    }
    public static class AdvancedOptions extends TeaModel {
        @NameInMap("CommonFileSystemDetail")
        private CommonFileSystemDetail commonFileSystemDetail;

        @NameInMap("OssDetail")
        private OssDetail ossDetail;

        @NameInMap("UdmDetail")
        private UdmDetail udmDetail;

        private AdvancedOptions(Builder builder) {
            this.commonFileSystemDetail = builder.commonFileSystemDetail;
            this.ossDetail = builder.ossDetail;
            this.udmDetail = builder.udmDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdvancedOptions create() {
            return builder().build();
        }

        /**
         * @return commonFileSystemDetail
         */
        public CommonFileSystemDetail getCommonFileSystemDetail() {
            return this.commonFileSystemDetail;
        }

        /**
         * @return ossDetail
         */
        public OssDetail getOssDetail() {
            return this.ossDetail;
        }

        /**
         * @return udmDetail
         */
        public UdmDetail getUdmDetail() {
            return this.udmDetail;
        }

        public static final class Builder {
            private CommonFileSystemDetail commonFileSystemDetail; 
            private OssDetail ossDetail; 
            private UdmDetail udmDetail; 

            /**
             * CommonFileSystemDetail.
             */
            public Builder commonFileSystemDetail(CommonFileSystemDetail commonFileSystemDetail) {
                this.commonFileSystemDetail = commonFileSystemDetail;
                return this;
            }

            /**
             * The details of the Object Storage Service (OSS) backup.
             */
            public Builder ossDetail(OssDetail ossDetail) {
                this.ossDetail = ossDetail;
                return this;
            }

            /**
             * The backup details of the Elastic Compute Service (ECS) instance.
             */
            public Builder udmDetail(UdmDetail udmDetail) {
                this.udmDetail = udmDetail;
                return this;
            }

            public AdvancedOptions build() {
                return new AdvancedOptions(this);
            } 

        } 

    }
}
