// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartMigrationRequest} extends {@link RequestModel}
 *
 * <p>StartMigrationRequest</p>
 */
public class StartMigrationRequest extends Request {
    @Body
    @NameInMap("MigrationId")
    @Validation(required = true, minimum = 2)
    private Long migrationId;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true, minimum = 2)
    private Long projectId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private StartMigrationRequest(Builder builder) {
        super(builder);
        this.migrationId = builder.migrationId;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartMigrationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return migrationId
     */
    public Long getMigrationId() {
        return this.migrationId;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<StartMigrationRequest, Builder> {
        private Long migrationId; 
        private Long projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(StartMigrationRequest request) {
            super(request);
            this.migrationId = request.migrationId;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
        } 

        /**
         * MigrationId.
         */
        public Builder migrationId(Long migrationId) {
            this.putBodyParameter("MigrationId", migrationId);
            this.migrationId = migrationId;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public StartMigrationRequest build() {
            return new StartMigrationRequest(this);
        } 

    } 

}
