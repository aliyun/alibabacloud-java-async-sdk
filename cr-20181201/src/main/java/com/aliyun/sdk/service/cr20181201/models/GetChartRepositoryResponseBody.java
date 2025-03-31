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
 * {@link GetChartRepositoryResponseBody} extends {@link TeaModel}
 *
 * <p>GetChartRepositoryResponseBody</p>
 */
public class GetChartRepositoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("IsSuccess")
    private Boolean isSuccess;

    @com.aliyun.core.annotation.NameInMap("ModifiedTime")
    private Long modifiedTime;

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

    private GetChartRepositoryResponseBody(Builder builder) {
        this.code = builder.code;
        this.createTime = builder.createTime;
        this.instanceId = builder.instanceId;
        this.isSuccess = builder.isSuccess;
        this.modifiedTime = builder.modifiedTime;
        this.repoId = builder.repoId;
        this.repoName = builder.repoName;
        this.repoNamespaceName = builder.repoNamespaceName;
        this.repoStatus = builder.repoStatus;
        this.repoType = builder.repoType;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.summary = builder.summary;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetChartRepositoryResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Long createTime; 
        private String instanceId; 
        private Boolean isSuccess; 
        private Long modifiedTime; 
        private String repoId; 
        private String repoName; 
        private String repoNamespaceName; 
        private String repoStatus; 
        private String repoType; 
        private String requestId; 
        private String resourceGroupId; 
        private String summary; 

        private Builder() {
        } 

        private Builder(GetChartRepositoryResponseBody model) {
            this.code = model.code;
            this.createTime = model.createTime;
            this.instanceId = model.instanceId;
            this.isSuccess = model.isSuccess;
            this.modifiedTime = model.modifiedTime;
            this.repoId = model.repoId;
            this.repoName = model.repoName;
            this.repoNamespaceName = model.repoNamespaceName;
            this.repoStatus = model.repoStatus;
            this.repoType = model.repoType;
            this.requestId = model.requestId;
            this.resourceGroupId = model.resourceGroupId;
            this.summary = model.summary;
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
         * <p>The time when the chart repository was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1563767620000</p>
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
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
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The request is successful.</li>
         * <li><code>false</code>: The request fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>The time when the chart repository was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1563767700000</p>
         */
        public Builder modifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }

        /**
         * <p>The ID of the chart repository.</p>
         * 
         * <strong>example:</strong>
         * <p>crcr-c7letfwev5oq****</p>
         */
        public Builder repoId(String repoId) {
            this.repoId = repoId;
            return this;
        }

        /**
         * <p>The name of the chart repository.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder repoName(String repoName) {
            this.repoName = repoName;
            return this;
        }

        /**
         * <p>The name of the namespace to which the chart repository belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder repoNamespaceName(String repoNamespaceName) {
            this.repoNamespaceName = repoNamespaceName;
            return this;
        }

        /**
         * <p>The status of the chart repository. Valid values:</p>
         * <ul>
         * <li><code>NORMAL</code>: The repository is normal.</li>
         * <li><code>DELETING</code>: The repository is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder repoStatus(String repoStatus) {
            this.repoStatus = repoStatus;
            return this;
        }

        /**
         * <p>The type of the chart repository. Valid values:</p>
         * <ul>
         * <li><code>PUBLIC</code>: a public repository</li>
         * <li><code>PRIVATE</code>: a private repository</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        public Builder repoType(String repoType) {
            this.repoType = repoType;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A3F6AB56-DEF4-4FF5-8DE4-680362C0E21F</p>
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
         * <p>The summary about the chart repository.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder summary(String summary) {
            this.summary = summary;
            return this;
        }

        public GetChartRepositoryResponseBody build() {
            return new GetChartRepositoryResponseBody(this);
        } 

    } 

}
