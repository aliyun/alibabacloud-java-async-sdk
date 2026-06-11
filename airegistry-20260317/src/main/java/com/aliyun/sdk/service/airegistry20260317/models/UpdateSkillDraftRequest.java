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
 * {@link UpdateSkillDraftRequest} extends {@link RequestModel}
 *
 * <p>UpdateSkillDraftRequest</p>
 */
public class UpdateSkillDraftRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommitMsg")
    private String commitMsg;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillCard")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillCard;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillName;

    private UpdateSkillDraftRequest(Builder builder) {
        super(builder);
        this.commitMsg = builder.commitMsg;
        this.namespaceId = builder.namespaceId;
        this.skillCard = builder.skillCard;
        this.skillName = builder.skillName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSkillDraftRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<UpdateSkillDraftRequest, Builder> {
        private String commitMsg; 
        private String namespaceId; 
        private String skillCard; 
        private String skillName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSkillDraftRequest request) {
            super(request);
            this.commitMsg = request.commitMsg;
            this.namespaceId = request.namespaceId;
            this.skillCard = request.skillCard;
            this.skillName = request.skillName;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;name&quot;:&quot;customer-service-skill&quot;,&quot;description&quot;:&quot;...&quot;}</p>
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

        @Override
        public UpdateSkillDraftRequest build() {
            return new UpdateSkillDraftRequest(this);
        } 

    } 

}
