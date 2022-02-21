// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBackupPlanRequest} extends {@link RequestModel}
 *
 * <p>CreateBackupPlanRequest</p>
 */
public class CreateBackupPlanRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RootPath")
    private String rootPath;

    private CreateBackupPlanRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.description = builder.description;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.rootPath = builder.rootPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBackupPlanRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return rootPath
     */
    public String getRootPath() {
        return this.rootPath;
    }

    public static final class Builder extends Request.Builder<CreateBackupPlanRequest, Builder> {
        private String clusterId; 
        private String description; 
        private String name; 
        private String regionId; 
        private Long resourceOwnerId; 
        private String rootPath; 

        private Builder() {
            super();
        } 

        private Builder(CreateBackupPlanRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.description = response.description;
            this.name = response.name;
            this.regionId = response.regionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.rootPath = response.rootPath;
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
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * RootPath.
         */
        public Builder rootPath(String rootPath) {
            this.putQueryParameter("RootPath", rootPath);
            this.rootPath = rootPath;
            return this;
        }

        @Override
        public CreateBackupPlanRequest build() {
            return new CreateBackupPlanRequest(this);
        } 

    } 

}
