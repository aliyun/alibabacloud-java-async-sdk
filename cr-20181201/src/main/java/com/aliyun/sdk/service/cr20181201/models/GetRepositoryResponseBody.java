// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRepositoryResponseBody} extends {@link TeaModel}
 *
 * <p>GetRepositoryResponseBody</p>
 */
public class GetRepositoryResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("CreateTime")
    private Long createTime;

    @NameInMap("Detail")
    private String detail;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("ModifiedTime")
    private Long modifiedTime;

    @NameInMap("RepoBuildType")
    private String repoBuildType;

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

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Summary")
    private String summary;

    @NameInMap("TagImmutability")
    private Boolean tagImmutability;

    private GetRepositoryResponseBody(Builder builder) {
        this.code = builder.code;
        this.createTime = builder.createTime;
        this.detail = builder.detail;
        this.instanceId = builder.instanceId;
        this.isSuccess = builder.isSuccess;
        this.modifiedTime = builder.modifiedTime;
        this.repoBuildType = builder.repoBuildType;
        this.repoId = builder.repoId;
        this.repoName = builder.repoName;
        this.repoNamespaceName = builder.repoNamespaceName;
        this.repoStatus = builder.repoStatus;
        this.repoType = builder.repoType;
        this.requestId = builder.requestId;
        this.summary = builder.summary;
        this.tagImmutability = builder.tagImmutability;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRepositoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return detail
     */
    public String getDetail() {
        return this.detail;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private String code; 
        private Long createTime; 
        private String detail; 
        private String instanceId; 
        private Boolean isSuccess; 
        private Long modifiedTime; 
        private String repoBuildType; 
        private String repoId; 
        private String repoName; 
        private String repoNamespaceName; 
        private String repoStatus; 
        private String repoType; 
        private String requestId; 
        private String summary; 
        private Boolean tagImmutability; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Detail.
         */
        public Builder detail(String detail) {
            this.detail = detail;
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
         * IsSuccess.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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

        public GetRepositoryResponseBody build() {
            return new GetRepositoryResponseBody(this);
        } 

    } 

}
