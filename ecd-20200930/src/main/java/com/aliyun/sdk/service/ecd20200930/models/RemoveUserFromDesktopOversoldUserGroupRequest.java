// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveUserFromDesktopOversoldUserGroupRequest} extends {@link RequestModel}
 *
 * <p>RemoveUserFromDesktopOversoldUserGroupRequest</p>
 */
public class RemoveUserFromDesktopOversoldUserGroupRequest extends Request {
    @Query
    @NameInMap("EndUserId")
    private String endUserId;

    @Query
    @NameInMap("OversoldGroupId")
    private String oversoldGroupId;

    @Query
    @NameInMap("UserDesktopId")
    private String userDesktopId;

    @Query
    @NameInMap("UserGroupId")
    private String userGroupId;

    private RemoveUserFromDesktopOversoldUserGroupRequest(Builder builder) {
        super(builder);
        this.endUserId = builder.endUserId;
        this.oversoldGroupId = builder.oversoldGroupId;
        this.userDesktopId = builder.userDesktopId;
        this.userGroupId = builder.userGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveUserFromDesktopOversoldUserGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return userDesktopId
     */
    public String getUserDesktopId() {
        return this.userDesktopId;
    }

    /**
     * @return userGroupId
     */
    public String getUserGroupId() {
        return this.userGroupId;
    }

    public static final class Builder extends Request.Builder<RemoveUserFromDesktopOversoldUserGroupRequest, Builder> {
        private String endUserId; 
        private String oversoldGroupId; 
        private String userDesktopId; 
        private String userGroupId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveUserFromDesktopOversoldUserGroupRequest request) {
            super(request);
            this.endUserId = request.endUserId;
            this.oversoldGroupId = request.oversoldGroupId;
            this.userDesktopId = request.userDesktopId;
            this.userGroupId = request.userGroupId;
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
         * UserDesktopId.
         */
        public Builder userDesktopId(String userDesktopId) {
            this.putQueryParameter("UserDesktopId", userDesktopId);
            this.userDesktopId = userDesktopId;
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
        public RemoveUserFromDesktopOversoldUserGroupRequest build() {
            return new RemoveUserFromDesktopOversoldUserGroupRequest(this);
        } 

    } 

}
