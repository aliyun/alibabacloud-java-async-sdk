// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAccessKeyRequest} extends {@link RequestModel}
 *
 * <p>UpdateAccessKeyRequest</p>
 */
public class UpdateAccessKeyRequest extends Request {
    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("UserAccessKeyId")
    private String userAccessKeyId;

    @Query
    @NameInMap("UserName")
    private String userName;

    private UpdateAccessKeyRequest(Builder builder) {
        super(builder);
        this.status = builder.status;
        this.userAccessKeyId = builder.userAccessKeyId;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAccessKeyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
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

    public static final class Builder extends Request.Builder<UpdateAccessKeyRequest, Builder> {
        private String status; 
        private String userAccessKeyId; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAccessKeyRequest response) {
            super(response);
            this.status = response.status;
            this.userAccessKeyId = response.userAccessKeyId;
            this.userName = response.userName;
        } 

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
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
        public UpdateAccessKeyRequest build() {
            return new UpdateAccessKeyRequest(this);
        } 

    } 

}
