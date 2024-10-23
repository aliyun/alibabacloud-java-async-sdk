// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RemoveUserFromGroupRequest} extends {@link RequestModel}
 *
 * <p>RemoveUserFromGroupRequest</p>
 */
public class RemoveUserFromGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserPrincipalName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userPrincipalName;

    private RemoveUserFromGroupRequest(Builder builder) {
        super(builder);
        this.groupName = builder.groupName;
        this.userPrincipalName = builder.userPrincipalName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveUserFromGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return userPrincipalName
     */
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

    public static final class Builder extends Request.Builder<RemoveUserFromGroupRequest, Builder> {
        private String groupName; 
        private String userPrincipalName; 

        private Builder() {
            super();
        } 

        private Builder(RemoveUserFromGroupRequest request) {
            super(request);
            this.groupName = request.groupName;
            this.userPrincipalName = request.userPrincipalName;
        } 

        /**
         * <p>The name of the RAM user group.</p>
         * 
         * <strong>example:</strong>
         * <p>Test-Team</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>The logon name of the RAM user.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:alice@example.onaliyun.com">alice@example.onaliyun.com</a></p>
         */
        public Builder userPrincipalName(String userPrincipalName) {
            this.putQueryParameter("UserPrincipalName", userPrincipalName);
            this.userPrincipalName = userPrincipalName;
            return this;
        }

        @Override
        public RemoveUserFromGroupRequest build() {
            return new RemoveUserFromGroupRequest(this);
        } 

    } 

}
