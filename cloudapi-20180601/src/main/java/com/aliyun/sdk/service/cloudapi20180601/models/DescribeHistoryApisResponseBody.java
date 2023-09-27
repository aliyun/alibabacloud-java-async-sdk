// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20180601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHistoryApisResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHistoryApisResponseBody</p>
 */
public class DescribeHistoryApisResponseBody extends TeaModel {
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

    private DescribeHistoryApisResponseBody(Builder builder) {
        this.apiInfos = builder.apiInfos;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHistoryApisResponseBody create() {
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

        public DescribeHistoryApisResponseBody build() {
            return new DescribeHistoryApisResponseBody(this);
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

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("HistoryVersion")
        private String historyVersion;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("StageName")
        private String stageName;

        @NameInMap("Status")
        private String status;

        private ApiInfo(Builder builder) {
            this.apiId = builder.apiId;
            this.apiName = builder.apiName;
            this.deployedTime = builder.deployedTime;
            this.description = builder.description;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.historyVersion = builder.historyVersion;
            this.regionId = builder.regionId;
            this.stageName = builder.stageName;
            this.status = builder.status;
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
         * @return historyVersion
         */
        public String getHistoryVersion() {
            return this.historyVersion;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String apiId; 
            private String apiName; 
            private String deployedTime; 
            private String description; 
            private String groupId; 
            private String groupName; 
            private String historyVersion; 
            private String regionId; 
            private String stageName; 
            private String status; 

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
             * HistoryVersion.
             */
            public Builder historyVersion(String historyVersion) {
                this.historyVersion = historyVersion;
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

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
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
