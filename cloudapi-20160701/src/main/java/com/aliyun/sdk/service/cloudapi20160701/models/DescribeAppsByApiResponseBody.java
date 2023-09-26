// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAppsByApiResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAppsByApiResponseBody</p>
 */
public class DescribeAppsByApiResponseBody extends TeaModel {
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

    private DescribeAppsByApiResponseBody(Builder builder) {
        this.appApiRelationInfos = builder.appApiRelationInfos;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppsByApiResponseBody create() {
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

        public DescribeAppsByApiResponseBody build() {
            return new DescribeAppsByApiResponseBody(this);
        } 

    } 

    public static class AppApiRelationInfo extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("AuthVaildTime")
        private String authVaildTime;

        @NameInMap("AuthorizationSource")
        private String authorizationSource;

        @NameInMap("CreatedTime")
        private String createdTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("Operator")
        private String operator;

        @NameInMap("StageName")
        private String stageName;

        private AppApiRelationInfo(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.authVaildTime = builder.authVaildTime;
            this.authorizationSource = builder.authorizationSource;
            this.createdTime = builder.createdTime;
            this.description = builder.description;
            this.operator = builder.operator;
            this.stageName = builder.stageName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppApiRelationInfo create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
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
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return stageName
         */
        public String getStageName() {
            return this.stageName;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
            private String authVaildTime; 
            private String authorizationSource; 
            private String createdTime; 
            private String description; 
            private String operator; 
            private String stageName; 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
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
             * Operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
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
