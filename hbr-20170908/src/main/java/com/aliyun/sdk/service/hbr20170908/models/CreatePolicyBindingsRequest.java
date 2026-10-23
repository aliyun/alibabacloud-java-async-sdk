// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

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
 * {@link CreatePolicyBindingsRequest} extends {@link RequestModel}
 *
 * <p>CreatePolicyBindingsRequest</p>
 */
public class CreatePolicyBindingsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyBindingList")
    private java.util.List<PolicyBindingList> policyBindingList;

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
    public java.util.List<PolicyBindingList> getPolicyBindingList() {
        return this.policyBindingList;
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    public static final class Builder extends Request.Builder<CreatePolicyBindingsRequest, Builder> {
        private java.util.List<PolicyBindingList> policyBindingList; 
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
         * <p>The list of policy bindings.</p>
         */
        public Builder policyBindingList(java.util.List<PolicyBindingList> policyBindingList) {
            String policyBindingListShrink = shrink(policyBindingList, "PolicyBindingList", "json");
            this.putQueryParameter("PolicyBindingList", policyBindingListShrink);
            this.policyBindingList = policyBindingList;
            return this;
        }

        /**
         * <p>The policy ID.</p>
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

            private Builder() {
            } 

            private Builder(CommonFileSystemDetail model) {
                this.fetchSliceSize = model.fetchSliceSize;
                this.fullOnIncrementFail = model.fullOnIncrementFail;
            } 

            /**
             * <p>The sub-task slice size (number of files).</p>
             * 
             * <strong>example:</strong>
             * <p>100000</p>
             */
            public Builder fetchSliceSize(Long fetchSliceSize) {
                this.fetchSliceSize = fetchSliceSize;
                return this;
            }

            /**
             * <p>Specifies whether to switch to a full backup when an incremental backup fails. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Switch to a full backup on failure.</li>
             * <li><strong>false</strong>: Do not switch to a full backup on failure.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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

            private Builder() {
            } 

            private Builder(CommonNasDetail model) {
                this.clusterId = model.clusterId;
                this.fetchSliceSize = model.fetchSliceSize;
                this.fullOnIncrementFail = model.fullOnIncrementFail;
            } 

            /**
             * <p>The backup client group ID. On-premises NAS backup selects a client from the backup client group to perform the backup.</p>
             * 
             * <strong>example:</strong>
             * <p>cl-000**************ggu</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The sub-task slice size (number of files).</p>
             * 
             * <strong>example:</strong>
             * <p>100000</p>
             */
            public Builder fetchSliceSize(Long fetchSliceSize) {
                this.fetchSliceSize = fetchSliceSize;
                return this;
            }

            /**
             * <p>Specifies whether to switch to a full backup when an incremental backup fails. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Switch to a full backup on failure.</li>
             * <li><strong>false</strong>: Do not switch to a full backup on failure.</li>
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

            private Builder() {
            } 

            private Builder(FileDetail model) {
                this.advPolicy = model.advPolicy;
                this.useVSS = model.useVSS;
            } 

            /**
             * <p>Specifies whether to use an advanced policy. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Use.</li>
             * <li><strong>false</strong>: Do not use.</li>
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
             * <p>Specifies whether to enable the Volume Shadow Copy Service (VSS) feature (Windows). Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Enabled.</li>
             * <li><strong>false</strong>: Disabled.</li>
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
        @com.aliyun.core.annotation.NameInMap("IgnoreArchiveObject")
        private Boolean ignoreArchiveObject;

        @com.aliyun.core.annotation.NameInMap("InventoryCleanupPolicy")
        private String inventoryCleanupPolicy;

        @com.aliyun.core.annotation.NameInMap("InventoryId")
        private String inventoryId;

        private OssDetail(Builder builder) {
            this.ignoreArchiveObject = builder.ignoreArchiveObject;
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
         * @return ignoreArchiveObject
         */
        public Boolean getIgnoreArchiveObject() {
            return this.ignoreArchiveObject;
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
            private Boolean ignoreArchiveObject; 
            private String inventoryCleanupPolicy; 
            private String inventoryId; 

            private Builder() {
            } 

            private Builder(OssDetail model) {
                this.ignoreArchiveObject = model.ignoreArchiveObject;
                this.inventoryCleanupPolicy = model.inventoryCleanupPolicy;
                this.inventoryId = model.inventoryId;
            } 

            /**
             * <p>Specifies whether to exclude archive objects from job statistics and failed file lists.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder ignoreArchiveObject(Boolean ignoreArchiveObject) {
                this.ignoreArchiveObject = ignoreArchiveObject;
                return this;
            }

            /**
             * <p>Specifies whether to delete inventory files after backup. This parameter takes effect only when OSS inventory is used. Valid values:</p>
             * <ul>
             * <li><strong>NO_CLEANUP</strong>: Do not delete.</li>
             * <li><strong>DELETE_CURRENT</strong>: Delete the current file.</li>
             * <li><strong>DELETE_CURRENT_AND_PREVIOUS</strong>: Delete all files.</li>
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
             * <p>The OSS inventory name. When this value is not empty, the OSS inventory is used for performance optimization.</p>
             * <ul>
             * <li>Using an inventory is recommended for backing up more than 100 million OSS objects to improve incremental performance. Storage fees generated by inventory files are charged separately by OSS.</li>
             * <li>OSS inventory files take time to generate. Backup jobs may fail before the inventory files are generated. Wait for the next backup cycle.</li>
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
        private java.util.List<String> diskIdList;

        @com.aliyun.core.annotation.NameInMap("EnableFsFreeze")
        private Boolean enableFsFreeze;

        @com.aliyun.core.annotation.NameInMap("EnableWriters")
        private Boolean enableWriters;

        @com.aliyun.core.annotation.NameInMap("ExcludeDiskIdList")
        private java.util.List<String> excludeDiskIdList;

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
        public java.util.List<String> getDiskIdList() {
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
        public java.util.List<String> getExcludeDiskIdList() {
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
            private java.util.List<String> diskIdList; 
            private Boolean enableFsFreeze; 
            private Boolean enableWriters; 
            private java.util.List<String> excludeDiskIdList; 
            private String postScriptPath; 
            private String preScriptPath; 
            private String ramRoleName; 
            private Boolean snapshotGroup; 
            private Long timeoutInSeconds; 

            private Builder() {
            } 

            private Builder(UdmDetail model) {
                this.appConsistent = model.appConsistent;
                this.diskIdList = model.diskIdList;
                this.enableFsFreeze = model.enableFsFreeze;
                this.enableWriters = model.enableWriters;
                this.excludeDiskIdList = model.excludeDiskIdList;
                this.postScriptPath = model.postScriptPath;
                this.preScriptPath = model.preScriptPath;
                this.ramRoleName = model.ramRoleName;
                this.snapshotGroup = model.snapshotGroup;
                this.timeoutInSeconds = model.timeoutInSeconds;
            } 

            /**
             * <p>Specifies whether to create an application-consistent snapshot. Application-consistent snapshots are supported only when all cloud disk types are ESSD.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder appConsistent(Boolean appConsistent) {
                this.appConsistent = appConsistent;
                return this;
            }

            /**
             * <p>The list of cloud disk IDs that need to be protected. Leave this value empty to protect all cloud disks.</p>
             */
            public Builder diskIdList(java.util.List<String> diskIdList) {
                this.diskIdList = diskIdList;
                return this;
            }

            /**
             * <p>This parameter is required only when <strong>AppConsistent</strong> is set to <strong>true</strong>. Specifies whether to use the Linux FsFreeze mechanism to ensure the file system is in read consistency before creating an application-consistent snapshot. Default value: true.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableFsFreeze(Boolean enableFsFreeze) {
                this.enableFsFreeze = enableFsFreeze;
                return this;
            }

            /**
             * <p>This parameter is required only when <strong>AppConsistent</strong> is set to <strong>true</strong>. Specifies whether to create an application-consistent snapshot:</p>
             * <ul>
             * <li>true: Creates an application-consistent snapshot.</li>
             * <li>false: Creates a file system-consistent snapshot.</li>
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
             * <p>The list of cloud disk IDs that do not need to be protected. This parameter is ignored when DiskIdList is not empty.</p>
             */
            public Builder excludeDiskIdList(java.util.List<String> excludeDiskIdList) {
                this.excludeDiskIdList = excludeDiskIdList;
                return this;
            }

            /**
             * <p>This parameter is required only when <strong>AppConsistent</strong> is set to <strong>true</strong>. The path of the post-thaw script to run after creating an application-consistent snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>/tmp/postscript.sh</p>
             */
            public Builder postScriptPath(String postScriptPath) {
                this.postScriptPath = postScriptPath;
                return this;
            }

            /**
             * <p>This parameter is required only when <strong>AppConsistent</strong> is set to <strong>true</strong>. The path of the pre-freeze script to run before creating an application-consistent snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>/tmp/prescript.sh</p>
             */
            public Builder preScriptPath(String preScriptPath) {
                this.preScriptPath = preScriptPath;
                return this;
            }

            /**
             * <p>This parameter is required only when <strong>AppConsistent</strong> is set to <strong>true</strong>. The RAM role name required for creating application-consistent snapshots.</p>
             * 
             * <strong>example:</strong>
             * <p>AliyunECSInstanceForHbrRole</p>
             */
            public Builder ramRoleName(String ramRoleName) {
                this.ramRoleName = ramRoleName;
                return this;
            }

            /**
             * <p>Specifies whether to create a snapshot-consistent group. Snapshot-consistent groups are supported only when all cloud disk types are ESSD.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder snapshotGroup(Boolean snapshotGroup) {
                this.snapshotGroup = snapshotGroup;
                return this;
            }

            /**
             * <p>This parameter is required only when <strong>AppConsistent</strong> is set to <strong>true</strong>. The I/O freeze timeout period, in seconds. Default value: 30.</p>
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

            private Builder() {
            } 

            private Builder(AdvancedOptions model) {
                this.commonFileSystemDetail = model.commonFileSystemDetail;
                this.commonNasDetail = model.commonNasDetail;
                this.fileDetail = model.fileDetail;
                this.ossDetail = model.ossDetail;
                this.udmDetail = model.udmDetail;
            } 

            /**
             * <p>The advanced options for CPFS backup.</p>
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
             * <p>The advanced options for ECS full server backup.</p>
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

            private Builder() {
            } 

            private Builder(PolicyBindingList model) {
                this.advancedOptions = model.advancedOptions;
                this.crossAccountRoleName = model.crossAccountRoleName;
                this.crossAccountType = model.crossAccountType;
                this.crossAccountUserId = model.crossAccountUserId;
                this.dataSourceId = model.dataSourceId;
                this.disabled = model.disabled;
                this.exclude = model.exclude;
                this.include = model.include;
                this.policyBindingDescription = model.policyBindingDescription;
                this.source = model.source;
                this.sourceType = model.sourceType;
                this.speedLimit = model.speedLimit;
            } 

            /**
             * <p>The advanced options.</p>
             */
            public Builder advancedOptions(AdvancedOptions advancedOptions) {
                this.advancedOptions = advancedOptions;
                return this;
            }

            /**
             * <p>The RAM role name created in the source account for cross-account backup.</p>
             * 
             * <strong>example:</strong>
             * <p>hbrcrossrole</p>
             */
            public Builder crossAccountRoleName(String crossAccountRoleName) {
                this.crossAccountRoleName = crossAccountRoleName;
                return this;
            }

            /**
             * <p>The cross-account backup type. Default value: SELF_ACCOUNT. Valid values: </p>
             * <ul>
             * <li><strong>SELF_ACCOUNT</strong>: Backup within the same account.</li>
             * <li><strong>CROSS_ACCOUNT</strong>: Cross-account backup.</li>
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
             * <p>The Alibaba Cloud UID of the source account for cross-account backup.</p>
             * 
             * <strong>example:</strong>
             * <p>144**********732</p>
             */
            public Builder crossAccountUserId(Long crossAccountUserId) {
                this.crossAccountUserId = crossAccountUserId;
                return this;
            }

            /**
             * <p>The data source ID. The value has different meanings depending on the <strong>SourceType</strong> field:</p>
             * <ul>
             * <li><strong>UDM_ECS</strong>: The ECS instance ID.</li>
             * <li><strong>OSS</strong>: The OSS bucket name.</li>
             * <li><strong>NAS</strong>: The Alibaba Cloud NAS file system ID.</li>
             * <li><strong>COMMON_NAS</strong>: The on-premises NAS instance ID.</li>
             * <li><strong>ECS_FILE</strong>: The ECS instance ID.</li>
             * <li><strong>File</strong>: The Cloud Backup client ID.</li>
             * <li><strong>COMMON_FILE_SYSTEM</strong>: The CPFS backup data source ID.</li>
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
             * <p>Specifies whether the policy is suspended for this data source.</p>
             * <ul>
             * <li>true: Suspended.</li>
             * <li>false: Not suspended.</li>
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
             * <p>This parameter can be configured when <strong>SourceType</strong> is set to <strong>ECS_FILE</strong>, <strong>File</strong>, <strong>NAS</strong>, <strong>COMMON_NAS</strong>, or <strong>COMMON_FILE_SYSTEM</strong>. Specifies the file types to exclude from the backup. All files of these types are not backed up. The value can be up to 255 characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p>[\&quot;<em>.doc\&quot;,\&quot;</em>.xltm\&quot;]</p>
             */
            public Builder exclude(String exclude) {
                this.exclude = exclude;
                return this;
            }

            /**
             * <p>This parameter can be configured when <strong>SourceType</strong> is set to <strong>ECS_FILE</strong>, <strong>File</strong>, <strong>NAS</strong>, <strong>COMMON_NAS</strong>, or <strong>COMMON_FILE_SYSTEM</strong>. Specifies the file types to include in the backup. All files of these types are backed up. The value can be up to 255 characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p>[\&quot;<em>.doc\&quot;,\&quot;</em>.xltm\&quot;]</p>
             */
            public Builder include(String include) {
                this.include = include;
                return this;
            }

            /**
             * <p>The description of the policy binding.</p>
             * 
             * <strong>example:</strong>
             * <p>This is a description of the policy binding</p>
             */
            public Builder policyBindingDescription(String policyBindingDescription) {
                this.policyBindingDescription = policyBindingDescription;
                return this;
            }

            /**
             * <p>The value has different meanings depending on the SourceType value:</p>
             * <ul>
             * <li><strong>OSS</strong>: The prefix to back up. If not specified, the entire bucket root directory is backed up. Only a single prefix is supported. To back up /backup, specify /backup.</li>
             * <li><strong>ECS_FILE</strong>: The file directories to back up. If not specified, all directories are backed up. Multiple directories are supported. To back up files under /a and /b, specify [&quot;/a&quot;, &quot;/b&quot;].</li>
             * <li><strong>File</strong>: The file directories to back up. If not specified, all directories are backed up. Multiple directories are supported. To back up files under /a and /b, specify [&quot;/a&quot;, &quot;/b&quot;].</li>
             * <li><strong>COMMON_FILE_SYSTEM</strong>: Required. The source paths to back up. Multiple paths are supported. To back up /a and /b, specify [&quot;/a&quot;, &quot;/b&quot;]. To back up the root path, specify [&quot;/&quot;].</li>
             * <li><strong>COMMON_NAS</strong>: Required. The source path to back up. Only a single path is supported. To back up /a, specify [&quot;/a&quot;]. To back up the root path, specify [&quot;/&quot;].</li>
             * <li><strong>OTS</strong>: The list of data tables to back up. If not specified, all data tables are backed up. Multiple data tables are supported. To back up tables a and b, specify [&quot;a&quot;, &quot;b&quot;].</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>backup/</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The data source type. Valid values:</p>
             * <ul>
             * <li><strong>UDM_ECS</strong>: ECS full server backup.</li>
             * <li><strong>OSS</strong>: OSS backup.</li>
             * <li><strong>NAS</strong>: Alibaba Cloud NAS backup.</li>
             * <li><strong>COMMON_NAS</strong>: On-premises NAS backup.</li>
             * <li><strong>ECS_FILE</strong>: ECS File Backup Essential Edition.</li>
             * <li><strong>File</strong>: On-premises file backup.</li>
             * <li><strong>COMMON_FILE_SYSTEM</strong>: CPFS backup.</li>
             * <li><strong>OTS</strong>: Tablestore backup.</li>
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
             * <p>This parameter is required only when <strong>SourceType</strong> is set to <strong>ECS_FILE</strong> or <strong>File</strong>. Specifies the backup traffic control. The format is <code>{start}{end}{bandwidth}</code>. Multiple traffic control configurations are separated by delimiters, and the time ranges must not overlap.</p>
             * <ul>
             * <li><strong>start</strong>: The start hour.</li>
             * <li><strong>end</strong>: The end hour.</li>
             * <li><strong>bandwidth</strong>: The rate limit, in KB/s.</li>
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
