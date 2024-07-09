// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateChangeRequestResponseBody} extends {@link TeaModel}
 *
 * <p>CreateChangeRequestResponseBody</p>
 */
public class CreateChangeRequestResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("appCodeRepoSn")
    private String appCodeRepoSn;

    @com.aliyun.core.annotation.NameInMap("appName")
    private String appName;

    @com.aliyun.core.annotation.NameInMap("autoDeleteBranchWhenEnd")
    private Boolean autoDeleteBranchWhenEnd;

    @com.aliyun.core.annotation.NameInMap("branch")
    private String branch;

    @com.aliyun.core.annotation.NameInMap("creatorAccountId")
    private String creatorAccountId;

    @com.aliyun.core.annotation.NameInMap("creatorId")
    private String creatorId;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("originBranch")
    private String originBranch;

    @com.aliyun.core.annotation.NameInMap("originBranchRevisionSha")
    private String originBranchRevisionSha;

    @com.aliyun.core.annotation.NameInMap("ownerAccountId")
    private String ownerAccountId;

    @com.aliyun.core.annotation.NameInMap("ownerId")
    private String ownerId;

    @com.aliyun.core.annotation.NameInMap("sn")
    private String sn;

    @com.aliyun.core.annotation.NameInMap("state")
    private String state;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private CreateChangeRequestResponseBody(Builder builder) {
        this.appCodeRepoSn = builder.appCodeRepoSn;
        this.appName = builder.appName;
        this.autoDeleteBranchWhenEnd = builder.autoDeleteBranchWhenEnd;
        this.branch = builder.branch;
        this.creatorAccountId = builder.creatorAccountId;
        this.creatorId = builder.creatorId;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.name = builder.name;
        this.originBranch = builder.originBranch;
        this.originBranchRevisionSha = builder.originBranchRevisionSha;
        this.ownerAccountId = builder.ownerAccountId;
        this.ownerId = builder.ownerId;
        this.sn = builder.sn;
        this.state = builder.state;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateChangeRequestResponseBody create() {
        return builder().build();
    }

    /**
     * @return appCodeRepoSn
     */
    public String getAppCodeRepoSn() {
        return this.appCodeRepoSn;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return autoDeleteBranchWhenEnd
     */
    public Boolean getAutoDeleteBranchWhenEnd() {
        return this.autoDeleteBranchWhenEnd;
    }

    /**
     * @return branch
     */
    public String getBranch() {
        return this.branch;
    }

    /**
     * @return creatorAccountId
     */
    public String getCreatorAccountId() {
        return this.creatorAccountId;
    }

    /**
     * @return creatorId
     */
    public String getCreatorId() {
        return this.creatorId;
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return originBranch
     */
    public String getOriginBranch() {
        return this.originBranch;
    }

    /**
     * @return originBranchRevisionSha
     */
    public String getOriginBranchRevisionSha() {
        return this.originBranchRevisionSha;
    }

    /**
     * @return ownerAccountId
     */
    public String getOwnerAccountId() {
        return this.ownerAccountId;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return sn
     */
    public String getSn() {
        return this.sn;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String appCodeRepoSn; 
        private String appName; 
        private Boolean autoDeleteBranchWhenEnd; 
        private String branch; 
        private String creatorAccountId; 
        private String creatorId; 
        private String gmtCreate; 
        private String gmtModified; 
        private String name; 
        private String originBranch; 
        private String originBranchRevisionSha; 
        private String ownerAccountId; 
        private String ownerId; 
        private String sn; 
        private String state; 
        private String type; 

        /**
         * appCodeRepoSn.
         */
        public Builder appCodeRepoSn(String appCodeRepoSn) {
            this.appCodeRepoSn = appCodeRepoSn;
            return this;
        }

        /**
         * appName.
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * autoDeleteBranchWhenEnd.
         */
        public Builder autoDeleteBranchWhenEnd(Boolean autoDeleteBranchWhenEnd) {
            this.autoDeleteBranchWhenEnd = autoDeleteBranchWhenEnd;
            return this;
        }

        /**
         * branch.
         */
        public Builder branch(String branch) {
            this.branch = branch;
            return this;
        }

        /**
         * creatorAccountId.
         */
        public Builder creatorAccountId(String creatorAccountId) {
            this.creatorAccountId = creatorAccountId;
            return this;
        }

        /**
         * creatorId.
         */
        public Builder creatorId(String creatorId) {
            this.creatorId = creatorId;
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
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * originBranch.
         */
        public Builder originBranch(String originBranch) {
            this.originBranch = originBranch;
            return this;
        }

        /**
         * originBranchRevisionSha.
         */
        public Builder originBranchRevisionSha(String originBranchRevisionSha) {
            this.originBranchRevisionSha = originBranchRevisionSha;
            return this;
        }

        /**
         * ownerAccountId.
         */
        public Builder ownerAccountId(String ownerAccountId) {
            this.ownerAccountId = ownerAccountId;
            return this;
        }

        /**
         * ownerId.
         */
        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * sn.
         */
        public Builder sn(String sn) {
            this.sn = sn;
            return this;
        }

        /**
         * state.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public CreateChangeRequestResponseBody build() {
            return new CreateChangeRequestResponseBody(this);
        } 

    } 

}
