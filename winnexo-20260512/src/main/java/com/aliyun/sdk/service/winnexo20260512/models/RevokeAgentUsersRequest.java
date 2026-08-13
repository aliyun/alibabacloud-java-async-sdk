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
 * {@link RevokeAgentUsersRequest} extends {@link RequestModel}
 *
 * <p>RevokeAgentUsersRequest</p>
 */
public class RevokeAgentUsersRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operatingObjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operatingObjectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userGroupIds")
    private java.util.List<String> userGroupIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userIds")
    private java.util.List<String> userIds;

    private RevokeAgentUsersRequest(Builder builder) {
        super(builder);
        this.operatingObjectName = builder.operatingObjectName;
        this.tenantId = builder.tenantId;
        this.userGroupIds = builder.userGroupIds;
        this.userIds = builder.userIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokeAgentUsersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return operatingObjectName
     */
    public String getOperatingObjectName() {
        return this.operatingObjectName;
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

    public static final class Builder extends Request.Builder<RevokeAgentUsersRequest, Builder> {
        private String operatingObjectName; 
        private String tenantId; 
        private java.util.List<String> userGroupIds; 
        private java.util.List<String> userIds; 

        private Builder() {
            super();
        } 

        private Builder(RevokeAgentUsersRequest request) {
            super(request);
            this.operatingObjectName = request.operatingObjectName;
            this.tenantId = request.tenantId;
            this.userGroupIds = request.userGroupIds;
            this.userIds = request.userIds;
        } 

        /**
         * <p>数字员工名称</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder operatingObjectName(String operatingObjectName) {
            this.putBodyParameter("operatingObjectName", operatingObjectName);
            this.operatingObjectName = operatingObjectName;
            return this;
        }

        /**
         * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
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
         * <p>被撤销的用户组 ID 列表（16位 hex 字符串）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder userGroupIds(java.util.List<String> userGroupIds) {
            String userGroupIdsShrink = shrink(userGroupIds, "userGroupIds", "json");
            this.putBodyParameter("userGroupIds", userGroupIdsShrink);
            this.userGroupIds = userGroupIds;
            return this;
        }

        /**
         * <p>被撤销的用户 ID 列表</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder userIds(java.util.List<String> userIds) {
            String userIdsShrink = shrink(userIds, "userIds", "json");
            this.putBodyParameter("userIds", userIdsShrink);
            this.userIds = userIds;
            return this;
        }

        @Override
        public RevokeAgentUsersRequest build() {
            return new RevokeAgentUsersRequest(this);
        } 

    } 

}
