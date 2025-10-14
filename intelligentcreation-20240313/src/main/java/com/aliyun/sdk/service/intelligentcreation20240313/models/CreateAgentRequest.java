// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link CreateAgentRequest} extends {@link RequestModel}
 *
 * <p>CreateAgentRequest</p>
 */
public class CreateAgentRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("agentIconUrl")
    private String agentIconUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("agentName")
    private String agentName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("agentScene")
    private String agentScene;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("characterAgeStage")
    private String characterAgeStage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("characterGender")
    private String characterGender;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("characterName")
    private String characterName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("extraDescription")
    private String extraDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("industry")
    private String industry;

    private CreateAgentRequest(Builder builder) {
        super(builder);
        this.agentIconUrl = builder.agentIconUrl;
        this.agentName = builder.agentName;
        this.agentScene = builder.agentScene;
        this.characterAgeStage = builder.characterAgeStage;
        this.characterGender = builder.characterGender;
        this.characterName = builder.characterName;
        this.extraDescription = builder.extraDescription;
        this.industry = builder.industry;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAgentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentIconUrl
     */
    public String getAgentIconUrl() {
        return this.agentIconUrl;
    }

    /**
     * @return agentName
     */
    public String getAgentName() {
        return this.agentName;
    }

    /**
     * @return agentScene
     */
    public String getAgentScene() {
        return this.agentScene;
    }

    /**
     * @return characterAgeStage
     */
    public String getCharacterAgeStage() {
        return this.characterAgeStage;
    }

    /**
     * @return characterGender
     */
    public String getCharacterGender() {
        return this.characterGender;
    }

    /**
     * @return characterName
     */
    public String getCharacterName() {
        return this.characterName;
    }

    /**
     * @return extraDescription
     */
    public String getExtraDescription() {
        return this.extraDescription;
    }

    /**
     * @return industry
     */
    public String getIndustry() {
        return this.industry;
    }

    public static final class Builder extends Request.Builder<CreateAgentRequest, Builder> {
        private String agentIconUrl; 
        private String agentName; 
        private String agentScene; 
        private String characterAgeStage; 
        private String characterGender; 
        private String characterName; 
        private String extraDescription; 
        private String industry; 

        private Builder() {
            super();
        } 

        private Builder(CreateAgentRequest request) {
            super(request);
            this.agentIconUrl = request.agentIconUrl;
            this.agentName = request.agentName;
            this.agentScene = request.agentScene;
            this.characterAgeStage = request.characterAgeStage;
            this.characterGender = request.characterGender;
            this.characterName = request.characterName;
            this.extraDescription = request.extraDescription;
            this.industry = request.industry;
        } 

        /**
         * agentIconUrl.
         */
        public Builder agentIconUrl(String agentIconUrl) {
            this.putBodyParameter("agentIconUrl", agentIconUrl);
            this.agentIconUrl = agentIconUrl;
            return this;
        }

        /**
         * agentName.
         */
        public Builder agentName(String agentName) {
            this.putBodyParameter("agentName", agentName);
            this.agentName = agentName;
            return this;
        }

        /**
         * agentScene.
         */
        public Builder agentScene(String agentScene) {
            this.putBodyParameter("agentScene", agentScene);
            this.agentScene = agentScene;
            return this;
        }

        /**
         * characterAgeStage.
         */
        public Builder characterAgeStage(String characterAgeStage) {
            this.putBodyParameter("characterAgeStage", characterAgeStage);
            this.characterAgeStage = characterAgeStage;
            return this;
        }

        /**
         * characterGender.
         */
        public Builder characterGender(String characterGender) {
            this.putBodyParameter("characterGender", characterGender);
            this.characterGender = characterGender;
            return this;
        }

        /**
         * characterName.
         */
        public Builder characterName(String characterName) {
            this.putBodyParameter("characterName", characterName);
            this.characterName = characterName;
            return this;
        }

        /**
         * extraDescription.
         */
        public Builder extraDescription(String extraDescription) {
            this.putBodyParameter("extraDescription", extraDescription);
            this.extraDescription = extraDescription;
            return this;
        }

        /**
         * industry.
         */
        public Builder industry(String industry) {
            this.putBodyParameter("industry", industry);
            this.industry = industry;
            return this;
        }

        @Override
        public CreateAgentRequest build() {
            return new CreateAgentRequest(this);
        } 

    } 

}
