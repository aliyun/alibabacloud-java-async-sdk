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
 * {@link ListAuthorizedAgentsRequest} extends {@link RequestModel}
 *
 * <p>ListAuthorizedAgentsRequest</p>
 */
public class ListAuthorizedAgentsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("permission")
    private String permission;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("targetUserId")
    private Long targetUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private ListAuthorizedAgentsRequest(Builder builder) {
        super(builder);
        this.permission = builder.permission;
        this.targetUserId = builder.targetUserId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAuthorizedAgentsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return permission
     */
    public String getPermission() {
        return this.permission;
    }

    /**
     * @return targetUserId
     */
    public Long getTargetUserId() {
        return this.targetUserId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<ListAuthorizedAgentsRequest, Builder> {
        private String permission; 
        private Long targetUserId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListAuthorizedAgentsRequest request) {
            super(request);
            this.permission = request.permission;
            this.targetUserId = request.targetUserId;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>The userId of the responsible user.</p>
         * 
         * <strong>example:</strong>
         * <p>USE</p>
         */
        public Builder permission(String permission) {
            this.putBodyParameter("permission", permission);
            this.permission = permission;
            return this;
        }

        /**
         * <p>The target user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder targetUserId(Long targetUserId) {
            this.putBodyParameter("targetUserId", targetUserId);
            this.targetUserId = targetUserId;
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
        public ListAuthorizedAgentsRequest build() {
            return new ListAuthorizedAgentsRequest(this);
        } 

    } 

}
