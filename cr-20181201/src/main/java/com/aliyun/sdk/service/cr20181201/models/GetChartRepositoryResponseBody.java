// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetChartRepositoryResponseBody} extends {@link TeaModel}
 *
 * <p>GetChartRepositoryResponseBody</p>
 */
public class GetChartRepositoryResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("CreateTime")
    private Long createTime;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

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

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @NameInMap("Summary")
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

        /**
         * The return value.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The time when the chart repository was created.
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
         * Indicates whether the request is successful. Valid values:
         * <p>
         * 
         * *   `true`: The request is successful.
         * *   `false`: The request fails.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * The time when the chart repository was last modified.
         */
        public Builder modifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }

        /**
         * The ID of the chart repository.
         */
        public Builder repoId(String repoId) {
            this.repoId = repoId;
            return this;
        }

        /**
         * The name of the chart repository.
         */
        public Builder repoName(String repoName) {
            this.repoName = repoName;
            return this;
        }

        /**
         * The name of the namespace to which the chart repository belongs.
         */
        public Builder repoNamespaceName(String repoNamespaceName) {
            this.repoNamespaceName = repoNamespaceName;
            return this;
        }

        /**
         * The status of the chart repository. Valid values:
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
         * The type of the chart repository. Valid values:
         * <p>
         * 
         * *   `PUBLIC`: a public repository
         * *   `PRIVATE`: a private repository
         */
        public Builder repoType(String repoType) {
            this.repoType = repoType;
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The summary about the chart repository.
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
