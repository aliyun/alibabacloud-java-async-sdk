// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRobotTaskCallListRequest} extends {@link RequestModel}
 *
 * <p>QueryRobotTaskCallListRequest</p>
 */
public class QueryRobotTaskCallListRequest extends Request {
    @Query
    @NameInMap("CallResult")
    private String callResult;

    @Query
    @NameInMap("Called")
    private String called;

    @Query
    @NameInMap("DialogCountFrom")
    private String dialogCountFrom;

    @Query
    @NameInMap("DialogCountTo")
    private String dialogCountTo;

    @Query
    @NameInMap("DurationFrom")
    private String durationFrom;

    @Query
    @NameInMap("DurationTo")
    private String durationTo;

    @Query
    @NameInMap("HangupDirection")
    private String hangupDirection;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageNo")
    private Integer pageNo;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("TaskId")
    @Validation(required = true)
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
         * The call result. Valid values:
         * <p>
         * 
         * *   **200002**: The line is busy.
         * *   **200005**: The called party cannot be connected.
         * *   **200010**: The phone of the called party is powered off.
         * *   **200011**: The called party is out of service.
         * *   **200012**: The call is lost.
         */
        public Builder callResult(String callResult) {
            this.putQueryParameter("CallResult", callResult);
            this.callResult = callResult;
            return this;
        }

        /**
         * The called number.
         */
        public Builder called(String called) {
            this.putQueryParameter("Called", called);
            this.called = called;
            return this;
        }

        /**
         * The minimum number of conversation rounds in the call.
         */
        public Builder dialogCountFrom(String dialogCountFrom) {
            this.putQueryParameter("DialogCountFrom", dialogCountFrom);
            this.dialogCountFrom = dialogCountFrom;
            return this;
        }

        /**
         * The maximum number of conversation rounds in the call.
         */
        public Builder dialogCountTo(String dialogCountTo) {
            this.putQueryParameter("DialogCountTo", dialogCountTo);
            this.dialogCountTo = dialogCountTo;
            return this;
        }

        /**
         * The minimum call duration.
         */
        public Builder durationFrom(String durationFrom) {
            this.putQueryParameter("DurationFrom", durationFrom);
            this.durationFrom = durationFrom;
            return this;
        }

        /**
         * The maximum call duration.
         */
        public Builder durationTo(String durationTo) {
            this.putQueryParameter("DurationTo", durationTo);
            this.durationTo = durationTo;
            return this;
        }

        /**
         * The party who hangs up. Valid values:
         * <p>
         * 
         * *   **0**: the called party.
         * *   **1**: the robot.
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
         * The page number.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * The number of entries per page.
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
         * The unique ID of the robocall task. You can call the [CreateRobotTask](~~393531~~) operation to obtain the task ID.
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
