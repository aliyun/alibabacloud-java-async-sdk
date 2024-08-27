// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApisByVpcAccessResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApisByVpcAccessResponseBody</p>
 */
public class DescribeApisByVpcAccessResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiVpcAccessInfos")
    private ApiVpcAccessInfos apiVpcAccessInfos;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeApisByVpcAccessResponseBody(Builder builder) {
        this.apiVpcAccessInfos = builder.apiVpcAccessInfos;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApisByVpcAccessResponseBody create() {
        return builder().build();
    }

    /**
     * @return apiVpcAccessInfos
     */
    public ApiVpcAccessInfos getApiVpcAccessInfos() {
        return this.apiVpcAccessInfos;
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
        private ApiVpcAccessInfos apiVpcAccessInfos; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The returned API information. It is an array consisting of ApiInfo data.
         */
        public Builder apiVpcAccessInfos(ApiVpcAccessInfos apiVpcAccessInfos) {
            this.apiVpcAccessInfos = apiVpcAccessInfos;
            return this;
        }

        /**
         * The page number. Pages start from page 1. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Valid values: 1 to 100. Default value: 10.
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

        public DescribeApisByVpcAccessResponseBody build() {
            return new DescribeApisByVpcAccessResponseBody(this);
        } 

    } 

    public static class ApiVpcAccessInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiId")
        private String apiId;

        @com.aliyun.core.annotation.NameInMap("ApiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Method")
        private String method;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("StageId")
        private String stageId;

        @com.aliyun.core.annotation.NameInMap("StageName")
        private String stageName;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcName")
        private String vpcName;

        private ApiVpcAccessInfo(Builder builder) {
            this.apiId = builder.apiId;
            this.apiName = builder.apiName;
            this.description = builder.description;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.instanceId = builder.instanceId;
            this.method = builder.method;
            this.path = builder.path;
            this.port = builder.port;
            this.regionId = builder.regionId;
            this.stageId = builder.stageId;
            this.stageName = builder.stageName;
            this.vpcId = builder.vpcId;
            this.vpcName = builder.vpcName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiVpcAccessInfo create() {
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
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return stageId
         */
        public String getStageId() {
            return this.stageId;
        }

        /**
         * @return stageName
         */
        public String getStageName() {
            return this.stageName;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpcName
         */
        public String getVpcName() {
            return this.vpcName;
        }

        public static final class Builder {
            private String apiId; 
            private String apiName; 
            private String description; 
            private String groupId; 
            private String groupName; 
            private String instanceId; 
            private String method; 
            private String path; 
            private Integer port; 
            private String regionId; 
            private String stageId; 
            private String stageName; 
            private String vpcId; 
            private String vpcName; 

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
             * The description, which can be up to 200 characters in length.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the API group to which the API belongs.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The name of the API group to which the API belongs.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * The instance ID or IP address in the VPC access authorization.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The HTTP request method of the API.
             */
            public Builder method(String method) {
                this.method = method;
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
             * The port number.
             */
            public Builder port(Integer port) {
                this.port = port;
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
             * The environment ID.
             */
            public Builder stageId(String stageId) {
                this.stageId = stageId;
                return this;
            }

            /**
             * The environment to which the API is published. Valid values:
             * <p>
             * 
             * *   **RELEASE**: the production environment
             * *   **PRE**: the staging environment
             * *   **TEST**: the test environment
             */
            public Builder stageName(String stageName) {
                this.stageName = stageName;
                return this;
            }

            /**
             * vpc id
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The name of the VPC access authorization.
             */
            public Builder vpcName(String vpcName) {
                this.vpcName = vpcName;
                return this;
            }

            public ApiVpcAccessInfo build() {
                return new ApiVpcAccessInfo(this);
            } 

        } 

    }
    public static class ApiVpcAccessInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiVpcAccessInfo")
        private java.util.List < ApiVpcAccessInfo> apiVpcAccessInfo;

        private ApiVpcAccessInfos(Builder builder) {
            this.apiVpcAccessInfo = builder.apiVpcAccessInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiVpcAccessInfos create() {
            return builder().build();
        }

        /**
         * @return apiVpcAccessInfo
         */
        public java.util.List < ApiVpcAccessInfo> getApiVpcAccessInfo() {
            return this.apiVpcAccessInfo;
        }

        public static final class Builder {
            private java.util.List < ApiVpcAccessInfo> apiVpcAccessInfo; 

            /**
             * ApiVpcAccessInfo.
             */
            public Builder apiVpcAccessInfo(java.util.List < ApiVpcAccessInfo> apiVpcAccessInfo) {
                this.apiVpcAccessInfo = apiVpcAccessInfo;
                return this;
            }

            public ApiVpcAccessInfos build() {
                return new ApiVpcAccessInfos(this);
            } 

        } 

    }
}
