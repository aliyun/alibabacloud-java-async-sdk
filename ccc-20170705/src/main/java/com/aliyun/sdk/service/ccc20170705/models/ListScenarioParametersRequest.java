// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListScenarioParametersRequest} extends {@link RequestModel}
 *
 * <p>ListScenarioParametersRequest</p>
 */
public class ListScenarioParametersRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ScenarioId")
    @Validation(required = true)
    private String scenarioId;

    @Query
    @NameInMap("Type")
    private String type;

    private ListScenarioParametersRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.scenarioId = builder.scenarioId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListScenarioParametersRequest create() {
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListScenarioParametersRequest, Builder> {
        private String instanceId; 
        private String scenarioId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListScenarioParametersRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.scenarioId = response.scenarioId;
            this.type = response.type;
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
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListScenarioParametersRequest build() {
            return new ListScenarioParametersRequest(this);
        } 

    } 

}
