// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AuthorizeMenuRequest} extends {@link RequestModel}
 *
 * <p>AuthorizeMenuRequest</p>
 */
public class AuthorizeMenuRequest extends Request {
    @Query
    @NameInMap("AuthPointsValue")
    private Integer authPointsValue;

    @Query
    @NameInMap("DataPortalId")
    @Validation(required = true)
    private String dataPortalId;

    @Query
    @NameInMap("MenuIds")
    @Validation(required = true)
    private String menuIds;

    @Query
    @NameInMap("UserGroupIds")
    private String userGroupIds;

    @Query
    @NameInMap("UserIds")
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
         * Authorizes the permissions of the menu. Valid values:
         * <p>
         * 
         * *   1: view
         * *   3: View + Export (default)
         */
        public Builder authPointsValue(Integer authPointsValue) {
            this.putQueryParameter("AuthPointsValue", authPointsValue);
            this.authPointsValue = authPointsValue;
            return this;
        }

        /**
         * The ID of the BI portal.
         */
        public Builder dataPortalId(String dataPortalId) {
            this.putQueryParameter("DataPortalId", dataPortalId);
            this.dataPortalId = dataPortalId;
            return this;
        }

        /**
         * The menu ID of the BI portal leaf node.
         * <p>
         * 
         * *   The directory menu cannot be authorized.
         * *   You can upload multiple parameters at a time. Separate multiple IDs with commas (,). The maximum number of parameters that can be modified at a time is 100.
         */
        public Builder menuIds(String menuIds) {
            this.putQueryParameter("MenuIds", menuIds);
            this.menuIds = menuIds;
            return this;
        }

        /**
         * The IDs of the user groups.
         * <p>
         * 
         * *   You can upload multiple parameters at a time. Separate multiple IDs with commas (,). The maximum number of parameters that can be modified at a time is 200.
         * *   UserGroupIds and UserIds cannot be empty at the same time
         */
        public Builder userGroupIds(String userGroupIds) {
            this.putQueryParameter("UserGroupIds", userGroupIds);
            this.userGroupIds = userGroupIds;
            return this;
        }

        /**
         * The IDs of the end users. The UserID of the Quick BI is used instead of the UID of Alibaba Cloud.
         * <p>
         * 
         * *   You can upload multiple parameters at a time. Separate multiple IDs with commas (,). The maximum number of parameters that can be modified at a time is 200.
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
