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
 * {@link UpdateAccessKeyRequest} extends {@link RequestModel}
 *
 * <p>UpdateAccessKeyRequest</p>
 */
public class UpdateAccessKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserAccessKeyId")
    private String userAccessKeyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
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

        private Builder(UpdateAccessKeyRequest request) {
            super(request);
            this.status = request.status;
            this.userAccessKeyId = request.userAccessKeyId;
            this.userName = request.userName;
        } 

        /**
         * <p>The status of the AccessKey pair. Valid values: <code>Active</code> and <code>Inactive</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Inactive</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The AccessKey ID in the AccessKey pair whose status you want to change.</p>
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
        public UpdateAccessKeyRequest build() {
            return new UpdateAccessKeyRequest(this);
        } 

    } 

}
