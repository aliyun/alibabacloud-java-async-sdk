// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link GenerateWorkflowTemplateDraftRequest} extends {@link RequestModel}
 *
 * <p>GenerateWorkflowTemplateDraftRequest</p>
 */
public class GenerateWorkflowTemplateDraftRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("appToken")
    private String appToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("collaborationGroupId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 1)
    private String collaborationGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("opsUserCode")
    private String opsUserCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("opsUserId")
    private String opsUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("previousDraft")
    private java.util.Map<String, ?> previousDraft;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("requirement")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 10000, minLength = 1)
    private String requirement;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private GenerateWorkflowTemplateDraftRequest(Builder builder) {
        super(builder);
        this.appToken = builder.appToken;
        this.collaborationGroupId = builder.collaborationGroupId;
        this.opsUserCode = builder.opsUserCode;
        this.opsUserId = builder.opsUserId;
        this.previousDraft = builder.previousDraft;
        this.requirement = builder.requirement;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateWorkflowTemplateDraftRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appToken
     */
    public String getAppToken() {
        return this.appToken;
    }

    /**
     * @return collaborationGroupId
     */
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    /**
     * @return opsUserCode
     */
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    /**
     * @return opsUserId
     */
    public String getOpsUserId() {
        return this.opsUserId;
    }

    /**
     * @return previousDraft
     */
    public java.util.Map<String, ?> getPreviousDraft() {
        return this.previousDraft;
    }

    /**
     * @return requirement
     */
    public String getRequirement() {
        return this.requirement;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<GenerateWorkflowTemplateDraftRequest, Builder> {
        private String appToken; 
        private String collaborationGroupId; 
        private String opsUserCode; 
        private String opsUserId; 
        private java.util.Map<String, ?> previousDraft; 
        private String requirement; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(GenerateWorkflowTemplateDraftRequest request) {
            super(request);
            this.appToken = request.appToken;
            this.collaborationGroupId = request.collaborationGroupId;
            this.opsUserCode = request.opsUserCode;
            this.opsUserId = request.opsUserId;
            this.previousDraft = request.previousDraft;
            this.requirement = request.requirement;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>平台应用 Token（控制台签发）。传入后将以 opsUserId 或 opsUserCode 指定的用户身份执行</p>
         * 
         * <strong>example:</strong>
         * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
         */
        public Builder appToken(String appToken) {
            this.putQueryParameter("appToken", appToken);
            this.appToken = appToken;
            return this;
        }

        /**
         * <p>The ID of the collaboration space.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cg_9401</p>
         */
        public Builder collaborationGroupId(String collaborationGroupId) {
            this.putBodyParameter("collaborationGroupId", collaborationGroupId);
            this.collaborationGroupId = collaborationGroupId;
            return this;
        }

        /**
         * <p>代理用户编码（租户内唯一），仅当应用凭证配置为 source_uid 时使用</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        public Builder opsUserCode(String opsUserCode) {
            this.putQueryParameter("opsUserCode", opsUserCode);
            this.opsUserCode = opsUserCode;
            return this;
        }

        /**
         * <p>代理用户ID（WINNEXO 平台用户ID），仅当应用凭证配置为 winnexo_uid 时使用</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder opsUserId(String opsUserId) {
            this.putQueryParameter("opsUserId", opsUserId);
            this.opsUserId = opsUserId;
            return this;
        }

        /**
         * <p>The draft from the previous round. If this parameter is provided, the new draft is generated by iteratively modifying the previous draft.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;schemaVersion&quot;:2,&quot;steps&quot;:[]}</p>
         */
        public Builder previousDraft(java.util.Map<String, ?> previousDraft) {
            String previousDraftShrink = shrink(previousDraft, "previousDraft", "json");
            this.putBodyParameter("previousDraft", previousDraftShrink);
            this.previousDraft = previousDraft;
            return this;
        }

        /**
         * <p>The description of the template requirement.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Generate a three-step process for handling customer complaints</p>
         */
        public Builder requirement(String requirement) {
            this.putBodyParameter("requirement", requirement);
            this.requirement = requirement;
            return this;
        }

        /**
         * <p>The tenant ID. This is a common parameter. If this parameter is not specified, the default tenant of the caller is used.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public GenerateWorkflowTemplateDraftRequest build() {
            return new GenerateWorkflowTemplateDraftRequest(this);
        } 

    } 

}
