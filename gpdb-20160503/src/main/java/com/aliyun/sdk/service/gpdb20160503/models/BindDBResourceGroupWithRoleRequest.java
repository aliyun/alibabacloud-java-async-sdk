// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindDBResourceGroupWithRoleRequest} extends {@link RequestModel}
 *
 * <p>BindDBResourceGroupWithRoleRequest</p>
 */
public class BindDBResourceGroupWithRoleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > roleList;

    private BindDBResourceGroupWithRoleRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.ownerId = builder.ownerId;
        this.resourceGroupName = builder.resourceGroupName;
        this.roleList = builder.roleList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindDBResourceGroupWithRoleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceGroupName
     */
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * @return roleList
     */
    public java.util.List < String > getRoleList() {
        return this.roleList;
    }

    public static final class Builder extends Request.Builder<BindDBResourceGroupWithRoleRequest, Builder> {
        private String DBInstanceId; 
        private Long ownerId; 
        private String resourceGroupName; 
        private java.util.List < String > roleList; 

        private Builder() {
            super();
        } 

        private Builder(BindDBResourceGroupWithRoleRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.ownerId = request.ownerId;
            this.resourceGroupName = request.resourceGroupName;
            this.roleList = request.roleList;
        } 

        /**
         * The instance ID.
         * <p>
         * 
         * >  You can call the [DescribeDBInstances](~~86911~~) operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The name of the resource group.
         */
        public Builder resourceGroupName(String resourceGroupName) {
            this.putQueryParameter("ResourceGroupName", resourceGroupName);
            this.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * The roles.
         */
        public Builder roleList(java.util.List < String > roleList) {
            String roleListShrink = shrink(roleList, "RoleList", "simple");
            this.putQueryParameter("RoleList", roleListShrink);
            this.roleList = roleList;
            return this;
        }

        @Override
        public BindDBResourceGroupWithRoleRequest build() {
            return new BindDBResourceGroupWithRoleRequest(this);
        } 

    } 

}
