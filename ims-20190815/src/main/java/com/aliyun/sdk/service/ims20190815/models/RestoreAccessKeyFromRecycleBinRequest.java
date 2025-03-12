// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
 * {@link RestoreAccessKeyFromRecycleBinRequest} extends {@link RequestModel}
 *
 * <p>RestoreAccessKeyFromRecycleBinRequest</p>
 */
public class RestoreAccessKeyFromRecycleBinRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserAccessKeyId")
    private String userAccessKeyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private RestoreAccessKeyFromRecycleBinRequest(Builder builder) {
        super(builder);
        this.userAccessKeyId = builder.userAccessKeyId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestoreAccessKeyFromRecycleBinRequest create() {
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
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<RestoreAccessKeyFromRecycleBinRequest, Builder> {
        private String userAccessKeyId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(RestoreAccessKeyFromRecycleBinRequest request) {
            super(request);
            this.userAccessKeyId = request.userAccessKeyId;
            this.userId = request.userId;
        } 

        /**
         * <p>The AccessKey ID of the RAM user.</p>
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
         * <p>The ID of the Resource Access Management (RAM) user.</p>
         * 
         * <strong>example:</strong>
         * <p>20732900249392****</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public RestoreAccessKeyFromRecycleBinRequest build() {
            return new RestoreAccessKeyFromRecycleBinRequest(this);
        } 

    } 

}
