// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteOfficeConversionTaskRequest} extends {@link RequestModel}
 *
 * <p>DeleteOfficeConversionTaskRequest</p>
 */
public class DeleteOfficeConversionTaskRequest extends Request {
    @Query
    @NameInMap("Project")
    @Validation(required = true)
    private String project;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("TaskId")
    @Validation(required = true)
    private String taskId;

    private DeleteOfficeConversionTaskRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.regionId = builder.regionId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteOfficeConversionTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<DeleteOfficeConversionTaskRequest, Builder> {
        private String project; 
        private String regionId; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteOfficeConversionTaskRequest response) {
            super(response);
            this.project = response.project;
            this.regionId = response.regionId;
            this.taskId = response.taskId;
        } 

        /**
         * Project.
         */
        public Builder project(String project) {
            this.putQueryParameter("Project", project);
            this.project = project;
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
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public DeleteOfficeConversionTaskRequest build() {
            return new DeleteOfficeConversionTaskRequest(this);
        } 

    } 

}
