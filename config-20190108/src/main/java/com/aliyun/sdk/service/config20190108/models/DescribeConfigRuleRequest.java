// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeConfigRuleRequest} extends {@link RequestModel}
 *
 * <p>DescribeConfigRuleRequest</p>
 */
public class DescribeConfigRuleRequest extends Request {
    @Query
    @NameInMap("ConfigRuleId")
    @Validation(required = true)
    private String configRuleId;

    @Query
    @NameInMap("MemberId")
    private Long memberId;

    @Query
    @NameInMap("MultiAccount")
    private Boolean multiAccount;

    private DescribeConfigRuleRequest(Builder builder) {
        super(builder);
        this.configRuleId = builder.configRuleId;
        this.memberId = builder.memberId;
        this.multiAccount = builder.multiAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConfigRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configRuleId
     */
    public String getConfigRuleId() {
        return this.configRuleId;
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

    public static final class Builder extends Request.Builder<DescribeConfigRuleRequest, Builder> {
        private String configRuleId; 
        private Long memberId; 
        private Boolean multiAccount; 

        private Builder() {
            super();
        } 

        private Builder(DescribeConfigRuleRequest response) {
            super(response);
            this.configRuleId = response.configRuleId;
            this.memberId = response.memberId;
            this.multiAccount = response.multiAccount;
        } 

        /**
         * ConfigRuleId.
         */
        public Builder configRuleId(String configRuleId) {
            this.putQueryParameter("ConfigRuleId", configRuleId);
            this.configRuleId = configRuleId;
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

        @Override
        public DescribeConfigRuleRequest build() {
            return new DescribeConfigRuleRequest(this);
        } 

    } 

}
