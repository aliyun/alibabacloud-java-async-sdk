// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAuthorizedAppsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAuthorizedAppsResponseBody</p>
 */
public class DescribeAuthorizedAppsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthorizedApps")
    private AuthorizedApps authorizedApps;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * The returned group set.
         */
        public Builder authorizedApps(AuthorizedApps authorizedApps) {
            this.authorizedApps = authorizedApps;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of returned entries.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAuthorizedAppsResponseBody build() {
            return new DescribeAuthorizedAppsResponseBody(this);
        } 

    } 

    public static class TagInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private TagInfo(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagInfo create() {
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

            public TagInfo build() {
                return new TagInfo(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagInfo")
        private java.util.List < TagInfo> tagInfo;

        private Tag(Builder builder) {
            this.tagInfo = builder.tagInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return tagInfo
         */
        public java.util.List < TagInfo> getTagInfo() {
            return this.tagInfo;
        }

        public static final class Builder {
            private java.util.List < TagInfo> tagInfo; 

            /**
             * TagInfo.
             */
            public Builder tagInfo(java.util.List < TagInfo> tagInfo) {
                this.tagInfo = tagInfo;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class AuthorizedApp extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppDescription")
        private String appDescription;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private Long appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AuthVaildTime")
        private String authVaildTime;

        @com.aliyun.core.annotation.NameInMap("AuthorizationSource")
        private String authorizationSource;

        @com.aliyun.core.annotation.NameInMap("AuthorizedTime")
        private String authorizedTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("StageAlias")
        private String stageAlias;

        @com.aliyun.core.annotation.NameInMap("StageName")
        private String stageName;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private Tag tag;

        private AuthorizedApp(Builder builder) {
            this.appDescription = builder.appDescription;
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.authVaildTime = builder.authVaildTime;
            this.authorizationSource = builder.authorizationSource;
            this.authorizedTime = builder.authorizedTime;
            this.description = builder.description;
            this.operator = builder.operator;
            this.stageAlias = builder.stageAlias;
            this.stageName = builder.stageName;
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthorizedApp create() {
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
         * @return stageAlias
         */
        public String getStageAlias() {
            return this.stageAlias;
        }

        /**
         * @return stageName
         */
        public String getStageName() {
            return this.stageName;
        }

        /**
         * @return tag
         */
        public Tag getTag() {
            return this.tag;
        }

        public static final class Builder {
            private String appDescription; 
            private Long appId; 
            private String appName; 
            private String authVaildTime; 
            private String authorizationSource; 
            private String authorizedTime; 
            private String description; 
            private String operator; 
            private String stageAlias; 
            private String stageName; 
            private Tag tag; 

            /**
             * The description of the application.
             */
            public Builder appDescription(String appDescription) {
                this.appDescription = appDescription;
                return this;
            }

            /**
             * The ID, which is generated by the system and globally unique.
             */
            public Builder appId(Long appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The application name
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * The application name.
             */
            public Builder authVaildTime(String authVaildTime) {
                this.authVaildTime = authVaildTime;
                return this;
            }

            /**
             * The authorization source. Valid values:
             * <p>
             * 
             * *   **CONSOLE**
             * *   **API**
             */
            public Builder authorizationSource(String authorizationSource) {
                this.authorizationSource = authorizationSource;
                return this;
            }

            /**
             * The authorization time (UTC).
             */
            public Builder authorizedTime(String authorizedTime) {
                this.authorizedTime = authorizedTime;
                return this;
            }

            /**
             * The description of the authorization.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The authorizer. Valid values:
             * <p>
             * 
             * *   **PROVIDER**: API owner
             * *   **CONSUMER**: API caller
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * The environment alias.
             */
            public Builder stageAlias(String stageAlias) {
                this.stageAlias = stageAlias;
                return this;
            }

            /**
             * The environment to which the API is published. Valid values:
             * <p>
             * 
             * *   **RELEASE**: the production environment
             * *   **PRE**: the staging environment
             * *   **TEST**: the test environment
             */
            public Builder stageName(String stageName) {
                this.stageName = stageName;
                return this;
            }

            /**
             * Tag.
             */
            public Builder tag(Tag tag) {
                this.tag = tag;
                return this;
            }

            public AuthorizedApp build() {
                return new AuthorizedApp(this);
            } 

        } 

    }
    public static class AuthorizedApps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthorizedApp")
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
