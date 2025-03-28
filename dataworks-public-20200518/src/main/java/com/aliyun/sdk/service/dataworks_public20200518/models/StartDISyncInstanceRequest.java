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
 * {@link StartDISyncInstanceRequest} extends {@link RequestModel}
 *
 * <p>StartDISyncInstanceRequest</p>
 */
public class StartDISyncInstanceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long fileId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 10000000000D, minimum = 1)
    private Long projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartParam")
    private String startParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskType;

    private StartDISyncInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.fileId = builder.fileId;
        this.projectId = builder.projectId;
        this.startParam = builder.startParam;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartDISyncInstanceRequest create() {
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
     * @return fileId
     */
    public Long getFileId() {
        return this.fileId;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return startParam
     */
    public String getStartParam() {
        return this.startParam;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<StartDISyncInstanceRequest, Builder> {
        private String regionId; 
        private Long fileId; 
        private Long projectId; 
        private String startParam; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(StartDISyncInstanceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.fileId = request.fileId;
            this.projectId = request.projectId;
            this.startParam = request.startParam;
            this.taskType = request.taskType;
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
         * <ul>
         * <li>If you set TaskType to DI_REALTIME, set this parameter to the ID of the real-time synchronization task that you want to start.</li>
         * <li>If you set TaskType to DI_SOLUTION, set this parameter to the ID of the data synchronization solution that you want to start.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder fileId(Long fileId) {
            this.putQueryParameter("FileId", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to obtain the workspace ID. You must configure this parameter to specify the DataWorks workspace to which the API operation is applied.</p>
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
         * <ul>
         * <li>If you set TaskType to DI_REALTIME, the StartParam parameter specifies the startup parameters for the real-time synchronization task. The startup parameters include failover-related parameters, the parameter that specifies the number of dirty data records allowed, and the parameters in the data definition language (DDL) statements.</li>
         * <li>If you set TaskType to DI_SOLUTION, the StartParam parameter does not take effect.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;failoverLimit&quot;:{&quot;count&quot;:10,&quot;interval&quot;:30},&quot;errorLimit&quot;:{&quot;record&quot;:0},&quot;ddlMarkMap&quot;:{&quot;RENAMECOLUMN&quot;:&quot;WARNING&quot;,&quot;DROPTABLE&quot;:&quot;WARNING&quot;,&quot;CREATETABLE&quot;:&quot;IGNORE&quot;,&quot;MODIFYCOLUMN&quot;:&quot;WARNING&quot;,&quot;TRUNCATETABLE&quot;:&quot;NORMAL&quot;,&quot;DROPCOLUMN&quot;:&quot;IGNORE&quot;,&quot;ADDCOLUMN&quot;:&quot;NORMAL&quot;,&quot;RENAMETABLE&quot;:&quot;CRITICAL&quot;}}</p>
         */
        public Builder startParam(String startParam) {
            this.putQueryParameter("StartParam", startParam);
            this.startParam = startParam;
            return this;
        }

        /**
         * <p>The type of the object that you want to start. Valid values:</p>
         * <ul>
         * <li>DI_REALTIME: real-time synchronization task</li>
         * <li>DI_SOLUTION: data synchronization solution</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DI_REALTIME</p>
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public StartDISyncInstanceRequest build() {
            return new StartDISyncInstanceRequest(this);
        } 

    } 

}
