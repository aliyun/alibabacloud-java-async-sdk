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

        private Builder(QueryRobotTaskCallListRequest response) {
            super(response);
            this.callResult = response.callResult;
            this.called = response.called;
            this.dialogCountFrom = response.dialogCountFrom;
            this.dialogCountTo = response.dialogCountTo;
            this.durationFrom = response.durationFrom;
            this.durationTo = response.durationTo;
            this.hangupDirection = response.hangupDirection;
            this.ownerId = response.ownerId;
            this.pageNo = response.pageNo;
            this.pageSize = response.pageSize;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.taskId = response.taskId;
        } 

        /**
         * CallResult.
         */
        public Builder callResult(String callResult) {
            this.putQueryParameter("CallResult", callResult);
            this.callResult = callResult;
            return this;
        }

        /**
         * Called.
         */
        public Builder called(String called) {
            this.putQueryParameter("Called", called);
            this.called = called;
            return this;
        }

        /**
         * DialogCountFrom.
         */
        public Builder dialogCountFrom(String dialogCountFrom) {
            this.putQueryParameter("DialogCountFrom", dialogCountFrom);
            this.dialogCountFrom = dialogCountFrom;
            return this;
        }

        /**
         * DialogCountTo.
         */
        public Builder dialogCountTo(String dialogCountTo) {
            this.putQueryParameter("DialogCountTo", dialogCountTo);
            this.dialogCountTo = dialogCountTo;
            return this;
        }

        /**
         * DurationFrom.
         */
        public Builder durationFrom(String durationFrom) {
            this.putQueryParameter("DurationFrom", durationFrom);
            this.durationFrom = durationFrom;
            return this;
        }

        /**
         * DurationTo.
         */
        public Builder durationTo(String durationTo) {
            this.putQueryParameter("DurationTo", durationTo);
            this.durationTo = durationTo;
            return this;
        }

        /**
         * HangupDirection.
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
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
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
         * TaskId.
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
