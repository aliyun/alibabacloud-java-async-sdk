// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchRobotSmartCallRequest} extends {@link RequestModel}
 *
 * <p>BatchRobotSmartCallRequest</p>
 */
public class BatchRobotSmartCallRequest extends Request {
    @Query
    @NameInMap("CalledNumber")
    @Validation(required = true)
    private String calledNumber;

    @Query
    @NameInMap("CalledShowNumber")
    @Validation(required = true)
    private String calledShowNumber;

    @Query
    @NameInMap("CorpName")
    private String corpName;

    @Query
    @NameInMap("DialogId")
    @Validation(required = true)
    private String dialogId;

    @Query
    @NameInMap("EarlyMediaAsr")
    private Boolean earlyMediaAsr;

    @Query
    @NameInMap("IsSelfLine")
    private Boolean isSelfLine;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("ScheduleCall")
    private Boolean scheduleCall;

    @Query
    @NameInMap("ScheduleTime")
    private Long scheduleTime;

    @Query
    @NameInMap("TaskName")
    @Validation(required = true)
    private String taskName;

    @Query
    @NameInMap("TtsParam")
    private String ttsParam;

    @Query
    @NameInMap("TtsParamHead")
    private String ttsParamHead;

    private BatchRobotSmartCallRequest(Builder builder) {
        super(builder);
        this.calledNumber = builder.calledNumber;
        this.calledShowNumber = builder.calledShowNumber;
        this.corpName = builder.corpName;
        this.dialogId = builder.dialogId;
        this.earlyMediaAsr = builder.earlyMediaAsr;
        this.isSelfLine = builder.isSelfLine;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scheduleCall = builder.scheduleCall;
        this.scheduleTime = builder.scheduleTime;
        this.taskName = builder.taskName;
        this.ttsParam = builder.ttsParam;
        this.ttsParamHead = builder.ttsParamHead;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchRobotSmartCallRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return calledNumber
     */
    public String getCalledNumber() {
        return this.calledNumber;
    }

    /**
     * @return calledShowNumber
     */
    public String getCalledShowNumber() {
        return this.calledShowNumber;
    }

    /**
     * @return corpName
     */
    public String getCorpName() {
        return this.corpName;
    }

    /**
     * @return dialogId
     */
    public String getDialogId() {
        return this.dialogId;
    }

    /**
     * @return earlyMediaAsr
     */
    public Boolean getEarlyMediaAsr() {
        return this.earlyMediaAsr;
    }

    /**
     * @return isSelfLine
     */
    public Boolean getIsSelfLine() {
        return this.isSelfLine;
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
     * @return scheduleCall
     */
    public Boolean getScheduleCall() {
        return this.scheduleCall;
    }

    /**
     * @return scheduleTime
     */
    public Long getScheduleTime() {
        return this.scheduleTime;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return ttsParam
     */
    public String getTtsParam() {
        return this.ttsParam;
    }

    /**
     * @return ttsParamHead
     */
    public String getTtsParamHead() {
        return this.ttsParamHead;
    }

    public static final class Builder extends Request.Builder<BatchRobotSmartCallRequest, Builder> {
        private String calledNumber; 
        private String calledShowNumber; 
        private String corpName; 
        private String dialogId; 
        private Boolean earlyMediaAsr; 
        private Boolean isSelfLine; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Boolean scheduleCall; 
        private Long scheduleTime; 
        private String taskName; 
        private String ttsParam; 
        private String ttsParamHead; 

        private Builder() {
            super();
        } 

        private Builder(BatchRobotSmartCallRequest response) {
            super(response);
            this.calledNumber = response.calledNumber;
            this.calledShowNumber = response.calledShowNumber;
            this.corpName = response.corpName;
            this.dialogId = response.dialogId;
            this.earlyMediaAsr = response.earlyMediaAsr;
            this.isSelfLine = response.isSelfLine;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.scheduleCall = response.scheduleCall;
            this.scheduleTime = response.scheduleTime;
            this.taskName = response.taskName;
            this.ttsParam = response.ttsParam;
            this.ttsParamHead = response.ttsParamHead;
        } 

        /**
         * CalledNumber.
         */
        public Builder calledNumber(String calledNumber) {
            this.putQueryParameter("CalledNumber", calledNumber);
            this.calledNumber = calledNumber;
            return this;
        }

        /**
         * CalledShowNumber.
         */
        public Builder calledShowNumber(String calledShowNumber) {
            this.putQueryParameter("CalledShowNumber", calledShowNumber);
            this.calledShowNumber = calledShowNumber;
            return this;
        }

        /**
         * CorpName.
         */
        public Builder corpName(String corpName) {
            this.putQueryParameter("CorpName", corpName);
            this.corpName = corpName;
            return this;
        }

        /**
         * DialogId.
         */
        public Builder dialogId(String dialogId) {
            this.putQueryParameter("DialogId", dialogId);
            this.dialogId = dialogId;
            return this;
        }

        /**
         * EarlyMediaAsr.
         */
        public Builder earlyMediaAsr(Boolean earlyMediaAsr) {
            this.putQueryParameter("EarlyMediaAsr", earlyMediaAsr);
            this.earlyMediaAsr = earlyMediaAsr;
            return this;
        }

        /**
         * IsSelfLine.
         */
        public Builder isSelfLine(Boolean isSelfLine) {
            this.putQueryParameter("IsSelfLine", isSelfLine);
            this.isSelfLine = isSelfLine;
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
         * ScheduleCall.
         */
        public Builder scheduleCall(Boolean scheduleCall) {
            this.putQueryParameter("ScheduleCall", scheduleCall);
            this.scheduleCall = scheduleCall;
            return this;
        }

        /**
         * ScheduleTime.
         */
        public Builder scheduleTime(Long scheduleTime) {
            this.putQueryParameter("ScheduleTime", scheduleTime);
            this.scheduleTime = scheduleTime;
            return this;
        }

        /**
         * TaskName.
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * TtsParam.
         */
        public Builder ttsParam(String ttsParam) {
            this.putQueryParameter("TtsParam", ttsParam);
            this.ttsParam = ttsParam;
            return this;
        }

        /**
         * TtsParamHead.
         */
        public Builder ttsParamHead(String ttsParamHead) {
            this.putQueryParameter("TtsParamHead", ttsParamHead);
            this.ttsParamHead = ttsParamHead;
            return this;
        }

        @Override
        public BatchRobotSmartCallRequest build() {
            return new BatchRobotSmartCallRequest(this);
        } 

    } 

}
