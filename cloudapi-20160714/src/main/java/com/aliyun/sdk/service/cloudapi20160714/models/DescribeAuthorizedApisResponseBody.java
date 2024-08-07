// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAuthorizedApisResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAuthorizedApisResponseBody</p>
 */
public class DescribeAuthorizedApisResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthorizedApis")
    private AuthorizedApis authorizedApis;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeAuthorizedApisResponseBody(Builder builder) {
        this.authorizedApis = builder.authorizedApis;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAuthorizedApisResponseBody create() {
        return builder().build();
    }

    /**
     * @return authorizedApis
     */
    public AuthorizedApis getAuthorizedApis() {
        return this.authorizedApis;
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
        private AuthorizedApis authorizedApis; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The authorized API set.
         */
        public Builder authorizedApis(AuthorizedApis authorizedApis) {
            this.authorizedApis = authorizedApis;
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

        public DescribeAuthorizedApisResponseBody build() {
            return new DescribeAuthorizedApisResponseBody(this);
        } 

    } 

    public static class AuthorizedApi extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiId")
        private String apiId;

        @com.aliyun.core.annotation.NameInMap("ApiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("AuthVaildTime")
        private String authVaildTime;

        @com.aliyun.core.annotation.NameInMap("AuthorizationSource")
        private String authorizationSource;

        @com.aliyun.core.annotation.NameInMap("AuthorizedTime")
        private String authorizedTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("StageName")
        private String stageName;

        private AuthorizedApi(Builder builder) {
            this.apiId = builder.apiId;
            this.apiName = builder.apiName;
            this.authVaildTime = builder.authVaildTime;
            this.authorizationSource = builder.authorizationSource;
            this.authorizedTime = builder.authorizedTime;
            this.description = builder.description;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.operator = builder.operator;
            this.regionId = builder.regionId;
            this.stageName = builder.stageName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthorizedApi create() {
            return builder().build();
        }

        /**
         * @return apiId
         */
        public String getApiId() {
            return this.apiId;
        }

        /**
         * @return apiName
         */
        public String getApiName() {
            return this.apiName;
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
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return stageName
         */
        public String getStageName() {
            return this.stageName;
        }

        public static final class Builder {
            private String apiId; 
            private String apiName; 
            private String authVaildTime; 
            private String authorizationSource; 
            private String authorizedTime; 
            private String description; 
            private String groupId; 
            private String groupName; 
            private String operator; 
            private String regionId; 
            private String stageName; 

            /**
             * The unique identifier of the API, which is automatically generated by the system.
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * The name of the API
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * The expiration time of the authorization in UTC.
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
             * The authorization time in UTC.
             */
            public Builder authorizedTime(String authorizedTime) {
                this.authorizedTime = authorizedTime;
                return this;
            }

            /**
             * Authorization description
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the API group. This ID is generated by the system and globally unique.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The name of the API group.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * The authorizer. Valid values:
             * <p>
             * 
             * *   **PROVIDER:** API owner
             * *   **CONSUMER:** API caller
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * The region to which the API belongs.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The name of the runtime environment. Valid values:
             * <p>
             * 
             * *   **RELEASE**
             * *   **TEST**: the test environment
             */
            public Builder stageName(String stageName) {
                this.stageName = stageName;
                return this;
            }

            public AuthorizedApi build() {
                return new AuthorizedApi(this);
            } 

        } 

    }
    public static class AuthorizedApis extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthorizedApi")
        private java.util.List < AuthorizedApi> authorizedApi;

        private AuthorizedApis(Builder builder) {
            this.authorizedApi = builder.authorizedApi;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthorizedApis create() {
            return builder().build();
        }

        /**
         * @return authorizedApi
         */
        public java.util.List < AuthorizedApi> getAuthorizedApi() {
            return this.authorizedApi;
        }

        public static final class Builder {
            private java.util.List < AuthorizedApi> authorizedApi; 

            /**
             * AuthorizedApi.
             */
            public Builder authorizedApi(java.util.List < AuthorizedApi> authorizedApi) {
                this.authorizedApi = authorizedApi;
                return this;
            }

            public AuthorizedApis build() {
                return new AuthorizedApis(this);
            } 

        } 

    }
}
