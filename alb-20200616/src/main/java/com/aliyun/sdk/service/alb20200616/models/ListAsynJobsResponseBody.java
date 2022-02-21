// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAsynJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAsynJobsResponseBody</p>
 */
public class ListAsynJobsResponseBody extends TeaModel {
    @NameInMap("Jobs")
    private java.util.List < Jobs> jobs;

    @NameInMap("MaxResults")
    private Long maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListAsynJobsResponseBody(Builder builder) {
        this.jobs = builder.jobs;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAsynJobsResponseBody create() {
        return builder().build();
    }

    /**
     * @return jobs
     */
    public java.util.List < Jobs> getJobs() {
        return this.jobs;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Jobs> jobs; 
        private Long maxResults; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        /**
         * 任务列表
         */
        public Builder jobs(java.util.List < Jobs> jobs) {
            this.jobs = jobs;
            return this;
        }

        /**
         * 本次查询返回记录数量
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * 分页查询标识
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 总记录数	
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAsynJobsResponseBody build() {
            return new ListAsynJobsResponseBody(this);
        } 

    } 

    public static class Jobs extends TeaModel {
        @NameInMap("ApiName")
        private String apiName;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("Id")
        private String id;

        @NameInMap("ModifyTime")
        private Long modifyTime;

        @NameInMap("OperateType")
        private String operateType;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("Status")
        private String status;

        private Jobs(Builder builder) {
            this.apiName = builder.apiName;
            this.createTime = builder.createTime;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.id = builder.id;
            this.modifyTime = builder.modifyTime;
            this.operateType = builder.operateType;
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Jobs create() {
            return builder().build();
        }

        /**
         * @return apiName
         */
        public String getApiName() {
            return this.apiName;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return operateType
         */
        public String getOperateType() {
            return this.operateType;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String apiName; 
            private Long createTime; 
            private String errorCode; 
            private String errorMessage; 
            private String id; 
            private Long modifyTime; 
            private String operateType; 
            private String resourceId; 
            private String resourceType; 
            private String status; 

            /**
             * openapi名称
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * 任务开始时间戳
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 如果Status为失败，则为错误码
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * 如果Status为失败，则为错误信息
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * 任务ID
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * 任务结束时间戳
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * 操作类型
             */
            public Builder operateType(String operateType) {
                this.operateType = operateType;
                return this;
            }

            /**
             * 关联的资源实例ID
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * 关联的资源类型
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * 任务状态
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Jobs build() {
                return new Jobs(this);
            } 

        } 

    }
}
