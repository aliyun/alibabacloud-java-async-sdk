// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AuthorizeMenuRequest} extends {@link RequestModel}
 *
 * <p>AuthorizeMenuRequest</p>
 */
public class AuthorizeMenuRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthPointsValue")
    private Integer authPointsValue;

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

    private AuthorizeMenuRequest(Builder builder) {
        super(builder);
        this.authPointsValue = builder.authPointsValue;
        this.dataPortalId = builder.dataPortalId;
        this.menuIds = builder.menuIds;
        this.userGroupIds = builder.userGroupIds;
        this.userIds = builder.userIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthorizeMenuRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authPointsValue
     */
    public Integer getAuthPointsValue() {
        return this.authPointsValue;
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

    public static final class Builder extends Request.Builder<AuthorizeMenuRequest, Builder> {
        private Integer authPointsValue; 
        private String dataPortalId; 
        private String menuIds; 
        private String userGroupIds; 
        private String userIds; 

        private Builder() {
            super();
        } 

        private Builder(AuthorizeMenuRequest request) {
            super(request);
            this.authPointsValue = request.authPointsValue;
            this.dataPortalId = request.dataPortalId;
            this.menuIds = request.menuIds;
            this.userGroupIds = request.userGroupIds;
            this.userIds = request.userIds;
        } 

        /**
         * <p>Authorizes the permissions of the menu. Valid values:</p>
         * <ul>
         * <li>1: view</li>
         * <li>3: View + Export (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder authPointsValue(Integer authPointsValue) {
            this.putQueryParameter("AuthPointsValue", authPointsValue);
            this.authPointsValue = authPointsValue;
            return this;
        }

        /**
         * <p>The ID of the BI portal.</p>
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
         * <p>The menu ID of the BI portal leaf node.</p>
         * <ul>
         * <li>The directory menu cannot be authorized.</li>
         * <li>You can upload multiple parameters at a time. Separate multiple IDs with commas (,). The maximum number of parameters that can be modified at a time is 100.</li>
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
         * <p>The IDs of the user groups.</p>
         * <ul>
         * <li>You can upload multiple parameters at a time. Separate multiple IDs with commas (,). The maximum number of parameters that can be modified at a time is 200.</li>
         * <li>UserGroupIds and UserIds cannot be empty at the same time</li>
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
         * <p>The IDs of the end users. The UserID of the Quick BI is used instead of the UID of Alibaba Cloud.</p>
         * <ul>
         * <li>You can upload multiple parameters at a time. Separate multiple IDs with commas (,). The maximum number of parameters that can be modified at a time is 200.</li>
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
        public AuthorizeMenuRequest build() {
            return new AuthorizeMenuRequest(this);
        } 

    } 

}
