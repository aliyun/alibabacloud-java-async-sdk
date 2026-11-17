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
 * {@link EnableConversationShareRequest} extends {@link RequestModel}
 *
 * <p>EnableConversationShareRequest</p>
 */
public class EnableConversationShareRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sessionId")
    @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
    private String sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("shareAccessType")
    private String shareAccessType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("shareUserGroupIds")
    private java.util.List<String> shareUserGroupIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("shareUserIds")
    private java.util.List<Long> shareUserIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private EnableConversationShareRequest(Builder builder) {
        super(builder);
        this.sessionId = builder.sessionId;
        this.shareAccessType = builder.shareAccessType;
        this.shareUserGroupIds = builder.shareUserGroupIds;
        this.shareUserIds = builder.shareUserIds;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableConversationShareRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<EnableConversationShareRequest, Builder> {
        private String sessionId; 
        private String shareAccessType; 
        private java.util.List<String> shareUserGroupIds; 
        private java.util.List<Long> shareUserIds; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(EnableConversationShareRequest request) {
            super(request);
            this.sessionId = request.sessionId;
            this.shareAccessType = request.shareAccessType;
            this.shareUserGroupIds = request.shareUserGroupIds;
            this.shareUserIds = request.shareUserIds;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>The unique identifier of the function session.</p>
         * <p>This parameter is required.</p>
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
         * <li>PUBLIC: accessible to all users</li>
         * <li>SPECIFIED: accessible to specified users or user groups</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        public Builder shareAccessType(String shareAccessType) {
            this.putBodyParameter("shareAccessType", shareAccessType);
            this.shareAccessType = shareAccessType;
            return this;
        }

        /**
         * <p>The list of user group IDs for the specified scope. When shareAccessType is set to SPECIFIED, at least one of this list or the user list must not be empty.</p>
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
         * <p>The list of platform user IDs for the specified scope. When shareAccessType is set to SPECIFIED, at least one of this list or the user group list must not be empty.</p>
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
        public EnableConversationShareRequest build() {
            return new EnableConversationShareRequest(this);
        } 

    } 

}
