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
 * {@link DescribeAppsByApiProductResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAppsByApiProductResponseBody</p>
 */
public class DescribeAppsByApiProductResponseBody extends TeaModel {
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
         * <p>The information about authorized applications.</p>
         */
        public Builder authorizedApps(AuthorizedApps authorizedApps) {
            this.authorizedApps = authorizedApps;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AC866798-62D3-52F4-8AB5-CA149A53984F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAppsByApiProductResponseBody build() {
            return new DescribeAppsByApiProductResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAppsByApiProductResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppsByApiProductResponseBody</p>
     */
    public static class AuthorizedApp extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private Long appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AuthValidTime")
        private String authValidTime;

        @com.aliyun.core.annotation.NameInMap("AuthorizedTime")
        private String authorizedTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Extend")
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
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>110982419</p>
             */
            public Builder appId(Long appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The application name.</p>
             * 
             * <strong>example:</strong>
             * <p>APP_02580_DEV</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The expiration time of the authorization. The time is in GMT. An empty value indicates that the authorization does not expire.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-06-17T03:41:53Z</p>
             */
            public Builder authValidTime(String authValidTime) {
                this.authValidTime = authValidTime;
                return this;
            }

            /**
             * <p>The time when the authorization was created. The time is in GMT.</p>
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
             * <p>Test share with nsc qiming</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The extended information.</p>
             * 
             * <strong>example:</strong>
             * <p>extra info</p>
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
    /**
     * 
     * {@link DescribeAppsByApiProductResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppsByApiProductResponseBody</p>
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
