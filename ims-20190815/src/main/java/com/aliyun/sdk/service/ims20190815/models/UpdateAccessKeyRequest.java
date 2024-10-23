// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateAccessKeyRequest} extends {@link RequestModel}
 *
 * <p>UpdateAccessKeyRequest</p>
 */
public class UpdateAccessKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserAccessKeyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userAccessKeyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserPrincipalName")
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
         * <p>The status of the AccessKey pair. Valid values:</p>
         * <ul>
         * <li>Active</li>
         * <li>Inactive</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The AccessKey ID of the AccessKey pair for which you want to modify the status.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LTAI4GFTgcR8m8cZQDTH****</p>
         */
        public Builder userAccessKeyId(String userAccessKeyId) {
            this.putQueryParameter("UserAccessKeyId", userAccessKeyId);
            this.userAccessKeyId = userAccessKeyId;
            return this;
        }

        /**
         * <p>The logon name of the RAM user.</p>
         * <p>If this parameter is empty, the status of the AccessKey pair for the current user is modified.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:test@example.onaliyun.com">test@example.onaliyun.com</a></p>
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
