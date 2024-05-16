// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMigrationSummaryRequest} extends {@link RequestModel}
 *
 * <p>GetMigrationSummaryRequest</p>
 */
public class GetMigrationSummaryRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MigrationId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long migrationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 2)
    private Long projectId;

    private GetMigrationSummaryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.migrationId = builder.migrationId;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMigrationSummaryRequest create() {
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

    public static final class Builder extends Request.Builder<GetMigrationSummaryRequest, Builder> {
        private String regionId; 
        private Long migrationId; 
        private Long projectId; 

        private Builder() {
            super();
        } 

        private Builder(GetMigrationSummaryRequest request) {
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
         * The ID of the request. You can locate logs and troubleshoot issues based on the ID.
         */
        public Builder migrationId(Long migrationId) {
            this.putBodyParameter("MigrationId", migrationId);
            this.migrationId = migrationId;
            return this;
        }

        /**
         * The ID of the migration task.
         * <p>
         * 
         * You can call the [CreateImportMigration](~~2809123~~) operation to obtain the ID of the import task and call the [CreateExportMigration](~~3241603~~) operation to obtain the ID of the export task.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public GetMigrationSummaryRequest build() {
            return new GetMigrationSummaryRequest(this);
        } 

    } 

}
