// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20230516.models;

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
 * {@link TaskRecoverCallRequest} extends {@link RequestModel}
 *
 * <p>TaskRecoverCallRequest</p>
 */
public class TaskRecoverCallRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginImportTime")
    private String beginImportTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndImportTime")
    private String endImportTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Numbers")
    private java.util.List<String> numbers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<String> tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long taskId;

    private TaskRecoverCallRequest(Builder builder) {
        super(builder);
        this.beginImportTime = builder.beginImportTime;
        this.endImportTime = builder.endImportTime;
        this.numbers = builder.numbers;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tags = builder.tags;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TaskRecoverCallRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beginImportTime
     */
    public String getBeginImportTime() {
        return this.beginImportTime;
    }

    /**
     * @return endImportTime
     */
    public String getEndImportTime() {
        return this.endImportTime;
    }

    /**
     * @return numbers
     */
    public java.util.List<String> getNumbers() {
        return this.numbers;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return tags
     */
    public java.util.List<String> getTags() {
        return this.tags;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<TaskRecoverCallRequest, Builder> {
        private String beginImportTime; 
        private String endImportTime; 
        private java.util.List<String> numbers; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List<String> tags; 
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(TaskRecoverCallRequest request) {
            super(request);
            this.beginImportTime = request.beginImportTime;
            this.endImportTime = request.endImportTime;
            this.numbers = request.numbers;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tags = request.tags;
            this.taskId = request.taskId;
        } 

        /**
         * <p>查询开始导入时间</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;2023-01-09 18:58:19&quot;</p>
         */
        public Builder beginImportTime(String beginImportTime) {
            this.putQueryParameter("BeginImportTime", beginImportTime);
            this.beginImportTime = beginImportTime;
            return this;
        }

        /**
         * <p>查询结束导入时间</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;2023-01-09 18:58:19&quot;</p>
         */
        public Builder endImportTime(String endImportTime) {
            this.putQueryParameter("EndImportTime", endImportTime);
            this.endImportTime = endImportTime;
            return this;
        }

        /**
         * <p>号码列表</p>
         */
        public Builder numbers(java.util.List<String> numbers) {
            String numbersShrink = shrink(numbers, "Numbers", "json");
            this.putQueryParameter("Numbers", numbersShrink);
            this.numbers = numbers;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>用户自定义标签列表</p>
         */
        public Builder tags(java.util.List<String> tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * <p>任务ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>93</p>
         */
        public Builder taskId(Long taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public TaskRecoverCallRequest build() {
            return new TaskRecoverCallRequest(this);
        } 

    } 

}
