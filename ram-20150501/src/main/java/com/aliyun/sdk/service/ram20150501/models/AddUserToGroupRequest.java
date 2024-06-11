// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddUserToGroupRequest} extends {@link RequestModel}
 *
 * <p>AddUserToGroupRequest</p>
 */
public class AddUserToGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    private AddUserToGroupRequest(Builder builder) {
        super(builder);
        this.groupName = builder.groupName;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddUserToGroupRequest create() {
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
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<AddUserToGroupRequest, Builder> {
        private String groupName; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(AddUserToGroupRequest request) {
            super(request);
            this.groupName = request.groupName;
            this.userName = request.userName;
        } 

        /**
         * The name of the RAM user group.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * The name of the RAM user.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public AddUserToGroupRequest build() {
            return new AddUserToGroupRequest(this);
        } 

    } 

}
