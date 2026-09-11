// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link GetUserGroupRequest} extends {@link RequestModel}
 *
 * <p>GetUserGroupRequest</p>
 */
public class GetUserGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userGroupId;

    private GetUserGroupRequest(Builder builder) {
        super(builder);
        this.tenantId = builder.tenantId;
        this.userGroupId = builder.userGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return userGroupId
     */
    public String getUserGroupId() {
        return this.userGroupId;
    }

    public static final class Builder extends Request.Builder<GetUserGroupRequest, Builder> {
        private String tenantId; 
        private String userGroupId; 

        private Builder() {
            super();
        } 

        private Builder(GetUserGroupRequest request) {
            super(request);
            this.tenantId = request.tenantId;
            this.userGroupId = request.userGroupId;
        } 

        /**
         * <p>The tenant ID. This is a common parameter. In winnexo-cli, pass this parameter explicitly by using <code>--tenant-id</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>The ID of the target user group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7ea8973f-7a5c-4e8a-956b-4fe0e7e2eb11</p>
         */
        public Builder userGroupId(String userGroupId) {
            this.putBodyParameter("userGroupId", userGroupId);
            this.userGroupId = userGroupId;
            return this;
        }

        @Override
        public GetUserGroupRequest build() {
            return new GetUserGroupRequest(this);
        } 

    } 

}
