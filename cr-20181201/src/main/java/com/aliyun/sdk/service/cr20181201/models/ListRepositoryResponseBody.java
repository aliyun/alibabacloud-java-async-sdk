// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

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
 * {@link ListRepositoryResponseBody} extends {@link TeaModel}
 *
 * <p>ListRepositoryResponseBody</p>
 */
public class ListRepositoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("IsSuccess")
    private Boolean isSuccess;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("Repositories")
    private java.util.List<Repositories> repositories;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private ListRepositoryResponseBody(Builder builder) {
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

    public static ListRepositoryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Repositories> getRepositories() {
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
        private java.util.List<Repositories> repositories; 
        private String requestId; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(ListRepositoryResponseBody model) {
            this.code = model.code;
            this.isSuccess = model.isSuccess;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.repositories = model.repositories;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * IsSuccess.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
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
         * Repositories.
         */
        public Builder repositories(java.util.List<Repositories> repositories) {
            this.repositories = repositories;
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
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRepositoryResponseBody build() {
            return new ListRepositoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRepositoryResponseBody} extends {@link TeaModel}
     *
     * <p>ListRepositoryResponseBody</p>
     */
    public static class Repositories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private Long modifiedTime;

        @com.aliyun.core.annotation.NameInMap("RepoBuildType")
        private String repoBuildType;

        @com.aliyun.core.annotation.NameInMap("RepoId")
        private String repoId;

        @com.aliyun.core.annotation.NameInMap("RepoName")
        private String repoName;

        @com.aliyun.core.annotation.NameInMap("RepoNamespaceName")
        private String repoNamespaceName;

        @com.aliyun.core.annotation.NameInMap("RepoStatus")
        private String repoStatus;

        @com.aliyun.core.annotation.NameInMap("RepoType")
        private String repoType;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("TagImmutability")
        private Boolean tagImmutability;

        private Repositories(Builder builder) {
            this.createTime = builder.createTime;
            this.instanceId = builder.instanceId;
            this.modifiedTime = builder.modifiedTime;
            this.repoBuildType = builder.repoBuildType;
            this.repoId = builder.repoId;
            this.repoName = builder.repoName;
            this.repoNamespaceName = builder.repoNamespaceName;
            this.repoStatus = builder.repoStatus;
            this.repoType = builder.repoType;
            this.resourceGroupId = builder.resourceGroupId;
            this.summary = builder.summary;
            this.tagImmutability = builder.tagImmutability;
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
         * @return repoBuildType
         */
        public String getRepoBuildType() {
            return this.repoBuildType;
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

        /**
         * @return tagImmutability
         */
        public Boolean getTagImmutability() {
            return this.tagImmutability;
        }

        public static final class Builder {
            private Long createTime; 
            private String instanceId; 
            private Long modifiedTime; 
            private String repoBuildType; 
            private String repoId; 
            private String repoName; 
            private String repoNamespaceName; 
            private String repoStatus; 
            private String repoType; 
            private String resourceGroupId; 
            private String summary; 
            private Boolean tagImmutability; 

            private Builder() {
            } 

            private Builder(Repositories model) {
                this.createTime = model.createTime;
                this.instanceId = model.instanceId;
                this.modifiedTime = model.modifiedTime;
                this.repoBuildType = model.repoBuildType;
                this.repoId = model.repoId;
                this.repoName = model.repoName;
                this.repoNamespaceName = model.repoNamespaceName;
                this.repoStatus = model.repoStatus;
                this.repoType = model.repoType;
                this.resourceGroupId = model.resourceGroupId;
                this.summary = model.summary;
                this.tagImmutability = model.tagImmutability;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(Long modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * RepoBuildType.
             */
            public Builder repoBuildType(String repoBuildType) {
                this.repoBuildType = repoBuildType;
                return this;
            }

            /**
             * RepoId.
             */
            public Builder repoId(String repoId) {
                this.repoId = repoId;
                return this;
            }

            /**
             * RepoName.
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            /**
             * RepoNamespaceName.
             */
            public Builder repoNamespaceName(String repoNamespaceName) {
                this.repoNamespaceName = repoNamespaceName;
                return this;
            }

            /**
             * RepoStatus.
             */
            public Builder repoStatus(String repoStatus) {
                this.repoStatus = repoStatus;
                return this;
            }

            /**
             * RepoType.
             */
            public Builder repoType(String repoType) {
                this.repoType = repoType;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * Summary.
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            /**
             * TagImmutability.
             */
            public Builder tagImmutability(Boolean tagImmutability) {
                this.tagImmutability = tagImmutability;
                return this;
            }

            public Repositories build() {
                return new Repositories(this);
            } 

        } 

    }
}
