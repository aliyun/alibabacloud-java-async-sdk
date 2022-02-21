// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAsyncTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateAsyncTaskRequest</p>
 */
public class CreateAsyncTaskRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("TaskParams")
    @Validation(required = true)
    private String taskParams;

    @Query
    @NameInMap("TaskType")
    @Validation(required = true)
    private Integer taskType;

    private CreateAsyncTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.taskParams = builder.taskParams;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAsyncTaskRequest create() {
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return taskParams
     */
    public String getTaskParams() {
        return this.taskParams;
    }

    /**
     * @return taskType
     */
    public Integer getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<CreateAsyncTaskRequest, Builder> {
        private String regionId; 
        private String resourceGroupId; 
        private String taskParams; 
        private Integer taskType; 

        private Builder() {
            super();
        } 

        private Builder(CreateAsyncTaskRequest response) {
            super(response);
            this.regionId = response.regionId;
            this.resourceGroupId = response.resourceGroupId;
            this.taskParams = response.taskParams;
            this.taskType = response.taskType;
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * TaskParams.
         */
        public Builder taskParams(String taskParams) {
            this.putQueryParameter("TaskParams", taskParams);
            this.taskParams = taskParams;
            return this;
        }

        /**
         * TaskType.
         */
        public Builder taskType(Integer taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public CreateAsyncTaskRequest build() {
            return new CreateAsyncTaskRequest(this);
        } 

    } 

}
