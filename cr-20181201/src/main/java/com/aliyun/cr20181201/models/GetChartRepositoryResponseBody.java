// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetChartRepositoryResponseBody} extends {@link TeaModel}
 *
 * <p>GetChartRepositoryResponseBody</p>
 */
public class GetChartRepositoryResponseBody extends TeaModel {
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

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RepoId")
    private String repoId;

    @NameInMap("ModifiedTime")
    private Long modifiedTime;

    @NameInMap("Code")
    private String code;

    @NameInMap("RepoNamespaceName")
    private String repoNamespaceName;

    @NameInMap("RepoName")
    private String repoName;


    private GetChartRepositoryResponseBody(Builder builder) {
        this.summary = builder.summary;
        this.createTime = builder.createTime;
        this.isSuccess = builder.isSuccess;
        this.instanceId = builder.instanceId;
        this.repoStatus = builder.repoStatus;
        this.repoType = builder.repoType;
        this.requestId = builder.requestId;
        this.repoId = builder.repoId;
        this.modifiedTime = builder.modifiedTime;
        this.code = builder.code;
        this.repoNamespaceName = builder.repoNamespaceName;
        this.repoName = builder.repoName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetChartRepositoryResponseBody create() {
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
     * @return modifiedTime
     */
    public Long getModifiedTime() {
        return this.modifiedTime;
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
     * @return repoName
     */
    public String getRepoName() {
        return this.repoName;
    }

    public static final class Builder {
        private String summary; 
        private Long createTime; 
        private Boolean isSuccess; 
        private String instanceId; 
        private String repoStatus; 
        private String repoType; 
        private String requestId; 
        private String repoId; 
        private Long modifiedTime; 
        private String code; 
        private String repoNamespaceName; 
        private String repoName; 

        /**
         * <p>Chart repository overview</p>
         */
        public Builder summary(String summary) {
            this.summary = summary;
            return this;
        }

        /**
         * <p>Chart repository creation time</p>
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>Indicates whether the API is called. Valid values:

-"true": The API is called.

-"false": failed to call the API.</p>
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
         * <p>The status of the Chart repository. Valid values:

-"NORMAL": Normal

-"DELETING": Deleting</p>
         */
        public Builder repoStatus(String repoStatus) {
            this.repoStatus = repoStatus;
            return this;
        }

        /**
         * <p>The type of the Chart repository. Valid values:

-"PUBLIC": public repository

-"PRIVATE": private repository
</p>
         */
        public Builder repoType(String repoType) {
            this.repoType = repoType;
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
         * <p>Chart Repository ID</p>
         */
        public Builder repoId(String repoId) {
            this.repoId = repoId;
            return this;
        }

        /**
         * <p>Chart repository modification time</p>
         */
        public Builder modifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
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
         * <p>The namespace of the Chart repository.</p>
         */
        public Builder repoNamespaceName(String repoNamespaceName) {
            this.repoNamespaceName = repoNamespaceName;
            return this;
        }

        /**
         * <p>Chart repository name</p>
         */
        public Builder repoName(String repoName) {
            this.repoName = repoName;
            return this;
        }

        public GetChartRepositoryResponseBody build() {
            return new GetChartRepositoryResponseBody(this);
        } 

    } 

}
