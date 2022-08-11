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
    @Query
    @NameInMap("AsyncProcessId")
    @Validation(required = true, minimum = 1)
    private Long asyncProcessId;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true, maximum = 10000000000D, minimum = 1)
    private Long projectId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("TaskType")
    @Validation(required = true)
    private String taskType;

    private QueryDISyncTaskConfigProcessResultRequest(Builder builder) {
        super(builder);
        this.asyncProcessId = builder.asyncProcessId;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<QueryDISyncTaskConfigProcessResultRequest, Builder> {
        private Long asyncProcessId; 
        private Long projectId; 
        private String regionId; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(QueryDISyncTaskConfigProcessResultRequest request) {
            super(request);
            this.asyncProcessId = request.asyncProcessId;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
            this.taskType = request.taskType;
        } 

        /**
         * AsyncProcessId.
         */
        public Builder asyncProcessId(Long asyncProcessId) {
            this.putQueryParameter("AsyncProcessId", asyncProcessId);
            this.asyncProcessId = asyncProcessId;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
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
         * TaskType.
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
