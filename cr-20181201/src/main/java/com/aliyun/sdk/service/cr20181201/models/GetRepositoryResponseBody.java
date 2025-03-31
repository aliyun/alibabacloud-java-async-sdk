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
 * {@link GetRepositoryResponseBody} extends {@link TeaModel}
 *
 * <p>GetRepositoryResponseBody</p>
 */
public class GetRepositoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("Detail")
    private String detail;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("IsSuccess")
    private Boolean isSuccess;

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

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("Summary")
    private String summary;

    @com.aliyun.core.annotation.NameInMap("TagImmutability")
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
        this.resourceGroupId = builder.resourceGroupId;
        this.summary = builder.summary;
        this.tagImmutability = builder.tagImmutability;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRepositoryResponseBody create() {
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
        private String resourceGroupId; 
        private String summary; 
        private Boolean tagImmutability; 

        private Builder() {
        } 

        private Builder(GetRepositoryResponseBody model) {
            this.code = model.code;
            this.createTime = model.createTime;
            this.detail = model.detail;
            this.instanceId = model.instanceId;
            this.isSuccess = model.isSuccess;
            this.modifiedTime = model.modifiedTime;
            this.repoBuildType = model.repoBuildType;
            this.repoId = model.repoId;
            this.repoName = model.repoName;
            this.repoNamespaceName = model.repoNamespaceName;
            this.repoStatus = model.repoStatus;
            this.repoType = model.repoType;
            this.requestId = model.requestId;
            this.resourceGroupId = model.resourceGroupId;
            this.summary = model.summary;
            this.tagImmutability = model.tagImmutability;
        } 

        /**
         * <p>The return value.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The time when the repository was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1570759546000</p>
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The details of the repository.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder detail(String detail) {
            this.detail = detail;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-kmsiwlxxdcva****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>The time when the repository was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1570759546100</p>
         */
        public Builder modifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }

        /**
         * <p>Indicates how the repository was created. Valid values:</p>
         * <ul>
         * <li><code>MANUAL</code>: The repository was manually created.</li>
         * <li><code>AUTO</code>: The repository was automatically created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MANUAL</p>
         */
        public Builder repoBuildType(String repoBuildType) {
            this.repoBuildType = repoBuildType;
            return this;
        }

        /**
         * <p>The ID of the repository.</p>
         * 
         * <strong>example:</strong>
         * <p>crr-l5eoubonp0l****</p>
         */
        public Builder repoId(String repoId) {
            this.repoId = repoId;
            return this;
        }

        /**
         * <p>The name of the repository.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder repoName(String repoName) {
            this.repoName = repoName;
            return this;
        }

        /**
         * <p>The name of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder repoNamespaceName(String repoNamespaceName) {
            this.repoNamespaceName = repoNamespaceName;
            return this;
        }

        /**
         * <p>The status of the repository.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder repoStatus(String repoStatus) {
            this.repoStatus = repoStatus;
            return this;
        }

        /**
         * <p>The type of the repository. Valid values:</p>
         * <ul>
         * <li><code>PUBLIC</code>: public repository.</li>
         * <li><code>PRIVATE</code>: private repository.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        public Builder repoType(String repoType) {
            this.repoType = repoType;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>915E6734-3E50-4640-8DBA-126D2D94DE29</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmv36i4is****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The summary of the repository.</p>
         * 
         * <strong>example:</strong>
         * <p>Automatically created repository</p>
         */
        public Builder summary(String summary) {
            this.summary = summary;
            return this;
        }

        /**
         * <p>Indicates whether the feature of image tag immutability is enabled. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The feature of image tag immutability is enabled.</li>
         * <li><code>false</code>: The feature of image tag immutability is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
