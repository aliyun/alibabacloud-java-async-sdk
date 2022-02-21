// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConfigRulesRequest} extends {@link RequestModel}
 *
 * <p>ListConfigRulesRequest</p>
 */
public class ListConfigRulesRequest extends Request {
    @Query
    @NameInMap("CompliancePackId")
    private String compliancePackId;

    @Query
    @NameInMap("ComplianceType")
    private String complianceType;

    @Query
    @NameInMap("ConfigRuleName")
    private String configRuleName;

    @Query
    @NameInMap("ConfigRuleState")
    private String configRuleState;

    @Query
    @NameInMap("MemberId")
    private Long memberId;

    @Query
    @NameInMap("MultiAccount")
    private Boolean multiAccount;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("RiskLevel")
    private Integer riskLevel;

    private ListConfigRulesRequest(Builder builder) {
        super(builder);
        this.compliancePackId = builder.compliancePackId;
        this.complianceType = builder.complianceType;
        this.configRuleName = builder.configRuleName;
        this.configRuleState = builder.configRuleState;
        this.memberId = builder.memberId;
        this.multiAccount = builder.multiAccount;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.riskLevel = builder.riskLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConfigRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return compliancePackId
     */
    public String getCompliancePackId() {
        return this.compliancePackId;
    }

    /**
     * @return complianceType
     */
    public String getComplianceType() {
        return this.complianceType;
    }

    /**
     * @return configRuleName
     */
    public String getConfigRuleName() {
        return this.configRuleName;
    }

    /**
     * @return configRuleState
     */
    public String getConfigRuleState() {
        return this.configRuleState;
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return riskLevel
     */
    public Integer getRiskLevel() {
        return this.riskLevel;
    }

    public static final class Builder extends Request.Builder<ListConfigRulesRequest, Builder> {
        private String compliancePackId; 
        private String complianceType; 
        private String configRuleName; 
        private String configRuleState; 
        private Long memberId; 
        private Boolean multiAccount; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Integer riskLevel; 

        private Builder() {
            super();
        } 

        private Builder(ListConfigRulesRequest response) {
            super(response);
            this.compliancePackId = response.compliancePackId;
            this.complianceType = response.complianceType;
            this.configRuleName = response.configRuleName;
            this.configRuleState = response.configRuleState;
            this.memberId = response.memberId;
            this.multiAccount = response.multiAccount;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.riskLevel = response.riskLevel;
        } 

        /**
         * CompliancePackId.
         */
        public Builder compliancePackId(String compliancePackId) {
            this.putQueryParameter("CompliancePackId", compliancePackId);
            this.compliancePackId = compliancePackId;
            return this;
        }

        /**
         * ComplianceType.
         */
        public Builder complianceType(String complianceType) {
            this.putQueryParameter("ComplianceType", complianceType);
            this.complianceType = complianceType;
            return this;
        }

        /**
         * ConfigRuleName.
         */
        public Builder configRuleName(String configRuleName) {
            this.putQueryParameter("ConfigRuleName", configRuleName);
            this.configRuleName = configRuleName;
            return this;
        }

        /**
         * ConfigRuleState.
         */
        public Builder configRuleState(String configRuleState) {
            this.putQueryParameter("ConfigRuleState", configRuleState);
            this.configRuleState = configRuleState;
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RiskLevel.
         */
        public Builder riskLevel(Integer riskLevel) {
            this.putQueryParameter("RiskLevel", riskLevel);
            this.riskLevel = riskLevel;
            return this;
        }

        @Override
        public ListConfigRulesRequest build() {
            return new ListConfigRulesRequest(this);
        } 

    } 

}
