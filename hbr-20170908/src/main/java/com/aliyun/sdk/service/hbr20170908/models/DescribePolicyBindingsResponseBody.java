// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePolicyBindingsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePolicyBindingsResponseBody</p>
 */
public class DescribePolicyBindingsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("Message")
    private String message;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("PolicyBindings")
    private java.util.List < PolicyBindings> policyBindings;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Long totalCount;

    private DescribePolicyBindingsResponseBody(Builder builder) {
        this.code = builder.code;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.policyBindings = builder.policyBindings;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolicyBindingsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return policyBindings
     */
    public java.util.List < PolicyBindings> getPolicyBindings() {
        return this.policyBindings;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private java.util.List < PolicyBindings> policyBindings; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The association between the backup policy and data sources.
         */
        public Builder policyBindings(java.util.List < PolicyBindings> policyBindings) {
            this.policyBindings = policyBindings;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribePolicyBindingsResponseBody build() {
            return new DescribePolicyBindingsResponseBody(this);
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
    public static class CommonNasDetail extends TeaModel {
        @NameInMap("ClientId")
        private String clientId;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("FetchSliceSize")
        private Long fetchSliceSize;

        @NameInMap("FullOnIncrementFail")
        private Boolean fullOnIncrementFail;

        private CommonNasDetail(Builder builder) {
            this.clientId = builder.clientId;
            this.clusterId = builder.clusterId;
            this.fetchSliceSize = builder.fetchSliceSize;
            this.fullOnIncrementFail = builder.fullOnIncrementFail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CommonNasDetail create() {
            return builder().build();
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
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
            private String clientId; 
            private String clusterId; 
            private Long fetchSliceSize; 
            private Boolean fullOnIncrementFail; 

            /**
             * The ID of the HBR client.
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The size of backup shards (the number of files).
             */
            public Builder fetchSliceSize(Long fetchSliceSize) {
                this.fetchSliceSize = fetchSliceSize;
                return this;
            }

            /**
             * Indicates whether the system performs full backup if incremental backup fails. Valid values:
             * <p>
             * 
             * *   **true**: The system performs full backup if incremental backup fails.
             * *   **false**: The system does not perform full backup if incremental backup fails.
             */
            public Builder fullOnIncrementFail(Boolean fullOnIncrementFail) {
                this.fullOnIncrementFail = fullOnIncrementFail;
                return this;
            }

            public CommonNasDetail build() {
                return new CommonNasDetail(this);
            } 

        } 

    }
    public static class FileDetail extends TeaModel {
        @NameInMap("AdvPolicy")
        private Boolean advPolicy;

        @NameInMap("UseVSS")
        private Boolean useVSS;

        private FileDetail(Builder builder) {
            this.advPolicy = builder.advPolicy;
            this.useVSS = builder.useVSS;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileDetail create() {
            return builder().build();
        }

        /**
         * @return advPolicy
         */
        public Boolean getAdvPolicy() {
            return this.advPolicy;
        }

        /**
         * @return useVSS
         */
        public Boolean getUseVSS() {
            return this.useVSS;
        }

        public static final class Builder {
            private Boolean advPolicy; 
            private Boolean useVSS; 

            /**
             * Indicates whether an advanced policy is used. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder advPolicy(Boolean advPolicy) {
                this.advPolicy = advPolicy;
                return this;
            }

            /**
             * Indicates whether the Volume Shadow Copy Service (VSS) feature is enabled. Valid values:
             * <p>
             * 
             * *   **true**: The feature is enabled.
             * *   **false**: The feature is disabled.
             */
            public Builder useVSS(Boolean useVSS) {
                this.useVSS = useVSS;
                return this;
            }

            public FileDetail build() {
                return new FileDetail(this);
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
             * Indicates whether the system deletes the inventory lists when a backup is completed. This parameter is valid only when OSS inventories are used. Valid values:
             * <p>
             * 
             * *   **NO_CLEANUP**: Inventory lists are not deleted.
             * *   **DELETE_CURRENT**: The current inventory list is deleted.
             * *   **DELETE_CURRENT_AND_PREVIOUS**: All inventory lists are deleted.
             */
            public Builder inventoryCleanupPolicy(String inventoryCleanupPolicy) {
                this.inventoryCleanupPolicy = inventoryCleanupPolicy;
                return this;
            }

            /**
             * The name of the OSS inventory. If this parameter is not empty, the OSS inventory is used for performance optimization.
             * <p>
             * 
             * *   If you want to back up more than 100 million OSS objects, we recommend that you use inventory lists to accelerate incremental backup. Storage fees for inventory lists are included into your OSS bills.
             * *   A certain amount of time is required for OSS to generate inventory lists. Before inventory lists are generated, OSS objects may fail to be backed up. In this case, you can back up the OSS objects in the next backup cycle.
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

        @NameInMap("DestinationKmsKeyId")
        private String destinationKmsKeyId;

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
            this.destinationKmsKeyId = builder.destinationKmsKeyId;
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
         * @return destinationKmsKeyId
         */
        public String getDestinationKmsKeyId() {
            return this.destinationKmsKeyId;
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
            private String destinationKmsKeyId; 
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
             * Indicates whether application consistency is enabled. You can enable application consistency only if all disks are ESSDs.
             */
            public Builder appConsistent(Boolean appConsistent) {
                this.appConsistent = appConsistent;
                return this;
            }

            /**
             * DestinationKmsKeyId.
             */
            public Builder destinationKmsKeyId(String destinationKmsKeyId) {
                this.destinationKmsKeyId = destinationKmsKeyId;
                return this;
            }

            /**
             * The IDs of the disks that need to be protected. If all disks need to be protected, this parameter is empty.
             */
            public Builder diskIdList(java.util.List < String > diskIdList) {
                this.diskIdList = diskIdList;
                return this;
            }

            /**
             * This parameter is returned only if **AppConsistent** is set to **true**. This parameter indicates whether Linux fsfreeze is enabled to put file systems into the read-only state before application-consistent snapshots are created. Default value: true.
             */
            public Builder enableFsFreeze(Boolean enableFsFreeze) {
                this.enableFsFreeze = enableFsFreeze;
                return this;
            }

            /**
             * This parameter is returned only if **AppConsistent** is set to **true**. This parameter indicates whether application-consistent snapshots are created. Valid values:
             * <p>
             * 
             * *   true: Application-consistent snapshots are created.
             * *   false: File system-consistent snapshots are created.
             * 
             * Default value: true.
             */
            public Builder enableWriters(Boolean enableWriters) {
                this.enableWriters = enableWriters;
                return this;
            }

            /**
             * The IDs of the disks that do not need to be protected. If DiskIdList is not empty, this parameter is ignored.
             */
            public Builder excludeDiskIdList(java.util.List < String > excludeDiskIdList) {
                this.excludeDiskIdList = excludeDiskIdList;
                return this;
            }

            /**
             * This parameter is returned only if **AppConsistent** is set to **true**. This parameter indicates the path of the post-thaw scripts that are executed after application-consistent snapshots are created.
             */
            public Builder postScriptPath(String postScriptPath) {
                this.postScriptPath = postScriptPath;
                return this;
            }

            /**
             * This parameter is returned only if **AppConsistent** is set to **true**. This parameter indicates the path of the pre-freeze scripts that are executed before application-consistent snapshots are created.
             */
            public Builder preScriptPath(String preScriptPath) {
                this.preScriptPath = preScriptPath;
                return this;
            }

            /**
             * This parameter is returned only if **AppConsistent** is set to **true**. This parameter indicates the name of the RAM role that is required to create application-consistent snapshots.
             */
            public Builder ramRoleName(String ramRoleName) {
                this.ramRoleName = ramRoleName;
                return this;
            }

            /**
             * Indicates whether a snapshot-consistent group is created. You can create a snapshot-consistent group only if all disks are enhanced SSDs (ESSDs).
             */
            public Builder snapshotGroup(Boolean snapshotGroup) {
                this.snapshotGroup = snapshotGroup;
                return this;
            }

            /**
             * This parameter is returned only if **AppConsistent** is set to **true**. This parameter indicates the I/O freeze timeout period. Default value: 30. Unit: seconds.
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

        @NameInMap("CommonNasDetail")
        private CommonNasDetail commonNasDetail;

        @NameInMap("FileDetail")
        private FileDetail fileDetail;

        @NameInMap("OssDetail")
        private OssDetail ossDetail;

        @NameInMap("UdmDetail")
        private UdmDetail udmDetail;

        private AdvancedOptions(Builder builder) {
            this.commonFileSystemDetail = builder.commonFileSystemDetail;
            this.commonNasDetail = builder.commonNasDetail;
            this.fileDetail = builder.fileDetail;
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
         * @return commonNasDetail
         */
        public CommonNasDetail getCommonNasDetail() {
            return this.commonNasDetail;
        }

        /**
         * @return fileDetail
         */
        public FileDetail getFileDetail() {
            return this.fileDetail;
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
            private CommonNasDetail commonNasDetail; 
            private FileDetail fileDetail; 
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
             * The advanced options for on-premises NAS backup.
             */
            public Builder commonNasDetail(CommonNasDetail commonNasDetail) {
                this.commonNasDetail = commonNasDetail;
                return this;
            }

            /**
             * The advanced options for file backup.
             */
            public Builder fileDetail(FileDetail fileDetail) {
                this.fileDetail = fileDetail;
                return this;
            }

            /**
             * The advanced options for OSS backup.
             */
            public Builder ossDetail(OssDetail ossDetail) {
                this.ossDetail = ossDetail;
                return this;
            }

            /**
             * The advanced options for ECS instance backup.
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
    public static class PolicyBindings extends TeaModel {
        @NameInMap("AdvancedOptions")
        private AdvancedOptions advancedOptions;

        @NameInMap("CreatedTime")
        private Long createdTime;

        @NameInMap("CrossAccountRoleName")
        private String crossAccountRoleName;

        @NameInMap("CrossAccountType")
        private String crossAccountType;

        @NameInMap("CrossAccountUserId")
        private Long crossAccountUserId;

        @NameInMap("DataSourceId")
        private String dataSourceId;

        @NameInMap("Disabled")
        private Boolean disabled;

        @NameInMap("PolicyBindingDescription")
        private String policyBindingDescription;

        @NameInMap("PolicyBindingId")
        private String policyBindingId;

        @NameInMap("PolicyId")
        private String policyId;

        @NameInMap("SourceType")
        private String sourceType;

        @NameInMap("UpdatedTime")
        private Long updatedTime;

        private PolicyBindings(Builder builder) {
            this.advancedOptions = builder.advancedOptions;
            this.createdTime = builder.createdTime;
            this.crossAccountRoleName = builder.crossAccountRoleName;
            this.crossAccountType = builder.crossAccountType;
            this.crossAccountUserId = builder.crossAccountUserId;
            this.dataSourceId = builder.dataSourceId;
            this.disabled = builder.disabled;
            this.policyBindingDescription = builder.policyBindingDescription;
            this.policyBindingId = builder.policyBindingId;
            this.policyId = builder.policyId;
            this.sourceType = builder.sourceType;
            this.updatedTime = builder.updatedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PolicyBindings create() {
            return builder().build();
        }

        /**
         * @return advancedOptions
         */
        public AdvancedOptions getAdvancedOptions() {
            return this.advancedOptions;
        }

        /**
         * @return createdTime
         */
        public Long getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return crossAccountRoleName
         */
        public String getCrossAccountRoleName() {
            return this.crossAccountRoleName;
        }

        /**
         * @return crossAccountType
         */
        public String getCrossAccountType() {
            return this.crossAccountType;
        }

        /**
         * @return crossAccountUserId
         */
        public Long getCrossAccountUserId() {
            return this.crossAccountUserId;
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
         * @return policyBindingId
         */
        public String getPolicyBindingId() {
            return this.policyBindingId;
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

        /**
         * @return updatedTime
         */
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        public static final class Builder {
            private AdvancedOptions advancedOptions; 
            private Long createdTime; 
            private String crossAccountRoleName; 
            private String crossAccountType; 
            private Long crossAccountUserId; 
            private String dataSourceId; 
            private Boolean disabled; 
            private String policyBindingDescription; 
            private String policyBindingId; 
            private String policyId; 
            private String sourceType; 
            private Long updatedTime; 

            /**
             * The advanced options.
             */
            public Builder advancedOptions(AdvancedOptions advancedOptions) {
                this.advancedOptions = advancedOptions;
                return this;
            }

            /**
             * The time when the backup policy was created. This value is a UNIX timestamp. Unit: seconds.
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * The name of the RAM role that is created within the source Alibaba Cloud account and assigned to the current Alibaba Cloud account to authorize the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.
             */
            public Builder crossAccountRoleName(String crossAccountRoleName) {
                this.crossAccountRoleName = crossAccountRoleName;
                return this;
            }

            /**
             * Indicates whether data is backed up within the same Alibaba Cloud account or across Alibaba Cloud accounts. Valid values:
             * <p>
             * 
             * *   SELF_ACCOUNT: Data is backed up within the same Alibaba Cloud account.
             * *   CROSS_ACCOUNT: Data is backed up across Alibaba Cloud accounts.
             */
            public Builder crossAccountType(String crossAccountType) {
                this.crossAccountType = crossAccountType;
                return this;
            }

            /**
             * The ID of the source Alibaba Cloud account that authorizes the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.
             */
            public Builder crossAccountUserId(Long crossAccountUserId) {
                this.crossAccountUserId = crossAccountUserId;
                return this;
            }

            /**
             * The ID of the data source.
             */
            public Builder dataSourceId(String dataSourceId) {
                this.dataSourceId = dataSourceId;
                return this;
            }

            /**
             * Indicates whether the backup policy is enabled for the data source. Valid values:
             * <p>
             * 
             * *   true: The backup policy is disabled.
             * *   false: The backup policy is enabled.
             */
            public Builder disabled(Boolean disabled) {
                this.disabled = disabled;
                return this;
            }

            /**
             * The description of the association.
             */
            public Builder policyBindingDescription(String policyBindingDescription) {
                this.policyBindingDescription = policyBindingDescription;
                return this;
            }

            /**
             * The ID of the association.
             */
            public Builder policyBindingId(String policyBindingId) {
                this.policyBindingId = policyBindingId;
                return this;
            }

            /**
             * The policy ID.
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * The type of the data source. Valid values:
             * <p>
             * 
             * *   **UDM_ECS**: ECS instances
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * The time when the backup policy was updated. The value is a UNIX timestamp. Unit: seconds.
             */
            public Builder updatedTime(Long updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            public PolicyBindings build() {
                return new PolicyBindings(this);
            } 

        } 

    }
}
