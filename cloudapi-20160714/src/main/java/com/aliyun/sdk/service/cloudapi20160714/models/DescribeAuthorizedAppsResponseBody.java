// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAuthorizedAppsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAuthorizedAppsResponseBody</p>
 */
public class DescribeAuthorizedAppsResponseBody extends TeaModel {
    @NameInMap("AuthorizedApps")
    private AuthorizedApps authorizedApps;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeAuthorizedAppsResponseBody(Builder builder) {
        this.authorizedApps = builder.authorizedApps;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAuthorizedAppsResponseBody create() {
        return builder().build();
    }

    /**
     * @return authorizedApps
     */
    public AuthorizedApps getAuthorizedApps() {
        return this.authorizedApps;
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
        private AuthorizedApps authorizedApps; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * AuthorizedApps.
         */
        public Builder authorizedApps(AuthorizedApps authorizedApps) {
            this.authorizedApps = authorizedApps;
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

        public DescribeAuthorizedAppsResponseBody build() {
            return new DescribeAuthorizedAppsResponseBody(this);
        } 

    } 

    public static class AuthorizedApp extends TeaModel {
        @NameInMap("AppId")
        private Long appId;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("AuthVaildTime")
        private String authVaildTime;

        @NameInMap("AuthorizationSource")
        private String authorizationSource;

        @NameInMap("AuthorizedTime")
        private String authorizedTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("Operator")
        private String operator;

        @NameInMap("StageName")
        private String stageName;

        private AuthorizedApp(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.authVaildTime = builder.authVaildTime;
            this.authorizationSource = builder.authorizationSource;
            this.authorizedTime = builder.authorizedTime;
            this.description = builder.description;
            this.operator = builder.operator;
            this.stageName = builder.stageName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthorizedApp create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public Long getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return authVaildTime
         */
        public String getAuthVaildTime() {
            return this.authVaildTime;
        }

        /**
         * @return authorizationSource
         */
        public String getAuthorizationSource() {
            return this.authorizationSource;
        }

        /**
         * @return authorizedTime
         */
        public String getAuthorizedTime() {
            return this.authorizedTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return stageName
         */
        public String getStageName() {
            return this.stageName;
        }

        public static final class Builder {
            private Long appId; 
            private String appName; 
            private String authVaildTime; 
            private String authorizationSource; 
            private String authorizedTime; 
            private String description; 
            private String operator; 
            private String stageName; 

            /**
             * AppId.
             */
            public Builder appId(Long appId) {
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
             * AuthVaildTime.
             */
            public Builder authVaildTime(String authVaildTime) {
                this.authVaildTime = authVaildTime;
                return this;
            }

            /**
             * AuthorizationSource.
             */
            public Builder authorizationSource(String authorizationSource) {
                this.authorizationSource = authorizationSource;
                return this;
            }

            /**
             * AuthorizedTime.
             */
            public Builder authorizedTime(String authorizedTime) {
                this.authorizedTime = authorizedTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * StageName.
             */
            public Builder stageName(String stageName) {
                this.stageName = stageName;
                return this;
            }

            public AuthorizedApp build() {
                return new AuthorizedApp(this);
            } 

        } 

    }
    public static class AuthorizedApps extends TeaModel {
        @NameInMap("AuthorizedApp")
        private java.util.List < AuthorizedApp> authorizedApp;

        private AuthorizedApps(Builder builder) {
            this.authorizedApp = builder.authorizedApp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthorizedApps create() {
            return builder().build();
        }

        /**
         * @return authorizedApp
         */
        public java.util.List < AuthorizedApp> getAuthorizedApp() {
            return this.authorizedApp;
        }

        public static final class Builder {
            private java.util.List < AuthorizedApp> authorizedApp; 

            /**
             * AuthorizedApp.
             */
            public Builder authorizedApp(java.util.List < AuthorizedApp> authorizedApp) {
                this.authorizedApp = authorizedApp;
                return this;
            }

            public AuthorizedApps build() {
                return new AuthorizedApps(this);
            } 

        } 

    }
}
