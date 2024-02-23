// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRobotTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateRobotTaskRequest</p>
 */
public class CreateRobotTaskRequest extends Request {
    @Query
    @NameInMap("Caller")
    @Validation(required = true)
    private String caller;

    @Query
    @NameInMap("CorpName")
    private String corpName;

    @Query
    @NameInMap("DialogId")
    @Validation(required = true)
    private Long dialogId;

    @Query
    @NameInMap("IsSelfLine")
    private Boolean isSelfLine;

    @Query
    @NameInMap("NumberStatusIdent")
    @Validation(required = true)
    private Boolean numberStatusIdent;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RecallInterval")
    private Integer recallInterval;

    @Query
    @NameInMap("RecallStateCodes")
    private String recallStateCodes;

    @Query
    @NameInMap("RecallTimes")
    private Integer recallTimes;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RetryType")
    @Validation(required = true)
    private Integer retryType;

    @Query
    @NameInMap("TaskName")
    @Validation(required = true)
    private String taskName;

    private CreateRobotTaskRequest(Builder builder) {
        super(builder);
        this.caller = builder.caller;
        this.corpName = builder.corpName;
        this.dialogId = builder.dialogId;
        this.isSelfLine = builder.isSelfLine;
        this.numberStatusIdent = builder.numberStatusIdent;
        this.ownerId = builder.ownerId;
        this.recallInterval = builder.recallInterval;
        this.recallStateCodes = builder.recallStateCodes;
        this.recallTimes = builder.recallTimes;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.retryType = builder.retryType;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRobotTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return caller
     */
    public String getCaller() {
        return this.caller;
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
    public Long getDialogId() {
        return this.dialogId;
    }

    /**
     * @return isSelfLine
     */
    public Boolean getIsSelfLine() {
        return this.isSelfLine;
    }

    /**
     * @return numberStatusIdent
     */
    public Boolean getNumberStatusIdent() {
        return this.numberStatusIdent;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return recallInterval
     */
    public Integer getRecallInterval() {
        return this.recallInterval;
    }

    /**
     * @return recallStateCodes
     */
    public String getRecallStateCodes() {
        return this.recallStateCodes;
    }

    /**
     * @return recallTimes
     */
    public Integer getRecallTimes() {
        return this.recallTimes;
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
     * @return retryType
     */
    public Integer getRetryType() {
        return this.retryType;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder extends Request.Builder<CreateRobotTaskRequest, Builder> {
        private String caller; 
        private String corpName; 
        private Long dialogId; 
        private Boolean isSelfLine; 
        private Boolean numberStatusIdent; 
        private Long ownerId; 
        private Integer recallInterval; 
        private String recallStateCodes; 
        private Integer recallTimes; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer retryType; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(CreateRobotTaskRequest request) {
            super(request);
            this.caller = request.caller;
            this.corpName = request.corpName;
            this.dialogId = request.dialogId;
            this.isSelfLine = request.isSelfLine;
            this.numberStatusIdent = request.numberStatusIdent;
            this.ownerId = request.ownerId;
            this.recallInterval = request.recallInterval;
            this.recallStateCodes = request.recallStateCodes;
            this.recallTimes = request.recallTimes;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.retryType = request.retryType;
            this.taskName = request.taskName;
        } 

        /**
         * The calling number.
         * <p>
         * 
         * You must use the phone numbers that you have purchased and separate multiple numbers with commas (,). You can log on to the [Voice Messaging Service console](https://dyvms.console.aliyun.com/overview/home) and choose **Real Number Service** > **Real Number Management** to view the numbers you purchased.
         */
        public Builder caller(String caller) {
            this.putQueryParameter("Caller", caller);
            this.caller = caller;
            return this;
        }

        /**
         * The company name, which must be the same as the **enterprise name** on the qualification management page.
         */
        public Builder corpName(String corpName) {
            this.putQueryParameter("CorpName", corpName);
            this.corpName = corpName;
            return this;
        }

        /**
         * The ID of the robot or communication script that is used to initiate the call.
         * <p>
         * 
         * You can log on to the [Voice Messaging Service console](https://dyvms.console.aliyun.com/overview/home) and choose **Intelligent Voice Robot** > **Communication Script Management** to view the communication script ID.
         */
        public Builder dialogId(Long dialogId) {
            this.putQueryParameter("DialogId", dialogId);
            this.dialogId = dialogId;
            return this;
        }

        /**
         * Specifies whether to call the self-managed line. Valid values:
         * <p>
         * 
         * *   **false** (default)
         * *   **true**
         * 
         * > If you set this parameter to **true**, calling numbers are not verified.
         */
        public Builder isSelfLine(Boolean isSelfLine) {
            this.putQueryParameter("IsSelfLine", isSelfLine);
            this.isSelfLine = isSelfLine;
            return this;
        }

        /**
         * Specifies whether to enable number status identification. Valid values:
         * <p>
         * 
         * *   **false** (default)
         * *   **true**
         * 
         * > If you set this parameter to **true**, the reason why a call is not answered is recorded.
         */
        public Builder numberStatusIdent(Boolean numberStatusIdent) {
            this.putQueryParameter("NumberStatusIdent", numberStatusIdent);
            this.numberStatusIdent = numberStatusIdent;
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
         * The redial interval. Unit: minutes. The value must be greater than 1.
         * <p>
         * 
         * > The maximum redial interval is 30 minutes.
         */
        public Builder recallInterval(Integer recallInterval) {
            this.putQueryParameter("RecallInterval", recallInterval);
            this.recallInterval = recallInterval;
            return this;
        }

        /**
         * The call state in which redial is required. Separate multiple call states with commas (,). Valid values:
         * <p>
         * 
         * *   **200010**: The phone of the called party is powered off.
         * *   **200011**: The number of the called party is out of service.
         * *   **200002**: The line is busy.
         * *   **200012**: The call is lost.
         * *   **200005**: The called party cannot be connected.
         * *   **200003**: The called party does not respond to the call.
         */
        public Builder recallStateCodes(String recallStateCodes) {
            this.putQueryParameter("RecallStateCodes", recallStateCodes);
            this.recallStateCodes = recallStateCodes;
            return this;
        }

        /**
         * The number of redial times.
         */
        public Builder recallTimes(Integer recallTimes) {
            this.putQueryParameter("RecallTimes", recallTimes);
            this.recallTimes = recallTimes;
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
         * Specifies whether to enable auto-redial. Valid values:
         * <p>
         * 
         * *   **1**: enables auto-redial.
         * *   **0**: disables auto-redial.
         */
        public Builder retryType(Integer retryType) {
            this.putQueryParameter("RetryType", retryType);
            this.retryType = retryType;
            return this;
        }

        /**
         * The task name. The task name can be up to 30 characters in length.
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public CreateRobotTaskRequest build() {
            return new CreateRobotTaskRequest(this);
        } 

    } 

}
