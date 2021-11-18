// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetRepositoryResponseBody} extends {@link TeaModel}
 *
 * <p>GetRepositoryResponseBody</p>
 */
public class GetRepositoryResponseBody extends TeaModel {
    @NameInMap("Summary")
    private String summary;

    @NameInMap("CreateTime")
    private Long createTime;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("RepoStatus")
    private String repoStatus;

    @NameInMap("RepoType")
    private String repoType;

    @NameInMap("RepoBuildType")
    private String repoBuildType;

    @NameInMap("ModifiedTime")
    private Long modifiedTime;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RepoId")
    private String repoId;

    @NameInMap("Code")
    private String code;

    @NameInMap("RepoNamespaceName")
    private String repoNamespaceName;

    @NameInMap("TagImmutability")
    private Boolean tagImmutability;

    @NameInMap("RepoName")
    private String repoName;

    @NameInMap("Detail")
    private String detail;


    private GetRepositoryResponseBody(Builder builder) {
        this.summary = builder.summary;
        this.createTime = builder.createTime;
        this.isSuccess = builder.isSuccess;
        this.instanceId = builder.instanceId;
        this.repoStatus = builder.repoStatus;
        this.repoType = builder.repoType;
        this.repoBuildType = builder.repoBuildType;
        this.modifiedTime = builder.modifiedTime;
        this.requestId = builder.requestId;
        this.repoId = builder.repoId;
        this.code = builder.code;
        this.repoNamespaceName = builder.repoNamespaceName;
        this.tagImmutability = builder.tagImmutability;
        this.repoName = builder.repoName;
        this.detail = builder.detail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRepositoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return summary
     */
    public String getSummary() {
        return this.summary;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return repoId
     */
    public String getRepoId() {
        return this.repoId;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return repoName
     */
    public String getRepoName() {
        return this.repoName;
    }

    /**
     * @return detail
     */
    public String getDetail() {
        return this.detail;
    }

    public static final class Builder {
        private String summary; 
        private Long createTime; 
        private Boolean isSuccess; 
        private String instanceId; 
        private String repoStatus; 
        private String repoType; 
        private String repoBuildType; 
        private Long modifiedTime; 
        private String requestId; 
        private String repoId; 
        private String code; 
        private String repoNamespaceName; 
        private Boolean tagImmutability; 
        private String repoName; 
        private String detail; 

        /**
         * <p>Summary Information</p>
         */
        public Builder summary(String summary) {
            this.summary = summary;
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
         * <p>Successful</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
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
         * <p>Warehouse status</p>
         */
        public Builder repoStatus(String repoStatus) {
            this.repoStatus = repoStatus;
            return this;
        }

        /**
         * <p>The type of the repository. Valid values:

-"PUBLIC": public repository

-"PRIVATE": private repository</p>
         */
        public Builder repoType(String repoType) {
            this.repoType = repoType;
            return this;
        }

        /**
         * <p>The type of the repository. Valid values:

-"MANUAL": manual build

-"AUTO": automatically triggers the build.</p>
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
         * <p>Request ID</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
         * <p>Return value</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Namespace name</p>
         */
        public Builder repoNamespaceName(String repoNamespaceName) {
            this.repoNamespaceName = repoNamespaceName;
            return this;
        }

        /**
         * <p>The image tag cannot be modified. Valid values:

-"true": enabled

-"false": Disabled</p>
         */
        public Builder tagImmutability(Boolean tagImmutability) {
            this.tagImmutability = tagImmutability;
            return this;
        }

        /**
         * <p>Repository name</p>
         */
        public Builder repoName(String repoName) {
            this.repoName = repoName;
            return this;
        }

        /**
         * <p>Details</p>
         */
        public Builder detail(String detail) {
            this.detail = detail;
            return this;
        }

        public GetRepositoryResponseBody build() {
            return new GetRepositoryResponseBody(this);
        } 

    } 

}
