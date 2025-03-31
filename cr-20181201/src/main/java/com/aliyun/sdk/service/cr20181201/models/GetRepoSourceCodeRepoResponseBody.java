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
 * {@link GetRepoSourceCodeRepoResponseBody} extends {@link TeaModel}
 *
 * <p>GetRepoSourceCodeRepoResponseBody</p>
 */
public class GetRepoSourceCodeRepoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutoBuild")
    private String autoBuild;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CodeRepoDomain")
    private String codeRepoDomain;

    @com.aliyun.core.annotation.NameInMap("CodeRepoName")
    private String codeRepoName;

    @com.aliyun.core.annotation.NameInMap("CodeRepoNamespaceName")
    private String codeRepoNamespaceName;

    @com.aliyun.core.annotation.NameInMap("CodeRepoType")
    private String codeRepoType;

    @com.aliyun.core.annotation.NameInMap("DisableCacheBuild")
    private String disableCacheBuild;

    @com.aliyun.core.annotation.NameInMap("IsSuccess")
    private Boolean isSuccess;

    @com.aliyun.core.annotation.NameInMap("OverseaBuild")
    private String overseaBuild;

    @com.aliyun.core.annotation.NameInMap("RepoId")
    private String repoId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetRepoSourceCodeRepoResponseBody model) {
            this.autoBuild = model.autoBuild;
            this.code = model.code;
            this.codeRepoDomain = model.codeRepoDomain;
            this.codeRepoName = model.codeRepoName;
            this.codeRepoNamespaceName = model.codeRepoNamespaceName;
            this.codeRepoType = model.codeRepoType;
            this.disableCacheBuild = model.disableCacheBuild;
            this.isSuccess = model.isSuccess;
            this.overseaBuild = model.overseaBuild;
            this.repoId = model.repoId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Indicates whether image building is automatically triggered when source code is committed. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Image building is automatically triggered when source code is committed.</li>
         * <li><code>false</code>: Image building is not triggered when source code is committed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoBuild(String autoBuild) {
            this.autoBuild = autoBuild;
            return this;
        }

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The address of the source code repository.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://github.com">https://github.com</a></p>
         */
        public Builder codeRepoDomain(String codeRepoDomain) {
            this.codeRepoDomain = codeRepoDomain;
            return this;
        }

        /**
         * <p>The name of the source code repository.</p>
         * 
         * <strong>example:</strong>
         * <p>repo</p>
         */
        public Builder codeRepoName(String codeRepoName) {
            this.codeRepoName = codeRepoName;
            return this;
        }

        /**
         * <p>The namespace to which the source code repository belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>namespace</p>
         */
        public Builder codeRepoNamespaceName(String codeRepoNamespaceName) {
            this.codeRepoNamespaceName = codeRepoNamespaceName;
            return this;
        }

        /**
         * <p>The type of the code hosting platform. Valid values: <code>GITHUB</code>, <code>GITLAB</code>, <code>GITEE</code>, <code>CODE</code>, and <code>CODEUP</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>GITHUB</p>
         */
        public Builder codeRepoType(String codeRepoType) {
            this.codeRepoType = codeRepoType;
            return this;
        }

        /**
         * <p>Indicates whether build cache is disabled. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Build cache is disabled.</li>
         * <li><code>false</code>: Build cache is enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder disableCacheBuild(String disableCacheBuild) {
            this.disableCacheBuild = disableCacheBuild;
            return this;
        }

        /**
         * <p>Indicates whether the API call is successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: successful</li>
         * <li><code>false</code>: failed</li>
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
         * <p>Indicates whether image building is accelerated for servers outside the Chinese mainland. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Image building is accelerated for servers outside the Chinese mainland.</li>
         * <li><code>false</code>: Image building is not accelerated for servers outside the Chinese mainland.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder overseaBuild(String overseaBuild) {
            this.overseaBuild = overseaBuild;
            return this;
        }

        /**
         * <p>The ID of the repository.</p>
         * 
         * <strong>example:</strong>
         * <p>crr-gzsrlevmvoaq****</p>
         */
        public Builder repoId(String repoId) {
            this.repoId = repoId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4CE1F661-75DD-4EBD-A4AD-057B26834ABB</p>
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
