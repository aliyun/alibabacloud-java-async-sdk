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
 * {@link PdpServiceUpdateCmd} extends {@link TeaModel}
 *
 * <p>PdpServiceUpdateCmd</p>
 */
public class PdpServiceUpdateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("alias")
    private String alias;

    @com.aliyun.core.annotation.NameInMap("codeBranch")
    private String codeBranch;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("extraInfo")
    private String extraInfo;

    @com.aliyun.core.annotation.NameInMap("gitRepo")
    private String gitRepo;

    @com.aliyun.core.annotation.NameInMap("id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.NameInMap("jumpUrl")
    private String jumpUrl;

    private PdpServiceUpdateCmd(Builder builder) {
        this.alias = builder.alias;
        this.codeBranch = builder.codeBranch;
        this.description = builder.description;
        this.extraInfo = builder.extraInfo;
        this.gitRepo = builder.gitRepo;
        this.id = builder.id;
        this.jumpUrl = builder.jumpUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PdpServiceUpdateCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder {
        private String alias; 
        private String codeBranch; 
        private String description; 
        private String extraInfo; 
        private String gitRepo; 
        private Long id; 
        private String jumpUrl; 

        private Builder() {
        } 

        private Builder(PdpServiceUpdateCmd model) {
            this.alias = model.alias;
            this.codeBranch = model.codeBranch;
            this.description = model.description;
            this.extraInfo = model.extraInfo;
            this.gitRepo = model.gitRepo;
            this.id = model.id;
            this.jumpUrl = model.jumpUrl;
        } 

        /**
         * alias.
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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

        public PdpServiceUpdateCmd build() {
            return new PdpServiceUpdateCmd(this);
        } 

    } 

}
