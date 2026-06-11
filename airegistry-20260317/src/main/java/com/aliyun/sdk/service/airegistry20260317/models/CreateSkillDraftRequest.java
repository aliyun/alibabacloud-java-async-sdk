// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airegistry20260317.models;

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
 * {@link CreateSkillDraftRequest} extends {@link RequestModel}
 *
 * <p>CreateSkillDraftRequest</p>
 */
public class CreateSkillDraftRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BasedOnVersion")
    private String basedOnVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommitMsg")
    private String commitMsg;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillCard")
    private String skillCard;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetVersion")
    private String targetVersion;

    private CreateSkillDraftRequest(Builder builder) {
        super(builder);
        this.basedOnVersion = builder.basedOnVersion;
        this.commitMsg = builder.commitMsg;
        this.namespaceId = builder.namespaceId;
        this.skillCard = builder.skillCard;
        this.skillName = builder.skillName;
        this.targetVersion = builder.targetVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSkillDraftRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return basedOnVersion
     */
    public String getBasedOnVersion() {
        return this.basedOnVersion;
    }

    /**
     * @return commitMsg
     */
    public String getCommitMsg() {
        return this.commitMsg;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * @return skillCard
     */
    public String getSkillCard() {
        return this.skillCard;
    }

    /**
     * @return skillName
     */
    public String getSkillName() {
        return this.skillName;
    }

    /**
     * @return targetVersion
     */
    public String getTargetVersion() {
        return this.targetVersion;
    }

    public static final class Builder extends Request.Builder<CreateSkillDraftRequest, Builder> {
        private String basedOnVersion; 
        private String commitMsg; 
        private String namespaceId; 
        private String skillCard; 
        private String skillName; 
        private String targetVersion; 

        private Builder() {
            super();
        } 

        private Builder(CreateSkillDraftRequest request) {
            super(request);
            this.basedOnVersion = request.basedOnVersion;
            this.commitMsg = request.commitMsg;
            this.namespaceId = request.namespaceId;
            this.skillCard = request.skillCard;
            this.skillName = request.skillName;
            this.targetVersion = request.targetVersion;
        } 

        /**
         * BasedOnVersion.
         */
        public Builder basedOnVersion(String basedOnVersion) {
            this.putQueryParameter("BasedOnVersion", basedOnVersion);
            this.basedOnVersion = basedOnVersion;
            return this;
        }

        /**
         * CommitMsg.
         */
        public Builder commitMsg(String commitMsg) {
            this.putQueryParameter("CommitMsg", commitMsg);
            this.commitMsg = commitMsg;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * SkillCard.
         */
        public Builder skillCard(String skillCard) {
            this.putQueryParameter("SkillCard", skillCard);
            this.skillCard = skillCard;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>customer-service-skill</p>
         */
        public Builder skillName(String skillName) {
            this.putQueryParameter("SkillName", skillName);
            this.skillName = skillName;
            return this;
        }

        /**
         * TargetVersion.
         */
        public Builder targetVersion(String targetVersion) {
            this.putQueryParameter("TargetVersion", targetVersion);
            this.targetVersion = targetVersion;
            return this;
        }

        @Override
        public CreateSkillDraftRequest build() {
            return new CreateSkillDraftRequest(this);
        } 

    } 

}
