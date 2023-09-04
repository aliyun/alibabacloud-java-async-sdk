// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteServiceGroupUserRequest} extends {@link RequestModel}
 *
 * <p>DeleteServiceGroupUserRequest</p>
 */
public class DeleteServiceGroupUserRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("newUserId")
    private Long newUserId;

    @Body
    @NameInMap("oldUserId")
    private Long oldUserId;

    @Body
    @NameInMap("removeUser")
    private Boolean removeUser;

    @Body
    @NameInMap("serviceGroupId")
    private Long serviceGroupId;

    private DeleteServiceGroupUserRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.newUserId = builder.newUserId;
        this.oldUserId = builder.oldUserId;
        this.removeUser = builder.removeUser;
        this.serviceGroupId = builder.serviceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteServiceGroupUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return newUserId
     */
    public Long getNewUserId() {
        return this.newUserId;
    }

    /**
     * @return oldUserId
     */
    public Long getOldUserId() {
        return this.oldUserId;
    }

    /**
     * @return removeUser
     */
    public Boolean getRemoveUser() {
        return this.removeUser;
    }

    /**
     * @return serviceGroupId
     */
    public Long getServiceGroupId() {
        return this.serviceGroupId;
    }

    public static final class Builder extends Request.Builder<DeleteServiceGroupUserRequest, Builder> {
        private String clientToken; 
        private Long newUserId; 
        private Long oldUserId; 
        private Boolean removeUser; 
        private Long serviceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteServiceGroupUserRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.newUserId = request.newUserId;
            this.oldUserId = request.oldUserId;
            this.removeUser = request.removeUser;
            this.serviceGroupId = request.serviceGroupId;
        } 

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * newUserId.
         */
        public Builder newUserId(Long newUserId) {
            this.putBodyParameter("newUserId", newUserId);
            this.newUserId = newUserId;
            return this;
        }

        /**
         * oldUserId.
         */
        public Builder oldUserId(Long oldUserId) {
            this.putBodyParameter("oldUserId", oldUserId);
            this.oldUserId = oldUserId;
            return this;
        }

        /**
         * removeUser.
         */
        public Builder removeUser(Boolean removeUser) {
            this.putBodyParameter("removeUser", removeUser);
            this.removeUser = removeUser;
            return this;
        }

        /**
         * serviceGroupId.
         */
        public Builder serviceGroupId(Long serviceGroupId) {
            this.putBodyParameter("serviceGroupId", serviceGroupId);
            this.serviceGroupId = serviceGroupId;
            return this;
        }

        @Override
        public DeleteServiceGroupUserRequest build() {
            return new DeleteServiceGroupUserRequest(this);
        } 

    } 

}
