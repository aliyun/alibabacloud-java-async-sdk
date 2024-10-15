// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateRobotTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateRobotTaskRequest</p>
 */
public class CreateRobotTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Caller")
    @com.aliyun.core.annotation.Validation(required = true)
    private String caller;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CorpName")
    private String corpName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DialogId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long dialogId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsSelfLine")
    private Boolean isSelfLine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NumberStatusIdent")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean numberStatusIdent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecallInterval")
    private Integer recallInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecallStateCodes")
    private String recallStateCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecallTimes")
    private Integer recallTimes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetryType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer retryType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The calling number.</p>
         * <p>You must use the phone numbers that you have purchased and separate multiple numbers with commas (,). You can log on to the <a href="https://dyvms.console.aliyun.com/overview/home">Voice Messaging Service console</a> and choose <strong>Real Number Service</strong> &gt; <strong>Real Number Management</strong> to view the numbers you purchased.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0571****5678</p>
         */
        public Builder caller(String caller) {
            this.putQueryParameter("Caller", caller);
            this.caller = caller;
            return this;
        }

        /**
         * <p>The company name, which must be the same as the <strong>enterprise name</strong> on the qualification management page.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba</p>
         */
        public Builder corpName(String corpName) {
            this.putQueryParameter("CorpName", corpName);
            this.corpName = corpName;
            return this;
        }

        /**
         * <p>The ID of the robot or communication script that is used to initiate the call.</p>
         * <p>You can log on to the <a href="https://dyvms.console.aliyun.com/overview/home">Voice Messaging Service console</a> and choose <strong>Intelligent Voice Robot</strong> &gt; <strong>Communication Script Management</strong> to view the communication script ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000023****</p>
         */
        public Builder dialogId(Long dialogId) {
            this.putQueryParameter("DialogId", dialogId);
            this.dialogId = dialogId;
            return this;
        }

        /**
         * <p>Specifies whether to call the self-managed line. Valid values:</p>
         * <ul>
         * <li><strong>false</strong> (default)</li>
         * <li><strong>true</strong></li>
         * </ul>
         * <blockquote>
         * <p>If you set this parameter to <strong>true</strong>, calling numbers are not verified.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isSelfLine(Boolean isSelfLine) {
            this.putQueryParameter("IsSelfLine", isSelfLine);
            this.isSelfLine = isSelfLine;
            return this;
        }

        /**
         * <p>Specifies whether to enable number status identification. Valid values:</p>
         * <ul>
         * <li><strong>false</strong> (default)</li>
         * <li><strong>true</strong></li>
         * </ul>
         * <blockquote>
         * <p>If you set this parameter to <strong>true</strong>, the reason why a call is not answered is recorded.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
         * <p>The redial interval. Unit: minutes. The value must be greater than 1.</p>
         * <blockquote>
         * <p>The maximum redial interval is 30 minutes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder recallInterval(Integer recallInterval) {
            this.putQueryParameter("RecallInterval", recallInterval);
            this.recallInterval = recallInterval;
            return this;
        }

        /**
         * <p>The call state in which redial is required. Separate multiple call states with commas (,). Valid values:</p>
         * <ul>
         * <li><strong>200010</strong>: The phone of the called party is powered off.</li>
         * <li><strong>200011</strong>: The number of the called party is out of service.</li>
         * <li><strong>200002</strong>: The line is busy.</li>
         * <li><strong>200012</strong>: The call is lost.</li>
         * <li><strong>200005</strong>: The called party cannot be connected.</li>
         * <li><strong>200003</strong>: The called party does not respond to the call.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200010,200011</p>
         */
        public Builder recallStateCodes(String recallStateCodes) {
            this.putQueryParameter("RecallStateCodes", recallStateCodes);
            this.recallStateCodes = recallStateCodes;
            return this;
        }

        /**
         * <p>The number of redial times.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>Specifies whether to enable auto-redial. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: enables auto-redial.</li>
         * <li><strong>0</strong>: disables auto-redial.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder retryType(Integer retryType) {
            this.putQueryParameter("RetryType", retryType);
            this.retryType = retryType;
            return this;
        }

        /**
         * <p>The task name. The task name can be up to 30 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Test Template</p>
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
