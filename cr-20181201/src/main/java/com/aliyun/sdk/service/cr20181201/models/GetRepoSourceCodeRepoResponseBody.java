// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRepoSourceCodeRepoResponseBody} extends {@link TeaModel}
 *
 * <p>GetRepoSourceCodeRepoResponseBody</p>
 */
public class GetRepoSourceCodeRepoResponseBody extends TeaModel {
    @NameInMap("AutoBuild")
    private String autoBuild;

    @NameInMap("Code")
    private String code;

    @NameInMap("CodeRepoDomain")
    private String codeRepoDomain;

    @NameInMap("CodeRepoName")
    private String codeRepoName;

    @NameInMap("CodeRepoNamespaceName")
    private String codeRepoNamespaceName;

    @NameInMap("CodeRepoType")
    private String codeRepoType;

    @NameInMap("DisableCacheBuild")
    private String disableCacheBuild;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("OverseaBuild")
    private String overseaBuild;

    @NameInMap("RepoId")
    private String repoId;

    @NameInMap("RequestId")
    private String requestId;

    private GetRepoSourceCodeRepoResponseBody(Builder builder) {
        this.autoBuild = builder.autoBuild;
        this.code = builder.code;
        this.codeRepoDomain = builder.codeRepoDomain;
        this.codeRepoName = builder.codeRepoName;
        this.codeRepoNamespaceName = builder.codeRepoNamespaceName;
        this.codeRepoType = builder.codeRepoType;
        this.disableCacheBuild = builder.disableCacheBuild;
        this.isSuccess = builder.isSuccess;
        this.overseaBuild = builder.overseaBuild;
        this.repoId = builder.repoId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRepoSourceCodeRepoResponseBody create() {
        return builder().build();
    }

    /**
     * @return autoBuild
     */
    public String getAutoBuild() {
        return this.autoBuild;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return codeRepoDomain
     */
    public String getCodeRepoDomain() {
        return this.codeRepoDomain;
    }

    /**
     * @return codeRepoName
     */
    public String getCodeRepoName() {
        return this.codeRepoName;
    }

    /**
     * @return codeRepoNamespaceName
     */
    public String getCodeRepoNamespaceName() {
        return this.codeRepoNamespaceName;
    }

    /**
     * @return codeRepoType
     */
    public String getCodeRepoType() {
        return this.codeRepoType;
    }

    /**
     * @return disableCacheBuild
     */
    public String getDisableCacheBuild() {
        return this.disableCacheBuild;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return overseaBuild
     */
    public String getOverseaBuild() {
        return this.overseaBuild;
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

    public static final class Builder {
        private String autoBuild; 
        private String code; 
        private String codeRepoDomain; 
        private String codeRepoName; 
        private String codeRepoNamespaceName; 
        private String codeRepoType; 
        private String disableCacheBuild; 
        private Boolean isSuccess; 
        private String overseaBuild; 
        private String repoId; 
        private String requestId; 

        /**
         * AutoBuild.
         */
        public Builder autoBuild(String autoBuild) {
            this.autoBuild = autoBuild;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * CodeRepoDomain.
         */
        public Builder codeRepoDomain(String codeRepoDomain) {
            this.codeRepoDomain = codeRepoDomain;
            return this;
        }

        /**
         * CodeRepoName.
         */
        public Builder codeRepoName(String codeRepoName) {
            this.codeRepoName = codeRepoName;
            return this;
        }

        /**
         * CodeRepoNamespaceName.
         */
        public Builder codeRepoNamespaceName(String codeRepoNamespaceName) {
            this.codeRepoNamespaceName = codeRepoNamespaceName;
            return this;
        }

        /**
         * CodeRepoType.
         */
        public Builder codeRepoType(String codeRepoType) {
            this.codeRepoType = codeRepoType;
            return this;
        }

        /**
         * DisableCacheBuild.
         */
        public Builder disableCacheBuild(String disableCacheBuild) {
            this.disableCacheBuild = disableCacheBuild;
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
         * OverseaBuild.
         */
        public Builder overseaBuild(String overseaBuild) {
            this.overseaBuild = overseaBuild;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetRepoSourceCodeRepoResponseBody build() {
            return new GetRepoSourceCodeRepoResponseBody(this);
        } 

    } 

}
