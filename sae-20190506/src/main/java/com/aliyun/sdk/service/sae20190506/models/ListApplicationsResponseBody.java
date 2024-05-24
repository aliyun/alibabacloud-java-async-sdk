// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * Queries applications.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * 20
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The number of the returned page.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The number of entries returned on each page.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * 20
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * cn-beijing:demo
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The number of entries returned on each page.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 1
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * demo-app
         */
        public Builder totalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }

        public ListApplicationsResponseBody build() {
            return new ListApplicationsResponseBody(this);
        } 

    } 

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
    public static class Children extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppDeletingStatus")
        private Boolean appDeletingStatus;

        @com.aliyun.core.annotation.NameInMap("AppDescription")
        private String appDescription;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

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
        private java.util.List < Tags> tags;

        private Children(Builder builder) {
            this.appDeletingStatus = builder.appDeletingStatus;
            this.appDescription = builder.appDescription;
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.baseAppId = builder.baseAppId;
            this.cpu = builder.cpu;
            this.instances = builder.instances;
            this.mem = builder.mem;
            this.mseEnabled = builder.mseEnabled;
            this.namespaceId = builder.namespaceId;
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
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private Boolean appDeletingStatus; 
            private String appDescription; 
            private String appId; 
            private String appName; 
            private String baseAppId; 
            private Integer cpu; 
            private Integer instances; 
            private Integer mem; 
            private Boolean mseEnabled; 
            private String namespaceId; 
            private String programmingLanguage; 
            private String regionId; 
            private Integer runningInstances; 
            private Boolean scaleRuleEnabled; 
            private String scaleRuleType; 
            private java.util.List < Tags> tags; 

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
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            public Children build() {
                return new Children(this);
            } 

        } 

    }
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

            /**
             * appName
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The key of the tag.
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
    public static class Applications extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppDeletingStatus")
        private Boolean appDeletingStatus;

        @com.aliyun.core.annotation.NameInMap("AppDescription")
        private String appDescription;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("BaseAppId")
        private String baseAppId;

        @com.aliyun.core.annotation.NameInMap("Children")
        private java.util.List < Children> children;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

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

        @com.aliyun.core.annotation.NameInMap("ProgrammingLanguage")
        private String programmingLanguage;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RunningInstances")
        private Integer runningInstances;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < ApplicationsTags> tags;

        private Applications(Builder builder) {
            this.appDeletingStatus = builder.appDeletingStatus;
            this.appDescription = builder.appDescription;
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.baseAppId = builder.baseAppId;
            this.children = builder.children;
            this.cpu = builder.cpu;
            this.instances = builder.instances;
            this.mem = builder.mem;
            this.mseEnabled = builder.mseEnabled;
            this.mseNamespaceId = builder.mseNamespaceId;
            this.namespaceId = builder.namespaceId;
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
         * @return baseAppId
         */
        public String getBaseAppId() {
            return this.baseAppId;
        }

        /**
         * @return children
         */
        public java.util.List < Children> getChildren() {
            return this.children;
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
        public java.util.List < ApplicationsTags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private Boolean appDeletingStatus; 
            private String appDescription; 
            private String appId; 
            private String appName; 
            private String baseAppId; 
            private java.util.List < Children> children; 
            private Integer cpu; 
            private Integer instances; 
            private Integer mem; 
            private Boolean mseEnabled; 
            private String mseNamespaceId; 
            private String namespaceId; 
            private String programmingLanguage; 
            private String regionId; 
            private Integer runningInstances; 
            private java.util.List < ApplicationsTags> tags; 

            /**
             * demo-app
             */
            public Builder appDeletingStatus(Boolean appDeletingStatus) {
                this.appDeletingStatus = appDeletingStatus;
                return this;
            }

            /**
             * \[{"key":"key","value":"value"}]
             */
            public Builder appDescription(String appDescription) {
                this.appDescription = appDescription;
                return this;
            }

            /**
             * The total number of applications.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The ID of the application.
             */
            public Builder appName(String appName) {
                this.appName = appName;
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
            public Builder children(java.util.List < Children> children) {
                this.children = children;
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
             * The total number of applications.
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
             * MseNamespaceId.
             */
            public Builder mseNamespaceId(String mseNamespaceId) {
                this.mseNamespaceId = mseNamespaceId;
                return this;
            }

            /**
             * demo-app
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
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
             * The number of running instances.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The value of the tag.
             */
            public Builder runningInstances(Integer runningInstances) {
                this.runningInstances = runningInstances;
                return this;
            }

            /**
             * cn-beijing:demo
             */
            public Builder tags(java.util.List < ApplicationsTags> tags) {
                this.tags = tags;
                return this;
            }

            public Applications build() {
                return new Applications(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Applications")
        private java.util.List < Applications> applications;

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
        public java.util.List < Applications> getApplications() {
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
            private java.util.List < Applications> applications; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalSize; 

            /**
             * The description of the application.
             */
            public Builder applications(java.util.List < Applications> applications) {
                this.applications = applications;
                return this;
            }

            /**
             * The number of application instances.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The tags of the application.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The information about applications.
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
