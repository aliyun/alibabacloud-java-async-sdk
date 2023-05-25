// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDeployedApisResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDeployedApisResponseBody</p>
 */
public class DescribeDeployedApisResponseBody extends TeaModel {
    @NameInMap("DeployedApis")
    private DeployedApis deployedApis;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDeployedApisResponseBody(Builder builder) {
        this.deployedApis = builder.deployedApis;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDeployedApisResponseBody create() {
        return builder().build();
    }

    /**
     * @return deployedApis
     */
    public DeployedApis getDeployedApis() {
        return this.deployedApis;
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
        private DeployedApis deployedApis; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * DeployedApis.
         */
        public Builder deployedApis(DeployedApis deployedApis) {
            this.deployedApis = deployedApis;
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

        public DescribeDeployedApisResponseBody build() {
            return new DescribeDeployedApisResponseBody(this);
        } 

    } 

    public static class DeployedApiItem extends TeaModel {
        @NameInMap("ApiId")
        private String apiId;

        @NameInMap("ApiMethod")
        private String apiMethod;

        @NameInMap("ApiName")
        private String apiName;

        @NameInMap("ApiPath")
        private String apiPath;

        @NameInMap("DeployedTime")
        private String deployedTime;

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

        private DeployedApiItem(Builder builder) {
            this.apiId = builder.apiId;
            this.apiMethod = builder.apiMethod;
            this.apiName = builder.apiName;
            this.apiPath = builder.apiPath;
            this.deployedTime = builder.deployedTime;
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

        public static DeployedApiItem create() {
            return builder().build();
        }

        /**
         * @return apiId
         */
        public String getApiId() {
            return this.apiId;
        }

        /**
         * @return apiMethod
         */
        public String getApiMethod() {
            return this.apiMethod;
        }

        /**
         * @return apiName
         */
        public String getApiName() {
            return this.apiName;
        }

        /**
         * @return apiPath
         */
        public String getApiPath() {
            return this.apiPath;
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
            private String apiMethod; 
            private String apiName; 
            private String apiPath; 
            private String deployedTime; 
            private String description; 
            private String groupId; 
            private String groupName; 
            private String regionId; 
            private String stageName; 
            private String visibility; 

            /**
             * ApiId.
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * ApiMethod.
             */
            public Builder apiMethod(String apiMethod) {
                this.apiMethod = apiMethod;
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
             * ApiPath.
             */
            public Builder apiPath(String apiPath) {
                this.apiPath = apiPath;
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
             * Visibility.
             */
            public Builder visibility(String visibility) {
                this.visibility = visibility;
                return this;
            }

            public DeployedApiItem build() {
                return new DeployedApiItem(this);
            } 

        } 

    }
    public static class DeployedApis extends TeaModel {
        @NameInMap("DeployedApiItem")
        private java.util.List < DeployedApiItem> deployedApiItem;

        private DeployedApis(Builder builder) {
            this.deployedApiItem = builder.deployedApiItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeployedApis create() {
            return builder().build();
        }

        /**
         * @return deployedApiItem
         */
        public java.util.List < DeployedApiItem> getDeployedApiItem() {
            return this.deployedApiItem;
        }

        public static final class Builder {
            private java.util.List < DeployedApiItem> deployedApiItem; 

            /**
             * DeployedApiItem.
             */
            public Builder deployedApiItem(java.util.List < DeployedApiItem> deployedApiItem) {
                this.deployedApiItem = deployedApiItem;
                return this;
            }

            public DeployedApis build() {
                return new DeployedApis(this);
            } 

        } 

    }
}
