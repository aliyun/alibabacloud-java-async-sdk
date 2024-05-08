// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHistoryApisResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHistoryApisResponseBody</p>
 */
public class DescribeHistoryApisResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiHisItems")
    private ApiHisItems apiHisItems;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeHistoryApisResponseBody(Builder builder) {
        this.apiHisItems = builder.apiHisItems;
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
     * @return apiHisItems
     */
    public ApiHisItems getApiHisItems() {
        return this.apiHisItems;
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
        private ApiHisItems apiHisItems; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * ApiHisItems.
         */
        public Builder apiHisItems(ApiHisItems apiHisItems) {
            this.apiHisItems = apiHisItems;
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

    public static class ApiHisItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiId")
        private String apiId;

        @com.aliyun.core.annotation.NameInMap("ApiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("DeployedTime")
        private String deployedTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("HistoryVersion")
        private String historyVersion;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("StageAlias")
        private String stageAlias;

        @com.aliyun.core.annotation.NameInMap("StageName")
        private String stageName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ApiHisItem(Builder builder) {
            this.apiId = builder.apiId;
            this.apiName = builder.apiName;
            this.deployedTime = builder.deployedTime;
            this.description = builder.description;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.historyVersion = builder.historyVersion;
            this.regionId = builder.regionId;
            this.stageAlias = builder.stageAlias;
            this.stageName = builder.stageName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiHisItem create() {
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
            private String stageAlias; 
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
             * StageAlias.
             */
            public Builder stageAlias(String stageAlias) {
                this.stageAlias = stageAlias;
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

            public ApiHisItem build() {
                return new ApiHisItem(this);
            } 

        } 

    }
    public static class ApiHisItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiHisItem")
        private java.util.List < ApiHisItem> apiHisItem;

        private ApiHisItems(Builder builder) {
            this.apiHisItem = builder.apiHisItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiHisItems create() {
            return builder().build();
        }

        /**
         * @return apiHisItem
         */
        public java.util.List < ApiHisItem> getApiHisItem() {
            return this.apiHisItem;
        }

        public static final class Builder {
            private java.util.List < ApiHisItem> apiHisItem; 

            /**
             * ApiHisItem.
             */
            public Builder apiHisItem(java.util.List < ApiHisItem> apiHisItem) {
                this.apiHisItem = apiHisItem;
                return this;
            }

            public ApiHisItems build() {
                return new ApiHisItems(this);
            } 

        } 

    }
}
