// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMigrationProcessRequest} extends {@link RequestModel}
 *
 * <p>GetMigrationProcessRequest</p>
 */
public class GetMigrationProcessRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("MigrationId")
    @Validation(required = true, minimum = 1)
    private Long migrationId;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true, minimum = 2)
    private Long projectId;

    private GetMigrationProcessRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.migrationId = builder.migrationId;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMigrationProcessRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<GetMigrationProcessRequest, Builder> {
        private String regionId; 
        private Long migrationId; 
        private Long projectId; 

        private Builder() {
            super();
        } 

        private Builder(GetMigrationProcessRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.migrationId = request.migrationId;
            this.projectId = request.projectId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
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

        @Override
        public GetMigrationProcessRequest build() {
            return new GetMigrationProcessRequest(this);
        } 

    } 

}
