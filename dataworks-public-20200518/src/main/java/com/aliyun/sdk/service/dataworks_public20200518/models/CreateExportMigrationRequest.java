// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateExportMigrationRequest} extends {@link RequestModel}
 *
 * <p>CreateExportMigrationRequest</p>
 */
public class CreateExportMigrationRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("ExportMode")
    @Validation(required = true)
    private String exportMode;

    @Body
    @NameInMap("ExportObjectStatus")
    private String exportObjectStatus;

    @Body
    @NameInMap("IncrementalSince")
    private Long incrementalSince;

    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true)
    private Long projectId;

    private CreateExportMigrationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.exportMode = builder.exportMode;
        this.exportObjectStatus = builder.exportObjectStatus;
        this.incrementalSince = builder.incrementalSince;
        this.name = builder.name;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateExportMigrationRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return exportMode
     */
    public String getExportMode() {
        return this.exportMode;
    }

    /**
     * @return exportObjectStatus
     */
    public String getExportObjectStatus() {
        return this.exportObjectStatus;
    }

    /**
     * @return incrementalSince
     */
    public Long getIncrementalSince() {
        return this.incrementalSince;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<CreateExportMigrationRequest, Builder> {
        private String regionId; 
        private String description; 
        private String exportMode; 
        private String exportObjectStatus; 
        private Long incrementalSince; 
        private String name; 
        private Long projectId; 

        private Builder() {
            super();
        } 

        private Builder(CreateExportMigrationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
            this.exportMode = request.exportMode;
            this.exportObjectStatus = request.exportObjectStatus;
            this.incrementalSince = request.incrementalSince;
            this.name = request.name;
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
         * The description of the export task.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The export mode of the export task. Valid values:
         * <p>
         * 
         * *   FULL: The export task is used to export all data objects.
         * *   INCREMENTAL: The export task is used to export data objects that were modified since the specified point in time. If you set this parameter to INCREMENTAL, you must configure the IncrementalSince parameter.
         */
        public Builder exportMode(String exportMode) {
            this.putBodyParameter("ExportMode", exportMode);
            this.exportMode = exportMode;
            return this;
        }

        /**
         * The status of the data objects that you want to export in the export task. The system exports data objects in the state that is specified by this parameter. Valid values:
         * <p>
         * 
         * *   SAVED: Data objects that are in the SAVED state are exported.
         * *   SUBMITTED: Data objects that are in the SUBMITTED state are exported.
         * *   DEPLOYED: Data objects that are in the DEPLOYED state are exported.
         */
        public Builder exportObjectStatus(String exportObjectStatus) {
            this.putBodyParameter("ExportObjectStatus", exportObjectStatus);
            this.exportObjectStatus = exportObjectStatus;
            return this;
        }

        /**
         * The start time of the incremental export task.
         * <p>
         * 
         * The IncrementalSince parameter takes effect only when the ExportMode parameter is set to INCREMENTAL.
         */
        public Builder incrementalSince(Long incrementalSince) {
            this.putBodyParameter("IncrementalSince", incrementalSince);
            this.incrementalSince = incrementalSince;
            return this;
        }

        /**
         * The name of the export task.
         * <p>
         * 
         * The name of each export task must be unique. You must ensure that no duplicate export task exists in the current workspace.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The ID of the workspace. You can log on to the [DataWorks console](https://workbench.data.aliyun.com/console) and go to the Workspace Management page to obtain the workspace ID.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public CreateExportMigrationRequest build() {
            return new CreateExportMigrationRequest(this);
        } 

    } 

}
