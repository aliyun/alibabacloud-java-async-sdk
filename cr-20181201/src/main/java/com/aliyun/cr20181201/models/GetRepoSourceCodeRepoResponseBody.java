// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetRepoSourceCodeRepoResponseBody} extends {@link TeaModel}
 *
 * <p>GetRepoSourceCodeRepoResponseBody</p>
 */
public class GetRepoSourceCodeRepoResponseBody extends TeaModel {
    @NameInMap("CodeRepoType")
    private String codeRepoType;

    @NameInMap("RepoId")
    private String repoId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("CodeRepoNamespaceName")
    private String codeRepoNamespaceName;

    @NameInMap("OverseaBuild")
    private String overseaBuild;

    @NameInMap("Code")
    private String code;

    @NameInMap("CodeRepoName")
    private String codeRepoName;

    @NameInMap("AutoBuild")
    private String autoBuild;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("DisableCacheBuild")
    private String disableCacheBuild;

    @NameInMap("CodeRepoDomain")
    private String codeRepoDomain;


    private GetRepoSourceCodeRepoResponseBody(Builder builder) {
        this.codeRepoType = builder.codeRepoType;
        this.repoId = builder.repoId;
        this.requestId = builder.requestId;
        this.codeRepoNamespaceName = builder.codeRepoNamespaceName;
        this.overseaBuild = builder.overseaBuild;
        this.code = builder.code;
        this.codeRepoName = builder.codeRepoName;
        this.autoBuild = builder.autoBuild;
        this.isSuccess = builder.isSuccess;
        this.disableCacheBuild = builder.disableCacheBuild;
        this.codeRepoDomain = builder.codeRepoDomain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRepoSourceCodeRepoResponseBody create() {
        return builder().build();
    }

    /**
     * @return codeRepoType
     */
    public String getCodeRepoType() {
        return this.codeRepoType;
    }

    /**
     * @return repoId
     */
    public String getRepoId() {
        return this.repoId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return codeRepoNamespaceName
     */
    public String getCodeRepoNamespaceName() {
        return this.codeRepoNamespaceName;
    }

    /**
     * @return overseaBuild
     */
    public String getOverseaBuild() {
        return this.overseaBuild;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return codeRepoName
     */
    public String getCodeRepoName() {
        return this.codeRepoName;
    }

    /**
     * @return autoBuild
     */
    public String getAutoBuild() {
        return this.autoBuild;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return disableCacheBuild
     */
    public String getDisableCacheBuild() {
        return this.disableCacheBuild;
    }

    /**
     * @return codeRepoDomain
     */
    public String getCodeRepoDomain() {
        return this.codeRepoDomain;
    }

    public static final class Builder {
        private String codeRepoType; 
        private String repoId; 
        private String requestId; 
        private String codeRepoNamespaceName; 
        private String overseaBuild; 
        private String code; 
        private String codeRepoName; 
        private String autoBuild; 
        private Boolean isSuccess; 
        private String disableCacheBuild; 
        private String codeRepoDomain; 

        /**
         * <p>The source code platform type. Valid values: "GITHUB", "GITLAB", "GITEE", "CODE", and "CODEUP"</p>
         */
        public Builder codeRepoType(String codeRepoType) {
            this.codeRepoType = codeRepoType;
            return this;
        }

        /**
         * <p>Mirror warehouse ID</p>
         */
        public Builder repoId(String repoId) {
            this.repoId = repoId;
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
         * <p>The namespace of the source code repository.</p>
         */
        public Builder codeRepoNamespaceName(String codeRepoNamespaceName) {
            this.codeRepoNamespaceName = codeRepoNamespaceName;
            return this;
        }

        /**
         * <p>Specifies whether to enable intelligent build acceleration for overseas sources. Valid values:

-"true": Enable Intelligent Building acceleration for overseas sources

-"false": disable intelligent building acceleration for overseas sources</p>
         */
        public Builder overseaBuild(String overseaBuild) {
            this.overseaBuild = overseaBuild;
            return this;
        }

        /**
         * <p>Response code</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Source code repository name</p>
         */
        public Builder codeRepoName(String codeRepoName) {
            this.codeRepoName = codeRepoName;
            return this;
        }

        /**
         * <p>Specifies whether to enable the source code submission feature to automatically trigger the build. Valid values:

-"true": open source code submission to automatically trigger build

-"false": disable automatic build triggered by source code submission</p>
         */
        public Builder autoBuild(String autoBuild) {
            this.autoBuild = autoBuild;
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
         * <p>Specifies whether to disable the build cache. Valid values:

-"true": disables the build cache.

-"false": enable build cache</p>
         */
        public Builder disableCacheBuild(String disableCacheBuild) {
            this.disableCacheBuild = disableCacheBuild;
            return this;
        }

        /**
         * <p>Source code repository address</p>
         */
        public Builder codeRepoDomain(String codeRepoDomain) {
            this.codeRepoDomain = codeRepoDomain;
            return this;
        }

        public GetRepoSourceCodeRepoResponseBody build() {
            return new GetRepoSourceCodeRepoResponseBody(this);
        } 

    } 

}
