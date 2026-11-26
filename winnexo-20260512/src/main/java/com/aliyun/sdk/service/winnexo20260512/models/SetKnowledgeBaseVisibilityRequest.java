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
 * {@link SetKnowledgeBaseVisibilityRequest} extends {@link RequestModel}
 *
 * <p>SetKnowledgeBaseVisibilityRequest</p>
 */
public class SetKnowledgeBaseVisibilityRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("appToken")
    private String appToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cascadeMode")
    private String cascadeMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("opsUserCode")
    private String opsUserCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("opsUserId")
    private String opsUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("targetId")
    @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
    private String targetId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("targetType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userGroupIds")
    private java.util.List<String> userGroupIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userIds")
    private java.util.List<String> userIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("visibilityMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String visibilityMode;

    private SetKnowledgeBaseVisibilityRequest(Builder builder) {
        super(builder);
        this.appToken = builder.appToken;
        this.cascadeMode = builder.cascadeMode;
        this.opsUserCode = builder.opsUserCode;
        this.opsUserId = builder.opsUserId;
        this.targetId = builder.targetId;
        this.targetType = builder.targetType;
        this.tenantId = builder.tenantId;
        this.userGroupIds = builder.userGroupIds;
        this.userIds = builder.userIds;
        this.visibilityMode = builder.visibilityMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetKnowledgeBaseVisibilityRequest create() {
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
     * @return cascadeMode
     */
    public String getCascadeMode() {
        return this.cascadeMode;
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
     * @return targetId
     */
    public String getTargetId() {
        return this.targetId;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return userGroupIds
     */
    public java.util.List<String> getUserGroupIds() {
        return this.userGroupIds;
    }

    /**
     * @return userIds
     */
    public java.util.List<String> getUserIds() {
        return this.userIds;
    }

    /**
     * @return visibilityMode
     */
    public String getVisibilityMode() {
        return this.visibilityMode;
    }

    public static final class Builder extends Request.Builder<SetKnowledgeBaseVisibilityRequest, Builder> {
        private String appToken; 
        private String cascadeMode; 
        private String opsUserCode; 
        private String opsUserId; 
        private String targetId; 
        private String targetType; 
        private String tenantId; 
        private java.util.List<String> userGroupIds; 
        private java.util.List<String> userIds; 
        private String visibilityMode; 

        private Builder() {
            super();
        } 

        private Builder(SetKnowledgeBaseVisibilityRequest request) {
            super(request);
            this.appToken = request.appToken;
            this.cascadeMode = request.cascadeMode;
            this.opsUserCode = request.opsUserCode;
            this.opsUserId = request.opsUserId;
            this.targetId = request.targetId;
            this.targetType = request.targetType;
            this.tenantId = request.tenantId;
            this.userGroupIds = request.userGroupIds;
            this.userIds = request.userIds;
            this.visibilityMode = request.visibilityMode;
        } 

        /**
         * <p>token</p>
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
         * <p>Specifies how to handle subfolders.</p>
         * 
         * <strong>example:</strong>
         * <p>CURRENT_ONLY</p>
         */
        public Builder cascadeMode(String cascadeMode) {
            this.putBodyParameter("cascadeMode", cascadeMode);
            this.cascadeMode = cascadeMode;
            return this;
        }

        /**
         * <p>The user code.</p>
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
         * <p>The ID of the operator.</p>
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
         * <p>The target ID, which varies based on the target type.</p>
         * <ul>
         * <li>If the type is period, specify the period ID.</li>
         * <li>If the type is objective, specify the objective ID.</li>
         * <li>If the type is kr, specify the keyResult ID.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>kb_001</p>
         */
        public Builder targetId(String targetId) {
            this.putBodyParameter("targetId", targetId);
            this.targetId = targetId;
            return this;
        }

        /**
         * <p>The type of the current permission. Valid values:</p>
         * <ul>
         * <li>period: period type</li>
         * <li>objective: objective type</li>
         * <li>kr: keyResult type</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>KB</p>
         */
        public Builder targetType(String targetType) {
            this.putBodyParameter("targetType", targetType);
            this.targetType = targetType;
            return this;
        }

        /**
         * <p>The ID of the tenant to which the resource belongs. If this parameter is not specified, the current tenant of the caller is used.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>The collection of user groups.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;group-1&quot;]</p>
         */
        public Builder userGroupIds(java.util.List<String> userGroupIds) {
            String userGroupIdsShrink = shrink(userGroupIds, "userGroupIds", "json");
            this.putBodyParameter("userGroupIds", userGroupIdsShrink);
            this.userGroupIds = userGroupIds;
            return this;
        }

        /**
         * <p>The collection of user IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;10001&quot;]</p>
         */
        public Builder userIds(java.util.List<String> userIds) {
            String userIdsShrink = shrink(userIds, "userIds", "json");
            this.putBodyParameter("userIds", userIdsShrink);
            this.userIds = userIds;
            return this;
        }

        /**
         * <p>The visibility scope mode.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SPECIFIED</p>
         */
        public Builder visibilityMode(String visibilityMode) {
            this.putBodyParameter("visibilityMode", visibilityMode);
            this.visibilityMode = visibilityMode;
            return this;
        }

        @Override
        public SetKnowledgeBaseVisibilityRequest build() {
            return new SetKnowledgeBaseVisibilityRequest(this);
        } 

    } 

}
