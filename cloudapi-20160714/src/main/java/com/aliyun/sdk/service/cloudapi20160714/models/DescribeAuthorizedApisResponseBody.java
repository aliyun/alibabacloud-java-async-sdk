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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeAuthorizedApisResponseBody model) {
            this.authorizedApis = model.authorizedApis;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The authorized API set.</p>
         */
        public Builder authorizedApis(AuthorizedApis authorizedApis) {
            this.authorizedApis = authorizedApis;
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

        public DescribeAuthorizedApisResponseBody build() {
            return new DescribeAuthorizedApisResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAuthorizedApisResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAuthorizedApisResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(AuthorizedApi model) {
                this.apiId = model.apiId;
                this.apiName = model.apiName;
                this.authVaildTime = model.authVaildTime;
                this.authorizationSource = model.authorizationSource;
                this.authorizedTime = model.authorizedTime;
                this.description = model.description;
                this.groupId = model.groupId;
                this.groupName = model.groupName;
                this.operator = model.operator;
                this.regionId = model.regionId;
                this.stageName = model.stageName;
            } 

            /**
             * <p>The unique identifier of the API, which is automatically generated by the system.</p>
             * 
             * <strong>example:</strong>
             * <p>baacc592e63a4cb6a41920d9d3f91f38</p>
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * <p>The name of the API</p>
             * 
             * <strong>example:</strong>
             * <p>AreaWeather</p>
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * <p>The expiration time of the authorization in UTC.</p>
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
             * <p>The authorization time in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2016-07-21T06:17:20</p>
             */
            public Builder authorizedTime(String authorizedTime) {
                this.authorizedTime = authorizedTime;
                return this;
            }

            /**
             * <p>Authorization description</p>
             * 
             * <strong>example:</strong>
             * <p>Queries weather based on the region name</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the API group. This ID is generated by the system and globally unique.</p>
             * 
             * <strong>example:</strong>
             * <p>523e8dc7bbe04613b5b1d726c2a7889d</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The name of the API group.</p>
             * 
             * <strong>example:</strong>
             * <p>Weather</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The authorizer. Valid values:</p>
             * <ul>
             * <li><strong>PROVIDER:</strong> API owner</li>
             * <li><strong>CONSUMER:</strong> API caller</li>
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
             * <p>The region to which the API belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The name of the runtime environment. Valid values:</p>
             * <ul>
             * <li><strong>RELEASE</strong></li>
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

            public AuthorizedApi build() {
                return new AuthorizedApi(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAuthorizedApisResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAuthorizedApisResponseBody</p>
     */
    public static class AuthorizedApis extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthorizedApi")
        private java.util.List<AuthorizedApi> authorizedApi;

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
        public java.util.List<AuthorizedApi> getAuthorizedApi() {
            return this.authorizedApi;
        }

        public static final class Builder {
            private java.util.List<AuthorizedApi> authorizedApi; 

            private Builder() {
            } 

            private Builder(AuthorizedApis model) {
                this.authorizedApi = model.authorizedApi;
            } 

            /**
             * AuthorizedApi.
             */
            public Builder authorizedApi(java.util.List<AuthorizedApi> authorizedApi) {
                this.authorizedApi = authorizedApi;
                return this;
            }

            public AuthorizedApis build() {
                return new AuthorizedApis(this);
            } 

        } 

    }
}
