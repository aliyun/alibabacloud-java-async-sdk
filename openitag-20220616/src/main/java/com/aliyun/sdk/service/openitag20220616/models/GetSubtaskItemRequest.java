// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openitag20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSubtaskItemRequest} extends {@link RequestModel}
 *
 * <p>GetSubtaskItemRequest</p>
 */
public class GetSubtaskItemRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("SubtaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subtaskId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ItemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String itemId;

    private GetSubtaskItemRequest(Builder builder) {
        super(builder);
        this.tenantId = builder.tenantId;
        this.taskId = builder.taskId;
        this.subtaskId = builder.subtaskId;
        this.itemId = builder.itemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSubtaskItemRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return subtaskId
     */
    public String getSubtaskId() {
        return this.subtaskId;
    }

    /**
     * @return itemId
     */
    public String getItemId() {
        return this.itemId;
    }

    public static final class Builder extends Request.Builder<GetSubtaskItemRequest, Builder> {
        private String tenantId; 
        private String taskId; 
        private String subtaskId; 
        private String itemId; 

        private Builder() {
            super();
        } 

        private Builder(GetSubtaskItemRequest request) {
            super(request);
            this.tenantId = request.tenantId;
            this.taskId = request.taskId;
            this.subtaskId = request.subtaskId;
            this.itemId = request.itemId;
        } 

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putPathParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putPathParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * SubtaskId.
         */
        public Builder subtaskId(String subtaskId) {
            this.putPathParameter("SubtaskId", subtaskId);
            this.subtaskId = subtaskId;
            return this;
        }

        /**
         * ItemId.
         */
        public Builder itemId(String itemId) {
            this.putPathParameter("ItemId", itemId);
            this.itemId = itemId;
            return this;
        }

        @Override
        public GetSubtaskItemRequest build() {
            return new GetSubtaskItemRequest(this);
        } 

    } 

}
