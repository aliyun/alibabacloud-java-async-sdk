// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCodeSourceResponseBody} extends {@link TeaModel}
 *
 * <p>GetCodeSourceResponseBody</p>
 */
public class GetCodeSourceResponseBody extends TeaModel {
    @NameInMap("CodeBranch")
    private String codeBranch;

    @NameInMap("CodeCommit")
    private String codeCommit;

    @NameInMap("CodeRepo")
    private String codeRepo;

    @NameInMap("CodeRepoAccessToken")
    private String codeRepoAccessToken;

    @NameInMap("CodeRepoUserName")
    private String codeRepoUserName;

    @NameInMap("CodeSourceId")
    private String codeSourceId;

    @NameInMap("Description")
    private String description;

    @NameInMap("DisplayName")
    private String displayName;

    @NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @NameInMap("GmtModifyTime")
    private String gmtModifyTime;

    @NameInMap("MountPath")
    private String mountPath;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UserId")
    private String userId;

    private GetCodeSourceResponseBody(Builder builder) {
        this.codeBranch = builder.codeBranch;
        this.codeCommit = builder.codeCommit;
        this.codeRepo = builder.codeRepo;
        this.codeRepoAccessToken = builder.codeRepoAccessToken;
        this.codeRepoUserName = builder.codeRepoUserName;
        this.codeSourceId = builder.codeSourceId;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifyTime = builder.gmtModifyTime;
        this.mountPath = builder.mountPath;
        this.requestId = builder.requestId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCodeSourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return codeBranch
     */
    public String getCodeBranch() {
        return this.codeBranch;
    }

    /**
     * @return codeCommit
     */
    public String getCodeCommit() {
        return this.codeCommit;
    }

    /**
     * @return codeRepo
     */
    public String getCodeRepo() {
        return this.codeRepo;
    }

    /**
     * @return codeRepoAccessToken
     */
    public String getCodeRepoAccessToken() {
        return this.codeRepoAccessToken;
    }

    /**
     * @return codeRepoUserName
     */
    public String getCodeRepoUserName() {
        return this.codeRepoUserName;
    }

    /**
     * @return codeSourceId
     */
    public String getCodeSourceId() {
        return this.codeSourceId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModifyTime
     */
    public String getGmtModifyTime() {
        return this.gmtModifyTime;
    }

    /**
     * @return mountPath
     */
    public String getMountPath() {
        return this.mountPath;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String codeBranch; 
        private String codeCommit; 
        private String codeRepo; 
        private String codeRepoAccessToken; 
        private String codeRepoUserName; 
        private String codeSourceId; 
        private String description; 
        private String displayName; 
        private String gmtCreateTime; 
        private String gmtModifyTime; 
        private String mountPath; 
        private String requestId; 
        private String userId; 

        /**
         * 代码仓库分支
         */
        public Builder codeBranch(String codeBranch) {
            this.codeBranch = codeBranch;
            return this;
        }

        /**
         * 代码Commit
         */
        public Builder codeCommit(String codeCommit) {
            this.codeCommit = codeCommit;
            return this;
        }

        /**
         * 代码仓库地址
         */
        public Builder codeRepo(String codeRepo) {
            this.codeRepo = codeRepo;
            return this;
        }

        /**
         * 访问代码仓库的token
         */
        public Builder codeRepoAccessToken(String codeRepoAccessToken) {
            this.codeRepoAccessToken = codeRepoAccessToken;
            return this;
        }

        /**
         * 代码仓库的用户名
         */
        public Builder codeRepoUserName(String codeRepoUserName) {
            this.codeRepoUserName = codeRepoUserName;
            return this;
        }

        /**
         * 代码源配置ID
         */
        public Builder codeSourceId(String codeSourceId) {
            this.codeSourceId = codeSourceId;
            return this;
        }

        /**
         * 详细描述
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * 代码源配置名字
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * 创建时间
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * 修改时间
         */
        public Builder gmtModifyTime(String gmtModifyTime) {
            this.gmtModifyTime = gmtModifyTime;
            return this;
        }

        /**
         * 代码本地挂载目录，默认挂载到/root/code/下
         */
        public Builder mountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }

        /**
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 代码配置源的创建者ID
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public GetCodeSourceResponseBody build() {
            return new GetCodeSourceResponseBody(this);
        } 

    } 

}
