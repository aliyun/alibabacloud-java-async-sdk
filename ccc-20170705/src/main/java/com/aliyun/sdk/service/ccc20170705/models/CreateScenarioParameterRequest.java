// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateScenarioParameterRequest} extends {@link RequestModel}
 *
 * <p>CreateScenarioParameterRequest</p>
 */
public class CreateScenarioParameterRequest extends Request {
    @Query
    @NameInMap("DefaultValue")
    private String defaultValue;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("ScenarioId")
    @Validation(required = true)
    private String scenarioId;

    @Query
    @NameInMap("Title")
    @Validation(required = true)
    private String title;

    private CreateScenarioParameterRequest(Builder builder) {
        super(builder);
        this.defaultValue = builder.defaultValue;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.scenarioId = builder.scenarioId;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateScenarioParameterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return defaultValue
     */
    public String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return scenarioId
     */
    public String getScenarioId() {
        return this.scenarioId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<CreateScenarioParameterRequest, Builder> {
        private String defaultValue; 
        private String description; 
        private String instanceId; 
        private String name; 
        private String scenarioId; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(CreateScenarioParameterRequest response) {
            super(response);
            this.defaultValue = response.defaultValue;
            this.description = response.description;
            this.instanceId = response.instanceId;
            this.name = response.name;
            this.scenarioId = response.scenarioId;
            this.title = response.title;
        } 

        /**
         * DefaultValue.
         */
        public Builder defaultValue(String defaultValue) {
            this.putQueryParameter("DefaultValue", defaultValue);
            this.defaultValue = defaultValue;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
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
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * Title.
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public CreateScenarioParameterRequest build() {
            return new CreateScenarioParameterRequest(this);
        } 

    } 

}
