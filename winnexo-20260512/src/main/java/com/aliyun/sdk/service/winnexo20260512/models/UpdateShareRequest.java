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
 * {@link UpdateShareRequest} extends {@link RequestModel}
 *
 * <p>UpdateShareRequest</p>
 */
public class UpdateShareRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("appToken")
    private String appToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("opsUserCode")
    private String opsUserCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("opsUserId")
    private String opsUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("outputItemId")
    private String outputItemId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("outputItemName")
    private String outputItemName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("refreshShareLink")
    private Boolean refreshShareLink;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("shareAccessType")
    private String shareAccessType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("shareEnabled")
    private Boolean shareEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("shareUserGroupIds")
    private java.util.List<String> shareUserGroupIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("shareUserIds")
    private java.util.List<Long> shareUserIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("targetType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private UpdateShareRequest(Builder builder) {
        super(builder);
        this.appToken = builder.appToken;
        this.opsUserCode = builder.opsUserCode;
        this.opsUserId = builder.opsUserId;
        this.outputItemId = builder.outputItemId;
        this.outputItemName = builder.outputItemName;
        this.refreshShareLink = builder.refreshShareLink;
        this.sessionId = builder.sessionId;
        this.shareAccessType = builder.shareAccessType;
        this.shareEnabled = builder.shareEnabled;
        this.shareUserGroupIds = builder.shareUserGroupIds;
        this.shareUserIds = builder.shareUserIds;
        this.targetType = builder.targetType;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateShareRequest create() {
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
     * @return outputItemId
     */
    public String getOutputItemId() {
        return this.outputItemId;
    }

    /**
     * @return outputItemName
     */
    public String getOutputItemName() {
        return this.outputItemName;
    }

    /**
     * @return refreshShareLink
     */
    public Boolean getRefreshShareLink() {
        return this.refreshShareLink;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return shareAccessType
     */
    public String getShareAccessType() {
        return this.shareAccessType;
    }

    /**
     * @return shareEnabled
     */
    public Boolean getShareEnabled() {
        return this.shareEnabled;
    }

    /**
     * @return shareUserGroupIds
     */
    public java.util.List<String> getShareUserGroupIds() {
        return this.shareUserGroupIds;
    }

    /**
     * @return shareUserIds
     */
    public java.util.List<Long> getShareUserIds() {
        return this.shareUserIds;
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

    public static final class Builder extends Request.Builder<UpdateShareRequest, Builder> {
        private String appToken; 
        private String opsUserCode; 
        private String opsUserId; 
        private String outputItemId; 
        private String outputItemName; 
        private Boolean refreshShareLink; 
        private String sessionId; 
        private String shareAccessType; 
        private Boolean shareEnabled; 
        private java.util.List<String> shareUserGroupIds; 
        private java.util.List<Long> shareUserIds; 
        private String targetType; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateShareRequest request) {
            super(request);
            this.appToken = request.appToken;
            this.opsUserCode = request.opsUserCode;
            this.opsUserId = request.opsUserId;
            this.outputItemId = request.outputItemId;
            this.outputItemName = request.outputItemName;
            this.refreshShareLink = request.refreshShareLink;
            this.sessionId = request.sessionId;
            this.shareAccessType = request.shareAccessType;
            this.shareEnabled = request.shareEnabled;
            this.shareUserGroupIds = request.shareUserGroupIds;
            this.shareUserIds = request.shareUserIds;
            this.targetType = request.targetType;
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
         * <p>The output item ID.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleOutputItemId</p>
         */
        public Builder outputItemId(String outputItemId) {
            this.putBodyParameter("outputItemId", outputItemId);
            this.outputItemId = outputItemId;
            return this;
        }

        /**
         * <p>The name of the output item. This parameter must be used together with sessionId.</p>
         * 
         * <strong>example:</strong>
         * <p>Quarterly Review.pptx</p>
         */
        public Builder outputItemName(String outputItemName) {
            this.putBodyParameter("outputItemName", outputItemName);
            this.outputItemName = outputItemName;
            return this;
        }

        /**
         * <p>Specifies whether to refresh the sharing link. This is supported only for output items that have sharing enabled or are being enabled in the current request.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder refreshShareLink(Boolean refreshShareLink) {
            this.putBodyParameter("refreshShareLink", refreshShareLink);
            this.refreshShareLink = refreshShareLink;
            return this;
        }

        /**
         * <p>The session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleSessionId</p>
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("sessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The sharing scope. Valid values:</p>
         * <ul>
         * <li>PUBLIC: Accessible to all users.</li>
         * <li>SPECIFIED: Accessible to specified users or user groups.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SPECIFIED</p>
         */
        public Builder shareAccessType(String shareAccessType) {
            this.putBodyParameter("shareAccessType", shareAccessType);
            this.shareAccessType = shareAccessType;
            return this;
        }

        /**
         * <p>Specifies whether sharing is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder shareEnabled(Boolean shareEnabled) {
            this.putBodyParameter("shareEnabled", shareEnabled);
            this.shareEnabled = shareEnabled;
            return this;
        }

        /**
         * <p>The list of user group IDs within the specified scope. Pass an empty array to clear the list.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;group-1&quot;]</p>
         */
        public Builder shareUserGroupIds(java.util.List<String> shareUserGroupIds) {
            String shareUserGroupIdsShrink = shrink(shareUserGroupIds, "shareUserGroupIds", "json");
            this.putBodyParameter("shareUserGroupIds", shareUserGroupIdsShrink);
            this.shareUserGroupIds = shareUserGroupIds;
            return this;
        }

        /**
         * <p>The list of platform user IDs within the specified scope. Pass an empty array to clear the list.</p>
         * 
         * <strong>example:</strong>
         * <p>[10001]</p>
         */
        public Builder shareUserIds(java.util.List<Long> shareUserIds) {
            String shareUserIdsShrink = shrink(shareUserIds, "shareUserIds", "json");
            this.putBodyParameter("shareUserIds", shareUserIdsShrink);
            this.shareUserIds = shareUserIds;
            return this;
        }

        /**
         * <p>The type of the current permission. Valid values:</p>
         * <ul>
         * <li>period: Period type.</li>
         * <li>objective: Objective type.</li>
         * <li>kr: Key result type.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>outputItem</p>
         */
        public Builder targetType(String targetType) {
            this.putBodyParameter("targetType", targetType);
            this.targetType = targetType;
            return this;
        }

        /**
         * <p>The tenant ID.</p>
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
        public UpdateShareRequest build() {
            return new UpdateShareRequest(this);
        } 

    } 

}
