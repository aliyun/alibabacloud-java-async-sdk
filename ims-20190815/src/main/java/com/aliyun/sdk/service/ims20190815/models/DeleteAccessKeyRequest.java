// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAccessKeyRequest} extends {@link RequestModel}
 *
 * <p>DeleteAccessKeyRequest</p>
 */
public class DeleteAccessKeyRequest extends Request {
    @Query
    @NameInMap("UserAccessKeyId")
    @Validation(required = true)
    private String userAccessKeyId;

    @Query
    @NameInMap("UserPrincipalName")
    private String userPrincipalName;

    private DeleteAccessKeyRequest(Builder builder) {
        super(builder);
        this.userAccessKeyId = builder.userAccessKeyId;
        this.userPrincipalName = builder.userPrincipalName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAccessKeyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return userAccessKeyId
     */
    public String getUserAccessKeyId() {
        return this.userAccessKeyId;
    }

    /**
     * @return userPrincipalName
     */
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

    public static final class Builder extends Request.Builder<DeleteAccessKeyRequest, Builder> {
        private String userAccessKeyId; 
        private String userPrincipalName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAccessKeyRequest request) {
            super(request);
            this.userAccessKeyId = request.userAccessKeyId;
            this.userPrincipalName = request.userPrincipalName;
        } 

        /**
         * The ID of the AccessKey pair that you want to delete.
         */
        public Builder userAccessKeyId(String userAccessKeyId) {
            this.putQueryParameter("UserAccessKeyId", userAccessKeyId);
            this.userAccessKeyId = userAccessKeyId;
            return this;
        }

        /**
         * The logon name of the RAM user.
         * <p>
         * 
         * If this parameter is empty, the AccessKey pair of the current user is deleted.
         */
        public Builder userPrincipalName(String userPrincipalName) {
            this.putQueryParameter("UserPrincipalName", userPrincipalName);
            this.userPrincipalName = userPrincipalName;
            return this;
        }

        @Override
        public DeleteAccessKeyRequest build() {
            return new DeleteAccessKeyRequest(this);
        } 

    } 

}
