// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeAuthorizedAppsResponseBody model) {
            this.authorizedApps = model.authorizedApps;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The authorized applications.</p>
         */
        public Builder authorizedApps(AuthorizedApps authorizedApps) {
            this.authorizedApps = authorizedApps;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D6E46F10-F26C-4AA0-BB69-FE2743D9AE62</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAuthorizedAppsResponseBody build() {
            return new DescribeAuthorizedAppsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAuthorizedAppsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAuthorizedAppsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(TagInfo model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>DEV</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>240</p>
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
    /**
     * 
     * {@link DescribeAuthorizedAppsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAuthorizedAppsResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagInfo")
        private java.util.List<TagInfo> tagInfo;

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
        public java.util.List<TagInfo> getTagInfo() {
            return this.tagInfo;
        }

        public static final class Builder {
            private java.util.List<TagInfo> tagInfo; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.tagInfo = model.tagInfo;
            } 

            /**
             * TagInfo.
             */
            public Builder tagInfo(java.util.List<TagInfo> tagInfo) {
                this.tagInfo = tagInfo;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAuthorizedAppsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAuthorizedAppsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(AuthorizedApp model) {
                this.appDescription = model.appDescription;
                this.appId = model.appId;
                this.appName = model.appName;
                this.authVaildTime = model.authVaildTime;
                this.authorizationSource = model.authorizationSource;
                this.authorizedTime = model.authorizedTime;
                this.description = model.description;
                this.operator = model.operator;
                this.stageAlias = model.stageAlias;
                this.stageName = model.stageName;
                this.tag = model.tag;
            } 

            /**
             * <p>The application description.</p>
             * 
             * <strong>example:</strong>
             * <p>Production application</p>
             */
            public Builder appDescription(String appDescription) {
                this.appDescription = appDescription;
                return this;
            }

            /**
             * <p>The application ID, which is generated by the system and globally unique.</p>
             * 
             * <strong>example:</strong>
             * <p>2386789</p>
             */
            public Builder appId(Long appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The application name.</p>
             * 
             * <strong>example:</strong>
             * <p>Weather</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The application name.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-10-05T16:00:00Z</p>
             */
            public Builder authVaildTime(String authVaildTime) {
                this.authVaildTime = authVaildTime;
                return this;
            }

            /**
             * <p>The authorization source. Valid values:</p>
             * <ul>
             * <li><strong>CONSOLE</strong></li>
             * <li><strong>API</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CONSOLE</p>
             */
            public Builder authorizationSource(String authorizationSource) {
                this.authorizationSource = authorizationSource;
                return this;
            }

            /**
             * <p>The authorization time (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2016-07-21T06:17:20Z</p>
             */
            public Builder authorizedTime(String authorizedTime) {
                this.authorizedTime = authorizedTime;
                return this;
            }

            /**
             * <p>The authorization description.</p>
             * 
             * <strong>example:</strong>
             * <p>Queries weather based on the region name</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The authorizer. Valid values:</p>
             * <ul>
             * <li><strong>PROVIDER</strong>: API owner</li>
             * <li><strong>CONSUMER</strong>: API caller</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PROVIDER</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>The environment alias.</p>
             * 
             * <strong>example:</strong>
             * <p>Production</p>
             */
            public Builder stageAlias(String stageAlias) {
                this.stageAlias = stageAlias;
                return this;
            }

            /**
             * <p>The environment to which the API is published. Valid values:</p>
             * <ul>
             * <li><strong>RELEASE</strong>: the production environment</li>
             * <li><strong>PRE</strong>: the staging environment</li>
             * <li><strong>TEST</strong>: the test environment</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RELEASE</p>
             */
            public Builder stageName(String stageName) {
                this.stageName = stageName;
                return this;
            }

            /**
             * <p>The key of the tag.</p>
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
    /**
     * 
     * {@link DescribeAuthorizedAppsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAuthorizedAppsResponseBody</p>
     */
    public static class AuthorizedApps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthorizedApp")
        private java.util.List<AuthorizedApp> authorizedApp;

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
        public java.util.List<AuthorizedApp> getAuthorizedApp() {
            return this.authorizedApp;
        }

        public static final class Builder {
            private java.util.List<AuthorizedApp> authorizedApp; 

            private Builder() {
            } 

            private Builder(AuthorizedApps model) {
                this.authorizedApp = model.authorizedApp;
            } 

            /**
             * AuthorizedApp.
             */
            public Builder authorizedApp(java.util.List<AuthorizedApp> authorizedApp) {
                this.authorizedApp = authorizedApp;
                return this;
            }

            public AuthorizedApps build() {
                return new AuthorizedApps(this);
            } 

        } 

    }
}
