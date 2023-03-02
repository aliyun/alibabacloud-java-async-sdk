// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateDISyncTaskConfigForCreatingRequest} extends {@link RequestModel}
 *
 * <p>GenerateDISyncTaskConfigForCreatingRequest</p>
 */
public class GenerateDISyncTaskConfigForCreatingRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true, maximum = 10000000000D, minimum = 1)
    private Long projectId;

    @Query
    @NameInMap("TaskParam")
    @Validation(required = true)
    private String taskParam;

    @Query
    @NameInMap("TaskType")
    @Validation(required = true)
    private String taskType;

    private GenerateDISyncTaskConfigForCreatingRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.projectId = builder.projectId;
        this.taskParam = builder.taskParam;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateDISyncTaskConfigForCreatingRequest create() {
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

    public static final class Builder extends Request.Builder<GenerateDISyncTaskConfigForCreatingRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private Long projectId; 
        private String taskParam; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(GenerateDISyncTaskConfigForCreatingRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
            this.projectId = request.projectId;
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
         * The ID of the DataWorks workspace. You can log on to the [DataWorks console](https://workbench.data.aliyun.com/console) and go to the Workspace Management page to obtain the workspace ID.
         * <p>
         * 
         * This parameter specifies the DataWorks workspace to which the operation is applied.
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The script for the real-time synchronization node or synchronization solution in Data Integration.
         * <p>
         * 
         * The following types of real-time synchronization nodes and synchronization solutions are supported:
         * 
         * *   Real-time synchronization node or synchronization solution that is used to synchronize data from MySQL to MaxCompute
         * *   Real-time synchronization node or synchronization solution that is used to synchronize data from MySQL data to Kafka
         * *   Real-time synchronization node or synchronization solution that is used to synchronize data from MySQL to Hologres
         * 
         * The SelectedTables parameter is used to specify tables that you want to synchronize from multiple databases. The Tables parameter is used to specify tables that you want to synchronize from a single database.
         * 
         * *   If the script contains the SelectedTables parameter, the system synchronizes the tables that you specify in the SelectedTables parameter.
         * *   If the script contains the Tables parameter, the system synchronizes the tables that you specify in the Tables parameter.
         * 
         * The following sample code provides a script for data synchronization from MySQL to MaxCompute:
         * 
         * {
         * 
         * "type": "realtime",
         * 
         * "version": "1.0",
         * 
         * "setting": {
         * 
         * "resourceGroup": "S_res_group\_280749521950784\_1623033752022",
         * 
         * "taskType": "oneclick_to_odps"
         * 
         * },
         * 
         * "steps": { "stepType": "mysql", "parameter": { "connection": \[ { "datasourceType": "mysql", "datasource": "mysql_pub1", "selectedTables": \[ { "dbName": "mysql_db", "schema": \[ { "tableInfos": \[ { "table": "molin_di_test_in_pk_v4" }
         * 
         * }
         * 
         * ]
         * 
         * }
         * 
         * ]
         * 
         * }
         * 
         * ]
         * 
         * },
         * 
         * "name": "Reader",
         * 
         * "category": "reader"
         * 
         * },
         * 
         * {
         * 
         * "stepType": "odps",
         * 
         * "parameter": {
         * 
         * "datasource": "odps_first"
         * 
         * },
         * 
         * "name": "Writer",
         * 
         * "category": "writer"
         * 
         * }
         * 
         * ]
         * 
         * }
         * 
         * The following sample code provides a script for data synchronization from MySQL to Kafka:
         * 
         * {
         * 
         * "type": "realtime",
         * 
         * "version": "1.0",
         * 
         * "setting": {
         * 
         * "resourceGroup": "S_res_group\_280749521950784\_1623033752022",
         * 
         * "taskType": "oneclick_to_kafka"
         * 
         * },
         * 
         * "steps": { "stepType": "mysql", "parameter": { "connection": \[ { "datasourceType": "mysql", "datasource": "pkset_test", "selectedTables": \[ { "dbName": "mysql_db", "schema": \[ { "tableInfos": \[ { "table": "molin_di_test_in_pk_v4" }
         * 
         * }
         * 
         * ]
         * 
         * }
         * 
         * ]
         * 
         * }
         * 
         * ]
         * 
         * },
         * 
         * "name": "Reader",
         * 
         * "category": "reader"
         * 
         * },
         * 
         * {
         * 
         * "stepType": "kafka",
         * 
         * "parameter": {
         * 
         * "datasource": "azn_kafka"
         * 
         * },
         * 
         * "name": "Writer",
         * 
         * "category": "writer"
         * 
         * }
         * 
         * ]
         * 
         * }
         * 
         * The following sample code provides a script for data synchronization from MySQL to Hologres:
         * 
         * {
         * 
         * "type": "realtime",
         * 
         * "version": "1.0",
         * 
         * "setting": {
         * 
         * "resourceGroup": "S_res_group\_280749521950784\_1623033752022",
         * 
         * "taskType": "oneclick_to_holo"
         * 
         * },
         * 
         * "steps": { "stepType": "mysql", "parameter": { "connection": \[ { "datasourceType": "mysql", "datasource": "mysql_pub", "selectedTables": \[ { "dbName": "mysql_db", "schema": \[ { "tableInfos": \[ { "table": "molin_di_test_in2\_pk_v3" }
         * 
         * }
         * 
         * ]
         * 
         * }
         * 
         * ]
         * 
         * }
         * 
         * ]
         * 
         * },
         * 
         * "name": "Reader",
         * 
         * "category": "reader"
         * 
         * },
         * 
         * {
         * 
         * "stepType": "holo",
         * 
         * "parameter": {
         * 
         * "datasource": "holo"
         * 
         * },
         * 
         * "name": "Writer",
         * 
         * "category": "writer"
         * 
         * }
         * 
         * ]
         * 
         * }
         */
        public Builder taskParam(String taskParam) {
            this.putQueryParameter("TaskParam", taskParam);
            this.taskParam = taskParam;
            return this;
        }

        /**
         * The type of the object that you want to create in Data Integration in asynchronous mode. Valid values:
         * <p>
         * 
         * *   DI_REALTIME: real-time synchronization node
         * *   DI_SOLUTION: synchronization solution
         * 
         * DataWorks allows you to create real-time synchronization nodes and synchronization solutions in Data Integration only in asynchronous mode.
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public GenerateDISyncTaskConfigForCreatingRequest build() {
            return new GenerateDISyncTaskConfigForCreatingRequest(this);
        } 

    } 

}
