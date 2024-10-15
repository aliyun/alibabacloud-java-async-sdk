// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link BatchRobotSmartCallRequest} extends {@link RequestModel}
 *
 * <p>BatchRobotSmartCallRequest</p>
 */
public class BatchRobotSmartCallRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CalledNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String calledNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CalledShowNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String calledShowNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CorpName")
    private String corpName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DialogId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dialogId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EarlyMediaAsr")
    private Boolean earlyMediaAsr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsSelfLine")
    private Boolean isSelfLine;

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
    @com.aliyun.core.annotation.NameInMap("ScheduleCall")
    private Boolean scheduleCall;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduleTime")
    private Long scheduleTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TtsParam")
    private String ttsParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TtsParamHead")
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

        private Builder(BatchRobotSmartCallRequest request) {
            super(request);
            this.calledNumber = request.calledNumber;
            this.calledShowNumber = request.calledShowNumber;
            this.corpName = request.corpName;
            this.dialogId = request.dialogId;
            this.earlyMediaAsr = request.earlyMediaAsr;
            this.isSelfLine = request.isSelfLine;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.scheduleCall = request.scheduleCall;
            this.scheduleTime = request.scheduleTime;
            this.taskName = request.taskName;
            this.ttsParam = request.ttsParam;
            this.ttsParamHead = request.ttsParamHead;
        } 

        /**
         * <p>The called number. Only mobile phone numbers in the Chinese mainland are supported.</p>
         * <p>You can set up to 1,000 called numbers and separate the numbers with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1390000****</p>
         */
        public Builder calledNumber(String calledNumber) {
            this.putQueryParameter("CalledNumber", calledNumber);
            this.calledNumber = calledNumber;
            return this;
        }

        /**
         * <p>The number displayed to called parties, which must be a number you purchased. You can view the numbers you purchased in the <a href="https://dyvms.console.aliyun.com/dyvms.htm#/number/normal">Voice Messaging Service console</a>.</p>
         * <p>You can set up to 100 numbers and separate the numbers with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>222</p>
         */
        public Builder calledShowNumber(String calledShowNumber) {
            this.putQueryParameter("CalledShowNumber", calledShowNumber);
            this.calledShowNumber = calledShowNumber;
            return this;
        }

        /**
         * <p>The company name, which must be the same as the <strong>company name</strong> specified on the <a href="https://dyvms.console.aliyun.com/dyvms.htm#/corp/normal">qualification management page</a>.</p>
         * <blockquote>
         * <p>This parameter is optional if <strong>isSelfLine</strong> is set to <strong>true</strong>.</p>
         * </blockquote>
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
         * <p>The ID of the robot or communication script that is used to initiate a call.</p>
         * <p>You can obtain the <strong>communication script ID</strong> from the <a href="https://dyvms.console.aliyun.com/dyvms.htm#/smart-call/saas/robot/list">Communication script management</a> page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567</p>
         */
        public Builder dialogId(String dialogId) {
            this.putQueryParameter("DialogId", dialogId);
            this.dialogId = dialogId;
            return this;
        }

        /**
         * <p>The speech recognition identifier of early media. The default value is <strong>false</strong>, which means that the speech recognition identifier of early media is not enabled.</p>
         * <p>Set the parameter to <strong>true</strong> if you want to enable the speech recognition identifier of early media.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder earlyMediaAsr(Boolean earlyMediaAsr) {
            this.putQueryParameter("EarlyMediaAsr", earlyMediaAsr);
            this.earlyMediaAsr = earlyMediaAsr;
            return this;
        }

        /**
         * <p>Specifies whether to call the self-managed line. Default value: <strong>false</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
         * <p>Specifies whether the call is scheduled. If you set this parameter to <strong>true</strong>, the <strong>ScheduleTime</strong> parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder scheduleCall(Boolean scheduleCall) {
            this.putQueryParameter("ScheduleCall", scheduleCall);
            this.scheduleCall = scheduleCall;
            return this;
        }

        /**
         * <p>The preset call time. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * <blockquote>
         * <p> This parameter is required only when <strong>ScheduleCall</strong> is set to <strong>true</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder scheduleTime(Long scheduleTime) {
            this.putQueryParameter("ScheduleTime", scheduleTime);
            this.scheduleTime = scheduleTime;
            return this;
        }

        /**
         * <p>The task name. The task name can be up to 30 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Batch Tasks</p>
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * <p>The variable value of the TTS template, in the JSON format.</p>
         * <p>The variable value must correspond to a number. The TtsParam parameter must be used together with the TtsParamHead parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;number&quot;:&quot;1390000****&quot;,&quot;params&quot;:[“Miss li”,&quot;miss wang&quot;,&quot;Mr.li&quot;]}]</p>
         */
        public Builder ttsParam(String ttsParam) {
            this.putQueryParameter("TtsParam", ttsParam);
            this.ttsParam = ttsParam;
            return this;
        }

        /**
         * <p>The call tasks with variables, in the JSON format.</p>
         * <p>The parameter value is a list of variable names. The TtsParamHead parameter must be used together with the TtsParam parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;name1&quot;,&quot;name2&quot;,&quot;name3&quot;]</p>
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
