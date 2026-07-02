// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link TransferUsergroupRequest} extends {@link RequestModel}
 *
 * <p>TransferUsergroupRequest</p>
 */
public class TransferUsergroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentUserGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String parentUserGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userGroupId;

    private TransferUsergroupRequest(Builder builder) {
        super(builder);
        this.parentUserGroupId = builder.parentUserGroupId;
        this.userGroupId = builder.userGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransferUsergroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return parentUserGroupId
     */
    public String getParentUserGroupId() {
        return this.parentUserGroupId;
    }

    /**
     * @return userGroupId
     */
    public String getUserGroupId() {
        return this.userGroupId;
    }

    public static final class Builder extends Request.Builder<TransferUsergroupRequest, Builder> {
        private String parentUserGroupId; 
        private String userGroupId; 

        private Builder() {
            super();
        } 

        private Builder(TransferUsergroupRequest request) {
            super(request);
            this.parentUserGroupId = request.parentUserGroupId;
            this.userGroupId = request.userGroupId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>asdasva***123124asdasd</p>
         */
        public Builder parentUserGroupId(String parentUserGroupId) {
            this.putQueryParameter("ParentUserGroupId", parentUserGroupId);
            this.parentUserGroupId = parentUserGroupId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12qwda****sdada</p>
         */
        public Builder userGroupId(String userGroupId) {
            this.putQueryParameter("UserGroupId", userGroupId);
            this.userGroupId = userGroupId;
            return this;
        }

        @Override
        public TransferUsergroupRequest build() {
            return new TransferUsergroupRequest(this);
        } 

    } 

}
