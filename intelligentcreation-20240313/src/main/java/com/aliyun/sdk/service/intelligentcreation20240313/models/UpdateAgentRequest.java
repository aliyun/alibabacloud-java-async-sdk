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
 * {@link UpdateAgentRequest} extends {@link RequestModel}
 *
 * <p>UpdateAgentRequest</p>
 */
public class UpdateAgentRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("agentIconUrl")
    private String agentIconUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("agentId")
    private String agentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("agentName")
    private String agentName;

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

    private UpdateAgentRequest(Builder builder) {
        super(builder);
        this.agentIconUrl = builder.agentIconUrl;
        this.agentId = builder.agentId;
        this.agentName = builder.agentName;
        this.characterAgeStage = builder.characterAgeStage;
        this.characterGender = builder.characterGender;
        this.characterName = builder.characterName;
        this.extraDescription = builder.extraDescription;
        this.industry = builder.industry;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAgentRequest create() {
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
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return agentName
     */
    public String getAgentName() {
        return this.agentName;
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

    public static final class Builder extends Request.Builder<UpdateAgentRequest, Builder> {
        private String agentIconUrl; 
        private String agentId; 
        private String agentName; 
        private String characterAgeStage; 
        private String characterGender; 
        private String characterName; 
        private String extraDescription; 
        private String industry; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAgentRequest request) {
            super(request);
            this.agentIconUrl = request.agentIconUrl;
            this.agentId = request.agentId;
            this.agentName = request.agentName;
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
         * agentId.
         */
        public Builder agentId(String agentId) {
            this.putBodyParameter("agentId", agentId);
            this.agentId = agentId;
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
        public UpdateAgentRequest build() {
            return new UpdateAgentRequest(this);
        } 

    } 

}
