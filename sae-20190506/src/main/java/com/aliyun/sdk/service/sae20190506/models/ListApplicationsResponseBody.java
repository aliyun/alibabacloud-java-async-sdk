// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListApplicationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListApplicationsResponseBody</p>
 */
public class ListApplicationsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalSize")
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
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class Applications extends TeaModel {
        @NameInMap("AppDeletingStatus")
        private Boolean appDeletingStatus;

        @NameInMap("AppDescription")
        private String appDescription;

        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("Cpu")
        private Integer cpu;

        @NameInMap("Instances")
        private Integer instances;

        @NameInMap("Mem")
        private Integer mem;

        @NameInMap("NamespaceId")
        private String namespaceId;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RunningInstances")
        private Integer runningInstances;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        private Applications(Builder builder) {
            this.appDeletingStatus = builder.appDeletingStatus;
            this.appDescription = builder.appDescription;
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.cpu = builder.cpu;
            this.instances = builder.instances;
            this.mem = builder.mem;
            this.namespaceId = builder.namespaceId;
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
         * @return namespaceId
         */
        public String getNamespaceId() {
            return this.namespaceId;
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
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private Boolean appDeletingStatus; 
            private String appDescription; 
            private String appId; 
            private String appName; 
            private Integer cpu; 
            private Integer instances; 
            private Integer mem; 
            private String namespaceId; 
            private String regionId; 
            private Integer runningInstances; 
            private java.util.List < Tags> tags; 

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
             * demo-app
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
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
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            public Applications build() {
                return new Applications(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Applications")
        private java.util.List < Applications> applications;

        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalSize")
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
