// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryRobotTaskCallListRequest} extends {@link RequestModel}
 *
 * <p>QueryRobotTaskCallListRequest</p>
 */
public class QueryRobotTaskCallListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallResult")
    private String callResult;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Called")
    private String called;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DialogCountFrom")
    private String dialogCountFrom;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DialogCountTo")
    private String dialogCountTo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DurationFrom")
    private String durationFrom;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DurationTo")
    private String durationTo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HangupDirection")
    private String hangupDirection;

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
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    private QueryRobotTaskCallListRequest(Builder builder) {
        super(builder);
        this.callResult = builder.callResult;
        this.called = builder.called;
        this.dialogCountFrom = builder.dialogCountFrom;
        this.dialogCountTo = builder.dialogCountTo;
        this.durationFrom = builder.durationFrom;
        this.durationTo = builder.durationTo;
        this.hangupDirection = builder.hangupDirection;
        this.ownerId = builder.ownerId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRobotTaskCallListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callResult
     */
    public String getCallResult() {
        return this.callResult;
    }

    /**
     * @return called
     */
    public String getCalled() {
        return this.called;
    }

    /**
     * @return dialogCountFrom
     */
    public String getDialogCountFrom() {
        return this.dialogCountFrom;
    }

    /**
     * @return dialogCountTo
     */
    public String getDialogCountTo() {
        return this.dialogCountTo;
    }

    /**
     * @return durationFrom
     */
    public String getDurationFrom() {
        return this.durationFrom;
    }

    /**
     * @return durationTo
     */
    public String getDurationTo() {
        return this.durationTo;
    }

    /**
     * @return hangupDirection
     */
    public String getHangupDirection() {
        return this.hangupDirection;
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
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<QueryRobotTaskCallListRequest, Builder> {
        private String callResult; 
        private String called; 
        private String dialogCountFrom; 
        private String dialogCountTo; 
        private String durationFrom; 
        private String durationTo; 
        private String hangupDirection; 
        private Long ownerId; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(QueryRobotTaskCallListRequest request) {
            super(request);
            this.callResult = request.callResult;
            this.called = request.called;
            this.dialogCountFrom = request.dialogCountFrom;
            this.dialogCountTo = request.dialogCountTo;
            this.durationFrom = request.durationFrom;
            this.durationTo = request.durationTo;
            this.hangupDirection = request.hangupDirection;
            this.ownerId = request.ownerId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.taskId = request.taskId;
        } 

        /**
         * <p>The call result. Valid values:</p>
         * <ul>
         * <li><strong>200002</strong>: The line is busy.</li>
         * <li><strong>200005</strong>: The called party cannot be connected.</li>
         * <li><strong>200010</strong>: The phone of the called party is powered off.</li>
         * <li><strong>200011</strong>: The called party is out of service.</li>
         * <li><strong>200012</strong>: The call is lost.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200002</p>
         */
        public Builder callResult(String callResult) {
            this.putQueryParameter("CallResult", callResult);
            this.callResult = callResult;
            return this;
        }

        /**
         * <p>The called number.</p>
         * 
         * <strong>example:</strong>
         * <p>1300****0000</p>
         */
        public Builder called(String called) {
            this.putQueryParameter("Called", called);
            this.called = called;
            return this;
        }

        /**
         * <p>The minimum number of conversation rounds in the call.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder dialogCountFrom(String dialogCountFrom) {
            this.putQueryParameter("DialogCountFrom", dialogCountFrom);
            this.dialogCountFrom = dialogCountFrom;
            return this;
        }

        /**
         * <p>The maximum number of conversation rounds in the call.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder dialogCountTo(String dialogCountTo) {
            this.putQueryParameter("DialogCountTo", dialogCountTo);
            this.dialogCountTo = dialogCountTo;
            return this;
        }

        /**
         * <p>The minimum call duration.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder durationFrom(String durationFrom) {
            this.putQueryParameter("DurationFrom", durationFrom);
            this.durationFrom = durationFrom;
            return this;
        }

        /**
         * <p>The maximum call duration.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder durationTo(String durationTo) {
            this.putQueryParameter("DurationTo", durationTo);
            this.durationTo = durationTo;
            return this;
        }

        /**
         * <p>The party who hangs up. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: the called party.</li>
         * <li><strong>1</strong>: the robot.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder hangupDirection(String hangupDirection) {
            this.putQueryParameter("HangupDirection", hangupDirection);
            this.hangupDirection = hangupDirection;
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
         * <p>The unique ID of the robocall task. You can call the <a href="https://help.aliyun.com/document_detail/393531.html">CreateRobotTask</a> operation to obtain the task ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1045001****</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public QueryRobotTaskCallListRequest build() {
            return new QueryRobotTaskCallListRequest(this);
        } 

    } 

}
