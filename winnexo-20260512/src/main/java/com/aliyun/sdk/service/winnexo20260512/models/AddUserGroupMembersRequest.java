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
 * {@link AddUserGroupMembersRequest} extends {@link RequestModel}
 *
 * <p>AddUserGroupMembersRequest</p>
 */
public class AddUserGroupMembersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Long> userIds;

    private AddUserGroupMembersRequest(Builder builder) {
        super(builder);
        this.tenantId = builder.tenantId;
        this.userGroupId = builder.userGroupId;
        this.userIds = builder.userIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddUserGroupMembersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return userGroupId
     */
    public String getUserGroupId() {
        return this.userGroupId;
    }

    /**
     * @return userIds
     */
    public java.util.List<Long> getUserIds() {
        return this.userIds;
    }

    public static final class Builder extends Request.Builder<AddUserGroupMembersRequest, Builder> {
        private String tenantId; 
        private String userGroupId; 
        private java.util.List<Long> userIds; 

        private Builder() {
            super();
        } 

        private Builder(AddUserGroupMembersRequest request) {
            super(request);
            this.tenantId = request.tenantId;
            this.userGroupId = request.userGroupId;
            this.userIds = request.userIds;
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
         * <p>目标用户组ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7ea8973f-7a5c-4e8a-956b-4fe0e7e2eb11</p>
         */
        public Builder userGroupId(String userGroupId) {
            this.putBodyParameter("userGroupId", userGroupId);
            this.userGroupId = userGroupId;
            return this;
        }

        /**
         * <p>待添加的平台用户ID列表，1至100个</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder userIds(java.util.List<Long> userIds) {
            String userIdsShrink = shrink(userIds, "userIds", "json");
            this.putBodyParameter("userIds", userIdsShrink);
            this.userIds = userIds;
            return this;
        }

        @Override
        public AddUserGroupMembersRequest build() {
            return new AddUserGroupMembersRequest(this);
        } 

    } 

}
