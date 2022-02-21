// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMetaTablePreviewTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateMetaTablePreviewTaskRequest</p>
 */
public class CreateMetaTablePreviewTaskRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("DatabaseId")
    @Validation(required = true)
    private String databaseId;

    @Query
    @NameInMap("Password")
    private String password;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("TableId")
    @Validation(required = true)
    private String tableId;

    @Query
    @NameInMap("User")
    private String user;

    private CreateMetaTablePreviewTaskRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.databaseId = builder.databaseId;
        this.password = builder.password;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tableId = builder.tableId;
        this.user = builder.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMetaTablePreviewTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return databaseId
     */
    public String getDatabaseId() {
        return this.databaseId;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return tableId
     */
    public String getTableId() {
        return this.tableId;
    }

    /**
     * @return user
     */
    public String getUser() {
        return this.user;
    }

    public static final class Builder extends Request.Builder<CreateMetaTablePreviewTaskRequest, Builder> {
        private String clusterId; 
        private String databaseId; 
        private String password; 
        private String regionId; 
        private String resourceGroupId; 
        private Long resourceOwnerId; 
        private String tableId; 
        private String user; 

        private Builder() {
            super();
        } 

        private Builder(CreateMetaTablePreviewTaskRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.databaseId = response.databaseId;
            this.password = response.password;
            this.regionId = response.regionId;
            this.resourceGroupId = response.resourceGroupId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.tableId = response.tableId;
            this.user = response.user;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * DatabaseId.
         */
        public Builder databaseId(String databaseId) {
            this.putQueryParameter("DatabaseId", databaseId);
            this.databaseId = databaseId;
            return this;
        }

        /**
         * Password.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * TableId.
         */
        public Builder tableId(String tableId) {
            this.putQueryParameter("TableId", tableId);
            this.tableId = tableId;
            return this;
        }

        /**
         * User.
         */
        public Builder user(String user) {
            this.putQueryParameter("User", user);
            this.user = user;
            return this;
        }

        @Override
        public CreateMetaTablePreviewTaskRequest build() {
            return new CreateMetaTablePreviewTaskRequest(this);
        } 

    } 

}
