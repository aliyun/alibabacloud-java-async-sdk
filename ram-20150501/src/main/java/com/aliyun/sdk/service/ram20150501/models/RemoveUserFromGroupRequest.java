// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveUserFromGroupRequest} extends {@link RequestModel}
 *
 * <p>RemoveUserFromGroupRequest</p>
 */
public class RemoveUserFromGroupRequest extends Request {
    @Query
    @NameInMap("GroupName")
    private String groupName;

    @Query
    @NameInMap("UserName")
    private String userName;

    private RemoveUserFromGroupRequest(Builder builder) {
        super(builder);
        this.groupName = builder.groupName;
        this.userName = builder.userName;
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
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<RemoveUserFromGroupRequest, Builder> {
        private String groupName; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(RemoveUserFromGroupRequest response) {
            super(response);
            this.groupName = response.groupName;
            this.userName = response.userName;
        } 

        /**
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public RemoveUserFromGroupRequest build() {
            return new RemoveUserFromGroupRequest(this);
        } 

    } 

}
