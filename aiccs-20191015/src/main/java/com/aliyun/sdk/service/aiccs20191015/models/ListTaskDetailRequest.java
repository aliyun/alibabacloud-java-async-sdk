// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link ListTaskDetailRequest} extends {@link RequestModel}
 *
 * <p>ListTaskDetailRequest</p>
 */
public class ListTaskDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Called")
    private String called;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

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
    @com.aliyun.core.annotation.Validation()
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatusCode")
    @com.aliyun.core.annotation.Validation()
    private String statusCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long taskId;

    private ListTaskDetailRequest(Builder builder) {
        super(builder);
        this.called = builder.called;
        this.id = builder.id;
        this.ownerId = builder.ownerId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.status = builder.status;
        this.statusCode = builder.statusCode;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTaskDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return called
     */
    public String getCalled() {
        return this.called;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
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
     * @return statusCode
     */
    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<ListTaskDetailRequest, Builder> {
        private String called; 
        private Long id; 
        private Long ownerId; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String status; 
        private String statusCode; 
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(ListTaskDetailRequest request) {
            super(request);
            this.called = request.called;
            this.id = request.id;
            this.ownerId = request.ownerId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.status = request.status;
            this.statusCode = request.statusCode;
            this.taskId = request.taskId;
        } 

        /**
         * <p>The called number. You can view the called number on the <a href="https://aiccs.console.aliyun.com/job/list"><strong>Task Management</strong></a> &gt; <strong>Details</strong> page.</p>
         * 
         * <strong>example:</strong>
         * <p>186****0000</p>
         */
        public Builder called(String called) {
            this.putQueryParameter("Called", called);
            this.called = called;
            return this;
        }

        /**
         * <p>The detail ID. You can view the detail ID on the <a href="https://aiccs.console.aliyun.com/job/list"><strong>Task Management</strong></a> &gt; <strong>Details</strong> page.</p>
         * 
         * <strong>example:</strong>
         * <p>12****</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
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
         * <p>The current page number. The value must be greater than <strong>0</strong>. Default value: <strong>1</strong>.</p>
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
         * <p>The number of entries per page. The value must be greater than <strong>0</strong>. Default value: <strong>20</strong>.</p>
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
         * <p>The detail status. Valid values:</p>
         * <ul>
         * <li><strong>SUCCESS</strong>: The outbound call succeeded.</li>
         * <li><strong>FAIL</strong>: The outbound call failed.</li>
         * <li><strong>INIT</strong>: The outbound call has not been made.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The call status code. For more information, see <a href="https://help.aliyun.com/document_detail/112804.html">Call status codes</a> in Voice Messaging.</p>
         * 
         * <strong>example:</strong>
         * <p>200100</p>
         */
        public Builder statusCode(String statusCode) {
            this.putQueryParameter("StatusCode", statusCode);
            this.statusCode = statusCode;
            return this;
        }

        /**
         * <p>The task ID. You can view the task ID on the <a href="https://aiccs.console.aliyun.com/job/list">Task Management</a> page or obtain it by calling the <a href="https://help.aliyun.com/document_detail/2718008.html">ListTask</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12****</p>
         */
        public Builder taskId(Long taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public ListTaskDetailRequest build() {
            return new ListTaskDetailRequest(this);
        } 

    } 

}
