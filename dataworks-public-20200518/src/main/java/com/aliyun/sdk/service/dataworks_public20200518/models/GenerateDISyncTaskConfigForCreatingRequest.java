// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GenerateDISyncTaskConfigForCreatingRequest} extends {@link RequestModel}
 *
 * <p>GenerateDISyncTaskConfigForCreatingRequest</p>
 */
public class GenerateDISyncTaskConfigForCreatingRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("TaskParam")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskType")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to obtain the ID.</p>
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
         * <p>The script for the synchronization task. DataWorks allows you to create the following types of synchronization tasks:</p>
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
         * <p>The following sample code provides a script for data synchronization from MySQL to MaxCompute:</p>
         * <pre><code>{
         *   &quot;type&quot;: &quot;realtime&quot;,
         *   &quot;version&quot;: &quot;1.0&quot;,
         *   &quot;setting&quot;: {
         *     &quot;resourceGroup&quot;: &quot;S_res_group_280749521950784_1623033752022&quot;,
         *     &quot;taskType&quot;: &quot;oneclick_to_odps&quot;
         *   },
         *   &quot;steps&quot;: [
         *     {
         *       &quot;stepType&quot;: &quot;mysql&quot;,
         *       &quot;parameter&quot;: {
         *         &quot;connection&quot;: [
         *           {
         *             &quot;datasourceType&quot;: &quot;mysql&quot;,
         *             &quot;datasource&quot;: &quot;mysql_pub1&quot;,
         *             &quot;selectedTables&quot;: [
         *               {
         *                 &quot;dbName&quot;: &quot;mysql_db&quot;,
         *                 &quot;schema&quot;: [
         *                   {
         *                     &quot;tableInfos&quot;: [
         *                       {
         *                         &quot;table&quot;: &quot;molin_di_test_in_pk_v4&quot;
         *                       }
         *                     ]
         *                   }
         *                 ]
         *               }
         *             ]
         *           }
         *         ]
         *       },
         *       &quot;name&quot;: &quot;Reader&quot;,
         *       &quot;category&quot;: &quot;reader&quot;
         *     },
         *     {
         *       &quot;stepType&quot;: &quot;odps&quot;,
         *       &quot;parameter&quot;: {
         *         &quot;datasource&quot;: &quot;odps_source&quot;
         *       },
         *       &quot;name&quot;: &quot;Writer&quot;,
         *       &quot;category&quot;: &quot;writer&quot;
         *     }
         *   ]
         * }
         * </code></pre>
         * <p>The following sample code provides a script for data synchronization from MySQL to Kafka:</p>
         * <pre><code>{
         *   &quot;type&quot;: &quot;realtime&quot;,
         *   &quot;version&quot;: &quot;1.0&quot;,
         *   &quot;setting&quot;: {
         *     &quot;resourceGroup&quot;: &quot;S_res_group_280749521950784_1623033752022&quot;,
         *     &quot;taskType&quot;: &quot;oneclick_to_kafka&quot;
         *   },
         *   &quot;steps&quot;: [
         *     {
         *       &quot;stepType&quot;: &quot;mysql&quot;,
         *       &quot;parameter&quot;: {
         *         &quot;connection&quot;: [
         *           {
         *             &quot;datasourceType&quot;: &quot;mysql&quot;,
         *             &quot;datasource&quot;: &quot;pkset_test&quot;,
         *             &quot;selectedTables&quot;: [
         *               {
         *                 &quot;dbName&quot;: &quot;mysql_db&quot;,
         *                 &quot;schema&quot;: [
         *                   {
         *                     &quot;tableInfos&quot;: [
         *                       {
         *                         &quot;table&quot;: &quot;molin_di_test_in_pk_v4&quot;
         *                       }
         *                     ]
         *                   }
         *                 ]
         *               }
         *             ]
         *           }
         *         ]
         *       },
         *       &quot;name&quot;: &quot;Reader&quot;,
         *       &quot;category&quot;: &quot;reader&quot;
         *     },
         *     {
         *       &quot;stepType&quot;: &quot;kafka&quot;,
         *       &quot;parameter&quot;: {
         *         &quot;datasource&quot;: &quot;azn_kafka&quot;
         *       },
         *       &quot;name&quot;: &quot;Writer&quot;,
         *       &quot;category&quot;: &quot;writer&quot;
         *     }
         *   ]
         * }
         * </code></pre>
         * <p>The following sample code provides a script for data synchronization from MySQL to Hologres:</p>
         * <pre><code>{
         *   &quot;type&quot;: &quot;realtime&quot;,
         *   &quot;version&quot;: &quot;1.0&quot;,
         *   &quot;setting&quot;: {
         *     &quot;resourceGroup&quot;: &quot;S_res_group_280749521950784_1623033752022&quot;,
         *     &quot;taskType&quot;: &quot;oneclick_to_holo&quot;
         *   },
         *   &quot;steps&quot;: [
         *     {
         *       &quot;stepType&quot;: &quot;mysql&quot;,
         *       &quot;parameter&quot;: {
         *         &quot;connection&quot;: [
         *           {
         *             &quot;datasourceType&quot;: &quot;mysql&quot;,
         *             &quot;datasource&quot;: &quot;mysql_pub&quot;,
         *             &quot;selectedTables&quot;: [
         *               {
         *                 &quot;dbName&quot;: &quot;mysql_db&quot;,
         *                 &quot;schema&quot;: [
         *                   {
         *                     &quot;tableInfos&quot;: [
         *                       {
         *                         &quot;table&quot;: &quot;molin_di_test_in2_pk_v3&quot;
         *                       }
         *                     ]
         *                   }
         *                 ]
         *               }
         *             ]
         *           }
         *         ]
         *       },
         *       &quot;name&quot;: &quot;Reader&quot;,
         *       &quot;category&quot;: &quot;reader&quot;
         *     },
         *     {
         *       &quot;stepType&quot;: &quot;holo&quot;,
         *       &quot;parameter&quot;: {
         *         &quot;datasource&quot;: &quot;holo&quot;
         *       },
         *       &quot;name&quot;: &quot;Writer&quot;,
         *       &quot;category&quot;: &quot;writer&quot;
         *     }
         *   ]
         * }
         * </code></pre>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{    &quot;type&quot;: &quot;realtime&quot;,     &quot;version&quot;: &quot;1.0&quot;,        &quot;setting&quot;: {       &quot;resourceGroup&quot;:       &quot;S_res_group_280749521950784_1623033752022&quot;,        &quot;scheduleResgroupId&quot;: 30003913,       &quot;name&quot;: &quot;openapi_realtime_solution_0813_1739&quot;,       &quot;taskType&quot;: &quot;oneclick_to_odps&quot;     },     &quot;steps&quot;: [         {             &quot;stepType&quot;: &quot;mysql&quot;,             &quot;parameter&quot;: {                 &quot;connection&quot;: [                     {                        &quot;datasourceType&quot;: &quot;mysql&quot;,                         &quot;datasource&quot;: &quot;mysql_pub&quot;,                         &quot;table&quot;: [                             &quot;xyx&quot;                         ]                     }                 ]             },             &quot;name&quot;: &quot;Reader&quot;,             &quot;category&quot;: &quot;reader&quot;         },         {             &quot;stepType&quot;: &quot;odps&quot;,             &quot;parameter&quot;: {                 &quot;datasource&quot;: &quot;odps_first&quot;             },             &quot;name&quot;: &quot;Writer&quot;,             &quot;category&quot;: &quot;writer&quot;         }     ] }</p>
         */
        public Builder taskParam(String taskParam) {
            this.putQueryParameter("TaskParam", taskParam);
            this.taskParam = taskParam;
            return this;
        }

        /**
         * <p>The type of task that you want to create in Data Integration in asynchronous mode. Valid values:</p>
         * <ul>
         * <li>DI_REALTIME: real-time synchronization task</li>
         * <li>DI_SOLUTION: another type of synchronization task</li>
         * </ul>
         * <p>DataWorks allows you to create real-time synchronization tasks and other types of synchronization tasks in Data Integration only in asynchronous mode.</p>
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
        public GenerateDISyncTaskConfigForCreatingRequest build() {
            return new GenerateDISyncTaskConfigForCreatingRequest(this);
        } 

    } 

}
