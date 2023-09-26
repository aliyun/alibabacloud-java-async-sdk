// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApisByAppResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApisByAppResponseBody</p>
 */
public class DescribeApisByAppResponseBody extends TeaModel {
    @NameInMap("AppApiRelationInfos")
    private AppApiRelationInfos appApiRelationInfos;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeApisByAppResponseBody(Builder builder) {
        this.appApiRelationInfos = builder.appApiRelationInfos;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApisByAppResponseBody create() {
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
         * AppApiRelationInfos.
         */
        public Builder appApiRelationInfos(AppApiRelationInfos appApiRelationInfos) {
            this.appApiRelationInfos = appApiRelationInfos;
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

        public DescribeApisByAppResponseBody build() {
            return new DescribeApisByAppResponseBody(this);
        } 

    } 

    public static class AppApiRelationInfo extends TeaModel {
        @NameInMap("ApiId")
        private String apiId;

        @NameInMap("ApiName")
        private String apiName;

        @NameInMap("AuthVaildTime")
        private String authVaildTime;

        @NameInMap("AuthorizationSource")
        private String authorizationSource;

        @NameInMap("CreatedTime")
        private String createdTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("Operator")
        private String operator;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("StageName")
        private String stageName;

        private AppApiRelationInfo(Builder builder) {
            this.apiId = builder.apiId;
            this.apiName = builder.apiName;
            this.authVaildTime = builder.authVaildTime;
            this.authorizationSource = builder.authorizationSource;
            this.createdTime = builder.createdTime;
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
            private String createdTime; 
            private String description; 
            private String groupId; 
            private String groupName; 
            private String operator; 
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
             * AuthVaildTime.
             */
            public Builder authVaildTime(String authVaildTime) {
                this.authVaildTime = authVaildTime;
                return this;
            }

            /**
             * AuthorizationSource.
             */
            public Builder authorizationSource(String authorizationSource) {
                this.authorizationSource = authorizationSource;
                return this;
            }

            /**
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
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
             * Operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
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

            public AppApiRelationInfo build() {
                return new AppApiRelationInfo(this);
            } 

        } 

    }
    public static class AppApiRelationInfos extends TeaModel {
        @NameInMap("AppApiRelationInfo")
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
