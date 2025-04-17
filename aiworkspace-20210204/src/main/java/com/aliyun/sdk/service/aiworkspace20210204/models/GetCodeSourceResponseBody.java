// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link GetCodeSourceResponseBody} extends {@link TeaModel}
 *
 * <p>GetCodeSourceResponseBody</p>
 */
public class GetCodeSourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.NameInMap("CodeBranch")
    private String codeBranch;

    @com.aliyun.core.annotation.NameInMap("CodeCommit")
    private String codeCommit;

    @com.aliyun.core.annotation.NameInMap("CodeRepo")
    private String codeRepo;

    @com.aliyun.core.annotation.NameInMap("CodeRepoAccessToken")
    private String codeRepoAccessToken;

    @com.aliyun.core.annotation.NameInMap("CodeRepoUserName")
    private String codeRepoUserName;

    @com.aliyun.core.annotation.NameInMap("CodeSourceId")
    private String codeSourceId;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifyTime")
    private String gmtModifyTime;

    @com.aliyun.core.annotation.NameInMap("MountPath")
    private String mountPath;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private GetCodeSourceResponseBody(Builder builder) {
        this.accessibility = builder.accessibility;
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
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCodeSourceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessibility
     */
    public String getAccessibility() {
        return this.accessibility;
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

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private String accessibility; 
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
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(GetCodeSourceResponseBody model) {
            this.accessibility = model.accessibility;
            this.codeBranch = model.codeBranch;
            this.codeCommit = model.codeCommit;
            this.codeRepo = model.codeRepo;
            this.codeRepoAccessToken = model.codeRepoAccessToken;
            this.codeRepoUserName = model.codeRepoUserName;
            this.codeSourceId = model.codeSourceId;
            this.description = model.description;
            this.displayName = model.displayName;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtModifyTime = model.gmtModifyTime;
            this.mountPath = model.mountPath;
            this.requestId = model.requestId;
            this.userId = model.userId;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * <p>The visibility of the code source. Valid values:</p>
         * <ul>
         * <li>PRIVATE: Visible only to you and the administrator of the workspace.</li>
         * <li>PUBLIC: Visible to all members in the workspace.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        public Builder accessibility(String accessibility) {
            this.accessibility = accessibility;
            return this;
        }

        /**
         * <p>The code repository branch.</p>
         * 
         * <strong>example:</strong>
         * <p>master</p>
         */
        public Builder codeBranch(String codeBranch) {
            this.codeBranch = codeBranch;
            return this;
        }

        /**
         * <p>The code commit ID.</p>
         * 
         * <strong>example:</strong>
         * <p>44da10***********</p>
         */
        public Builder codeCommit(String codeCommit) {
            this.codeCommit = codeCommit;
            return this;
        }

        /**
         * <p>The address of the code repository.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://code.aliyun.com/pai-dlc/examples.git">https://code.aliyun.com/pai-dlc/examples.git</a></p>
         */
        public Builder codeRepo(String codeRepo) {
            this.codeRepo = codeRepo;
            return this;
        }

        /**
         * <p>The token used to access the code repository.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        public Builder codeRepoAccessToken(String codeRepoAccessToken) {
            this.codeRepoAccessToken = codeRepoAccessToken;
            return this;
        }

        /**
         * <p>The username of the code repository.</p>
         * 
         * <strong>example:</strong>
         * <p>user1</p>
         */
        public Builder codeRepoUserName(String codeRepoUserName) {
            this.codeRepoUserName = codeRepoUserName;
            return this;
        }

        /**
         * <p>The ID of the code source.</p>
         * 
         * <strong>example:</strong>
         * <p>code-202**********</p>
         */
        public Builder codeSourceId(String codeSourceId) {
            this.codeSourceId = codeSourceId;
            return this;
        }

        /**
         * <p>The description of the code source.</p>
         * 
         * <strong>example:</strong>
         * <p>This is my data source 1.</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the code source.</p>
         * 
         * <strong>example:</strong>
         * <p>MyCodeSource1</p>
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The time when the code source was created, in the ISO8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-12T23:36:01.123Z</p>
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * <p>The time when the code source was modified, in the ISO8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-12T23:36:01.123Z</p>
         */
        public Builder gmtModifyTime(String gmtModifyTime) {
            this.gmtModifyTime = gmtModifyTime;
            return this;
        }

        /**
         * <p>The local mount path of the code.</p>
         * 
         * <strong>example:</strong>
         * <p>/root/code</p>
         */
        public Builder mountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5A14FA81-DD4E-******-6343FE44B941</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>1722********</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public GetCodeSourceResponseBody build() {
            return new GetCodeSourceResponseBody(this);
        } 

    } 

}
