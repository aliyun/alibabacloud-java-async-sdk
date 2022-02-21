// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

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
    private String userAccessKeyId;

    @Query
    @NameInMap("UserName")
    private String userName;

    private DeleteAccessKeyRequest(Builder builder) {
        super(builder);
        this.userAccessKeyId = builder.userAccessKeyId;
        this.userName = builder.userName;
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
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<DeleteAccessKeyRequest, Builder> {
        private String userAccessKeyId; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAccessKeyRequest response) {
            super(response);
            this.userAccessKeyId = response.userAccessKeyId;
            this.userName = response.userName;
        } 

        /**
         * UserAccessKeyId.
         */
        public Builder userAccessKeyId(String userAccessKeyId) {
            this.putQueryParameter("UserAccessKeyId", userAccessKeyId);
            this.userAccessKeyId = userAccessKeyId;
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
        public DeleteAccessKeyRequest build() {
            return new DeleteAccessKeyRequest(this);
        } 

    } 

}
