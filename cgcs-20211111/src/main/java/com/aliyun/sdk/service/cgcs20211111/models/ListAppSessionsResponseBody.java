// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cgcs20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppSessionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAppSessionsResponseBody</p>
 */
public class ListAppSessionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppSessions")
    private java.util.List < AppSessions> appSessions;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListAppSessionsResponseBody(Builder builder) {
        this.appSessions = builder.appSessions;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppSessionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return appSessions
     */
    public java.util.List < AppSessions> getAppSessions() {
        return this.appSessions;
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
        private java.util.List < AppSessions> appSessions; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * AppSessions.
         */
        public Builder appSessions(java.util.List < AppSessions> appSessions) {
            this.appSessions = appSessions;
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

        public ListAppSessionsResponseBody build() {
            return new ListAppSessionsResponseBody(this);
        } 

    } 

    public static class BizInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("StopTime")
        private String stopTime;

        private BizInfo(Builder builder) {
            this.startTime = builder.startTime;
            this.stopTime = builder.stopTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BizInfo create() {
            return builder().build();
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return stopTime
         */
        public String getStopTime() {
            return this.stopTime;
        }

        public static final class Builder {
            private String startTime; 
            private String stopTime; 

            /**
             * 会话启动时间
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * 会话停止时间
             */
            public Builder stopTime(String stopTime) {
                this.stopTime = stopTime;
                return this;
            }

            public BizInfo build() {
                return new BizInfo(this);
            } 

        } 

    }
    public static class AppSessions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppVersion")
        private String appVersion;

        @com.aliyun.core.annotation.NameInMap("BizInfo")
        private BizInfo bizInfo;

        @com.aliyun.core.annotation.NameInMap("CustomSessionId")
        private String customSessionId;

        @com.aliyun.core.annotation.NameInMap("PlatformSessionId")
        private String platformSessionId;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private AppSessions(Builder builder) {
            this.appId = builder.appId;
            this.appVersion = builder.appVersion;
            this.bizInfo = builder.bizInfo;
            this.customSessionId = builder.customSessionId;
            this.platformSessionId = builder.platformSessionId;
            this.projectId = builder.projectId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppSessions create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appVersion
         */
        public String getAppVersion() {
            return this.appVersion;
        }

        /**
         * @return bizInfo
         */
        public BizInfo getBizInfo() {
            return this.bizInfo;
        }

        /**
         * @return customSessionId
         */
        public String getCustomSessionId() {
            return this.customSessionId;
        }

        /**
         * @return platformSessionId
         */
        public String getPlatformSessionId() {
            return this.platformSessionId;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String appId; 
            private String appVersion; 
            private BizInfo bizInfo; 
            private String customSessionId; 
            private String platformSessionId; 
            private String projectId; 
            private String status; 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AppVersion.
             */
            public Builder appVersion(String appVersion) {
                this.appVersion = appVersion;
                return this;
            }

            /**
             * 业务特定的信息，如会话启动/停止时间。
             */
            public Builder bizInfo(BizInfo bizInfo) {
                this.bizInfo = bizInfo;
                return this;
            }

            /**
             * CustomSessionId.
             */
            public Builder customSessionId(String customSessionId) {
                this.customSessionId = customSessionId;
                return this;
            }

            /**
             * PlatformSessionId.
             */
            public Builder platformSessionId(String platformSessionId) {
                this.platformSessionId = platformSessionId;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public AppSessions build() {
                return new AppSessions(this);
            } 

        } 

    }
}
