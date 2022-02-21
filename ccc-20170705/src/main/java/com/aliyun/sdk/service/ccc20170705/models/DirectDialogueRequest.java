// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DirectDialogueRequest} extends {@link RequestModel}
 *
 * <p>DirectDialogueRequest</p>
 */
public class DirectDialogueRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ScenarioId")
    @Validation(required = true)
    private String scenarioId;

    @Query
    @NameInMap("SessionId")
    @Validation(required = true)
    private String sessionId;

    @Query
    @NameInMap("Utterance")
    @Validation(required = true)
    private String utterance;

    private DirectDialogueRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.scenarioId = builder.scenarioId;
        this.sessionId = builder.sessionId;
        this.utterance = builder.utterance;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DirectDialogueRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return utterance
     */
    public String getUtterance() {
        return this.utterance;
    }

    public static final class Builder extends Request.Builder<DirectDialogueRequest, Builder> {
        private String instanceId; 
        private String scenarioId; 
        private String sessionId; 
        private String utterance; 

        private Builder() {
            super();
        } 

        private Builder(DirectDialogueRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.scenarioId = response.scenarioId;
            this.sessionId = response.sessionId;
            this.utterance = response.utterance;
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
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
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
        public DirectDialogueRequest build() {
            return new DirectDialogueRequest(this);
        } 

    } 

}
