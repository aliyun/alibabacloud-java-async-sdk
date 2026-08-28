// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private CreateSkillDraftRequestBody body;

    private CreateSkillDraftRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.body = builder.body;
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
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return body
     */
    public CreateSkillDraftRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateSkillDraftRequest, Builder> {
        private String workspaceId; 
        private CreateSkillDraftRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(CreateSkillDraftRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.body = request.body;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * body.
         */
        public Builder body(CreateSkillDraftRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public CreateSkillDraftRequest build() {
            return new CreateSkillDraftRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateSkillDraftRequest} extends {@link TeaModel}
     *
     * <p>CreateSkillDraftRequest</p>
     */
    public static class CreateSkillDraftRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("basedOnVersion")
        private String basedOnVersion;

        @com.aliyun.core.annotation.NameInMap("commitMsg")
        private String commitMsg;

        @com.aliyun.core.annotation.NameInMap("skillCard")
        private String skillCard;

        @com.aliyun.core.annotation.NameInMap("skillName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String skillName;

        @com.aliyun.core.annotation.NameInMap("targetVersion")
        private String targetVersion;

        private CreateSkillDraftRequestBody(Builder builder) {
            this.basedOnVersion = builder.basedOnVersion;
            this.commitMsg = builder.commitMsg;
            this.skillCard = builder.skillCard;
            this.skillName = builder.skillName;
            this.targetVersion = builder.targetVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateSkillDraftRequestBody create() {
            return builder().build();
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

        public static final class Builder {
            private String basedOnVersion; 
            private String commitMsg; 
            private String skillCard; 
            private String skillName; 
            private String targetVersion; 

            private Builder() {
            } 

            private Builder(CreateSkillDraftRequestBody model) {
                this.basedOnVersion = model.basedOnVersion;
                this.commitMsg = model.commitMsg;
                this.skillCard = model.skillCard;
                this.skillName = model.skillName;
                this.targetVersion = model.targetVersion;
            } 

            /**
             * basedOnVersion.
             */
            public Builder basedOnVersion(String basedOnVersion) {
                this.basedOnVersion = basedOnVersion;
                return this;
            }

            /**
             * commitMsg.
             */
            public Builder commitMsg(String commitMsg) {
                this.commitMsg = commitMsg;
                return this;
            }

            /**
             * skillCard.
             */
            public Builder skillCard(String skillCard) {
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
                this.skillName = skillName;
                return this;
            }

            /**
             * targetVersion.
             */
            public Builder targetVersion(String targetVersion) {
                this.targetVersion = targetVersion;
                return this;
            }

            public CreateSkillDraftRequestBody build() {
                return new CreateSkillDraftRequestBody(this);
            } 

        } 

    }
}
