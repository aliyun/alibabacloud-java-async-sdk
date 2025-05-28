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
 * {@link CancelAuthorizationMenuRequest} extends {@link RequestModel}
 *
 * <p>CancelAuthorizationMenuRequest</p>
 */
public class CancelAuthorizationMenuRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataPortalId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataPortalId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MenuIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String menuIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserGroupIds")
    private String userGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserIds")
    private String userIds;

    private CancelAuthorizationMenuRequest(Builder builder) {
        super(builder);
        this.dataPortalId = builder.dataPortalId;
        this.menuIds = builder.menuIds;
        this.userGroupIds = builder.userGroupIds;
        this.userIds = builder.userIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelAuthorizationMenuRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataPortalId
     */
    public String getDataPortalId() {
        return this.dataPortalId;
    }

    /**
     * @return menuIds
     */
    public String getMenuIds() {
        return this.menuIds;
    }

    /**
     * @return userGroupIds
     */
    public String getUserGroupIds() {
        return this.userGroupIds;
    }

    /**
     * @return userIds
     */
    public String getUserIds() {
        return this.userIds;
    }

    public static final class Builder extends Request.Builder<CancelAuthorizationMenuRequest, Builder> {
        private String dataPortalId; 
        private String menuIds; 
        private String userGroupIds; 
        private String userIds; 

        private Builder() {
            super();
        } 

        private Builder(CancelAuthorizationMenuRequest request) {
            super(request);
            this.dataPortalId = request.dataPortalId;
            this.menuIds = request.menuIds;
            this.userGroupIds = request.userGroupIds;
            this.userIds = request.userIds;
        } 

        /**
         * <p>The ID of the data portal.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0d173abb53e84c8ca7495429163b****</p>
         */
        public Builder dataPortalId(String dataPortalId) {
            this.putQueryParameter("DataPortalId", dataPortalId);
            this.dataPortalId = dataPortalId;
            return this;
        }

        /**
         * <p>The leaf node menu IDs of the data portal.</p>
         * <ul>
         * <li>Supports batch parameters, with IDs separated by commas (,). The maximum number for batch modification is 100.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>54kqgoa****,pg1n135****</p>
         */
        public Builder menuIds(String menuIds) {
            this.putQueryParameter("MenuIds", menuIds);
            this.menuIds = menuIds;
            return this;
        }

        /**
         * <p>List of user group IDs.</p>
         * <ul>
         * <li>Supports batch parameters, with IDs separated by commas (,). The maximum number for batch modification is 200.</li>
         * <li>UserGroupIds and UserIds cannot both be empty.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>34fd141d-4598-4093-8c33-8e066dcb****,3d2c23d4-2b41-4af8-a1f5-f6390f32****</p>
         */
        public Builder userGroupIds(String userGroupIds) {
            this.putQueryParameter("UserGroupIds", userGroupIds);
            this.userGroupIds = userGroupIds;
            return this;
        }

        /**
         * <p>List of user IDs. These are Quick BI UserIDs, not Alibaba Cloud UIDs.</p>
         * <ul>
         * <li>Supports batch parameters, with IDs separated by commas (,). The maximum number for batch modification is 200.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>204627493484****,121344444790****</p>
         */
        public Builder userIds(String userIds) {
            this.putQueryParameter("UserIds", userIds);
            this.userIds = userIds;
            return this;
        }

        @Override
        public CancelAuthorizationMenuRequest build() {
            return new CancelAuthorizationMenuRequest(this);
        } 

    } 

}
