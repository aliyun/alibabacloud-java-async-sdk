// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link ListApplicationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListApplicationsResponseBody</p>
 */
public class ListApplicationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalSize")
    private Integer totalSize;

    private ListApplicationsResponseBody(Builder builder) {
        this.code = builder.code;
        this.currentPage = builder.currentPage;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalSize = builder.totalSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationsResponseBody create() {
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
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
     * @return totalSize
     */
    public Integer getTotalSize() {
        return this.totalSize;
    }

    public static final class Builder {
        private String code; 
        private Integer currentPage; 
        private Data data; 
        private String errorCode; 
        private String message; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalSize; 

        private Builder() {
        } 

        private Builder(ListApplicationsResponseBody model) {
            this.code = model.code;
            this.currentPage = model.currentPage;
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.message = model.message;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalSize = model.totalSize;
        } 

        /**
         * <p>Queries applications.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>20</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The queried applications.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>The ID of the request.</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>20</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>cn-beijing:demo</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>B4D805CA-926D-41B1-8E63-7AD0C1ED****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>1</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>demo-app</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }

        public ListApplicationsResponseBody build() {
            return new ListApplicationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListApplicationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListApplicationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationsResponseBody</p>
     */
    public static class Children extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppDeletingStatus")
        private Boolean appDeletingStatus;

        @com.aliyun.core.annotation.NameInMap("AppDescription")
        private String appDescription;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AppType")
        private String appType;

        @com.aliyun.core.annotation.NameInMap("BaseAppId")
        private String baseAppId;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("Instances")
        private Integer instances;

        @com.aliyun.core.annotation.NameInMap("Mem")
        private Integer mem;

        @com.aliyun.core.annotation.NameInMap("MseEnabled")
        private Boolean mseEnabled;

        @com.aliyun.core.annotation.NameInMap("NamespaceId")
        private String namespaceId;

        @com.aliyun.core.annotation.NameInMap("NamespaceName")
        private String namespaceName;

        @com.aliyun.core.annotation.NameInMap("NewSaeVersion")
        private String newSaeVersion;

        @com.aliyun.core.annotation.NameInMap("ProgrammingLanguage")
        private String programmingLanguage;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RunningInstances")
        private Integer runningInstances;

        @com.aliyun.core.annotation.NameInMap("ScaleRuleEnabled")
        private Boolean scaleRuleEnabled;

        @com.aliyun.core.annotation.NameInMap("ScaleRuleType")
        private String scaleRuleType;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        private Children(Builder builder) {
            this.appDeletingStatus = builder.appDeletingStatus;
            this.appDescription = builder.appDescription;
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.appType = builder.appType;
            this.baseAppId = builder.baseAppId;
            this.cpu = builder.cpu;
            this.instances = builder.instances;
            this.mem = builder.mem;
            this.mseEnabled = builder.mseEnabled;
            this.namespaceId = builder.namespaceId;
            this.namespaceName = builder.namespaceName;
            this.newSaeVersion = builder.newSaeVersion;
            this.programmingLanguage = builder.programmingLanguage;
            this.regionId = builder.regionId;
            this.runningInstances = builder.runningInstances;
            this.scaleRuleEnabled = builder.scaleRuleEnabled;
            this.scaleRuleType = builder.scaleRuleType;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Children create() {
            return builder().build();
        }

        /**
         * @return appDeletingStatus
         */
        public Boolean getAppDeletingStatus() {
            return this.appDeletingStatus;
        }

        /**
         * @return appDescription
         */
        public String getAppDescription() {
            return this.appDescription;
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return appType
         */
        public String getAppType() {
            return this.appType;
        }

        /**
         * @return baseAppId
         */
        public String getBaseAppId() {
            return this.baseAppId;
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return instances
         */
        public Integer getInstances() {
            return this.instances;
        }

        /**
         * @return mem
         */
        public Integer getMem() {
            return this.mem;
        }

        /**
         * @return mseEnabled
         */
        public Boolean getMseEnabled() {
            return this.mseEnabled;
        }

        /**
         * @return namespaceId
         */
        public String getNamespaceId() {
            return this.namespaceId;
        }

        /**
         * @return namespaceName
         */
        public String getNamespaceName() {
            return this.namespaceName;
        }

        /**
         * @return newSaeVersion
         */
        public String getNewSaeVersion() {
            return this.newSaeVersion;
        }

        /**
         * @return programmingLanguage
         */
        public String getProgrammingLanguage() {
            return this.programmingLanguage;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return runningInstances
         */
        public Integer getRunningInstances() {
            return this.runningInstances;
        }

        /**
         * @return scaleRuleEnabled
         */
        public Boolean getScaleRuleEnabled() {
            return this.scaleRuleEnabled;
        }

        /**
         * @return scaleRuleType
         */
        public String getScaleRuleType() {
            return this.scaleRuleType;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private Boolean appDeletingStatus; 
            private String appDescription; 
            private String appId; 
            private String appName; 
            private String appType; 
            private String baseAppId; 
            private Integer cpu; 
            private Integer instances; 
            private Integer mem; 
            private Boolean mseEnabled; 
            private String namespaceId; 
            private String namespaceName; 
            private String newSaeVersion; 
            private String programmingLanguage; 
            private String regionId; 
            private Integer runningInstances; 
            private Boolean scaleRuleEnabled; 
            private String scaleRuleType; 
            private java.util.List<Tags> tags; 

            private Builder() {
            } 

            private Builder(Children model) {
                this.appDeletingStatus = model.appDeletingStatus;
                this.appDescription = model.appDescription;
                this.appId = model.appId;
                this.appName = model.appName;
                this.appType = model.appType;
                this.baseAppId = model.baseAppId;
                this.cpu = model.cpu;
                this.instances = model.instances;
                this.mem = model.mem;
                this.mseEnabled = model.mseEnabled;
                this.namespaceId = model.namespaceId;
                this.namespaceName = model.namespaceName;
                this.newSaeVersion = model.newSaeVersion;
                this.programmingLanguage = model.programmingLanguage;
                this.regionId = model.regionId;
                this.runningInstances = model.runningInstances;
                this.scaleRuleEnabled = model.scaleRuleEnabled;
                this.scaleRuleType = model.scaleRuleType;
                this.tags = model.tags;
            } 

            /**
             * AppDeletingStatus.
             */
            public Builder appDeletingStatus(Boolean appDeletingStatus) {
                this.appDeletingStatus = appDeletingStatus;
                return this;
            }

            /**
             * AppDescription.
             */
            public Builder appDescription(String appDescription) {
                this.appDescription = appDescription;
                return this;
            }

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * AppType.
             */
            public Builder appType(String appType) {
                this.appType = appType;
                return this;
            }

            /**
             * BaseAppId.
             */
            public Builder baseAppId(String baseAppId) {
                this.baseAppId = baseAppId;
                return this;
            }

            /**
             * Cpu.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * Instances.
             */
            public Builder instances(Integer instances) {
                this.instances = instances;
                return this;
            }

            /**
             * Mem.
             */
            public Builder mem(Integer mem) {
                this.mem = mem;
                return this;
            }

            /**
             * MseEnabled.
             */
            public Builder mseEnabled(Boolean mseEnabled) {
                this.mseEnabled = mseEnabled;
                return this;
            }

            /**
             * NamespaceId.
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * NamespaceName.
             */
            public Builder namespaceName(String namespaceName) {
                this.namespaceName = namespaceName;
                return this;
            }

            /**
             * NewSaeVersion.
             */
            public Builder newSaeVersion(String newSaeVersion) {
                this.newSaeVersion = newSaeVersion;
                return this;
            }

            /**
             * ProgrammingLanguage.
             */
            public Builder programmingLanguage(String programmingLanguage) {
                this.programmingLanguage = programmingLanguage;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * RunningInstances.
             */
            public Builder runningInstances(Integer runningInstances) {
                this.runningInstances = runningInstances;
                return this;
            }

            /**
             * ScaleRuleEnabled.
             */
            public Builder scaleRuleEnabled(Boolean scaleRuleEnabled) {
                this.scaleRuleEnabled = scaleRuleEnabled;
                return this;
            }

            /**
             * ScaleRuleType.
             */
            public Builder scaleRuleType(String scaleRuleType) {
                this.scaleRuleType = scaleRuleType;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            public Children build() {
                return new Children(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListApplicationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationsResponseBody</p>
     */
    public static class ApplicationsTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private ApplicationsTags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationsTags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(ApplicationsTags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>value</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ApplicationsTags build() {
                return new ApplicationsTags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListApplicationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationsResponseBody</p>
     */
    public static class Applications extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppDeletingStatus")
        private Boolean appDeletingStatus;

        @com.aliyun.core.annotation.NameInMap("AppDescription")
        private String appDescription;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AppType")
        private String appType;

        @com.aliyun.core.annotation.NameInMap("BaseAppId")
        private String baseAppId;

        @com.aliyun.core.annotation.NameInMap("Children")
        private java.util.List<Children> children;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("DiskSize")
        private Integer diskSize;

        @com.aliyun.core.annotation.NameInMap("EnableIdle")
        private String enableIdle;

        @com.aliyun.core.annotation.NameInMap("ImageUrl")
        private String imageUrl;

        @com.aliyun.core.annotation.NameInMap("Instances")
        private Integer instances;

        @com.aliyun.core.annotation.NameInMap("Mem")
        private Integer mem;

        @com.aliyun.core.annotation.NameInMap("MseEnabled")
        private Boolean mseEnabled;

        @com.aliyun.core.annotation.NameInMap("MseNamespaceId")
        private String mseNamespaceId;

        @com.aliyun.core.annotation.NameInMap("NamespaceId")
        private String namespaceId;

        @com.aliyun.core.annotation.NameInMap("NamespaceName")
        private String namespaceName;

        @com.aliyun.core.annotation.NameInMap("NewSaeVersion")
        private String newSaeVersion;

        @com.aliyun.core.annotation.NameInMap("PackageUrl")
        private String packageUrl;

        @com.aliyun.core.annotation.NameInMap("ProgrammingLanguage")
        private String programmingLanguage;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RunningInstances")
        private Integer runningInstances;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<ApplicationsTags> tags;

        private Applications(Builder builder) {
            this.appDeletingStatus = builder.appDeletingStatus;
            this.appDescription = builder.appDescription;
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.appType = builder.appType;
            this.baseAppId = builder.baseAppId;
            this.children = builder.children;
            this.cpu = builder.cpu;
            this.diskSize = builder.diskSize;
            this.enableIdle = builder.enableIdle;
            this.imageUrl = builder.imageUrl;
            this.instances = builder.instances;
            this.mem = builder.mem;
            this.mseEnabled = builder.mseEnabled;
            this.mseNamespaceId = builder.mseNamespaceId;
            this.namespaceId = builder.namespaceId;
            this.namespaceName = builder.namespaceName;
            this.newSaeVersion = builder.newSaeVersion;
            this.packageUrl = builder.packageUrl;
            this.programmingLanguage = builder.programmingLanguage;
            this.regionId = builder.regionId;
            this.runningInstances = builder.runningInstances;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Applications create() {
            return builder().build();
        }

        /**
         * @return appDeletingStatus
         */
        public Boolean getAppDeletingStatus() {
            return this.appDeletingStatus;
        }

        /**
         * @return appDescription
         */
        public String getAppDescription() {
            return this.appDescription;
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return appType
         */
        public String getAppType() {
            return this.appType;
        }

        /**
         * @return baseAppId
         */
        public String getBaseAppId() {
            return this.baseAppId;
        }

        /**
         * @return children
         */
        public java.util.List<Children> getChildren() {
            return this.children;
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return diskSize
         */
        public Integer getDiskSize() {
            return this.diskSize;
        }

        /**
         * @return enableIdle
         */
        public String getEnableIdle() {
            return this.enableIdle;
        }

        /**
         * @return imageUrl
         */
        public String getImageUrl() {
            return this.imageUrl;
        }

        /**
         * @return instances
         */
        public Integer getInstances() {
            return this.instances;
        }

        /**
         * @return mem
         */
        public Integer getMem() {
            return this.mem;
        }

        /**
         * @return mseEnabled
         */
        public Boolean getMseEnabled() {
            return this.mseEnabled;
        }

        /**
         * @return mseNamespaceId
         */
        public String getMseNamespaceId() {
            return this.mseNamespaceId;
        }

        /**
         * @return namespaceId
         */
        public String getNamespaceId() {
            return this.namespaceId;
        }

        /**
         * @return namespaceName
         */
        public String getNamespaceName() {
            return this.namespaceName;
        }

        /**
         * @return newSaeVersion
         */
        public String getNewSaeVersion() {
            return this.newSaeVersion;
        }

        /**
         * @return packageUrl
         */
        public String getPackageUrl() {
            return this.packageUrl;
        }

        /**
         * @return programmingLanguage
         */
        public String getProgrammingLanguage() {
            return this.programmingLanguage;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return runningInstances
         */
        public Integer getRunningInstances() {
            return this.runningInstances;
        }

        /**
         * @return tags
         */
        public java.util.List<ApplicationsTags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private Boolean appDeletingStatus; 
            private String appDescription; 
            private String appId; 
            private String appName; 
            private String appType; 
            private String baseAppId; 
            private java.util.List<Children> children; 
            private Integer cpu; 
            private Integer diskSize; 
            private String enableIdle; 
            private String imageUrl; 
            private Integer instances; 
            private Integer mem; 
            private Boolean mseEnabled; 
            private String mseNamespaceId; 
            private String namespaceId; 
            private String namespaceName; 
            private String newSaeVersion; 
            private String packageUrl; 
            private String programmingLanguage; 
            private String regionId; 
            private Integer runningInstances; 
            private java.util.List<ApplicationsTags> tags; 

            private Builder() {
            } 

            private Builder(Applications model) {
                this.appDeletingStatus = model.appDeletingStatus;
                this.appDescription = model.appDescription;
                this.appId = model.appId;
                this.appName = model.appName;
                this.appType = model.appType;
                this.baseAppId = model.baseAppId;
                this.children = model.children;
                this.cpu = model.cpu;
                this.diskSize = model.diskSize;
                this.enableIdle = model.enableIdle;
                this.imageUrl = model.imageUrl;
                this.instances = model.instances;
                this.mem = model.mem;
                this.mseEnabled = model.mseEnabled;
                this.mseNamespaceId = model.mseNamespaceId;
                this.namespaceId = model.namespaceId;
                this.namespaceName = model.namespaceName;
                this.newSaeVersion = model.newSaeVersion;
                this.packageUrl = model.packageUrl;
                this.programmingLanguage = model.programmingLanguage;
                this.regionId = model.regionId;
                this.runningInstances = model.runningInstances;
                this.tags = model.tags;
            } 

            /**
             * <p>Indicates whether the application is being deleted. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The application is being deleted.</li>
             * <li><strong>false</strong>: The application is not being deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder appDeletingStatus(Boolean appDeletingStatus) {
                this.appDeletingStatus = appDeletingStatus;
                return this;
            }

            /**
             * <p>The description of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>description</p>
             */
            public Builder appDescription(String appDescription) {
                this.appDescription = appDescription;
                return this;
            }

            /**
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>f7730764-d88f-4b9a-8d8e-cd8efbfe****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The application name.</p>
             * 
             * <strong>example:</strong>
             * <p>demo-app</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * AppType.
             */
            public Builder appType(String appType) {
                this.appType = appType;
                return this;
            }

            /**
             * BaseAppId.
             */
            public Builder baseAppId(String baseAppId) {
                this.baseAppId = baseAppId;
                return this;
            }

            /**
             * Children.
             */
            public Builder children(java.util.List<Children> children) {
                this.children = children;
                return this;
            }

            /**
             * <p>The CPU specifications that are required for each instance. Unit: millicores. This parameter cannot be set to 0. Valid values:</p>
             * <ul>
             * <li><strong>500</strong></li>
             * <li><strong>1000</strong></li>
             * <li><strong>2000</strong></li>
             * <li><strong>4000</strong></li>
             * <li><strong>8000</strong></li>
             * <li><strong>16000</strong></li>
             * <li><strong>32000</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * DiskSize.
             */
            public Builder diskSize(Integer diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * EnableIdle.
             */
            public Builder enableIdle(String enableIdle) {
                this.enableIdle = enableIdle;
                return this;
            }

            /**
             * ImageUrl.
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * <p>The number of application instances.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder instances(Integer instances) {
                this.instances = instances;
                return this;
            }

            /**
             * <p>The memory size that is required by each instance. Unit: MB. This parameter cannot be set to 0. The values of this parameter correspond to the values of the Cpu parameter:</p>
             * <ul>
             * <li>This parameter is set to <strong>1024</strong> if the Cpu parameter is set to 500 or 1000.</li>
             * <li>This parameter is set to <strong>2048</strong> if the Cpu parameter is set to 500, 1000, or 2000.</li>
             * <li>This parameter is set to <strong>4096</strong> if the Cpu parameter is set to 1000, 2000, or 4000.</li>
             * <li>This parameter is set to <strong>8192</strong> if the Cpu parameter is set to 2000, 4000, or 8000.</li>
             * <li>This parameter is set to <strong>12288</strong> if the Cpu parameter is set to 12000.</li>
             * <li>This parameter is set to <strong>16384</strong> if the Cpu parameter is set to 4000, 8000, or 16000.</li>
             * <li>This parameter is set to <strong>24576</strong> if the Cpu parameter is set to 12000.</li>
             * <li>This parameter is set to <strong>32768</strong> if the Cpu parameter is set to 16000.</li>
             * <li>This parameter is set to <strong>65536</strong> if the Cpu parameter is set to 8000, 16000, or 32000.</li>
             * <li>This parameter is set to <strong>131072</strong> if the Cpu parameter is set to 32000.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder mem(Integer mem) {
                this.mem = mem;
                return this;
            }

            /**
             * MseEnabled.
             */
            public Builder mseEnabled(Boolean mseEnabled) {
                this.mseEnabled = mseEnabled;
                return this;
            }

            /**
             * MseNamespaceId.
             */
            public Builder mseNamespaceId(String mseNamespaceId) {
                this.mseNamespaceId = mseNamespaceId;
                return this;
            }

            /**
             * <p>The namespace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing:demo</p>
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * NamespaceName.
             */
            public Builder namespaceName(String namespaceName) {
                this.namespaceName = namespaceName;
                return this;
            }

            /**
             * NewSaeVersion.
             */
            public Builder newSaeVersion(String newSaeVersion) {
                this.newSaeVersion = newSaeVersion;
                return this;
            }

            /**
             * PackageUrl.
             */
            public Builder packageUrl(String packageUrl) {
                this.packageUrl = packageUrl;
                return this;
            }

            /**
             * ProgrammingLanguage.
             */
            public Builder programmingLanguage(String programmingLanguage) {
                this.programmingLanguage = programmingLanguage;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The number of running instances.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder runningInstances(Integer runningInstances) {
                this.runningInstances = runningInstances;
                return this;
            }

            /**
             * <p>The tags of the application.</p>
             */
            public Builder tags(java.util.List<ApplicationsTags> tags) {
                this.tags = tags;
                return this;
            }

            public Applications build() {
                return new Applications(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListApplicationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Applications")
        private java.util.List<Applications> applications;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalSize")
        private Integer totalSize;

        private Data(Builder builder) {
            this.applications = builder.applications;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return applications
         */
        public java.util.List<Applications> getApplications() {
            return this.applications;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalSize
         */
        public Integer getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private java.util.List<Applications> applications; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalSize; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.applications = model.applications;
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalSize = model.totalSize;
            } 

            /**
             * <p>The applications.</p>
             */
            public Builder applications(java.util.List<Applications> applications) {
                this.applications = applications;
                return this;
            }

            /**
             * <p>The number of application instances.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The tags of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The information about applications.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder totalSize(Integer totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
