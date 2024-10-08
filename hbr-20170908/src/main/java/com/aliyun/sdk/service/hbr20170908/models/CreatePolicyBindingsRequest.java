// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreatePolicyBindingsRequest} extends {@link RequestModel}
 *
 * <p>CreatePolicyBindingsRequest</p>
 */
public class CreatePolicyBindingsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyBindingList")
    private java.util.List < PolicyBindingList> policyBindingList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    private String policyId;

    private CreatePolicyBindingsRequest(Builder builder) {
        super(builder);
        this.policyBindingList = builder.policyBindingList;
        this.policyId = builder.policyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePolicyBindingsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policyBindingList
     */
    public java.util.List < PolicyBindingList> getPolicyBindingList() {
        return this.policyBindingList;
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    public static final class Builder extends Request.Builder<CreatePolicyBindingsRequest, Builder> {
        private java.util.List < PolicyBindingList> policyBindingList; 
        private String policyId; 

        private Builder() {
            super();
        } 

        private Builder(CreatePolicyBindingsRequest request) {
            super(request);
            this.policyBindingList = request.policyBindingList;
            this.policyId = request.policyId;
        } 

        /**
         * <p>The data sources that you want to bind to the backup policy.</p>
         */
        public Builder policyBindingList(java.util.List < PolicyBindingList> policyBindingList) {
            String policyBindingListShrink = shrink(policyBindingList, "PolicyBindingList", "json");
            this.putQueryParameter("PolicyBindingList", policyBindingListShrink);
            this.policyBindingList = policyBindingList;
            return this;
        }

        /**
         * <p>The ID of the backup policy.</p>
         * 
         * <strong>example:</strong>
         * <p>po-000************8ep</p>
         */
        public Builder policyId(String policyId) {
            this.putBodyParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        @Override
        public CreatePolicyBindingsRequest build() {
            return new CreatePolicyBindingsRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreatePolicyBindingsRequest} extends {@link TeaModel}
     *
     * <p>CreatePolicyBindingsRequest</p>
     */
    public static class CommonFileSystemDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FetchSliceSize")
        private Long fetchSliceSize;

        @com.aliyun.core.annotation.NameInMap("FullOnIncrementFail")
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
    /**
     * 
     * {@link CreatePolicyBindingsRequest} extends {@link TeaModel}
     *
     * <p>CreatePolicyBindingsRequest</p>
     */
    public static class CommonNasDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("FetchSliceSize")
        private Long fetchSliceSize;

        @com.aliyun.core.annotation.NameInMap("FullOnIncrementFail")
        private Boolean fullOnIncrementFail;

        private CommonNasDetail(Builder builder) {
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
            private String clusterId; 
            private Long fetchSliceSize; 
            private Boolean fullOnIncrementFail; 

            /**
             * <p>The ID of the backup client group. When you perform on-premises NAS backup, Cloud Backup selects clients from the specified backup client group.</p>
             * 
             * <strong>example:</strong>
             * <p>cl-000**************ggu</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The size of backup shards (the number of files).</p>
             * 
             * <strong>example:</strong>
             * <p>100000</p>
             */
            public Builder fetchSliceSize(Long fetchSliceSize) {
                this.fetchSliceSize = fetchSliceSize;
                return this;
            }

            /**
             * <p>Specifies whether the system performs full backup if incremental backup fails. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The system performs full backup if incremental backup fails.</li>
             * <li><strong>false</strong>: The system does not perform full backup if incremental backup fails.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link CreatePolicyBindingsRequest} extends {@link TeaModel}
     *
     * <p>CreatePolicyBindingsRequest</p>
     */
    public static class FileDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdvPolicy")
        private Boolean advPolicy;

        @com.aliyun.core.annotation.NameInMap("UseVSS")
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
             * <p>Specifies whether to use an advanced policy. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder advPolicy(Boolean advPolicy) {
                this.advPolicy = advPolicy;
                return this;
            }

            /**
             * <p>Specifies whether to enable the Volume Shadow Copy Service (VSS) feature. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link CreatePolicyBindingsRequest} extends {@link TeaModel}
     *
     * <p>CreatePolicyBindingsRequest</p>
     */
    public static class OssDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InventoryCleanupPolicy")
        private String inventoryCleanupPolicy;

        @com.aliyun.core.annotation.NameInMap("InventoryId")
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
             * <p>Specifies whether the system deletes the inventory lists when a backup is completed. This parameter is valid only when OSS inventories are used. Valid values:</p>
             * <ul>
             * <li><strong>NO_CLEANUP</strong>: Inventory lists are not deleted.</li>
             * <li><strong>DELETE_CURRENT</strong>: The current inventory list is deleted.</li>
             * <li><strong>DELETE_CURRENT_AND_PREVIOUS</strong>: All inventory lists are deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NO_CLEANUP</p>
             */
            public Builder inventoryCleanupPolicy(String inventoryCleanupPolicy) {
                this.inventoryCleanupPolicy = inventoryCleanupPolicy;
                return this;
            }

            /**
             * <p>The name of the OSS inventory. If this parameter is not empty, the OSS inventory is used for performance optimization.</p>
             * <ul>
             * <li>If you want to back up more than 100 million OSS objects, we recommend that you use inventory lists to accelerate incremental backup. Storage fees for inventory lists are included into your OSS bills.</li>
             * <li>A certain amount of time is required for OSS to generate inventory lists. Before inventory lists are generated, OSS objects may fail to be backed up. In this case, you can back up the OSS objects in the next backup cycle.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>oss-inventory-default</p>
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
    /**
     * 
     * {@link CreatePolicyBindingsRequest} extends {@link TeaModel}
     *
     * <p>CreatePolicyBindingsRequest</p>
     */
    public static class UdmDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppConsistent")
        private Boolean appConsistent;

        @com.aliyun.core.annotation.NameInMap("DiskIdList")
        private java.util.List < String > diskIdList;

        @com.aliyun.core.annotation.NameInMap("EnableFsFreeze")
        private Boolean enableFsFreeze;

        @com.aliyun.core.annotation.NameInMap("EnableWriters")
        private Boolean enableWriters;

        @com.aliyun.core.annotation.NameInMap("ExcludeDiskIdList")
        private java.util.List < String > excludeDiskIdList;

        @com.aliyun.core.annotation.NameInMap("PostScriptPath")
        private String postScriptPath;

        @com.aliyun.core.annotation.NameInMap("PreScriptPath")
        private String preScriptPath;

        @com.aliyun.core.annotation.NameInMap("RamRoleName")
        private String ramRoleName;

        @com.aliyun.core.annotation.NameInMap("SnapshotGroup")
        private Boolean snapshotGroup;

        @com.aliyun.core.annotation.NameInMap("TimeoutInSeconds")
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
             * <p>Specifies whether to enable application consistency. You can enable application consistency only if all disks are ESSDs.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder appConsistent(Boolean appConsistent) {
                this.appConsistent = appConsistent;
                return this;
            }

            /**
             * <p>The IDs of the disks that need to be protected. If all disks need to be protected, leave this parameter empty.</p>
             */
            public Builder diskIdList(java.util.List < String > diskIdList) {
                this.diskIdList = diskIdList;
                return this;
            }

            /**
             * <p>This parameter is required only if you set the <strong>AppConsistent</strong> parameter to <strong>true</strong>. This parameter specifies whether to enable Linux fsfreeze to put file systems into the read-only state before application-consistent snapshots are created. Default value: true.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableFsFreeze(Boolean enableFsFreeze) {
                this.enableFsFreeze = enableFsFreeze;
                return this;
            }

            /**
             * <p>This parameter is required only if you set the <strong>AppConsistent</strong> parameter to <strong>true</strong>. This parameter specifies whether to create application-consistent snapshots. Valid values:</p>
             * <ul>
             * <li>true: creates application-consistent snapshots.</li>
             * <li>false: creates file system-consistent snapshots.</li>
             * </ul>
             * <p>Default value: true.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableWriters(Boolean enableWriters) {
                this.enableWriters = enableWriters;
                return this;
            }

            /**
             * <p>The IDs of the disks that do not need to be protected. If the DiskIdList parameter is not empty, this parameter is ignored.</p>
             */
            public Builder excludeDiskIdList(java.util.List < String > excludeDiskIdList) {
                this.excludeDiskIdList = excludeDiskIdList;
                return this;
            }

            /**
             * <p>This parameter is required only if you set the <strong>AppConsistent</strong> parameter to <strong>true</strong>. This parameter specifies the path of the post-thaw scripts that are executed after application-consistent snapshots are created.</p>
             * 
             * <strong>example:</strong>
             * <p>/tmp/postscript.sh</p>
             */
            public Builder postScriptPath(String postScriptPath) {
                this.postScriptPath = postScriptPath;
                return this;
            }

            /**
             * <p>This parameter is required only if you set the <strong>AppConsistent</strong> parameter to <strong>true</strong>. This parameter specifies the path of the pre-freeze scripts that are executed before application-consistent snapshots are created.</p>
             * 
             * <strong>example:</strong>
             * <p>/tmp/prescript.sh</p>
             */
            public Builder preScriptPath(String preScriptPath) {
                this.preScriptPath = preScriptPath;
                return this;
            }

            /**
             * <p>This parameter is required only if you set the <strong>AppConsistent</strong> parameter to <strong>true</strong>. This parameter specifies the name of the RAM role that is required to create application-consistent snapshots.</p>
             * 
             * <strong>example:</strong>
             * <p>AliyunECSInstanceForHbrRole</p>
             */
            public Builder ramRoleName(String ramRoleName) {
                this.ramRoleName = ramRoleName;
                return this;
            }

            /**
             * <p>Specifies whether to create a snapshot-consistent group. You can create a snapshot-consistent group only if all disks are enhanced SSDs (ESSDs).</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder snapshotGroup(Boolean snapshotGroup) {
                this.snapshotGroup = snapshotGroup;
                return this;
            }

            /**
             * <p>This parameter is required only if you set the <strong>AppConsistent</strong> parameter to <strong>true</strong>. This parameter specifies the I/O freeze timeout period. Default value: 30. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
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
    /**
     * 
     * {@link CreatePolicyBindingsRequest} extends {@link TeaModel}
     *
     * <p>CreatePolicyBindingsRequest</p>
     */
    public static class AdvancedOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommonFileSystemDetail")
        private CommonFileSystemDetail commonFileSystemDetail;

        @com.aliyun.core.annotation.NameInMap("CommonNasDetail")
        private CommonNasDetail commonNasDetail;

        @com.aliyun.core.annotation.NameInMap("FileDetail")
        private FileDetail fileDetail;

        @com.aliyun.core.annotation.NameInMap("OssDetail")
        private OssDetail ossDetail;

        @com.aliyun.core.annotation.NameInMap("UdmDetail")
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
             * <p>The advanced options for on-premises NAS backup.</p>
             */
            public Builder commonNasDetail(CommonNasDetail commonNasDetail) {
                this.commonNasDetail = commonNasDetail;
                return this;
            }

            /**
             * <p>The advanced options for file backup.</p>
             */
            public Builder fileDetail(FileDetail fileDetail) {
                this.fileDetail = fileDetail;
                return this;
            }

            /**
             * <p>The advanced options for OSS backup.</p>
             */
            public Builder ossDetail(OssDetail ossDetail) {
                this.ossDetail = ossDetail;
                return this;
            }

            /**
             * <p>The advanced options for ECS instance backup.</p>
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
    /**
     * 
     * {@link CreatePolicyBindingsRequest} extends {@link TeaModel}
     *
     * <p>CreatePolicyBindingsRequest</p>
     */
    public static class PolicyBindingList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdvancedOptions")
        private AdvancedOptions advancedOptions;

        @com.aliyun.core.annotation.NameInMap("CrossAccountRoleName")
        private String crossAccountRoleName;

        @com.aliyun.core.annotation.NameInMap("CrossAccountType")
        private String crossAccountType;

        @com.aliyun.core.annotation.NameInMap("CrossAccountUserId")
        private Long crossAccountUserId;

        @com.aliyun.core.annotation.NameInMap("DataSourceId")
        private String dataSourceId;

        @com.aliyun.core.annotation.NameInMap("Disabled")
        private String disabled;

        @com.aliyun.core.annotation.NameInMap("Exclude")
        private String exclude;

        @com.aliyun.core.annotation.NameInMap("Include")
        private String include;

        @com.aliyun.core.annotation.NameInMap("PolicyBindingDescription")
        private String policyBindingDescription;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("SpeedLimit")
        private String speedLimit;

        private PolicyBindingList(Builder builder) {
            this.advancedOptions = builder.advancedOptions;
            this.crossAccountRoleName = builder.crossAccountRoleName;
            this.crossAccountType = builder.crossAccountType;
            this.crossAccountUserId = builder.crossAccountUserId;
            this.dataSourceId = builder.dataSourceId;
            this.disabled = builder.disabled;
            this.exclude = builder.exclude;
            this.include = builder.include;
            this.policyBindingDescription = builder.policyBindingDescription;
            this.source = builder.source;
            this.sourceType = builder.sourceType;
            this.speedLimit = builder.speedLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PolicyBindingList create() {
            return builder().build();
        }

        /**
         * @return advancedOptions
         */
        public AdvancedOptions getAdvancedOptions() {
            return this.advancedOptions;
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
        public String getDisabled() {
            return this.disabled;
        }

        /**
         * @return exclude
         */
        public String getExclude() {
            return this.exclude;
        }

        /**
         * @return include
         */
        public String getInclude() {
            return this.include;
        }

        /**
         * @return policyBindingDescription
         */
        public String getPolicyBindingDescription() {
            return this.policyBindingDescription;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return speedLimit
         */
        public String getSpeedLimit() {
            return this.speedLimit;
        }

        public static final class Builder {
            private AdvancedOptions advancedOptions; 
            private String crossAccountRoleName; 
            private String crossAccountType; 
            private Long crossAccountUserId; 
            private String dataSourceId; 
            private String disabled; 
            private String exclude; 
            private String include; 
            private String policyBindingDescription; 
            private String source; 
            private String sourceType; 
            private String speedLimit; 

            /**
             * <p>The advanced options.</p>
             */
            public Builder advancedOptions(AdvancedOptions advancedOptions) {
                this.advancedOptions = advancedOptions;
                return this;
            }

            /**
             * <p>The name of the RAM role that is created within the source Alibaba Cloud account and assigned to the current Alibaba Cloud account to authorize the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.</p>
             * 
             * <strong>example:</strong>
             * <p>hbrcrossrole</p>
             */
            public Builder crossAccountRoleName(String crossAccountRoleName) {
                this.crossAccountRoleName = crossAccountRoleName;
                return this;
            }

            /**
             * <p>Specifies whether to back up and restore data within the same Alibaba Cloud account or across Alibaba Cloud accounts. Default value: SELF_ACCOUNT. Valid values:</p>
             * <ul>
             * <li><strong>SELF_ACCOUNT</strong>: Data is backed up within the same Alibaba Cloud account.</li>
             * <li><strong>CROSS_ACCOUNT</strong>: Data is backed up across Alibaba Cloud accounts.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SELF_ACCOUNT</p>
             */
            public Builder crossAccountType(String crossAccountType) {
                this.crossAccountType = crossAccountType;
                return this;
            }

            /**
             * <p>The ID of the source Alibaba Cloud account that authorizes the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.</p>
             * 
             * <strong>example:</strong>
             * <p>144**********732</p>
             */
            public Builder crossAccountUserId(Long crossAccountUserId) {
                this.crossAccountUserId = crossAccountUserId;
                return this;
            }

            /**
             * <p>The ID of the data source. The meaning of this parameter depends on the <strong>SourceType</strong> parameter.</p>
             * <ul>
             * <li><strong>UDM_ECS</strong>: the ID of the Elastic Compute Service (ECS) instance</li>
             * <li><strong>OSS</strong>: the name of the Object Storage Service (OSS) bucket</li>
             * <li><strong>NAS</strong>: the ID of the Apsara File Storage NAS (NAS) file system</li>
             * <li><strong>COMMON_NAS</strong>: the ID of the on-premises NAS file system</li>
             * <li><strong>ECS_FILE</strong>: the ID of the ECS instance</li>
             * <li><strong>File</strong>: the ID of the Cloud Backup client</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>i-bp1************dl8</p>
             */
            public Builder dataSourceId(String dataSourceId) {
                this.dataSourceId = dataSourceId;
                return this;
            }

            /**
             * <p>策略对该数据源是否暂停生效。</p>
             * <ul>
             * <li>true：暂停</li>
             * <li>false：未暂停</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder disabled(String disabled) {
                this.disabled = disabled;
                return this;
            }

            /**
             * <p>仅当<strong>SourceType</strong>取值为<strong>ECS_FILE</strong>或<strong>File</strong>时，需要配置该参数。表示不需要进行备份的文件类型，该类型的所有文件都不备份。最多支持255个字符。</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;<em>.doc&quot;,&quot;</em>.xltm&quot;]</p>
             */
            public Builder exclude(String exclude) {
                this.exclude = exclude;
                return this;
            }

            /**
             * <p>仅当<strong>SourceType</strong>取值为<strong>ECS_FILE</strong>或<strong>File</strong>时，需要配置该参数。表示要进行备份的文件类型，这些类型的所有文件都备份。最多支持255个字符。</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;<em>.doc&quot;,&quot;</em>.xltm&quot;]</p>
             */
            public Builder include(String include) {
                this.include = include;
                return this;
            }

            /**
             * <p>The description of the association.</p>
             * 
             * <strong>example:</strong>
             * <p>Bind data sources to a backup policy</p>
             */
            public Builder policyBindingDescription(String policyBindingDescription) {
                this.policyBindingDescription = policyBindingDescription;
                return this;
            }

            /**
             * <p>The prefix of the path to the folder that you want to back up. By default, the entire OSS bucket is backed up. This parameter is required only if you set the SourceType parameter to <strong>OSS</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>backup/</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The type of the data source. Valid values:</p>
             * <ul>
             * <li><strong>UDM_ECS</strong>: ECS instance</li>
             * <li><strong>OSS</strong>: OSS bucket</li>
             * <li><strong>NAS</strong>: Apsara File Storage NAS file system</li>
             * <li><strong>COMMON_NAS</strong>: on-premises NAS file system</li>
             * <li><strong>ECS_FILE</strong>: ECS files</li>
             * <li><strong>File</strong>: on-premises files</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>UDM_ECS</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>仅当<strong>SourceType</strong>取值为<strong>ECS_FILE</strong>或<strong>File</strong>时，需要配置该参数。表示备份流量控制。格式为<code>{start}{end}{bandwidth}</code>。多个流量控制配置使用分隔，并且配置时间不允许有重叠。</p>
             * <ul>
             * <li><strong>start</strong>：起始小时。</li>
             * <li><strong>end</strong>：结束小时。</li>
             * <li><strong>bandwidth</strong>：限制速率，单位KB/s。</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0:24:1024</p>
             */
            public Builder speedLimit(String speedLimit) {
                this.speedLimit = speedLimit;
                return this;
            }

            public PolicyBindingList build() {
                return new PolicyBindingList(this);
            } 

        } 

    }
}
