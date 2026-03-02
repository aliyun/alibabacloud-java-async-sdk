// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link PdpService} extends {@link TeaModel}
 *
 * <p>PdpService</p>
 */
public class PdpService extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accountId")
    private String accountId;

    @com.aliyun.core.annotation.NameInMap("alias")
    @com.aliyun.core.annotation.Validation(required = true)
    private String alias;

    @com.aliyun.core.annotation.NameInMap("codeBranch")
    private String codeBranch;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("enterpriseId")
    private Long enterpriseId;

    @com.aliyun.core.annotation.NameInMap("extraInfo")
    private String extraInfo;

    @com.aliyun.core.annotation.NameInMap("gitRepo")
    private String gitRepo;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("jumpUrl")
    private String jumpUrl;

    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.NameInMap("orgType")
    private String orgType;

    @com.aliyun.core.annotation.NameInMap("pbcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pbcId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private PdpService(Builder builder) {
        this.accountId = builder.accountId;
        this.alias = builder.alias;
        this.codeBranch = builder.codeBranch;
        this.description = builder.description;
        this.enterpriseId = builder.enterpriseId;
        this.extraInfo = builder.extraInfo;
        this.gitRepo = builder.gitRepo;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.id = builder.id;
        this.jumpUrl = builder.jumpUrl;
        this.name = builder.name;
        this.orgType = builder.orgType;
        this.pbcId = builder.pbcId;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PdpService create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return alias
     */
    public String getAlias() {
        return this.alias;
    }

    /**
     * @return codeBranch
     */
    public String getCodeBranch() {
        return this.codeBranch;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    /**
     * @return extraInfo
     */
    public String getExtraInfo() {
        return this.extraInfo;
    }

    /**
     * @return gitRepo
     */
    public String getGitRepo() {
        return this.gitRepo;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return jumpUrl
     */
    public String getJumpUrl() {
        return this.jumpUrl;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return orgType
     */
    public String getOrgType() {
        return this.orgType;
    }

    /**
     * @return pbcId
     */
    public Long getPbcId() {
        return this.pbcId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String accountId; 
        private String alias; 
        private String codeBranch; 
        private String description; 
        private Long enterpriseId; 
        private String extraInfo; 
        private String gitRepo; 
        private String gmtCreate; 
        private String gmtModified; 
        private Long id; 
        private String jumpUrl; 
        private String name; 
        private String orgType; 
        private Long pbcId; 
        private String requestId; 
        private String status; 
        private String type; 

        private Builder() {
        } 

        private Builder(PdpService model) {
            this.accountId = model.accountId;
            this.alias = model.alias;
            this.codeBranch = model.codeBranch;
            this.description = model.description;
            this.enterpriseId = model.enterpriseId;
            this.extraInfo = model.extraInfo;
            this.gitRepo = model.gitRepo;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.id = model.id;
            this.jumpUrl = model.jumpUrl;
            this.name = model.name;
            this.orgType = model.orgType;
            this.pbcId = model.pbcId;
            this.requestId = model.requestId;
            this.status = model.status;
            this.type = model.type;
        } 

        /**
         * accountId.
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>员工管理</p>
         */
        public Builder alias(String alias) {
            this.alias = alias;
            return this;
        }

        /**
         * codeBranch.
         */
        public Builder codeBranch(String codeBranch) {
            this.codeBranch = codeBranch;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * enterpriseId.
         */
        public Builder enterpriseId(Long enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }

        /**
         * extraInfo.
         */
        public Builder extraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }

        /**
         * gitRepo.
         */
        public Builder gitRepo(String gitRepo) {
            this.gitRepo = gitRepo;
            return this;
        }

        /**
         * gmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * gmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * jumpUrl.
         */
        public Builder jumpUrl(String jumpUrl) {
            this.jumpUrl = jumpUrl;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>employee</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * orgType.
         */
        public Builder orgType(String orgType) {
            this.orgType = orgType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pbcId(Long pbcId) {
            this.pbcId = pbcId;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SDK</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public PdpService build() {
            return new PdpService(this);
        } 

    } 

}
