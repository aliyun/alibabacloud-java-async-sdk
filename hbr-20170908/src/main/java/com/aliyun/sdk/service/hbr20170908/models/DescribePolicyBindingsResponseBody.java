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
 * {@link DescribePolicyBindingsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePolicyBindingsResponseBody</p>
 */
public class DescribePolicyBindingsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PolicyBindings")
    private java.util.List<PolicyBindings> policyBindings;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<PolicyBindings> getPolicyBindings() {
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
        private java.util.List<PolicyBindings> policyBindings; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribePolicyBindingsResponseBody model) {
            this.code = model.code;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.policyBindings = model.policyBindings;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The response code. 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The number of results for each query.</p>
         * <p>Valid values: 10 to 100. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The returned message. &quot;successful&quot; is returned for success. An error message is returned for failure.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The token required to obtain the next page of policy-data source bindings.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The list of policy bindings.</p>
         */
        public Builder policyBindings(java.util.List<PolicyBindings> policyBindings) {
            this.policyBindings = policyBindings;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5225929A-4EBD-55EE-9FE1-4A130E582A76</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * <ul>
         * <li>true: Successful.</li>
         * <li>false: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>38</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribePolicyBindingsResponseBody build() {
            return new DescribePolicyBindingsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePolicyBindingsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolicyBindingsResponseBody</p>
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
             * <li><strong>true</strong>: Switches to a full backup upon failure.</li>
             * <li><strong>false</strong>: Does not switch to a full backup upon failure.</li>
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
     * {@link DescribePolicyBindingsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolicyBindingsResponseBody</p>
     */
    public static class CommonNasDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("FetchSliceSize")
        private Long fetchSliceSize;

        @com.aliyun.core.annotation.NameInMap("FullOnIncrementFail")
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

            private Builder() {
            } 

            private Builder(CommonNasDetail model) {
                this.clientId = model.clientId;
                this.clusterId = model.clusterId;
                this.fetchSliceSize = model.fetchSliceSize;
                this.fullOnIncrementFail = model.fullOnIncrementFail;
            } 

            /**
             * <p>The backup client ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c-0001eg6mcvjs93f46s2d</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * <p>The client group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cl-000gkcofngi04j6k680a</p>
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
             * <li><strong>true</strong>: Switches to a full backup upon failure.</li>
             * <li><strong>false</strong>: Does not switch to a full backup upon failure.</li>
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
     * {@link DescribePolicyBindingsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolicyBindingsResponseBody</p>
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
             * <li><strong>true</strong>: Used.</li>
             * <li><strong>false</strong>: Not used.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
             * <p>false</p>
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
     * {@link DescribePolicyBindingsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolicyBindingsResponseBody</p>
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
             * <p>Specifies whether to exclude archive objects from task statistics and failed file lists.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder ignoreArchiveObject(Boolean ignoreArchiveObject) {
                this.ignoreArchiveObject = ignoreArchiveObject;
                return this;
            }

            /**
             * <p>Specifies whether to delete inventory files after backup. This parameter is valid only when OSS inventory is used. Valid values:</p>
             * <ul>
             * <li><strong>NO_CLEANUP</strong>: Do not delete.</li>
             * <li><strong>DELETE_CURRENT</strong>: Delete the current file.</li>
             * <li><strong>DELETE_CURRENT_AND_PREVIOUS</strong>: Delete all files.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DELETE_CURRENT_AND_PREVIOUS</p>
             */
            public Builder inventoryCleanupPolicy(String inventoryCleanupPolicy) {
                this.inventoryCleanupPolicy = inventoryCleanupPolicy;
                return this;
            }

            /**
             * <p>The OSS inventory name. If this value is not empty, the OSS inventory is used for performance tuning.</p>
             * <ul>
             * <li>Using an inventory to improve incremental performance is recommended when backing up more than 100 million OSS objects. Storage fees generated by inventory files are charged separately by OSS.</li>
             * <li>OSS inventory files take time to generate. Backup may fail before the OSS inventory file is generated. Wait for the next cycle to execute.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>inventory_test</p>
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
     * {@link DescribePolicyBindingsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolicyBindingsResponseBody</p>
     */
    public static class UdmDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppConsistent")
        private Boolean appConsistent;

        @com.aliyun.core.annotation.NameInMap("DestinationKmsKeyId")
        private String destinationKmsKeyId;

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
            private String destinationKmsKeyId; 
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
                this.destinationKmsKeyId = model.destinationKmsKeyId;
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
             * <p>Specifies whether to create an application-consistent snapshot. Creating an application-consistent snapshot is supported only when all cloud disk types are ESSD.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder appConsistent(Boolean appConsistent) {
                this.appConsistent = appConsistent;
                return this;
            }

            /**
             * <p>The custom KMS key ID in the destination region. If this field is not empty and cross-region replication is enabled, this key is used to encrypt the cross-region replication.</p>
             * 
             * <strong>example:</strong>
             * <p>4ed37b1e-da51-4187-aceb-9db4f9b7148b</p>
             */
            public Builder destinationKmsKeyId(String destinationKmsKeyId) {
                this.destinationKmsKeyId = destinationKmsKeyId;
                return this;
            }

            /**
             * <p>The list of cloud disk IDs that need to be protected. This value is empty when all cloud disks are protected.</p>
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
             * <p>This parameter is required only when <strong>AppConsistent</strong> is set to <strong>true</strong>. The path of the post-thaw script to execute after creating an application-consistent snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>/tmp/postscript.sh</p>
             */
            public Builder postScriptPath(String postScriptPath) {
                this.postScriptPath = postScriptPath;
                return this;
            }

            /**
             * <p>This parameter is required only when <strong>AppConsistent</strong> is set to <strong>true</strong>. The path of the pre-freeze script to execute before creating an application-consistent snapshot.</p>
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
             * <p>Specifies whether to create a snapshot-consistent group. Creating a snapshot-consistent group is supported only when all cloud disk types are ESSD.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder snapshotGroup(Boolean snapshotGroup) {
                this.snapshotGroup = snapshotGroup;
                return this;
            }

            /**
             * <p>This parameter is required only when <strong>AppConsistent</strong> is set to <strong>true</strong>. The I/O freeze timeout period. Unit: seconds. Default value: 30.</p>
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
     * {@link DescribePolicyBindingsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolicyBindingsResponseBody</p>
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
             * <p>The advanced options for large-scale file system backup.</p>
             */
            public Builder commonFileSystemDetail(CommonFileSystemDetail commonFileSystemDetail) {
                this.commonFileSystemDetail = commonFileSystemDetail;
                return this;
            }

            /**
             * <p>The advanced options for on-premises NAS.</p>
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
     * {@link DescribePolicyBindingsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolicyBindingsResponseBody</p>
     */
    public static class HitTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private HitTags(Builder builder) {
            this.key = builder.key;
            this.operator = builder.operator;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HitTags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String operator; 
            private String value; 

            private Builder() {
            } 

            private Builder(HitTags model) {
                this.key = model.key;
                this.operator = model.operator;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>env</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag matching rule.</p>
             * <ul>
             * <li><strong>EQUAL</strong>: Matches both the tag key and tag value.</li>
             * <li><strong>NOT</strong>: Matches the tag key but does not match the tag value.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>EQUAL</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>prod</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public HitTags build() {
                return new HitTags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePolicyBindingsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolicyBindingsResponseBody</p>
     */
    public static class PolicyBindings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdvancedOptions")
        private AdvancedOptions advancedOptions;

        @com.aliyun.core.annotation.NameInMap("CreatedByTag")
        private Boolean createdByTag;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private Long createdTime;

        @com.aliyun.core.annotation.NameInMap("CrossAccountRoleName")
        private String crossAccountRoleName;

        @com.aliyun.core.annotation.NameInMap("CrossAccountType")
        private String crossAccountType;

        @com.aliyun.core.annotation.NameInMap("CrossAccountUserId")
        private Long crossAccountUserId;

        @com.aliyun.core.annotation.NameInMap("DataSourceId")
        private String dataSourceId;

        @com.aliyun.core.annotation.NameInMap("Disabled")
        private Boolean disabled;

        @com.aliyun.core.annotation.NameInMap("Exclude")
        private String exclude;

        @com.aliyun.core.annotation.NameInMap("HitTags")
        private java.util.List<HitTags> hitTags;

        @com.aliyun.core.annotation.NameInMap("Include")
        private String include;

        @com.aliyun.core.annotation.NameInMap("PolicyBindingDescription")
        private String policyBindingDescription;

        @com.aliyun.core.annotation.NameInMap("PolicyBindingId")
        private String policyBindingId;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private String policyId;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("SpeedLimit")
        private String speedLimit;

        @com.aliyun.core.annotation.NameInMap("UpdatedTime")
        private Long updatedTime;

        private PolicyBindings(Builder builder) {
            this.advancedOptions = builder.advancedOptions;
            this.createdByTag = builder.createdByTag;
            this.createdTime = builder.createdTime;
            this.crossAccountRoleName = builder.crossAccountRoleName;
            this.crossAccountType = builder.crossAccountType;
            this.crossAccountUserId = builder.crossAccountUserId;
            this.dataSourceId = builder.dataSourceId;
            this.disabled = builder.disabled;
            this.exclude = builder.exclude;
            this.hitTags = builder.hitTags;
            this.include = builder.include;
            this.policyBindingDescription = builder.policyBindingDescription;
            this.policyBindingId = builder.policyBindingId;
            this.policyId = builder.policyId;
            this.source = builder.source;
            this.sourceType = builder.sourceType;
            this.speedLimit = builder.speedLimit;
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
         * @return createdByTag
         */
        public Boolean getCreatedByTag() {
            return this.createdByTag;
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
         * @return exclude
         */
        public String getExclude() {
            return this.exclude;
        }

        /**
         * @return hitTags
         */
        public java.util.List<HitTags> getHitTags() {
            return this.hitTags;
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

        /**
         * @return updatedTime
         */
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        public static final class Builder {
            private AdvancedOptions advancedOptions; 
            private Boolean createdByTag; 
            private Long createdTime; 
            private String crossAccountRoleName; 
            private String crossAccountType; 
            private Long crossAccountUserId; 
            private String dataSourceId; 
            private Boolean disabled; 
            private String exclude; 
            private java.util.List<HitTags> hitTags; 
            private String include; 
            private String policyBindingDescription; 
            private String policyBindingId; 
            private String policyId; 
            private String source; 
            private String sourceType; 
            private String speedLimit; 
            private Long updatedTime; 

            private Builder() {
            } 

            private Builder(PolicyBindings model) {
                this.advancedOptions = model.advancedOptions;
                this.createdByTag = model.createdByTag;
                this.createdTime = model.createdTime;
                this.crossAccountRoleName = model.crossAccountRoleName;
                this.crossAccountType = model.crossAccountType;
                this.crossAccountUserId = model.crossAccountUserId;
                this.dataSourceId = model.dataSourceId;
                this.disabled = model.disabled;
                this.exclude = model.exclude;
                this.hitTags = model.hitTags;
                this.include = model.include;
                this.policyBindingDescription = model.policyBindingDescription;
                this.policyBindingId = model.policyBindingId;
                this.policyId = model.policyId;
                this.source = model.source;
                this.sourceType = model.sourceType;
                this.speedLimit = model.speedLimit;
                this.updatedTime = model.updatedTime;
            } 

            /**
             * <p>The advanced options.</p>
             */
            public Builder advancedOptions(AdvancedOptions advancedOptions) {
                this.advancedOptions = advancedOptions;
                return this;
            }

            /**
             * <p>Indicates whether the resource is automatically associated through a backup policy resource tag.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder createdByTag(Boolean createdByTag) {
                this.createdByTag = createdByTag;
                return this;
            }

            /**
             * <p>The creation time. UNIX timestamp, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1661399570</p>
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
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
             * <p>The cross-account backup type. Valid values: </p>
             * <ul>
             * <li>SELF_ACCOUNT: backup within the current account.</li>
             * <li>CROSS_ACCOUNT: cross-account backup.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CROSS_ACCOUNT</p>
             */
            public Builder crossAccountType(String crossAccountType) {
                this.crossAccountType = crossAccountType;
                return this;
            }

            /**
             * <p>The ID of the source account for cross-account backup.</p>
             * 
             * <strong>example:</strong>
             * <p>1480************</p>
             */
            public Builder crossAccountUserId(Long crossAccountUserId) {
                this.crossAccountUserId = crossAccountUserId;
                return this;
            }

            /**
             * <p>The data source ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i-8vb************5ly</p>
             */
            public Builder dataSourceId(String dataSourceId) {
                this.dataSourceId = dataSourceId;
                return this;
            }

            /**
             * <p>Indicates whether the policy is effective for the data source.</p>
             * <ul>
             * <li>true: paused.</li>
             * <li>false: not paused.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder disabled(Boolean disabled) {
                this.disabled = disabled;
                return this;
            }

            /**
             * <p>This parameter is required only when <strong>SourceType</strong> is set to <strong>ECS_FILE</strong> or <strong>File</strong>. Specifies the file types to exclude from backup. All files of these types are not backed up. Maximum of 255 characters.</p>
             * 
             * <strong>example:</strong>
             * <p>[\&quot;<em>.doc\&quot;,\&quot;</em>.xltm\&quot;]</p>
             */
            public Builder exclude(String exclude) {
                this.exclude = exclude;
                return this;
            }

            /**
             * <p>The matched tag rules.</p>
             */
            public Builder hitTags(java.util.List<HitTags> hitTags) {
                this.hitTags = hitTags;
                return this;
            }

            /**
             * <p>This parameter is required only when <strong>SourceType</strong> is set to <strong>ECS_FILE</strong> or <strong>File</strong>. Specifies the file types to back up. All files of these types are backed up. Maximum of 255 characters.</p>
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
             * <p>po-000<strong><strong><strong><strong><strong><strong>eslc-i-uf6</strong></strong></strong></strong></strong></strong>y5g</p>
             */
            public Builder policyBindingDescription(String policyBindingDescription) {
                this.policyBindingDescription = policyBindingDescription;
                return this;
            }

            /**
             * <p>The policy binding ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pd-000************slc</p>
             */
            public Builder policyBindingId(String policyBindingId) {
                this.policyBindingId = policyBindingId;
                return this;
            }

            /**
             * <p>The policy ID.</p>
             * 
             * <strong>example:</strong>
             * <p>po-000************56y</p>
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * <ul>
             * <li>If SourceType is set to <strong>OSS</strong>, this parameter specifies the prefix to back up. If not specified, the entire Bucket root directory is backed up.</li>
             * <li>If SourceType is set to <strong>ECS_FILE</strong> or <strong>File</strong>, this parameter specifies the file directory to back up. If not specified, all directories are backed up.</li>
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
             * <li><strong>UDM_ECS</strong>: ECS instance backup.</li>
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
             * <p>This parameter is required only when <strong>SourceType</strong> is set to <strong>ECS_FILE</strong> or <strong>File</strong>. Specifies the backup traffic control. Format: <code>{start}{end}{bandwidth}</code>. Multiple traffic control configurations are separated by delimiters, and configuration times cannot overlap.</p>
             * <ul>
             * <li><strong>start</strong>: start hour.</li>
             * <li><strong>end</strong>: end hour.</li>
             * <li><strong>bandwidth</strong>: rate limit, in KB/s.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0:24:10240</p>
             */
            public Builder speedLimit(String speedLimit) {
                this.speedLimit = speedLimit;
                return this;
            }

            /**
             * <p>The update time. UNIX timestamp, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1653611573</p>
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
