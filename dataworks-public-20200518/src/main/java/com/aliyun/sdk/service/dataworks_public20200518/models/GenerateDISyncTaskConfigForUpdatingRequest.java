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
         * The ID of the real-time synchronization node or synchronization solution.
         * <p>
         * 
         * *   If you set the TaskType parameter to DI_REALTIME, set the TaskId parameter to the value of the FileId parameter for the real-time synchronization node.
         * *   If you set the TaskType parameter to DI_SOLUTION, set the TaskId parameter to the value of the FileId parameter for the synchronization solution.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The type of the object that you want to update in Data Integration in asynchronous mode. Valid values:
         * <p>
         * 
         * *   DI_REALTIME: real-time synchronization node
         * 
         * *   DI_SOLUTION: synchronization solution
         * 
         *     DataWorks allows you to update real-time synchronization nodes and synchronization solutions in Data Integration only in asynchronous mode.
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * Indicates whether the request is successful. Valid values:
         * <p>
         * 
         * *   true: The request is successful.
         * *   false: The request fails.
         */
        public Builder taskId(Long taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. This parameter is used to prevent repeated operations that are caused by multiple calls.
         */
        public Builder taskParam(String taskParam) {
            this.putQueryParameter("TaskParam", taskParam);
            this.taskParam = taskParam;
            return this;
        }

        /**
         * The script for updating the real-time synchronization node or synchronization solution in Data Integration.
         * <p>
         * 
         * DataWorks allows you to add or remove tables for a real-time synchronization node or a synchronization solution in Data Integration only in asynchronous mode. The following types of real-time synchronization nodes and synchronization solutions are supported:
         * 
         * *   Real-time synchronization node or synchronization solution that is used to synchronize data from MySQL to MaxCompute
         * *   Real-time synchronization node or synchronization solution that is used to synchronize data from MySQL data to Kafka
         * *   Real-time synchronization node or synchronization solution that is used to synchronize data from MySQL to Hologres
         * 
         * The SelectedTables parameter is used to specify tables that you want to synchronize from multiple databases. The Tables parameter is used to specify tables that you want to synchronize from a single database.
         * 
         * *   If the script contains the SelectedTables parameter, the system synchronizes the tables that you specify in the SelectedTables parameter.
         * *   If the script contains the Tables parameter, the system synchronizes the tables that you specify in the Tables parameter.
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
