// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The returned API information. It is an array consisting of ApiHisItems.</p>
         */
        public Builder apiHisItems(ApiHisItems apiHisItems) {
            this.apiHisItems = apiHisItems;
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
         * <p>The number of entries to return on each page. Maximum value: 50. Default value: 10.</p>
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
         * <p>6C87A26A-6A18-4B8E-8099-705278381A2C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeHistoryApisResponseBody build() {
            return new DescribeHistoryApisResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeHistoryApisResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHistoryApisResponseBody</p>
     */
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
             * <p>The API ID.</p>
             * 
             * <strong>example:</strong>
             * <p>5af418828f0344a3b588c0cc1331a3bc</p>
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * <p>The API name.</p>
             * 
             * <strong>example:</strong>
             * <p>v2_role_assign</p>
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * <p>The time when the API was published. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2016-07-20T08:28:48Z</p>
             */
            public Builder deployedTime(String deployedTime) {
                this.deployedTime = deployedTime;
                return this;
            }

            /**
             * <p>The API description.</p>
             * 
             * <strong>example:</strong>
             * <p>Creates an object</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The API group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1084f9034c744137901057206b39d2b6</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The name of the API group to which the API belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>myGroup2</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The historical version of the API definition.</p>
             * 
             * <strong>example:</strong>
             * <p>20210915101416294</p>
             */
            public Builder historyVersion(String historyVersion) {
                this.historyVersion = historyVersion;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-qingdao</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The environment alias.</p>
             * 
             * <strong>example:</strong>
             * <p>Online</p>
             */
            public Builder stageAlias(String stageAlias) {
                this.stageAlias = stageAlias;
                return this;
            }

            /**
             * <p>The environment name. Valid values:</p>
             * <ul>
             * <li><strong>RELEASE</strong></li>
             * <li><strong>TEST</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RELEASE</p>
             */
            public Builder stageName(String stageName) {
                this.stageName = stageName;
                return this;
            }

            /**
             * <p>Indicates whether an API version is effective. Valid values: ONLINE and OFFLINE.</p>
             * 
             * <strong>example:</strong>
             * <p>ONLINE</p>
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
    /**
     * 
     * {@link DescribeHistoryApisResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHistoryApisResponseBody</p>
     */
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
