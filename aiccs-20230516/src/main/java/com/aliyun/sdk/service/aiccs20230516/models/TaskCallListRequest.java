// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20230516.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TaskCallListRequest} extends {@link RequestModel}
 *
 * <p>TaskCallListRequest</p>
 */
public class TaskCallListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BatchId")
    private String batchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String callDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndCallDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endCallDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntentTags")
    private java.util.List < String > intentTags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Numbers")
    private java.util.List < String > numbers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Page")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long taskId;

    private TaskCallListRequest(Builder builder) {
        super(builder);
        this.batchId = builder.batchId;
        this.callDate = builder.callDate;
        this.endCallDate = builder.endCallDate;
        this.intentTags = builder.intentTags;
        this.numbers = builder.numbers;
        this.ownerId = builder.ownerId;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TaskCallListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchId
     */
    public String getBatchId() {
        return this.batchId;
    }

    /**
     * @return callDate
     */
    public String getCallDate() {
        return this.callDate;
    }

    /**
     * @return endCallDate
     */
    public String getEndCallDate() {
        return this.endCallDate;
    }

    /**
     * @return intentTags
     */
    public java.util.List < String > getIntentTags() {
        return this.intentTags;
    }

    /**
     * @return numbers
     */
    public java.util.List < String > getNumbers() {
        return this.numbers;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return page
     */
    public Long getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
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
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<TaskCallListRequest, Builder> {
        private String batchId; 
        private String callDate; 
        private String endCallDate; 
        private java.util.List < String > intentTags; 
        private java.util.List < String > numbers; 
        private Long ownerId; 
        private Long page; 
        private Long pageSize; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(TaskCallListRequest request) {
            super(request);
            this.batchId = request.batchId;
            this.callDate = request.callDate;
            this.endCallDate = request.endCallDate;
            this.intentTags = request.intentTags;
            this.numbers = request.numbers;
            this.ownerId = request.ownerId;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.taskId = request.taskId;
        } 

        /**
         * 导入号码时返回的批次号
         */
        public Builder batchId(String batchId) {
            this.putQueryParameter("BatchId", batchId);
            this.batchId = batchId;
            return this;
        }

        /**
         * 开始外呼时间
         */
        public Builder callDate(String callDate) {
            this.putQueryParameter("CallDate", callDate);
            this.callDate = callDate;
            return this;
        }

        /**
         * 结束外呼时间
         */
        public Builder endCallDate(String endCallDate) {
            this.putQueryParameter("EndCallDate", endCallDate);
            this.endCallDate = endCallDate;
            return this;
        }

        /**
         * 意向标签
         */
        public Builder intentTags(java.util.List < String > intentTags) {
            String intentTagsShrink = shrink(intentTags, "IntentTags", "json");
            this.putQueryParameter("IntentTags", intentTagsShrink);
            this.intentTags = intentTags;
            return this;
        }

        /**
         * 号码列表
         */
        public Builder numbers(java.util.List < String > numbers) {
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
         * 页数
         */
        public Builder page(Long page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * 每页外呼记录数,正整数，默认10000
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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
         * 任务ID
         */
        public Builder taskId(Long taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public TaskCallListRequest build() {
            return new TaskCallListRequest(this);
        } 

    } 

}
