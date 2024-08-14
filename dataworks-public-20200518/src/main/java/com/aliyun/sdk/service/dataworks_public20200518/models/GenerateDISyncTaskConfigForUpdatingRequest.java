// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateDISyncTaskConfigForUpdatingRequest} extends {@link RequestModel}
 *
 * <p>GenerateDISyncTaskConfigForUpdatingRequest</p>
 */
public class GenerateDISyncTaskConfigForUpdatingRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 10000000000D, minimum = 1)
    private Long projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskParam")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskType;

    private GenerateDISyncTaskConfigForUpdatingRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.projectId = builder.projectId;
        this.taskId = builder.taskId;
        this.taskParam = builder.taskParam;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateDISyncTaskConfigForUpdatingRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskParam
     */
    public String getTaskParam() {
        return this.taskParam;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<GenerateDISyncTaskConfigForUpdatingRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private Long projectId; 
        private Long taskId; 
        private String taskParam; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(GenerateDISyncTaskConfigForUpdatingRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
            this.projectId = request.projectId;
            this.taskId = request.taskId;
            this.taskParam = request.taskParam;
            this.taskType = request.taskType;
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
         * The client token that is used to ensure the idempotence of the request. This parameter is used to prevent repeated operations that are caused by multiple calls.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The DataWorks workspace ID. You can log on to the [DataWorks console](https://workbench.data.aliyun.com/console) and go to the Workspace page to obtain the workspace ID.
         * <p>
         * 
         * You must configure this parameter to specify the DataWorks workspace to which the API operation is applied.
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The task ID.
         * <p>
         * 
         * *   If you set the TaskType parameter to DI_REALTIME, set the TaskId parameter to the value of the FileId parameter for the real-time synchronization task.
         * *   If you set the TaskType parameter to DI_SOLUTION, set the TaskId parameter to the value of the FileId parameter for the synchronization solution.
         */
        public Builder taskId(Long taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * The script for updating the real-time synchronization task in Data Integration. DataWorks allows you to add or remove tables for a real-time synchronization task in Data Integration only in asynchronous mode. The following types of real-time synchronization tasks are supported:
         * <p>
         * 
         * *   Synchronization task that is used to synchronize data from MySQL to MaxCompute
         * *   Synchronization task that is used to synchronize data from MySQL data to Kafka
         * *   Synchronization task that is used to synchronize data from MySQL to Hologres
         * 
         * The SelectedTables parameter is used to specify tables that you want to synchronize from multiple databases. The Tables parameter is used to specify tables that you want to synchronize from a single database.
         * 
         * *   If the script contains the SelectedTables parameter, the system synchronizes data from the tables that you specify in the SelectedTables parameter.
         * *   If the script contains the Tables parameter, the system synchronizes data from the tables that you specify in the Tables parameter.
         */
        public Builder taskParam(String taskParam) {
            this.putQueryParameter("TaskParam", taskParam);
            this.taskParam = taskParam;
            return this;
        }

        /**
         * The type of the object that you want to update in Data Integration in asynchronous mode. Valid values:
         * <p>
         * 
         * *   DI_REALTIME: real-time synchronization task
         * *   DI_SOLUTION: synchronization solution DataWorks allows you to create or update real-time synchronization tasks in Data Integration only in asynchronous mode.
         * 
         * Valid values:
         * 
         * *   DI_OFFLINE
         * *   DI_REALTIME
         * *   DI_SOLUTION
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public GenerateDISyncTaskConfigForUpdatingRequest build() {
            return new GenerateDISyncTaskConfigForUpdatingRequest(this);
        } 

    } 

}
