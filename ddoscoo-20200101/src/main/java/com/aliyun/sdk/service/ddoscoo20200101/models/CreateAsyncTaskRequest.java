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

        private Builder(CreateAsyncTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.taskParams = request.taskParams;
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
         * The ID of the resource group to which the instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The details of the asynchronous export task. The value is a JSON string. The field in the value varies with **TaskType**.
         * <p>
         * 
         * If **TaskType** is set to **1**, **3**, **4**, **5**, or **6**, the following filed is returned:
         * 
         * *   **instanceId**: the ID of the instance. This field is required and must be of the STRING type.
         * 
         * If **TaskType** is set to **2**, the following field is returned:
         * 
         * *   **domain**: the domain name of the website, which must be of the STRING type. If you do not specify this field, the forwarding rules of all websites are exported.
         */
        public Builder taskParams(String taskParams) {
            this.putQueryParameter("TaskParams", taskParams);
            this.taskParams = taskParams;
            return this;
        }

        /**
         * The type of the asynchronous export task that you want to create. Valid values:
         * <p>
         * 
         * *   **1**: the task to export the port forwarding rules of an instance
         * *   **2**: the task to export the forwarding rules of a website protected by an instance
         * *   **3**: the task to export the session persistence and health check settings of an instance
         * *   **4**: the task to export the anti-DDoS mitigation policies of an instance
         * *   **5**: the task to download the blacklist for destination IP addresses of an instance
         * *   **6**: the task to download the whitelist for destination IP addresses of an instance
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
