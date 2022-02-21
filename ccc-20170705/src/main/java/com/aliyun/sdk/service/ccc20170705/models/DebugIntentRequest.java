// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DebugIntentRequest} extends {@link RequestModel}
 *
 * <p>DebugIntentRequest</p>
 */
public class DebugIntentRequest extends Request {
    @Query
    @NameInMap("CallId")
    @Validation(required = true)
    private String callId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("NewSession")
    private Boolean newSession;

    @Query
    @NameInMap("ScenarioId")
    private String scenarioId;

    @Query
    @NameInMap("SurveyId")
    @Validation(required = true)
    private String surveyId;

    @Query
    @NameInMap("Utterance")
    private String utterance;

    private DebugIntentRequest(Builder builder) {
        super(builder);
        this.callId = builder.callId;
        this.instanceId = builder.instanceId;
        this.newSession = builder.newSession;
        this.scenarioId = builder.scenarioId;
        this.surveyId = builder.surveyId;
        this.utterance = builder.utterance;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DebugIntentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callId
     */
    public String getCallId() {
        return this.callId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return newSession
     */
    public Boolean getNewSession() {
        return this.newSession;
    }

    /**
     * @return scenarioId
     */
    public String getScenarioId() {
        return this.scenarioId;
    }

    /**
     * @return surveyId
     */
    public String getSurveyId() {
        return this.surveyId;
    }

    /**
     * @return utterance
     */
    public String getUtterance() {
        return this.utterance;
    }

    public static final class Builder extends Request.Builder<DebugIntentRequest, Builder> {
        private String callId; 
        private String instanceId; 
        private Boolean newSession; 
        private String scenarioId; 
        private String surveyId; 
        private String utterance; 

        private Builder() {
            super();
        } 

        private Builder(DebugIntentRequest response) {
            super(response);
            this.callId = response.callId;
            this.instanceId = response.instanceId;
            this.newSession = response.newSession;
            this.scenarioId = response.scenarioId;
            this.surveyId = response.surveyId;
            this.utterance = response.utterance;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * NewSession.
         */
        public Builder newSession(Boolean newSession) {
            this.putQueryParameter("NewSession", newSession);
            this.newSession = newSession;
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
         * SurveyId.
         */
        public Builder surveyId(String surveyId) {
            this.putQueryParameter("SurveyId", surveyId);
            this.surveyId = surveyId;
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
        public DebugIntentRequest build() {
            return new DebugIntentRequest(this);
        } 

    } 

}
