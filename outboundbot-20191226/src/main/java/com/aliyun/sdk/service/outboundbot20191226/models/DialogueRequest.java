// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link DialogueRequest} extends {@link RequestModel}
 *
 * <p>DialogueRequest</p>
 */
public class DialogueRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionKey")
    private String actionKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionParams")
    private String actionParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String callId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String callType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CalledNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String calledNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallingNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String callingNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScenarioId")
    private String scenarioId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScriptId")
    private String scriptId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Utterance")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>Action to perform for outbound calls. Hangup ends the call.</p>
         * 
         * <strong>example:</strong>
         * <p>broadcast</p>
         */
        public Builder actionKey(String actionKey) {
            this.putQueryParameter("ActionKey", actionKey);
            this.actionKey = actionKey;
            return this;
        }

        /**
         * <p>Parameters required to perform the action. (Deprecated)</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder actionParams(String actionParams) {
            this.putQueryParameter("ActionParams", actionParams);
            this.actionParams = actionParams;
            return this;
        }

        /**
         * <p>Call ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1528189846043</p>
         */
        public Builder callId(String callId) {
            this.putQueryParameter("CallId", callId);
            this.callId = callId;
            return this;
        }

        /**
         * <p>Call type, typically Outbound</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Outbound</p>
         */
        public Builder callType(String callType) {
            this.putQueryParameter("CallType", callType);
            this.callType = callType;
            return this;
        }

        /**
         * <p>Called number</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>135****4353</p>
         */
        public Builder calledNumber(String calledNumber) {
            this.putQueryParameter("CalledNumber", calledNumber);
            this.calledNumber = calledNumber;
            return this;
        }

        /**
         * <p>Calling number</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1***6</p>
         */
        public Builder callingNumber(String callingNumber) {
            this.putQueryParameter("CallingNumber", callingNumber);
            this.callingNumber = callingNumber;
            return this;
        }

        /**
         * <p>Instance ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Scenario ID</p>
         * 
         * <strong>example:</strong>
         * <p>6cea9bed-63e6-439e-ae4c-b3333efff53d</p>
         */
        public Builder scenarioId(String scenarioId) {
            this.putQueryParameter("ScenarioId", scenarioId);
            this.scenarioId = scenarioId;
            return this;
        }

        /**
         * <p>Scenario ID</p>
         * 
         * <strong>example:</strong>
         * <p>c5c5d8c0-c0f1-48a7-be2b-dc46006d888a</p>
         */
        public Builder scriptId(String scriptId) {
            this.putQueryParameter("ScriptId", scriptId);
            this.scriptId = scriptId;
            return this;
        }

        /**
         * <p>Task ID</p>
         * 
         * <strong>example:</strong>
         * <p>ff44709e-39a6-43ba-959b-20fcabe3e496</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>User utterance</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>是的</p>
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
