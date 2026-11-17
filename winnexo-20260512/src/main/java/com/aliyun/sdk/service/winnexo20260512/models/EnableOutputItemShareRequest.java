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
 * {@link EnableOutputItemShareRequest} extends {@link RequestModel}
 *
 * <p>EnableOutputItemShareRequest</p>
 */
public class EnableOutputItemShareRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("outputItemId")
    private String outputItemId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("outputItemName")
    private String outputItemName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sessionId")
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

    private EnableOutputItemShareRequest(Builder builder) {
        super(builder);
        this.outputItemId = builder.outputItemId;
        this.outputItemName = builder.outputItemName;
        this.sessionId = builder.sessionId;
        this.shareAccessType = builder.shareAccessType;
        this.shareUserGroupIds = builder.shareUserGroupIds;
        this.shareUserIds = builder.shareUserIds;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableOutputItemShareRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<EnableOutputItemShareRequest, Builder> {
        private String outputItemId; 
        private String outputItemName; 
        private String sessionId; 
        private String shareAccessType; 
        private java.util.List<String> shareUserGroupIds; 
        private java.util.List<Long> shareUserIds; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(EnableOutputItemShareRequest request) {
            super(request);
            this.outputItemId = request.outputItemId;
            this.outputItemName = request.outputItemName;
            this.sessionId = request.sessionId;
            this.shareAccessType = request.shareAccessType;
            this.shareUserGroupIds = request.shareUserGroupIds;
            this.shareUserIds = request.shareUserIds;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>The ID of the output item.</p>
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
         * <p>The name of the output item. This parameter must be used together with sessionId. If multiple output items have the same name, the request is rejected and you are prompted to use outputItemId instead.</p>
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
         * <p>The session ID used for exact filtering. The length is 1 to 128 characters. This parameter applies to common sessions, skill sessions, and the executionId of task executions.</p>
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
         * <li>SPECIFIED: Accessible only to specified users or user groups.</li>
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
         * <p>The list of user group IDs within the specified scope.</p>
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
         * <p>The list of platform user IDs within the specified scope.</p>
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
         * <p>The tenant ID. This is a common parameter. If not specified, the default tenant of the caller is used.</p>
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
        public EnableOutputItemShareRequest build() {
            return new EnableOutputItemShareRequest(this);
        } 

    } 

}
