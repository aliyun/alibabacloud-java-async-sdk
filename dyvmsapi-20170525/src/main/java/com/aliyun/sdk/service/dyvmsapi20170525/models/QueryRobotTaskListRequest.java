// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryRobotTaskListRequest} extends {@link RequestModel}
 *
 * <p>QueryRobotTaskListRequest</p>
 */
public class QueryRobotTaskListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Time")
    private String time;

    private QueryRobotTaskListRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.status = builder.status;
        this.taskName = builder.taskName;
        this.time = builder.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRobotTaskListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return time
     */
    public String getTime() {
        return this.time;
    }

    public static final class Builder extends Request.Builder<QueryRobotTaskListRequest, Builder> {
        private Long ownerId; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String status; 
        private String taskName; 
        private String time; 

        private Builder() {
            super();
        } 

        private Builder(QueryRobotTaskListRequest request) {
            super(request);
            this.ownerId = request.ownerId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.status = request.status;
            this.taskName = request.taskName;
            this.time = request.time;
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
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
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
         * <p>The task state. Valid values:</p>
         * <ul>
         * <li><strong>INIT</strong>: The task is not started.</li>
         * <li><strong>READY</strong>: The task is ready to start.</li>
         * <li><strong>DISPATCH</strong>: The task is being parsed.</li>
         * <li><strong>EXCUTING</strong>: The task is being executed.</li>
         * <li><strong>MANUAL_STOP</strong>: The task is manually suspended.</li>
         * <li><strong>SYSTEM_STOP</strong>: The task is suspended by the system.</li>
         * <li><strong>ARREARS_STOP</strong>: The task is suspended due to overdue payments.</li>
         * <li><strong>CANCEL</strong>: The task is manually canceled.</li>
         * <li><strong>SYSTEM_CANCEL</strong>: The task is canceled by the system.</li>
         * <li><strong>FINISH</strong>: The task is complete.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EXCUTING</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>Test Template</p>
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * <p>The date when the task is created, in the yyyy-MM-dd format.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-06-14</p>
         */
        public Builder time(String time) {
            this.putQueryParameter("Time", time);
            this.time = time;
            return this;
        }

        @Override
        public QueryRobotTaskListRequest build() {
            return new QueryRobotTaskListRequest(this);
        } 

    } 

}
