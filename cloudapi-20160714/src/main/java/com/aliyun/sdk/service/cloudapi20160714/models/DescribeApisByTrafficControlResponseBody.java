// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApisByTrafficControlResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApisByTrafficControlResponseBody</p>
 */
public class DescribeApisByTrafficControlResponseBody extends TeaModel {
    @NameInMap("ApiInfos")
    private ApiInfos apiInfos;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeApisByTrafficControlResponseBody(Builder builder) {
        this.apiInfos = builder.apiInfos;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApisByTrafficControlResponseBody create() {
        return builder().build();
    }

    /**
     * @return apiInfos
     */
    public ApiInfos getApiInfos() {
        return this.apiInfos;
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
        private ApiInfos apiInfos; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The returned API information. It is an array consisting of ApiInfo data.
         */
        public Builder apiInfos(ApiInfos apiInfos) {
            this.apiInfos = apiInfos;
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

        public DescribeApisByTrafficControlResponseBody build() {
            return new DescribeApisByTrafficControlResponseBody(this);
        } 

    } 

    public static class ApiInfo extends TeaModel {
        @NameInMap("ApiId")
        private String apiId;

        @NameInMap("ApiName")
        private String apiName;

        @NameInMap("BoundTime")
        private String boundTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("StageName")
        private String stageName;

        @NameInMap("Visibility")
        private String visibility;

        private ApiInfo(Builder builder) {
            this.apiId = builder.apiId;
            this.apiName = builder.apiName;
            this.boundTime = builder.boundTime;
            this.description = builder.description;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.regionId = builder.regionId;
            this.stageName = builder.stageName;
            this.visibility = builder.visibility;
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
         * @return boundTime
         */
        public String getBoundTime() {
            return this.boundTime;
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

        /**
         * @return visibility
         */
        public String getVisibility() {
            return this.visibility;
        }

        public static final class Builder {
            private String apiId; 
            private String apiName; 
            private String boundTime; 
            private String description; 
            private String groupId; 
            private String groupName; 
            private String regionId; 
            private String stageName; 
            private String visibility; 

            /**
             * The ID of the API.
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
             * The binding time of the API.
             */
            public Builder boundTime(String boundTime) {
                this.boundTime = boundTime;
                return this;
            }

            /**
             * The description of the API.
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
             * The name of the group to which an API belongs.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * The region where the API is located.
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
             * *   **TEST**
             */
            public Builder stageName(String stageName) {
                this.stageName = stageName;
                return this;
            }

            /**
             * Indicates whether the API is public. Valid values:
             * <p>
             * 
             * *   **PUBLIC**
             * *   **PRIVATE**
             */
            public Builder visibility(String visibility) {
                this.visibility = visibility;
                return this;
            }

            public ApiInfo build() {
                return new ApiInfo(this);
            } 

        } 

    }
    public static class ApiInfos extends TeaModel {
        @NameInMap("ApiInfo")
        private java.util.List < ApiInfo> apiInfo;

        private ApiInfos(Builder builder) {
            this.apiInfo = builder.apiInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiInfos create() {
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

            public ApiInfos build() {
                return new ApiInfos(this);
            } 

        } 

    }
}
