// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDBResourceGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateDBResourceGroupRequest</p>
 */
public class CreateDBResourceGroupRequest extends Request {
    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("GroupName")
    @Validation(required = true)
    private String groupName;

    @Query
    @NameInMap("GroupType")
    @Validation(required = true)
    private String groupType;

    @Query
    @NameInMap("MaxComputeResource")
    private String maxComputeResource;

    @Query
    @NameInMap("MinComputeResource")
    @Validation(required = true)
    private String minComputeResource;

    private CreateDBResourceGroupRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.groupName = builder.groupName;
        this.groupType = builder.groupType;
        this.maxComputeResource = builder.maxComputeResource;
        this.minComputeResource = builder.minComputeResource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDBResourceGroupRequest create() {
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
     * @return maxComputeResource
     */
    public String getMaxComputeResource() {
        return this.maxComputeResource;
    }

    /**
     * @return minComputeResource
     */
    public String getMinComputeResource() {
        return this.minComputeResource;
    }

    public static final class Builder extends Request.Builder<CreateDBResourceGroupRequest, Builder> {
        private String DBClusterId; 
        private String groupName; 
        private String groupType; 
        private String maxComputeResource; 
        private String minComputeResource; 

        private Builder() {
            super();
        } 

        private Builder(CreateDBResourceGroupRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.groupName = request.groupName;
            this.groupType = request.groupType;
            this.maxComputeResource = request.maxComputeResource;
            this.minComputeResource = request.minComputeResource;
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
         * *   The name can be up to 255 characters in length.
         * *   The name must start with a letter or a digit.
         * *   The name can contain letters, digits, hyphens (\_), and underscores (\_).
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
         * The maximum reserved computing resources. Unit: ACU.
         * <p>
         * 
         * *   If GroupType is set to Interactive, the maximum amount of reserved computing resources refers to the amount of resources that are not allocated in the cluster. Set this parameter to a value in increments of 16 ACUs.
         * *   If GroupType is set to Job, the maximum amount of reserved computing resources refers to the amount of resources that are not allocated in the cluster. Set this parameter to a value in increments of 8 ACUs.
         */
        public Builder maxComputeResource(String maxComputeResource) {
            this.putQueryParameter("MaxComputeResource", maxComputeResource);
            this.maxComputeResource = maxComputeResource;
            return this;
        }

        /**
         * The minimum reserved computing resources. Unit: AnalyticDB Compute Unit (ACU).
         * <p>
         * 
         * *   If GroupType is set to Interactive, set the value to 16ACU.
         * *   If GroupType is set to Job, set the value to 0ACU.
         */
        public Builder minComputeResource(String minComputeResource) {
            this.putQueryParameter("MinComputeResource", minComputeResource);
            this.minComputeResource = minComputeResource;
            return this;
        }

        @Override
        public CreateDBResourceGroupRequest build() {
            return new CreateDBResourceGroupRequest(this);
        } 

    } 

}
