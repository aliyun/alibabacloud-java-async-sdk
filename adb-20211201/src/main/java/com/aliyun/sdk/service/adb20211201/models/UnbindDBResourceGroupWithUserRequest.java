// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link UnbindDBResourceGroupWithUserRequest} extends {@link RequestModel}
 *
 * <p>UnbindDBResourceGroupWithUserRequest</p>
 */
public class UnbindDBResourceGroupWithUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupUser")
    private String groupUser;

    private UnbindDBResourceGroupWithUserRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.groupName = builder.groupName;
        this.groupUser = builder.groupUser;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindDBResourceGroupWithUserRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return groupUser
     */
    public String getGroupUser() {
        return this.groupUser;
    }

    public static final class Builder extends Request.Builder<UnbindDBResourceGroupWithUserRequest, Builder> {
        private String DBClusterId; 
        private String groupName; 
        private String groupUser; 

        private Builder() {
            super();
        } 

        private Builder(UnbindDBResourceGroupWithUserRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.groupName = request.groupName;
            this.groupUser = request.groupUser;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>am-bp1ub9grke1****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The name of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>The name of the database account.</p>
         * 
         * <strong>example:</strong>
         * <p>user1</p>
         */
        public Builder groupUser(String groupUser) {
            this.putQueryParameter("GroupUser", groupUser);
            this.groupUser = groupUser;
            return this;
        }

        @Override
        public UnbindDBResourceGroupWithUserRequest build() {
            return new UnbindDBResourceGroupWithUserRequest(this);
        } 

    } 

}
