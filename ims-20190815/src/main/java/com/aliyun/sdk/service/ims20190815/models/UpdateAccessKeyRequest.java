// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
    @Validation(required = true)
    private String status;

    @Query
    @NameInMap("UserAccessKeyId")
    @Validation(required = true)
    private String userAccessKeyId;

    @Query
    @NameInMap("UserPrincipalName")
    private String userPrincipalName;

    private UpdateAccessKeyRequest(Builder builder) {
        super(builder);
        this.status = builder.status;
        this.userAccessKeyId = builder.userAccessKeyId;
        this.userPrincipalName = builder.userPrincipalName;
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
     * @return userPrincipalName
     */
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

    public static final class Builder extends Request.Builder<UpdateAccessKeyRequest, Builder> {
        private String status; 
        private String userAccessKeyId; 
        private String userPrincipalName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAccessKeyRequest request) {
            super(request);
            this.status = request.status;
            this.userAccessKeyId = request.userAccessKeyId;
            this.userPrincipalName = request.userPrincipalName;
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
         * UserPrincipalName.
         */
        public Builder userPrincipalName(String userPrincipalName) {
            this.putQueryParameter("UserPrincipalName", userPrincipalName);
            this.userPrincipalName = userPrincipalName;
            return this;
        }

        @Override
        public UpdateAccessKeyRequest build() {
            return new UpdateAccessKeyRequest(this);
        } 

    } 

}
