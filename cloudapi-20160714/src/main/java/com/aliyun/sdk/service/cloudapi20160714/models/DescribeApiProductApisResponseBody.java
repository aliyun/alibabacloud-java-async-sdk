// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApiProductApisResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApiProductApisResponseBody</p>
 */
public class DescribeApiProductApisResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiInfoList")
    private ApiInfoList apiInfoList;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeApiProductApisResponseBody(Builder builder) {
        this.apiInfoList = builder.apiInfoList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApiProductApisResponseBody create() {
        return builder().build();
    }

    /**
     * @return apiInfoList
     */
    public ApiInfoList getApiInfoList() {
        return this.apiInfoList;
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
        private ApiInfoList apiInfoList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The information about the returned APIs.
         */
        public Builder apiInfoList(ApiInfoList apiInfoList) {
            this.apiInfoList = apiInfoList;
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

        public DescribeApiProductApisResponseBody build() {
            return new DescribeApiProductApisResponseBody(this);
        } 

    } 

    public static class ApiInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiId")
        private String apiId;

        @com.aliyun.core.annotation.NameInMap("ApiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("Method")
        private String method;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("StageName")
        private String stageName;

        private ApiInfo(Builder builder) {
            this.apiId = builder.apiId;
            this.apiName = builder.apiName;
            this.description = builder.description;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.method = builder.method;
            this.path = builder.path;
            this.regionId = builder.regionId;
            this.stageName = builder.stageName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiInfo create() {
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
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
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
            private String description; 
            private String groupId; 
            private String groupName; 
            private String method; 
            private String path; 
            private String regionId; 
            private String stageName; 

            /**
             * The API ID.
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * The API name.
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * The API description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the API group.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The name of the API group to which the API belongs.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * The request method of the API.
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * The request path of the API.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * The ID of the region where the API is deployed.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
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

            public ApiInfo build() {
                return new ApiInfo(this);
            } 

        } 

    }
    public static class ApiInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiInfo")
        private java.util.List < ApiInfo> apiInfo;

        private ApiInfoList(Builder builder) {
            this.apiInfo = builder.apiInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiInfoList create() {
            return builder().build();
        }

        /**
         * @return apiInfo
         */
        public java.util.List < ApiInfo> getApiInfo() {
            return this.apiInfo;
        }

        public static final class Builder {
            private java.util.List < ApiInfo> apiInfo; 

            /**
             * ApiInfo.
             */
            public Builder apiInfo(java.util.List < ApiInfo> apiInfo) {
                this.apiInfo = apiInfo;
                return this;
            }

            public ApiInfoList build() {
                return new ApiInfoList(this);
            } 

        } 

    }
}
