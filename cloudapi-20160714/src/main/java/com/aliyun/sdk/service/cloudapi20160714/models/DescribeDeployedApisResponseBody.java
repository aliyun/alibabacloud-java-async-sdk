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
 * {@link DescribeDeployedApisResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDeployedApisResponseBody</p>
 */
public class DescribeDeployedApisResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeployedApis")
    private DeployedApis deployedApis;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDeployedApisResponseBody model) {
            this.deployedApis = model.deployedApis;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The returned API information. It is an array consisting of DeployedApiItem data.</p>
         */
        public Builder deployedApis(DeployedApis deployedApis) {
            this.deployedApis = deployedApis;
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
         * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BZ002</p>
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

        public DescribeDeployedApisResponseBody build() {
            return new DescribeDeployedApisResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDeployedApisResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDeployedApisResponseBody</p>
     */
    public static class DeployedApiItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiId")
        private String apiId;

        @com.aliyun.core.annotation.NameInMap("ApiMethod")
        private String apiMethod;

        @com.aliyun.core.annotation.NameInMap("ApiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("ApiPath")
        private String apiPath;

        @com.aliyun.core.annotation.NameInMap("DeployedTime")
        private String deployedTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("StageName")
        private String stageName;

        @com.aliyun.core.annotation.NameInMap("Visibility")
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

            private Builder() {
            } 

            private Builder(DeployedApiItem model) {
                this.apiId = model.apiId;
                this.apiMethod = model.apiMethod;
                this.apiName = model.apiName;
                this.apiPath = model.apiPath;
                this.deployedTime = model.deployedTime;
                this.description = model.description;
                this.groupId = model.groupId;
                this.groupName = model.groupName;
                this.regionId = model.regionId;
                this.stageName = model.stageName;
                this.visibility = model.visibility;
            } 

            /**
             * <p>The ID of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>c076144d7878437b8f82fb85890ce6a0</p>
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * <p>The HTTP method of the API request.</p>
             * 
             * <strong>example:</strong>
             * <p>POST</p>
             */
            public Builder apiMethod(String apiMethod) {
                this.apiMethod = apiMethod;
                return this;
            }

            /**
             * <p>The name of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>DescribeObjects</p>
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * <p>The request path of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>/trademark/search</p>
             */
            public Builder apiPath(String apiPath) {
                this.apiPath = apiPath;
                return this;
            }

            /**
             * <p>The publising time (UTC) of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>2016-07-23T08:28:48Z</p>
             */
            public Builder deployedTime(String deployedTime) {
                this.deployedTime = deployedTime;
                return this;
            }

            /**
             * <p>The description of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>Queries objects by pages</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the API group.</p>
             * 
             * <strong>example:</strong>
             * <p>63be9002440b4778a61122f14c2b2bbb</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The name of the group to which the API belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>myGroup3</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The region where the API is located.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-qingdao</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The name of the runtime environment. Valid values:</p>
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
             * <p>Indicates whether the API is public. Valid values:</p>
             * <ul>
             * <li><strong>PUBLIC</strong></li>
             * <li><strong>PRIVATE</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PUBLIC</p>
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
    /**
     * 
     * {@link DescribeDeployedApisResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDeployedApisResponseBody</p>
     */
    public static class DeployedApis extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeployedApiItem")
        private java.util.List<DeployedApiItem> deployedApiItem;

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
        public java.util.List<DeployedApiItem> getDeployedApiItem() {
            return this.deployedApiItem;
        }

        public static final class Builder {
            private java.util.List<DeployedApiItem> deployedApiItem; 

            private Builder() {
            } 

            private Builder(DeployedApis model) {
                this.deployedApiItem = model.deployedApiItem;
            } 

            /**
             * DeployedApiItem.
             */
            public Builder deployedApiItem(java.util.List<DeployedApiItem> deployedApiItem) {
                this.deployedApiItem = deployedApiItem;
                return this;
            }

            public DeployedApis build() {
                return new DeployedApis(this);
            } 

        } 

    }
}
