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
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The asynchronous thread ID. You can call the <a href="https://help.aliyun.com/document_detail/383463.html">GenerateDISyncTaskConfigForCreating</a> or <a href="https://help.aliyun.com/document_detail/383464.html">GenerateDISyncTaskConfigForUpdating</a> operation to obtain the ID.</p>
         * <ul>
         * <li>The GenerateDISyncTaskConfigForCreating operation is used to generate the ID of the asynchronous thread that is used to create a real-time synchronization task in Data Integration.</li>
         * <li>The GenerateDISyncTaskConfigForUpdating operation is used to generate the ID of the asynchronous thread that is used to update a real-time synchronization task in Data Integration.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder asyncProcessId(Long asyncProcessId) {
            this.putQueryParameter("AsyncProcessId", asyncProcessId);
            this.asyncProcessId = asyncProcessId;
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
         * <p>The type of the object that you want to create or update in Data Integration in asynchronous mode. Valid values:</p>
         * <ul>
         * <li>DI_REALTIME: real-time synchronization task</li>
         * <li>DI_SOLUTION: synchronization solution DataWorks allows you to create or update real-time synchronization tasks and synchronization solutions in Data Integration only in asynchronous mode.</li>
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
        public QueryDISyncTaskConfigProcessResultRequest build() {
            return new QueryDISyncTaskConfigProcessResultRequest(this);
        } 

    } 

}
