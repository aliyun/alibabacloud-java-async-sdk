// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutConfigRuleRequest} extends {@link RequestModel}
 *
 * <p>PutConfigRuleRequest</p>
 */
public class PutConfigRuleRequest extends Request {
    @Body
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("ConfigRuleId")
    private String configRuleId;

    @Body
    @NameInMap("ConfigRuleName")
    @Validation(required = true)
    private String configRuleName;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("InputParameters")
    private String inputParameters;

    @Query
    @NameInMap("MemberId")
    private Long memberId;

    @Query
    @NameInMap("MultiAccount")
    private Boolean multiAccount;

    @Body
    @NameInMap("RiskLevel")
    @Validation(required = true)
    private Integer riskLevel;

    @Body
    @NameInMap("ScopeComplianceResourceId")
    private String scopeComplianceResourceId;

    @Body
    @NameInMap("ScopeComplianceResourceTypes")
    @Validation(required = true)
    private String scopeComplianceResourceTypes;

    @Body
    @NameInMap("SourceDetailMessageType")
    @Validation(required = true)
    private String sourceDetailMessageType;

    @Body
    @NameInMap("SourceIdentifier")
    @Validation(required = true)
    private String sourceIdentifier;

    @Body
    @NameInMap("SourceMaximumExecutionFrequency")
    private String sourceMaximumExecutionFrequency;

    @Body
    @NameInMap("SourceOwner")
    @Validation(required = true)
    private String sourceOwner;

    private PutConfigRuleRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.configRuleId = builder.configRuleId;
        this.configRuleName = builder.configRuleName;
        this.description = builder.description;
        this.inputParameters = builder.inputParameters;
        this.memberId = builder.memberId;
        this.multiAccount = builder.multiAccount;
        this.riskLevel = builder.riskLevel;
        this.scopeComplianceResourceId = builder.scopeComplianceResourceId;
        this.scopeComplianceResourceTypes = builder.scopeComplianceResourceTypes;
        this.sourceDetailMessageType = builder.sourceDetailMessageType;
        this.sourceIdentifier = builder.sourceIdentifier;
        this.sourceMaximumExecutionFrequency = builder.sourceMaximumExecutionFrequency;
        this.sourceOwner = builder.sourceOwner;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutConfigRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return configRuleId
     */
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    /**
     * @return configRuleName
     */
    public String getConfigRuleName() {
        return this.configRuleName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return inputParameters
     */
    public String getInputParameters() {
        return this.inputParameters;
    }

    /**
     * @return memberId
     */
    public Long getMemberId() {
        return this.memberId;
    }

    /**
     * @return multiAccount
     */
    public Boolean getMultiAccount() {
        return this.multiAccount;
    }

    /**
     * @return riskLevel
     */
    public Integer getRiskLevel() {
        return this.riskLevel;
    }

    /**
     * @return scopeComplianceResourceId
     */
    public String getScopeComplianceResourceId() {
        return this.scopeComplianceResourceId;
    }

    /**
     * @return scopeComplianceResourceTypes
     */
    public String getScopeComplianceResourceTypes() {
        return this.scopeComplianceResourceTypes;
    }

    /**
     * @return sourceDetailMessageType
     */
    public String getSourceDetailMessageType() {
        return this.sourceDetailMessageType;
    }

    /**
     * @return sourceIdentifier
     */
    public String getSourceIdentifier() {
        return this.sourceIdentifier;
    }

    /**
     * @return sourceMaximumExecutionFrequency
     */
    public String getSourceMaximumExecutionFrequency() {
        return this.sourceMaximumExecutionFrequency;
    }

    /**
     * @return sourceOwner
     */
    public String getSourceOwner() {
        return this.sourceOwner;
    }

    public static final class Builder extends Request.Builder<PutConfigRuleRequest, Builder> {
        private String clientToken; 
        private String configRuleId; 
        private String configRuleName; 
        private String description; 
        private String inputParameters; 
        private Long memberId; 
        private Boolean multiAccount; 
        private Integer riskLevel; 
        private String scopeComplianceResourceId; 
        private String scopeComplianceResourceTypes; 
        private String sourceDetailMessageType; 
        private String sourceIdentifier; 
        private String sourceMaximumExecutionFrequency; 
        private String sourceOwner; 

        private Builder() {
            super();
        } 

        private Builder(PutConfigRuleRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.configRuleId = response.configRuleId;
            this.configRuleName = response.configRuleName;
            this.description = response.description;
            this.inputParameters = response.inputParameters;
            this.memberId = response.memberId;
            this.multiAccount = response.multiAccount;
            this.riskLevel = response.riskLevel;
            this.scopeComplianceResourceId = response.scopeComplianceResourceId;
            this.scopeComplianceResourceTypes = response.scopeComplianceResourceTypes;
            this.sourceDetailMessageType = response.sourceDetailMessageType;
            this.sourceIdentifier = response.sourceIdentifier;
            this.sourceMaximumExecutionFrequency = response.sourceMaximumExecutionFrequency;
            this.sourceOwner = response.sourceOwner;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * ConfigRuleId.
         */
        public Builder configRuleId(String configRuleId) {
            this.putBodyParameter("ConfigRuleId", configRuleId);
            this.configRuleId = configRuleId;
            return this;
        }

        /**
         * ConfigRuleName.
         */
        public Builder configRuleName(String configRuleName) {
            this.putBodyParameter("ConfigRuleName", configRuleName);
            this.configRuleName = configRuleName;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * InputParameters.
         */
        public Builder inputParameters(String inputParameters) {
            this.putBodyParameter("InputParameters", inputParameters);
            this.inputParameters = inputParameters;
            return this;
        }

        /**
         * MemberId.
         */
        public Builder memberId(Long memberId) {
            this.putQueryParameter("MemberId", memberId);
            this.memberId = memberId;
            return this;
        }

        /**
         * MultiAccount.
         */
        public Builder multiAccount(Boolean multiAccount) {
            this.putQueryParameter("MultiAccount", multiAccount);
            this.multiAccount = multiAccount;
            return this;
        }

        /**
         * RiskLevel.
         */
        public Builder riskLevel(Integer riskLevel) {
            this.putBodyParameter("RiskLevel", riskLevel);
            this.riskLevel = riskLevel;
            return this;
        }

        /**
         * ScopeComplianceResourceId.
         */
        public Builder scopeComplianceResourceId(String scopeComplianceResourceId) {
            this.putBodyParameter("ScopeComplianceResourceId", scopeComplianceResourceId);
            this.scopeComplianceResourceId = scopeComplianceResourceId;
            return this;
        }

        /**
         * ScopeComplianceResourceTypes.
         */
        public Builder scopeComplianceResourceTypes(String scopeComplianceResourceTypes) {
            this.putBodyParameter("ScopeComplianceResourceTypes", scopeComplianceResourceTypes);
            this.scopeComplianceResourceTypes = scopeComplianceResourceTypes;
            return this;
        }

        /**
         * SourceDetailMessageType.
         */
        public Builder sourceDetailMessageType(String sourceDetailMessageType) {
            this.putBodyParameter("SourceDetailMessageType", sourceDetailMessageType);
            this.sourceDetailMessageType = sourceDetailMessageType;
            return this;
        }

        /**
         * SourceIdentifier.
         */
        public Builder sourceIdentifier(String sourceIdentifier) {
            this.putBodyParameter("SourceIdentifier", sourceIdentifier);
            this.sourceIdentifier = sourceIdentifier;
            return this;
        }

        /**
         * SourceMaximumExecutionFrequency.
         */
        public Builder sourceMaximumExecutionFrequency(String sourceMaximumExecutionFrequency) {
            this.putBodyParameter("SourceMaximumExecutionFrequency", sourceMaximumExecutionFrequency);
            this.sourceMaximumExecutionFrequency = sourceMaximumExecutionFrequency;
            return this;
        }

        /**
         * SourceOwner.
         */
        public Builder sourceOwner(String sourceOwner) {
            this.putBodyParameter("SourceOwner", sourceOwner);
            this.sourceOwner = sourceOwner;
            return this;
        }

        @Override
        public PutConfigRuleRequest build() {
            return new PutConfigRuleRequest(this);
        } 

    } 

}
