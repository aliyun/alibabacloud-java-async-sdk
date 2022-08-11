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

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private CreateExportMigrationRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.exportMode = builder.exportMode;
        this.exportObjectStatus = builder.exportObjectStatus;
        this.incrementalSince = builder.incrementalSince;
        this.name = builder.name;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateExportMigrationRequest, Builder> {
        private String description; 
        private String exportMode; 
        private String exportObjectStatus; 
        private Long incrementalSince; 
        private String name; 
        private Long projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateExportMigrationRequest request) {
            super(request);
            this.description = request.description;
            this.exportMode = request.exportMode;
            this.exportObjectStatus = request.exportObjectStatus;
            this.incrementalSince = request.incrementalSince;
            this.name = request.name;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * ExportMode.
         */
        public Builder exportMode(String exportMode) {
            this.putBodyParameter("ExportMode", exportMode);
            this.exportMode = exportMode;
            return this;
        }

        /**
         * ExportObjectStatus.
         */
        public Builder exportObjectStatus(String exportObjectStatus) {
            this.putBodyParameter("ExportObjectStatus", exportObjectStatus);
            this.exportObjectStatus = exportObjectStatus;
            return this;
        }

        /**
         * IncrementalSince.
         */
        public Builder incrementalSince(Long incrementalSince) {
            this.putBodyParameter("IncrementalSince", incrementalSince);
            this.incrementalSince = incrementalSince;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
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
        public CreateExportMigrationRequest build() {
            return new CreateExportMigrationRequest(this);
        } 

    } 

}
