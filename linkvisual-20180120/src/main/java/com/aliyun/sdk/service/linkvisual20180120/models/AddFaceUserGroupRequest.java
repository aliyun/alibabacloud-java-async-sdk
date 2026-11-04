// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

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
 * {@link AddFaceUserGroupRequest} extends {@link RequestModel}
 *
 * <p>AddFaceUserGroupRequest</p>
 */
public class AddFaceUserGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsolationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String isolationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserGroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userGroupName;

    private AddFaceUserGroupRequest(Builder builder) {
        super(builder);
        this.isolationId = builder.isolationId;
        this.userGroupName = builder.userGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddFaceUserGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isolationId
     */
    public String getIsolationId() {
        return this.isolationId;
    }

    /**
     * @return userGroupName
     */
    public String getUserGroupName() {
        return this.userGroupName;
    }

    public static final class Builder extends Request.Builder<AddFaceUserGroupRequest, Builder> {
        private String isolationId; 
        private String userGroupName; 

        private Builder() {
            super();
        } 

        private Builder(AddFaceUserGroupRequest request) {
            super(request);
            this.isolationId = request.isolationId;
            this.userGroupName = request.userGroupName;
        } 

        /**
         * <p>The business isolation ID. It is used to isolate data between different business applications under the same Alibaba Cloud account. It supports uppercase and lowercase English letters and digits.</p>
         * <p>For example, if you have facial recognition businesses in Region A and Region B, you can set different business isolation IDs to distinguish the facial recognition businesses in Region A and Region B.</p>
         * <blockquote>
         * <p>Notice: 
         * Save the business isolation ID properly for use when you call other API operations in this business isolation zone.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ZheJiangHZ</p>
         */
        public Builder isolationId(String isolationId) {
            this.putQueryParameter("IsolationId", isolationId);
            this.isolationId = isolationId;
            return this;
        }

        /**
         * <p>The name of the user group. Specify a custom value. The value can be up to 128 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TestUserGroup</p>
         */
        public Builder userGroupName(String userGroupName) {
            this.putQueryParameter("UserGroupName", userGroupName);
            this.userGroupName = userGroupName;
            return this;
        }

        @Override
        public AddFaceUserGroupRequest build() {
            return new AddFaceUserGroupRequest(this);
        } 

    } 

}
