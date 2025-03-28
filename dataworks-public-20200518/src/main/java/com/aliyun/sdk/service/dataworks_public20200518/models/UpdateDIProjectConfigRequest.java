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
 * {@link UpdateDIProjectConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateDIProjectConfigRequest</p>
 */
public class UpdateDIProjectConfigRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String destinationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 10000000000D, minimum = 1)
    private Long projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
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
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The type of the destinations of the synchronization solutions. This parameter cannot be left empty. Valid values: analyticdb_for_mysql, odps, elasticsearch, holo, mysql, and polardb.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>odps</p>
         */
        public Builder destinationType(String destinationType) {
            this.putQueryParameter("DestinationType", destinationType);
            this.destinationType = destinationType;
            return this;
        }

        /**
         * <p>The new default global configuration of the synchronization solutions. The value indicates the processing rules of different types of DDL messages. The value must be in the JSON format. Example: {&quot;RENAMECOLUMN&quot;:&quot;WARNING&quot;,&quot;DROPTABLE&quot;:&quot;WARNING&quot;,&quot;CREATETABLE&quot;:&quot;WARNING&quot;,&quot;MODIFYCOLUMN&quot;:&quot;WARNING&quot;,&quot;TRUNCATETABLE&quot;:&quot;WARNING&quot;,&quot;DROPCOLUMN&quot;:&quot;WARNING&quot;,&quot;ADDCOLUMN&quot;:&quot;WARNING&quot;,&quot;RENAMETABLE&quot;:&quot;WARNING&quot;}.</p>
         * <p>Field description:</p>
         * <ul>
         * <li>RENAMECOLUMN: renames a column.</li>
         * <li>DROPTABLE: deletes a table.</li>
         * <li>CREATETABLE: creates a table.</li>
         * <li>MODIFYCOLUMN: changes the data type of a column.</li>
         * <li>TRUNCATETABLE: clears a table.</li>
         * <li>DROPCOLUMN: deletes a column.</li>
         * <li>ADDCOLUMN: creates a column.</li>
         * <li>RENAMETABLE: renames a table.</li>
         * </ul>
         * <p>DataWorks processes a DDL message of a specific type based on the following rules:</p>
         * <ul>
         * <li>WARNING: ignores the message and records an alert in real-time synchronization logs. The alert contains information about the situation that the message is ignored because of an execution error.</li>
         * <li>IGNORE: discards the message and does not send it to the destination.</li>
         * <li>CRITICAL: terminates the real-time synchronization task and sets the node status to Failed.</li>
         * <li>NORMAL: sends the message to the destination to process the message. Each destination processes DDL messages based on its own business logic. If DataWorks adopts the NORMAL policy, DataWorks only forwards DDL messages.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;RENAMECOLUMN&quot;:&quot;WARNING&quot;,&quot;DROPTABLE&quot;:&quot;WARNING&quot;,&quot;CREATETABLE&quot;:&quot;WARNING&quot;,&quot;MODIFYCOLUMN&quot;:&quot;WARNING&quot;,&quot;TRUNCATETABLE&quot;:&quot;WARNING&quot;,&quot;DROPCOLUMN&quot;:&quot;WARNING&quot;,&quot;ADDCOLUMN&quot;:&quot;WARNING&quot;,&quot;RENAMETABLE&quot;:&quot;WARNING&quot;}</p>
         */
        public Builder projectConfig(String projectConfig) {
            this.putQueryParameter("ProjectConfig", projectConfig);
            this.projectConfig = projectConfig;
            return this;
        }

        /**
         * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to obtain the workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The type of the sources of the synchronization solutions. Valid values: oracle, mysql, polardb, datahub, drds, and analyticdb_for_mysql. If you do not configure this parameter, DataWorks applies the default global configuration to all sources.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql</p>
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
