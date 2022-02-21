// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAppEnvsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAppEnvsResponseBody</p>
 */
public class DescribeAppEnvsResponseBody extends TeaModel {
    @NameInMap("AppEnvs")
    private AppEnvs appEnvs;

    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeAppEnvsResponseBody(Builder builder) {
        this.appEnvs = builder.appEnvs;
        this.code = builder.code;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppEnvsResponseBody create() {
        return builder().build();
    }

    /**
     * @return appEnvs
     */
    public AppEnvs getAppEnvs() {
        return this.appEnvs;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private AppEnvs appEnvs; 
        private String code; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * AppEnvs.
         */
        public Builder appEnvs(AppEnvs appEnvs) {
            this.appEnvs = appEnvs;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAppEnvsResponseBody build() {
            return new DescribeAppEnvsResponseBody(this);
        } 

    } 

    public static class AppEnv extends TeaModel {
        @NameInMap("AbortingChange")
        private Boolean abortingChange;

        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("ApplyingChange")
        private Boolean applyingChange;

        @NameInMap("CategoryName")
        private String categoryName;

        @NameInMap("ChangeBanner")
        private String changeBanner;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("CreateUsername")
        private String createUsername;

        @NameInMap("DataRoot")
        private String dataRoot;

        @NameInMap("EnvDescription")
        private String envDescription;

        @NameInMap("EnvId")
        private String envId;

        @NameInMap("EnvName")
        private String envName;

        @NameInMap("EnvStatus")
        private String envStatus;

        @NameInMap("EnvType")
        private String envType;

        @NameInMap("LastEnvStatus")
        private String lastEnvStatus;

        @NameInMap("LatestChangeId")
        private String latestChangeId;

        @NameInMap("LogBase")
        private String logBase;

        @NameInMap("PkgVersionId")
        private String pkgVersionId;

        @NameInMap("PkgVersionLabel")
        private String pkgVersionLabel;

        @NameInMap("PkgVersionStorageKey")
        private String pkgVersionStorageKey;

        @NameInMap("StackId")
        private String stackId;

        @NameInMap("StackName")
        private String stackName;

        @NameInMap("StorageBase")
        private String storageBase;

        @NameInMap("TotalInstances")
        private Long totalInstances;

        @NameInMap("UpdateTime")
        private Long updateTime;

        @NameInMap("UpdateUsername")
        private String updateUsername;

        @NameInMap("UsingSharedStorage")
        private Boolean usingSharedStorage;

        private AppEnv(Builder builder) {
            this.abortingChange = builder.abortingChange;
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.applyingChange = builder.applyingChange;
            this.categoryName = builder.categoryName;
            this.changeBanner = builder.changeBanner;
            this.createTime = builder.createTime;
            this.createUsername = builder.createUsername;
            this.dataRoot = builder.dataRoot;
            this.envDescription = builder.envDescription;
            this.envId = builder.envId;
            this.envName = builder.envName;
            this.envStatus = builder.envStatus;
            this.envType = builder.envType;
            this.lastEnvStatus = builder.lastEnvStatus;
            this.latestChangeId = builder.latestChangeId;
            this.logBase = builder.logBase;
            this.pkgVersionId = builder.pkgVersionId;
            this.pkgVersionLabel = builder.pkgVersionLabel;
            this.pkgVersionStorageKey = builder.pkgVersionStorageKey;
            this.stackId = builder.stackId;
            this.stackName = builder.stackName;
            this.storageBase = builder.storageBase;
            this.totalInstances = builder.totalInstances;
            this.updateTime = builder.updateTime;
            this.updateUsername = builder.updateUsername;
            this.usingSharedStorage = builder.usingSharedStorage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppEnv create() {
            return builder().build();
        }

        /**
         * @return abortingChange
         */
        public Boolean getAbortingChange() {
            return this.abortingChange;
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
         * @return applyingChange
         */
        public Boolean getApplyingChange() {
            return this.applyingChange;
        }

        /**
         * @return categoryName
         */
        public String getCategoryName() {
            return this.categoryName;
        }

        /**
         * @return changeBanner
         */
        public String getChangeBanner() {
            return this.changeBanner;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createUsername
         */
        public String getCreateUsername() {
            return this.createUsername;
        }

        /**
         * @return dataRoot
         */
        public String getDataRoot() {
            return this.dataRoot;
        }

        /**
         * @return envDescription
         */
        public String getEnvDescription() {
            return this.envDescription;
        }

        /**
         * @return envId
         */
        public String getEnvId() {
            return this.envId;
        }

        /**
         * @return envName
         */
        public String getEnvName() {
            return this.envName;
        }

        /**
         * @return envStatus
         */
        public String getEnvStatus() {
            return this.envStatus;
        }

        /**
         * @return envType
         */
        public String getEnvType() {
            return this.envType;
        }

        /**
         * @return lastEnvStatus
         */
        public String getLastEnvStatus() {
            return this.lastEnvStatus;
        }

        /**
         * @return latestChangeId
         */
        public String getLatestChangeId() {
            return this.latestChangeId;
        }

        /**
         * @return logBase
         */
        public String getLogBase() {
            return this.logBase;
        }

        /**
         * @return pkgVersionId
         */
        public String getPkgVersionId() {
            return this.pkgVersionId;
        }

        /**
         * @return pkgVersionLabel
         */
        public String getPkgVersionLabel() {
            return this.pkgVersionLabel;
        }

        /**
         * @return pkgVersionStorageKey
         */
        public String getPkgVersionStorageKey() {
            return this.pkgVersionStorageKey;
        }

        /**
         * @return stackId
         */
        public String getStackId() {
            return this.stackId;
        }

        /**
         * @return stackName
         */
        public String getStackName() {
            return this.stackName;
        }

        /**
         * @return storageBase
         */
        public String getStorageBase() {
            return this.storageBase;
        }

        /**
         * @return totalInstances
         */
        public Long getTotalInstances() {
            return this.totalInstances;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return updateUsername
         */
        public String getUpdateUsername() {
            return this.updateUsername;
        }

        /**
         * @return usingSharedStorage
         */
        public Boolean getUsingSharedStorage() {
            return this.usingSharedStorage;
        }

        public static final class Builder {
            private Boolean abortingChange; 
            private String appId; 
            private String appName; 
            private Boolean applyingChange; 
            private String categoryName; 
            private String changeBanner; 
            private Long createTime; 
            private String createUsername; 
            private String dataRoot; 
            private String envDescription; 
            private String envId; 
            private String envName; 
            private String envStatus; 
            private String envType; 
            private String lastEnvStatus; 
            private String latestChangeId; 
            private String logBase; 
            private String pkgVersionId; 
            private String pkgVersionLabel; 
            private String pkgVersionStorageKey; 
            private String stackId; 
            private String stackName; 
            private String storageBase; 
            private Long totalInstances; 
            private Long updateTime; 
            private String updateUsername; 
            private Boolean usingSharedStorage; 

            /**
             * AbortingChange.
             */
            public Builder abortingChange(Boolean abortingChange) {
                this.abortingChange = abortingChange;
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
             * ApplyingChange.
             */
            public Builder applyingChange(Boolean applyingChange) {
                this.applyingChange = applyingChange;
                return this;
            }

            /**
             * CategoryName.
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * ChangeBanner.
             */
            public Builder changeBanner(String changeBanner) {
                this.changeBanner = changeBanner;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreateUsername.
             */
            public Builder createUsername(String createUsername) {
                this.createUsername = createUsername;
                return this;
            }

            /**
             * DataRoot.
             */
            public Builder dataRoot(String dataRoot) {
                this.dataRoot = dataRoot;
                return this;
            }

            /**
             * EnvDescription.
             */
            public Builder envDescription(String envDescription) {
                this.envDescription = envDescription;
                return this;
            }

            /**
             * EnvId.
             */
            public Builder envId(String envId) {
                this.envId = envId;
                return this;
            }

            /**
             * EnvName.
             */
            public Builder envName(String envName) {
                this.envName = envName;
                return this;
            }

            /**
             * EnvStatus.
             */
            public Builder envStatus(String envStatus) {
                this.envStatus = envStatus;
                return this;
            }

            /**
             * EnvType.
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * LastEnvStatus.
             */
            public Builder lastEnvStatus(String lastEnvStatus) {
                this.lastEnvStatus = lastEnvStatus;
                return this;
            }

            /**
             * LatestChangeId.
             */
            public Builder latestChangeId(String latestChangeId) {
                this.latestChangeId = latestChangeId;
                return this;
            }

            /**
             * LogBase.
             */
            public Builder logBase(String logBase) {
                this.logBase = logBase;
                return this;
            }

            /**
             * PkgVersionId.
             */
            public Builder pkgVersionId(String pkgVersionId) {
                this.pkgVersionId = pkgVersionId;
                return this;
            }

            /**
             * PkgVersionLabel.
             */
            public Builder pkgVersionLabel(String pkgVersionLabel) {
                this.pkgVersionLabel = pkgVersionLabel;
                return this;
            }

            /**
             * PkgVersionStorageKey.
             */
            public Builder pkgVersionStorageKey(String pkgVersionStorageKey) {
                this.pkgVersionStorageKey = pkgVersionStorageKey;
                return this;
            }

            /**
             * StackId.
             */
            public Builder stackId(String stackId) {
                this.stackId = stackId;
                return this;
            }

            /**
             * StackName.
             */
            public Builder stackName(String stackName) {
                this.stackName = stackName;
                return this;
            }

            /**
             * StorageBase.
             */
            public Builder storageBase(String storageBase) {
                this.storageBase = storageBase;
                return this;
            }

            /**
             * TotalInstances.
             */
            public Builder totalInstances(Long totalInstances) {
                this.totalInstances = totalInstances;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * UpdateUsername.
             */
            public Builder updateUsername(String updateUsername) {
                this.updateUsername = updateUsername;
                return this;
            }

            /**
             * UsingSharedStorage.
             */
            public Builder usingSharedStorage(Boolean usingSharedStorage) {
                this.usingSharedStorage = usingSharedStorage;
                return this;
            }

            public AppEnv build() {
                return new AppEnv(this);
            } 

        } 

    }
    public static class AppEnvs extends TeaModel {
        @NameInMap("AppEnv")
        private java.util.List < AppEnv> appEnv;

        private AppEnvs(Builder builder) {
            this.appEnv = builder.appEnv;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppEnvs create() {
            return builder().build();
        }

        /**
         * @return appEnv
         */
        public java.util.List < AppEnv> getAppEnv() {
            return this.appEnv;
        }

        public static final class Builder {
            private java.util.List < AppEnv> appEnv; 

            /**
             * AppEnv.
             */
            public Builder appEnv(java.util.List < AppEnv> appEnv) {
                this.appEnv = appEnv;
                return this;
            }

            public AppEnvs build() {
                return new AppEnvs(this);
            } 

        } 

    }
}
