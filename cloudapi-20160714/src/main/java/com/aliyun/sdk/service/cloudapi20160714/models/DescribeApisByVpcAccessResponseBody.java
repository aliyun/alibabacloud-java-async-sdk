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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeApisByVpcAccessResponseBody model) {
            this.apiVpcAccessInfos = model.apiVpcAccessInfos;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The returned API information. It is an array consisting of ApiInfo data.</p>
         */
        public Builder apiVpcAccessInfos(ApiVpcAccessInfos apiVpcAccessInfos) {
            this.apiVpcAccessInfos = apiVpcAccessInfos;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 100. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4E707B25-5119-5ACF-9D26-7D2A2762F05C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeApisByVpcAccessResponseBody build() {
            return new DescribeApisByVpcAccessResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApisByVpcAccessResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApisByVpcAccessResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ApiVpcAccessInfo model) {
                this.apiId = model.apiId;
                this.apiName = model.apiName;
                this.description = model.description;
                this.groupId = model.groupId;
                this.groupName = model.groupName;
                this.instanceId = model.instanceId;
                this.method = model.method;
                this.path = model.path;
                this.port = model.port;
                this.regionId = model.regionId;
                this.stageId = model.stageId;
                this.stageName = model.stageName;
                this.vpcId = model.vpcId;
                this.vpcName = model.vpcName;
            } 

            /**
             * <p>The API ID.</p>
             * 
             * <strong>example:</strong>
             * <p>09839002de484e76b5a213b040a6a3ca</p>
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * <p>The API name.</p>
             * 
             * <strong>example:</strong>
             * <p>iwc</p>
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * <p>The description, which can be up to 200 characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the API group to which the API belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>41c33748cbfb41f6b00870156203b72a</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The name of the API group to which the API belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>RT_PLU_IP_CTRL_group</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The instance ID or IP address in the VPC access authorization.</p>
             * 
             * <strong>example:</strong>
             * <p>Ib-04e41XXXXXd95e9c1</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The HTTP request method of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>POST</p>
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * <p>The request path of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>/api/v1/friends/rc/status</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The port number.</p>
             * 
             * <strong>example:</strong>
             * <p>443</p>
             */
            public Builder port(Integer port) {
                this.port = port;
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
             * <p>The environment ID.</p>
             * 
             * <strong>example:</strong>
             * <p>57e17906a69b4424914fb1e05f67c78a</p>
             */
            public Builder stageId(String stageId) {
                this.stageId = stageId;
                return this;
            }

            /**
             * <p>The environment to which the API is published. Valid values:</p>
             * <ul>
             * <li><strong>RELEASE</strong>: the production environment</li>
             * <li><strong>PRE</strong>: the staging environment</li>
             * <li><strong>TEST</strong>: the test environment</li>
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
             * <p>vpc id</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2ze7bj64wstznvftrskbk</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The name of the VPC access authorization.</p>
             * 
             * <strong>example:</strong>
             * <p>aliYun_service_prod</p>
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
    /**
     * 
     * {@link DescribeApisByVpcAccessResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApisByVpcAccessResponseBody</p>
     */
    public static class ApiVpcAccessInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiVpcAccessInfo")
        private java.util.List<ApiVpcAccessInfo> apiVpcAccessInfo;

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
        public java.util.List<ApiVpcAccessInfo> getApiVpcAccessInfo() {
            return this.apiVpcAccessInfo;
        }

        public static final class Builder {
            private java.util.List<ApiVpcAccessInfo> apiVpcAccessInfo; 

            private Builder() {
            } 

            private Builder(ApiVpcAccessInfos model) {
                this.apiVpcAccessInfo = model.apiVpcAccessInfo;
            } 

            /**
             * ApiVpcAccessInfo.
             */
            public Builder apiVpcAccessInfo(java.util.List<ApiVpcAccessInfo> apiVpcAccessInfo) {
                this.apiVpcAccessInfo = apiVpcAccessInfo;
                return this;
            }

            public ApiVpcAccessInfos build() {
                return new ApiVpcAccessInfos(this);
            } 

        } 

    }
}
