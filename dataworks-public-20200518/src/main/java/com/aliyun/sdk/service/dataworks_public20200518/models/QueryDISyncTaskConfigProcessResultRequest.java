// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDISyncTaskConfigProcessResultRequest} extends {@link RequestModel}
 *
 * <p>QueryDISyncTaskConfigProcessResultRequest</p>
 */
public class QueryDISyncTaskConfigProcessResultRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("AsyncProcessId")
    @Validation(required = true, minimum = 1)
    private Long asyncProcessId;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true, maximum = 10000000000D, minimum = 1)
    private Long projectId;

    @Query
    @NameInMap("TaskType")
    @Validation(required = true)
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
         * Indicates whether the request is successful. Valid values:
         * <p>
         * 
         * *   true: The request is successful.
         * *   false: The request fails.
         */
        public Builder asyncProcessId(Long asyncProcessId) {
            this.putQueryParameter("AsyncProcessId", asyncProcessId);
            this.asyncProcessId = asyncProcessId;
            return this;
        }

        /**
         * The type of the object that you want to create or update in Data Integration in asynchronous mode. Valid values:
         * <p>
         * 
         * *   DI_REALTIME: real-time synchronization node
         * 
         * *   DI_SOLUTION: synchronization solution
         * 
         *     DataWorks allows you to create or update real-time synchronization nodes and synchronization solutions in Data Integration only in asynchronous mode.
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The ID of the asynchronous thread. You can call the [GenerateDISyncTaskConfigForCreating](~~383463~~) or [GenerateDISyncTaskConfigForUpdating](~~383464~~) operation to generate the ID.
         * <p>
         * 
         * *   The GenerateDISyncTaskConfigForCreating operation is used to generate the ID of the asynchronous thread that is used to create a real-time synchronization node or a synchronization solution in Data Integration.
         * *   The GenerateDISyncTaskConfigForUpdating operation is used to generate the ID of the asynchronous thread that is used to update a real-time synchronization node or a synchronization solution in Data Integration.
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
