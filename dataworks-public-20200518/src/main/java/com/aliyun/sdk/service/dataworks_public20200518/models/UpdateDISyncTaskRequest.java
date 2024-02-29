// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDISyncTaskRequest} extends {@link RequestModel}
 *
 * <p>UpdateDISyncTaskRequest</p>
 */
public class UpdateDISyncTaskRequest extends Request {
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
    @NameInMap("TaskContent")
    private String taskContent;

    @Query
    @NameInMap("TaskParam")
    private String taskParam;

    @Query
    @NameInMap("TaskType")
    @Validation(required = true)
    private String taskType;

    private UpdateDISyncTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.fileId = builder.fileId;
        this.projectId = builder.projectId;
        this.taskContent = builder.taskContent;
        this.taskParam = builder.taskParam;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDISyncTaskRequest create() {
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
     * @return taskContent
     */
    public String getTaskContent() {
        return this.taskContent;
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

    public static final class Builder extends Request.Builder<UpdateDISyncTaskRequest, Builder> {
        private String regionId; 
        private Long fileId; 
        private Long projectId; 
        private String taskContent; 
        private String taskParam; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDISyncTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.fileId = request.fileId;
            this.projectId = request.projectId;
            this.taskContent = request.taskContent;
            this.taskParam = request.taskParam;
            this.taskType = request.taskType;
        } 

        /**
         * The ID of the region in which the DataWorks workspace resides. For example, the ID of the China (Shanghai) region is cn-shanghai, and that of the China (Zhangjiakou) region is cn-zhangjiakou. The system automatically determines the value of this parameter based on the endpoint used to call the operation.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the sync node to be updated. You can call the [ListFiles](~~173942~~) operation to query the ID of the node.
         */
        public Builder fileId(Long fileId) {
            this.putQueryParameter("FileId", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * The ID of the DataWorks workspace. You can log on to the [DataWorks console](https://workbench.data.aliyun.com/console) and go to the Workspace Management page to obtain the workspace ID.
         * <p>
         * 
         * You must set this parameter to specify the DataWorks workspace in which the node resides.
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The updated configuration of the sync node. This operation is equivalent to node update by using the code editor in the DataWorks console. For more information, see [Create a sync node by using the code editor](~~137717~~). You can call the UpdateDISyncTask operation to update only batch sync nodes. If you do not need to update the configuration of the sync node, leave this parameter empty.
         */
        public Builder taskContent(String taskContent) {
            this.putQueryParameter("TaskContent", taskContent);
            this.taskContent = taskContent;
            return this;
        }

        /**
         * The setting that updates the resource group used by the node. The value must be in the JSON format.
         * <p>
         * 
         * Only the ResourceGroup field is supported. This field specifies the identifier of the resource group for Data Integration that is used by the node. To query the identifier of the resource group, call the [ListResourceGroup](~~62055~~) operation.
         * 
         * If you do not need to update the resource group for the sync node, leave this parameter empty.
         */
        public Builder taskParam(String taskParam) {
            this.putQueryParameter("TaskParam", taskParam);
            this.taskParam = taskParam;
            return this;
        }

        /**
         * The type of the sync node.
         * <p>
         * 
         * You can call the UpdateDISyncTask operation to update only batch sync nodes. The value must be DI_OFFLINE.
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public UpdateDISyncTaskRequest build() {
            return new UpdateDISyncTaskRequest(this);
        } 

    } 

}
