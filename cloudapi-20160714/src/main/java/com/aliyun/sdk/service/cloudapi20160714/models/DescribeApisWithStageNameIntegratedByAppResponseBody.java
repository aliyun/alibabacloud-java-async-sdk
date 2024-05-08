// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApisWithStageNameIntegratedByAppResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApisWithStageNameIntegratedByAppResponseBody</p>
 */
public class DescribeApisWithStageNameIntegratedByAppResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppApiRelationInfos")
    private AppApiRelationInfos appApiRelationInfos;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeApisWithStageNameIntegratedByAppResponseBody(Builder builder) {
        this.appApiRelationInfos = builder.appApiRelationInfos;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApisWithStageNameIntegratedByAppResponseBody create() {
        return builder().build();
    }

    /**
     * @return appApiRelationInfos
     */
    public AppApiRelationInfos getAppApiRelationInfos() {
        return this.appApiRelationInfos;
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
        private AppApiRelationInfos appApiRelationInfos; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The authorization information of the API.
         */
        public Builder appApiRelationInfos(AppApiRelationInfos appApiRelationInfos) {
            this.appApiRelationInfos = appApiRelationInfos;
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
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeApisWithStageNameIntegratedByAppResponseBody build() {
            return new DescribeApisWithStageNameIntegratedByAppResponseBody(this);
        } 

    } 

    public static class AppApiRelationInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiId")
        private String apiId;

        @com.aliyun.core.annotation.NameInMap("ApiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("AuthorizationSource")
        private String authorizationSource;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("Method")
        private String method;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("StageNameAndAuth")
        private java.util.Map < String, String > stageNameAndAuth;

        private AppApiRelationInfo(Builder builder) {
            this.apiId = builder.apiId;
            this.apiName = builder.apiName;
            this.authorizationSource = builder.authorizationSource;
            this.createdTime = builder.createdTime;
            this.description = builder.description;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.method = builder.method;
            this.operator = builder.operator;
            this.path = builder.path;
            this.regionId = builder.regionId;
            this.stageNameAndAuth = builder.stageNameAndAuth;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppApiRelationInfo create() {
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
         * @return authorizationSource
         */
        public String getAuthorizationSource() {
            return this.authorizationSource;
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
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
         * @return operator
         */
        public String getOperator() {
            return this.operator;
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
         * @return stageNameAndAuth
         */
        public java.util.Map < String, String > getStageNameAndAuth() {
            return this.stageNameAndAuth;
        }

        public static final class Builder {
            private String apiId; 
            private String apiName; 
            private String authorizationSource; 
            private String createdTime; 
            private String description; 
            private String groupId; 
            private String groupName; 
            private String method; 
            private String operator; 
            private String path; 
            private String regionId; 
            private java.util.Map < String, String > stageNameAndAuth; 

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
             * The authorization source.
             */
            public Builder authorizationSource(String authorizationSource) {
                this.authorizationSource = authorizationSource;
                return this;
            }

            /**
             * The time when the authorization was created.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
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
             * The name of the API group.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * The request HTTP method of the API.
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * The authorizer. Valid values:
             * <p>
             * 
             * *   **PROVIDER:** the API owner
             * *   **CONSUMER:** the API caller
             */
            public Builder operator(String operator) {
                this.operator = operator;
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
             * The region ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The mapping information between environments and authorizations.
             */
            public Builder stageNameAndAuth(java.util.Map < String, String > stageNameAndAuth) {
                this.stageNameAndAuth = stageNameAndAuth;
                return this;
            }

            public AppApiRelationInfo build() {
                return new AppApiRelationInfo(this);
            } 

        } 

    }
    public static class AppApiRelationInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppApiRelationInfo")
        private java.util.List < AppApiRelationInfo> appApiRelationInfo;

        private AppApiRelationInfos(Builder builder) {
            this.appApiRelationInfo = builder.appApiRelationInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppApiRelationInfos create() {
            return builder().build();
        }

        /**
         * @return appApiRelationInfo
         */
        public java.util.List < AppApiRelationInfo> getAppApiRelationInfo() {
            return this.appApiRelationInfo;
        }

        public static final class Builder {
            private java.util.List < AppApiRelationInfo> appApiRelationInfo; 

            /**
             * AppApiRelationInfo.
             */
            public Builder appApiRelationInfo(java.util.List < AppApiRelationInfo> appApiRelationInfo) {
                this.appApiRelationInfo = appApiRelationInfo;
                return this;
            }

            public AppApiRelationInfos build() {
                return new AppApiRelationInfos(this);
            } 

        } 

    }
}
