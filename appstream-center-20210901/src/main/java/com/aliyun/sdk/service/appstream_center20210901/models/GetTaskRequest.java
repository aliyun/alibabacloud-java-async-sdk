// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link GetTaskRequest} extends {@link RequestModel}
 *
 * <p>GetTaskRequest</p>
 */
public class GetTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EntityId")
    private String entityId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EntityType")
    private String entityType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EntityVersionId")
    private String entityVersionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskCategory")
    private String taskCategory;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskType")
    private String taskType;

    private GetTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.entityId = builder.entityId;
        this.entityType = builder.entityType;
        this.entityVersionId = builder.entityVersionId;
        this.taskCategory = builder.taskCategory;
        this.taskId = builder.taskId;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTaskRequest create() {
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
     * @return entityId
     */
    public String getEntityId() {
        return this.entityId;
    }

    /**
     * @return entityType
     */
    public String getEntityType() {
        return this.entityType;
    }

    /**
     * @return entityVersionId
     */
    public String getEntityVersionId() {
        return this.entityVersionId;
    }

    /**
     * @return taskCategory
     */
    public String getTaskCategory() {
        return this.taskCategory;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<GetTaskRequest, Builder> {
        private String regionId; 
        private String entityId; 
        private String entityType; 
        private String entityVersionId; 
        private String taskCategory; 
        private String taskId; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(GetTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.entityId = request.entityId;
            this.entityType = request.entityType;
            this.entityVersionId = request.entityVersionId;
            this.taskCategory = request.taskCategory;
            this.taskId = request.taskId;
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
         * <p>The associated resource ID. <strong>If you do not specify the TaskId parameter, you must specify the EntityId, EntityType, and TaskCategory parameters at the same time.</strong> The resource ID must match the selected resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>imgc-bp1example****</p>
         */
        public Builder entityId(String entityId) {
            this.putBodyParameter("EntityId", entityId);
            this.entityId = entityId;
            return this;
        }

        /**
         * <p>The associated resource type. This parameter is required if you do not specify the TaskId parameter.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><strong>IMAGE</strong>: image resource.</li>
         * <li><strong>APP</strong>: application resource.</li>
         * <li><strong>SNAPSHOT</strong>: snapshot resource.</li>
         * </ul>
         * <p>You must also select an applicable TaskCategory. The resource type itself does not mean that all task categories can be queried by resource.</p>
         * 
         * <strong>example:</strong>
         * <p>IMAGE</p>
         */
        public Builder entityType(String entityType) {
            this.putBodyParameter("EntityType", entityType);
            this.entityType = entityType;
            return this;
        }

        /**
         * <p>The associated resource version ID. This parameter is used to specify the version when you query by resource. For image resources, specify the image version ID.</p>
         * 
         * <strong>example:</strong>
         * <p>iv-bp1example****</p>
         */
        public Builder entityVersionId(String entityVersionId) {
            this.putBodyParameter("EntityVersionId", entityVersionId);
            this.entityVersionId = entityVersionId;
            return this;
        }

        /**
         * <p>The task category when you query by resource. This parameter is required if you do not specify the TaskId parameter.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><strong>IMAGE_BUILDER</strong>: image creation. Queries tasks for manual creation, automatic creation, or creation based on an instance.</li>
         * <li><strong>IMAGE_DISTRIBUTE</strong>: image distribution across regions.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IMAGE_BUILDER</p>
         */
        public Builder taskCategory(String taskCategory) {
            this.putBodyParameter("TaskCategory", taskCategory);
            this.taskCategory = taskCategory;
            return this;
        }

        /**
         * <p>The task ID. If you specify this parameter, the system queries the task by this ID first, and the resource information query conditions are no longer used for locating the task.</p>
         * 
         * <strong>example:</strong>
         * <p>tid-bp1example****</p>
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p><strong>Not enabled. Do not specify this parameter.</strong> When you query a task, locate the task by using the TaskId parameter or the resource information and TaskCategory parameter. This parameter is not used for task filtering.</p>
         * <p>The example &quot;Not applicable (not enabled)&quot; is only a description of the field status, not a valid parameter value.</p>
         * 
         * <strong>example:</strong>
         * <p>Not applicable (not enabled)</p>
         */
        public Builder taskType(String taskType) {
            this.putBodyParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public GetTaskRequest build() {
            return new GetTaskRequest(this);
        } 

    } 

}
