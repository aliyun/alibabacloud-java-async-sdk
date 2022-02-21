// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteScenarioParameterRequest} extends {@link RequestModel}
 *
 * <p>DeleteScenarioParameterRequest</p>
 */
public class DeleteScenarioParameterRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ScenarioId")
    @Validation(required = true)
    private String scenarioId;

    @Query
    @NameInMap("ScenarioParameterId")
    @Validation(required = true)
    private String scenarioParameterId;

    private DeleteScenarioParameterRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.scenarioId = builder.scenarioId;
        this.scenarioParameterId = builder.scenarioParameterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteScenarioParameterRequest create() {
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
     * @return scenarioParameterId
     */
    public String getScenarioParameterId() {
        return this.scenarioParameterId;
    }

    public static final class Builder extends Request.Builder<DeleteScenarioParameterRequest, Builder> {
        private String instanceId; 
        private String scenarioId; 
        private String scenarioParameterId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteScenarioParameterRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.scenarioId = response.scenarioId;
            this.scenarioParameterId = response.scenarioParameterId;
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
         * ScenarioParameterId.
         */
        public Builder scenarioParameterId(String scenarioParameterId) {
            this.putQueryParameter("ScenarioParameterId", scenarioParameterId);
            this.scenarioParameterId = scenarioParameterId;
            return this;
        }

        @Override
        public DeleteScenarioParameterRequest build() {
            return new DeleteScenarioParameterRequest(this);
        } 

    } 

}
