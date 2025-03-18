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
 * {@link DescribeApisByAppResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApisByAppResponseBody</p>
 */
public class DescribeApisByAppResponseBody extends TeaModel {
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeApisByAppResponseBody model) {
            this.appApiRelationInfos = model.appApiRelationInfos;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The API authorizations.</p>
         */
        public Builder appApiRelationInfos(AppApiRelationInfos appApiRelationInfos) {
            this.appApiRelationInfos = appApiRelationInfos;
            return this;
        }

        /**
         * <p>The number of pages to return the results on.</p>
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
         * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BZ015</p>
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

        public DescribeApisByAppResponseBody build() {
            return new DescribeApisByAppResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApisByAppResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApisByAppResponseBody</p>
     */
    public static class AppApiRelationInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiId")
        private String apiId;

        @com.aliyun.core.annotation.NameInMap("ApiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("AuthVaildTime")
        private String authVaildTime;

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

        @com.aliyun.core.annotation.NameInMap("StageAlias")
        private String stageAlias;

        @com.aliyun.core.annotation.NameInMap("StageName")
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
            this.method = builder.method;
            this.operator = builder.operator;
            this.path = builder.path;
            this.regionId = builder.regionId;
            this.stageAlias = builder.stageAlias;
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

        public static final class Builder {
            private String apiId; 
            private String apiName; 
            private String authVaildTime; 
            private String authorizationSource; 
            private String createdTime; 
            private String description; 
            private String groupId; 
            private String groupName; 
            private String method; 
            private String operator; 
            private String path; 
            private String regionId; 
            private String stageAlias; 
            private String stageName; 

            private Builder() {
            } 

            private Builder(AppApiRelationInfo model) {
                this.apiId = model.apiId;
                this.apiName = model.apiName;
                this.authVaildTime = model.authVaildTime;
                this.authorizationSource = model.authorizationSource;
                this.createdTime = model.createdTime;
                this.description = model.description;
                this.groupId = model.groupId;
                this.groupName = model.groupName;
                this.method = model.method;
                this.operator = model.operator;
                this.path = model.path;
                this.regionId = model.regionId;
                this.stageAlias = model.stageAlias;
                this.stageName = model.stageName;
            } 

            /**
             * <p>The API ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c625795a1e664782a918eaa629e96ab5</p>
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * <p>The API name.</p>
             * 
             * <strong>example:</strong>
             * <p>sd2_h5_player_history_competition</p>
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * <p>The validity period of the authorization.</p>
             * 
             * <strong>example:</strong>
             * <p>Sun, 02 Jan 2022 16:00:00 GMT</p>
             */
            public Builder authVaildTime(String authVaildTime) {
                this.authVaildTime = authVaildTime;
                return this;
            }

            /**
             * <p>The authorization source.</p>
             * 
             * <strong>example:</strong>
             * <p>SELF</p>
             */
            public Builder authorizationSource(String authorizationSource) {
                this.authorizationSource = authorizationSource;
                return this;
            }

            /**
             * <p>The time when the authorization was created.</p>
             * 
             * <strong>example:</strong>
             * <p>Sun, 02 Jan 2022 16:00:00 GMT</p>
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The authorization description.</p>
             * 
             * <strong>example:</strong>
             * <p>b1008kz</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the API group.</p>
             * 
             * <strong>example:</strong>
             * <p>38bed48d664149e4b9b5ea576319673f</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The name of the API group.</p>
             * 
             * <strong>example:</strong>
             * <p>wb2022012101605749</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The HTTP method of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>GET</p>
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * <p>The authorizer. Valid values:</p>
             * <ul>
             * <li><strong>PROVIDER</strong>: API owner</li>
             * <li><strong>CONSUMER</strong>: API caller</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PROVIDER</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>The request path of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>/api/offline/cacheData</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
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
             * <p>The environment name.</p>
             * 
             * <strong>example:</strong>
             * <p>RELEASE</p>
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
    /**
     * 
     * {@link DescribeApisByAppResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApisByAppResponseBody</p>
     */
    public static class AppApiRelationInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppApiRelationInfo")
        private java.util.List<AppApiRelationInfo> appApiRelationInfo;

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
        public java.util.List<AppApiRelationInfo> getAppApiRelationInfo() {
            return this.appApiRelationInfo;
        }

        public static final class Builder {
            private java.util.List<AppApiRelationInfo> appApiRelationInfo; 

            private Builder() {
            } 

            private Builder(AppApiRelationInfos model) {
                this.appApiRelationInfo = model.appApiRelationInfo;
            } 

            /**
             * AppApiRelationInfo.
             */
            public Builder appApiRelationInfo(java.util.List<AppApiRelationInfo> appApiRelationInfo) {
                this.appApiRelationInfo = appApiRelationInfo;
                return this;
            }

            public AppApiRelationInfos build() {
                return new AppApiRelationInfos(this);
            } 

        } 

    }
}
