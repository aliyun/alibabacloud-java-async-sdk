// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDISyncInstanceInfoRequest} extends {@link RequestModel}
 *
 * <p>GetDISyncInstanceInfoRequest</p>
 */
public class GetDISyncInstanceInfoRequest extends Request {
    @Query
    @NameInMap("FileId")
    @Validation(required = true, minimum = 1)
    private Long fileId;

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

    private GetDISyncInstanceInfoRequest(Builder builder) {
        super(builder);
        this.fileId = builder.fileId;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDISyncInstanceInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<GetDISyncInstanceInfoRequest, Builder> {
        private Long fileId; 
        private Long projectId; 
        private String regionId; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(GetDISyncInstanceInfoRequest request) {
            super(request);
            this.fileId = request.fileId;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
            this.taskType = request.taskType;
        } 

        /**
         * FileId.
         */
        public Builder fileId(Long fileId) {
            this.putQueryParameter("FileId", fileId);
            this.fileId = fileId;
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
        public GetDISyncInstanceInfoRequest build() {
            return new GetDISyncInstanceInfoRequest(this);
        } 

    } 

}
