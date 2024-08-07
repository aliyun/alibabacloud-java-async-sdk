// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApiDocsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApiDocsResponseBody</p>
 */
public class DescribeApiDocsResponseBody extends TeaModel {
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

    private DescribeApiDocsResponseBody(Builder builder) {
        this.apiInfos = builder.apiInfos;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApiDocsResponseBody create() {
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
         * ApiInfos.
         */
        public Builder apiInfos(ApiInfos apiInfos) {
            this.apiInfos = apiInfos;
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

        public DescribeApiDocsResponseBody build() {
            return new DescribeApiDocsResponseBody(this);
        } 

    } 

    public static class ApiInfo extends TeaModel {
        @NameInMap("ApiId")
        private String apiId;

        @NameInMap("ApiName")
        private String apiName;

        @NameInMap("DeployedTime")
        private String deployedTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("GroupDescription")
        private String groupDescription;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("StageName")
        private String stageName;

        private ApiInfo(Builder builder) {
            this.apiId = builder.apiId;
            this.apiName = builder.apiName;
            this.deployedTime = builder.deployedTime;
            this.description = builder.description;
            this.groupDescription = builder.groupDescription;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
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
         * @return deployedTime
         */
        public String getDeployedTime() {
            return this.deployedTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return groupDescription
         */
        public String getGroupDescription() {
            return this.groupDescription;
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

        public static final class Builder {
            private String apiId; 
            private String apiName; 
            private String deployedTime; 
            private String description; 
            private String groupDescription; 
            private String groupId; 
            private String groupName; 
            private String regionId; 
            private String stageName; 

            /**
             * ApiId.
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * ApiName.
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * DeployedTime.
             */
            public Builder deployedTime(String deployedTime) {
                this.deployedTime = deployedTime;
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
             * GroupDescription.
             */
            public Builder groupDescription(String groupDescription) {
                this.groupDescription = groupDescription;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * StageName.
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
