// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAppsByApiProductResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAppsByApiProductResponseBody</p>
 */
public class DescribeAppsByApiProductResponseBody extends TeaModel {
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

    private DescribeAppsByApiProductResponseBody(Builder builder) {
        this.authorizedApps = builder.authorizedApps;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppsByApiProductResponseBody create() {
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
         * The information about authorized applications.
         */
        public Builder authorizedApps(AuthorizedApps authorizedApps) {
            this.authorizedApps = authorizedApps;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
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

        public DescribeAppsByApiProductResponseBody build() {
            return new DescribeAppsByApiProductResponseBody(this);
        } 

    } 

    public static class AuthorizedApp extends TeaModel {
        @NameInMap("AppId")
        private Long appId;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("AuthValidTime")
        private String authValidTime;

        @NameInMap("AuthorizedTime")
        private String authorizedTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("Extend")
        private String extend;

        private AuthorizedApp(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.authValidTime = builder.authValidTime;
            this.authorizedTime = builder.authorizedTime;
            this.description = builder.description;
            this.extend = builder.extend;
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
         * @return authValidTime
         */
        public String getAuthValidTime() {
            return this.authValidTime;
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
         * @return extend
         */
        public String getExtend() {
            return this.extend;
        }

        public static final class Builder {
            private Long appId; 
            private String appName; 
            private String authValidTime; 
            private String authorizedTime; 
            private String description; 
            private String extend; 

            /**
             * The application ID.
             */
            public Builder appId(Long appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The application name.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * The expiration time of the authorization. The time is in GMT. An empty value indicates that the authorization does not expire.
             */
            public Builder authValidTime(String authValidTime) {
                this.authValidTime = authValidTime;
                return this;
            }

            /**
             * The time when the authorization was created. The time is in GMT.
             */
            public Builder authorizedTime(String authorizedTime) {
                this.authorizedTime = authorizedTime;
                return this;
            }

            /**
             * The authorization description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The extended information.
             */
            public Builder extend(String extend) {
                this.extend = extend;
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
