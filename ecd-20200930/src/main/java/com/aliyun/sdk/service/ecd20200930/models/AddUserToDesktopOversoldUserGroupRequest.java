// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddUserToDesktopOversoldUserGroupRequest} extends {@link RequestModel}
 *
 * <p>AddUserToDesktopOversoldUserGroupRequest</p>
 */
public class AddUserToDesktopOversoldUserGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddUserAmount")
    private Integer addUserAmount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private String endUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OversoldGroupId")
    private String oversoldGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserGroupId")
    private String userGroupId;

    private AddUserToDesktopOversoldUserGroupRequest(Builder builder) {
        super(builder);
        this.addUserAmount = builder.addUserAmount;
        this.endUserId = builder.endUserId;
        this.oversoldGroupId = builder.oversoldGroupId;
        this.userGroupId = builder.userGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddUserToDesktopOversoldUserGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addUserAmount
     */
    public Integer getAddUserAmount() {
        return this.addUserAmount;
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return oversoldGroupId
     */
    public String getOversoldGroupId() {
        return this.oversoldGroupId;
    }

    /**
     * @return userGroupId
     */
    public String getUserGroupId() {
        return this.userGroupId;
    }

    public static final class Builder extends Request.Builder<AddUserToDesktopOversoldUserGroupRequest, Builder> {
        private Integer addUserAmount; 
        private String endUserId; 
        private String oversoldGroupId; 
        private String userGroupId; 

        private Builder() {
            super();
        } 

        private Builder(AddUserToDesktopOversoldUserGroupRequest request) {
            super(request);
            this.addUserAmount = request.addUserAmount;
            this.endUserId = request.endUserId;
            this.oversoldGroupId = request.oversoldGroupId;
            this.userGroupId = request.userGroupId;
        } 

        /**
         * AddUserAmount.
         */
        public Builder addUserAmount(Integer addUserAmount) {
            this.putQueryParameter("AddUserAmount", addUserAmount);
            this.addUserAmount = addUserAmount;
            return this;
        }

        /**
         * EndUserId.
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * OversoldGroupId.
         */
        public Builder oversoldGroupId(String oversoldGroupId) {
            this.putQueryParameter("OversoldGroupId", oversoldGroupId);
            this.oversoldGroupId = oversoldGroupId;
            return this;
        }

        /**
         * UserGroupId.
         */
        public Builder userGroupId(String userGroupId) {
            this.putQueryParameter("UserGroupId", userGroupId);
            this.userGroupId = userGroupId;
            return this;
        }

        @Override
        public AddUserToDesktopOversoldUserGroupRequest build() {
            return new AddUserToDesktopOversoldUserGroupRequest(this);
        } 

    } 

}
