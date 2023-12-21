// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindDBResourceGroupWithUserRequest} extends {@link RequestModel}
 *
 * <p>BindDBResourceGroupWithUserRequest</p>
 */
public class BindDBResourceGroupWithUserRequest extends Request {
    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("GroupName")
    @Validation(required = true)
    private String groupName;

    @Query
    @NameInMap("GroupUser")
    @Validation(required = true)
    private String groupUser;

    private BindDBResourceGroupWithUserRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.groupName = builder.groupName;
        this.groupUser = builder.groupUser;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindDBResourceGroupWithUserRequest create() {
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

    public static final class Builder extends Request.Builder<BindDBResourceGroupWithUserRequest, Builder> {
        private String DBClusterId; 
        private String groupName; 
        private String groupUser; 

        private Builder() {
            super();
        } 

        private Builder(BindDBResourceGroupWithUserRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.groupName = request.groupName;
            this.groupUser = request.groupUser;
        } 

        /**
         * The cluster ID.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The name of the resource group.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * The name of the database account. It can be a standard account or a privileged account.
         */
        public Builder groupUser(String groupUser) {
            this.putQueryParameter("GroupUser", groupUser);
            this.groupUser = groupUser;
            return this;
        }

        @Override
        public BindDBResourceGroupWithUserRequest build() {
            return new BindDBResourceGroupWithUserRequest(this);
        } 

    } 

}
