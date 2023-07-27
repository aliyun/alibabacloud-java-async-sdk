// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBResourceGroupRequest} extends {@link RequestModel}
 *
 * <p>DescribeDBResourceGroupRequest</p>
 */
public class DescribeDBResourceGroupRequest extends Request {
    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("GroupName")
    private String groupName;

    @Query
    @NameInMap("GroupType")
    private String groupType;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    private DescribeDBResourceGroupRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.groupName = builder.groupName;
        this.groupType = builder.groupType;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBResourceGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return groupType
     */
    public String getGroupType() {
        return this.groupType;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public static final class Builder extends Request.Builder<DescribeDBResourceGroupRequest, Builder> {
        private String DBClusterId; 
        private String groupName; 
        private String groupType; 
        private String resourceOwnerAccount; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDBResourceGroupRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.groupName = request.groupName;
            this.groupType = request.groupType;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
        } 

        /**
         * The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The name of the resource group.
         * <p>
         * 
         * > If you do not specify this parameter, the information about all resource groups in the cluster is returned.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * The type of the resource group. Valid values:
         * <p>
         * 
         * *   **Interactive**
         * *   **Job**
         * 
         * > For information about resource groups of Data Lakehouse Edition, see [Resource groups](~~428610~~).
         */
        public Builder groupType(String groupType) {
            this.putQueryParameter("GroupType", groupType);
            this.groupType = groupType;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        @Override
        public DescribeDBResourceGroupRequest build() {
            return new DescribeDBResourceGroupRequest(this);
        } 

    } 

}
