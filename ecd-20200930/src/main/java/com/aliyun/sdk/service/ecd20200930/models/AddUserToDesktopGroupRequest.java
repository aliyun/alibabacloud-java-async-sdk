// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link AddUserToDesktopGroupRequest} extends {@link RequestModel}
 *
 * <p>AddUserToDesktopGroupRequest</p>
 */
public class AddUserToDesktopGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopGroupId")
    private String desktopGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopGroupIds")
    private java.util.List<String> desktopGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserIds")
    private java.util.List<String> endUserIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrgId")
    private String orgId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SimpleUserGroupId")
    private String simpleUserGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserGroupName")
    private String userGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserOuPath")
    private String userOuPath;

    private AddUserToDesktopGroupRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.desktopGroupId = builder.desktopGroupId;
        this.desktopGroupIds = builder.desktopGroupIds;
        this.endUserIds = builder.endUserIds;
        this.orgId = builder.orgId;
        this.regionId = builder.regionId;
        this.simpleUserGroupId = builder.simpleUserGroupId;
        this.userGroupName = builder.userGroupName;
        this.userOuPath = builder.userOuPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddUserToDesktopGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return desktopGroupId
     */
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    /**
     * @return desktopGroupIds
     */
    public java.util.List<String> getDesktopGroupIds() {
        return this.desktopGroupIds;
    }

    /**
     * @return endUserIds
     */
    public java.util.List<String> getEndUserIds() {
        return this.endUserIds;
    }

    /**
     * @return orgId
     */
    public String getOrgId() {
        return this.orgId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return simpleUserGroupId
     */
    public String getSimpleUserGroupId() {
        return this.simpleUserGroupId;
    }

    /**
     * @return userGroupName
     */
    public String getUserGroupName() {
        return this.userGroupName;
    }

    /**
     * @return userOuPath
     */
    public String getUserOuPath() {
        return this.userOuPath;
    }

    public static final class Builder extends Request.Builder<AddUserToDesktopGroupRequest, Builder> {
        private String clientToken; 
        private String desktopGroupId; 
        private java.util.List<String> desktopGroupIds; 
        private java.util.List<String> endUserIds; 
        private String orgId; 
        private String regionId; 
        private String simpleUserGroupId; 
        private String userGroupName; 
        private String userOuPath; 

        private Builder() {
            super();
        } 

        private Builder(AddUserToDesktopGroupRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.desktopGroupId = request.desktopGroupId;
            this.desktopGroupIds = request.desktopGroupIds;
            this.endUserIds = request.endUserIds;
            this.orgId = request.orgId;
            this.regionId = request.regionId;
            this.simpleUserGroupId = request.simpleUserGroupId;
            this.userGroupName = request.userGroupName;
            this.userOuPath = request.userOuPath;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The ID of the shared cloud computer to which you want to add authorized users.</p>
         * 
         * <strong>example:</strong>
         * <p>dg-2i8qxpv6t1a03****</p>
         */
        public Builder desktopGroupId(String desktopGroupId) {
            this.putQueryParameter("DesktopGroupId", desktopGroupId);
            this.desktopGroupId = desktopGroupId;
            return this;
        }

        /**
         * <p>The list of shared cloud computer IDs.</p>
         */
        public Builder desktopGroupIds(java.util.List<String> desktopGroupIds) {
            this.putQueryParameter("DesktopGroupIds", desktopGroupIds);
            this.desktopGroupIds = desktopGroupIds;
            return this;
        }

        /**
         * <p>The list of users to authorize.</p>
         */
        public Builder endUserIds(java.util.List<String> endUserIds) {
            this.putQueryParameter("EndUserIds", endUserIds);
            this.endUserIds = endUserIds;
            return this;
        }

        /**
         * <p>The organization ID of the team.</p>
         * 
         * <strong>example:</strong>
         * <p>org-aliyun-wy-org-id</p>
         */
        public Builder orgId(String orgId) {
            this.putQueryParameter("OrgId", orgId);
            this.orgId = orgId;
            return this;
        }

        /**
         * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to query the regions supported by Elastic Desktop Service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The convenience user group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ug-3f6c8a2b****</p>
         */
        public Builder simpleUserGroupId(String simpleUserGroupId) {
            this.putQueryParameter("SimpleUserGroupId", simpleUserGroupId);
            this.simpleUserGroupId = simpleUserGroupId;
            return this;
        }

        /**
         * <p>The user group name.</p>
         * 
         * <strong>example:</strong>
         * <p>R&amp;D Group</p>
         */
        public Builder userGroupName(String userGroupName) {
            this.putQueryParameter("UserGroupName", userGroupName);
            this.userGroupName = userGroupName;
            return this;
        }

        /**
         * <p>The organizational unit (OU) path of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder userOuPath(String userOuPath) {
            this.putQueryParameter("UserOuPath", userOuPath);
            this.userOuPath = userOuPath;
            return this;
        }

        @Override
        public AddUserToDesktopGroupRequest build() {
            return new AddUserToDesktopGroupRequest(this);
        } 

    } 

}
