// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeploymentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDeploymentsResponseBody</p>
 */
public class ListDeploymentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDeploymentsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeploymentsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDeploymentsResponseBody build() {
            return new ListDeploymentsResponseBody(this);
        } 

    } 

    public static class Deployments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("ExecuteTime")
        private Long executeTime;

        @com.aliyun.core.annotation.NameInMap("Executor")
        private String executor;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private Deployments(Builder builder) {
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.errorMessage = builder.errorMessage;
            this.executeTime = builder.executeTime;
            this.executor = builder.executor;
            this.id = builder.id;
            this.name = builder.name;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Deployments create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return executeTime
         */
        public Long getExecuteTime() {
            return this.executeTime;
        }

        /**
         * @return executor
         */
        public String getExecutor() {
            return this.executor;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long createTime; 
            private String creator; 
            private String errorMessage; 
            private Long executeTime; 
            private String executor; 
            private Long id; 
            private String name; 
            private Integer status; 

            /**
             * The time when the deployment package was created.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account used by the user who created the deployment package.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * The error message returned when the deployment package failed.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The time when the deployment package was run. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder executeTime(Long executeTime) {
                this.executeTime = executeTime;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account used by the user who ran the deployment package.
             */
            public Builder executor(String executor) {
                this.executor = executor;
                return this;
            }

            /**
             * The deployment package ID. You can call the [GetDeployment](~~173950~~) operation to obtain the ID.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the deployment package.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The status of the deployment package. Valid values:
             * <p>
             * 
             * *   0: The deployment package is ready.
             * *   1: The deployment package is deployed.
             * *   2: The deployment package fails to be deployed.
             * *   6: The deployment package is rejected.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public Deployments build() {
                return new Deployments(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Deployments")
        private java.util.List < Deployments> deployments;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.deployments = builder.deployments;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return deployments
         */
        public java.util.List < Deployments> getDeployments() {
            return this.deployments;
        }

        /**
         * @return pageNumber
         */
        public Long getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < Deployments> deployments; 
            private Long pageNumber; 
            private Long pageSize; 
            private Long totalCount; 

            /**
             * The deployment packages.
             */
            public Builder deployments(java.util.List < Deployments> deployments) {
                this.deployments = deployments;
                return this;
            }

            /**
             * The page number.
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of entries per page.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
