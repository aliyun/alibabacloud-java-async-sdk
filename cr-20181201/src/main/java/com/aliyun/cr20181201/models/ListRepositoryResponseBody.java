// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListRepositoryResponseBody} extends {@link TeaModel}
 *
 * <p>ListRepositoryResponseBody</p>
 */
public class ListRepositoryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Code")
    private String code;

    @NameInMap("PageNo")
    private Integer pageNo;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("TotalCount")
    private String totalCount;

    @NameInMap("Repositories")
    private java.util.List < Repositories> repositories;


    private ListRepositoryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.code = builder.code;
        this.pageNo = builder.pageNo;
        this.isSuccess = builder.isSuccess;
        this.pageSize = builder.pageSize;
        this.totalCount = builder.totalCount;
        this.repositories = builder.repositories;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRepositoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return repositories
     */
    public java.util.List < Repositories> getRepositories() {
        return this.repositories;
    }

    public static final class Builder {
        private String requestId; 
        private String code; 
        private Integer pageNo; 
        private Boolean isSuccess; 
        private Integer pageSize; 
        private String totalCount; 
        private java.util.List < Repositories> repositories; 

        /**
         * <p>Request ID</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Return value</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Page number</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>Successful</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>Page size</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Total quantity</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>Repositories</p>
         */
        public Builder repositories(java.util.List < Repositories> repositories) {
            this.repositories = repositories;
            return this;
        }

        public ListRepositoryResponseBody build() {
            return new ListRepositoryResponseBody(this);
        } 

    } 

    public static class Repositories extends TeaModel {
        @NameInMap("Summary")
        private String summary;

        @NameInMap("RepoBuildType")
        private String repoBuildType;

        @NameInMap("ModifiedTime")
        private Long modifiedTime;

        @NameInMap("RepoId")
        private String repoId;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("RepoNamespaceName")
        private String repoNamespaceName;

        @NameInMap("TagImmutability")
        private Boolean tagImmutability;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("RepoType")
        private String repoType;

        @NameInMap("RepoStatus")
        private String repoStatus;

        @NameInMap("RepoName")
        private String repoName;


        private Repositories(Builder builder) {
            this.summary = builder.summary;
            this.repoBuildType = builder.repoBuildType;
            this.modifiedTime = builder.modifiedTime;
            this.repoId = builder.repoId;
            this.createTime = builder.createTime;
            this.repoNamespaceName = builder.repoNamespaceName;
            this.tagImmutability = builder.tagImmutability;
            this.instanceId = builder.instanceId;
            this.repoType = builder.repoType;
            this.repoStatus = builder.repoStatus;
            this.repoName = builder.repoName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Repositories create() {
            return builder().build();
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        /**
         * @return repoBuildType
         */
        public String getRepoBuildType() {
            return this.repoBuildType;
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
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return repoNamespaceName
         */
        public String getRepoNamespaceName() {
            return this.repoNamespaceName;
        }

        /**
         * @return tagImmutability
         */
        public Boolean getTagImmutability() {
            return this.tagImmutability;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return repoType
         */
        public String getRepoType() {
            return this.repoType;
        }

        /**
         * @return repoStatus
         */
        public String getRepoStatus() {
            return this.repoStatus;
        }

        /**
         * @return repoName
         */
        public String getRepoName() {
            return this.repoName;
        }

        public static final class Builder {
            private String summary; 
            private String repoBuildType; 
            private Long modifiedTime; 
            private String repoId; 
            private Long createTime; 
            private String repoNamespaceName; 
            private Boolean tagImmutability; 
            private String instanceId; 
            private String repoType; 
            private String repoStatus; 
            private String repoName; 

            /**
             * <p>Summary Information</p>
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            /**
             * <p>The type of the repository. Valid values:

-"AUTO": automatically triggers the build.

-"MANUAL": manual build</p>
             */
            public Builder repoBuildType(String repoBuildType) {
                this.repoBuildType = repoBuildType;
                return this;
            }

            /**
             * <p>Last modified time</p>
             */
            public Builder modifiedTime(Long modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>Warehouse ID</p>
             */
            public Builder repoId(String repoId) {
                this.repoId = repoId;
                return this;
            }

            /**
             * <p>Created</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Repository namespace</p>
             */
            public Builder repoNamespaceName(String repoNamespaceName) {
                this.repoNamespaceName = repoNamespaceName;
                return this;
            }

            /**
             * <p>Image tag Immutability</p>
             */
            public Builder tagImmutability(Boolean tagImmutability) {
                this.tagImmutability = tagImmutability;
                return this;
            }

            /**
             * <p>Instance ID</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The type of the repository. Valid values:

-"PUBLIC": Public

-"PRIVATE": Private</p>
             */
            public Builder repoType(String repoType) {
                this.repoType = repoType;
                return this;
            }

            /**
             * <p>Warehouse status</p>
             */
            public Builder repoStatus(String repoStatus) {
                this.repoStatus = repoStatus;
                return this;
            }

            /**
             * <p>Repository name</p>
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            public Repositories build() {
                return new Repositories(this);
            } 

        } 

    }
}
