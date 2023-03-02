// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDIProjectConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateDIProjectConfigRequest</p>
 */
public class UpdateDIProjectConfigRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("DestinationType")
    @Validation(required = true)
    private String destinationType;

    @Query
    @NameInMap("ProjectConfig")
    @Validation(required = true)
    private String projectConfig;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true, maximum = 10000000000D, minimum = 1)
    private Long projectId;

    @Query
    @NameInMap("SourceType")
    private String sourceType;

    private UpdateDIProjectConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.destinationType = builder.destinationType;
        this.projectConfig = builder.projectConfig;
        this.projectId = builder.projectId;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDIProjectConfigRequest create() {
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
     * @return destinationType
     */
    public String getDestinationType() {
        return this.destinationType;
    }

    /**
     * @return projectConfig
     */
    public String getProjectConfig() {
        return this.projectConfig;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    public static final class Builder extends Request.Builder<UpdateDIProjectConfigRequest, Builder> {
        private String regionId; 
        private String destinationType; 
        private String projectConfig; 
        private Long projectId; 
        private String sourceType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDIProjectConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.destinationType = request.destinationType;
            this.projectConfig = request.projectConfig;
            this.projectId = request.projectId;
            this.sourceType = request.sourceType;
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
         * The type of the destinations of the synchronization solutions. This parameter cannot be left empty.
         * <p>
         * 
         * Valid values: analyticdb_for_mysql, odps, elasticsearch, holo, mysql, and polardb.
         */
        public Builder destinationType(String destinationType) {
            this.putQueryParameter("DestinationType", destinationType);
            this.destinationType = destinationType;
            return this;
        }

        /**
         * The new default global configuration of synchronization solutions. The value indicates the processing rules of different types of DDL messages. The value must be in the JSON format. Example:
         * <p>
         * 
         * {"RENAMECOLUMN":"WARNING","DROPTABLE":"WARNING","CREATETABLE":"WARNING","MODIFYCOLUMN":"WARNING","TRUNCATETABLE":"WARNING","DROPCOLUMN":"WARNING","ADDCOLUMN":"WARNING","RENAMETABLE":"WARNING"}
         * 
         * Field description:
         * 
         * *   RENAMECOLUMN: renames a column.
         * *   DROPTABLE: deletes a table.
         * *   CREATETABLE: creates a table.
         * *   MODIFYCOLUMN: changes the data type of a column.
         * *   TRUNCATETABLE: clears a table.
         * *   DROPCOLUMN: deletes a column.
         * *   ADDCOLUMN: creates a column.
         * *   RENAMETABLE: renames a table.
         * 
         * DataWorks processes a DDL message of a specific type based on the following rules:
         * 
         * *   WARNING: ignores the message and records an alert in real-time synchronization logs. The alert contains information about the situation that the message is ignored because of an execution error.
         * *   IGNORE: discards the message and does not send it to the destination.
         * *   CRITICAL: terminates the real-time synchronization node and sets the node status to Failed.
         * *   NORMAL: sends the message to the destination to process the message. Each destination processes DDL messages based on its own business logic. If DataWorks adopts the NORMAL policy, DataWorks only forwards DDL messages.
         */
        public Builder projectConfig(String projectConfig) {
            this.putQueryParameter("ProjectConfig", projectConfig);
            this.projectConfig = projectConfig;
            return this;
        }

        /**
         * The ID of the DataWorks workspace. You can log on to the [DataWorks console](https://workbench.data.aliyun.com/console) and go to the Workspace Management page to obtain the workspace ID.
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The type of the sources of the synchronization solutions.
         * <p>
         * 
         * Valid values: oracle, mysql, polardb, datahub, drds, and analyticdb_for_mysql.
         * 
         * If you do not configure this parameter, DataWorks applies the default global configuration to all sources.
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        @Override
        public UpdateDIProjectConfigRequest build() {
            return new UpdateDIProjectConfigRequest(this);
        } 

    } 

}
