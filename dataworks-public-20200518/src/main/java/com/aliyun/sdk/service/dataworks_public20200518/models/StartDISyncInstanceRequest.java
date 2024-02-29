// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartDISyncInstanceRequest} extends {@link RequestModel}
 *
 * <p>StartDISyncInstanceRequest</p>
 */
public class StartDISyncInstanceRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("FileId")
    @Validation(required = true, minimum = 1)
    private Long fileId;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true, maximum = 10000000000D, minimum = 1)
    private Long projectId;

    @Query
    @NameInMap("StartParam")
    private String startParam;

    @Query
    @NameInMap("TaskType")
    @Validation(required = true)
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * *   If you set the TaskType parameter to DI_REALTIME, the StartParam parameter specifies the startup parameters for the real-time synchronization node. The startup parameters include failover-related parameters, the parameter that specifies the number of dirty data records allowed, and the parameters in the data definition language (DDL) statements.
         * <p>
         * *   If you set the TaskType parameter to DI_SOLUTION, the StartParam parameter does not take effect.
         */
        public Builder fileId(Long fileId) {
            this.putQueryParameter("FileId", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * The type of the Data Integration object that you want to start. Valid values:
         * <p>
         * 
         * *   DI_REALTIME: real-time synchronization node
         * *   DI_SOLUTION: data synchronization solution
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
         * *   true: The request succeeded.
         * *   false: The request failed.
         */
        public Builder startParam(String startParam) {
            this.putQueryParameter("StartParam", startParam);
            this.startParam = startParam;
            return this;
        }

        /**
         * *   If you set the TaskType parameter to DI_REALTIME, set the FileId parameter to the ID of the real-time synchronization node that you want to start.
         * <p>
         * *   If you set the TaskType parameter to DI_SOLUTION, set the FileId parameter to the ID of the data synchronization solution that you want to start.
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
