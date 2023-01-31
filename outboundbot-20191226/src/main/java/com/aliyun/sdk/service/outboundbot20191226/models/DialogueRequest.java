// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DialogueRequest} extends {@link RequestModel}
 *
 * <p>DialogueRequest</p>
 */
public class DialogueRequest extends Request {
    @Query
    @NameInMap("ActionKey")
    private String actionKey;

    @Query
    @NameInMap("ActionParams")
    private String actionParams;

    @Query
    @NameInMap("CallId")
    @Validation(required = true)
    private String callId;

    @Query
    @NameInMap("CallType")
    @Validation(required = true)
    private String callType;

    @Query
    @NameInMap("CalledNumber")
    @Validation(required = true)
    private String calledNumber;

    @Query
    @NameInMap("CallingNumber")
    @Validation(required = true)
    private String callingNumber;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ScenarioId")
    private String scenarioId;

    @Query
    @NameInMap("ScriptId")
    private String scriptId;

    @Query
    @NameInMap("TaskId")
    private String taskId;

    @Query
    @NameInMap("Utterance")
    @Validation(required = true)
    private String utterance;

    private DialogueRequest(Builder builder) {
        super(builder);
        this.actionKey = builder.actionKey;
        this.actionParams = builder.actionParams;
        this.callId = builder.callId;
        this.callType = builder.callType;
        this.calledNumber = builder.calledNumber;
        this.callingNumber = builder.callingNumber;
        this.instanceId = builder.instanceId;
        this.scenarioId = builder.scenarioId;
        this.scriptId = builder.scriptId;
        this.taskId = builder.taskId;
        this.utterance = builder.utterance;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DialogueRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionKey
     */
    public String getActionKey() {
        return this.actionKey;
    }

    /**
     * @return actionParams
     */
    public String getActionParams() {
        return this.actionParams;
    }

    /**
     * @return callId
     */
    public String getCallId() {
        return this.callId;
    }

    /**
     * @return callType
     */
    public String getCallType() {
        return this.callType;
    }

    /**
     * @return calledNumber
     */
    public String getCalledNumber() {
        return this.calledNumber;
    }

    /**
     * @return callingNumber
     */
    public String getCallingNumber() {
        return this.callingNumber;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return scenarioId
     */
    public String getScenarioId() {
        return this.scenarioId;
    }

    /**
     * @return scriptId
     */
    public String getScriptId() {
        return this.scriptId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return utterance
     */
    public String getUtterance() {
        return this.utterance;
    }

    public static final class Builder extends Request.Builder<DialogueRequest, Builder> {
        private String actionKey; 
        private String actionParams; 
        private String callId; 
        private String callType; 
        private String calledNumber; 
        private String callingNumber; 
        private String instanceId; 
        private String scenarioId; 
        private String scriptId; 
        private String taskId; 
        private String utterance; 

        private Builder() {
            super();
        } 

        private Builder(DialogueRequest request) {
            super(request);
            this.actionKey = request.actionKey;
            this.actionParams = request.actionParams;
            this.callId = request.callId;
            this.callType = request.callType;
            this.calledNumber = request.calledNumber;
            this.callingNumber = request.callingNumber;
            this.instanceId = request.instanceId;
            this.scenarioId = request.scenarioId;
            this.scriptId = request.scriptId;
            this.taskId = request.taskId;
            this.utterance = request.utterance;
        } 

        /**
         * ActionKey.
         */
        public Builder actionKey(String actionKey) {
            this.putQueryParameter("ActionKey", actionKey);
            this.actionKey = actionKey;
            return this;
        }

        /**
         * ActionParams.
         */
        public Builder actionParams(String actionParams) {
            this.putQueryParameter("ActionParams", actionParams);
            this.actionParams = actionParams;
            return this;
        }

        /**
         * CallId.
         */
        public Builder callId(String callId) {
            this.putQueryParameter("CallId", callId);
            this.callId = callId;
            return this;
        }

        /**
         * CallType.
         */
        public Builder callType(String callType) {
            this.putQueryParameter("CallType", callType);
            this.callType = callType;
            return this;
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
         * CallingNumber.
         */
        public Builder callingNumber(String callingNumber) {
            this.putQueryParameter("CallingNumber", callingNumber);
            this.callingNumber = callingNumber;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ScenarioId.
         */
        public Builder scenarioId(String scenarioId) {
            this.putQueryParameter("ScenarioId", scenarioId);
            this.scenarioId = scenarioId;
            return this;
        }

        /**
         * ScriptId.
         */
        public Builder scriptId(String scriptId) {
            this.putQueryParameter("ScriptId", scriptId);
            this.scriptId = scriptId;
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

        /**
         * Utterance.
         */
        public Builder utterance(String utterance) {
            this.putQueryParameter("Utterance", utterance);
            this.utterance = utterance;
            return this;
        }

        @Override
        public DialogueRequest build() {
            return new DialogueRequest(this);
        } 

    } 

}
