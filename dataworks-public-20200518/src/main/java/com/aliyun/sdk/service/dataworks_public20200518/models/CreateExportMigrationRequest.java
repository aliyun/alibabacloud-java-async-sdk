// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateExportMigrationRequest} extends {@link RequestModel}
 *
 * <p>CreateExportMigrationRequest</p>
 */
public class CreateExportMigrationRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExportMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String exportMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExportObjectStatus")
    private String exportObjectStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IncrementalSince")
    private Long incrementalSince;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The description of the export task.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The export mode of the export task. Valid values:</p>
         * <ul>
         * <li>FULL: The export task is used to export all data objects.</li>
         * <li>INCREMENTAL: The export task is used to export data objects that were modified since the specified point in time. If you set this parameter to INCREMENTAL, you must configure the IncrementalSince parameter.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FULL</p>
         */
        public Builder exportMode(String exportMode) {
            this.putBodyParameter("ExportMode", exportMode);
            this.exportMode = exportMode;
            return this;
        }

        /**
         * <p>The status of the data objects that you want to export in the export task. The system exports data objects in the state that is specified by this parameter. Valid values:</p>
         * <ul>
         * <li>SAVED</li>
         * <li>SUBMITTED</li>
         * <li>DEPLOYED</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SAVED</p>
         */
        public Builder exportObjectStatus(String exportObjectStatus) {
            this.putBodyParameter("ExportObjectStatus", exportObjectStatus);
            this.exportObjectStatus = exportObjectStatus;
            return this;
        }

        /**
         * <p>The start time of the incremental export task.</p>
         * <p>The IncrementalSince parameter takes effect only when the ExportMode parameter is set to INCREMENTAL.</p>
         * 
         * <strong>example:</strong>
         * <p>1589904000000</p>
         */
        public Builder incrementalSince(Long incrementalSince) {
            this.putBodyParameter("IncrementalSince", incrementalSince);
            this.incrementalSince = incrementalSince;
            return this;
        }

        /**
         * <p>The name of the export task.</p>
         * <p>The name of each export task must be unique. You must ensure that no duplicate export task exists in the current workspace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_export_01</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to obtain the workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
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
