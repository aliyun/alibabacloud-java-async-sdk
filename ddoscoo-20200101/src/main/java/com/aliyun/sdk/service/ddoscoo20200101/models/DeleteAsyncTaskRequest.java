// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DeleteAsyncTaskRequest} extends {@link RequestModel}
 *
 * <p>DeleteAsyncTaskRequest</p>
 */
public class DeleteAsyncTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer taskId;

    private DeleteAsyncTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAsyncTaskRequest create() {
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
     * @return taskId
     */
    public Integer getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<DeleteAsyncTaskRequest, Builder> {
        private String regionId; 
        private String resourceGroupId; 
        private Integer taskId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAsyncTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.taskId = request.taskId;
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
         * <p>The ID of the resource group to which the instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The ID of the task that you want to delete.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeAsyncTasks~~">DescribeAsyncTasks</a> operation to query the IDs of all asynchronous export tasks.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder taskId(Integer taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public DeleteAsyncTaskRequest build() {
            return new DeleteAsyncTaskRequest(this);
        } 

    } 

}
