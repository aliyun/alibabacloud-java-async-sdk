// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDISyncTaskConfigProcessResultRequest} extends {@link RequestModel}
 *
 * <p>QueryDISyncTaskConfigProcessResultRequest</p>
 */
public class QueryDISyncTaskConfigProcessResultRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AsyncProcessId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long asyncProcessId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 10000000000D, minimum = 1)
    private Long projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskType;

    private QueryDISyncTaskConfigProcessResultRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.asyncProcessId = builder.asyncProcessId;
        this.projectId = builder.projectId;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDISyncTaskConfigProcessResultRequest create() {
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
     * @return asyncProcessId
     */
    public Long getAsyncProcessId() {
        return this.asyncProcessId;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<QueryDISyncTaskConfigProcessResultRequest, Builder> {
        private String regionId; 
        private Long asyncProcessId; 
        private Long projectId; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(QueryDISyncTaskConfigProcessResultRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.asyncProcessId = request.asyncProcessId;
            this.projectId = request.projectId;
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
         * The asynchronous thread ID. You can call the [GenerateDISyncTaskConfigForCreating](~~383463~~) or [GenerateDISyncTaskConfigForUpdating](~~383464~~) operation to obtain the ID.
         * <p>
         * 
         * *   The GenerateDISyncTaskConfigForCreating operation is used to generate the ID of the asynchronous thread that is used to create a real-time synchronization task in Data Integration.
         * *   The GenerateDISyncTaskConfigForUpdating operation is used to generate the ID of the asynchronous thread that is used to update a real-time synchronization task in Data Integration.
         */
        public Builder asyncProcessId(Long asyncProcessId) {
            this.putQueryParameter("AsyncProcessId", asyncProcessId);
            this.asyncProcessId = asyncProcessId;
            return this;
        }

        /**
         * The DataWorks workspace ID. You can log on to the [DataWorks console](https://workbench.data.aliyun.com/console) and go to the Workspace page to obtain the ID.
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
         * The type of the object that you want to create or update in Data Integration in asynchronous mode. Valid values:
         * <p>
         * 
         * *   DI_REALTIME: real-time synchronization task
         * *   DI_SOLUTION: synchronization solution DataWorks allows you to create or update real-time synchronization tasks and synchronization solutions in Data Integration only in asynchronous mode.
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
        public QueryDISyncTaskConfigProcessResultRequest build() {
            return new QueryDISyncTaskConfigProcessResultRequest(this);
        } 

    } 

}
