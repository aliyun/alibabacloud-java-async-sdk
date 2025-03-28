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
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. This parameter is used to prevent repeated operations that are caused by multiple calls.</p>
         * 
         * <strong>example:</strong>
         * <p>ABFUOEUOTRTRJKE</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to obtain the workspace ID.</p>
         * <p>You must configure this parameter to specify the DataWorks workspace to which the API operation is applied.</p>
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
         * <p>The task ID.</p>
         * <ul>
         * <li>If you set the TaskType parameter to DI_REALTIME, set the TaskId parameter to the value of the FileId parameter for the real-time synchronization task.</li>
         * <li>If you set the TaskType parameter to DI_SOLUTION, set the TaskId parameter to the value of the FileId parameter for the synchronization solution.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder taskId(Long taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The script for updating the real-time synchronization task in Data Integration. DataWorks allows you to add or remove tables for a real-time synchronization task in Data Integration only in asynchronous mode. The following types of real-time synchronization tasks are supported:</p>
         * <ul>
         * <li>Synchronization task that is used to synchronize data from MySQL to MaxCompute</li>
         * <li>Synchronization task that is used to synchronize data from MySQL data to Kafka</li>
         * <li>Synchronization task that is used to synchronize data from MySQL to Hologres</li>
         * </ul>
         * <p>The SelectedTables parameter is used to specify tables that you want to synchronize from multiple databases. The Tables parameter is used to specify tables that you want to synchronize from a single database.</p>
         * <ul>
         * <li>If the script contains the SelectedTables parameter, the system synchronizes data from the tables that you specify in the SelectedTables parameter.</li>
         * <li>If the script contains the Tables parameter, the system synchronizes data from the tables that you specify in the Tables parameter.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{      &quot;steps&quot;: [         {             &quot;parameter&quot;: {                 &quot;connection&quot;: [                     {                         &quot;table&quot;: [                             &quot;xyx&quot;                         ]                     }                 ]             },             &quot;name&quot;: &quot;Reader&quot;,             &quot;category&quot;: &quot;reader&quot;         }     ] }</p>
         */
        public Builder taskParam(String taskParam) {
            this.putQueryParameter("TaskParam", taskParam);
            this.taskParam = taskParam;
            return this;
        }

        /**
         * <p>The type of the object that you want to update in Data Integration in asynchronous mode. Valid values:</p>
         * <ul>
         * <li>DI_REALTIME: real-time synchronization task</li>
         * <li>DI_SOLUTION: synchronization solution DataWorks allows you to create or update real-time synchronization tasks in Data Integration only in asynchronous mode.</li>
         * </ul>
         * <p>Valid values:</p>
         * <ul>
         * <li>DI_OFFLINE</li>
         * <li>DI_REALTIME</li>
         * <li>DI_SOLUTION</li>
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
        public GenerateDISyncTaskConfigForUpdatingRequest build() {
            return new GenerateDISyncTaskConfigForUpdatingRequest(this);
        } 

    } 

}
