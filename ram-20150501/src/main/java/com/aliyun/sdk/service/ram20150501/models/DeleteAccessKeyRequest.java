// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

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
 * {@link DeleteAccessKeyRequest} extends {@link RequestModel}
 *
 * <p>DeleteAccessKeyRequest</p>
 */
public class DeleteAccessKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserAccessKeyId")
    private String userAccessKeyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
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

        private Builder(DeleteAccessKeyRequest request) {
            super(request);
            this.userAccessKeyId = request.userAccessKeyId;
            this.userName = request.userName;
        } 

        /**
         * <p>The AccessKey ID in the AccessKey pair that you want to delete.</p>
         * 
         * <strong>example:</strong>
         * <p>0wNEpMMlzy7s****</p>
         */
        public Builder userAccessKeyId(String userAccessKeyId) {
            this.putQueryParameter("UserAccessKeyId", userAccessKeyId);
            this.userAccessKeyId = userAccessKeyId;
            return this;
        }

        /**
         * <p>The name of the RAM user.</p>
         * 
         * <strong>example:</strong>
         * <p>zhangq****</p>
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
