// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListChartRepositoryResponseBody} extends {@link TeaModel}
 *
 * <p>ListChartRepositoryResponseBody</p>
 */
public class ListChartRepositoryResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("PageNo")
    private Integer pageNo;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("Repositories")
    private java.util.List < Repositories> repositories;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private String totalCount;

    private ListChartRepositoryResponseBody(Builder builder) {
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.repositories = builder.repositories;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListChartRepositoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return repositories
     */
    public java.util.List < Repositories> getRepositories() {
        return this.repositories;
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
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private Boolean isSuccess; 
        private Integer pageNo; 
        private Integer pageSize; 
        private java.util.List < Repositories> repositories; 
        private String requestId; 
        private String totalCount; 

        /**
         * The return value.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The queried repositories.
         */
        public Builder repositories(java.util.List < Repositories> repositories) {
            this.repositories = repositories;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of returned entries.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListChartRepositoryResponseBody build() {
            return new ListChartRepositoryResponseBody(this);
        } 

    } 

    public static class Repositories extends TeaModel {
        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("ModifiedTime")
        private Long modifiedTime;

        @NameInMap("RepoId")
        private String repoId;

        @NameInMap("RepoName")
        private String repoName;

        @NameInMap("RepoNamespaceName")
        private String repoNamespaceName;

        @NameInMap("RepoStatus")
        private String repoStatus;

        @NameInMap("RepoType")
        private String repoType;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Summary")
        private String summary;

        private Repositories(Builder builder) {
            this.createTime = builder.createTime;
            this.instanceId = builder.instanceId;
            this.modifiedTime = builder.modifiedTime;
            this.repoId = builder.repoId;
            this.repoName = builder.repoName;
            this.repoNamespaceName = builder.repoNamespaceName;
            this.repoStatus = builder.repoStatus;
            this.repoType = builder.repoType;
            this.resourceGroupId = builder.resourceGroupId;
            this.summary = builder.summary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Repositories create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return modifiedTime
         */
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return repoId
         */
        public String getRepoId() {
            return this.repoId;
        }

        /**
         * @return repoName
         */
        public String getRepoName() {
            return this.repoName;
        }

        /**
         * @return repoNamespaceName
         */
        public String getRepoNamespaceName() {
            return this.repoNamespaceName;
        }

        /**
         * @return repoStatus
         */
        public String getRepoStatus() {
            return this.repoStatus;
        }

        /**
         * @return repoType
         */
        public String getRepoType() {
            return this.repoType;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        public static final class Builder {
            private Long createTime; 
            private String instanceId; 
            private Long modifiedTime; 
            private String repoId; 
            private String repoName; 
            private String repoNamespaceName; 
            private String repoStatus; 
            private String repoType; 
            private String resourceGroupId; 
            private String summary; 

            /**
             * The time when the repository was created.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The time when the repository was last modified.
             */
            public Builder modifiedTime(Long modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * The ID of the repository.
             */
            public Builder repoId(String repoId) {
                this.repoId = repoId;
                return this;
            }

            /**
             * The name of the repository.
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            /**
             * The name of the namespace to which the repository belongs.
             */
            public Builder repoNamespaceName(String repoNamespaceName) {
                this.repoNamespaceName = repoNamespaceName;
                return this;
            }

            /**
             * The status of the repository. Valid values:
             * <p>
             * 
             * *   `NORMAL`: The repository is normal.
             * *   `DELETING`: The repository is being deleted.
             */
            public Builder repoStatus(String repoStatus) {
                this.repoStatus = repoStatus;
                return this;
            }

            /**
             * The type of the repository. Valid values:
             * <p>
             * 
             * *   `PRIVATE`: a private repository
             * *   `PUBLIC`: a public repository
             */
            public Builder repoType(String repoType) {
                this.repoType = repoType;
                return this;
            }

            /**
             * The ID of the resource group to which the repository belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The summary about the repository.
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            public Repositories build() {
                return new Repositories(this);
            } 

        } 

    }
}
