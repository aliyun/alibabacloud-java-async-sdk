// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApplicationsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApplicationsResponseBody</p>
 */
public class DescribeApplicationsResponseBody extends TeaModel {
    @NameInMap("Applications")
    private Applications applications;

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

    private DescribeApplicationsResponseBody(Builder builder) {
        this.applications = builder.applications;
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

    public static DescribeApplicationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return applications
     */
    public Applications getApplications() {
        return this.applications;
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
        private Applications applications; 
        private String code; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Applications.
         */
        public Builder applications(Applications applications) {
            this.applications = applications;
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

        public DescribeApplicationsResponseBody build() {
            return new DescribeApplicationsResponseBody(this);
        } 

    } 

    public static class Application extends TeaModel {
        @NameInMap("AppDescription")
        private String appDescription;

        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("CategoryName")
        private String categoryName;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("CreateUsername")
        private String createUsername;

        @NameInMap("RunningEnvs")
        private Integer runningEnvs;

        @NameInMap("TerminatedEnvs")
        private Integer terminatedEnvs;

        @NameInMap("TotalEnvs")
        private Integer totalEnvs;

        @NameInMap("UpdateTime")
        private Long updateTime;

        @NameInMap("UpdateUsername")
        private String updateUsername;

        @NameInMap("UsingSharedStorage")
        private String usingSharedStorage;

        private Application(Builder builder) {
            this.appDescription = builder.appDescription;
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.categoryName = builder.categoryName;
            this.createTime = builder.createTime;
            this.createUsername = builder.createUsername;
            this.runningEnvs = builder.runningEnvs;
            this.terminatedEnvs = builder.terminatedEnvs;
            this.totalEnvs = builder.totalEnvs;
            this.updateTime = builder.updateTime;
            this.updateUsername = builder.updateUsername;
            this.usingSharedStorage = builder.usingSharedStorage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Application create() {
            return builder().build();
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
         * @return categoryName
         */
        public String getCategoryName() {
            return this.categoryName;
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
         * @return runningEnvs
         */
        public Integer getRunningEnvs() {
            return this.runningEnvs;
        }

        /**
         * @return terminatedEnvs
         */
        public Integer getTerminatedEnvs() {
            return this.terminatedEnvs;
        }

        /**
         * @return totalEnvs
         */
        public Integer getTotalEnvs() {
            return this.totalEnvs;
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
        public String getUsingSharedStorage() {
            return this.usingSharedStorage;
        }

        public static final class Builder {
            private String appDescription; 
            private String appId; 
            private String appName; 
            private String categoryName; 
            private Long createTime; 
            private String createUsername; 
            private Integer runningEnvs; 
            private Integer terminatedEnvs; 
            private Integer totalEnvs; 
            private Long updateTime; 
            private String updateUsername; 
            private String usingSharedStorage; 

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
             * CategoryName.
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
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
             * RunningEnvs.
             */
            public Builder runningEnvs(Integer runningEnvs) {
                this.runningEnvs = runningEnvs;
                return this;
            }

            /**
             * TerminatedEnvs.
             */
            public Builder terminatedEnvs(Integer terminatedEnvs) {
                this.terminatedEnvs = terminatedEnvs;
                return this;
            }

            /**
             * TotalEnvs.
             */
            public Builder totalEnvs(Integer totalEnvs) {
                this.totalEnvs = totalEnvs;
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
            public Builder usingSharedStorage(String usingSharedStorage) {
                this.usingSharedStorage = usingSharedStorage;
                return this;
            }

            public Application build() {
                return new Application(this);
            } 

        } 

    }
    public static class Applications extends TeaModel {
        @NameInMap("Application")
        private java.util.List < Application> application;

        private Applications(Builder builder) {
            this.application = builder.application;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Applications create() {
            return builder().build();
        }

        /**
         * @return application
         */
        public java.util.List < Application> getApplication() {
            return this.application;
        }

        public static final class Builder {
            private java.util.List < Application> application; 

            /**
             * Application.
             */
            public Builder application(java.util.List < Application> application) {
                this.application = application;
                return this;
            }

            public Applications build() {
                return new Applications(this);
            } 

        } 

    }
}
